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
					<img src="images-junk/aziendaAgricolaLodigiana.jpg"></img>
					<p>
					<h3>Profilo Storico</h3>
Nata da una famiglia di agricoltori, che per un secolo hanno tramandato la loro esperienza di coltivatori, L'Azienda Agricola Lodigiana è divenuta anche trasformatrice e distributrice dei suoi prodotti, mantenendo gli antichi e rigidi criteri di lavorazione.

Abbiamo fatto della qualità il nostro obbiettivo, miscelando la tradizione e la tecnologia, creando un equilibrio in cui l'opera preziosa ed insostituibile dell'uomo è supportata dall'uso di macchinari tecnologicamente avanzati e tesa al rispetto dell’ambiente.

Dalla nostra grande passione per la qualità, la nostra Azienda, oltre ad avere una vasta gamma di varietà tipiche di riso, propone anche una linea di risotti pronti in diversi gusti, farine, grissini, biscotti e miele.

<h3>La filosofia della qualita</h3>
L’Azienda Agricola Lodigiana si propone di rispondere ad un insieme sempre più complesso di bisogni e aspettative del cliente.

Sono analizzati e curati tutti i processi produttivi, iniziando dall’acquisto del seme alla coltivazione, dalla trasformazione al confezionamento fino al Consumantore finale. 
					</p>
				</div>
			</div>
			<div id="groupLinks">
				<ul>
					<li><a href="prodottoRisoCarnaroli.html">Torna al prodotto</a></li>
				</ul>
			</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    <ul>
				<li>
					<ul>
						<li>L'azienda</li>
						<li><a href="produttoreAziendaAgricolaLodigianaMetodi.html">Metodi di produzione</a></li>
						<li><a href="produttoreAziendaAgricolaLodigianaInfoPratiche.html">Informazioni pratiche</a></li>
						<li><a href="produttoreAziendaAgricolaLodigianaPhoto.html">Photo Gallery</a></li>
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
