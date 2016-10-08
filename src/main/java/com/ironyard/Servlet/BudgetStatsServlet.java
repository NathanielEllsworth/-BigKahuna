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
public class BudgetStatsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String destination = "/sum.jsp";
        //get sum
        try{
            DatabaseLineService dServ = new DatabaseLineService();
            req.setAttribute("budgettotals", dServ.getBudgetTotals());
        }catch(SQLException x){
            x.printStackTrace();
            destination = "/error.jsp";
        }
        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
