<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/28
  Time: 11:42
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
<a href="toMyResume">我的简历</a>
<a href="inviteInterview">面试邀请</a>
<c:forEach items="${sessionScope.recruitmentList}" var="recruitment">
    <div>
        职位名称：${recruitment.rm_jname}
        <a href=toRecruitment?rm_id=${recruitment.rm_id}>详情</a>
    </div>
</c:forEach>
</body>
</html>