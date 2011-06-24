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
			<li><a href="/produttore?key=${f:h(produttore.key)}">Produttore: ${f:h(produttore.producerName)}</a></li>
		</ul>
	</div>
	<div class="post">
    <table class="contentlist">
    <tr>
		<th>Immagine</th>
		<th>Nome</th>
	</tr>
	<c:forEach var="p" items="${prodotti}">
		<tr>
    		<td><img src="GetImage?productKey=${f:h(p.key)}&imageIndex=0" /></td>
    		<td><a href="/prodotto?key=${f:h(p.key)}&fromProducer=${f:h(produttore.key)}">${f:h(p.productName)}</a></td>
    	</tr> 						
	</c:forEach>
    </table>
    </div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>