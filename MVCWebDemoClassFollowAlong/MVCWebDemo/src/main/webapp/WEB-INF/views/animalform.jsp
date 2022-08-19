<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Animal Form</title>
<link rel = "stylesheet" href= "/style.css"/>
</head>
<body>
	
<form action="/animalform" method="post">
	Type:<input name="type" type="text"/>
	Name:<input name="name" type="text"/>
	<input class= "button" type = "submit"/>
</form>

</body>
</html>