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
				<!-- <aside class="col-md-3">
				<div class="sidebar">
					<div class="block clearfix">
						<h3 class="title">后台管理菜单</h3>
						<div class="separator"></div>
						<nav>
						<ul class="nav nav-pills nav-stacked">
							<li><a href="ad_login">统计</a></li>
							<li class="active"><a href="#">管理成果提供者</a></li>
											<li><a href="#">管理评审专家</a></li>
							<li><a href="ad_resultsManage1">管理成果</a></li>
							<li><a href="selectAllProject?pageNum=1">管理项目</a></li>
							<li><a href="selectIndexFactor">管理指标</a></li>
							<li><a href="ad_userManage">用户管理</a></li>
							<li><a href="getAllLogs1?pageNum=1">日志管理</a></li>
						</ul>
						</nav>
					</div>
				</div>
				</aside> -->
				<!-- <div class="main col-md-9" style="width: 75%;margin-top:5%">
				  <a href="#" class="btn btn-default btn-sm">项目检索</a><br>
					<h2>项目详情</h2>
                     
					
					<div class="space"></div>


				</div> -->
				<!-- pills end -->
				
				<!-- page-title end -->
				<div class="row">
                  <br>
                  <br>
                   <h1 class="page-title margin-top-clear">${pro.pro_name}</h1>

					<div class="tab-content clear-style">
						<div class="tab-pane active" id="portfolio-images">
							<img style="max-width: 360px; max-height: 222px;"
								src="<%= basePath%>/static/adStyle/img/${pro.pro_type}" alt="">
							<%-- <img src="<%= basePath%>/static/adStyle/img/${pro.pro_type}" alt=""> --%>
							<a href="<%= basePath%>/static/adStyle/img/${pro.pro_type}"
								class="popup-img overlay" title="image title"><i
								class="fa fa-search-plus"></i></a>
						</div>

					</div>
					<div class="col-md-4">
						<!-- Nav tabs -->
						<ul class="nav nav-pills white space-top" role="tablist">
							<li class="active"><a href="#portfolio-images" role="tab"
								data-toggle="tab" title="images"><i
									class="fa fa-camera pr-5"></i> logo</a></li>
						</ul>
						<!-- Tab panes -->

					</div>
					<div class="col-md-4" style="margin-top: -275px; margin-left: 10%;">
						<h3>项目简介</h3>
						<ul class="list">

							<li><strong class="vertical-divider">申请人 </strong><a
								href=" #">${user.user_name}</a></li>
							<input type="hidden" id="user_id" name="user_id"
								value="${user.user_id}" />
							<li><strong class="vertical-divider">申请时间 </strong>
								${pro.pro_protime}</li>
							<li><strong class="vertical-divider">附件 </strong>文件名 <a
								href="<%=basePath %>/downloadpro?upload_id=${pro.pro_remark}">下载</a></li>
							<li><strong class="vertical-divider">负责团队</strong><a
								href="/vcevaluation/toteamItem?team_id=${team.team_id}">${team.team_name}</a></li>
							<input type="hidden" id="team_id" name="team_id"
								value="${team.team_id}" />
							<li><strong class="vertical-divider">设备是否支持技术 </strong> <c:if
									test="${pro.pro_fit==1}">
											硬件十分先进，能支持技术
						                    </c:if> <c:if test="${pro.pro_fit==2}">
											硬件基本能支持技术
						                    </c:if> <c:if test="${pro.pro_fit==3}">
											硬件还有待改进来满足此次项目所需技术
						                    </c:if></li>
							<li><strong class="vertical-divider">企业自筹资金 </strong>${pro.pro_capital}
								万元</li>
							<li><strong class="vertical-divider">银行贷款资金 </strong>${pro.pro_bank}
								万元</li>

							<li><strong class="vertical-divider">是否有政策支持 </strong> <c:if
									test="${pro.pro_support==1}">
											是
						                    </c:if> <c:if test="${pro.pro_support==0}">
											否
						                    </c:if></li>
							<li><strong class="vertical-divider">市场现状 </strong> <c:if
									test="${pro.pro_period==1}">
											市场爆发期
						                    </c:if> <c:if test="${pro.pro_period==2}">
											市场增长期</
						                    </c:if> <c:if test="${pro.pro_period==3}">
											市场稳定期
						                    </c:if> <c:if test="${pro.pro_period==4}">
											市场衰退期或不确定
						                    </c:if></li>
							<li><strong class="vertical-divider">企业去年年收益百分比 </strong> <c:if
									test="${pro.pro_lastbenifit==0}">
											年利润为0或亏损
						                    </c:if> <c:if test="${pro.pro_lastbenifit==1}">
											1% - 10%
						                    </c:if> <c:if test="${pro.pro_lastbenifit==2}">
											10% - 20%
						                    </c:if> <c:if test="${pro.pro_lastbenifit==3}">
											20% - 30%
						                    </c:if> <c:if test="${pro.pro_lastbenifit==4}">
											30%以上
						                    </c:if></li>
						</ul>
					</div>

				</div>
				<hr>
				<div class="row">

					<%-- <c:if test="${pro.pro_flag==1}" >	
							    <%if(user.getUser_type()==0){%>
								<div class="col-md-6 col-xs-12">
									<h3>评估该项目</h3>
									<p>根据上述项目信息进行评估</p>
									<a href="/vcevaluation/toEvaluationProject?pro_id=${pro.pro_id}" class="btn btn-white margin-top-clear">开始粗糙化评估</a>
									<a href="/vcevaluation/toEvaluationProDetail?pro_id=${pro.pro_id}" class="btn btn-white margin-top-clear">精细化评估方案</a>
								</div>
								<%}%>
								</c:if> --%>

					<c:if test="${pro.pro_flag==2}">
						<div class="col-md-6 col-xs-12">
							<h2>
								<c:if test="${pro.pro_evalue>=8}">
									<li><strong class="vertical-divider">评估结果 </strong>评估通过<i
										class="fa fa-check"></i></li>
								</c:if>
								<c:if test="${pro.pro_evalue<8}">
									<li><strong class="vertical-divider">评估结果</strong>评估未通过<i
										class="fa fa-close"></i></a></li>
								</c:if>
							</h2>
						</div>
					</c:if>

				</div>
				<div class="row">
				
				<div class="col-md-4">
				<h3>项目团队</h3>
				<table class="table table-bordered table-striped">
                    <thead>
                      <th>团队名称</th>
                       <th>团队成员</th>
                        <th>团队职位</th>
                    </thead>
                 </table>
                  </div>
				<div class="col-md-6">
				<h3>政策支持</h3>
				<table class="table table-bordered table-striped">
                    <thead>
                     <th>支持项目名称</th>
                      <th>支持方式</th>
                       <th>支持级别</th>
                        <th>支持类别</th>
                        <th>支持金额</th>
                    </thead>
                 </table>
                  </div>
				 
					<div class="col-md-3 col-xs-6">
						<h3>评估信息</h3>
						<ul class="list">
							<c:if test="${pro.pro_flag==1}">
								<li><strong class="vertical-divider">评估状态</strong>待评估</li>
							</c:if>
							<c:if test="${pro.pro_flag==2}">
								<li><strong class="vertical-divider">评估状态</strong>评估截至</li>
							</c:if>
							<li><strong class="vertical-divider">评估截止时间</strong>${pro.pro_eva_deadline}</li>
							<li><strong class="vertical-divider">评估次数 </strong>
								${pro.pro_times}</li>
							<li><strong class="vertical-divider">评估均值</strong>${pro.pro_evalue}</li>


						</ul>
					</div>
				
				</div>
				<div class="row">
					<div class="col-md-4">
						<h3>项目计划</h3>
						<div class="separator-2"></div>
						<p>${pro.pro_plan}</p>

					</div>
					<div class="col-md-4">
						<h3>项目方案</h3>
						<div class="separator-2"></div>
						<p>${pro.pro_scheme}</p>

					</div>
				</div>
			</div>


		</div>
	</div>
	</div>
	</section>
	<!-- main-container end -->


	<jsp:include page="/footer1.jsp" flush="true" />

</body>
</html>
