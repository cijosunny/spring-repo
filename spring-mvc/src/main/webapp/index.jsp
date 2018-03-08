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
	
</body>
</html>