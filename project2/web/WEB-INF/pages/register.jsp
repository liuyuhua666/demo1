<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2018/1/28
  Time: 11:47
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(document).ready(function () {
            $("#n1").blur(function () {
                $.ajax({
                    url:"test1",
                    type:"post",
                    data:{g_name:$("#n1").val()},
                    success:function (data) {
                        $("#s1").val(data);
                        $("#s1").css("color","red");
                    },
                    error:function () {
                        alert("fail")
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="register" method="post">
    用户名：<input name="g_name" id="n1"><span id="s1"></span><br>
    密码：<input name="g_password"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>