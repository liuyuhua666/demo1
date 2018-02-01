<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/29
  Time: 16:36
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
<fieldset>
    <legend>个人简历</legend>
    <form action="updateResume" method="post">
        姓名：<input name="r_name"/><br>
        年龄：<input type="number" min="18" name="r_age"/><br>
        名族：<input name="r_ethnicity"/><br>
        电话：<input name="r_phone"/><br>
        身高：<input name="r_height"/><br>
        体重：<input name="r_weight"/><br>
        婚姻状态：<input type="radio" name="r_marrige" value="已婚"/>已婚
        <input type="radio" name="r_marrige" value="未婚"/>未婚<br>
        地址：<input name="r_address"/><br>
        毕业学校：<input name="r_schoolofgraduation"/><br>
        自我评价：<textarea  name="r_selfassessment"></textarea><br>
        实习经历：<textarea  name="r_intership"></textarea><br>
        曾获奖励：<textarea  name="r_award"></textarea><br>
        <input type="submit" value="提交"/>
    </form>
</fieldset>
</body>
</html>