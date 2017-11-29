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
				<!-- ================ -->
				<form  role="form" class="form-horizontal"
					action="editResults2"  method="post" Content-Range="bytes 0-800/801"
					enctype="multipart/form-data" novalidate>
					<!--  onsubmit="return validation();" -->
					<div class="main col-md-8 col-md-offset-1">
						<c:if test="${result.res_type==1}">
							<h2 class="text-center title">【论文】成果-查看编辑信息</h2>
							<div class="separator"></div>
							<p class="text-center">编辑论文的基本信息</p>
						</c:if>
						<c:if test="${result.res_type==2}">
							<h2 class="text-center title">【专利】成果-查看编辑信息</h2>
							<div class="separator"></div>
							<p class="text-center">编辑专利成果的基本信息</p>
						</c:if>
						<c:if test="${result.res_type==3}">
							<h2 class="text-center title">【软件】成果-查看编辑信息</h2>
							<div class="separator"></div>
							<p class="text-center">编辑软件成果的基本信息</p>
						</c:if>
						<c:if test="${result.res_type==4}">
							<h2 class="text-center title">【样机】成果-查看编辑信息</h2>
							<div class="separator"></div>
							<p class="text-center">编辑样机成果的基本信息</p>
						</c:if>


						<!-- <form id="form1" role="form" action="addPaper1" method="post"
						Content-Range="bytes 0-800/801" enctype="multipart/form-data"> -->

						<div class="control-group form-group">
							<div class="controls">
								<label class="contact-p1">成果名称:</label> <input
									value="${result.res_name}" type="text" class="form-control"
									name="res_name" id="res_name" onblur="checkPname()" required
									data-validation-required-message="Please enter your name.">
								<label id="validate_pname"
									style="font-size: 9px; display: none;"></label>
								<p class="help-block"></p>
							</div>
							<div class="controls">
								<label class="contact-p1">成果评估值:</label> <input
									value="${result.res_evalue}" type="text" class="form-control"
									name="res_evalue" id="res_evalue" onblur="checkPname()" required
									data-validation-required-message="Please enter your name.">
								<label id="validate_pname"
									style="font-size: 9px; display: none;"></label>
								<p class="help-block"></p>
							</div>
							<div class="controls">
								<label class="contact-p1">成果提供者:</label><select
									class="form-control" id="user_name" name="res_provider">
									<c:forEach items="${listUsers}" var="listUsers">
										<c:if test="${listUsers.user_id==result.res_provider}">
											<option selected="selected" value="${listUsers.user_id}">${listUsers.user_name}</option>
										</c:if>
									</c:forEach>
								</select> <label id="validate_pname"
									style="font-size: 9px; display: none;"></label>
								<p class="help-block"></p>
							</div>
							<div class="controls">
								<label class="contact-p1">成果状态:</label>
								<c:if test="${result.res_flag==1}">
									<input value="待评估" type="text" class="form-control"
										name="res_flag" id="res_flag" onblur="checkPname()" required
										data-validation-required-message="Please enter your name.">
								</c:if>
								<c:if test="${result.res_flag==2}">
									<input value="评估截止" type="text" class="form-control"
										name="res_flag" id="res_flag" onblur="checkPname()" required
										data-validation-required-message="Please enter your name.">
								</c:if>
								<p class="help-block"></p>
							</div>
							<div class="controls">
								<label class="contact-p1">评估的截止时间:</label> <input
									value="${result.res_eva_deadline}" type="text"
									class="form-control Wdate"
									onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})"
									name="res_eva_deadline" id="p_time" style="height: 40px" />
								<p class="help-block"></p>
							</div>
							<input type="hidden" id="res_id" name="res_id"
								value="${result.res_id}" /> <input type="hidden" id="res_type"
								name="res_type" value="${result.res_type}" />
						</div>

						<div id="paperResults">
							<h4 style="color: red">论文信息</h4>
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile1">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">论文名称:</label> <input
											value="${paper.paper_name}" type="text" class="form-control"
											name="p_name" id="p_name" onblur="checkPname()" required
											data-validation-required-message="Please enter your name.">
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">发表时间:</label> <input
											value="${paper.paper_pubtime}" type="text"
											class="form-control Wdate"
											onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})"
											name="p_time" id="p_time" style="height: 40px" />
										<!--  <input type="text" class="form-control form_datetime" name="p_time" id="p_time" required data-validation-required-message="Please enter your phone number."> -->
										<!-- <span class="add-on"><i class="icon-th"></i></span> -->
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">被引用次数:</label> <input
											value="${paper.paper_cited}" type="text" class="form-control"
											name="p_cited" id="p_cited" onblur="checkCited()" required
											data-validation-required-message="Please enter your name.">
										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile2">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">发表刊物:</label> <select
											class="form-control" id="p_publications"
											name="p_publications">

											<c:forEach items="${journals}" var="journals">
												<c:if test="${journals.j_id==paper.published_journals }">
													<option selected="selected" value="${journals.j_id}">${journals.j_name}</option>
												</c:if>
											</c:forEach>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">科学索引类别:</label> <select
											class="form-control" id="p_category" name="p_category">
											<c:if test="${paper.paper_category==1}">
												<option selected="selected" value="1">SCI(科学引文索引)</option>
												<option value="2">EI(工程索引)</option>
												<option value="3">ISTP(科技会议录索引)</option>
												<option value="4">其他</option>
											</c:if>
											<c:if test="${paper.paper_category==2}">
												<option value="1">SCI(科学引文索引)</option>
												<option selected="selected" value="2">EI(工程索引)</option>
												<option value="3">ISTP(科技会议录索引)</option>
												<option value="4">其他</option>
											</c:if>
											<c:if test="${paper.paper_category==3}">
												<option value="1">SCI(科学引文索引)</option>
												<option value="2">EI(工程索引)</option>
												<option selected="selected" value="3">ISTP(科技会议录索引)</option>
												<option value="4">其他</option>
											</c:if>
											<c:if test="${paper.paper_category==4}">
												<option value="1">SCI(科学引文索引)</option>
												<option value="2">EI(工程索引)</option>
												<option value="3">ISTP(科技会议录索引)</option>
												<option selected="selected" value="4">其他</option>
											</c:if>
											<%-- <c:if test="<%=paper.getPaper_category()==null %>">
											<option selected="selected" value="1">未填写</option>
											<option value="1">SCI(科学引文索引)</option>
											<option value="2">EI(工程索引)</option>
											<option value="3">ISTP(科技会议录索引)</option>
											<option  value="4">其他</option>
											</c:if> --%>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">论文附件:</label> <input
											value="${upload.upload_name}" type="text"
											class="form-control" name="up_idPaper" id="up_idPaper"
											onblur="checkCited()" required
											data-validation-required-message="Please enter your name.">
										<input type="file" name="file3"
											style="height: 34px; width: 200px">
										<p class="help-block"></p>
										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-12">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">论文介绍:</label>
										<textarea value="${paper.paper_remark}" rows="10" cols="100"
											class="form-control" name="p_introduction"
											id="p_introduction" required
											data-validation-required-message="Please enter your introduction"
											maxlength="999" style="resize: none"></textarea>
										<p class="help-block"></p>
									</div>
								</div>
							</div>
						</div>

						<!-- 专利成果 -->
						<div id="patentResults">

							<!-- <form action="addPatent1" method="post"
								Content-Range="bytes 0-800/801" enctype="multipart/form-data"> -->
							<h4 style="color: red">专利信息</h4>
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile1">

								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">专利名称:</label> <input
											value="${patent.pa_name}" type="text" class="form-control"
											name="pa_name" id="pa_name" onblur="checkPaname()" required
											data-validation-required-message="Please enter your name.">
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">专利类型</label> <select
											class="form-control" id="pa_type" name="pa_type">
											<%-- <c:if test="${patent.pa_type }%>">
												<option selected="selected" value="0">未填写</option>
												<option value="1">发明类(产品)</option>
												<option value="2">发明类(方法)</option>
												<option value="3">外观设计类</option>
												<option value="4">实用新型类</option>
												</c:if> --%>
											<c:if test="${patent.pa_type==1 } ">
												<option selected="selected" value="1">发明类(产品)</option>
												<option value="2">发明类(方法)</option>
												<option value="3">外观设计类</option>
												<option value="4">实用新型类</option>
											</c:if>
											<c:if test="${patent.pa_type ==2} ">											
												<option value="1">发明类(产品)</option>
												<option selected="selected" value="2">发明类(方法)</option>
												<option value="3">外观设计类</option>
												<option value="4">实用新型类</option>
											</c:if>
											<c:if test="${patent.pa_type ==3}">								
												<option value="1">发明类(产品)</option>
												<option value="2">发明类(方法)</option>
												<option selected="selected" value="3">外观设计类</option>
												<option value="4">实用新型类</option>
											</c:if>
											<c:if test="${patent.pa_type==4 } ">
												<option value="1">发明类(产品)</option>
												<option value="2">发明类(方法)</option>
												<option value="3">外观设计类</option>
												<option selected="selected" value="4">实用新型类</option>
											</c:if>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">专利发明人:</label> <select
											class="form-control" id="user_name" name="pa_inventor">
											<c:forEach items="${listUsers}" var="listUsers">
												<c:if test="${listUsers.user_id==result.res_provider}">
													<option selected="selected" value="${listUsers.user_id}">${listUsers.user_name}</option>
												</c:if>
											</c:forEach>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile2">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">申请时间:</label> <input
											value="${patent.pa_pubtime}" type="text"
											class="form-control Wdate"
											onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})"
											name="pa_pubtime" id="pa_pubtime" style="height: 40px" />
										<!--  <input type="date" class="form-control" name="pa_pubtime" id="pa_pubtime"/>
                           <input type="text" class="form-control" name="pa_pubtime" id="pa_pubtime" required data-validation-required-message="Please enter your email address.">
							-->
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">专利号:</label> <input
											value="${patent.pa_number}" type="text" class="form-control"
											name="pa_number" id="pa_number" required
											data-validation-required-message="Please enter Subject.">
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">专利附件:</label> <input
											value="${patent.pa_name}" type="text" class="form-control"
											name="up_idPatent" id="up_idPatent" onblur="checkCited()" required
											data-validation-required-message="Please enter your name.">
										<input type="file" name="file3"
											style="height: 34px; width: 200px">
										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-12">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">原理性阐述:</label>
										<textarea value="${patent.pa_details }" rows="10" cols="100"
											class="form-control" name="pa_details" id="pa_details"
											required
											data-validation-required-message="Please enter your introduction"
											maxlength="999" style="resize: none"></textarea>
										<p class="help-block"></p>
									</div>
								</div>
								<div id="success"></div>
								<!-- For success/fail messages -->
								<!--  <button type="submit" class="btn btn-primary" style="width:1110px">专利提交</button> -->
							</div>
							<div class="clearfix"></div>

						</div>
						<!-- 软件成果 -->
						<div id="softwareResults">
							<h4 style="color: red">软件信息</h4>
							<!-- <form action="addSoftware1" method="post"
								Content-Range="bytes 0-800/801" enctype="multipart/form-data"> -->
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile1">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">软件名称:</label> <input
											value="${software.s_name}" type="text" class="form-control"
											name="s_name" id="s_name" onblur="checkSname()" required
											data-validation-required-message="Please enter your name.">
										<label id="validate_sname"
											style="font-size: 9px; display: none;"></label>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">是否发布(在某个应用商店或平台上):</label> <select
											class="form-control" id="s_ispublished" name="s_ispublished">
											<c:if test="${software.s_ispublished==1}">
												<option value="0">未发布</option>
												<option value="1" selected="selected">发布</option>
											</c:if>
											<c:if test="${software.s_ispublished==0}">
												<option value="0" selected="selected">未发布</option>
												<option value="1">发布</option>
											</c:if>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">完成时间:</label> <input
											value="${software.s_finishtime}" type="text"
											class="form-control Wdate"
											onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})"
											name="s_finishtime" id="s_finishtime" style="height: 40px" />

										<!-- <input class="Wdate" type="text" onClick="WdatePicker()">
                             <input type="text"  class="form-control Wdate" onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})" name="s_finishtime" id="s_finishtime"style="height:40px"/> -->

										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-6 col-md-6 col-sm-6 contact-agile2">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">可移植性:</label> <select
											class="form-control" id="s_level" name="s_level">
											<%-- <c:if test="${software.s_level}">
												<option selected="selected" value="0">未填写</option>
												<option value="1">高度可移植性(任何平台或环境都可以运行)</option>
												<option value="2">较好的可移植性(大多数平台或环境都可以运行)</option>
												<option value="3">一般的可移植性(少数平台或环境)</option>
												<option value="4">较差的可移植性(只针对一两种平台或环境)</option>
												</c:if> --%>
											<c:if test="${software.s_level==1}">
												<option selected="selected" value="1">高度可移植性(任何平台或环境都可以运行)</option>
												<option value="2">较好的可移植性(大多数平台或环境都可以运行)</option>
												<option value="3">一般的可移植性(少数平台或环境)</option>
												<option value="4">较差的可移植性(只针对一两种平台或环境)</option>
											</c:if>
											<c:if test="${software.s_level==2}">
												<option value="1">高度可移植性(任何平台或环境都可以运行)</option>
												<option selected="selected" value="2">较好的可移植性(大多数平台或环境都可以运行)</option>
												<option value="3">一般的可移植性(少数平台或环境)</option>
												<option value="4">较差的可移植性(只针对一两种平台或环境)</option>
											</c:if>
											<c:if test="${software.s_level==3}">
												<option value="1">高度可移植性(任何平台或环境都可以运行)</option>
												<option value="2">较好的可移植性(大多数平台或环境都可以运行)</option>
												<option selected="selected" value="3">一般的可移植性(少数平台或环境)</option>
												<option value="4">较差的可移植性(只针对一两种平台或环境)</option>
											</c:if>
											<c:if test="${software.s_level==4}">
												<option value="1">高度可移植性(任何平台或环境都可以运行)</option>
												<option value="2">较好的可移植性(大多数平台或环境都可以运行)</option>
												<option value="3">一般的可移植性(少数平台或环境)</option>
												<option selected="selected" value="4">较差的可移植性(只针对一两种平台或环境)</option>
											</c:if>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">功能完备性:</label> <select
											class="form-control" id="s_ccm" name="s_ccm">
											<c:if test="${software.s_ccm==1}">
												<option selected="selected" value="1">软件实现的功能完全满足软件计划书中要求的</option>
												<option value="2">基本满足完备性</option>
												<option value="3">有少量功能没有实现</option>
											</c:if>
											<c:if test="${software.s_ccm==2}">
												<option value="1">软件实现的功能完全满足软件计划书中要求的</option>
												<option selected="selected" value="2">基本满足完备性</option>
												<option value="3">有少量功能没有实现</option>
											</c:if>
											<c:if test="${software.s_ccm==3}">
												<option value="1">软件实现的功能完全满足软件计划书中要求的</option>
												<option value="2">基本满足完备性</option>
												<option selected="selected" value="3">有少量功能没有实现</option>
											</c:if>
										</select>
										<p class="help-block"></p>
									</div>
								</div>
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">软件附件:</label> <input type="text"
											value="${upload.upload_name}" class="form-control"
											name="up_idSoftware" id="up_idSoftware" onblur="checkCited()" required
											data-validation-required-message="Please enter your name.">
										 <input type="file" name="file3"
											style="height: 34px; width: 200px"> 
										<p class="help-block"></p>
									</div>
								</div>
							</div>
							<div class="col-lg-12">
								<div class="control-group form-group">
									<div class="controls">
										<label class="contact-p1">软件介绍:</label>
										<textarea value="${software.s_brief}" rows="10" cols="100"
											class="form-control" name="s_brief" id="s_brief" required
											data-validation-required-message="Please enter your introduction"
											maxlength="999" style="resize: none"></textarea>
										<p class="help-block"></p>
									</div>
								</div>
								<div id="success"></div>
								<!-- For success/fail messages -->
								<!-- <button type="submit" class="btn btn-primary" style="width:1110px">软件提交</button> -->
							</div>
							<div class="clearfix"></div>


						</div>

						<!-- 样机成果 -->
						<div id="protoTypeResults">
							<h4 style="color: red">样机信息</h4>


							<div class="form-group">
								<label class="col-sm-2 control-label">样机名称</label>
								<div class="col-sm-10">
									<input type="text" value="${result.res_name}"
										class="form-control" name="pt_name" id="pt_name"
										onblur="checkPtname()" placeholder="请输入样机名称..."> <label
										id="validate_ptname" style="font-size: 9px; display: none;"></label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">是否有样机</label>
								<div class="col-sm-10">
									<c:if test="${prototype.pt_entity==1}">
										<div class="radio">

											<label> <input type="radio" name="pt_entity"
												id="optionsRadios3" value="1" checked>有样机
											</label>

										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_entity"
												id="optionsRadios4" value="0">无样机，有设计图

											</label>
										</div>
									</c:if>
									<c:if test="${prototype.pt_entity==0}">
										<div class="radio">

											<label> <input type="radio" name="pt_entity"
												id="optionsRadios3" value="1">有样机
											</label>

										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_entity"
												id="optionsRadios4" value="0" checked>无样机，有设计图

											</label>
										</div>
									</c:if>


								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">市场选择策略 </label>
								<div class="col-sm-10">
									<select class="form-control" name="pt_market" id="pt_market">
										<c:if test="${prototype.pt_market==1}">
											<option selected="selected" value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
										</c:if>
										<c:if test="${prototype.pt_market==2}">
											<option value="1">密集性市场策略</option>
											<option selected="selected" value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
										</c:if>
										<c:if test="${prototype.pt_market==3}">
											<option value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option selected="selected" value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
										</c:if>
										<c:if test="${prototype.pt_market==4}">
											<option value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option selected="selected" value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
										</c:if>
										<c:if test="${prototype.pt_market==5}">
											<option value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option selected="selected" value="5">全部市场策略</option>
										</c:if>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">将来的产品定位</label>
								<div class="col-sm-10">
									<select class="form-control" name="pt_product" id="pt_product">
										<c:if test="${prototype.pt_product==1}">
											<option selected="selected" value="1">奢侈品</option>
											<option value="2">高端产品</option>
											<option value="3">行业针对性产品</option>
											<option value="4">必需品</option>
										</c:if>
										<c:if test="${prototype.pt_product==2}">
											<option value="1">奢侈品</option>
											<option selected="selected" value="2">高端产品</option>
											<option value="3">行业针对性产品</option>
											<option value="4">必需品</option>
										</c:if>


										<c:if test="${prototype.pt_product==3}">
											<option selected="selected" value="1">奢侈品</option>
											<option value="2">高端产品</option>
											<option selected="selected" value="3">行业针对性产品</option>
											<option value="4">必需品</option>
										</c:if>

										<c:if test="${prototype.pt_product==4}">
											<option selected="selected" value="1">奢侈品</option>
											<option value="2">高端产品</option>
											<option value="3">行业针对性产品</option>
											<option selected="selected" value="4">必需品</option>
										</c:if>
									</select>



								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">预期价格</label>
								<div class="col-sm-10">
									<div class="input-group">
										<input type="text" value="${prototype.pt_price}"
											class="form-control" name="pt_price" id="pt_price"
											onblur="checkNumber()" placeholder="请输入预期价格...">
										<div class="input-group-addon">￥</div>
									</div>
									<label id="validate_number"
										style="font-size: 9px; display: none;"></label>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">是否属于安全属性高的领域</label>
								<div class="col-sm-10">
									<p class="help-block">食品、化妆品、住房、交通等产品就属于对安全性要求高的领域，尤其是食品领域</p>
									<c:if test="${prototype.pt_safety==1}">
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety1" value="1" checked> 属于食品行业，对安全属性要求最高
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety2" value="2"> 属于其他对安全属性要求较高的领域
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety3" value="3"> 不属于安全性要求高的领域
											</label>
										</div>
									</c:if>
									<c:if test="${prototype.pt_safety==2}">
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety1" value="1"> 属于食品行业，对安全属性要求最高
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety2" value="2" checked> 属于其他对安全属性要求较高的领域
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety3" value="3"> 不属于安全性要求高的领域
											</label>
										</div>
									</c:if>
									<c:if test="${prototype.pt_safety==3}">
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety1" value="1"> 属于食品行业，对安全属性要求最高
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety2" value="2"> 属于其他对安全属性要求较高的领域
											</label>
										</div>
										<div class="radio">
											<label> <input type="radio" name="pt_safety"
												id="pt_safety3" value="3" checked> 不属于安全性要求高的领域
											</label>
										</div>
									</c:if>
								</div>

							</div>

							<div class="form-group">
								<label class="col-sm-2 control-label">市场竞争性</label>
								<div class="col-sm-10">
									<select class="form-control" name="pt_compete" id="pt_compete">
										<c:if test="${prototype.pt_compete==1}">
											<option selected="selected" value="1">所属领域为垄断性</option>
											<option value="2">同类型产品竞争激烈</option>
											<option value="3">同类型产品竞争不激烈</option>
										</c:if>
										<c:if test="${prototype.pt_compete==2}">
											<option value="1">所属领域为垄断性</option>
											<option selected="selected" value="2">同类型产品竞争激烈</option>
											<option value="3">同类型产品竞争不激烈</option>
										</c:if>
										<c:if test="${prototype.pt_compete==3}">
											<option selected="selected" value="1">所属领域为垄断性</option>
											<option value="2">同类型产品竞争激烈</option>
											<option selected="selected" value="3">同类型产品竞争不激烈</option>
										</c:if>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">渠道特性</label>
								<div class="col-sm-10">
									<select class="form-control" name="pt_ditch" id="pt_ditch">
										<c:if test="${prototype.pt_ditch==1}">
											<option selected="selected" value="1">销售渠道集中</option>
											<option value="2">销售渠道分散</option>
										</c:if>
										<c:if test="${prototype.pt_ditch==2}">
											<option value="1">销售渠道集中</option>
											<option selected="selected" value="2">销售渠道分散</option>
										</c:if>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">目标群体</label>
								<div class="col-sm-10">
									<select class="form-control" name="pt_aimgroup"
										id="pt_aimgroup">
										<c:if test="${prototype.pt_aimgroup==1}">
											<option selected="selected" value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option value="5">大型企业</option>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==2}">
											<option value="1">专业人员</option>
											<option selected="selected" value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option value="5">大型企业</option>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==3}">
											<option value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option selected="selected" value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option value="5">大型企业</option>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==4}">
											<option value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option selected="selected" value="4">中小企业</option>
											<option value="5">大型企业</option>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==5}">
											<option value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option selected="selected" value="5">大型企业</option>
										</c:if>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">简介</label>
								<div class="col-sm-10">
									<textarea class="form-control"
										value="${result.res_introduction}" rows="6"
										name="pt_introduction" id="pt_introduction"></textarea>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-2 control-label">样机附件</label>
								<div class="col-sm-10" style="float: left;">
									<input type="text" value="${upload.upload_name}"
										class="form-control" name="up_idProto" id="up_idProto"
										onblur="checkCited()" required
										data-validation-required-message="Please enter your name.">
									<input type="file" name="file3"
										style="height: 34px; width: 200px">
									<p class="help-block"></p>
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-2 control-label">选择评估截至时间</label>
								<div class="col-sm-10">
									<input type="text" class="form-control Wdate"
										value="${result.res_eva_deadline}"
										onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm:ss'})"
										name="pt_eva_deadline" id="pt_eva_deadline"
										style="height: 40px">
								</div>
							</div>




						</div>

					</div>
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" style="margin-left:36%;width: 600px">提交修改信息</button>
					</div>
				</form>
				<div class="clearfix"></div>




			</div>
			<!-- main end -->

		</div>
	</div>
	</section>
	<!-- main-container end -->


	<jsp:include page="/footer1.jsp" flush="true" />
	<script>
		function identify() {
			var res_type = $("#res_type").val();
			if (res_type == 1) {//expert
				$("#paperResults").css("display", "");
				$("#patentResults").css("display", "none");
				$("#softwareResults").css("display", "none");
				$("#protoTypeResults").css("display", "none");

			}
			if (res_type == 2) {//rp
				$("#patentResults").css("display", "");
				$("#paperResults").css("display", "none");
				$("#softwareResults").css("display", "none");
				$("#protoTypeResults").css("display", "none");
			}
			if (res_type == 3) {//rp
				$("#patentResults").css("display", "none");
				$("#paperResults").css("display", "none");
				$("#softwareResults").css("display", "");
				$("#protoTypeResults").css("display", "none");
			}
			if (res_type == 4) {//rp
				$("#patentResults").css("display", "none");
				$("#paperResults").css("display", "none");
				$("#softwareResults").css("display", "none");
				$("#protoTypeResults").css("display", "");
			}
		}
		/*用window.onload调用identify()*/
		window.onload = identify;//不要括号
	</script>
</body>
</html>
