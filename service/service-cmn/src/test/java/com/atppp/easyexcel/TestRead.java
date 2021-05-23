package com.atppp.easyexcel;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {
       String filename="F:\\excel\\01.xlsx";

        EasyExcel.read(filename,UserData.class,new ExcelListener() ).sheet().doRead();
    }

}
