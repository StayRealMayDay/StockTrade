<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>管理员管理</title>
<meta name="description"
	content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Favicon -->
<link rel="shortcut icon" href="images/favicon.ico">
<jsp:include page="/head.jsp" flush="true" />
</head>
<body>
	<div class="scrollToTop">
		<i class="icon-up-open-big"></i>
	</div>

	<!-- page wrapper start -->
	<!-- ================ -->
	<div class="page-wrapper">

		<!-- header-top start -->
		<!-- ================ -->
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-xs-2  col-sm-6"></div>
					<div class="col-xs-10 col-sm-6">

						<!-- header-top-second start -->
						<!-- ================ -->
						<div id="header-top-second" class="clearfix">

							<!-- header top dropdowns start -->
							<!-- ================ -->
							<div class="header-top-dropdown">
								<div class="btn-group dropdown">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<i class="fa fa-search"></i> Search
									</button>
									<ul
										class="dropdown-menu dropdown-menu-right dropdown-animation">
										<li>
											<form role="search" class="search-box">
												<div class="form-group has-feedback">
													<input type="text" class="form-control"
														placeholder="Search"> <i
														class="fa fa-search form-control-feedback"></i>
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
							<a href="index.html"><img id="logo"
								src="<%=basePath%>/static/projectstyle/images/logo_red.png"
								alt="iDea"></a>
						</div>

						<!-- name-and-slogan -->
						<div class="site-slogan">风险评估指标系统后台管理</div>

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
									<button type="button" class="navbar-toggle"
										data-toggle="collapse" data-target="#navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span> <span
											class="icon-bar"></span> <span class="icon-bar"></span> <span
											class="icon-bar"></span>
									</button>
								</div>

								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse" id="navbar-collapse-1">
									<ul class="nav navbar-nav navbar-right">
										<li><a href="ad_login"
											class="dropdown active dropdown-toggle">首页</a></li>
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
							<li><i class="fa fa-home pr-10"></i><a href="index.html">Home</a></li>
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

		<div class="container" style="margin-top: -55px;">
			<div class="row">
				<jsp:include page="/ad_left.jsp" flush="true" />
				<div class="main col-md-9" style="width: 75%">
					<!-- <h2>日志管理</h2> -->
					<br> <br> <label>按照用户角色类型：</label> <select
						name="jumpMenu" id="user_type">
						<option value="超级管理员">超级管理员</option>
						<option value="成果提供者">成果提供者</option>
						<option value="评审专家">评审专家</option>
					</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label>按照用户学历：</label>
					<select name="jumpMenu" id="user_edu">
						<!-- <option value="所有学历">所有学历</option> -->
						<option value="博士">博士</option>
						<option value="硕士">硕士</option>
						<option value="本科">本科</option>
						<option value="本科以下">本科以下</option>
					</select> <br> <label>按照用户登录名称：</label> <input id="user_name"
						type="text" placeholder="Search"> <label>按照用户真实姓名：</label>
					<input id="user_realname" type="text" placeholder="Search">
					<button class="btn btn-default btn-sm" id="searchLogs">搜索</button>
					<br>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>用户名</th>
								<th>姓名</th>
								<th>性别</th>
								<th>密码</th>
								<th>邮箱</th>
								<th>成果/项目信息</th>
								<th>详情</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody id="tbody">

						</tbody>
					</table>
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">
										<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
									</button>
									<h4 class="modal-title" id="myModalLabel">评审专家评审过的项目信息</h4>
								</div>
								<div class="modal-body">

									<input type="hidden" id="hiddenId" name="user_id" />
									<table class="table table-hover">
										<thead>
											<tr>
												<th>项目名称</th>
												<th>项目状态</th>
												<th>项目评分</th>
												<th>查看更多</th>
											</tr>
										</thead>
										<tbody id="userProject">


										</tbody>
									</table>

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-sm btn-dark"
										data-dismiss="modal">关闭</button>
									<button type="button" class="btn btn-sm btn-default">保存</button>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- pills end -->

			</div>


		</div>
	</div>
	</section>
	<!-- main-container end -->


	<jsp:include page="/footer1.jsp" flush="true" />
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/global/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#searchLogs")
					.click(
							function() {
								var user_type = $('#user_type option:selected')
										.val();
								if (user_type == "成果提供者") {
									var user_type = 1;
								} else if (user_type == "评审专家") {
									var user_type = 0;
								} else {
									var user_type = 2;
								}
								//alert(user_type);
								var user_edu = $('#user_edu option:selected')
										.val();
								if (user_edu == "博士") {
									user_edu = 1;
								} else if (user_edu == "硕士") {
									user_edu = 2;
								} else if (user_edu == "本科") {
									user_edu = 3;
								} else {
									user_edu = 4;
								}
								//alert(user_edu);
								//var reg = /[a-zA-Z]/g;
								var user_name = $('#user_name').val();
								//alert(user_name);
								var user_realname = $('#user_realname').val();
								//alert(user_realname);
								$
										.ajax({
											type : "GET", //type：(string)请求方式，POST或GET        
											url : "ad_selectUsers1",//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
											data : {
												user_type : user_type,
												user_edu : user_edu,
												user_name : user_name,
												user_realname : user_realname
											},
											success : function(jsonArray) {
												jsonObject = eval("("
														+ jsonArray + ")");
												//alert(jsonObject);
												jsonObjectLength = jsonObject.length;
												var str = "";
												var str1 = "";
												var str2 = "";
												for (var i = 0; i < jsonObjectLength; i++) {
													str += "<tr><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_name
															+ "</td><td>"
															+ jsonObject[i].user_realname
															+ "</td><td>"
															+ jsonObject[i].user_gender
															+ "</td><td>"
															+ jsonObject[i].user_pwd
															+ "</td><td>"
															+ jsonObject[i].user_email
															+ "<td><button style='color: red; background: transparent; border: 0px;' class='btn btn-sml' data-target='#myModal' data-toggle='modal'>点击查看"
															+ "</button></td>"
															//href="/vcevaluation/ad_userInfo?user_id=${all.user_id}"
															+ "<td><a href='/vcevaluation/ad_userInfo?user_id="+jsonObject[i].user_id+"'>"
															+ "用户详情</a></td>"
															+ "</td><td><a id='deleteUsers' title='删除用户' href='ad_deleteUser?user_id="
															+ jsonObject[i].user_id
															+ "' onclick='deleteUser()'><i class='glyphicon glyphicon-trash'></i></a>"
															+ "&nbsp<a id='editUsers' title='编辑用户' href='/vcevaluation/ad_editUserInfo?user_id="
															+ jsonObject[i].user_id
															+ "'><i class='glyphicon glyphicon-pencil'></i></a>"
															+ "</a></td></tr>";
													str1 += "<tr><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_name
															+ "</td><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_realname
															+ "</td><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_gender
															+ "</td><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_pwd
															+ "</td><td style=' text-align:center; vertical-align:middle'>"
															+ jsonObject[i].user_email
															+ "<td style=' text-align:center; vertical-align:middle'><button style='color: red; background: transparent; border: 0px;' class='btn btn-sml' data-target='#myModal' data-toggle='modal'>项目信息"
															+ "</button><button style='color: red; background: transparent; border: 0px;' class='btn btn-sml' data-target='#myModal' data-toggle='modal'>成果信息</button></td>"
															+ "<td style=' text-align:center; vertical-align:middle'><a href='/vcevaluation/ad_userInfo?user_id="+jsonObject[i].user_id+"'>"
															+ "用户详情</a></td>"
															+ "</td><td style=' text-align:center; vertical-align:middle'><a id='deleteUsers' title='删除用户' href='ad_deleteUser?user_id="
															+ jsonObject[i].user_id
															+ "' onclick='deleteUser()'><i class='glyphicon glyphicon-trash'></i></a>"
															+ "&nbsp<a id='editUsers' title='编辑用户' href='/vcevaluation/ad_editUserInfo?user_id="
															+ jsonObject[i].user_id
															+ "'><i class='glyphicon glyphicon-pencil'></i></a>"
															+ "</a></td></tr>";

													str2 += "<tr><td>"
															+ jsonObject[i].user_name
															+ "</td><td>"
															+ jsonObject[i].user_realname
															+ "</td><td>"
															+ jsonObject[i].user_gender
															+ "</td><td>"
															+ jsonObject[i].user_pwd
															+ "</td><td>"
															+ jsonObject[i].user_email
															+ "</td><td><a href='/vcevaluation/ad_userInfo?user_id="+jsonObject[i].user_id+"'>点击查看</a>"
															+ "</td><td><a href='"+111+"'>"
															+ "用户详情</a></td>"
															+ "</td><td><a id='deleteUsers' title='删除用户' href='ad_deleteUser?user_id="
															+ jsonObject[i].user_id
															+ "' onclick='deleteUser()'><i class='glyphicon glyphicon-trash'></i></a>"
															+ "&nbsp<a id='editUsers' title='编辑用户' href='/vcevaluation/ad_editUserInfo?user_id="
															+ jsonObject[i].user_id
															+ "'><i class='glyphicon glyphicon-pencil'></i></a>"
															+ "</a></td></tr>";

												}
												var user_type = $(
														'#user_type option:selected')
														.val();
												if (user_type == "成果提供者") {
													$("#tbody").html(str);
												} else if (user_type == "评审专家") {
													$("#tbody").html(str1);
												} else {
													$("#tbody").html(str2);
												}

											}
										});
							});
		});

		function deleteUser() {
			var a = confirm("确定要删除这个用户吗？");
			if (a == true) {
				/*document.write("恭喜你答对了！");*/
				alert("删除成功");
				begin();
			} else {
				/*document.write("你真是猪，这么简单的问题都答不对！");*/
				alert("暂时不删除");
				//deleteUser();
			}
		}
	</script>
</body>
</html>
