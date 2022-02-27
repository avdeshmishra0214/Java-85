<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee</title>
</head>
<body>
 <jsp:useBean class="co.edureka.web.model.Employee" id="emp"></jsp:useBean>
 <jsp:setProperty name="emp" property="*"/>
 
 <h2>
  Employee No: <jsp:getProperty name="emp" property="empno"/> <br>
  Employee Name: <jsp:getProperty name="emp" property="ename"/> <br>
  Employee Salary: <jsp:getProperty name="emp" property="salary"/>
 </h2>
</body>
</html>