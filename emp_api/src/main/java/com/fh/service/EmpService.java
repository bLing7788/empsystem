package com.fh.service;

import com.fh.bean.vo.DataTablesData;
import com.fh.bean.vo.Search;

public interface EmpService {
    DataTablesData queryList(Search search);
}
