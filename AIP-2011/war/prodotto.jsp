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
					<li><a href="/prodotto?key=${f:h(prodotto.key)}">${f:h(prodotto.productName)}</a></li>
				</ul>
		</div>
		<div class="post">
			<h2 class="title"><a href="#">${f:h(prodotto.productName)}</a></h2>
			<p class="meta">Produttore: ${f:h(prodotto.producerRef.model.producerName)}</p>
			<img src="GetImage?productKey=${f:h(prodotto.key)}&imageIndex=0" />
			<div class="entry">
				<p>${f:h(prodotto.generalInfo)}</p>
			</div>
				
				<div id="navigationPattern">
					<ul>
						<c:if test="${not empty categoria}">	
							<c:if test="${not empty precedente}">
								<li><a href="/prodotto?key=${f:h(precedente.key)}&fromCategory=${f:h(categoria)}">Prodotto precedente: ${f:h(precedente.productName)}</a></li>
							</c:if>
						
							<li><a href="/prodotti?categoria=${f:h(categoria)}">Torna all'indice</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/prodotto?key=${f:h(successivo.key)}&fromCategory=${f:h(categoria)}">Prodotto successivo: ${f:h(successivo.productName)}</a></li>
							</c:if>
						</c:if>
						
						<c:if test="${not empty ricetta}">	
							<c:if test="${not empty precedente}">
								<li><a href="/prodotto?key=${f:h(precedente.key)}&fromRecipe=${f:h(ricetta)}">Prodotto precedente: ${f:h(precedente.productName)}</a></li>
							</c:if>
						
							<li><a href="/ricetta?key=${f:h(ricetta)}&fromProduct=${f:h(prodotto.key)}">Torna alla ricetta</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/prodotto?key=${f:h(successivo.key)}&fromRecipe=${f:h(ricetta)}">Prodotto successivo: ${f:h(successivo.productName)}</a></li>
							</c:if>
						</c:if>
					</ul>
				</div>
		</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">

    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>

