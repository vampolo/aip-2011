<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
      <div id="orientationInfo">
		<ul>
			<li><a href="/ricette">Ricette</a></li>
		</ul>
	</div>
	<div class="post">
		<c:forEach var="r" items="${ricette}">
			<a href="/ricetta?key=${f:h(r.key)}">${f:h(r.recipeName)}</a><br /> 						
		</c:forEach>
	</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
