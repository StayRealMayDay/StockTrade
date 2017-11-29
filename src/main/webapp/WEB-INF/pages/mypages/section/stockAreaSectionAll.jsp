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

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<title>数据中心</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<!-- STYLESHEETS --><!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/css/cloud-admin.css" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/themes/default.css" id="skin-switcher" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/responsive.css" >
	
	<link href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- JQUERY UI-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css" />
	<!-- DATE RANGE PICKER -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
	<!-- DATA TABLES -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/css/jquery.dataTables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/assets/css/datatables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/css/TableTools.min.css" />
	<link href="<%= basePath%>/static/media/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-skins.min.css" />
	<script src="<%= basePath%>/static/media/assets/js/ace-extra.min.js"></script>


<meta charset="utf-8" />
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
</script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
			$(".div2").click(function(){ 
				$(this).next("div").slideToggle("slow")  
				.siblings(".div3:visible").slideUp("slow");
			});
		});
</script>

<style>
.left{ width:180px; height:100%; margin-top:40px;border:1px solid #CCCCCC ;#FFFFFF; color:#000000; font-size:14px; text-align:center;}
.div1{text-align:center; width:180px; }
.div2{height:50px; line-height:40px;cursor: pointer; font-size:13px; position:relative;border-bottom:#ccc 1px dotted;}
.jbsz {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/1.png);}
.xwzx {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/2.png);}
.zxcp {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/4.png);}
.lmtj {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/8.png);}
.div3{display: none;cursor:pointer; font-size:13px; background-color:#E5A2A7;}
.div3 ul{margin:0;padding:0;}
.div3 li{ height:30px; line-height:30px; list-style:none; border-bottom:#ccc 1px dotted; text-align:center;}
.secondary {border:1px solid #CCCCCC;height:1000px;margin-left:20px;margin-top:40px;}
</style>

<body class="home-page">
	<header id="header">
	<div id="header-top">
		<div class="wrapper clearfix">
			<div id="welcome">欢迎进入股票交易平台!</div>
			<!--end:welcome-->
			<nav id="top-nav">
			<ul id="top-menu" class="clearfix">
				<li class="current-menu-item"><a href="index">首页</a></li>
				<li>新闻<span class="caret"></span></a>
					<ul>
						<li><a href="economicNews?pageNum=1">财经新闻</a></li>
						<li><a href="#">时政新闻</a></li>
						<li><a href="chinaSecurityNews?pageNum=1">证券新闻</a></li>
						<li><a href="industryNews?pageNum=1">经营新闻</a></li>
					</ul></li>
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
		</ul>
		<!--end:main-nav--> </nav>
		<!--end:secondary-menu-->
	</div>
	<!--navigation-->
	<div id="header-bottom">
		<div class="wrapper clearfix">
			<div id="headline" class="clearfix">
				<h6>大盘指数</h6>
				<div class="horizontal_scroller">
					<ul class="scrollingtext clearfix">
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399001.gif?1506747237053">
								深圳成指</a>&nbsp;&nbsp;<font color="red">11087.19&nbsp;&nbsp;+55.77&nbsp;&nbsp;+0.51%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsh000001.gif?1506747358051">
						上证指数</a>&nbsp;&nbsp;<font color="red">3348.94&nbsp;&nbsp;+9.3&nbsp;&nbsp;+0.28%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsh000300.gif?1506748303853">
						沪深300</a>&nbsp;&nbsp;<font color="red">3836.50&nbsp;&nbsp;+13.96&nbsp;&nbsp;+0.37%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399006.gif?1506748411586">
						创业板指</a>&nbsp;&nbsp;<font color="red">6508.01&nbsp;&nbsp;+67.9&nbsp;&nbsp;+1.05%</font></li>
						<li> <a href="http://image.sinajs.cn/newchart/hollow/small/nsz399415.gif?1506748372036">
						大数据100</a>&nbsp;&nbsp;<font color="red">1866.98&nbsp;&nbsp;+12.25&nbsp;&nbsp;+0.66%</font></li>
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

	<div >
		<div  style="margin-left:6%">
			<div class="left">
				<div class="div1">
				  <div class="div2"><div class="jbsz"> </div>沪深股票</div>
			      <div class="div3">
					<ul>
						<li><a href="marketIndex?pageNum=1">沪深A股</a></li>
						<li><a href="marketIndexHuA?pageNum=1">沪市A股</a></li>
					    <li><a href="marketIndexShenA?pageNum=1"">深市A股</a></li>
					</ul>
				  </div>
				  <div class="div2"><div class="xwzx"> </div>资金流向</div>
			      <div class="div3">
				      <ul>
						  <li> 资金流向概览</li>
						  <li> 个人资金流向</li>
				          <li> 行业资金流向</li>
				          <li> 主力资金流向</li>
				          <li> 连续资金流向</li>
				       </ul>
			 	  </div>
				  <div class="div2"><div class="zxcp"> </div>大单统计</div>
			      <div class="div3">
				      <ul>
						  <li>即时大单</li>
						  <li> 大单净买</li>
					      <li> 大单静卖</li>
				      </ul>
				  </div>
				  <div class="div2"><div class="lmtj"> </div> 实时排行</div>
				  <div class="div3">
					  <ul>
						 <li> <a href="upRatioRank?pageNum=1">涨幅排行</a></li>
						 <li> <a href="downRatioRank?pageNum=1">跌幅排行</a></li>
				         <!-- <li> 5分钟涨幅</li>
				         <li>5分钟跌幅</li>
				         <li>60分钟涨幅排行</li> -->
				         <li> <a href="turnoverRatioRank?pageNum=1">换手排行</a></li>
				         <li> <a href="turnVolumeRank?pageNum=1">成交额排行</a></li>
				         <li><a href="amplitudeRank?pageNum=1">振幅排行</a></li>
				         <li><a href="equivalentRatioRank?pageNum=1">量比排行</a></li>
					  </ul>
				  </div>
				  <div class="div2"><div class="zxcp"> </div>板块行情</div>
				  <div class="div3">
				      <ul>
						  <li><a href="industrySectionAll">行业版块</a></li>
						  <li><a href="conceptionSectionAll">概念版块</a></li>
					      <li><a href="areaSectionAll">地域板块</a></li>
				      </ul>
				  </div>
				  <div class="div2"><div class="zxcp"> </div>龙虎榜</div>
				  <div class="div3">
				      <ul>
						  <li>个股龙虎榜一览</li>
						  <li>营业部上榜一览</li>
					      <li>机构席位上榜一览</li>
				      </ul>
				  </div>
				   <div class="div2"><div class="zxcp"> </div><a href="dzjy?pageNum=1">大宗交易</a></div>
				  <div class="div3">
				      <ul>
						  <li><a href="dzjy?pageNum=1">股票大宗交易</a></li>
						  <li>基金大宗交易</li>
					      <li>债券大宗交易</li>
				      </ul>
				  </div>
				</div>
			</div>
			
			<div class="secondary" style="width:85%">
			
			<!-- <div id="main-content">
			<div class="container"> -->
				<div class="row">
					<div id="content" class="col-lg-12">
						<!-- PAGE HEADER-->
						<div class="row" >
							<div class="col-sm-12" >
								<div class="page-header" >
									<!-- STYLER -->

									<!-- /STYLER -->
									<!-- BREADCRUMBS -->
									<ul class="breadcrumb" style="width:100%;background-color:#cdc5bf">
										<li><i class="fa fa-home"></i> <a href="index.html">首页></a>
										</li>
										<li><a href="adminSelectAllNews?pageNum=1">板块行情></a></li>
										<li>地域板块</li>
									</ul>
									<!-- /BREADCRUMBS -->
								</div>
							</div>

						</div>


<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
						<div class="modal fade" id="table-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
							  <div class="modal-content modal-table">
								<div class="modal-header">
								  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								  <h4 class="modal-title">Table inside a Modal</h4>
								</div>
								<div class="modal-body">
								  <table class="table table-bordered table-hover">
									<thead>
									  <tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									  </tr>
									</thead>
									<tbody>
									  <tr>
										<td>1</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
									  </tr>
									  <tr>
										<td>2</td>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@fat</td>
									  </tr>
									  <tr>
										<td>3</td>
										<td>Larry</td>
										<td>the Bird</td>
										<td>@twitter</td>
									  </tr>
									</tbody>
									</table>
								</div>
								<div class="modal-footer">
								  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
								</div>
							  </div>
							</div>
						  </div>

						
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border purple">
									<div class="box-title">
										<h4><i class="fa fa-table"></i>股票情况概览</h4>
										<div class="tools hidden-xs">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a>
											<a href="javascript:;" class="reload">
												<i class="fa fa-refresh"></i>
											</a>
											<a href="javascript:;" class="collapse">
												<i class="fa fa-chevron-up"></i>
											</a>
											<a href="javascript:;" class="remove">
												<i class="fa fa-times"></i>
											</a>
										</div>
									</div>
									<div class="box-body">
										<table id="datatable1" cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>股票代码</th>
													<th>名称</th>
													<th>现价</th>
													<th>涨跌幅（%）</th>
													<th>涨跌</th>
													<th>换手（%）</th>
													<th>振幅（%）</th>
													<th>成交额</th>
													<th>流通股</th>
													<th>流通市值</th>
													<th>市盈率</th>
													<th>地区</th>
												</tr>
											</thead>

											<tbody>
												<c:forEach items="${stockAndCompanieList}" var="v" varStatus="sta">
												<tr class="gradeX">
												    <td>${v.stockinfo.stockNum}</td>
													<td><a href="#" title="点击查看此类型新闻详情">${v.stockinfo.stockName}</a></td>
													<td><font color="red">${v.stockinfo.currentPrice}</font></td>
													<td><font color="red">${v.stockinfo.updownRatio}</font></td>
													<td><font color="red">${v.stockinfo.updownPrice}</font></td>
													<td>${v.stockinfo.turnoverRate}</td>
													<td><font color="red">${v.stockinfo.amplitude}</font></td>
													<td>${v.stockinfo.turnVolume}</td>
													<td>${v.stockinfo.floatingStock}</td>
													<td>${v.stockinfo.circulationMarketValue}</td>
													<td>${v.stockinfo.peRatio}</td>
													<td><div style="width:200px;overflow:hidden;text-overflow:ellipsis;white-space:nowrap;">${v.company.companyArea}</div></td>
												</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
												
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	<script src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/assets/js/datatables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/TableTools.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/ZeroClipboard.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/my.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("dynamic_table");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
</body>
</html>