package com.auto.auto_manage.mapper;

import com.auto.auto_manage.bean.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    Test selectByPrimaryKey(Integer id);

    List<Test> selectAll();

    int updateByPrimaryKey(Test record);
}