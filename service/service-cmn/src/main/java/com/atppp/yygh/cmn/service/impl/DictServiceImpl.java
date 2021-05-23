package com.atppp.yygh.cmn.service.impl;

import com.alibaba.excel.EasyExcel;
import com.atppp.yygh.cmn.listener.DictListener;
import com.atppp.yygh.cmn.mapper.DictMapper;
import com.atppp.yygh.cmn.service.DictService;
import com.atppp.yygh.model.cmn.Dict;
import com.atppp.yygh.vo.cmn.DictEeVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,Dict> implements DictService {

    //根据数据id查询子数据列表
    @Override
//    @Cacheable(value = "dict",keyGenerator ="keyGenerator ")
    public List<Dict> findChildData(Long id) {
        QueryWrapper<Dict> wrapper=new QueryWrapper<>();
        wrapper.eq("parent_id",id );
        List<Dict> dictList = baseMapper.selectList(wrapper);
        //向list集合每个dict对象中设置hasChildren
        for (Dict dict:dictList){
            Long dictId = dict.getId();
            boolean isChild = this.isChildren(dictId);  //调用类中私有方法 判断是有子节点 返回值 true false
            dict.setHasChildren(isChild);   //设置当前对象的 hasChildren属性
        }
        return dictList;
    }
    //导出数据功能
    @Override
    public void exportData(HttpServletResponse response) {
    //设置响应流信息
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName="dict";
        response.setHeader("Content-disposition", "attachment;filename="+ fileName + ".xlsx");

        //从数据库中取数据
        List<Dict> dictList = baseMapper.selectList(null);
        //我们需要的是dictEeVo的对象
        List<DictEeVo> dictVoList=new ArrayList<>(dictList.size());
        for (Dict dict:dictList){
            DictEeVo dictEeVo = new DictEeVo();
            BeanUtils.copyProperties(dict,dictEeVo );
            dictVoList.add(dictEeVo);
        }

        //使用EasyExcel做导出功能
        try {
            EasyExcel.write(response.getOutputStream(),DictEeVo.class).sheet("数据字典")
                    .doWrite(dictVoList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //导入数据字典(即上传)
    /**
     * 导入
     * allEntries = true: 方法调用后清空所有缓存
     * @param file
     */
    @CacheEvict(value = "dict", allEntries=true)
    @Override
    public void importDictData(MultipartFile file) {
        try {
            EasyExcel.read(file.getInputStream(),DictEeVo.class,new DictListener(baseMapper)).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //判断id下面是否有子节点
    private boolean isChildren(Long id){
        QueryWrapper<Dict> wrapper=new QueryWrapper<>();
        wrapper.eq("parent_id",id );
        Integer count = baseMapper.selectCount(wrapper);
        return count>0;
    }
}
