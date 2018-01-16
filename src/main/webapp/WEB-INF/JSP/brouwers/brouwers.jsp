<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='v' uri='huj.com'%>
<!doctype html>
<html lang='nl'>
<head>
<title>brouwers</title>
<link rel=stylesheet href=<c:url value='/styles/rules.css'/> />
</head>
<body>
<v:terug/>
<h1>Brouwerz</h1>
<table>
<thead><tr><th>Nummer</th><th>Naam</th><th>Straat</th><th>HuisNummer</th><th>Postcode</th><th>Gemeente</th><th>Omzet</th></thead></tr>
<c:forEach var='brouwer' items='${allBrouwers}'>
<tr><tr><td>${brouwer.brouwerNr}</td><td>${brouwer.naam}</td><td>${brouwer.adres.straat}</td><td>${brouwer.adres.huisNr}</td><td>${brouwer.adres.postcode}</td><td>${brouwer.adres.gemeente}</td><td>${brouwer.omzet}</td></tr>

</c:forEach>



</table>



</body>
</html>