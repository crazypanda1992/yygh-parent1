package com.atppp.yygh.cmn.service;

import com.atppp.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChildData(Long id);
}
