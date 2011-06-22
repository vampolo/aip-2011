<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
    <table class="contentlist">
    <tr>
		<th>Immagine</th>
		<th>Descrizione</th>
		<th>Ricette</th>
	</tr>
	<c:forEach var="p" items="${prodotti}">
		<tr>
    		<td><a>immagine</a></td>
    		<td><a href="/prodotto?key=${f:h(p.key)}">${f:h(p.productName)}</a></td>
    		<td>test2</td>
    	</tr> 						
	</c:forEach>
    </table> 
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>