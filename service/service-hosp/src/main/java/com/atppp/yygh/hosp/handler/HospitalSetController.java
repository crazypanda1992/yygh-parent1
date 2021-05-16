package com.atppp.yygh.hosp.handler;

import com.atppp.yygh.common.result.Result;
import com.atppp.yygh.common.utils.MD5;
import com.atppp.yygh.model.hosp.HospitalSet;
import com.atppp.yygh.hosp.service.HospitalSetService;
import com.atppp.yygh.vo.hosp.HospitalSetQueryVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@Api(tags = "医院设置管理")     //用于swagger 类名显示
@RestController   //控制层  返回Josn数据
@RequestMapping("/admin/hosp/hospitalSet")   //表明 请求网址 映射的路径
public class HospitalSetController {

    //注入service
    @Autowired
    private HospitalSetService hospitalSetService;

    //1.查询医院设置表中所有数据
    @ApiOperation(value = "获取所有医院设置")        //用于swagger 方法显示
    @GetMapping("findAll")
    public Result findAllHospitalSet(){
        //直接调用Service层
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }

    //2.逻辑删除医院设置
    //路径带参数 传参需用  @PathVariable  注明参数来源
    //此为逻辑删除  在Model模块Base包下已经为实体类定义了 isDeleted 属性
    @ApiOperation(value = "逻辑删除医院设置")
    @DeleteMapping("{id}")
    public Result removeHospSet(@PathVariable Long id){
        boolean result = hospitalSetService.removeById(id);
        if (result){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    //3.条件查询带分页

    //@RequestBody(required = false)  表示通过JOSN数据来传参数 required=false可以为空
    //与前端交互的数据 都为JOSN数据  所以页面POST请求来的 自定义类数据 需要为JOSN数据格式 即 参数中的自定义类需要加RequestBody
    //Post请求 才能从页面提交JOSN数据 后端才能得到JOSN数据

    @PostMapping("findPageHospSet/{current}/{limit}")
    public Result findPageHospSet(
            @PathVariable long current,               //当前页
            @PathVariable long limit,                 //显示的条目数
            @RequestBody(required = false) HospitalSetQueryVo hospitalSetQueryVo    //待条件查询的对象
    ){
        //第一步：分页需要Page对象
        Page<HospitalSet> page =new Page<>(current,limit);
        //构建条件
        QueryWrapper<HospitalSet> wrapper=new QueryWrapper<>();
        String hosname = hospitalSetQueryVo.getHosname();  //医院名称
        String hoscode = hospitalSetQueryVo.getHoscode();  //医院编号
        if (!StringUtils.isEmpty(hosname)){
            wrapper.like("hosname",hosname );
        }
        if (!StringUtils.isEmpty(hoscode)){
            wrapper.eq("hoscode",hoscode );
        }

        //条用方法实现分页查询
        Page<HospitalSet> pageHospSet = hospitalSetService.page(page, wrapper);
        return Result.ok(pageHospSet);
    }
    //4.添加医院设置
    @PostMapping("saveHospitalSet")
    public Result saveHospitalSet(@RequestBody HospitalSet hospitalSet){
            // 状态 和 密钥 是需要手动生成
        //设置状态   1使用 0不能使用
        hospitalSet.setStatus(1);
        //签名密钥
        Random random=new Random();
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis() +"" +random.nextInt(1000)));

        boolean save = hospitalSetService.save(hospitalSet);
        if (save){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }



    //5.根据id获取医院设置
    @GetMapping("getHospSet/{id}")
    public Result getHospSet(@PathVariable long id){
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        return Result.ok(hospitalSet);
    }
    //6.修改医院设置
     //修改 需要先查询 后修改  因此 我们需要得到查询到的对象 需要POST请求 用于将实体类数据 传到后端
    @PostMapping("updateHospitalSet")
    public Result updateHospitalSet(@RequestBody HospitalSet hospitalSet){
        boolean flag = hospitalSetService.updateById(hospitalSet);
        if (flag){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    //7.批量删除医院设置   //需要接收 ID的集合 ID是LONG类型的
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> list){
         hospitalSetService.removeByIds(list);
         return Result.ok();
    }

    //8.医院设置锁定和解锁
    @PutMapping("lockHospitalSet/{id}/{status}")
    public Result lockHospitalSet(@PathVariable long id,
                                  @PathVariable Integer status){
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        hospitalSet.setStatus(status);
        hospitalSetService.updateById(hospitalSet);
        return Result.ok();
    }


    //9.发送签名密钥
    @PutMapping("sendKet/{id}")
    public Result lockHospitalSet(@PathVariable long id){
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        String signKey = hospitalSet.getSignKey();
        String hoscode = hospitalSet.getHoscode();
        //TODO 发送短信
        return Result.ok();
    }
}
