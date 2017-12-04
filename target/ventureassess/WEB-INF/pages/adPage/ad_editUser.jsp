<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="com.vcevaluation.pojo.User"
	import="com.vcevaluation.pojo.Resultprovider"
	import="com.vcevaluation.pojo.Eva_expert"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	User user = (User) request.getAttribute("user");
	Eva_expert eva_expert = (Eva_expert) request
			.getAttribute("eva_expert");
	Resultprovider resultprovider = (Resultprovider) request
			.getAttribute("resultprovider");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<title>管理员管理</title>
		<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
		<meta name="author" content="htmlcoder.me">

		<!-- Mobile Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<!-- Favicon -->
		<link rel="shortcut icon" href="images/favicon.ico">

 <jsp:include page="/head.jsp" flush="true"/> 
 <script>
	function identify() {
		user_type = $("#user_type").val();
		if (user_type == 0) {//expert
			$("#ex_info").css("display", "");
			$("#rp_info").css("display", "none");

		}
		if (user_type == 1) {//rp
			$("#ex_info").css("display", "none");
			$("#rp_info").css("display", "");
		}
	}
	/*用window.onload调用identify()*/
	window.onload = identify;//不要括号
</script>
	</head>

	<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
	<body>
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>

		<!-- page wrapper start -->
		<!-- ================ -->
		<div class="page-wrapper">

			<!-- header-top start -->
			<!-- ================ -->
			<div class="header-top">
				<div class="container">
					<div class="row">
						<div class="col-xs-2  col-sm-6">
						</div>
						<div class="col-xs-10 col-sm-6">

							<!-- header-top-second start -->
							<!-- ================ -->
							<div id="header-top-second"  class="clearfix">

								<!-- header top dropdowns start -->
								<!-- ================ -->
								<div class="header-top-dropdown">
									<div class="btn-group dropdown">
										<button type="button" class="btn dropdown-toggle" data-toggle="dropdown"><i class="fa fa-search"></i> Search</button>
										<ul class="dropdown-menu dropdown-menu-right dropdown-animation">
											<li>
												<form role="search" class="search-box">
													<div class="form-group has-feedback">
														<input type="text" class="form-control" placeholder="Search">
														<i class="fa fa-search form-control-feedback"></i>
													</div>
												</form>
											</li>
										</ul>
									</div>

								</div>
								<!--  header top dropdowns end -->

							</div>
							<!-- header-top-second end -->

						</div>
					</div>
				</div>
			</div>
			<!-- header-top end -->

			<!-- header start (remove fixed class from header in order to disable fixed navigation mode) -->
			<!-- ================ --> 
			<header class="header fixed clearfix">
				<div class="container">
					<div class="row">
						<div class="col-md-3">

							<!-- header-left start -->
							<!-- ================ -->
							<div class="header-left clearfix">

								<!-- logo -->
								<div class="logo">
									<a href="index.html"><img id="logo" src="<%= basePath%>/static/projectstyle/images/logo_red.png" alt="iDea"></a>
								</div>

								<!-- name-and-slogan -->
								<div class="site-slogan">
									风险评估指标系统后台管理
								</div>

							</div>
							<!-- header-left end -->

						</div>
						<div class="col-md-9">

							<!-- header-right start -->
							<!-- ================ -->
							<div class="header-right clearfix">

								<!-- main-navigation start -->
								<!-- ================ -->
								<div class="main-navigation animated">

									<!-- navbar start -->
									<!-- ================ -->
									<nav class="navbar navbar-default" role="navigation">
										<div class="container-fluid">

											<!-- Toggle get grouped for better mobile display -->
											<div class="navbar-header">
												<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-1">
													<span class="sr-only">Toggle navigation</span>
													<span class="icon-bar"></span>
													<span class="icon-bar"></span>
													<span class="icon-bar"></span>
												</button>
											</div>

											<!-- Collect the nav links, forms, and other content for toggling -->
											<div class="collapse navbar-collapse" id="navbar-collapse-1">
												<ul class="nav navbar-nav navbar-right">
										<li><a href="ad_login" class="dropdown active dropdown-toggle"
											>首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="#">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="#">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="#">查看项目</a></li>
												<li><a href="#">编辑项目</a></li>
												<li><a href="#">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理指标</a>
											<ul class="dropdown-menu">
												<li><a href="selectIndexFactor">增加指标</a></li>
												<li><a href="selectIndexFactor">查看指标</a></li>
												<li><a href="selectIndexFactor">编辑指标</a></li>
												<li><a href="selectIndexFactor">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">用户管理</a>
											<ul class="dropdown-menu">
												<li><a href="ad_addUser">增加用户</a></li>
												<li class="active"><a href="ad_userManage">查看用户</a></li>
												<!-- <li><a href="#">编辑用户</a></li> -->
												<li><a href="#">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看日志</a></li>
												<li class="active"><a href="#">检索日志</a></li>
											</ul></li>
									</ul>
											</div>

										</div>
									</nav>
									<!-- navbar end -->

								</div>
								<!-- main-navigation end -->

							</div>
							<!-- header-right end -->

						</div>
					</div>
				</div>
			</header>
			<!-- header end -->

			<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="#">Home</a></li>
								<li class="active">后台管理</li>
							</ol>
						</div>
					</div>
				</div>
			</div>
			<!-- page-intro end -->

			<!-- main-container start -->
			<!-- ================ -->
			<section class="main-container">

				<div class="container">
					<div class="row">

						<!-- sidebar start -->
						<jsp:include page="/ad_left.jsp" flush="true" />
						<!-- sidebar end -->

						<!-- main start -->
						<!-- ================ -->
						<div class="main col-md-8 col-md-offset-1">

							</br> </br>
			<h3 class="hdg">修改个人信息</h3>
			</br>
			<!--修改个人信息页面 Form Begin-->
			<form action="ad_editUserInfo2" id="form_userinfo"
				class="form-horizontal" method="post">
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">用户名</span> <input type="text"
						class="form-control" name="user_name"
						value="<%=user.getUser_name()%>" aria-describedby="sizing-addon1"
						style="height: 46px; width: 850px">
				</div>
				</br>

				<div>
					<!-- 获取当前用户的id -->
					<input type="hidden" id="user_id" name="user_id"
						value="<%=user.getUser_id()%>" /> <input type="hidden"
						id="user_type" name="user_type" value="<%=user.getUser_type()%>" />
				</div>

				<div>
					<input type="hidden" id="user_type" name="user_type"
						value="<%=user.getUser_type()%>" />
				</div>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">姓名&nbsp;&nbsp;&nbsp;</span>
						<input
						type="text" class="form-control" name="user_realname"
						value="<%=user.getUser_realname()%> "
						aria-describedby="sizing-addon1"
						style="height: 46px; width: 850px">  
				</div>
				</br>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">性别&nbsp;&nbsp;&nbsp;</span>
						
							<select class="form-control" id="user_gender" name="user_gender" style="height: 46px; width: 850px">
								<c:if test="<%=user.getUser_gender() == 0%>">
								<option style="text-align:center" value="未填写"  selected = "selected">未填写</option>
								<option style="text-align:center" value="男">男</option>
								<option style="text-align:center" value="女">女</option>
								</c:if>
								<c:if test="<%=user.getUser_gender() == 1%>">
								<option style="text-align:center" value="男"  selected = "selected">男</option>
								<option style="text-align:center" value="女">女</option>
								</c:if>
								<c:if test="<%=user.getUser_gender() == 2%>">
								<option style="text-align:center" value="女" selected = "selected">女</option>
								<option style="text-align:center" value="男">男</option>
								</c:if>
							</select>
						
				</div>
				</br>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">密码&nbsp;&nbsp;&nbsp;</span> <input
						type="text" class="form-control" name="user_pwd"
						value="<%=user.getUser_pwd()%>" aria-describedby="sizing-addon1"
						style="height: 46px; width: 850px"> <input type="hidden"
						value="<%=user.getUser_gender()%>" />
				</div>
				</br>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">邮箱&nbsp;&nbsp;&nbsp;</span> <input
						type="text" class="form-control" name="user_email"
						value="<%=user.getUser_email()%>"
						aria-describedby="sizing-addon1"
						style="height: 46px; width: 850px">
				</div>
				</br>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">学历&nbsp;&nbsp;&nbsp;</span>
						
							<select class="form-control" style="height: 46px; width: 850px" id="user_edu" name="user_edu">
							<c:if test="<%=user.getUser_edu() == 0%>">
							<option style="text-align:center" value="未填写"  selected = "selected">未填写</option>
							<option style="text-align:center" value="博士">博士</option>
							<option style="text-align:center" value="硕士">硕士</option>
							<option style="text-align:center" value="本科">本科</option>
							<option style="text-align:center" value="本科以下">本科以下</option>
							</c:if>
							<c:if test="<%=user.getUser_edu() == 1%>">
							<option style="text-align:center" value="博士" selected = "selected">博士</option>
							<option style="text-align:center" value="硕士">硕士</option>
							<option style="text-align:center" value="本科">本科</option>
							<option style="text-align:center" value="本科以下">本科以下</option>
							</c:if>
							<c:if test="<%=user.getUser_edu() == 2%>">
							<option style="text-align:center" value="博士" >博士</option>
							<option style="text-align:center" value="硕士" selected = "selected">硕士</option>
							<option style="text-align:center" value="本科">本科</option>
							<option style="text-align:center" value="本科以下">本科以下</option>
							</c:if>
							<c:if test="<%=user.getUser_edu() == 3%>">
							<option style="text-align:center" value="博士" >博士</option>
							<option style="text-align:center" value="硕士" >硕士</option>
							<option style="text-align:center" value="本科" selected = "selected">本科</option>
							<option style="text-align:center" value="本科以下">本科以下</option>
							</c:if>
							<c:if test="<%=user.getUser_edu() == 4%>">
							<option style="text-align:center" value="博士" >博士</option>
							<option style="text-align:center" value="硕士" >硕士</option>
							<option style="text-align:center" value="本科">本科</option>
							<option style="text-align:center" value="本科以下" selected = "selected">本科以下</option>
							</c:if>
							</select>
						</a> 
				</div>
				</br>
				<div class="input-group input-group-lg">
					<span class="input-group-addon" id="sizing-addon1"
						style="width: 110px">年龄&nbsp;&nbsp;&nbsp;</span> <input
						type="text" class="form-control" name="user_age"
						value="<%=user.getUser_age()%>" aria-describedby="sizing-addon1"
						style="height: 46px; width: 850px">
				</div>
				</br>
				<div>

					<div id="ex_info">
						<div id="ex_qf" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">级别&nbsp;&nbsp;&nbsp;</span> <input
								type="text" class="form-control" name="ex_qualification"
								value="<%=eva_expert.getEx_qualification()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
						<div id="ex_et" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">工龄&nbsp;&nbsp;&nbsp;</span> <input
								type="text" class="form-control" name="ex_expertise"
								value="<%=eva_expert.getEx_expertise()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
						<div id="ex_bf" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">业务领域&nbsp;</span> <input type="text"
								class="form-control" name="ex_businessfield"
								value="<%=eva_expert.getEx_businessfield()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
					</div>
					<div id="rp_info">
						<div id="rp_qf" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">资历&nbsp;&nbsp;&nbsp;</span> <input
								type="text" class="form-control" name="rp_qualification"
								value="<%=resultprovider.getRp_qualification()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
						<div id="rp_fd" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">研究方向&nbsp;</span> <input type="text"
								class="form-control" name="rp_field"
								value="<%=resultprovider.getRp_field()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
						<div id="rp_rs" class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"
								style="width: 110px">科研情况&nbsp;</span> <input type="text"
								class="form-control" name="rp_research"
								value="<%=resultprovider.getRp_research()%>"
								aria-describedby="sizing-addon1"
								style="height: 46px; width: 850px">
						</div>
						</br>
					</div>
					<div class="input-group input-group-lg">
						<span class="input-group-addon" id="sizing-addon1"
							style="width: 110px">简介&nbsp;&nbsp;&nbsp;</span>
						<textarea name="user_remark" id="user_remark"
							class="form-control" style="height: 200px; width: 850px"><%=user.getUser_remark()%></textarea>
					</div>
					<br>
					<div class="grid_3 grid_5">
						<h3>
							<!-- <input type="submit" value="提交"> -->
							   <a class="btn radius btn-gray" href="javascript:document:form_userinfo.submit();">提交</a>
							<a class="btn radius btn-gray" href="/vcevaluation/ad_userManage"><span 
								onclick="javascript:history.go(-1);">返回</span></a>
						</h3>
					</div>
			</form>
			<!-- END FORM-->
			<br> <br> <br>
					

						</div>
						<!-- main end -->

					</div>
				</div>
			</section>
			<!-- main-container end -->

			
<jsp:include page="/footer1.jsp" flush="true"/> 

	</body>
</html>
