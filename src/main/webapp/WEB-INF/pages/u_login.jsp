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

<title>风险投资评估系统</title>
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
				style="height:700px;background-image: url('<%= basePath%>/static/adStyle/img/adbg.png');">
				<div class="container container1">
					<div class="z_adleft">
						<div class="xuanch"></div>
						<div class="liucheng">
							<img src="<%= basePath%>/static/adStyle/global/img/liucheng.png">
						</div>
					</div>
					<!-- start:登录框 -->
					<div class="loginbg" style="position: relative; width: 430px;height:300px">
						<!-- start:tab页 -->
						<ul class="nav nav-tabs login_tab" id="myTab"
							style="margin-top: -16px;">
							<li class="active"><a
								href="http://beian.gov.cn/portal/index#ptyh" data-toggle="tab">SIGN  IN</a>
							</li>
							<!--  <li><a href="#jrs" data-toggle="tab">接入商登录</a></li> -->
						</ul>
						<!-- start:tab页 -->
						<!-- start:tab页内容 -->
						<div id="myTabContent" class="tab-content tab_tablek" >
							<form role="form" action="login?pageNum=1" method="post" class="login-form" onsubmit="return checkNamePwd();">								
								<div class="tab-pane fade active in" id="ptyh">
									<ul class="unstyled controls logink">
										<li class="row-fluid">
										<p></p>
										<br>
											<label id="laccount" for="account" class=" text-right z_color" style="margin-left: 50px;">UserName:</label>&nbsp; 
											<!-- <div class="div-bor">
											<i class="icon-user"></i> -->
											
											<input class="inputAttr1" type="text" name="u_name" id="u_name" style="width: 200px;" for="reservation" placeholder="请输入邮箱/用户名">
											<!-- </div> -->
											<label id="prompt_name" style="font-size:9px;display:none;"></label>
										</li>
										
										<p></p>
										<li class="row-fluid">
											<label id="lpwd" for="pwd" class="text-right z_color" style="margin-left: 50px;">Password:</label>&nbsp; 
											<input class="inputAttr2" type="password" name="u_pwd" id="u_pwd" style="width: 200px; for="reservation" placeholder="请输入密码"">
											<label id="prompt_ps" style="font-size:9px;display:none;width: 200px;margin-left: 80px;"></label>
										
										</li>
									<br>
										<li class="row-fluid" style="margin-top: 5px;">
											
											<input type="hidden" value="" name="zz" id="zz">
											<button href="javascript:void(0)"
												class="btn btn-danger btn-large"
												style="width: 250px; margin-left: 80px;" id="btn"
												onclick="submit">Login In</button>
										</li>
										<br>
											<label class="text-left z_color "
												style="width: 200px;margin-left:13%;margin-left: 90px;">Is Member？<a
												href="/ventureassess/toRegister"><font  color="red">Please Register</font></a></label>
									</ul>
								</div>
							</form>
							<div class="tab-pane fade" id="jrs"></div>
						</div>
						<!-- end:tab页内容 -->
					</div>
					<!-- end:登录框 -->
				</div>
			</div>
			<!-- end:登录 -->
			<div id="over" class="over"></div>
			<div id="layout" class="layout">
				<img src="<%= basePath%>/static/adStyle/global/img/loading2.gif">
			</div>
			<div style="width:100%;height:200px;margin-top:40px;margin-bottom">
				<span>
					<div style="text-align:center;">
					<p><font size="6px">“你的今天取决于你昨天的决策，你的明天取决于你</font></p><br>
					<p><font size="6px">今天的决策。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;”</font></p>
					<p><font size="5px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;————巴菲特</font></p>
					</div>
				</span>
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