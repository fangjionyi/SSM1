<%--
  Created by IntelliJ IDEA.
  User: fangjiongyu
  Date: 2018/9/8
  Time: 3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<% request.getContextPath();%>/user/insert.do" method="post">

    <table border="1px">

        <tr>
            <td>學號：</td>
            <td>
                <input type="number" name="userId"/>
            </td>
        </tr>

        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name="userAccount"/>
            </td>
        </tr>

        <tr>
            <td>密碼：</td>
            <td>
                <input type="text" name="userPassword"/>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
