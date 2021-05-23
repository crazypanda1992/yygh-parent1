package com.atppp.yygh.cmn.handler;

import com.atppp.yygh.cmn.service.DictService;
import com.atppp.yygh.common.result.Result;
import com.atppp.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Api(description = "数据字典")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {
    @Autowired
    private DictService dictService;

    //导入数据字典(即上传)
    @PostMapping("importData")
    public Result importData(MultipartFile file){
        dictService.importDictData(file);
        return Result.ok();
    }


    //导出数据字典(即下载)
    @ApiOperation(value ="导出" )
    @GetMapping("/exportData")
    public void exportData(HttpServletResponse response){
        dictService.exportData(response);

    }
    //根据数据id查询子数据列表
    @ApiOperation(value ="根据数据id查询子数据列表" )
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id){
        List<Dict> dictList = dictService.findChildData(id);
        return Result.ok(dictList);
    }

}
