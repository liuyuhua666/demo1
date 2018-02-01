<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/30
  Time: 23:21
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
<div>
    公司：${sessionScope.interview.i_cname}<br>
    面试时间：${sessionScope.interview.i_interviewtime}<br>
    面试地点：${sessionScope.interview.i_interviewaddress}<br>
    <a href=confirmeInterview?i_id=${sessionScope.interview.i_id}>确认</a>
    <a href=giveUpInterview?i_id=${sessionScope.interview.i_id}>放弃</a>
</div>
</body>
</html>