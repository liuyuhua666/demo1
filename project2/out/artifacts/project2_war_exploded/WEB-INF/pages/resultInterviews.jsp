<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/31
  Time: 11:16
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
    <c:forEach items="${sessionScope.guestList}" var="guest">
        <c:if test="${interview.i_gstatus==2&&interview.i_gid==guest.g_id}">
            <a href=resultInterview?i_id=${interview.i_id}>${guest.g_name}</a><br>
        </c:if>
    </c:forEach>
</c:forEach>
</body>
</html>