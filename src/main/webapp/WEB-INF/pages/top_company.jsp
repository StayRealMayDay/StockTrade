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
<link href="css/css.css" rel="stylesheet" type="text/css" />
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
	    
	    $('#sz399001').html(elements[1]+"&nbsp;&nbsp;"+elements[2]+"&nbsp;&nbsp;"+elements[3]+"%");
	    $('#sh000001').html(elementsss[1]+"&nbsp;&nbsp;"+elementsss[2]+"&nbsp;&nbsp;"+elementsss[3]+"%");
	    $('#sz399006').html(elementssss[1]+"&nbsp;&nbsp;"+elementssss[2]+"&nbsp;&nbsp;"+elementssss[3]+"%");
	    $('#sh000300').html(elementss[1]+"&nbsp;&nbsp;"+elementss[2]+"&nbsp;&nbsp;"+elementss[3]+"%");
	    $('#sh399415').html(element415[1]+"&nbsp;&nbsp;"+element415[2]+"&nbsp;&nbsp;"+element415[3]+"%");
	});
</script>
<script>
var def="1";
function mover(object){
  var mm=document.getElementById("m_"+object);
  mm.className="m_li_a";
  
  if(def!=0){
    var mdef=document.getElementById("m_"+def);
    mdef.className="m_li";
  }
  var ss=document.getElementById("s_"+object);
  ss.style.display="block";
  if(def!=0){
    var sdef=document.getElementById("s_"+def);
    sdef.style.display="none";
  }
}

function mout(object){
  var mm=document.getElementById("m_"+object);
  mm.className="m_li";
  if(def!=0){
    var mdef=document.getElementById("m_"+def);
    mdef.className="m_li_a";
  }
  var ss=document.getElementById("s_"+object);
  ss.style.display="none";
  if(def!=0){
    var sdef=document.getElementById("s_"+def);
    sdef.style.display="block";
  }
}
</script>
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
		<div id="menu">
		  <ul>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_1" class='m_li_a'><a href="company?stockNum=${company.stockNum}">首页概览</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_2" class='m_li' onmouseover='mover(2);' onmouseout='mout(2);'><a href="#">资金流向</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_3" class='m_li' onmouseover='mover(3);' onmouseout='mout(3);'><a href="company_detail?beiDou=${company.stockNum}">公司资料</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_4" class='m_li' onmouseover='mover(4);' onmouseout='mout(4);'><a href="shareholderEquity?stockNum=${company.stockNum}">股东股本</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_5" class='m_li' onmouseover='mover(5);' onmouseout='mout(5);'><a href="financialAnalysis?stockNum=${company.stockNum}">财务分析</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_6" class='m_li' onmouseover='mover(6);' onmouseout='mout(6);'><a href="#">新闻公告</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		    <li id="m_7" class='m_li' onmouseover='mover(7);' onmouseout='mout(7);'><a href="industryInfor?stockNum=${company.stockNum}">行业分析</a></li>
		    <li class="m_line"><img src="images/line1.gif" /></li>
		  </ul>
		</div>
		<div style="height:32px; background-color:#F1F1F1;">
		  <ul class="smenu">
		    <li style="padding-left:10px;" id="s_1" class='s_li_a'>
		    	<a href="#">行情走势</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">最新消息</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">龙虎榜</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="oneDzjy?stockId=${company.stockNum}">大宗交易</a>
		    </li>
		    <li style="padding-left:110px;" id="s_2" class='s_li' onmouseover='mover(2);' onmouseout='mout(2);'>
		    	<a href="#">实时资金流向</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">主力资金流向</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">历史资金数据一览</a>
		    </li>
		    <li style="padding-left:220px;" id="s_3" class='s_li' onmouseover='mover(3);' onmouseout='mout(3);'>
		    	<a href="#">详细情况</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">高管介绍</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="j#">发行相关</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">参股控股公司</a>
		    </li>
		    <li style="padding-left:300px;" id="s_4" class='s_li' onmouseover='mover(4);' onmouseout='mout(4);'>
		    	
		    	<a href="#">股东人数</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">十大流通股东</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">十大股东</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#" target="_blank">总股本构成</a>
		    </li>
		    <li style="padding-left:350px;" id="s_5" class='s_li' onmouseover='mover(5);' onmouseout='mout(5);'>
		    	<a href="#">财务指数</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">指数变动说明</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">资产负债构成</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">杜邦分析结构图</a>
		    </li>
		    <li style="padding-left:570px;" id="s_6" class='s_li' onmouseover='mover(6);' onmouseout='mout(6);'>
		    	<a href="#">公司公告</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">相关研报</a>
		    </li>
		    <li style="padding-left:610px;" id="s_7" class='s_li' onmouseover='mover(7);' onmouseout='mout(7);'>
		    	<a href="#">行业地位</a>&nbsp;&nbsp;|&nbsp;&nbsp;
		    	<a href="#">行业新闻</a>
		    </li>
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
	
</body>
</html>