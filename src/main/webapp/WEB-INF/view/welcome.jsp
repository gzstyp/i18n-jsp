<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>i18n</title>
</head>
<body>
<spring:message code="welcome"></spring:message>
<a href="<c:url value='language?language=zh_cn'/>">
    中文
</a>
<a href="<c:url value='language?language=en'/>">
    English
</a>
</body>
</html>