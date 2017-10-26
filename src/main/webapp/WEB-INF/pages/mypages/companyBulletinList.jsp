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
<title>涉及到的公告</title>
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

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

<div class="wrapper">
	<div id="main-content">
		<div class="primary" style="float:left;width:800px;height:885px">
		<ul id="myTab1" class="col-md-12 nav nav-tabs" role="tablist" >					
			<c:forEach items="${newsList}" var="row">	
				<li style="width:800px">
					<article class="entry-item box-hover clearfix">
						<table>
							<tr>
								<div style="width:700px">										
									<c:if test="${fn:length(row.title) > 30 }">
										<td>
											<a style="font-size: 20px;" href="companyBulletinDetail?id=${row.id }">
												${fn:substring(row.title,0,30)}...
											</a>
										</td>
									</c:if>
									<c:if test="${fn:length(row.title) <= 30 }">
										<td>
											<a style="font-size: 20px;" href="companyBulletinDetail?id=${row.id }">
												${row.title}
											</a>
										</td>
									</c:if>
								</div>
							</tr>
							<tr><td>${row.time}</td></tr>
							<tr>
								<div>
									<c:if test="${fn:length(row.content) > 100 }">
										<td>
											${fn:substring(row.content,0,100)}...
										</td>
									</c:if>
									<c:if test="${fn:length(row.content) <= 100 }">
										<td>
											${row.content}
										</td>
									</c:if>
								</div>
							</tr>
						</table>
					</article>							
				</li>
				<input type="hidden" name="pageNum" value="${pager.pageNum}">
			</c:forEach>
		</ul>
		</div><!--end:primary-->
		<div class="secondary" style="float:right;width:200px">
			<div id="sidebar-b" class="sidebar" style="float:right;">
				<aside class="widget box-hover">
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
													<td><a href="company">${huA.stockName}</a></td>
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
													<td><a href="company">${shenA.stockName}</a></td>
													<td>${shenA.stockNum}</td>
													<td>${shenA.updownRatio}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>	
				</aside><!--end:widget-->
				<aside class="widget box-hover">
					<header class="entry-header">
						<h4 class="widget-title">新股申购</h4>
					</header>
					<div class="newsletter">
						<div class="wpcf7">
							<form class="wpcf7-form" method="post" action="#" />
							<p>Enter your email address below to receive updates each
								time we publish new content</p>
							<p>
								<span class="wpcf7-form-control-wrap your-email"><input
									type="text" size="40"
									class="wpcf7-form-control wpcf7-text wpcf7-email" value=""
									name="your-email" /></span> <input type="submit"
									class="wpcf7-form-control  wpcf7-submit" value="Submit" />
							</p>
							</form>
						</div>
					</div>
				</aside><!--end:widget-->
				<aside class="widget box-hover">
					<div class="adv-125-125 clearfix">
						<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
						<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
						<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
						<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
					</div>
				</aside><!--end:widget--> 
				<div class="clear"></div>
			</div><!--end:sidebar-->
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div style="height:400px"></div>
		<div >
			<aside class="widget" style="height:100px">
				<div class="pull-left">
					<div class="dataTables_info" id="datatable1_info">显示 1 to
						${pager.pageSize } 总共 ${pager.recordCount }条</div>
				</div>
					<div class="pull-right">
					<div class="dataTables_paginate paging_bs_full" id="datatable1_paginate" style="height:50px">
						<ul class="pagination" style="padding-left: 0;margin: 20px 0;display: inline-block;">
							<li><a href="#">共 ${pager.recordCount} 条数据，每页
									${pager.pageSize } 条，共 ${pager.pageCount} 页，当前是第
									${pager.pageNum } 页</a>
							</li>
						</ul>
						<ul class="pagination" style="padding-left: 0;margin: 20px 0;display: inline-block;">
							<li ${pager.pageNum==1?'class="disabled"':''}><a
								href="industryNews?pageNum=1">首页</a></li>
							<li ${pager.pageNum==1?'class="disabled"':''}><a
								href="industryNews?pageNum=${pager.pageNum-1 }">上页</a></li>
							<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
								href="industryNews?pageNum=${pager.pageNum+1 }">下页</a></li>
							<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
								href="industryNews?pageNum=${pager.pageCount }">末页</a></li>
							<li><a>转到 </a></li>
							<li><a><input id="changePage" type="text"
									style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
							<li><a>页 </a></li>
							<li><a href="javascript:goPage();">跳转</a></li>

						</ul>
					</div>
				</div>
				<div class="clear"></div>
			</aside>
		</div><!--end:footer-aside-->	
	
		<div id="footer-aside" class="box-hover">
			<aside class="widget">
				<div class="adv-footer">
					<a class="banner-bottom-left" href="#"><img class="hover-effect responsive-img" src="placeholders/728x90-banner.jpg" alt="" /></a>
					<a class="banner-bottom-right" href="#"><img class="hover-effect responsive-img ml-10" src="placeholders/220x90/sample-ad-3.jpg" alt="" /></a>
				</div><!--end:adv-footer-->
				<div class="clear"></div>
			</aside>
		</div><!--end:footer-aside-->	
		<footer>
			<div class="wrapper clearfix">
				<p id="copyrights">Copyright © 2012 KopaTheme. All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>   <a id="scroll-to-top" href="#top">Back to top</a>
			</div><!--end:wrapper-->
		</footer>
	</div><!--main-content-->
</div><!--end:wrapper-->

</body>
</html>