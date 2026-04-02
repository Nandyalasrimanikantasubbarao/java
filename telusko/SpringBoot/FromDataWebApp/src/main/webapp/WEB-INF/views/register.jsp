<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 02-04-2026
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Employee Registration Form</h2>

<form method="post">

    <label for="id">Employee ID:</label><br>
    <input type="number" id="id" name="id" required><br><br>

    <label for="ename">Employee Name:</label><br>
    <input type="text" id="ename" name="ename" required><br><br>

    <label for="ecity">Employee City:</label><br>
    <input type="text" id="ecity" name="ecity" required><br><br>

    <label for="esalary">Employee Salary:</label><br>
    <input type="number" step="0.01" id="esalary" name="esalary" required><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>
