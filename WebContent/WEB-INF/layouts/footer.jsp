<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page session="false"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
	
	<hr/>
	<sec:authorize access="hasRole('ADMIN')" var="isAdmin" />
	<sec:authorize access="hasRole('USER')" var="isUser" />
	<sec:authorize access="isAuthenticated()" var="isAuth" />
	
	<a href="<c:url value="/" />">Home</a> - 
	<a href="<c:url value="/user/list" />">Utenti</a> - 
	<a href="">Prodotti</a> <c:if test="${isAdmin}"> - 
	<a href="<c:url value="/instruments/list" />">Strumenti</a></c:if> <c:if test="${isAuth}"> - 
	<a href="<c:url value="/logout" />">Logout</a></c:if> <c:if test="${! isAuth}"> - 
	<a href="<c:url value="/login" />">Login</a></c:if>