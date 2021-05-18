package com.atppp.yygh.cmn.handler;

import com.atppp.yygh.cmn.service.DictService;
import com.atppp.yygh.common.result.Result;
import com.atppp.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "数据字典")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {
    @Autowired
    private DictService dictService;

    //根据数据id查询子数据列表
    @ApiOperation(value ="根据数据id查询子数据列表" )
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id){
        List<Dict> dictList = dictService.findChildData(id);
        return Result.ok(dictList);
    }

}
