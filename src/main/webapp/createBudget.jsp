<%--
  Created by IntelliJ IDEA.
  User: nathanielellsworth
  Date: 10/5/16
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Budget</h1>
<form method="post" action="/myweb/createbudget">
    <table>
        <tr><td>Place of Purchase:</td> <td><input type="text" name="description" value="<c:out value="${selectedbudget.description}"/>"></td></tr>
        <tr><td>Lunch or Coffee:</td> <td><input type="text" name="category" value="<c:out value="${selectedbudget.category}"/>"></td></tr>
        <tr><td>Budgeted Amount:</td> <td><input type="text" name="budget" value="<c:out value="${selectedbudget.budget}"/>"></td></tr>
        <tr><td>Actual Amount:</td> <td><input type="text" name="actual" value="<c:out value="${selectedbudget.actual}"/>"></td></tr>
        <tr><td>Budget ID:</td> <td><input type="text" name="id" value="<c:out value="${selectedbudget.id}"/>"></td></tr>
    </table>
    <input type="submit" value="Save">
</form>

Your Budget:
<table border="1">
    <th>Description</th><th>Category</th><th>Budget Amount</th><th>Actual Amount</th></tr>
    <c:forEach items="${budgetlist}" var="budget">
        </td><td><a href="/myweb/selectbudget?id=<c:out value="${budget.id}"/>">EDIT</a><c:out value="${budget.description}"/></td><td><c:out value="${budget.category}"/></td><td><c:out value="${budget.budget}"/></td><td><c:out value="${budget.actual}"/></td></tr>
    </c:forEach>
</table>

</body>
</html>
