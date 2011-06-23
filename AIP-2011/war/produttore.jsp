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
					<li>${f:h(page)}</li>
				</ul>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">${f:h(produttore.producerName)}</a></h2>
				<p class="meta">Informazioni generali sulla nostra azienda</p>
				
				<div class="entry">
					<img src="GetImage?producerKey=${f:h(produttore.key)}&imageIndex=0" />
					<h3>Informazioni</h3>
					<p>
						${f:h(produttore.infoAzienda)}
					</p>
				</div>
			</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    <ul>
				<li>
					<ul>
						<li>L'azienda</li>
						<li><a href="/produttore?key=${f:h(produttore.key)}&page=metodi">Metodi di produzione</a></li>
						<li><a href="/produttore?key=${f:h(produttore.key)}&page=info">Informazioni pratiche</a></li>
						<li><a href="/produttore?key=${f:h(produttore.key)}&page=gallery">Photo Gallery</a></li>
					</ul>
				</li>
				<li>
					<h2><a href="#">Prodotti correlati</a></h2>
				</li>
			</ul>
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
