package com.atppp.yygh.cmn.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.atppp.yygh.cmn.mapper.DictMapper;
import com.atppp.yygh.model.cmn.Dict;
import com.atppp.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;

public class DictListener extends AnalysisEventListener<DictEeVo>{
    //需要用到dictMapper方法
    private DictMapper dictMapper;
    public DictListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }

    //一行一行读取
    @Override
    public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
        Dict dict = new Dict();
        //读取到dictEeVo对象 后转成dict用于传入数据库
        BeanUtils.copyProperties(dictEeVo,dict);
        //调用方法添加数据库
        dict.setIsDeleted(0);  //测试后发现 默认是1 手动赋值生成0 保证可用
        dictMapper.insert(dict);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
