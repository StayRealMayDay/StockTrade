<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.stock.pojo.User"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户详情页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' /><!-- 
<link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<style type="text/css">
.headings p {
    color: #353333;
    font-size: 1em;
    line-height: 2em;
}
</style>
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>


<div class="container">
    <article class="headings">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <div style="text-align:center">
    <h1>${user.userRealname}</h1>
    <p>&nbsp;</p>
         <h5><b>学历：</b> ${user.userEdu}&nbsp;&nbsp;&nbsp;&nbsp;<b>研究方向：</b>${user.userResearch}</h5>
    </div>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
	
		<p><b>用户名：</b>${user.userName}</p>
		<p><b>年龄：</b>${user.userAge}</p>
		<p><b>性别：</b>${user.userGender}</p>
		<p><b>email：</b>${user.userEmail}</p>
		<p><b>角色：</b>${user.userFlag}</p>
		<p><b>所在企业：</b>${user.userCompany}</p>
		<p><b>工作年限：</b>${user.userWorkyear}</p>
		<p><b>所属领域：</b>${user.userArea}</p>
		<p><b>工作资历：</b>${user.userSeniority}</p>
		<p><b>研究方向：</b>${user.userResearch}</p>
		<p><b>科研成果：</b>${user.userScientific}</p>
		<p><b>所获奖项：</b>${user.userPrice}</p>
		<p><b>自我介绍：</b>${user.userBrief}</p>
		<p><b>注册时间：</b>${user.userRegistTime}</p>
		
	<p>&nbsp;</p>
	<p>&nbsp;</p>
 </article>
</div>    

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>
</body>
</html>	