package com.atppp.yygh.common.handler;/**
 * @Description:
 * @program: yygh-parent
 * @Date: 2021/5/14 18:01
 * @Author: Mr.ppp
 */

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 *@Deacription TODO
 *@ClassName CommonMetaObjectHandler
 *@Author Mr.ppp
 *@Date 2021/5/14 18:01
 *@Version 1.0
 **/
public class CommonMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
