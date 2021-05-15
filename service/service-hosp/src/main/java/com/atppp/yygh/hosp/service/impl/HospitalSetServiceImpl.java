package com.atppp.yygh.hosp.service.impl;

import com.atppp.yygh.hosp.mapper.HospitalSetMapper;
import com.atppp.yygh.hosp.service.HospitalSetService;
import com.atppp.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper,HospitalSet> implements HospitalSetService {

  /*  @Autowired
    //MP封装好了Service层 在ServiceImpl中已经继承了引入 响应的Mapper操作类
    private HospitalSetMapper hospitalSetMapper;
  */
}
