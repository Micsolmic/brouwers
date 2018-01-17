<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='v' uri='huj.com'%>
<!doctype html>
<html lang='nl'>
<head>
<title>brouwers op naam</title>
<link rel=stylesheet href=<c:url value='/styles/rules.css'/> />
</head>
<body>
<v:terug/>
<h1>Brouwerz op naam</h1>

<c:forEach items='${alfabet}' var='letter'>

<c:url var="nextUrl" value="">
        <c:param name='beginletter' value="${letter}" />
</c:url>

<a href='${nextUrl}'><span class='uppercase'>${letter}</span></a>

</c:forEach>

<ul>
<c:forEach var='brouwer' items='${metletter}'>
	<li>${brouwer.naam}(${brouwer.adres.gemeente})</li>
</c:forEach>
</ul>


</body>
</html>