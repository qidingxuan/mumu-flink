package com.lovecws.mumu.flink.table;

import org.junit.Test;

/**
 * @program: mumu-flink
 * @description: ${description}
 * @author: 甘亮
 * @create: 2019-12-02 14:12
 **/
public class AtdEventSqlQueryTest {

    private AtdEventSqlQuery atdEventSqlQuery = new AtdEventSqlQuery();

    @Test
    public void sqlQuery() {
        atdEventSqlQuery.sqlQuery("E:\\data\\mumuflink\\atd\\localfile\\2019112109", "E:\\data\\mumuflink");
    }

    @Test
    public void atdSqlQuery() {
        atdEventSqlQuery.atdSqlQuery("E:\\data\\mumuflink\\atd\\localfile\\2019112109\\part-0-0");
    }

    @Test
    public void atdTableQuery() {
        atdEventSqlQuery.atdTableQuery("E:\\data\\mumuflink\\atd\\localfile\\2019112109\\part-0-0");
    }
}
