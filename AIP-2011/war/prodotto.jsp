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
			<img src="images-junk/farina.jpg"></img>
			<div class="entry">
				<p>${f:h(prodotto.generalInfo)}</p>
			</div>
		</div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
    
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
