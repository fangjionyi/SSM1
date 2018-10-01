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

<form action="<% request.getContextPath();%>/stu/insert.do" method="post">

    <table border="1px">

        <tr>
            <td>學號：</td>
            <td>
                <input type="number" name="stuId"/>
            </td>
        </tr>

        <tr>
            <td>姓名：</td>
            <td>
                <input type="text" name="stuName"/>
            </td>
        </tr>

        <tr>
            <td>性別：</td>
            <td>
                <input type="text" name="stuSex"/>
            </td>
        </tr>
        <tr>
            <td>年齡：</td>
            <td>
                <input type="number" name="stuAge"/>
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
