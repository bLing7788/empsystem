package com.fh.controller;

import com.fh.bean.vo.DataTablesData;
import com.fh.bean.vo.Search;
import com.fh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class EmpController {


    @Autowired
    private EmpService empService;
            @RequestMapping("queryList")
            @ResponseBody
    public DataTablesData queryList(Search search){
        DataTablesData tablesData=empService.queryList(search);
        System.out.println(tablesData);
        return tablesData;
    }
}
