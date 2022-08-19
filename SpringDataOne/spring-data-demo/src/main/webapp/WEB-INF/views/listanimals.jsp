<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Power</th>
				<th>Age</th>
				<th>Good Boy?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="animal" items=${animals}>
				<td><a href="/animals/detail?id=${animal.id}">${animal.name}</a></td>
				<td>${power}</td>
				<td>${age}</td>
				<td> <c:if test="${animal.isgoodboy}"> Such a good animal!</c:if>
				<c:if test="${not animal.isgoodboy}"> Oh, bad animal!</c:if>
				
				</td>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>