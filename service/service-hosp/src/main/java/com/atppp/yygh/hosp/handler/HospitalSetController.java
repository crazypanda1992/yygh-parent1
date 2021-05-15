package com.atppp.yygh.hosp.handler;

import com.atppp.yygh.model.hosp.HospitalSet;
import com.atppp.yygh.hosp.service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "医院设置管理")     //用于swagger 类名显示
@RestController   //控制层  返回Josn数据
@RequestMapping("/admin/hosp/hospitalSet")   //表明 请求网址 映射的路径
public class HospitalSetController {

    //注入service
    @Autowired
    private HospitalSetService hospitalSetService;

    //1查询医院设置表中所有数据
    @ApiOperation(value = "获取所有医院设置")        //用于swagger 方法显示
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet(){
        //直接调用Service层
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    //路径带参数 传参需用  @PathVariable  注明参数来源
    //删除医院设置
    //此为逻辑删除  在Model模块Base包下已经为实体类定义了 isDeleted 属性
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public boolean removeHospSet(@PathVariable Long id){
        boolean result = hospitalSetService.removeById(id);
        return result;
    }
}
