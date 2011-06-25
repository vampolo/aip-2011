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
			<li><a href="/prodotti?categoria=${f:h(categoria)}">Categoria: ${f:h(categoria)}</a></li>
		</ul>
	</div>
	<div class="post">
		<table class="list_items">
			<thead>
			    <tr>
			      <th>Immagine</th>
			      <th>Nome</th>
			      <th>Ricette</th>
			    </tr>
			</thead>
			<tbody>
			<c:forEach var="p" items="${prodotti}">
			<tr>
				<td><img src="/GetImage?productKey=${f:h(p.key)}&imageIndex=0" /></td>
				<td><a href="/prodotto?key=${f:h(p.key)}&fromCategory=${f:h(categoria)}">${f:h(p.productName)}</a></td>
    			<td><a href="/ricette?fromProduct=${f:h(p.key)}">Ricette che utilizzano ${f:h(p.productName)}</a></td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>