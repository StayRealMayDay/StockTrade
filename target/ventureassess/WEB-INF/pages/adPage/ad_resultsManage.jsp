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
	src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
<jsp:include page="/head.jsp" flush="true" />
</head>

<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
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
											class="dropdown active dropdown-toggle">首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="ad_resultsManage1">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="ad_resultsManage1">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="selectAllProject?pageNum=1">查看项目</a></li>
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
												<li><a href="ad_selectUsers">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看所有日志</a></li>
												<li class="active"><a href="getUserTypeLogs1">检索日志</a></li>
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
				<div class="grid_3 grid_5">

					<h3 class="hdg" style="font-family: \5FAE\8F6F\96C5\9ED1">成果管理</h3>
					<div style="text-align: center">
						
						<a href="addPaper" class="btn btn-default btn-sm" id="searchLogs">增加论文成果</a>
                        <a href="addPatent2" class="btn btn-default btn-sm" id="searchLogs">增加专利成果</a>
                        <a href="addSoftware" class="btn btn-default btn-sm" id="searchLogs">增加软件成果</a>
                        <a href="addProto" class="btn btn-default btn-sm" id="searchLogs">增加样机成果</a>
						<a  href="ad_resultsManage1" class="btn btn-default btn-sm" id="searchLogs">检索成果</a>

					</div>
					<!-- <form role="search" class="search-box">
								<div class="form-group has-feedback">
									<input type="text"  placeholder="成果搜索">
									<i class="fa fa-search "></i>
								</div>
							</form>		 -->
					<table style="width: 75%" class="table table-hover">
						<thead>
							<tr>
								<th>成果类型</th>
								<th>成果名称</th>
								<th>成果提供者</th>
								<th>成果提交时间</th>
								<th>评估状态</th>
								<th>评估均值</th>
								<!-- <th>评估截止日期</th> -->
								<th>更多</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="lar">
								<tr>
									<c:if test="${lar.res_type==1}">
										<td>论文</td>
									</c:if>
									<c:if test="${lar.res_type==2}">
										<td>专利</td>
									</c:if>
									<c:if test="${lar.res_type==3}">
										<td>软件</td>
									</c:if>
									<c:if test="${lar.res_type==4}">
										<td>样机</td>
									</c:if>
									<td>${lar.res_name}</td>
									<%-- <td>${usermap[lar.res_provider]}</td> --%>
									<td><a href="/vcevaluation/ad_userInfo?user_id=${lar.res_provider}">${usermap[lar.res_provider]}</a></td>
									<td>${ lar.res_protime}</td>
									<%-- <c:if test="${lar.res_flag==1}">
										<td>待评估</td>
									</c:if>
									<c:if test="${lar.res_flag==2}">
										<td>评估截至</td>
									</c:if> --%>
									<td>${ lar.res_evalue}</td>
									<td>${ lar.res_eva_deadline}</td>
									<td><a class=""
										href="/vcevaluation/resultItem1?res_id=${lar.res_id}">查看详情</a></td>
									<td><a onclick="deleteResults()" title="删除成果信息"
										href="/vcevaluation/deleteResults?res_id=${lar.res_id}"
										onclick="deleteUser()"><i
											class="glyphicon glyphicon-trash"></i></a> <a
										onclick="editResults()" title="编辑成果信息"
										href="/vcevaluation/editPaper?res_id=${lar.res_id}"><i
											class="glyphicon glyphicon-pencil"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<ul class="pagination" style="text-align: center;">

						<li><a href="#">共 ${pager.recordCount } 条数据，每页
								${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
								${pager.pageNum} 页</a></li>

					</ul>

					<ul class="pagination">

						<li ${pager.pageNum==1?'class="disabled"':''}><a
							href="ad_resultsAddManage?pageNum=1">首页</a></li>
						<li ${pager.pageNum==1?'class="disabled"':''}><a
							href="ad_resultsAddManage?pageNum=${pager.pageNum-1 }">上页</a></li>
						<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
							href="ad_resultsAddManage?pageNum=${pager.pageNum+1 }">下页</a></li>
						<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
							href="ad_resultsAddManage?pageNum=${pager.pageCount }">末页</a></li>
						<li><a>转到 </a></li>
						<li><a><input id="changePage" type="text"
								style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
						<li><a>页 </a></li>
						<li><a href="javascript:goPage();">跳转</a></li>

					</ul>


				</div>


			</div>
		</section>
		<!-- main-container end -->
		<script>
			function deleteResults() {
				var a = confirm("确定要删除这个成果吗？");
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

			function editResults() {
				var a = confirm("确定要编辑这个成果吗？");
				if (a == true) {
					/*document.write("恭喜你答对了！");*/
					alert("编辑成功");
					begin();
				} else {
					/*document.write("你真是猪，这么简单的问题都答不对！");*/
					alert("暂时不编辑");
				}
			}
		</script>


		<jsp:include page="/footer1.jsp" flush="true" />
	</div>
</body>
</html>
