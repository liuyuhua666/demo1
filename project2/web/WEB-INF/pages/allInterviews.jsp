<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/30
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<c:forEach items="${sessionScope.interviewList}" var="interview">
    <c:forEach items="${sessionScope.resumeList}" var="resume">
        <c:if test="${interview.i_gid==resume.r_gid}">
            <a href=personalResume?r_id=${resume.r_id}>${resume.r_name}</a>
        </c:if>
    </c:forEach>
</c:forEach>
</body>
</html>