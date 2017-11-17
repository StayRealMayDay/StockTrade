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
<title>首页</title>
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
<link rel="shortcut icon" href="<%=basePath %>/images/favicon.ico" />
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.carouFredSel-5.6.2.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.sticky.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-scroller-v1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/kendo.web.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/custom.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="text/javascript" src="http://hq.sinajs.cn/list=s_sz399001,s_sh000300,s_sh000001,s_sz399006,s_sh399415" charset="utf-8"></script>
<script type="text/javascript">
	var elements=hq_str_s_sz399001.split(",");
	var elementss=hq_str_s_sh000300.split(",");
	var elementsss=hq_str_s_sh000001.split(",");
	var elementssss=hq_str_s_sz399006.split(",");
	var element415=hq_str_s_sh399415.split(",");
	$(function () {
		$('#currentprice1').html("当前价格："+"<font color='red'>"+elements[2]+"</font>");
		$('#updownratio1').html("涨跌幅："+"<font color='red'>"+elements[3]+"%</font>");
	    $('#chengjiaoliang1').html("成交量："+elements[4]);
	    $('#chengjiaoe1').html("成交额："+elements[5]);
	    
	    $('#currentprice2').html("当前价格："+"<font color='red'>"+elementss[2]+"</font>");
		$('#updownratio2').html("涨跌幅："+"<font color='red'>"+elementss[3]+"%</font>");
	    $('#chengjiaoliang2').html("成交量："+elements[4]);
	    $('#chengjiaoe2').html("成交额："+elements[5]);
	    
	    $('#currentprice3').html("当前价格："+"<font color='red'>"+elementsss[2]+"</font>");
		$('#updownratio3').html("涨跌幅："+"<font color='red'>"+elementsss[3]+"%</font>");
	    $('#chengjiaoliang3').html("成交量："+elementsss[4]);
	    $('#chengjiaoe3').html("成交额："+elementsss[5]);
	    
	    $('#currentprice4').html("当前价格："+"<font color='red'>"+elementssss[2]+"</font>");
		$('#updownratio4').html("涨跌幅："+"<font color='red'>"+elementssss[3]+"%</font>");
	    $('#chengjiaoliang4').html("成交量："+elementssss[4]);
	    $('#chengjiaoe4').html("成交额："+elementssss[5]);
	    
	    $('#sz399001').html(elements[1]+"&nbsp;&nbsp;"+elements[2]+"&nbsp;&nbsp;"+elements[3]+"%");
	    $('#sh000001').html(elementsss[1]+"&nbsp;&nbsp;"+elementsss[2]+"&nbsp;&nbsp;"+elementsss[3]+"%");
	    $('#sz399006').html(elementssss[1]+"&nbsp;&nbsp;"+elementssss[2]+"&nbsp;&nbsp;"+elementssss[3]+"%");
	    $('#sh000300').html(elementss[1]+"&nbsp;&nbsp;"+elementss[2]+"&nbsp;&nbsp;"+elementss[3]+"%");
	    $('#sh399415').html(element415[1]+"&nbsp;&nbsp;"+element415[2]+"&nbsp;&nbsp;"+element415[3]+"%");
	});
	

</script>


</head>
<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#qwertyui").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}

$(document).ready(function(){ 
	trace("初始化方法进入"); 
	$("#xianshi").css('display','block'); 

	}); 
	function trace(obj){ 
	console.log(obj); 
	}

</script>

