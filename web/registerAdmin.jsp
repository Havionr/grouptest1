<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 19-7-25
  Time: 下午7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/grouptest/AddAdminServlet" method="post">
    <table align="center">
        <tr><td>${mess}</td></tr>
        <tr><td>用户名<input name="username"></td></tr>
        <tr><td>密码<input type="password" name="password">
        </td>
        </tr>
        <tr><td><input type="submit" value="提交">
        </td>
        <td><form action="admin.jsp">
            <input type="submit" value="返回">
        </form></td></tr>
    </table>
    </form>

</body>
</html>
