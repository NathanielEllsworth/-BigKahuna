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
 * Created by nathanielellsworth on 10/6/16.
 */
public class SearchServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        DatabaseLineService ls = new DatabaseLineService();
        String to = "/createBudget";
        try {
            String searchText = req.getParameter("searchText");
            req.setAttribute("budgetlist", ls.search(searchText));
        } catch (SQLException e) {
            e.printStackTrace();
            to = "/error";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(to);
        dispatcher.forward(req, resp);
    }
}
