<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
    <div id="orientationInfo">
		<ul>
			<li><a href="/prodotti">Prodotti</a></li>
		</ul>
	</div>
	<div class="post">
	<ul>
	<li><a href="/prodotti?categoria=all">Tutti i prodotti</a></li>
	<li><a href="/prodotti?select=category">Prodotti per categoria</a></li>
	</ul>
	</div> 
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>