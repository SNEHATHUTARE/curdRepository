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
<form method="post"action="add">
<table align ="center">
<tr>
<td>Employee ID</td>
<td><input type="text" name="eid"/></td>
</tr>
<tr>
<td>Employee Name</td>
<td><input type="text" name="ename"/></td>
</tr>

<tr>
<td>Employee Salary</td>
<td><input type="text" name="esal"/></td>
</tr>

<tr>
<td>Employee Address</td>
<td><input type="text" name="eaddr"/></td>
</tr>

<tr>

<td><input type="submit" value="ADD EMPLOYEE"/></td>
</tr>


</table>
</form>
</body>
</html>