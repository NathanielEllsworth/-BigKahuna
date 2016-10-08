<%--
  Created by IntelliJ IDEA.
  User: nathanielellsworth
  Date: 10/7/16
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Budget List</title>
</head>
<body>
Category data <a href="/budget/stats">HERE</a>
<p/>
Add to Budget <a href="/budget/add.jsp">HERE</a>
<p></p>
<form action="/budget/search" method="post">
    Search <input type="text" name="searchtext"/>
    <br>
    <input type="submit" name="Filter Results"/>
</form>
<table border="1">
    <tr><th>Actions</th><th>Description</th><th>Category</th><th>Budgeted Amount</th><th>Actual Amount</th></tr>
    <c:forEach items="${budgetlist}" var="aBudget">
        <tr>
            <td><a href="/budget/select?id=<c:out value="${aBudget.id}"/>">EDIT</a>
                <br>
                <a href="/budget/delete?id=<c:out value="${aBudget.id}"/>">DELETE</a></td>
            <td><c:out value="${aBudget.description}"/></td>
            <td><c:out value="${aBudget.category}"/></td>
            <td><c:out value="${aBudget.budgetAmount}"/></td>
            <td><c:out value="${aBudget.actualAmount}"/></td></tr>
    </c:forEach>
</table>
</body>
</html>
