<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/30
  Time: 22:23
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
<form action="toRequestInterview" method="post">
    面试公司：<input name="i_cname"/><br>
    面试时间：<input name="i_interviewtime"/><br>
    面试地点：<input name="i_interviewaddress"/><br>
    <input type="hidden" name="i_id" value="${sessionScope.interview.i_id}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>