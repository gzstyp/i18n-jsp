<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="title"/></title>
</head>
<body>
<spring:message code="welcome"/>
<a href="<c:url value='language?language=zh_cn'/>">中文</a>
<a href="<c:url value='language?language=en_us'/>">English</a>
<br/>
<br/>
是目录文件夹messages下的messages文件,也就是配置文件application.properties里的spring.messages.basename=messages/messages
</body>
</html>