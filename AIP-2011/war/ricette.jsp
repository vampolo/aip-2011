<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
    <c:if test="${ not empty ricette}">
	    <div id="orientationInfo">
			<ul>
				<li><a href="/ricette">Ricette</a></li>
				<li><a href="/ricette?fromProduct=all">Tutte le ricette</a></li>
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
	</c:if>
	<c:if test="${ empty ricette}">
		<div id="orientationInfo">
				<ul>
					<li><a href="/ricette">Ricette</a></li>
				</ul>
		</div>
		<div class="post">
			<table class="list_items">
				<thead>
				    <tr> 
				      <th>Tipi di ricette</th>
				    </tr>
				</thead>
				<tbody>
						<tr>
							<td><a class="notImplemented" href="#">Bevande</a></td>
						</tr>
						<tr>
							<td><a class="notImplemented" href="#">Antipasti</a></td>
						</tr>
						<tr>
							<td><a class="notImplemented" href="#">Primi piatti</a></td>
						</tr>
						<tr>
							<td><a class="notImplemented" href="#">Secondi piatti</a></td>
						</tr>					
						<tr>
							<td><a class="notImplemented" href="#">Contorni</a></td>
						</tr>						
						<tr>
							<td><a class="notImplemented" href="#">Dessert</a></td>
						</tr>						
						<tr>
							<td><a class="notImplemented" href="#">Salse e condimenti</a></td>
						</tr>						
						<tr>
							<td><a href="/ricette?fromProduct=all">Tutte le ricette</a></td>
						</tr>
				</tbody>
			</table>
		</div>
	</c:if>

	</jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>

