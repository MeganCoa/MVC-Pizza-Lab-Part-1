<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Filter the pets</h1>
	
	<form action="/magicpets" method="post">	
	<p>
		<label for="category-input"> Category </label>
		<select name="category" id="category-input">
		<option value="">All</option>
		<option value="good_boy">Good Boys Only</option>
		<option value="bad_boy">Bad Boys CLub</option>
		</select>
	</p>
	<p>
		<button type="submit">Search</button>
	</p>
	</form>
</body>
</html>