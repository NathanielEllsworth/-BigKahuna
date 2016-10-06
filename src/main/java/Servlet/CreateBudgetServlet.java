package Servlet;

import Data.Budget;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by nathanielellsworth on 10/5/16.
 */
public class CreateBudgetServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String description = req.getParameter("description");
        String category = req.getParameter("category");
        String budgetAmount = req.getParameter("budgetAmount");
        String actualAmount = req.getParameter("actualAmount");
        String id = req.getParameter("id");

        HttpSession session = req.getSession();
        List<Budget> budgetList = (List<Budget>) session.getAttribute("budgetlist");

        if (budgetList == null) {
            budgetList = new ArrayList<>();
        }

        Budget foundBudget = null;
        for (Budget b : budgetList) {
            if (b.getId() == Long.parseLong(id)) {
                break;
            }
        }
        if (foundBudget == null) {
            Budget NewBudget = new Budget(Long.parseLong(id), description, category, Double.parseDouble(budgetAmount), Double.parseDouble(actualAmount));
            budgetList.add(NewBudget);
        } else {
            foundBudget.setDescription(description);
            foundBudget.setDescription(category);
            foundBudget.setDescription(budgetAmount);
            foundBudget.setDescription(actualAmount);
        }

        session.setAttribute("budgetlist", budgetList);

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createBudget.jsp");
        dispatcher.forward(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/createBudget.jsp");
        dispatcher.forward(req,resp);
    }
}
