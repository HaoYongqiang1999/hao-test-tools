package io.github.haoyongqiang1999.haotest.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestTableVo {
    String tabNm;
    Map<String, Object> primaryKeyData;
    Map<String, Object> columnData;
    List<Object> queryParamList;
    public Map<String, Object> getPrimaryKeyData() {
        return primaryKeyData;
    }

    public void setPrimaryKeyData(Map<String, Object> primaryKeyData) {
        this.primaryKeyData = primaryKeyData;
    }

    public Map<String, Object> getColumnData() {
        return columnData;
    }

    public void setColumnData(Map<String, Object> columnData) {
        this.columnData = columnData;
    }

    public String getTabNm() {
        return tabNm;
    }

    public void setTabNm(String tabNm) {
        this.tabNm = tabNm;
    }
    public TestTableVo() {
    }

    public TestTableVo(String tabNm,  Map<String, Object> primaryKeyData, Map<String, Object> columnData) {
        this.tabNm = tabNm;
        this.primaryKeyData = primaryKeyData;
        this.columnData = columnData;
        this.queryParamList = new ArrayList<>();
    }

    public List<Object> getQueryParamList() {
        return queryParamList;
    }

    public void setQueryParamList(List<Object> queryParamList) {
        this.queryParamList = queryParamList;
    }

    @Override
    public String toString() {
        return "TestTableVo{" +
                "tabNm='" + tabNm + '\'' +
                ", primaryKeyData=" + primaryKeyData +
                ", columnData=" + columnData +
                ", queryParamList=" + queryParamList +
                '}';
    }
}
