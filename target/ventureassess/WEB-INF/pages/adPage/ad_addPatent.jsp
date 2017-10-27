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

					<h2 class="text-center title">专利提交</h2>
								<div class="separator"></div>
								<p class="text-center">请输入专利基本信息</p>
			<form action="addPatent1" method="post"  Content-Range="bytes 0-800/801" enctype="multipart/form-data">
                <div class="col-lg-6 col-md-6 col-sm-6 contact-agile1">    
					<div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">专利名称:</label>
                            <input type="text" class="form-control" name="pa_name" id="pa_name" onblur="checkPaname()" required data-validation-required-message="Please enter your name.">
                            <label id="validate_paname" style="font-size:9px;display:none;"></label>
                            <p class="help-block"></p>
                        </div>
                    </div>	
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">专利类型</label>
							<select class="form-control" id="pa_type" name="pa_type">
									<option value="1">发明类(产品)</option>
									<option value="2">发明类(方法)</option>
									<option value="3">外观设计类</option>
									<option value="4">实用新型类</option>
							</select>
							<p class="help-block"></p>
						</div>
                    </div>
                   <!-- <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">专利发明人:</label>
                            <input type="text" class="form-control" name="pa_inventor" id="pa_inventor" required data-validation-required-message="Please enter your name.">
                            <p class="help-block"></p>
                        </div>
                    </div> -->
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 contact-agile2">
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">申请时间:</label>
                           <input type="text"  class="form-control Wdate" onFocus="WdatePicker({lang:'zh-cn',maxDate:new Date()})" name="pa_pubtime" id="pa_pubtime"style="height:40px"/>
                             <!--  <input type="date" class="form-control" name="pa_pubtime" id="pa_pubtime"/>
                           <input type="text" class="form-control" name="pa_pubtime" id="pa_pubtime" required data-validation-required-message="Please enter your email address.">
							-->
							<p class="help-block"></p>
						</div>
                    </div>
					<div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">专利号:</label>
                            <input type="text" class="form-control" name="pa_number" id="pa_number" required data-validation-required-message="Please enter Subject.">
                            <p class="help-block"></p>
                        </div>
                    </div>
                    <div class="control-group form-group">
                        <div class="controls">
						 <label class="contact-p1">专利附件:</label>
						 <input type="file" name="file2" style="height:34px;width:200px">
							<p class="help-block"></p>
						</div>
                    </div>
				</div>
				<div class="col-lg-12">	
                    <div class="control-group form-group">
                        <div class="controls">
                            <label class="contact-p1">原理性阐述:</label>
                            <textarea rows="10" cols="100" class="form-control" name="pa_details" id="pa_details" required data-validation-required-message="Please enter your introduction" maxlength="999" style="resize:none"></textarea>
							<p class="help-block"></p>
                        </div>
                    </div>
                    <div id="success"></div>
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
                    <!-- For success/fail messages -->
                    <button type="submit" class="btn btn-default" style="margin-left:40%;width:210px;">专利提交</button>
				</div>
				<div class="clearfix"></div>	
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
