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
					<li>Contatti</li>
				</ul>
	 </div>
	 <div class="post">
		<h2 class="title"><a href="#">Contatti</a></h2>
				<p class="meta">Come raggiungerci</p>
				<div class="entry">
<iframe width="425" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=milano+via+delle+colline&amp;sll=45.66812,9.159958&amp;sspn=0.012626,0.033023&amp;ie=UTF8&amp;hq=via+delle+colline&amp;hnear=Milan,+Lombardy,+Italy&amp;ll=45.666745,9.158967&amp;spn=0.012626,0.033023&amp;t=h&amp;z=14&amp;iwloc=A&amp;cid=2501817139912275096&amp;output=embed"></iframe><br /><small><a href="http://maps.google.com/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=milano+via+delle+colline&amp;sll=45.66812,9.159958&amp;sspn=0.012626,0.033023&amp;ie=UTF8&amp;hq=via+delle+colline&amp;hnear=Milan,+Lombardy,+Italy&amp;ll=45.666745,9.158967&amp;spn=0.012626,0.033023&amp;t=h&amp;z=14&amp;iwloc=A&amp;cid=2501817139912275096" style="color:#0000FF;text-align:left">View Larger Map</a></small>
<p>Bioconsortium<br/>Via delle colline 14<br/>20169 Milano<br/>Tel: 024385574<br/>Fax: 02483745<br/>Email: <a href="mailto:info@bioconsortium.com">info@bioconsortium.com</a></p>
				</div>
	 </div>
    </jsp:attribute>
    <jsp:attribute name="sidebar">
     <ul>
				<li>
					<ul>
						<li><a href="/consorzio">Informazioni generali</a></li>
						<li>Contatti</li>
					</ul>
				</li>
			</ul>
    </jsp:attribute>
    <jsp:body>
    </jsp:body>
</t:basepage>
