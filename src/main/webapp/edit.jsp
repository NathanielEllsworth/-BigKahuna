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
<form method="post" action="/budget/update">
    <table>
        <tr><td>Place of Purchase:</td> <td><input type="text" name="bDes" value="<c:out value="${Edit.description}"/>"></td></tr>
        <tr><td>Lunch or Coffee:</td> <td><input type="text" name="bCat" value="<c:out value="${Edit.category}"/>"></td></tr>
        <tr><td>Budgeted Amount:</td> <td><input type="text" name="bBud" value="<c:out value="${Edit.budgetAmount}"/>"></td></tr>
        <tr><td>Actual Amount:</td> <td><input type="text" name="bAct" value="<c:out value="${Edit.actualAmount}"/>"></td></tr>
    </table>
    <input type="submit" value="Update"/>
    <input type="hidden" name="uId" value="<c:out value="${Edit.id}"/>"/>
</form>
</body>
</html>
