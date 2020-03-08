<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	<c:choose>
		<c:when test="${!empty emps}">
			<table border="1">
				<tr style="color: red;">
					<th>Emp No</th>
					<th>Emp Name</th>
					<th>Emp Job</th>
					<th>Emp Salary</th>
				</tr>
				<c:forEach var="dto" items="${emps}">
					<tr>
						<td>${dto.eno}</td>
						<td>${dto.ename}</td>
						<td>${dto.desg}</td>
						<td>${dto.salary}</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			Records not found..
		</c:otherwise>
	</c:choose>
	<br>
	<br>
	<a href="home.htm">back</a>
</body>
</html>