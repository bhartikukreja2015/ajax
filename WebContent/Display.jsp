<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
        <%@ page import="com.model.Employee"%>
    <%@ page import="com.dao.EmployeeDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="sd" %>

<body>
<table border="2">

<tr>
<th>name</th><th>last name</th><th>employee id</th><th>employee sal</th>
</tr>
<sd:forEach var="cust" items="${listkey}">
<tr><td>${cust.firstName}</td><td>${cust.lastName}</td><td>${cust.employeeID}</td><td>${cust.empSal}</td></tr>
</sd:forEach>
</table>
</body>
</html>
