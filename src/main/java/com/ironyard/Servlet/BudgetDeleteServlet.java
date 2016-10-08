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
public class BudgetDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = "/list";
        //get id from req
        String id = req.getParameter("id");
        long idCon = Long.parseLong(id);

        //get budget by id
        DatabaseLineService dServ = new DatabaseLineService();
        try{
            dServ.delete(idCon);
        }catch(SQLException x){
            x.printStackTrace();
            destination = "/error.jsp";
        }

        //forward
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(req,resp);
    }
}
