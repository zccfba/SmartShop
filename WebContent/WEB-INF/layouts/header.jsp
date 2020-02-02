<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<sec:authorize access="hasRole('ADMIN')" var="isAdmin" />
<sec:authorize access="isAuthenticated()" var="isAuth" />

<h1>Welcome to SmartShop</h1>

<a href="<c:url value="/utenti" />" >Utenti</a>
<a href="<c:url value="/utenti/register" />" >Registrati</a>
<!-- 
<s:if test="${isAuth}"> Benvenuto/a  <sec:authentication property="principal.username" /></s:if>
 -->
