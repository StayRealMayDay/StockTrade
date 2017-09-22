<%@ page language="java" contentType="text/html; charset=UTF-8"  import="com.vcevaluation.pojo.User"  import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	User user = (User)request.getSession().getAttribute("user");
%>
<!DOCTYPE html>
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<title>风险评估系统</title>
		<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
		<meta name="author" content="htmlcoder.me">

		<!-- Mobile Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<jsp:include page="/head.jsp" flush="true"/>
	</head>

    <body class="front">
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>


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

							</div>
							<!-- header-top-second end -->

						</div>
					</div>
				</div>
			</div>
			<!-- header-top end -->

			<!-- header start (remove fixed class from header in order to disable fixed navigation mode) -->
			<!-- ================ --> 
			<jsp:include page="/header1.jsp"></jsp:include>
            <!-- header end -->
            <!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li class="active">个人中心</li>
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
							<aside class="col-md-2"><%-- 
							<jsp:include page="/left.jsp"></jsp:include> --%>
								 <div class="sidebar">
									<div class="block clearfix">
										<h3 class="title">个人中心</h3>
										<div class="separator"></div>
										<nav>
											<ul class="nav nav-pills nav-stacked">
												<li class="active"><a href="/vcevaluation/toIndex">待办事项</a></li>
												<%if(user.getUser_type()==1){%>  
				                                <li><a href="/vcevaluation/selectSubResultByUserId?pageNum=1">查询我提交的成果</a></li>
												<li><a href="/vcevaluation/selectSubProByUserId?pageNum=1">查询我提交的项目</a></li>								
												<li><a href="/vcevaluation/selectNoEvaResult?pageNum=1">查询待评估的成果</a></li>
												<li><a href="/vcevaluation/selectNoEvaProject?pageNum=1">查询待评估的项目</a></li>
												<%}%>
												<%if(user.getUser_type()==0){%>  
												<li><a href="/vcevaluation/selectEvaResultByUserId?pageNum=1">查询我的成果评估记录</a></li>
												<li><a href="/vcevaluation/selectEvaProByUserId?pageNum=1">查询我的项目评估记录</a></li>
												<li><a href="/vcevaluation/selectNoEvaResult?pageNum=1">查询待评估的成果</a></li>
												<li><a href="/vcevaluation/selectNoEvaProject?pageNum=1">查询待评估的项目</a></li>
												<%}%>
											</ul>
										</nav>
									</div>
								   <div class="block clearfix">
										<h3 class="title">资料设置</h3>
										<div class="separator"></div>
										<nav>
											<ul class="nav nav-pills nav-stacked">
												<li><a href="/vcevaluation/userInfo">查看个人资料</a></li>
												<li><a href="/vcevaluation/showUserInfo">修改个人资料</a></li>
											</ul>
										</nav>
									</div>
								</div> 
							</aside>
							<!-- sidebar end -->
	
							<!-- main start -->
							<!-- ================ -->
							<div class="main col-md-10">
	
								<!-- page-title start -->
								<!-- ================ -->
								<h1 class="page-title">您需要做的事情？</h1>
								<div class="separator-2"></div>
								<p style="font-size:20px">您离开的这段时间,<a href="#">新增了哪些项目？新增了哪些成果？</a> 
								<br class="hidden-sm hidden-xs">您<a href="#"><%if(user.getUser_type()==1){%>提交的<%}%><%if(user.getUser_type()==0){%>评估的<%}%></a>成果或项目<a href="#">新增了几项评估记录？</a></p>
								<div class="stats row grid-space-10">
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg"style="height:220px">
										<h3 class="title">新增成果</h3>
										<i class="fa fa-briefcase"></i>
										<span class="stat-num" data-to="${addResNum}" data-speed="3000">${addResNum}</span>
									</div>
								</div>
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg" style="height:220px">
										<h3 class="title">新增项目</h3>
										<i class="fa fa-briefcase"></i>
										<span class="stat-num" data-to="${addProNum}" data-speed="3000">${addProNum}</span>
									</div>
								</div>
								<%if(user.getUser_type()==1){%>  
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg"style="height:220px">
										<h3 class="title">成果评估</h3>
										<i class="fa fa-users"></i>
										<span class="stat-num" data-to="${totaladdSubRes}" data-speed="3000">${totaladdSubRes}</span>
									</div>
								</div>
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg"style="height:220px">
										<h3 class="title">项目评估</h3>
										<i class="fa fa-users"></i>
										<span class="stat-num" data-to="${totaladdSubPro}" data-speed="3000">${totaladdSubPro}</span>
									</div>
								</div>
								
								<%}%>
								<%if(user.getUser_type()==0){%>  
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg"style="height:220px">
										<h3 class="title">成果评估</h3>
										<i class="fa fa-users"></i>
										<span class="stat-num" data-to="${totaladdEvaRes}" data-speed="3000">${totaladdEvaRes}</span>
									</div>
								</div>
								<div class="col-md-3 col-sm-12">
									<div class="box-style-1 default-bg"style="height:220px">
										<h3 class="title">项目评估</h3>
										<i class="fa fa-users"></i>
										<span class="stat-num" data-to="${totaladdEvaPro}" data-speed="3000">${totaladdEvaPro}</span>
									</div>
								</div>
								<%}%>
								</div>
								<!-- page-title end -->
	                            
								<!-- blogpost start -->
								<article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day">${day1}</span>
											<span class="month">${month1} ${year1}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title"><a href="blog-post.html">${r.res_name}</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author1}</a></div>
											</header>
											<p>${r.res_introduction}</p>
										</div>
									</div>
									<footer class="clearfix">
										
										<a class="pull-right link" href="selectaddRes?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多新增成果</span></a>
									</footer>
								</article>
								<article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day">${day2}</span>
											<span class="month">${month2} ${year2}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title"><a href="#">${p.pro_name}</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author2}</a></div>
											</header>
											<p>${p.pro_plan}</p>
										</div>
									</div>
									<footer class="clearfix">
										
										<a class="pull-right link" href="selectaddPro?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多新增项目</span></a>
									</footer>
								</article>
								<!-- blogpost end -->
								<%if(user.getUser_type()==0){%>  
								<article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day"><i class="fa fa-long-arrow-up"></i></a></span>
											<span class="month" style="font-size:28px">${num4}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title">成果(${r3.res_name})新增<a href="#">${num4}项评估记录</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author6}</a></div>
											</header>
											<p>${r3.res_introduction}</p>
										</div>
									</div>
									<footer class="clearfix">
									<ul class="links pull-left">
										<li><i class="fa fa-long-arrow-up"></i> <a href="#">${num4}项新增记录</a> </li> 
									</ul>
									<a class="pull-right link" href="selectaddEvaRes?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多你评估过的成果</span></a>
								    </footer>
									
								</article>
	                            <article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day"><i class="fa fa-long-arrow-up"></i></a></span>
											<span class="month" style="font-size:28px">${num3}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title">项目(${p3.pro_name})新增<a href="blog-post.html">${num3}项评估记录</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author5}</a></div>
											</header>
											<p>${p3.pro_plan}</p>
										</div>
									</div>
									<footer class="clearfix">
									<ul class="links pull-left">
										<li><i class="fa fa-long-arrow-up"></i> <a href="#">${num3}项新增记录</a> </li> 
									</ul>
									<a class="pull-right link" href="selectaddEvaPro?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多你评估过的项目</span></a>
								    </footer>
									
								</article>
						        <%}%>
						        
	                            <%if(user.getUser_type()==1){%>  
	                            <article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day"><i class="fa fa-long-arrow-up"></i></a></span>
											<span class="month" style="font-size:28px">${num2}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title">成果(${r2.res_name})新增<a href="#">${num2}项评估记录</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author4}</a></div>
											</header>
											<p>${r2.res_introduction}</p>
										</div>
									</div>
									<footer class="clearfix">
									<ul class="links pull-left">
										<li><i class="fa fa-long-arrow-up"></i> <a href="#">${num2}项新增记录</a> </li> 
									</ul>
									<a class="pull-right link" href="selectaddSubRes?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多你提交过的成果</span></a>
								    </footer>
									
								</article>
	                            <article class="clearfix blogpost object-non-visible" data-animation-effect="fadeInUpSmall" data-effect-delay="200">
									<div class="blogpost-body">
										<div class="post-info">
											<span class="day"><i class="fa fa-long-arrow-up"></i></a></span>
											<span class="month" style="font-size:28px">${num1}</span>
										</div>
										<div class="blogpost-content">
											<header>
												<h2 class="title">项目(${p2.pro_name})新增<a href="blog-post.html">${num1}项评估记录</a></h2>
												<div class="submitted"><i class="fa fa-user pr-5"></i> by <a href="#">${author3}</a></div>
											</header>
											<p>${p2.pro_plan}</p>
										</div>
									</div>
									<footer class="clearfix">
									<ul class="links pull-left">
										<li><i class="fa fa-long-arrow-up"></i> <a href="#">${num1}项新增记录</a> </li> 
									</ul>
									<a class="pull-right link" href="selectaddSubPro?pageNum=1&lastlogouttime=${lastlogouttime}"><span>更多你提交过的项目</span></a>
								    </footer>
									
								</article>
	                            <%}%>
								
	
							</div>
							<!-- main end -->
	
						</div>
					</div>
				</section>
				<!-- main-container end -->
	


			<!-- footer start (Add "light" class to #footer in order to enable light footer) -->
			<!-- ================ -->
			<jsp:include page="/footer1.jsp" flush="true"/>
		   
			<!-- footer end -->

	</body>
</html>
