<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal Info</title>
<link rel = "stylesheet" href= "/style.css"/>
</head>
<body>
	<div class="animal">
		<h3>This is ${name} the ${type}!</h3>
	</div>
	
	<div class="links"> 
		<a href="/" class="button"> Run home, Jack!</a>
	</div>
</body>
</html>