<body class="home-page">
	<header id="header">
	<div id="header-top">
		<div class="wrapper clearfix">
			<div id="welcome">欢迎进入股票交易平台!</div>
			<!--end:welcome-->
			<nav id="top-nav">
			<ul id="top-menu" class="clearfix">
				<li class="current-menu-item"><a href="index">首页</a></li>
				<li><a href="marketIndex?pageNum=1">股市行情<span class="caret"></span></a>
					<ul>
						<li><a href="marketIndex?pageNum=1">沪深市场</a></li>
						<li><a href="#">盘中异动</a></li>
						<li><a href="#">全球指数</a></li>
					</ul></li>
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
	<div id="header-middle">
		<div class="wrapper clearfix">
			<div id="logo-image">
				<a href="index.html"><img src="placeholders/logo.png" alt="logo" /></a>
			</div>
		</div>
		<!--wrapper-->

	</div>
	<!--header-middle-->
	<div id="navigation">
		<nav id="secondary-menu" class="wrapper clearfix">
		<ul class="clearfix" id="main-nav">
			<li class="current-menu-item"><a href="index">首页</a></li>
			<li><a href="#">新闻<span class="caret"></span></a>
				<ul>
					<li><a href="economicNews?pageNum=1">财经新闻</a></li>
					<li><a href="#">时政新闻</a></li>
					<li><a href="industryNews?pageNum=1">证券新闻</a></li>
					<li><a href="chinaSecurityNews?pageNum=1">产经新闻</a></li>
				</ul></li>
			<li><a href="#">行情中心<span class="caret"></span></a>
				<ul>
					<!-- <li><a href="#">大盘指数</a></li> -->
					<li><a href="marketIndex?pageNum=1">沪深市场</a></li>
					<li><a href="upRatioRank?pageNum=1">涨速排行</a></li>
					<!-- <li><a href="#">盘中异动</a></li>
					<li><a href="#">即时大单</a></li> -->
					<li><a href="industrySectionAll">行业版块</a></li>
				  <li><a href="conceptionSectionAll">概念版块</a></li>
			      <li><a href="areaSectionAll">地域板块</a></li>
					<li><a href="#">资金流向</a></li>
				</ul></li>
			<li><a href="news.html">数据中心<span class="caret"></span></a>
				<ul>
					<!-- <li><a href="#">涨停温度计</a></li>
					<li><a href="#">涨停强度</a></li>
					<li><a href="#">大盘温度计</a></li> -->
					<li><a href="#">龙虎榜</a></li>
					<li><a href="dzjy?pageNum=1">大宗交易</a></li>
					<li><a href="newStock?pageNum=1">新股申购</a></li>
					<li><a href="#">高送转选股</a></li>
				</ul></li>
			<li><a href="#">操盘必读<span class="caret"></span></a>
				<ul>
					<li><a href="#">涨停板预测</a></li>
					<li><a href="AstockNews?pageNum=1">A股头条</a></li>
				</ul></li>
			<li><a href="#">上市公司<span class="caret"></span></a>
				<ul>
					<li><a href="companyNews?pageNum=1">公司新闻速递</a></li>
					<li><a href="companyNews?pageNum=1">沪市公告</a></li>
					<li><a href="companyNews?pageNum=1">深市公告</a></li>
				</ul></li>
			<li><a href="#">股吧<span class="caret"></span></a>
				<ul>
					<li><a href="shares">热帖总排行</a></li>
					<li><a href="#">热股讨论</a></li>
				</ul></li>
			<li><a href="#">博客<span class="caret"></span></a>
				<ul>
					<li><a href="latestBlog">最新博文</a></li>
					<li><a href="latestBlog">人气排行</a></li>
					<li><a href="latestBlog">热门博文</a></li>
					<li><a href="#">高手看盘</a></li>
				</ul></li>
			<li><a href="newStock?pageNum=1">新股</a></li>
			<li><a href="#">智能选股</a></li>
			<!--同花顺-->
			<li><a href="#">量化回测</a></li>
			<!--同花顺-->
			<li><a href="#">投资组合</a></li>
			<!--同花顺-->
			<!-- <li><a href="#">产业链中心</a></li> -->
		</ul>
		<!--end:main-nav--> </nav>
		<!--end:secondary-menu-->
	</div>
	<!--navigation-->
	<div id="header-bottom">
		<div class="wrapper clearfix">
			<div id="headline" class="clearfix">
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
						创业板指</a>&nbsp;&nbsp;<font color="red" id="sh399006">6508.01&nbsp;&nbsp;+67.9&nbsp;&nbsp;+1.05%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399415.gif?1506748372036">
						大数据100</a>&nbsp;&nbsp;<font color="red" id="sh399415">1866.98&nbsp;&nbsp;+12.25&nbsp;&nbsp;+0.66%</font></li>
					
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
					<form action="company" class="search-form" method="get" />
					<input type="text"
						onBlur="if(this.value=='')this.value='002151';"
						onFocus="if(this.value==this.defaultValue)this.value='';"
						value="股票代码" name="stockNum" class="search-text" /> 
						<input
						type="submit" value="Search" name="submit" class="search-submit" />
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
	<div class="wrapper">
		<div id="main-content">
			<div class="primary" style="width: 525px">
				<div class="slider-box-hover">
					<div class="slider-wrapper">
						<div id="slider" class="nivoSlider">
							<img src="<%=basePath %>/placeholders/slider/slide-1.jpg" alt=""
								title="#slide-caption-1" /> <img
								src="<%=basePath %>/placeholders/slider/slide-2.jpg" alt=""
								title="#slide-caption-2" />
						</div>
						<div id="slide-caption-1" class="nivo-html-caption">
						<header>                    
							<span class="entry-category">时间:${TopNews1.newsTime}&nbsp;</span>
							<h1><a href="single.html">${TopNews1.newsTitle}</a></h1>
						</header>
						<p>内容：${TopNews1.newsContent.substring(0,70)}......</p>
						<span class="entry-author">新闻来源:${TopNews1.newsSource}&nbsp;</span>
						</div>
						<div id="slide-caption-2" class="nivo-html-caption">
							<header>                    
								<span class="entry-category">时间:${TopNews2.newsTime}&nbsp;</span>
								<h1><a href="single.html">${TopNews2.newsTitle}</a></h1>
							</header>
							<p>内容：${TopNews2.newsContent.substring(0,70)}......</p>
							<span class="entry-author">新闻来源:${TopNews2.newsSource}&nbsp;</span>
						</div>      
					</div>
					<!--end:slider-wrapper-->
				</div>
				<!--box-hover-->
				<section id="main-section"> 
					<header class="entry-header">
						<div class="header-inner" style="height:35px">
							<a href="#" style="float:left">热点新闻</a>
						</div>
					</header>
				<div class="article-wrap" style="height: 300px">
					<ol class="w3_tab_list w3_tab_list_home" style="padding:8px;height:300px">
						<c:forEach items="${companyHot}" var="hot"> 
							<li style="height: 25px">
								<a href="companyHotDetail?id=${hot.id}" style="float:left">${hot.newsTitle}</a>
								<span style="float:right">${hot.newsTime}</span>
							</li>
							<div class="clearfix"></div>
						</c:forEach>
					</ol>
				</div>
				<!--article-wrap--> <header class="entry-header">
				<div class="header-inner" style="height:35px">
					<a href="#" style="float:left">最新新闻</a>
				</div>
				<!--header-inner--> </header>
				<div class="article-wrap" style="height: 300px">
					<ol class="w3_tab_list" style="padding:8px;height: 300px">
						<c:forEach items="${companyNewByTime}" var="rowTime">
							<li style="height: 25px">
								<a href="companyHotDetail?id=${rowTime.id}" style="float:left">${fn:substring(rowTime.newsTitle,0,25)}...</a>
								<span style="float:right">${rowTime.newsTime}</span>
							</li>
							<div class="clearfix"></div>
						</c:forEach>
					</ol>
				</div>
				<!--article-wrap--> <header class="entry-header">
				<div class="header-inner" style="height:35px">
					<a href="#" style="float:left">财经新闻</a>
					<a href="economicNews?pageNum=1" style="float:right">更多</a>
				</div>
				<!--header-inner--> </header>
				<div class="article-wrap" style="height:450px;">
					<div class="w3layouts_research_grid scrollbar" id="style-2" style="height:450px;">	
						<table style="width: 100%;">	
							<c:forEach items="${eeolist}" var="r">
							<tr>
								<table style="width: 100%;border-bottom:1px solid #e8eaec;">
									<tr style="width: 100%;height:30px;">
										<td><a href="economicNewsDetail?id=${r.id}">${r.title}</a></td>	
									</tr>
									<tr>
										<td><span>${r.newsTime}</span></td>
									</tr>
									<tr>
										<c:if test="${fn:length(r.newsContent) > 75 }">
											<td>${fn:substring(r.newsContent,0,75)}.....</td>
										</c:if>
										<c:if test="${fn:length(r.newsContent)  <= 75 }">
											<td>${r.newsContent}</td>
										</c:if>									
									</tr>
									
								</table>
							</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				<!--article-wrap--> </section>
			</div>
			<!--end:primary-->
			<div class="secondary">
				<div id="top-sidebar">
					<section class="feature-widget"
						style="border-left:0.5px solid gray"> <header
						style="border-left:0.5px solid gray">
					<h6 class="feature-title">大盘行情</h6><br>
					</header>
					<div class="list-carousel responsive">
						<ul class="feature-news clearfix">
							<li><article>
								<div class="feature-item box-hover clearfix">
								<br>
									<div class="video-thumb">
									<a href="http://image.sinajs.cn/newchart/hollow/small/nsz399001.gif?1506747237053">
										<img style="width=30px;"
											src="http://image.sinajs.cn/newchart/hollow/small/nsz399001.gif?1506747237053"
											alt="" /></a> 
										</a>
									</div>
									<!--video-thumb-->
									<div class="entry-content">
										<span class="entry-meta">On:&nbsp;</span><a class="entry-date"
											href="#">深证成指</a>
										<p id="currentprice1">+12.25</p>
										<p id="updownratio1">0.66%</p>
										<p id="chengjiaoliang1">0.66%</p>
										<p id="chengjiaoe1"></p>
										<br>
									</div>
									<!--end:entry_content-->
								</div>
								</article></li>
							<li><article>
								<div class="feature-item box-hover clearfix">
								<br>
									<div class="video-thumb">
									<a href="http://image.sinajs.cn/newchart/hollow/small/nsh000300.gif?1506748303853">
										<img style="width=30px;"
											src="http://image.sinajs.cn/newchart/hollow/small/nsh000300.gif?1506748303853"
											alt="" /></a> 
										</a>
									</div>
									<!--video-thumb-->
									<div class="entry-content">
										<span class="entry-meta">On:&nbsp;</span><a class="entry-date"
											href="#">沪深300</a>
										<p id="currentprice2">+12.25</p>
										<p id="updownratio2">0.66%</p>
										<p id="chengjiaoliang2">0.66%</p>
										<p id="chengjiaoe2"></p>
										<br>
									</div>
									<!--end:entry_content-->
								</div>
								</article></li>
							<li><article>
								<div class="feature-item box-hover clearfix">
								<br>
									<div class="video-thumb">
									<a href="http://image.sinajs.cn/newchart/hollow/small/nsh000001.gif?1506747358051">
										<img style="width=30px;"
											src="http://image.sinajs.cn/newchart/hollow/small/nsh000001.gif?1506747358051"
											alt="" /></a> 
										</a>
									</div>
									<!--video-thumb-->
									<div class="entry-content">
										<span class="entry-meta">On:&nbsp;</span><a class="entry-date"
											href="#">上证指数</a>
										<p id="currentprice3">+12.25</p>
										<p id="updownratio3">0.66%</p>
										<p id="chengjiaoliang3">0.66%</p>
										<p id="chengjiaoe3"></p>
										<br>
									</div>
									<!--end:entry_content-->
								</div>
								</article></li>
							<li><article>
								<div class="feature-item box-hover clearfix">
								<br>
									<div class="video-thumb">
									<a href="http://image.sinajs.cn/newchart/hollow/small/nsz399001.gif?1506747237053">
										<img style="width=30px;"
											src="http://image.sinajs.cn/newchart/hollow/small/nsz399006.gif?1506748411586"
											alt="" /></a> 
										</a>
									</div>
									<!--video-thumb-->
									<div class="entry-content">
										<span class="entry-meta">On:&nbsp;</span><a class="entry-date"
											href="#">创业版指</a>
										<p id="currentprice4">+12.25</p>
										<p id="updownratio4">0.66%</p>
										<p id="chengjiaoliang4">0.66%</p>
										<p id="chengjiaoe4"></p>
										<br>
									</div>
									<!--end:entry_content-->
								</div>
								</article></li>
						</ul>
						<!--end:feature-news-->
						<div class="clear"></div>
						<div class="feature-nav" id="qwertyui">
							<a id="prev-1" class="prev" href="#">前&nbsp;</a> 
							<a id="next-1" class="next" href="#">后</a>
						</div>
						<!--feature-nav-->
					</div>
					<!--end:list-carousel--> </section>
					<!--end:feature-widget-->
				</div>
				<!--top-sidebar-->
				<div class="sidebar" id="sidebar-a">
					<aside class="widget box-hover"
						style="border-left:0.5px solid gray">
						 <header class="entry-header">
							<h4 class="widget-title clearfix"><span>中证新闻</span><a href="chinaSecurityNews?pageNum=1" style="float:right">更多</a></h4>
							
						 </header> 
						 <ol class="w3_tab_list" style="padding:8px;height: 380px">
								<c:forEach items="${csNews}" var="rowcs">
									<li style="height: 25px">
										<a href="csNewsDetail?id=${rowcs.id}" style="float:left">${fn:substring(rowcs.title,0,16)}...</a>
										<span style="float:right">${rowcs.newsSource}</span>
									</li>
									<div class="clearfix"></div>
								</c:forEach>
						</ol>
					
					</aside>
					<!--end:widget-->
					<aside class="widget box-hover" style="border-left:0.5px solid gray">
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>产经新闻</span><a href="industryNews?pageNum=1" style="float:right">更多</a></h4>
						</header> 
						<div class="w3layouts_research_grid scrollbar" id="style-2">	
							<table style="width: 100%;">	
									<c:forEach items="${cbInfo}" var="rcb">
									<tr>
										<table style="width: 100%;border-bottom:1px solid #e8eaec;">
											<tr style="width: 100%;height:30px;">
												<c:if test="${fn:length(rcb.title) > 15 }">
													<td><a href="cbNewsDetail?id=${rcb.id }">${fn:substring(rcb.title,0,15)}...</a></td>	
												</c:if>
												<c:if test="${fn:length(rcb.title) <= 15 }">
													<td><a href="cbNewsDetail?id=${rcb.id }">${rcb.title}</a></td>	
												</c:if>
											</tr>
											<tr>
												<td><span>${rcb.newsTime}</span></td>
											</tr>
											<tr>
												<c:if test="${fn:length(rcb.newsContent) > 40 }">
													<td>${fn:substring(rcb.newsContent,0,40)}.....</td>
												</c:if>
												<c:if test="${fn:length(rcb.newsContent)  <= 40 }">
													<td>${rcb.newsContent}</td>
												</c:if>									
											</tr>
											
										</table>
									</tr>
									</c:forEach>
							</table>		
						</div>
					</aside>
					<!--end:widget-->
					<aside class="widget box-hover"
						style="border-left:0.5px solid gray">
					<div class="acc-wrapper">
						<div class="accordion-title">
							<h6>
								<a href="#">股吧</a>
							</h6>
						</div>
						<div class="accordion-container" style="height: 320px">
							<ul>
							
							<c:forEach items="${latestSharesList}" var="rowo" begin='0' end='5'>
												
											<li><article class="clearfix"> 
											<a href="sharesDetail?sharesId=${rowo.sharesId}">${rowo.sharesTitle}</a>${rowo.author} </article></li>
							</c:forEach>
							</ul>
						</div>
						<div class="accordion-title">
							<h6>
								<a href="#">论坛</a>
							</h6>
						</div>
						<div class="accordion-container" style="height: 320px">
							<ul>
							
								<c:forEach items="${latestSharesList}" var="rowo" begin='0' end='5'>
												
											<li><article class="clearfix"> 
											<a href="sharesDetail?sharesId=${rowo.sharesId}">${rowo.sharesTitle}</a>${rowo.author} </article></li>
								</c:forEach>
							</ul>
						</div>
						<div class="accordion-title">
							<h6>
								<a href="#">博客</a>
							</h6>
						</div>
						<div class="accordion-container" style="height: 320px">
							<ul>
								<c:forEach items="${latestBlogList}" var="rowo" begin='0' end='5'>
											<li><article class="clearfix"> 
											<a href="blogDetail?blogId=${blogId}">${rowo.blogTittle} </a> ${rowo.blogAuthor}</article></li>
								</c:forEach>
								
							</ul>
						</div>
					</div>
					<!--end:acc-wrapper--> </aside>
					<!--end:widget-->
					<div class="clear"></div>
				</div>
				<!--end:sidebar-->
				<div id="sidebar-b" class="sidebar">
					<aside class="widget box-hover" style="border-left:0.5px solid gray">
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>A股即时行情数据</span></h4>
						</header>
					 	<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
							<li role="presentation" class="active">
								<a href="#hu" id="hu_tab" role="tab" data-toggle="tab" aria-controls="huTab" aria-expanded="true">沪A</a>
							</li>
							<li role="presentation">
								<a href="#shen" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">深A</a>
							</li>
						</ul>
						<div  class="tab-content">
							<div role="tabpanel" class="tab-pane fade in active" id="hu" aria-labelledby="hu_tab">
								<div class="w3l_stocks" style="width: 100%;">
									<table style="width: 100%;">
										<thead>
										<tr style="width: 100%;height:40px;font-size:15px">
											<th style="width: 33%;">股票名称</th>
											<th style="width: 33%;">股票代码</th>
											<th style="width: 33%;">涨跌幅</th>
										</tr>
										</thead>
										<tbody>
											<c:forEach items="${stockHuA}" var="huA">
												<tr style="width: 100%;height:30px">
													<td><a href="company?stockNum=${huA.stockNum}">${huA.stockName}</a></td>
													<td>${huA.stockNum}</td>
													<td>${huA.updownRatio}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="shen" aria-labelledby="shen-tab">
								<div class="w3l_stocks">
									<table style="width: 100%;">
										<thead>
										<tr style="width: 100%;height:40px;font-size:15px">
											<th style="width: 33%;">股票名称</th>
											<th style="width: 33%;">股票代码</th>
											<th style="width: 33%;">涨跌幅</th>
										</tr>
										</thead>
										<tbody>
											<c:forEach items="${stockShenA}" var="shenA">
												<tr style="width: 100%;height:30px">
													<td><a href="company?stockNum=${shenA.stockNum}">${shenA.stockName}</a></td>
													<td>${shenA.stockNum}</td>
													<td>${shenA.updownRatio}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</aside>
					<!--end:widget-->
					<aside class="widget box-hover" style="border-left:0.5px solid gray"> 
						<header class="entry-header">
						<h4 class="widget-title">北斗卫星导航相关股票</h4>
						</header>
						<div class="w3l_stocks">
							<table style="width: 100%;">
								<thead>
								<tr style="width: 100%;height:40px;font-size:15px">
									<th style="width: 33%;">股票名称</th>
									<th style="width: 33%;">股票代码</th>
									<th style="width: 33%;">涨跌幅</th>
								</tr>
								</thead>
								<tbody>
									<c:forEach items="${stockBeiDou}" var="beiDou">
										<tr style="width: 100%;height:30px">
											<td><a href="company?stockNum=${beiDou.stockNum}">${beiDou.stockName}</a></td>
											<td>${beiDou.stockNum}</td>
											<td>${beiDou.updownRatio}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</aside>
					<aside class="widget box-hover" style="border-left:0.5px solid gray"> 
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>个人股票中心</span></h4>
						</header>
						<ul  id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
							<li role="presentation" class="active">
								<a href="#mystock" id="my_tabstock" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">自选股</a>
							</li>
							<li role="presentation">
								<a href="#my_news" role="tab" id="news-tabnew" data-toggle="tab" aria-controls="newTab">自选股新闻</a>
							</li>
						</ul>	
						<div id="xianshi" class="tab-content" >
							<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tabstock">
								<div class="w3l_stocks" style="padding-top:5px">
									<table style="width: 100%;">
									<thead>
										<tr style="width: 100%;height:40px;font-size:12px ">
											<th style="width: 25%;">股票名称</th>
											<th style="width: 25%;">股价</th>
											<th style="width: 25%;">涨跌幅</th>
											<th style="width: 25%;">转手率</th>
										</tr>
									</thead>	
									<tbody>
										<c:forEach items="${stockInfo}" var="rowo" >
											<tr style="width: 100%;height:30px;">
												<td style="font-size:12px"><a href="company?stockNum=${rowo.stockNum}">${rowo.stockName}</a></td>
												<td>${rowo.currentPrice}</td>
												<td>${rowo.updownRatio}</td>
												<td>${rowo.turnoverRate}</td>
											</tr>
										</c:forEach>
									</tbody>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tabnew">
								<div class="w3l_stocks" style="padding:2px">
									<ul id="myTab1" class="nav nav-tabs" role="tablist" >
										<c:forEach items="${news}" var="row" begin="8" end="12" >
											<li><a style="font-size: 15px;" href="companySingle">${row.newsTitle}</a></li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</div>
					</aside>
					<!--end:widget-->
					<div class="clear"></div>
				</div>
				<!--end:sidebar-->
				<div class="clear"></div>
			</div>
			<!--end:secondary-->
			<div class="clear"></div>
			<div id="footer-aside" class="box-hover">
				<aside class="widget">
				<div class="adv-footer">
					<a class="banner-bottom-left" href="#"><img
						class="hover-effect responsive-img"
						src="<%=basePath %>/placeholders/728x90-banner.jpg" alt="" /></a> <a
						class="banner-bottom-right" href="#"><img
						class="hover-effect responsive-img ml-10"
						src="<%=basePath %>/placeholders/220x90/sample-ad-3.jpg" alt="" /></a>
				</div>
				<!--end:adv-footer-->
				<div class="clear"></div>
				</aside>
			</div>
			<!--end:footer-aside-->
			<footer>
			<div class="wrapper clearfix">
				<p id="copyrights">
					Copyright © 2012 KopaTheme. All Rights Reserved. More Templates <a
						href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
				</p>
				<a id="scroll-to-top" href="#top">Back to top</a>
			</div>
			<!--end:wrapper--> </footer>
		</div>
		<!--main-content-->
	</div>
	<!--end:wrapper-->
