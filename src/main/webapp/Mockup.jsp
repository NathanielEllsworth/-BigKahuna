<%
    String redirectURL = "/budget/list";
    response.sendRedirect(redirectURL);
%>

<%--<html>--%>
<%--<body>--%>
<%--<center><h2>Budget</h2></center>--%>

<%--<html>--%>

<%--<style>--%>
    <%--background-image: url("http://img.freecodesource.com/formspring-backgrounds/images/bg/L405897906.jpg" alt="HTML5 Icon" width="1440" height="900");--%>






    <%--table.table-style-one {--%>
        <%--font-family: verdana,arial,sans-serif;--%>
        <%--font-size:11px;--%>
        <%--color:#333333;--%>
        <%--border-width: 1px;--%>
        <%--border-color: #3A3A3A;--%>
        <%--border-collapse: collapse;--%>
    <%--}--%>
    <%--table.table-style-one th {--%>
        <%--border-width: 1px;--%>
        <%--padding: 8px;--%>
        <%--border-style: solid;--%>
        <%--border-color: #3A3A3A;--%>
        <%--background-color: #B3B3B3;--%>
    <%--}--%>
    <%--table.table-style-one td {--%>
        <%--border-width: 1px;--%>
        <%--padding: 8px;--%>
        <%--border-style: solid;--%>
        <%--border-color: #3A3A3A;--%>
        <%--background-color: #ffffff;--%>
    <%--}--%>
<%--</style>--%>
<%--<!-- Table goes in the document BODY -->--%>
<%--<center><table style="width:75%" class="table-style-one">--%>
    <%--<thead>--%>
    <%--<tr>--%>
        <%--<th>Description</th><th>Category</th><th>Budgeted</th><th>Actual</th>--%>
    <%--</tr>--%>
    <%--</thead>--%>
    <%--<tbody>--%>
    <%--<tr>--%>
        <%--<td>StarBuck's</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$6</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Wendy's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$4</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Publix Sub</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$6</td>--%>
        <%--<td>$8</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>StarBuck's</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$8</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>StarBuck's</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$4</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Dunkin Donuts</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$4</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Chick-fil-A</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Chipotle</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$7</td>--%>
        <%--<td>$10</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>StarBucks</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$8</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Starbucks</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$6</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Bonefish Grill</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$20</td>--%>
        <%--<td>$37</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Bonefish Grill</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$10</td>--%>
        <%--<td>$42</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Bonefish Grill</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$7</td>--%>
        <%--<td>$77</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr><tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr><tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr><tr>--%>
        <%--<td>McDonald's</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$1</td>--%>
        <%--<td>$2</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>StarBucks</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$8</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Dunkin Donuts</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$4</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Chick-fil-A</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Chipotle</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$7</td>--%>
        <%--<td>$10</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>StarBucks</td>--%>
        <%--<td>Coffee</td>--%>
        <%--<td>$5</td>--%>
        <%--<td>$8</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Taco Bell</td>--%>
        <%--<td>Lunch</td>--%>
        <%--<td>$4</td>--%>
        <%--<td>$7</td>--%>
    <%--</tr>--%>
    <%--</tbody>--%>
<%--</center>--%>

<%--</html>--%>


<%--</body>--%>
<%--</html>--%>
<%--<!----%>
<%--1) Mock out JSPs--%>
<%--2) Create servlet, when you go to this servlet URL, you should be forwarded to your Mock JSP--%>
<%--3) Add a) service class => getAllLineItem(),--%>
       <%--b) data model class for a LineItem--%>
<%--4) Create a test that uses your service class to get all line items--%>
<%--5) Change servlet to get use the getAllLineItem() and put into the request.setAttribute(...)--%>
<%--6) Change JSP to use the data from servlet (request)--%>

<%--->--%>