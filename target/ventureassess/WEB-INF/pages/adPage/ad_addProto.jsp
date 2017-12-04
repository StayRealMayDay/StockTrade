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
										<li><a href="ad_login" class="dropdown active dropdown-toggle"
											>首页</a></li>
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
                 <h2 class="text-center title">创建样机</h2>
							<div class="space-bottom"></div>
							<form id="form4" role="form" class="form-horizontal" action="addProto1" method="post"  Content-Range="bytes 0-800/801" enctype="multipart/form-data" onsubmit="return validation();" >
							
								<div class="form-group">
									<label class="col-sm-2 control-label">样机名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="pt_name" id="pt_name" onblur="checkPtname()" placeholder="请输入样机名称...">
										<label id="validate_ptname" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">是否有样机</label>
									<div class="col-sm-10">
										<div class="radio">
										<label>
											<input type="radio" name="pt_entity" id="optionsRadios3" value="1" checked>有样机
										</label>
									    </div>
									    <div class="radio">
										<label>
											<input type="radio" name="pt_entity" id="optionsRadios4" value="0">无样机，有设计图

										</label>
								        </div>
										
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">市场选择策略 </label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_market" id="pt_market">
											<option value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">将来的产品定位</label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_product" id="pt_product">
											<option value="1">奢侈品</option>
											<option value="2">高端产品</option>
											<option value="3">行业针对性产品</option>
											<option value="4">必需品</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">预期价格</label>
									<div class="col-sm-10">
									<div class="input-group">
										<input type="text" class="form-control" name="pt_price" id="pt_price" onblur="checkNumber()" placeholder="请输入预期价格...">
										 <div class="input-group-addon">￥</div>
										</div>
										<label id="validate_number" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">是否属于安全属性高的领域</label>
									<div class="col-sm-10">
									    <p class="help-block">食品、化妆品、住房、交通等产品就属于对安全性要求高的领域，尤其是食品领域</p>
										<div class="radio">
										<label>
											<input type="radio" name="pt_safety" id="pt_safety1" value="1" checked>
											属于食品行业，对安全属性要求最高
										</label>
									    </div>
									    <div class="radio">
										<label>
											<input type="radio" name="pt_safety" id="pt_safety2" value="2">
											属于其他对安全属性要求较高的领域
										</label>
								        </div>
								        <div class="radio">
								        <label>
										<input type="radio" name="pt_safety" id="pt_safety3" value="3">
											不属于安全性要求高的领域
										</label>
								        </div>
								    </div>    
									
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">市场竞争性</label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_compete" id="pt_compete">
											<option value="1">所属领域为垄断性</option>
											<option value="2">同类型产品竞争激烈</option>
											<option value="3">同类型产品竞争不激烈</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">渠道特性</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pt_ditch" id="pt_ditch">
											<option value="1">销售渠道集中</option>
											<option value="2">销售渠道分散</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">目标群体</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pt_aimgroup" id="pt_aimgroup">
											<option value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option value="5">大型企业</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">简介</label>
									<div class="col-sm-10">
								    <textarea class="form-control" rows="6" name="pt_introduction" id="pt_introduction"></textarea>
								    </div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">上传样机相关文件</label>
									<div class="col-sm-10" style="float:left;">
										<input type="file" class="form-control" name="InputFile" id="InputFile" >
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">选择评估截至时间</label>
									<div class="col-sm-10">
										<input type="text" class="form-control Wdate" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="pt_eva_deadline" id="pt_eva_deadline" style="height:40px">
									</div>
								</div>
								 <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">添加用户:</label>
                            <select style="height:34px;width:200px" class="form-control" name="user_name">
									<c:forEach items="${users}" var="users">
									<option value="${users.user_name}">${users.user_name}</option>
								     </c:forEach>
							</select>
							<p class="help-block"></p>
                        </div>
                    </div>
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-default" style="margin-left:40%;width:210px;">样机提交</button>
									</div>
								</div>
							</form>
					



				</div>
				<!-- main end -->

			</div>
			<ul class="pagination" style="text-align: center;">

				<li><a href="#">共 ${pager.recordCount } 条数据，每页
						${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第 ${pager.pageNum }
						页</a></li>

			</ul>

			<%-- <ul class="pagination">

				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="selectAllResult?pageNum=1">首页</a></li>
				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="selectAllResult?pageNum=${pager.pageNum-1 }">上页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="selectAllResult?pageNum=${pager.pageNum+1 }">下页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="selectAllResult?pageNum=${pager.pageCount }">末页</a></li>
				<li><a>转到 </a></li>
				<li><a><input id="changePage" type="text"
						style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
				<li><a>页 </a></li>
				<li><a href="javascript:goPage();">跳转</a></li>

			</ul> --%>
		</div>
		</section>
		<!-- main-container end -->


		<jsp:include page="/footer1.jsp" flush="true" />
</body>
</html>
