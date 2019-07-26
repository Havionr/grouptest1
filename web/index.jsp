<%--
  Created by IntelliJ IDEA.
  User: jarvis
  Date: 19-7-25
  Time: 下午6:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div align="middle">学生管理系统</div>

  <form action="/grouptest/admin" method="post">
    <div align="middle">
      <table>
        <tr align="middle">
          <td colspan="2">${loginMes}</td>
        </tr>
        <tr align="right">
          <td>管理员账号:</td>
          <td><input name="loginName"/></td>
        </tr>
        <tr align="right">
          <td>管理员密码:</td>
          <td><input type="password" name="loginPwd"/></td>
        </tr>
        <tr align="center">
          <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
      </table>
    </div>
  </form>
  </body>
</html>
