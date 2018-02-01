<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/30
  Time: 15:51
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
公司名称：${sessionScope.recruitment.rm_cname}<br>
职位名称：${sessionScope.recruitment.rm_jname}<br>
需求人数：${sessionScope.recruitment.rm_peopleneeded}<br>
职位要求：${sessionScope.recruitment.rm_requirements}<br>
薪资待遇：${sessionScope.recruitment.rm_money}<br>
工作地点：${sessionScope.recruitment.rm_workplace}<br>
<a href=acceptRecruitment?i_rmid=${sessionScope.recruitment.rm_id}>申请该职位</a>
</body>
</html>