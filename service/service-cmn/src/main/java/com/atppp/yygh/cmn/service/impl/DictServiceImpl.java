package com.atppp.yygh.cmn.service.impl;

import com.atppp.yygh.cmn.mapper.DictMapper;
import com.atppp.yygh.cmn.service.DictService;
import com.atppp.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,Dict> implements DictService {

    //根据数据id查询子数据列表
    @Override
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

    //判断id下面是否有子节点
    private boolean isChildren(Long id){
        QueryWrapper<Dict> wrapper=new QueryWrapper<>();
        wrapper.eq("parent_id",id );
        Integer count = baseMapper.selectCount(wrapper);
        return count>0;
    }
}
