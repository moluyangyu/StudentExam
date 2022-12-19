<%@page import="pojo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<form action="">
    学号：<input name="sno" value="${sn}">&nbsp;&nbsp;<input name="userName" value="${uname}"><input type="submit" value="查询">
</form>
<hr>
<table class="table" border='1' cellpadding='0' cellspacing='0'>
    <tr class="active">
        <td>学号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>生日</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${slist}" var="st">
        <tr class="active">
            <td>${st.sno}</td>
            <td>${st.sName}</td>
            <td>${st.sClass}</td>
            <td>${st.birthday}</td>
            <td>
                <a href="DeleteStudentServlet?sno=${st.sno}">删除</a>
                <a href="ToUpdateStudentServlet?sno=${st.sno}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>