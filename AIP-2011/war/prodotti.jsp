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
		<table class="list_items">
			<thead>
			    <tr>
			      <th>Categoria</th>
			    </tr>
			</thead>
			<tbody>
			<c:forEach var="category" items="${categorie}">
			<tr>
				<td><a href="/prodotti?categoria=${f:h(category)}">${f:h(category)}</a></td>
			</tr>
			</c:forEach>
			<tr>
				<td><a href="/prodotti?categoria=all">Tutti i prodotti</a></td>
			</tr>
			</tbody>
		</table>
	</div> 
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>