</body>
<script type="text/javascript">
        var arr = ['s_sh000001', 's_sh000002', 's_sh000003', 's_sh000004', 's_sh000005', 's_sh000006'];
        var _webInfPath = 'http://hq.sinajs.cn/list=';
        $.ajaxSetup({
            cache: true
        });
        
        $(document).ready(function () {
            inittable();
            show();
            //以后每间隔5秒刷新一次行情更新
            setInterval("show()", 5000);
        });
         
        //刷新行情并显示在对应单元格里 
        function show() {
            //动态载入api的js,得到数据后直接使用返回的js变量
            $.getScript(_webInfPath, function () {       
                var acode = "";
                var astock = "";
                var atitle = "";
                //遍历股票数组，根据得到返回动态hq_str_gb_xxx 变量结果，取对应内容赋值给对应id的单元格
                $.each(arr, function (key, val) {
                    //根据字符串得到字符串变量，使用eval函数 acode="hq_str_gb_bidu"  访问eval(acode) 等价于访问变量  hq_str_gb_bidu
                    //对应指定id的得到其选择器,aid="#abc" $(aid) 等价于 $("#abc")
                    astock = val.split(",")[0];
                    acode = "hq_str_" + astock;
                    atitle = eval(acode).split(",")[0];
					$("#" + astock + "name").text(atitle);
                    $("#" + astock + "curdot").text(eval(acode).split(",")[1] );
                    $("#" + astock + "curprice").text(eval(acode).split(",")[2] );
					if ((eval(acode).split(",")[2]) > 0) {
                        console.log("red");
                        $("#" + astock + "curprice").css('color', 'red');
                    } else {
                        $("#" + astock + "curprice").css('color', 'green');
                    }
					$("#" + astock + "updownrate").text(eval(acode).split(",")[3] + "%");
					if ((eval(acode).split(",")[3]) > 0) {
                        console.log("red");
                        $("#" + astock + "updownrate").css('color', 'red');
                    } else {
                        $("#" + astock + "updownrate").css('color', 'green');
                    }
 
                   //美股和A股的接口不一样，美股的是[1],A股是[3]，具体自己调试看各个字段内容含义
                  
                });

            });       
        };

        //根据股票数字，动态创建内容表格
        function inittable()
        {
            var astock = "";
            var buy1 = "";
            var sell1 = "";
            var sell2 = "";
            var linkurl = "http://hq.sinajs.cn/list=";
            $.each(arr, function (key, val) {
                atock = val.split(",")[0];
				
             //  var alist = '<tr><td  class="code"><a class="tip" target="_new" href="' + linkurl + atock + '" id="' + atock + 'link">' + atock.toLowerCase() + '</a></td><td id="' + atock + 'name"></td><td id="' + atock + 'curdot"></td><td id="' + atock + 'curprice"></td><td id="' + atock + 'updownrate"></td><td id="' + atock + 'turnnum"></td><td id="' + atock + 'turnmoney"></td></tr>';
                
				var alist = '<ul  class="scrollingtext clearfix"><li><a href="#" id="' + atock + 'name"></a></li><li id="' + atock + 'curdot"></li><li id="' + atock + 'curprice"></li></li><li id="' + atock + 'updownrate"></li><li>aaa</li></ul>';
				_webInfPath = _webInfPath  + atock + ',';
                $("#indexdisplay").append(alist);
            });

        }

    </script>
</html>