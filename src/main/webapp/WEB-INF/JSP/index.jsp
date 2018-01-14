<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='v' uri='huj.com'%>
<!doctype html>
<html lang='nl'>
<head>
<title>Brouwers Welkom</title>
<link rel=stylesheet href=<c:url value='/styles/rules.css'/> />
</head>
<body>
<h1>Brouwers beginpagina</h1>
<blockquote>Iets over brouwers</blockquote>
<ul>
<li><a href=<c:url value='brouwers'/>>brouwers</a></li>
<li><a href=<c:url value='brouwers/beginnaam'/>>brouwers op naam</a></li>
<li><a href=<c:url value='brouwers/toevoegen'/>>brouwers toevoegen</a></li>


</ul>

</body>
</html>