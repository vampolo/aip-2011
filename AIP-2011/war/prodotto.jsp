<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
      <div id="orientationInfo">
				<ul>
					<li>Prodotti</li>
					<li>Farina Biologica</li>
				</ul>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">Farina di grano teneto biologica</a></h2>
				<p class="meta">Descrizione del prodotto</p>
				Produttore: <a href="produttoreAziendaAgricolaLodigiana.html">Azienda agricola...</a>
				<img src="images-junk/farina.jpg"></img>
				<div class="entry">
					<p>Farina di grano tenero da agricoltura biologica. Ideale per la produzione di pane e dolci fatti in casa, per chi ama il gusto naturale e leggero della cucina biologica. Confezione da 500 gr</p>
				</div>
			</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>

