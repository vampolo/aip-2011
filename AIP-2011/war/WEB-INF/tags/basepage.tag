<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="content" fragment="true" %>
<%@attribute name="sidebar" fragment="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="prodotti biologici, biofood" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Bio Consortium</title>
<link href="/css/style.css" rel="stylesheet" type="text/css" media="screen" />
<script src="http://code.jquery.com/jquery-1.6.1.js" type="text/javascript"></script>
<script src="/js/popupCode.js" type="text/javascript"></script>
<script src="/js/galleria/galleria-1.2.4.js"></script>
<script src="/js/galleria/themes/classic/galleria.classic.js"></script>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="/">Bio Consortium</a></h1>
			<p>Alimentazione e stile di vita sano</p>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			<li><a href="/">Home</a>			
			<li><a href="/produttori">Produttori</a></li>
			<li><a href="/prodotti">Prodotti</a></li>
			<li><a class="notImplemented" href="#">Offerte</a></li>
			<li><a href="/ricette">Ricette</a></li>
			<li><a class="notImplemented" href="#">Diete</a></li>
			<li><a href="/biologico">Cibo Biologico</a>
			<li><a href="/servizio">Il Servizo</a></li>
			<li><a href="/consorzio">Il Consorzio</a></li>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
		<div id="content">
			<jsp:invoke fragment="content"/>
			<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<jsp:invoke fragment="sidebar"/>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>
<div id="footer-content">
	<div class="column1">
		<h2>BioConsortium srl</h2>
		<p>BioConsortium è il il consorzio di produttori locali ... etc</p>
	</div>
</div>
<div id="footer">
	<p> (c) 2011 BioConsortium.com. Design by Vincenzo Ampolo, Matteo Ferroni and Tania Suarez.</p>
</div>
<!-- end #footer -->

<!-- popup code -->
<div id="popupNotImplemented">
		<a id="popupNotImplementedClose" href="#">x</a>
		<h1>Pagina non implementata!</h1>
		<p id="popupText">
			La pagina richiesta non è stata implementata. Leggere la documentazione per la lista delle pagine implementate.
		</p>
	</div>
<div id="backgroundPopup"></div>
<!-- end popup code -->

</body>
</html>
