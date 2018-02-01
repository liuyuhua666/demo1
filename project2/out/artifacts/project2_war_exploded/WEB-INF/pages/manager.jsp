<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/29
  Time: 19:41
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
<c:forEach items="${sessionScope.recruitmentList}" var="recruitment">
    <div>
        公司名称：${recruitment.rm_cname}<br>
        职位名称：${recruitment.rm_jname}<br>
        需求人数：${recruitment.rm_peopleneeded}<br>
        职位要求：${recruitment.rm_requirements}<br>
        薪资待遇：${recruitment.rm_money}<br>
        工作地点：${recruitment.rm_workplace}<br>
        <a href=toUpdateRecruitment?rm_id=${recruitment.rm_id}>修改</a>
        <a href=toDeleteRecruitment?rm_id=${recruitment.rm_id}>删除</a>
    </div>
</c:forEach>
<a href="toAddRecruitment">添加招聘信息</a>
<a href="allInterviews">求职面试申请</a>
<a href="resultInterviews">面试结果</a>
</body>
</html>