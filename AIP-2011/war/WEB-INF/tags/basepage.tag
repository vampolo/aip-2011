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
</head>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="index.html">Bio Consortium</a></h1>
			<p>Alimentazione e stile di vita sano</p>
		</div>
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			<li><a href="index.html">Home</a>			
			<li><a href="produttori.html">Produttori</a></li>
			<li><a href="prodotti.html">Prodotti</a></li>
			<li><a href="prodotti.html">Offerte</a></li>
			<li><a href="ricette.html">Ricette</a></li>
			<li><a href="diete.html">Diete</a></li>
			<li><a href="biologico.html">Cibo Biologico</a>
			<li><a href="servizio.html">Il Servizo</a></li>
			<li><a href="consorzio.html">Il Consorzio</a></li>
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
	<p> (c) 2011 BioConsortium.com. Design by <a href="http://www.nodethirtythree.com">nodethirtythree</a> and <a href="http://www.freecsstemplates.org">Free CSS Templates</a>.</p>
</div>
<!-- end #footer -->
</body>
</html>