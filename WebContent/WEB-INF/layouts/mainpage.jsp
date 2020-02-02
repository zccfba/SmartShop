
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ page session="false" %>


<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		 <!-- <spring:url value="/${app_css}" var="app_css_url" /> -->
		
		<link rel="stylesheet" type="text/css" media="screen" href="<s:url value="/WEB-INF/css/smartshop.css" />" > 
		
		<title>SMART-SHOP</title>
	</head>

	<body>
		<div id="headerBlock"> 
			<t:insertAttribute name="header" ignore="false" />
		</div>
		
		<div id="menuBlock"> 
			<t:insertAttribute name="menu" ignore="true" />
		</div>
		
		<div id="mainBlock"> 
			<t:insertAttribute name="body" />
		</div>
		
		<div id="footerBlock">
			<t:insertAttribute name="footer" ignore="true" />
		</div>
	</body>
</html>

