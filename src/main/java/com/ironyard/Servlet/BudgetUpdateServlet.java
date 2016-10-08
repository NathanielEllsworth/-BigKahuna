package com.ironyard.Servlet;

import com.ironyard.Data.Budget;
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
public class BudgetUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String destination = "/list.jsp";
        //get req param
        String des = req.getParameter("uDes");
        String cat = req.getParameter("uCat");
        String bud = req.getParameter("uBud");
        String act = req.getParameter("uAct");
        String id = req.getParameter("uId");

        double budCon = Double.parseDouble(bud);
        double actCon = Double.parseDouble(act);
        long idCon = Long.parseLong(id);

        //make budget with id
        Budget update = new Budget();
        update.setDescription(des);
        update.setCategory(cat);
        update.setBudgetAmount(budCon);
        update.setActualAmount(actCon);
        update.setId(idCon);

        //call update
        DatabaseLineService dServ = new DatabaseLineService();
        try{
            dServ.update(update);
        }catch (SQLException x){
            x.printStackTrace();
            destination = "/error.jsp";
        }
        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
