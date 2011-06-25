<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
      <div id="orientationInfo">
				<ul>
					<li><a href="/produttore">Produttori</a></li>
					<li><a href="/produttore?key=${f:h(produttore.key)}">${f:h(produttore.producerName)}</li>
					<li>Photo gallery</li>
				</ul>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">${f:h(produttore.producerName)}</a></h2>
				<p class="meta">La nostra photo gallery</p>
				
				<div class="entry">
					<h3>Gallery</h3>
					<p>
						
							<c:forEach var="image" items="${produttore.images}" varStatus="status">
								<td><img src="/GetImage?producerKey=${f:h(produttore.key)}&imageIndex=${status.index}" /></td>
							</c:forEach>	
					</p>
				</div>
				
				<div id="navigationPattern">
					<ul>
						<c:if test="${not empty prodotto}">
							<li><a href="/prodotto?key=${f:h(prodotto)}&fromProducer=${f:h(produttore.key)}">Torna al prodotto</a></li>			     
						</c:if>
						
						<c:if test="${ empty prodotto}">
							<li><a href="/produttori">Torna ai produttori</a></li>			     
						</c:if>
					</ul>
				</div>
			</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    <ul>
				<li>
					<ul>
						<li><a href="/produttore?key=${f:h(produttore.key)}">L'azienda</a></li>
						<li><a href="/produttore?key=${f:h(produttore.key)}&page=metodi">Metodi di produzione</a></li>
						<li><a href="/produttore?key=${f:h(produttore.key)}&page=info">Informazioni e contatti</a></li>
						<li>Photo Gallery</li>
					</ul>
				</li>
				<li>
					<h2><a href="/prodotti?fromProducer=${f:h(produttore.key)}">Prodotti correlati</a></h2>
				</li>
			</ul>
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
