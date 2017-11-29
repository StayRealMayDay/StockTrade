<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>公司导航栏</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<!-- 于花蕾 2017年9月27 -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet"type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet"type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<script src="<%=basePath %>/js/bootstrap.min.js"></script>

<!--[if IE 7]><link rel="stylesheet" href="css/ie7.css" type="text/css" media="all" />
	<![endif]-->
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<link rel="stylesheet" href="css/ie.css" type="text/css" media="all" />
	<![endif]-->
<!-- Favicons
	================================================== -->
<link rel="shortcut icon" href="<%=basePath %>/images/favicon.ico" />

<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
 select{display:none;}
</style>
</head>
<body class="home-page">
	<header id="header">
	<div id="header-top">
		<div class="wrapper clearfix" >
			<div id="welcome">欢迎进入股票交易平台!</div>
			<!--end:welcome-->
			<nav id="top-nav">
				<ul id="top-menu" >
					<li class="current-menu-item" ><a href="index">首页</a></li>
					<li><a href="marketIndex?pageNum=1">股市行情<span class="caret"></span></a>
						<ul>
							<li><a href="marketIndex?pageNum=1">沪深市场</a></li>
							<li><a href="#">盘中异动</a></li>
							<li><a href="#">全球指数</a></li>
						</ul>
					</li>
					<li><a href="#">我的自选股</a></li>
					<li><a href="#">联系我们</a></li>
					<li><a href="#">登录</a></li>
					<li><a href="#">注册</a></li>
					<li><a href="adminLogin">后台</a></li>
				</ul>
			</nav>
			<!--end:top-nav-->
		</div>
		<!--wrapper-->
	</div>
	<!--header-top-->

	<div id="header-middle" style="height:100px">
		<div class="wrapper clearfix">
			<div id="logo-image">
				<a href="index.html"><img src="placeholders/logo.png" alt="logo" /></a>
			</div>
		</div>
		<!--wrapper-->

	</div>
	<!--header-middle-->
	<div id="navigation" style="height:50px;width:100%">
		<ul id="main-nav" style="height:50px;width:100%;margin-left:400px">
			<li class="current-menu-item"><a href="#">首页概览</a>
				<ul>
					<li><a href="#">行情走势</a></li>
					<li><a href="#">最新消息</a></li>
					<li><a href="#">龙虎榜</a></li>
					<li><a href="#">大宗交易</a></li>
				</ul>
			</li>
			<li><a href="#">资金流向<span class="caret"></span></a>
				<ul>
					<li><a href="#">实时资金流向</a></li>
					<li><a href="#">主力资金流向</a></li>
					<li><a href="#">历史资金数据一览</a></li>
				</ul>
			</li>
			<li><a href="#">公司资料<span class="caret"></span></a>
				<ul>
					<li><a href="#">详细情况</a></li>
					<li><a href="#">高管介绍</a></li>
					<li><a href="#">发行相关</a></li>
					<li><a href="#">参股控股公司</a></li>
				</ul>
			</li>
			<li><a href="#">新闻公告<span class="caret"></span></a>
				<ul>
					<li><a href="#">公司公告</a></li>
					<li><a href="#">相关研报</a></li>
				</ul>
			</li>
			<li><a href="#">行业分析<span class="caret"></span></a>
				<ul>
					<li><a href="#">行业地位</a></li>
					<li><a href="#">行业新闻</a></li>
				</ul>
			</li>
			<li><a href="#">股东股本<span class="caret"></span></a>
				<ul>
					<li><a href="#">股东人数</a></li>
					<li><a href="#">十大流通股东</a></li>
					<li><a href="#">十大股东</a></li>
					<li><a href="#">总股本构成</a></li>
				</ul>
			</li>
		
			<li><a href="#">博客<span class="caret"></span></a>
				<ul>
					<li><a href="latestBlog">公司相关博文</a></li>
					<li><a href="latestBlog">人气排行</a></li>
					<li><a href="latestBlog">热门博文</a></li>
				</ul>
			</li>
			<!-- <li><a href="newStock?pageNum=1">新股</a></li>
			<li><a href="#">智能选股</a></li>
			<li><a href="#">量化回测</a></li>
			<li><a href="#">投资组合</a></li> -->
		</ul>
	</div>
	<div class="clearfix"></div>
	<!--navigation-->
	<div id="header-bottom">
		<div class="wrapper">
			<div id="headline" >
				<h6>大盘指数</h6>
				<div class="horizontal_scroller" style="width:80%;height:30px">
					<ul class="scrollingtext clearfix">
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399001.gif?1506747237053">
								深圳成指</a>&nbsp;&nbsp;<font color="red" id="sz399001">11087.19&nbsp;&nbsp;+55.77&nbsp;&nbsp;+0.51%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsh000001.gif?1506747358051">
						上证指数</a>&nbsp;&nbsp;<font color="red" id="sh000001">3348.94&nbsp;&nbsp;+9.3&nbsp;&nbsp;+0.28%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsh000300.gif?1506748303853">
						沪深300</a>&nbsp;&nbsp;<font color="red" id="sh000300">3836.50&nbsp;&nbsp;+13.96&nbsp;&nbsp;+0.37%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399006.gif?1506748411586">
						创业板指</a>&nbsp;&nbsp;<font color="red" id="sz399006">6508.01&nbsp;&nbsp;+67.9&nbsp;&nbsp;+1.05%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399415.gif?1506748372036">
						大数据100</a>&nbsp;&nbsp;<font color="red" id="sz399415">1866.98&nbsp;&nbsp;+12.25&nbsp;&nbsp;+0.66%</font></li>
					
					</ul>
					
				</div>
			</div>
			<!--end:headline-->
			<div id="search-social" class="clearfix">
				<ul class="social-links clearfix">
					<li class="facebook-icon"><a target="_blank" title="Facebook"
						class="facebook" href="#"> <img
							src="<%=basePath %>/images/icons/facebook-icon.png" alt="" />
					</a></li>
					<li class="twitter-icon"><a target="_blank" title="Twitter"
						class="twitter" href="#"> <img
							src="<%=basePath %>/images/icons/twitter-icon.png" alt="" />
					</a></li>
					<li class="rss-icon"><a target="_blank" title="RSS" href="#">
							<img src="<%=basePath %>/images/icons/rss-icon.png" alt="" />
					</a></li>
					<li class="dribble-icon"><a target="_blank" title="Dribble"
						class="dribble" href="#"> <img
							src="<%=basePath %>/images/icons/dribble-icon.png" alt="" />
					</a></li>
				</ul>
				<!--end:social-links-->
				<div class="search-box clearfix">
					<form action="#" class="search-form" method="get" />
					<input type="text"
						onBlur="if(this.value=='')this.value=this.defaultValue;"
						onFocus="if(this.value==this.defaultValue)this.value='';"
						value="Search" name="s" class="search-text" /> <input
						type="submit" value="" name="submit" class="search-submit" />
					</form>
					<!-- search-form -->
				</div>
				<!--end:search-box-->
			</div>
			<!--search-social-->
		</div>
		<!--end:wrapper-->
	</div>
	<!--header-bottom-->
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/">Website Template</a>
	</div>

	</header>
<%-- <script type="text/javascript" src="<%=basePath %>/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.carouFredSel-5.6.2.js"></script> --%>
<%-- <script type="text/javascript" src="<%=basePath %>/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.sticky.js"></script> --%>
<%-- <script type="text/javascript" src="<%=basePath %>/js/jquery-scroller-v1.min.js"></script> --%>
<%-- <script type="text/javascript" src="<%=basePath %>/js/kendo.web.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/custom.js"></script>	 --%>
</body>
</html>