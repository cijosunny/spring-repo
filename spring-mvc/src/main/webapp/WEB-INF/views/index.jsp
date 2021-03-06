<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring5 MVC Hibernate Demo</title>
<style type="text/css">
.error {
	color: red;
}

table {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

table td {
	border: 1px solid #565454;
	padding: 20px;
}
</style>
</head>
<body>
	<h1>Input Form</h1>
	<p>
		Hello <b><c:out value="${pageContext.request.remoteUser}" /></b>
	</p>
	<c:url var="logoutUrl" value="/logout" />
	<form class="form-inline" action="${logoutUrl}" method="post">
		<input type="submit" value="Log out" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	<form:form action="add" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /> <br /> <form:errors
						path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /> <br /> <form:errors path="age"
						cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">Submit</button></td>
			</tr>
		</table>
	</form:form>

	<h2>Users List</h2>
	<table>
		<tr>
			<td><strong>Name</strong></td>
			<td><strong>Age</strong></td>
		</tr>
		<c:forEach items="${employees}" var="emp">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.age}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>