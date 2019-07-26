<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 19-7-25
  Time: 下午7:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="registerAdmin.jsp">
        <input type="submit" value="添加管理员账号">
    </form>
    <div align="left">
        ${adminName}
        <form action="/grouptest/return" method="post">
            <input type="submit" value="登出">
        </form>
    </div>
</body>
</html>
