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
<title>市场估值</title>
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
		
		<div class="secondary" style="float:right;width:200px">
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div >
		
				<table style="width:800px;margin-left:100px;border-collapse:separate;border-spacing:10px;">
					<tr style="background-color:#F8F8FF">
						<th>股票代码</th>
						<th>股票名称</th>
						<th>当前价格</th>
						<th>涨跌幅</th>
						<th>换手率</th>
						<th>市盈率</th>
						<th>流通市值</th>
						<th>交易量</th>
						<th>流通股</th>
						<th>所在行业</th>
					</tr>
					<c:forEach items="${stockListSim }" var="v">
						<tr>
							<td>${v.stockNum }</td>
							<td><a href="company?stockNum=${v.stockNum}">${v.stockName}</a></td>
							<td>${v.currentPrice }</td>
							<td>${v.updownRatio }</td>
							<td>${v.turnoverRate }</td>
							<td>${v.peRatio }</td>
							<td>${v.turnVolume }</td>
							<td>${v.floatingStock }</td>
							<td>${v.circulationMarketValue }</td>
							<td>${v.company.industry }</td>
						</tr>
					</c:forEach>
					
				</table>
		</div>
			
	
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