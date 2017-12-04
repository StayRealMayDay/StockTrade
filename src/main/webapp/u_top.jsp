<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/ventureassess/Index">
					<img src="<%= basePath%>/static/uStyle/images/logo.png" alt="" />
				</a>
			</div>
			<!--/.navbar-header-->
			<div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
				<ul class="nav navbar-nav">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">首页<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/login?pageNum=1">首页</a></li>
						</ul> 
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">创业指导<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/enterpriseItem?enterOrder=1">创业流程</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">成果产业化<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/toAddProject">创建项目信息</a></li>
							<li><a href="/ventureassess/login?pageNum=1">成果筛选</a></li>
						</ul>
						
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">发布需求<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/toPublish_req">提交发布</a></li>
							<li><a href="/ventureassess/selectReq">查看需求</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">用户中心<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/userInfo">查看个人信息</a></li>
							<li><a href="/ventureassess/toEditUserinfo">修改个人信息</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">退出<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/ventureassess/Index">退出</a></li>
						</ul>
					</li>
				</ul>
				
			</div>
			
			<div class="clearfix"></div>
		</div>
		<!--/.navbar-collapse-->
	</nav>
</body>
</html>