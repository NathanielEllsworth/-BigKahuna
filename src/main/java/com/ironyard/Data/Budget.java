package com.ironyard.Data;

/**
 * Created by nathanielellsworth on 10/5/16.
 *
 * A quick rundown of how I built this project from bottom up.
 * 1.Started with the 'mockup.jsp' to layout how the project will be
 * 2.Built 'Budget' class for data strings
 * 3.Built 'createBudget.jsp' infrastructure to model the 'mockup.jsp'
 * 4.Built a 'budgetList.jsp' to store the budgets, (deleted it for posgres database storage)
 * 5.Built 'result.jsp' for user result, (deleted for posgres services package)
 * 6.Built Http 'BudgetServlet', (deleted for posgres)
 * 7.Built Http 'CreateBudgetServlet', (deleted for posgres)
 * 8.Built Http 'InputReadingServlet', (deleted for posgres services package)
 * 9.Built Http 'SelectBudgetServlet', (deleted for posgres services package)
 * 10.Built 'BudgetTotals' class for data strings in totaling 'budget' and 'actual' amounts
 * 11.Built 'DatabaseConnection' to establish a connection with posgres
 * 12.Built 'DatabaseLineService' to sync posgres with the 'Data' package and to establish the interactions between the two
 *
 *
 */
public class Budget {
    private long id;
    private String description;
    private String category;
    private double budgetAmount;
    private double actualAmount;

    public Budget(long id, String description, String category, double budgetAmount, double actualAmount) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.budgetAmount = budgetAmount;
        this.actualAmount = actualAmount;
    }

    public Budget() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(double actualAmount) {
        this.actualAmount = actualAmount;
    }
}
