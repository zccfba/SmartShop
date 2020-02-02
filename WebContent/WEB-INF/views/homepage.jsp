<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<%@ page session="false"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>SmartShop</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/smartshop.css" />" >
	</head>

	<body>
	 
<!-- 
		<ul>
			<li>Cantanti: <a href="<c:url value="/singers/list/" />">lista Prodotti</a> - <a href="<c:url value="/singers/add/" />">aggiungi Prodotti</a>
			<li>Album: <a href="">lista</a> - <a href="">aggiungi</a> 
		<%--	<li>Strumenti: <a href="<c:url value="/instruments/list/" />">lista</a> - 
				<a href="<c:url value="/instruments/add/" />">aggiungi</a>  --%>
		</ul>
 -->		
		<a href="<c:url value="/views/user" />" > Utenti </a> |
		<a href="<c:url value="/views/register" />" > Crea un nuovo account </a> |
		<a href="<c:url value="/views/login" />" > Accedi </a> |
		<h1>Benvenuti in SMARTSHOP</h1>
		
		
		
	</body>
</html>