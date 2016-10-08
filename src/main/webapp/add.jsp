<%--
  Created by IntelliJ IDEA.
  User: nathanielellsworth
  Date: 10/7/16
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add to Budget</title>
</head>
<body>
Please put in your daily budget and click 'Save'

<form action="/budget/create" method="post">
    <table>
        <tr> <td>Place of Purchase:</td><td><input type="text" name="bDes"></td></tr>
        <tr><td>Lunch or Coffee:</td><td><input type="text" name="bCat"></td></tr>
        <tr> <td>Budget Amount:</td><td><input type="text" name="bBud"></td></tr>
        <tr> <td>Actual Amount:</td><td><input type="text" name="bAct"></td></tr>

    </table>
    <input type="submit" name="Save"/>
</form>
</body>
</html>
