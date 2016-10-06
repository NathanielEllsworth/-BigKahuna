<%--
  Created by IntelliJ IDEA.
  User: nathanielellsworth
  Date: 10/5/16
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
    <title>result</title>
</head>
<body>
<p/>
<%
    Enumeration e = request.getParameterNames();
    while(e.hasMoreElements()){
        String key = e.nextElement().toString();
%>
<%=key%> : <%=request.getParameter(key)%> <br>
<%
    }
%>

</body>
</html>
