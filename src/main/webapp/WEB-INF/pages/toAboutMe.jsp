<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0032)http://beian.gov.cn/portal/index -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>关于我们</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=9">
<link href="<%= basePath%>/static/adStyle/global/css/bootstrap.css" rel="stylesheet" media="screen">
<link href="<%= basePath%>/static/adStyle/global/css/bootstrap-responsive.css" rel="stylesheet"
	media="screen">
<link href="<%= basePath%>/static/adStyle/global/css/css.css" rel="stylesheet" media="screen">
<link href="<%= basePath%>/static/adStyle/global/css/css2.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="<%= basePath%>/static/adStyle/global/css/milk.css">
<!-- 表单验证 -->

<style>
.error {
	position: absolute;
	top: 60px;
	left: 278px;
	width: 300px;
}

.error2 {
	position: absolute;
	top: 98px;
	left: 278px;
	width: 300px;
}

.error3 {
	position: absolute;
	top: 135px;
	left: 278px;
	width: 300px;
}

.inputAttr1{
    background: url(<%= basePath%>/static/adStyle/img/user.png) no-repeat 185px ;
    width: 200px;
    height: 45px;
    border-radius:5px;
    border: 1px solid #999999;
    box-shadow: 1px 1px 3px #cccccc;
    padding-left: 10px;
    margin-right: 10px;
}
.inputAttr2{
    background: url(<%= basePath%>/static/adStyle/img/password.png) no-repeat 185px ;
    width: 200px;
    height: 45px;
    border-radius:5px;
    border: 1px solid #999999;
    box-shadow: 1px 1px 3px #cccccc;
    padding-left: 10px;
    margin-right: 10px;
}

</style>

</head>
<body>
	<div class="wrapper" style="position: relative;">
		<!-- 页面头 -->

		<!-- start:头部 -->
		<div class="container container1">
			<div class="navbar-header page-scroll">
				<a class="logo">
					<h2>风险投资评估系统</h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Venture Assess Platform
				</a>
					
				<div class="logo-right index-top">
					<%-- <div class="input-append pull-right">
						<input class="span2" type="text" style="border-right: 0px;"
							placeholder="输入关键词"> <span class="add-on"><i
							class="icon-search"
							;style="background-image: url('<%= basePath%>/static/adStyle/global/img/glyphicons-halflings.png')"></i></span>
							
					</div> --%>
					<div style="font-size:15px">
					<ul class="nav nav-pills z-index">
						<li class="active"><a href="/ventureassess/Index">首页</a></li>
						<li><a href="/ventureassess/toAboutMe">关于我们</a></li>
						<!-- <li><a href="#">评估准备</a></li>
						<li><a href="#">评估实施</a></li>
						<li><a href="#">产业化项目</a></li> -->
						<li><a href="/ventureassess/enterpriseItem?enterOrder=1">创业流程</a></li>
						<li><a href="/ventureassess/toRegister">注册</a></li>
					</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="heng"
			style="background-image: url('<%= basePath%>/static/adStyle/global/img/index-heng.png')"></div>
		<!-- end:头部 -->
		<div id="over1" class="over"></div>
		<div id="layout1" class="layout">
			<img src="<%= basePath%>/static/adStyle/global/img/loading2.gif">
		</div>
		<script type="text/javascript">
        function loading() {
            document.getElementById("over").style.display = "block";
            document.getElementById("layout").style.display = "block";
        }
    </script>
					
		<!-- start:登录 -->
		<div class="z_indexk">
		
			<div class="z_adbg"
				style="height:700px;background-image: url('<%= basePath%>/static/adStyle/img/about.jpg');">
				<div class="container container1">
					<div class="z_adleft">
						<div class="xuanch"></div>
						<div class="liucheng">
							
						</div>
					</div>
					
				</div>
			</div>
			<!-- end:登录 -->
			<div id="over" class="over"></div>
			<div id="layout" class="layout">
				<img src="<%= basePath%>/static/adStyle/global/img/about2.png">
			</div>
			<div style="width:100%;margin-top:40px;margin-bottom">
					
					
			</div>


		<div class="z_footerk">
			<p class="z_gap"></p>

			<div class="z_footer">
				<p class="text-center">
					Copyright2015 SICD社会复杂数据智能处理实验室 All Rights Reserved
					<br>
					京ICP备05070602号&nbsp;&nbsp;&nbsp;
					<!--  邮编：100741 -->
					邮箱：<a href="mailto:support@beian.gov.cn">support@beian.gov.cn</a><br>
				</p>

				<div style="width: 550px; margin: 0 auto; padding: 0;">
						<p
							style="float: left; height: 20px; line-height: 20px; margin: 0px 0px 0px 5px; color: #666666;">SICD社会复杂数据智能处理实验室
							11010102002019号&nbsp;&nbsp;&nbsp;建议使用1024*768以上分辨率浏览
						</p>
				</div>

				<form id="recordform"
					action="http://beian.gov.cn/portal/registerSystemInfo"
					method="post">
					<input type="hidden" name="recordcode" value="京ICP备030173号">
				</form>
			</div>
		</div>
<script src="<%= basePath%>/static/adStyle/global/js/jquery.js"></script>
<script src="<%= basePath%>/static/adStyle/global/js/jquery-1.11.1.js"></script>
<script src="<%= basePath%>/static/adStyle/global/js/bootstrap.min.js"></script>
<script src="<%= basePath%>/static/adStyle/global/js/jquery.mockjax.js"></script>
<script src="<%= basePath%>/static/adStyle/global/js/jquery.validate.js"></script>
<script type="text/javascript" src="<%= basePath%>/static/adStyle/global/js/login.js"></script>
<script type="text/javascript" src="<%= basePath%>/static/adStyle/global/js/recordquery.js"></script>
<script type="text/javascript">
function checkNamePwd(){
	var u_name = $("#u_name").val();
	var u_pwd = $("#u_pwd").val();
	var result = false;
	$.ajax({
		async : false,
		type : 'post',
		url : 'checkUsernamePwd/?u_name='+u_name+"&u_pwd="+u_pwd,
		success : function(msg){
			if(msg == 'success'){
				result = true;
			}else{
				$("#prompt_ps").css("display","inline");
				$("#prompt_ps").css("color","red");
				$("#prompt_ps").html("用户名或密码错误！");
				$("#prompt_ps").css("font-size","16px");
				result = false;				
			}
		}
	});
	
	return result;
}
</script>

<div id="page-preloader"><span class="spinner"></span></div>

</body>
</html>