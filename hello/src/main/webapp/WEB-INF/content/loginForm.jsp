<%--
  Created by IntelliJ IDEA.
  User: wxh
  Date: 2021/7/20
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3><br/>
<form action="login" method="post">
    <table>
        <tr>
            <td><label>登录名： </label></td>
            <td><input type="text" id="loginname" name="loginname" ></td>
        </tr>
        <tr>
            <td><label>密码： </label></td>
            <td><input type="password" id="password" name="password" ></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
