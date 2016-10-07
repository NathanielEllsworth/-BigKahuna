package com.ironyard.Servlet;

import com.ironyard.Data.Budget;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by nathanielellsworth on 10/5/16.
 */
@WebServlet(name= "SelectBudgetServlet")
public class SelectBudgetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet (req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String BudgetID = req.getParameter("id");
        long selectedId = Long.parseLong(BudgetID);
        List<Budget> BudgetList = (List<Budget>) req.getSession().getAttribute("budgetlist");
        Budget foundBudget = null;

        for(Budget b:BudgetList){
            if(b.getId() == selectedId){
                foundBudget = b;
                break;
            }
        }
        req.setAttribute("selectedbudget", foundBudget);
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("createBudget.jsp");
        dispatcher.forward(req,resp);
    }
}
