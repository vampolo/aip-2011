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
			<p class="meta">
				Produttore: 
					<a href="/produttore?key=${f:h(prodotto.producerRef.model.key)}&fromProduct=${f:h(prodotto.key)}">${f:h(prodotto.producerRef.model.producerName)}</a></p>
			<div class="entry">
				<img src="GetImage?productKey=${f:h(prodotto.key)}&imageIndex=0" />
				<c:if test="${not empty page && page == 'healthBenefits'}">
					<h2>Vantaggi per la salute</h2>
					<p>ciccia</p>
				</c:if>
				<c:if test="${empty page}">
					<h2>Informazioni sul prodotto</h2>
					<p>${f:h(prodotto.generalInfo)}</p>
				</c:if>
			</div>
				
				<div id="navigationPattern">
					<ul>
						<c:if test="${not empty categoria}">	
							<c:if test="${not empty precedente}">
								<li><a href="/prodotto?key=${f:h(precedente.key)}&fromCategory=${f:h(categoria)}">Prodotto precedente</a></li>
							</c:if>
						
							<li><a href="/prodotti?categoria=${f:h(categoria)}">Indice prodotti</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/prodotto?key=${f:h(successivo.key)}&fromCategory=${f:h(categoria)}">Prodotto Successivo</a></li>
							</c:if>
						</c:if>
						
						<c:if test="${not empty ricetta}">	
							<c:if test="${not empty precedente}">
								<li><a href="/prodotto?key=${f:h(precedente.key)}&fromRecipe=${f:h(ricetta)}">Prodotto precedente</a></li>
							</c:if>
						
							<li><a href="/ricetta?key=${f:h(ricetta)}&fromProduct=${f:h(prodotto.key)}">Indice prodotti</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/prodotto?key=${f:h(successivo.key)}&fromRecipe=${f:h(ricetta)}">Prodotto successivo</a></li>
							</c:if>
						</c:if>
						
						<c:if test="${not empty produttore}">	
							<c:if test="${not empty precedente}">
								<li><a href="/prodotto?key=${f:h(precedente.key)}&fromProducer=${f:h(produttore)}">Prodotto precedente</a></li>
							</c:if>
						
							<li><a href="/prodotti?fromProducer=${f:h(produttore)}">Indice prodotti</a></li>			     
							
							<c:if test="${not empty successivo}">
								<li><a href="/prodotto?key=${f:h(successivo.key)}&fromProducer=${f:h(produttore)}">Prodotto successivo</a></li>
							</c:if>
						</c:if>
					</ul>
				</div>
		</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    <ul>
				<li>
					<ul>
						<c:if test="${not empty page}">
							<c:if test="${not empty produttore}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromProducer=${f:h(produttore)}">Informazioni generali</a></li>
							</c:if>
							<c:if test="${not empty ricetta}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromRecipe=${f:h(ricetta)}">Informazioni generali</a></li>
							</c:if>
							<c:if test="${not empty categoria}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromCategory=${f:h(categoria)}">Informazioni generali</a></li>
							</c:if>
							<c:if test="${empty produttore && empty ricetta && empty categoria}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}">Informazioni generali</a></li>
							</c:if>
						</c:if>
						<c:if test="${empty page}">
							<li>Informazioni generali</li>
						</c:if>
						<c:if test="${empty page}">
							<c:if test="${not empty produttore}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromProducer=${f:h(produttore)}&page=healthBenefits">Vantaggi per la salute</a></li>
							</c:if>
							<c:if test="${not empty ricetta}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromRecipe=${f:h(ricetta)}&page=healthBenefits">Vantaggi per la salute</a></li>
							</c:if>
							<c:if test="${not empty categoria}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&fromCategory=${f:h(categoria)}&page=healthBenefits">Vantaggi per la salute</a></li>
							</c:if>
							<c:if test="${empty produttore && empty ricetta && empty categoria}">
								<li><a href="/prodotto?key=${f:h(prodotto.key)}&page=healthBenefits">Vantaggi per la salute</a></li>
							</c:if>
						</c:if>
						<c:if test="${not empty page}">
							<li>Vantaggi per la salute</li>
						</c:if>
					</ul>
				</li>
			</ul>
		<h2>Potrebbe interessarti</h2>
		<ul>
		<li><a href="/ricette?fromProduct=${f:h(prodotto.key)}">Ricette che utilizzano questo prodotto</a></li>
		</ul>
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>

