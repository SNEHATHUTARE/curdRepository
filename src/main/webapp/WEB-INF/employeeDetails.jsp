<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/welcome.jsp"/>
<br><br><br><br>
<table align ="center">
<tr>
<td>Employee ID</td>
<td>${emp.eid }</td>
</tr>
<tr>
<td>Employee Name</td>
<td>${emp.ename }</td>
</tr>

<tr>
<td>Employee Salary</td>

<td>${emp.esal }</td>
</tr>

<tr>
<td>Employee Address</td>

<td>${emp.eaddr }</td>
</tr>

</table>

</body>
</html>