<%--
  Created by IntelliJ IDEA.
  User: nathanielellsworth
  Date: 10/7/16
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
Go back <a href="/budget/list">HERE</a>

<table border="1">
    <tr><th>Lunch or Coffee</th><th>Budget Amount</th><th>Actual Amount</th></tr>
    <c:forEach items="${budgettotals}" var="aTotal">
        <tr><td><c:out value="${aTotal.category}"/></td>
            <td><c:out value="${aTotal.budgetAmount}"/></td>
            <td><c:out value="${aTotal.actualAmount}"/></td></tr>
    </c:forEach>
</table>
</body>
</html>
