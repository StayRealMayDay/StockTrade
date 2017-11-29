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

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

<div  style="float:left;margin-left:300px">
			<jsp:include page="/left_value.jsp" flush="true" />
</div>
<div class="wrapper" style="float:left">
	<div id="main-content">
		
		<div class="secondary" style="float:right;width:200px">
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div style="height:800px">
		
		<table style="width:100% margin-top:20px">
			<tr>
				<th>董事会预案公告日</th>
				<th>预案阶段复牌日</th>
				<th>董事征集投票权起始日</th>
				<th>董事征集投票权截止日</th>
				<th>股东大会公告日</th>
				<th>现场股东大会登记起始日</th>
			</tr>
			<tr>
				<td>2015-6.4</td>
				<td>2015-6.4</td>
				<td>2015-6.4</td>
				<td>2015-6.4</td>
				<td>2015-6.4</td>
				<td>2015-6.4</td>
				
			</tr>
			<!-- <a href="#">董事会预案公告日</a>
							      <a href="#">预案阶段复牌日</a>
							      <a href="#">董事征集投票权起始日</a>
							      <a href="#">董事征集投票权截止日</a>
							      <a href="#">股东大会公告日</a>
							      <a href="#">股东大会召开日</a>
							      <a href="#">现场股东大会登记起始日</a>
							      <a href="#">现场股东大会登记截止日</a>
							      <a href="#">股东大会股权登记日</a>
							      <a href="#">获准公告日</a>
							      <a href="#">对价支付股票上市日</a> -->
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