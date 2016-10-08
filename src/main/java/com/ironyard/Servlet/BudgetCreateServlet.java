package com.ironyard.Servlet;

import com.ironyard.Data.Budget;
import com.ironyard.Services.DatabaseLineService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nathanielellsworth on 10/7/16.
 */
public class BudgetCreateServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = "/list";

        //Get data from req
        String des = req.getParameter("bDes");
        String cat = req.getParameter("bCat");
        String bud = req.getParameter("bBud");
        String act = req.getParameter("bAct");

        //budget object
        Budget userBudget = new Budget();
        userBudget.setDescription(des);
        userBudget.setCategory(cat);
        userBudget.setBudgetAmount(Double.parseDouble(bud));
        userBudget.setActualAmount(Double.parseDouble(act));

        //call save
        try{
            DatabaseLineService dServ = new DatabaseLineService();
            dServ.save(userBudget);
        }catch (Exception x){
            x.printStackTrace();
            destination = "/error.jsp";
        }
        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);

    }
}
