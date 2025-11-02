package io.github.haoyongqiang1999.haotest.service;

import io.github.haoyongqiang1999.haotest.vo.TestTableVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TestTableService {
    TestTableVo testTableInsert(String tableConfig, String queryParams);
    void testTableDelete(TestTableVo tableVo);
}
