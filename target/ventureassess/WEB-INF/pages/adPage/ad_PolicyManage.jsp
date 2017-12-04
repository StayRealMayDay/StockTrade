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
				<!-- ================ -->
				<div class="main col-md-8 col-md-offset-1">

					<div class="row">
						<div class="space-bottom"></div>
						<div class="span9" style="min-height: 400px;">
							<div class="space-bottom"></div>
							<div style="text-align: center">
								<h2>政策支持管理</h2>
							</div>
							<table class="table table-bordered table-striped">
								<tr>
									<th>选择</th>
									<th>支持编号</th>
									<th>支持方式</th>
									<th>支持级别</th>
									<th>支持类别</th>
								</tr>
								<c:forEach items="${psList}" var="ps">
									<tr>
										<td><input type="radio" name="ids"></td>
										<td>${ps.ps_id }</td>
										<td>${ps.ps_way }</td>
										<td>${ps.ps_rank }</td>
										<td>${ps.ps_category }</td>
									</tr>
								</c:forEach>
							</table>
							<ul class="pagination" style="text-align: center;">

								<li><a href="#">共 ${pager.recordCount } 条数据，每页
										${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
										${pager.pageNum } 页</a></li>
								<input type="hidden" id="pagenum" value="${pager.pageNum}">
							</ul>

							<ul class="pagination">

								<li ${pager.pageNum==1?'class="disabled"':''}><a
									href="ad_toAddpolicy?pageNum=1">首页</a></li>
								<li ${pager.pageNum==1?'class="disabled"':''}><a
									href="ad_toAddpolicy?pageNum=${pager.pageNum-1}">上页</a></li>
								<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
									href="ad_toAddpolicy?pageNum=${pager.pageNum+1}">下页</a></li>
								<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
									href="ad_toAddpolicy?pageNum=${pager.pageCount}">末页</a></li>
								<li><a>转到 </a></li>
								<li><a><input id="changePage" type="text"
										style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
								<li><a>页 </a></li>
								<li><a href="javascript:goPage();">跳转</a></li>

							</ul>
							<div class="space-bottom"></div>

							<form id="form1" class="form-horizontal" name="form1"
								method="post" action="">
								<div class="form-group">
									<label class="col-sm-2 control-label">支持编号</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="ps_id"
											id="ps_id" readonly>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">支持方式</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="ps_way"
											id="ps_way" placeholder="请输入支持方式...">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">支持级别</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="ps_rank"
											id="ps_rank" placeholder="请输入支持级别...">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">支持类别</label>
									<div class="col-sm-8">
										<input type="text" class="form-control" name="ps_category"
											id="ps_category" placeholder="请输入支持类别...">
									</div>
								</div>

								<div style="text-align: center">
									<input type="button" name="button" id="insertBtn" value="增加"
										class="btn btn-primary"> <input type="button"
										name="button2" id="updateBtn" value="修改"
										class="btn btn-primary" disabled> <input type="button"
										name="button3" id="deleteBtn" value="删除"
										class="btn btn-primary" disabled> <input type="button"
										name="button4" id="clearBtn" value="清空"
										class="btn btn-primary">
								</div>
							</form>

						</div>
					</div>




				</div>
				<!-- main end -->

			</div>

		</div>
		</section>
		</div>
		<!-- main-container end -->


		<jsp:include page="/footer1.jsp" flush="true" />
		<script type="text/javascript">
	$(document).ready(function(e) {
		var pagenum = $('#pagenum').val();
		/* alert(pagenum) */
		//增加数据
		$('#insertBtn').click(function(e) {
			$('#form1').attr('action', 'ad_addpolicy?pageNum=' + pagenum);
			$('#form1').submit();
		});

		//修改数据
		$('#updateBtn').click(function(e) {
			$('#form1').attr('action', 'ad_updatepolicy?pageNum=' + pagenum);
			$('#form1').submit();
		});

		//删除数据
		$('#deleteBtn').click(function(e) {
			$('#form1').attr('action', 'ad_deletepolicy?pageNum=' + pagenum);
			$('#form1').submit();
		});

		//清空表单
		$('#clearBtn').click(function(e) {
			$('#ps_id').val('');
			$('#ps_way').val('');
			$('#ps_rank').val('');
			$('#ps_category').val('');
			$('input[name="ids"]').prop('checked', false);

			$('#updateBtn').prop('disabled', true);
			$('#deleteBtn').prop('disabled', true);
		});

		//选择单选设置表单数据
		$('input[name="ids"]').click(function(e) {
			/* alert(111); */
			var psId = $(this).parent().parent().find('td').eq(1).text();
			var psWay = $(this).parent().parent().find('td').eq(2).text();
			var psRank = $(this).parent().parent().find('td').eq(3).text();
			var psCategory = $(this).parent().parent().find('td').eq(4).text();

			$('#ps_id').val($.trim(psId));
			$('#ps_way').val($.trim(psWay));
			$('#ps_rank').val($.trim(psRank));
			$('#ps_category').val($.trim(psCategory));
			$('#updateBtn').prop('disabled', false);
			$('#deleteBtn').prop('disabled', false);
		});

	});
</script>
</body>
</html>
