package com.ironyard.Services;

import com.ironyard.Data.Budget;
import com.ironyard.Data.BudgetTotals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nathanielellsworth on 10/6/16.
 */

//pulling all data from posgres budget table
public class DatabaseLineService {

    public List<Budget> getAllBudgets() throws SQLException {
        Budget found = null;
        List<Budget> allBudgets = new ArrayList<Budget>();
        DatabaseConnection dbaInfo = new DatabaseConnection();
        Connection conn = dbaInfo.getConnection();
        PreparedStatement stmt = conn.prepareCall("SELECT * FROM finance.budget");
        ResultSet rs = stmt.executeQuery();

        //Linking Budget Class to posgres budget table
        while (rs.next()) {
            found = new Budget();
            found.setDescription(rs.getString("bud_description"));
            found.setCategory(rs.getString("bud_category"));
            found.setBudgetAmount(rs.getDouble("bud_budgeted_amount"));
            found.setActualAmount(rs.getDouble("bud_actual_amount"));
            found.setId(rs.getLong("bud_key_id"));
            allBudgets.add(found);
        }
        return allBudgets;
    }
        //Linking the 'BudgetTotals' Class to posgres and using SQL syntax to add up the 'budget' and 'actual' amounts

    public List<BudgetTotals> getBudgetTotals() throws SQLException{
        BudgetTotals found = null;
        List<BudgetTotals> allBT = new ArrayList<BudgetTotals>();
        DatabaseConnection dbaInfo = new DatabaseConnection();
        Connection conn = dbaInfo.getConnection();
        PreparedStatement stmt = conn.prepareCall("SELECT bud_category, sum(bud_budgeted_amount) AS budgetTotal, sum(bud_actual_amount) AS actualTotal FROM finance.budget GROUP BY bud_category");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            found = new BudgetTotals();
            found.setCategory(rs.getString("bud_category"));
            found.setBudgetTotal(rs.getDouble("budgetTotal"));
            found.setActualTotal(rs.getDouble("actualTotal"));
            allBT.add(found);
        }
        return allBT;
    }

    //this is the search function where the user can search by category or description

    public List<Budget> search (String search) throws SQLException{
        List<Budget> found = new ArrayList<Budget>();
        DatabaseConnection dbaInfo = new DatabaseConnection();
        Connection conn = null;
        try {
            conn = dbaInfo.getConnection();
            search = search + "%";
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM finance.budget WHERE (bud_category ILIKE ?) OR (bud_description ILIKE ?);");
            ps.setString(1, search);
            ps.setString(2, search);
            ResultSet rs = ps.executeQuery();
            found = listResults(rs);
        }catch (Exception error) {
            error.printStackTrace();
            conn.rollback();
        }finally {
            conn.close();
        }
        return found;
    }

    //Setting the list results
    private List<Budget> listResults(ResultSet rs) throws SQLException{
        List<Budget> found = new ArrayList<Budget>();
        while (rs.next()){
            Budget x = new Budget();
            x.setDescription(rs.getString("bud_description"));
            x.setCategory(rs.getString("bud_category"));
            x.setBudgetAmount(rs.getDouble("bud_budgeted_amount"));
            x.setActualAmount(rs.getDouble("bud_actual_amount"));
            x.setId(rs.getInt("bud_key_id"));
        }
        return found;
    }
}


