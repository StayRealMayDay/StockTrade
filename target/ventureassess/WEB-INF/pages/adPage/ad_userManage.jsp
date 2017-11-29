<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
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

<script type="text/javascript"
	src="<%=basePath%>/static/adStyle/global/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>

<jsp:include page="/head.jsp" flush="true" />
</head>


<body>

	<!-- scrollToTop -->
	<!-- ================ -->
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
											class="dropdown active dropdown-toggle"
											data-toggle="dropdown">首页</a></li>
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
					<!-- <h2>成果管理</h2> -->
					<!-- 用户操作 -->
					<br> <a href="/vcevaluation/ad_addUser"
						class="btn btn-default">增加用户</a> <a href="ad_selectUsers"
						class="btn btn-default">检索用户</a>
					<!-- 用户操作 -->
					<!-- tabs start -->
					<!-- Nav tabs -->
					<ul class="nav nav-tabs" role="tablist">
						<li class="active"><a href="#htab1" role="tab"
							data-toggle="tab"><i class="fa fa-user pr-5"></i>所有用户</a></li>
						<li class=""><a href="#htab2" role="tab" data-toggle="tab"><i
								class="fa fa-user pr-5"></i>管理成果提供者</a></li>
						<li class=""><a href="#htab3" role="tab" data-toggle="tab"><i
								class="fa fa-user pr-5"></i>管理评审专家</a></li>
						<li class=""><a href="#htab4" role="tab" data-toggle="tab"><i
								class="fa fa-user pr-5"></i>项目投资人</a></li>
					</ul>
					<!-- Tab panes -->
					<div class="tab-content">

						<div class="tab-pane fade active in" id="htab1">
							<!-- <h1 class="text-center">管理所有用户</h1> -->
							<!-- <div class="space-bottom"></div> -->
							<div class="row">

								<table class="table table-hover">
									<thead>
										<tr>
											<th>用户名</th>
											<th>姓名</th>
											<th>性别</th>
											<th>密码</th>
											<th>邮箱</th>
											<th>学历</th>
											<th>用户详情</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="all" items="${allUsers}" begin="0" end="9"
											varStatus="status">
											<tr>
												<td>${all.user_name}</td>
												<td>${all.user_realname}</td>
												<c:if test="${all.user_gender==1}">
													<td>男</td>
												</c:if>
												<c:if test="${all.user_gender==2}">
													<td>女</td>
												</c:if>
												<td>${all.user_pwd}</td>
												<td>${all.user_email}</td>
												<c:if test="${all.user_edu==1}">
													<td>博士</td>
												</c:if>
												<c:if test="${all.user_edu==2}">
													<td>硕士</td>
												</c:if>
												<c:if test="${all.user_edu==3}">
													<td>本科</td>
												</c:if>
												<c:if test="${all.user_edu==4}">
													<td>本科以下</td>
												</c:if>
												<td><a
													href="/vcevaluation/ad_userInfo?user_id=${all.user_id}"
													title="查看更多">查看更多</a></td>
												<td><a title="删除用户"
													href="/vcevaluation/ad_deleteUser?user_id=${all.user_id}"
													onclick="deleteUser()"><i
														class="glyphicon glyphicon-trash"></i></a> <a title="编辑用户"
													href="/vcevaluation/ad_editUserInfo?user_id=${all.user_id}"><i
														class="glyphicon glyphicon-pencil"></i></a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<a style="float: right" href="page-services.html"
									class="btn btn-default">查看更多</a>
							</div>


						</div>
						<div class="tab-pane fade" id="htab2">
							<!-- <h1 class="text-center">管理评审专家</h1> -->
							<!-- <div class="space-bottom"></div> -->
							<div class="row">
								<table class="table table-hover">
									<thead>
										<tr>
											<th>用户名</th>
											<th>姓名</th>
											<th>性别</th>
											<th>密码</th>
											<th>邮箱</th>
											<th>成果/项目信息</th>
											<th>用户详情</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="all" items="${allUsers}" begin="0" end="9">
											<c:if test="${all.user_type==1}">
												<tr>
													<td>${all.user_name}</td>
													<td>${all.user_realname}</td>
													<c:if test="${all.user_gender==1}">
														<td>男</td>
													</c:if>
													<c:if test="${all.user_gender==2}">
														<td>女</td>
													</c:if>
													<td>${all.user_pwd}</td>
													<td>${all.user_email}</td>
													<td><button id="${all.user_id}"
															style="color: red; background: transparent; border: 0px;"
															class="btn btn-sml" data-toggle="modal"
															onclick="return getid(this.id)" data-target="#myModal">
															项目提交信息</button>
														<button id="${all.user_id}Results"
															style="color: red; background: transparent; border: 0px;"
															class="btn btn-sml" data-toggle="modal"
															onclick="return getResultsId(this.id)"
															data-target="#myModal1">成果提交信息</button></td>
													<td><a
														href="/vcevaluation/ad_userInfo?user_id=${all.user_id}">查看更多</a></td>
													<td><a title="删除用户"
														href="/vcevaluation/ad_deleteUser?user_id=${all.user_id}"
														onclick="deleteUser()"><i
															class="glyphicon glyphicon-trash"></i></a> <a title="编辑用户"
														href="/vcevaluation/ad_editUserInfo?user_id=${all.user_id}"><i
															class="glyphicon glyphicon-pencil"></i></a></td>
												</tr>
											</c:if>
										</c:forEach>
									</tbody>
								</table>


								<!-- Modal -->
								<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
									aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">
													<span aria-hidden="true">&times;</span><span
														class="sr-only">Close</span>
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
								<div class="modal fade" id="myModal1" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">
													<span aria-hidden="true">&times;</span><span
														class="sr-only">Close</span>
												</button>
												<h4 class="modal-title" id="myModalLabel">评审专家评审过的成果信息</h4>
											</div>
											<div class="modal-body">

												<input type="hidden" id="hiddenId" name="user_id" />
												<lable>评审过的成果总数：</lable>
												<lable id="ResultsNumber"></lable>
												<table class="table table-hover">
													<thead>
														<tr>
															<th>成果名称</th>
															<th>成果状态</th>
															<th>成果评分</th>
															<th>查看更多</th>
														</tr>
													</thead>
													<tbody id="listResults">


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
								<div class="modal fade" id="myModal2" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">
													<span aria-hidden="true">&times;</span><span
														class="sr-only">Close</span>
												</button>
												<h4 class="modal-title" id="myModalLabel">评审过的项目信息</h4>
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
													<tbody id="listProInfo">


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
								<div class="modal fade" id="myModal3" tabindex="-1"
									role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">
													<span aria-hidden="true">&times;</span><span
														class="sr-only">Close</span>
												</button>
												<h4 class="modal-title" id="myModalLabel">评审过的成果信息</h4>
											</div>
											<div class="modal-body">

												<input type="hidden" id="hiddenId" name="user_id" />
												<table class="table table-hover">
													<thead>
														<tr>
															<th>成果名称</th>
															<th>成果状态</th>
															<th>成果评分</th>
															<th>查看更多</th>
														</tr>
													</thead>
													<tbody id="listResInfo">


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

								<a style="float: right" href="page-services.html"
									class="btn btn-default">查看更多</a>
							</div>
							<!-- <a href="page-services.html" class="btn btn-default">Read
								more</a> -->
						</div>
						<div class="tab-pane fade" id="htab3">
							<!-- <h1 class="text-center">管理成果提供者</h1> -->
							<!-- <div class="space-bottom"></div> -->
							<div class="row">
								<table class="table table-hover">
									<thead>
										<tr>
											<th>用户名</th>
											<th>姓名</th>
											<th>性别</th>
											<th>密码</th>
											<th>邮箱</th>
											<th>提供的成果</th>
											<th>详情</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="all" items="${allUsers}">
											<c:if test="${all.user_type==0}">
												<tr>
													<td>${all.user_name}</td>
													<td>${all.user_realname}</td>
													<c:if test="${all.user_gender==1}">
														<td>男</td>
													</c:if>
													<c:if test="${all.user_gender==2}">
														<td>女</td>
													</c:if>
													<td>${all.user_pwd}</td>
													<td>${all.user_email}</td>
													<td><button id="${all.user_id}resultsInfo"
															style="color: red; background: transparent; border: 0px;"
															class="btn btn-sml" data-toggle="modal"
															onclick="return getProjectsInfoid(this.id)"
															data-target="#myModal2">评估项目信息</button>
														<button id="${all.user_id}resultsInfo"
															style="color: red; background: transparent; border: 0px;"
															class="btn btn-sml" data-toggle="modal"
															onclick="return getResultsInfoid(this.id)"
															data-target="#myModal3">评估成果信息</button>
														<br></td>
													<td><a
														href="/vcevaluation/ad_userInfo?user_id=${all.user_id}"
														title="查看更多">查看更多</a></td>
													<td><a title="删除用户"
														href="/vcevaluation/ad_deleteUser?user_id=${all.user_id}"
														onclick="deleteUser()"><i
															class="glyphicon glyphicon-trash"></i></a> <a title="编辑用户"
														href="/vcevaluation/ad_editUserInfo?user_id=${all.user_id}"><i
															class="glyphicon glyphicon-pencil"></i></a></td>
												</tr>
											</c:if>
										</c:forEach>
									</tbody>
								</table>
								<a style="float: right" href="page-services.html"
									class="btn btn-default">查看更多</a>
							</div>
							<!-- <a href="page-services.html" class="btn btn-default">Read
								more</a> -->
						</div>
						<div class="tab-pane fade" id="htab4">
							<!-- <h1 class="text-center">管理项目经理</h1> -->
							<!-- <div class="space-bottom"></div> -->
							<div class="row">
								<table class="table table-hover">
									<thead>
										<tr>
											<th>用户名</th>
											<th>姓名</th>
											<th>性别</th>
											<th>密码</th>
											<th>邮箱</th>
											<th>学历</th>
											<th>更多</th>
											<th>增删改</th>
										</tr>
									</thead>

									<%-- <tbody>
										<c:forEach var="all" items="${allUsers}">
											<c:if test="${all.user_type==0}">
												<tr>
													<td>${all.user_name}</td>
													<td>${all.user_realname}</td>
													<td>${all.user_gender}</td>
													<td>${all.user_pwd}</td>
													<td>${all.user_email}</td>
													<td>${all.user_edu}</td>
													<td><a>More</a></td>
													<td>@mdo</td>
												</tr>
											</c:if>
										</c:forEach>
									</tbody> --%>
								</table>
								<a style="float: right" href="page-services.html"
									class="btn btn-default">查看更多</a>
							</div>
							<!-- <a href="page-services.html" class="btn btn-default">Read
								more</a> -->
						</div>
					</div>
					<!-- tabs end -->

					<div class="space"></div>


				</div>
				<!-- pills end -->
				<ul class="pagination">
					<li><a href="#">«</a></li>
					<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">»</a></li>
				</ul>

			</div>


		</div>
	</div>
	</section>
	<!-- main-container end -->
	<!-- <script type="text/javascript">
	 $(document).ready(function () {
	    for(var i=1;i++;i<11){
	    	var userType = $("#"+i).attr("name");
	    	var obj = "";
	    	if(userType==1){
	    		obj="成果提供者";
	    	}else{
	    		obj="评审专家";
	    	}
	    	$("#"+i).val(obj);
	    }
	 });
	 
	</script> -->
	<script type="text/javascript">
	   function getid(id){
		   var user_id = id;
		   
						$.ajax({
							type : "GET", //type：(string)请求方式，POST或GET        
							url : 'queryProject?user_id='+user_id,//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
							success : function(jsonArray) {
								jsonObject = eval("(" + jsonArray + ")");
								jsonObjectLength = jsonObject.length;
								var str = "";
								for (var i = 0; i < jsonObjectLength; i++) {
									str += "<tr><td>" + jsonObject[i].pro_name
											+"</td><td>" +jsonObject[i].pro_flag
											+"</td><td>" +jsonObject[i].pro_evalue
											+"</td><td><a href='projectItem1?pro_id="+jsonObject[i].pro_id+"'>查看更多<a/>"+"</td></tr>";	
									var projectNumber = jsonObjectLength;        
								}                    
								$("#userProject").html(str);	
								$("#projectsNumber").html(projectNumber);
							}
						});	
						
						
						
	          }
	   //提交的成果信息
	    function getResultsId(id){
		   
		   var reg = /[a-zA-Z]/g;  
		   var user_id = id.replace(reg,"");
		  // alert(user_id);
		  // $("#hiddenId").attr("value",user_id);
						$.ajax({
							type : "GET", //type：(string)请求方式，POST或GET        
							url : 'queryResults?user_id='+user_id,//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
							success : function(jsonArray) {
								jsonObject = eval("(" + jsonArray + ")");
								//alert(jsonObject);
								jsonObjectLength = jsonObject.length;
								var str = "";
								for (var i = 0; i < jsonObjectLength; i++) {
									str += "<tr><td>" + jsonObject[i].res_name
											+"</td><td>" +jsonObject[i].res_flag
											+"</td><td>" +jsonObject[i].res_evalue
											+"</td><td><a href='projectItem1?pro_id="+jsonObject[i].res_id+"'>查看更多<a/>"+"</td></tr>";	
									var projectNumber = jsonObjectLength;        
								}                 
								$("#listResults").html(str);	
								$("#ResultsNumber").html(projectNumber);
							}
						});	
						
						
						
	          }
	   //成果管理员查看成果信息
	    function getResultsInfoid(id){
		   var reg = /[a-zA-Z]/g;  
		   var user_id = id.replace(reg,"");
		   //alert(user_id);
		  // $("#hiddenId").attr("value",user_id);
						$.ajax({
							type : "GET", //type：(string)请求方式，POST或GET        
							url : 'queryResults?user_id='+user_id,//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
							success : function(jsonArray) {
								jsonObject = eval("(" + jsonArray + ")");
								//alert(jsonObject);
								jsonObjectLength = jsonObject.length;
								var str = "";
								for (var i = 0; i < jsonObjectLength; i++) {
									str += "<tr><td>" + jsonObject[i].res_name
											+"</td><td>" +jsonObject[i].res_flag
											+"</td><td>" +jsonObject[i].res_evalue
											+"</td><td><a href='resultItem1?pro_id="+jsonObject[i].res_id+"'>查看更多<a/>"+"</td></tr>";	
									var projectNumber = jsonObjectLength;        
								}                 
								$("#listResultsInfo").html(str);	
								$("#ResultsNumber").html(projectNumber);
							}
						});	
						
						
						
	          }
	    
	    function getProjectsInfoid(id){
			   var reg = /[a-zA-Z]/g;  
			   var user_id = id.replace(reg,"");
			   //alert(user_id);
			  // $("#hiddenId").attr("value",user_id);
							$.ajax({
								type : "GET", //type：(string)请求方式，POST或GET        
								url : 'queryEvaProject?user_id='+user_id, //url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
								success : function(jsonArray) {
									jsonObject = eval("(" + jsonArray + ")");
									//alert(jsonObject);
									jsonObjectLength = jsonObject.length;
									var str = "";
									for (var i = 0; i < jsonObjectLength; i++) {
										str += "<tr><td>" + jsonObject[i].pro_name
												+"</td><td>" +jsonObject[i].pro_flag
												+"</td><td>" +jsonObject[i].pro_evalue
												+"</td><td><a href='projectItem1?pro_id="+jsonObject[i].pro_id+"'>查看更多<a/>"+"</td></tr>";	
										//var projectNumber = jsonObjectLength;        
									}                 
									$("#listProInfo").html(str);	
									//$("#ResultsNumber").html(projectNumber);
								}
							});	
							
							
							
		          }
	    
	    function getResultsInfoid(id){
			   var reg = /[a-zA-Z]/g;  
			   var user_id = id.replace(reg,"");
			   //alert(user_id);
			  // $("#hiddenId").attr("value",user_id);
							$.ajax({
								type : "GET", //type：(string)请求方式，POST或GET        
								url : 'queryEvaResult?user_id='+user_id,//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
								success : function(jsonArray) {
									jsonObject = eval("(" + jsonArray + ")");
									//alert(jsonObject);
									jsonObjectLength = jsonObject.length;
									var str = "";
									for (var i = 0; i < jsonObjectLength; i++) {
										str += "<tr><td>" + jsonObject[i].res_name
												+"</td><td>" +jsonObject[i].res_flag
												+"</td><td>" +jsonObject[i].res_evalue
												+"</td><td><a href='resultItem1?res_id="+jsonObject[i].res_id+"'>查看更多<a/>"+"</td></tr>";	
										//var projectNumber = jsonObjectLength;        
									}                 
									$("#listResInfo").html(str);	
									//$("#ResultsNumber").html(projectNumber);
								}
							});	
							
							
							
		          }
	
	    function deleteUser(){
	    	 var a=confirm("确定要删除这个用户吗？");
	    	 if(a==true)
	    	 {
	    	 /*document.write("恭喜你答对了！");*/
	    	 alert("删除成功");
	    	 begin();
	    	 }
	    	 else
	    	 {
	    	 /*document.write("你真是猪，这么简单的问题都答不对！");*/
	    	 alert("暂时不删除");
	    	 //deleteUser();
	    	 }
	    }
	</script>

	<jsp:include page="/footer1.jsp" flush="true" />

</body>
</html>
