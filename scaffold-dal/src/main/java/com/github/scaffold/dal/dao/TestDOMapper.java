package com.github.scaffold.dal.dao;

import com.github.scaffold.dal.dataobject.TestDO;
import com.github.scaffold.dal.dataobject.TestDOCondition;
import java.util.List;

public interface TestDOMapper {
    long countByExample(TestDOCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(TestDO record);

    int insertSelective(TestDO record);

    List<TestDO> selectByExample(TestDOCondition example);
    
    TestDO selectByPrimaryKey(Long id);
}