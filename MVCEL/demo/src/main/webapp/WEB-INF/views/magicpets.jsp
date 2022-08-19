<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Magic Pets</title>
</head>
<body>
	<table>
		<c:forEach items="${pets}" var="pet">
			<tr>
				<td>${pet.name}</td>
				<td>${pet.type}</td>
				<td>${pet.age}</td>
				<td>${pet.powers}</td>
				
				<td> <c:if test="${pet.good_boy}">
						It's a Friend!
					</c:if>
					<c:if test="${not pet.good_boy}">
						Baddie! Not a friend. Go away!
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<button>
		<a href="/filter-pets"> Filter Pets! </a>
	</button>
</body>
</html>