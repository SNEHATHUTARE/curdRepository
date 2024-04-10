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
<form method="post"action="edit">
<table align ="center">

<tr>
<td>Employee ID</td>
<td>${emp.eid}</td>
</tr>
<tr>
<td>Employee Name</td>
<td><input type="text" name="${emp.ename }"/></td>
</tr>

<tr>
<td>Employee Salary</td>
<td><input type="text" name="${emp.esal }"/></td>
</tr>

<tr>
<td>Employee Address</td>
<td><input type="text" name="${emp.eaddr }"/></td>
</tr>

<td><input type="submit" name="Update Employee" }"/></td>
</tr>
</table>
<input type="hidden" name="eid" value="${emp.eid }"/>
</form>
</body>
</html>