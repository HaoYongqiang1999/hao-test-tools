package io.github.haoyongqiang1999.haotest.dao;

import org.apache.ibatis.annotations.Mapper;
import io.github.haoyongqiang1999.haotest.vo.TestTableVo;
@Mapper
public interface TestTableDao {
    void testTableInsert(TestTableVo tableVo);
}
