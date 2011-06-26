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
			<li><a href="/prodotto?key=${f:h(prodotto.key)}">Prodotto: ${f:h(prodotto.productName)}</a></li>
		</ul>
	</div>
    <div class="post">
		<table class="list_items">
			<thead>
			    <tr>
			      <th>Immagine</th>
			      <th>Nome</th>
			    </tr>
			</thead>
			<tbody>
			<c:forEach var="r" items="${ricette}">
			<tr>
				<td><img src="/GetImage?recipeKey=${f:h(r.key)}&imageIndex=0" /></td>
				<td><a href="/ricetta?key=${f:h(r.key)}">${f:h(r.recipeName)}</a></td>
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