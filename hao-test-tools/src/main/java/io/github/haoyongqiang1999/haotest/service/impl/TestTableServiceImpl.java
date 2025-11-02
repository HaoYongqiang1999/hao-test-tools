package io.github.haoyongqiang1999.haotest.service.impl;

import io.github.haoyongqiang1999.haotest.dao.TestTableDao;
import io.github.haoyongqiang1999.haotest.service.TestTableService;
import io.github.haoyongqiang1999.haotest.vo.TestTableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TestTableServiceImpl implements TestTableService {
    @Autowired
    private TestTableDao testTableDao;
    @Override
    public TestTableVo testTableInsert(String tableConfig, String queryParams) {
        String[] parts = tableConfig.split(":");
        String tablePart = parts[0]; // tbl_book(id)
        String columnsPart = parts[1];
        String tableName = tablePart.split("\\(")[0];
        List<String> primaryKeys = Arrays.asList(tablePart.split("\\(")[1].split("\\)")[0].split(","));
        String[] columnDefs = columnsPart.split(",");
        Map<String, Object> columnData = new HashMap<>();
        Object columnVal = null;
        for (String columnDef : columnDefs) {
            String columnName = columnDef.split("-")[0];
            System.out.println("字段名: " + columnName);
            String columnType = columnDef.split("-")[1];
            int columnLen = Integer.parseInt(columnDef.split("-")[2]);
            if ("int".equals(columnType)) {
                columnVal = new Random().nextInt();
            } else if ("varchar".equals(columnType)) {
                int len = new Random().nextInt(Math.min(32,columnLen));
                columnVal  = UUID.randomUUID().toString().replace("-", "").substring(0,len);
            }
            columnData.put(columnName, columnVal);
        }
        Map<String, Object> primaryKeyData = new HashMap<>();
        for (String primaryKey : primaryKeys) {
            primaryKeyData.put(primaryKey, columnData.get(primaryKey));
        }
        TestTableVo tableVo = new TestTableVo(tableName, primaryKeyData, columnData);
        testTableDao.testTableInsert(tableVo);
        List<String> queryParamList = Arrays.stream(queryParams.split(",")).toList();
        for (String s : queryParamList) {
            tableVo.getQueryParamList().add(columnData.get(s));
        }
        return tableVo;
    }

    @Override
    public void testTableDelete(TestTableVo tableVo) {

    }
}
