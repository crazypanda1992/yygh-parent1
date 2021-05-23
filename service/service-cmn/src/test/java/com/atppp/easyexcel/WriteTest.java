package com.atppp.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class WriteTest {
    public static void main(String[] args) {
        List<UserData> list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData userData = new UserData();
            userData.setId(i);
            userData.setName("测试"+i);
            list.add(userData);
        }
        String fileName="F:\\excel\\01.xlsx";
         EasyExcel.write(fileName, UserData.class).sheet("用户信息")
                 .doWrite(list);
    }

}
