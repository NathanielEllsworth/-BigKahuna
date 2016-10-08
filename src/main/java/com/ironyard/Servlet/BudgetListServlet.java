package com.ironyard.Servlet;

import com.ironyard.Services.DatabaseLineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by nathanielellsworth on 10/7/16.
 *
 * fetches a list of budgets from database and forwards to list page
 * @param req
 * @param resp
 * @throws ServletException
 * @throws IOException
 *
 */

@WebServlet(name = "BudgetListServlet")
public class BudgetListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doGet(req,resp);
    }



    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //get budgets
        DatabaseLineService dServ = new DatabaseLineService();
        String destination = "/list.jsp";
        try{
            //put to req scope
            req.setAttribute("budgetlist", dServ.getAllBudgets());
        }catch(SQLException x){
            x.printStackTrace();
            destination = "/error.jsp";
        }
        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
