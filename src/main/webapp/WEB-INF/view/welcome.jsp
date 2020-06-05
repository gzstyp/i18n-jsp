<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><spring:message code="title"/></title>
    <style type="text/css">
        a:link,a:visited,a:hover,a:active{
            text-decoration: none;
            outline:none;
        }
    </style>
</head>
<body>
<spring:message code="welcome"/>
<br/>
<br/>
<a href="javascript:;" onclick="changeLang('zh_cn')"> 中文 </a>
<a href="javascript:;" onclick="changeLang('en_us')"> English </a>
<br/>
<br/>
是目录文件夹messages下的messages文件,也就是配置文件application.properties里的spring.messages.basename=messages/messages
<script type="text/javascript">
    function changeLang(lang){
        window.location.href = "local?page=welcome&language="+lang;
    }
</script>
</body>
</html>