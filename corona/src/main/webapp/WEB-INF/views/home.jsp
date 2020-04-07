<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<c:forEach items="${ notice }" var="nList">
${ nList.noticeNo } | ${ nList.noticeTitle } | ${ nList.noticeContent } | ${ nList.noticeRegDate } | ${ nList.noticeWriter }
<br>
</c:forEach> 


</body>
</html>
