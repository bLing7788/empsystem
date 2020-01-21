package com.fh.service.impl;

import com.fh.bean.po.Emp;
import com.fh.bean.vo.DataTablesData;
import com.fh.bean.vo.Search;
import com.fh.dao.EmpMapper;
import com.fh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public DataTablesData queryList(Search search) {
        Long count = empMapper.queryCount();
        List<Emp> list= empMapper.queryList(search);
        DataTablesData tablesData = new DataTablesData();
        tablesData.setData(list);
        tablesData.setRecordsFiltered(count.intValue());
        tablesData.setRecordsTotal(count.intValue());
        tablesData.setDraw(search.getDraw());
        return tablesData;
    }
}
