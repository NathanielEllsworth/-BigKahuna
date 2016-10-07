package com.ironyard.Services;

import org.junit.Assert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by nathanielellsworth on 10/6/16.
 */
public class DatabaseConnectionTest {
    @org.junit.Test
    public void getConnection() throws Exception {
        DatabaseConnection dbaInfo = new DatabaseConnection();
        Connection conn = dbaInfo.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM finance.budget");
        boolean foundSomething = false;
        while (rs.next()) {
            foundSomething = true;
            System.out.println(rs.getString("bud_description"));
        }
        Assert.assertTrue(foundSomething);
    }
}
