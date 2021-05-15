package com.atppp.yygh.hosp.config;


/*
 *用于启动类扫描到mapper接口
 *
**/
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.atppp.yygh.hosp.mapper")
public class HospConfig {


}
