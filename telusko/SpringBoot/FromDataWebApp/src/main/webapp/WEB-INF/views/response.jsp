<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 01-04-2026
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title Learning</title>
</head>
<body>
<center>
    <h2 style="color: blue;text-align: center">Display Data from an Arrau/Collection</h2>
    <c:forEach var="bookName" items="${data}">
        <ul>
            <li>${bookName}</li>
        </ul>

    </c:forEach>
</center>
</body>
</html>
