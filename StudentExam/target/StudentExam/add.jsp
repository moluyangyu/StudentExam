<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%
    String name= request.getServerName();
    int prot=request.getServerPort();//获取端口号
    String ph=request.getContextPath();//获取项目根路径
    String sc=request.getScheme();
    String path=sc+"://"+name+":"+prot+ph+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=path %>">
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<form action="StudentServlet" method="post">
    学号:<input name="sno" value="${st.sno}"><br>
    姓名:<input name="userName" value="${st.sName}"><br>
    性别:男：<input type="radio" name="sex" value="1">女：<input type="radio" name="sex" value="-1" > <br>
    选课:java <input type="checkbox" name="course" value="java">
    C<input type="checkbox" name="course" value="c">
    python<input type="checkbox" name="course" value="pytho"><br>
    <input type="submit" value="提交">
</form>
<form action="QueryStudentServlet">
    <input type="submit" value="查询">
</form>

</body>
</html>