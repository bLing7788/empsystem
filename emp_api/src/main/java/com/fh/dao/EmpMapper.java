package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.bean.po.Emp;
import com.fh.bean.vo.Search;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper extends BaseMapper<Emp> {

    Long queryCount();

    List<Emp> queryList(Search search);
}
