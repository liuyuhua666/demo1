<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/29
  Time: 19:55
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
<form action="addRecruitment" method="post">
    公司名称：<input name="rm_cname"/><br>
    部门名称：<input name="rm_dname"/><br>
    职位名称：<input name="rm_jname"/><br>
    需求人数：<input name="rm_peopleneeded"/><br>
    职位要求：<input name="rm_requirements"/><br>
    薪资待遇：<input name="rm_money"/><br>
    工作地点：<input name="rm_workplace"/><br>
<input type="submit" value="提交"/>
</form>
</body>
</html>