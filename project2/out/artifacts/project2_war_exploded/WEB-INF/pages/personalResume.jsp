<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/30
  Time: 21:49
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
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <td colspan="5">个人简历</td>
    </tr>
    <tr>
        <td rowspan="4">个人信息</td>
        <td>姓名</td>
        <td>${sessionScope.resume.r_name}</td>
        <td>年龄</td>
        <td>${sessionScope.resume.r_age}</td>
    </tr>
    <tr>
        <td>名族</td>
        <td>${sessionScope.resume.r_ethnicity}</td>
        <td>电话</td>
        <td>${sessionScope.resume.r_phone}</td>
    </tr>
    <tr>
        <td>身高</td>
        <td>${sessionScope.resume.r_height}</td>
        <td>体重</td>
        <td>${sessionScope.resume.r_weight}</td>
    </tr>
    <tr>
        <td>毕业学校</td>
        <td>${sessionScope.resume.r_schoolofgraduation}</td>
        <td>婚姻状态</td>
        <td>${sessionScope.resume.r_marrige}</td>
    </tr>
    <tr>
        <td>地址</td>
        <td colspan="4">${sessionScope.resume.r_marrige}</td>
    </tr>
    <tr>
        <td>自我评价</td>
        <td colspan="4">${sessionScope.resume.r_selfassessment}</td>
    </tr>
    <tr>
        <td>实习经历</td>
        <td colspan="4">${sessionScope.resume.r_intership}</td>
    </tr>
    <tr>
        <td>曾获奖励</td>
        <td colspan="4">${sessionScope.resume.r_award}</td>
    </tr>
</table>
<a href=requestInterview?i_gid=${sessionScope.resume.r_gid}>邀请面试</a>
</body>
</html>