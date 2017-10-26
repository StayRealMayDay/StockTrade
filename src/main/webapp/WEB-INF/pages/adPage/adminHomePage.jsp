<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.stock.pojo.User" import="java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	User user = (User) request.getSession().getAttribute("user");
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>【后台管理】-股票交易平台</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/themes/default.css"
	id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/responsive.css">
<link
	href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- ANIMATE -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/animatecss/animate.min.css" />
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- TODO -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/jquery-todo/css/styles.css" />
<!-- FULL CALENDAR -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/fullcalendar/fullcalendar.min.css" />
<!-- GRITTER -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/gritter/css/jquery.gritter.css" />
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<!-- HEADER -->
	<jsp:include page="/ad_header.jsp" flush="true" />
	<!--/HEADER -->
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">股票交易平台-后台管理</a>
	</div>
	<!-- PAGE -->
	<section id="page">
		<!-- SIDEBAR -->
		<jsp:include page="/ad_left.jsp" flush="true" />
		<!-- /SIDEBAR -->
		<div id="main-content">
			<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="modal fade" id="box-config" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title">Box Settings</h4>
						</div>
						<div class="modal-body">Here goes box setting content.</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
			<!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="container">
				<div class="row">
					<div id="content" class="col-lg-12">
						<!-- PAGE HEADER-->
						<div class="row">
							<div class="col-sm-12">
								<div class="page-header">
									<!-- STYLER -->

									<!-- /STYLER -->
									<!-- BREADCRUMBS -->
									<ul class="breadcrumb">
										<li><i class="fa fa-home"></i> <a href="index.html">Home</a>
										</li>
										<li>系统信息统计</li>
									</ul>
									<!-- /BREADCRUMBS -->
									<div class="clearfix">
										<h3 class="content-title pull-left">后台管理</h3>
										<!-- DATE RANGE PICKER -->
										<span class="date-range pull-right">
											<div class="btn-group">
												<a class="js_update btn btn-default" href="#">今天</a> <a
													class="js_update btn btn-default" href="#">最近一周</a> <a
													class="js_update btn btn-default hidden-xs" href="#">最近一个月</a>

												<a id="reportrange" class="btn reportrange"> <i
													class="fa fa-calendar"></i> <span></span> <i
													class="fa fa-angle-down"></i>
												</a>
											</div>
										</span>
										<!-- /DATE RANGE PICKER -->
									</div>
									<div class="description">概述, 数据统计，更多</div>
								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->
						<!-- DASHBOARD CONTENT -->
						<div class="row">
							<!-- COLUMN 1 -->
							<div class="col-md-6">
								<div class="row">
									<div class="col-lg-6">
										<div class="dashbox panel panel-default">
											<div class="panel-body">
												<div class="panel-left red">
													<i class="fa fa-instagram fa-3x"></i>
												</div>
												<div class="panel-right">
													<div class="number">${stockNum}</div>
													<div class="title">股票总数</div>
													<span class="label label-success"> 26% <i
														class="fa fa-arrow-up"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="col-lg-6">
										<div class="dashbox panel panel-default">
											<div class="panel-body">
												<div class="panel-left blue">
													<i class="fa fa-twitter fa-3x"></i>
												</div>
												<div class="panel-right">
													<div class="number">${newsNum}</div>
													<div class="title">新闻总数</div>
													<span class="label label-warning"> 5% <i
														class="fa fa-arrow-down"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-6">
										<div class="dashbox panel panel-default">
											<div class="panel-body">
												<div class="panel-left red">
													<i class="fa fa-instagram fa-3x"></i>
												</div>
												<div class="panel-right">
													<div class="number">${product_project}</div>
													<div class="title">新股总数</div>
													<span class="label label-success"> 26% <i
														class="fa fa-arrow-up"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="col-lg-6">
										<div class="dashbox panel panel-default">
											<div class="panel-body">
												<div class="panel-left blue">
													<i class="fa fa-twitter fa-3x"></i>
												</div>
												<div class="panel-right">
													<div class="number">${relationProject}</div>
													<div class="title">牛股总数</div>
													<span class="label label-warning"> 5% <i
														class="fa fa-arrow-down"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="quick-pie panel panel-default">
											<div class="panel-body">
												<div class="col-md-4 text-center">
													<div id="dash_pie_1" class="piechart" data-percent="59">
														<span class="percent"></span>
													</div>
													<a href="#" class="title">系统用户增加率 <i
														class="fa fa-angle-right"> </i></a>
												</div>
												<div class="col-md-4 text-center">
													<div id="dash_pie_2" class="piechart" data-percent="45">
														<span class="percent"></span>
													</div>
													<a href="#" class="title">上涨股票比例 <i
														class="fa fa-angle-right"></i></a>
												</div>
												<div class="col-md-4 text-center">
													<div id="dash_pie_3" class="piechart" data-percent="53">
														<span class="percent"></span>
													</div>
													<a href="#" class="title">下跌股票比例 <i
														class="fa fa-angle-right"></i></a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- /COLUMN 1 -->

							<!-- COLUMN 2 -->
							<div class="col-md-6">
								<div class="box solid grey">
									<div class="box-title">
										<h4>
											<i class="fa fa-dollar"></i>用户统计
										</h4>
										<div class="tools">
											<span class="label label-danger"> 总体趋势上涨20% <i
												class="fa fa-arrow-up"></i>
											</span> <a href="#box-config" data-toggle="modal" class="config">
											</a><i class="fa fa-cog"></i>
										</div>
									</div>
									<div class="box-body">
										<div id="chart-revenue" style="height: 240px"></div>
									</div>
								</div>
							</div>
							<!-- /COLUMN 2 -->
						</div>
						<!-- /DASHBOARD CONTENT -->
						<!-- HERO GRAPH -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border green">
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i> <span class="hidden-inline-mobile">股市情况概览</span>
										</h4>
									</div>
									<div class="box-body">
										<div class="tabbable header-tabs">
											<ul class="nav nav-tabs">
												<li><a href="#box_tab2" data-toggle="tab"><i
														class="fa fa-search-plus"></i> <span
														class="hidden-inline-mobile">指标统计</span></a></li>
												<li class="active"><a href="#box_tab1"
													data-toggle="tab"><i class="fa fa-bar-chart-o"></i> <span
														class="hidden-inline-mobile">股票统计</span></a></li>
											</ul>
											<div class="tab-content">
												<div class="tab-pane fade in active" id="box_tab1">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart"></div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
												<div class="tab-pane fade" id="box_tab2">
													<div class="row">
														<div class="col-md-8">
															<div class="demo-container">
																<div id="placeholder" class="demo-placeholder"></div>
															</div>
														</div>
														<div class="col-md-4">
															<div class="demo-container" style="height: 100px;">
																<div id="overview" class="demo-placeholder"></div>
															</div>
															<div class="well well-bottom">
																<h4>Month over Month Analysis</h4>
																<ol>
																	<li>Selection support makes it easy to construct
																		flexible zooming schemes.</li>
																	<li>With a few lines of code, the small overview
																		plot to the right has been connected to the large
																		plot.</li>
																	<li>Try selecting a rectangle on either of them.</li>
																</ol>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<!-- /BOX -->
								</div>
							</div>
							<!-- /HERO GRAPH -->
							<!-- <!-- NEW ORDERS & STATISTICS
							<div class="row">
								NEW ORDERS
								<div class="col-md-6">
									<div class="box border">
										<div class="box-title">
											<h4>
												<i class="fa fa-columns"></i> <span
													class="hidden-inline-mobile">最近一周</span>
											</h4>
										</div>
										<div class="box-body">
											<div class="tabbable header-tabs">
												<ul class="nav nav-tabs">
													<li class="active"><a href="#sales" data-toggle="tab"><i
															class="fa fa-bookmark"></i> <span
															class="hidden-inline-mobile">基金经理关注的项目</span></a></li>
													<li><a href="#feed" data-toggle="tab"><i
															class="fa fa-rss"></i> <span class="hidden-inline-mobile">用户行为监控</span></a></li>
												</ul>
												<div class="tab-content">

													<div class="tab-pane active" id="feed">
														<div class="scroller" data-height="450px"
															data-always-visible="1" data-rail-visible="1">
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-check btn btn-info"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 登录用户端 <br> <a href="#">查看了个人资料</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-picture-o btn btn-danger"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 修改了登录密码 <br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-edit btn btn-pink"></i>
																	成果提供者<a class="user" href="#"> <strong>Langer</strong>
																	</a> 提交了产品服务-项目<br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 4小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-bitcoin btn btn-yellow"></i>
																	基金经理<a class="user" href="#"> <strong>ZhangYuXiao</strong>
																	</a>关注了项目<a href="#"></a> <br> <a href="#">Check
																		your financials</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 6 hours ago
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-check btn btn-info"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 登录用户端 <br> <a href="#">查看了个人资料</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-picture-o btn btn-danger"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 修改了登录密码 <br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-edit btn btn-pink"></i>
																	成果提供者<a class="user" href="#"> <strong>Langer</strong>
																	</a> 提交了产品服务-项目<br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 4小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-bitcoin btn btn-yellow"></i>
																	基金经理<a class="user" href="#"> <strong>ZhangYuXiao</strong>
																	</a>关注了项目<a href="#"></a> <br> <a href="#">Check
																		your financials</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 6 hours ago
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-check btn btn-info"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 登录用户端 <br> <a href="#">查看了个人资料</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-picture-o btn btn-danger"></i>
																	成果提供者<a class="user" href="#"> <strong>CalarBaby</strong>
																	</a> 修改了登录密码 <br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 5小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i class="pull-left roundicon fa fa-edit btn btn-pink"></i>
																	成果提供者<a class="user" href="#"> <strong>Langer</strong>
																	</a> 提交了产品服务-项目<br> <a href="#">点击查看</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 4小时前
																</div>
															</div>
															<div class="feed-activity clearfix">
																<div>
																	<i
																		class="pull-left roundicon fa fa-bitcoin btn btn-yellow"></i>
																	基金经理<a class="user" href="#"> <strong>ZhangYuXiao</strong>
																	</a>关注了项目<a href="#"></a> <br> <a href="#">Check
																		your financials</a>

																</div>
																<div class="time">
																	<i class="fa fa-clock-o"></i> 6 hours ago
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div> --> 
								<!-- /NEW ORDERS -->
								<!-- <!-- STATISTICS
								<div class="col-md-6">
									<div class="row">
										<div class="col-md-6">
											<div class="box border inverse">
												<div class="box-title">
													<h4>
														<i class="fa fa-money"></i>系统总体统计
													</h4>
													<div class="tools">
														<a href="javascript:;" class="reload"> <i
															class="fa fa-refresh"></i>
														</a> <a href="javascript:;" class="remove"> <i
															class="fa fa-times"></i>
														</a>
													</div>
												</div>
												<div class="box-body">
													<div class="sparkline-row">
														<span class="title">全部用户</span> <span class="value">$78,273</span>
														<span class="sparkline big" data-color="blue">16,7,23,13,12,11,15,4,19,18,4,24</span>
													</div>
													<div class="sparkline-row">
														<span class="title">全部成果</span> <span class="value">$6,543</span>
														<span class="sparkline big" data-color="red">6,3,24,25,27,29,14,26,20,8,12,20</span>
													</div>
													<div class="sparkline-row">
														<span class="title">全部项目</span> <span class="value">985</span>
														<span class="sparkline big" data-color="green">11,19,20,20,5,18,11,6,16,20,26,11</span>
													</div>
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<div class="box border purple">
												<div class="box-title">
													<h4>
														<i class="fa fa-adjust"></i>评审未通过的项目统计
													</h4>
													<div class="tools">
														<a href="javascript:;" class="reload"> <i
															class="fa fa-refresh"></i>
														</a> <a href="javascript:;" class="remove"> <i
															class="fa fa-times"></i>
														</a>
													</div>
												</div>
												<div class="box-body">
													<div class="sparkline-row">
														<span class="title">用户统计</span> <span class="value"><i
															class="fa fa-usd"></i> 25674</span> <span class="sparklinepie">16,7,23</span>
													</div>
													<div class="sparkline-row">
														<span class="title">成果统计</span> <span class="value"><i
															class="fa fa-money"></i> 19 999,99</span> <span
															class="sparklinepie">6,3,24,25</span>
													</div>
													<div class="sparkline-row">
														<span class="title">项目统计</span> <span class="value"><i
															class="fa fa-user"></i> 645783</span> <span class="sparklinepie">11,19,20</span>
													</div>
												</div>
											</div>
										</div>
										新闻政策统计

										新闻政策统计
									</div>
								</div>  -->
								<div class="col-md-12">
									<div class="panel panel-default">
										<div class="panel-body">
											<div class="tabbable tabs-left">
												<ul class="nav nav-tabs">
													<li class=""><a href="#tab_3_1" data-toggle="tab">最近上市的公司</a></li>
													<li class=""><a href="#tab_3_2" data-toggle="tab">最近发行的股票</a></li>
													<li class="active"><a href="#tab_3_3"
														data-toggle="tab">热门新闻</a></li>
													<li class=""><a href="#tab_3_4" data-toggle="tab">热门股票</a></li>
													<li class=""><a href="#tab_3_5" data-toggle="tab">最近发布的新闻和政策</a></li>
												</ul>
												<div class="tab-content">
													<div class="tab-pane fade" id="tab_3_1">
														<table id="example-paper"
															class="table table-paper table-striped"
															style="width: 80%">
															<thead>
																<tr>
																	<th>上市时间</th>
																	<th><a href="#" title="点击查看发布人信息详情">企业法人</a></th>
																	<th><a href="#" title="点击查看项目信息详情">公司名称</a></th>
																	<th>所属行业</th>
																	<th>公司网址<br>
																	</th>

																</tr>
															</thead>
															<tbody>
																<%-- <c:forEach var="wpl" items="${weekProjectList }"
																	varStatus="">
																	<tr>
																		<td>${wpl.pjProtime }</td>
																		<td><a
																			href="selectUserInfo?userUuid=${wpl.userUuid}">${userProMap[wpl.userUuid]}</a></td>
																		<td><a
																			href="adminSelectProItem?projectUuid=${wpl.projectUuid }">${wpl.pjName }</a></td>
																		<td>电子行业</td>
																		<td>${wpl.pjTargetfinance }</td>

																	</tr>
																</c:forEach> --%>
																	<tr>
																		<td>2016-12-06 </td>
																		<td>李工</td>
																		<td><a
																			href="#">华安证券/HUAAN SECURITIES</a></td>
																		<td>商业</td>
																		<td><a href="http://www.hazq.com">http://www.hazq.com<a></a></td>

																	</tr>
															</tbody>
														</table>
													</div>
													<div class="tab-pane fade" id="tab_3_2">
														<table id="example-paper"
															class="table table-paper table-striped"
															style="width: 80%">
															<thead>
																<tr>
																	<th>股票代码</th>
																	<th>股票名称</th>
																	<th>新股上市日</th>
																	<th>发行价<br>
																	</th>
																	<th>发行量</th>万
																	<th>申购限额</th>万股
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td>603813</td>
																	<td><a href="#" title="点击查看发布人信息详情">原尚股份</a></td>
																	<td>09月18日周一</a></td>
																	<td>10.17</td>
																	<td>2207万</td>
																	<td>0.8万股</td>
																</tr>
																<%-- <c:forEach var="wrl" items="${weekRequirementList }"
																	varStatus="">
																	<tr>
																		<td>${wrl.reqProtime }</td>
																		<td><a
																			href="selectUserInfo?userUuid=${wrl.userUuid}"
																			title="点击查看发布人信息详情">${userMap[wrl.userUuid]}</a></td>
																		<td><a href="#" title="点击查看需求信息详情">${wrl.reqName }</a></td>
																		<td>${wrl.reqMoney }</td>
																		<td>${wrl.reqEmail }</td>
																	</tr>
																</c:forEach> --%>

															</tbody>
														</table>
													</div>
													<div class="tab-pane fade active in" id="tab_3_3">
														<table id="example-paper"
															class="table table-paper table-striped"
															style="width: 80%">
															<thead>
																<tr>
																	<th>新闻标题</th>
																	<th>发布时间</th>
																	<th>新闻来源</th>
																	</th>
																	<th>热门程度</th>
																</tr>
															</thead>
															<tbody>
																<c:forEach var="v" items="${hotNewsList}" begin="0" end="4"
																	varStatus="">
																	<tr>
																		<td><a href="#">${v.newsTitle}</a></td>
																		<td>${v.newsTime }</td>
																		<td>${v.newsSource }</td>
																		<td>${v.hotRatios }</td>
																	</tr>
																</c:forEach>
															</tbody>
														</table>
													</div>
													<div class="tab-pane fade  in" id="tab_3_4">
														<table id="example-paper"
															class="table table-paper table-striped"
															style="width: 80%">
															<thead>
																<tr>
																	<th>股票代码</th>
																	<th>股票名称</th>
																	<th>主营业务</th>
																	<th>上市时间</th>
																	<th>总市值</th>
																	<th>被关注次数</th>
																	<th>关注列表</th>
																	<td>热门程度</td>
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td><a href="#">000005</a></td>
																	<td><a href="#">世纪星源</a></td>
																	<td>纺织、印染、服装、轻工产品、电子产品、房地产、酒店...</td>
																	<td>1990-12-10</td>
																	<td>1206778324.1</td>
																	<td>45</td>
																	<td><a href="#">点击查看</a></td>
																	<td>五颗星</td>
																</tr>

															</tbody>
														</table>
													</div>
													<div class="tab-pane fade  in" id="tab_3_5">
														<table id="example-paper"
															class="table table-paper table-striped"
															style="width: 80%">
															<thead>
																<tr>
																	<th>发布时间</th>
																	<th>新闻名称</th>
																	<th>作者</th>
																	<th>来源</th>
																	<th>热度</th>
																</tr>
															</thead>
															<tbody>
																<c:forEach var="wnl" items="${weekNewsList }"
																	varStatus="">
																	<tr>
																		<td>${wnl.newsTime }</td>
																		<td><a
																			href="adminSelectNewsItem?newsUuid=${wnl.newsUuid}">${wnl.newsTitle }</a></td>
																		<td>${wnl.newsAuthor }</td>
																		<td>${wnl.newsOrigin }</td>
																		<td>${wnl.newsHot }</td>
																	</tr>
																</c:forEach>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<!-- 缺陷展示 -->

									<div class="panel-group" id="accordion">
										<div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">
													<a class="accordion-toggle collapsed"
														data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne">最近10天持续上涨的股票</a>
												</h3>
											</div>
											<div id="collapseOne" class="panel-collapse collapse"
												style="height: 0px;">
												<div class="panel-body">
													<table id="example-paper"
														class="table table-paper table-striped"
														style="width: 100%">
														<thead>
															<tr>
																<th>股票代码</th>
																<th>股票名称</th>
																<th>股票类型</th>
																<th>10天均价</th>
																<th>升跌%</th>
															</tr>
														</thead>
														<tbody>
															<c:forEach var="rpn" items="${rpn }" varStatus="">
																<tr>
																	<td><a
																		href="adminSelectProItem?projectUuid=${rpn.projectUuid }"
																		title="点击查看项目信息详情">${rpn.pjName}</a></td>
																	<td>${rpn.pjProtime}</td>
																	<td>${indMap[rpn.pjIndustry]}</td>
																	<td>${rpn.pjTargetfinance}</td>
																	<td><a
																		href="selectUserInfo?userUuid=${rpn.userUuid}"
																		title="点击查看发布人信息详情">${wproMap[rpn.userUuid]}</a></td>
																</tr>
															</c:forEach>
														</tbody>
													</table>
												</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">
													<a class="accordion-toggle collapsed"
														data-toggle="collapse" data-parent="#accordion"
														href="#collapseTwo">最近一周持续下跌的股票 </a>
												</h3>
											</div>
											<div id="collapseTwo" class="panel-collapse collapse">
												<div class="panel-body">
													<table id="example-paper"
														class="table table-paper table-striped"
														style="width: 100%">
														<thead>

															<tr>

																<th>股票代码</th>
																<th>股票名称</th>
																<th>股票类型</th>
																<th>10天均价</th>
																<th>升跌%</th>
															</tr>

														</thead>
														<tbody>
															<c:forEach var="rmp" items="${rmp }" varStatus="">
																<tr>
																	<td><a
																		href="adminSelectProItem?projectUuid=${rmp.projectUuid }"
																		title="点击查看项目信息详情">${rmp.pjName}</a></td>
																	<td>${rmp.pjProtime}</td>
																	<td>${indMap1[rmp.pjIndustry]}</td>
																	<td>${rmp.pjTargetfinance}</td>
																	<td><a
																		href="selectUserInfo?userUuid=${rmp.userUuid}"
																		title="点击查看发布人信息详情">${mproMap[rmp.userUuid]}</a></td>
																</tr>
															</c:forEach>
														</tbody>
													</table>
												</div>
											</div>
										</div>
										<!-- <div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">
													<a class="accordion-toggle collapsed"
														data-toggle="collapse" data-parent="#accordion"
														href="#collapseThree">最近一周未登录的用户 </a>
												</h3>
											</div>
											<div id="collapseThree" class="panel-collapse collapse">
												<div class="panel-body">
													<table id="example-paper"
														class="table table-paper table-striped" style="width: 80%">
														<thead>
															<tr>
																<th>用户名</th>
																<th>用户名字</th>
																<th>上次登录时间</th>
																<th>多久未登录系统</th>
																<th>用户邮箱</th>
															</tr>
														</thead>
														<tbody>
															<tr>
																<td><a href="#" title="点击查看项目信息详情">大川</a></td>
																<td>tcf</td>
																<td>2017-10-01</td>
																<td>160天左右</td>
																<td>178626023@qq.com</td>
														 	</tr>

														</tbody>
													</table>
												</div>
											</div>
										</div> -->
									</div>
								</div>
								<div class="footer-tools">
									<span class="go-top"> <i class="fa fa-chevron-up"></i>
										Top
									</span>
								</div>
							</div>
							<!-- /CONTENT-->
						</div>
					</div>
				</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script
		src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<!-- JQUERY UI-->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script
		src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>


	<!-- DATE RANGE PICKER -->
	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>

	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- SPARKLINES -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/sparklines/jquery.sparkline.min.js"></script>
	<!-- EASY PIE CHART -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-easing/jquery.easing.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/easypiechart/jquery.easypiechart.min.js"></script>
	<!-- FLOT CHARTS -->
	<script src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.time.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.selection.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.resize.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.pie.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.stack.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/flot/jquery.flot.crosshair.min.js"></script>
	<!-- TODO -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jquery-todo/js/paddystodolist.js"></script>
	<!-- TIMEAGO -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/timeago/jquery.timeago.min.js"></script>
	<!-- FULL CALENDAR -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/fullcalendar/fullcalendar.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- GRITTER -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/gritter/js/jquery.gritter.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script>
		//用户统计	
		function chart_revenue() {
			var likes = [ [ 1, Math.random() * 100 ],
					[ 2, Math.random() * 100 ], [ 3, Math.random() * 100 ],
					[ 4, Math.random() * 100 ], [ 5, Math.random() * 100 ],
					[ 6, Math.random() * 100 ], [ 7, Math.random() * 100 ],
					[ 8, Math.random() * 100 ], [ 9, Math.random() * 100 ],
					[ 10, Math.random() * 100 ], [ 11, Math.random() * 100 ],
					[ 12, Math.random() * 100 ] ];

			var chartColor = $(this).parent().parent().css("color");

			var plot = $.plot($("#chart-revenue"), [ {
				data : likes
			} ], {
				series : {
					label : "Revenue",
					lines : {
						show : true,
						lineWidth : 3,
						fill : false
					},
					points : {
						show : true,
						lineWidth : 3,
						fill : true,
						fillColor : chartColor
					},
					shadowSize : 0
				},
				grid : {
					hoverable : true,
					clickable : true,
					tickColor : "rgba(255,255,255,.15)",
					borderColor : "rgba(255,255,255,0)"
				},
				colors : [ "#fff" ],
				xaxis : {
					font : {
						color : "#fff"
					},
					ticks : 6,
					tickDecimals : 0,
					tickColor : chartColor,
				},
				yaxis : {
					font : {
						color : "#fff"
					},
					ticks : 4,
					tickDecimals : 0,
					autoscaleMargin : 0.000001
				},
				legend : {
					show : false
				}
			});

			function showTooltip(x, y, contents) {
				$('<div id="tooltip">' + contents + '</div>').css({
					position : 'absolute',
					display : 'none',
					top : y + 5,
					left : x + 5,
					border : '1px solid #fdd',
					padding : '2px',
					'background-color' : '#dfeffc',
					opacity : 0.80
				}).appendTo("body").fadeIn(200);
			}

			var previousPoint = null;
			$("#chart-revenue")
					.bind(
							"plothover",
							function(event, pos, item) {
								$("#x").text(pos.x.toFixed(2));
								$("#y").text(pos.y.toFixed(2));

								if (item) {
									if (previousPoint != item.dataIndex) {
										previousPoint = item.dataIndex;

										$("#tooltip").remove();
										var x = item.datapoint[0].toFixed(2), y = item.datapoint[1]
												.toFixed(2);

										showTooltip(item.pageX, item.pageY,
												item.series.label + " on " + x
														+ " = " + y);
									}
								} else {
									$("#tooltip").remove();
									previousPoint = null;
								}
							});
		}
		jQuery(document).ready(function() {
			App.setPage("index"); //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>