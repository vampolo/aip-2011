<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:basepage>
    <jsp:attribute name="content">
      <div id="orientationInfo">
				<ul>
					<li><a href="/consorzio">Il Consorzio</a></li>
					<li><a href="/consorzio">Informazioni generali</a></li>
				</ul>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">Il nostro consorzio</a></h2>
				<p class="meta">Informazioni generali</p>
				<div class="entry">
					<p>
					Siamo un gruppo di oltre 10 aziende agricole e di trasformazione che nel 2010 hanno deciso di unire forze ed esperienze associandosi in consorzio per meglio rispondere alle molteplici esigenze del mercato.
 
Gli agricoltori che con le loro piccole dimensione non riuscivano a valorizzare le proprie produzioni e la maggiore richiesta da parte del consumatore di prodotti biologici, ci hanno permesso in questi anni di acquisire una discreta importanza sul mercato nazionale.

La nostra cooperativa è un'azienda a totale conduzione biologica in conformità alla normativa comunitaria secondo il Reg. CE 834/2007 e 889/2008 e successive modifiche; inoltre l'azienda vanta le certificazioni Naturland , N.O.P. e BioSiusse . Il nostro organismo di controllo è IMC srl (Istituto mediterraneo di Certificazione).</p>
				</div>
			</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
      <ul>
				<li>
					<ul>
						<li>Informazioni generali</li>
						<li><a href="/contatti">Contatti</a></li>
					</ul>
				</li>
			</ul>
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
