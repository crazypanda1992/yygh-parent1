package com.atppp.yygh.cmn.service;

import com.atppp.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChildData(Long id);

    //导出数据字典(即下载)
    void exportData(HttpServletResponse response);

    //导入数据字典(即上传)
    void importDictData(MultipartFile file);
}
