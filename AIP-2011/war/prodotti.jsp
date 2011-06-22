<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
    	<c:forEach var="category" items="${categorie}">
			<a href="/prodotti?categoria=${f:h(category)}">${f:h(category)}</a><br /> 						
		</c:forEach>
		<a href="/prodotti?categoria=all">All products</a>  
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>