package com.ironyard.Servlet;

import com.ironyard.Services.DatabaseLineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by nathanielellsworth on 10/7/16.
 */
public class BudgetSearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //get budgets
        DatabaseLineService dServ = new DatabaseLineService();
        String destination = "/list.jsp";
        //get search
        try{
            String searchByText = req.getParameter("searchtext");
            req.setAttribute("budgetlist",dServ.search(searchByText));
        }catch(SQLException x){
            x.printStackTrace();
            destination = "error.jsp";
        }
        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
