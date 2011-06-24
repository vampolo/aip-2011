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
					<li><a href="/ricetta?key=${f:h(ricetta.key)}">${f:h(ricetta.recipeName)}</li>
				</ul>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">${f:h(ricetta.recipeName)}</a></h2>
				<p class="meta">Informazioni generali sulla ricetta</p>
				
				<div class="entry">
					<img src="GetImage?recipeKey=${f:h(ricetta.key)}&imageIndex=0" />
					<h3>Ingredienti</h3>
					<p>
						<c:forEach var="ingrediente" items="${ingredienti}">
							<a href="/prodotto?key=${f:h(ingrediente.key)}&fromRecipe=${f:h(ricetta.key)}">${f:h(ingrediente.productName)}</a><br />
						</c:forEach>
					</p>
					
					<h3>Descrizione</h3>
					<p>
						${f:h(ricetta.recipeDescription)}
					</p>
				</div>
			</div>
			
			<div id="navigationPattern">
					<ul>
						<c:if test="${not empty prodotto}">	
							<c:if test="${not empty precedente}">
								<li><a href="/ricetta?key=${f:h(precedente.key)}&fromProduct=${f:h(prodotto)}">Ricetta precedente: ${f:h(precedente.recipeName)}</a></li>
							</c:if>
						
							<li><a href="/ricette?fromProduct=${f:h(prodotto)}">Torna alle ricette per prodotto</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/ricetta?key=${f:h(successivo.key)}&fromProduct=${f:h(prodotto)}">Ricetta successiva: ${f:h(successivo.recipeName)}</a></li>
							</c:if>
						</c:if>
						
						<c:if test="${ empty prodotto}">	
							<c:if test="${not empty precedente}">
								<li><a href="/ricetta?key=${f:h(precedente.key)}">Ricetta precedente: ${f:h(precedente.recipeName)}</a></li>
							</c:if>
						
							<li><a href="/ricette">Torna a tutte le ricette</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/ricetta?key=${f:h(successivo.key)}">Ricetta successiva: ${f:h(successivo.recipeName)}</a></li>
							</c:if>
						</c:if>
						
					</ul>
				</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>