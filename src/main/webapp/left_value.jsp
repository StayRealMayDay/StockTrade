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

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
<link rel=stylesheet type=text/css href="<%= basePath%>/static/uStyle/css/lrtk.css">

</head>

<body class="home-page">
				<!-- 代码 开始 -->
				 <div id="firstpane" class="menu_list">
				 	<a href="company?stockNum=${stockNum}">个股信息</a>>>><a href="#">个股市场估值</a>
				 	<p class="menu_head current" style="width:240px;"><a href="market_value?stockNum=${stockNum}">市场估值概览</a></p>
				    <p class="menu_head current" style="width:240px;">基本估值指标</p>
				    <div style="display:block" class=menu_body >
				      <a href="PE?stockNum=${stockNum}&pageNum=1">市盈率</a>
					  <a href="PB?stockNum=${stockNum}&pageNum=1">市净率</a>
					  <a href="PS?stockNum=${stockNum}&pageNum=1">市销率</a>
				      
				    </div>
				    <p class="menu_head current" style="width:240px;">价值情况</p>
				    <div style="display:block" class=menu_body >
				      <a href="total_value?stockNum=${stockNum}&pageNum=1">总市值</a>
				      <a href="flow_value?stockNum=${stockNum}&pageNum=1">流通市值</a>
				      <a href="enterprise_value?stockNum=${stockNum}&pageNum=1">企业价值</a>
				    </div>
				    <p class="menu_head current" style="width:240px;">其他</p>
				    <div style="display:block" class=menu_body >
				      <a href="PE_predict12?stockNum=${stockNum}&pageNum=1">预测市盈率（未来12个月）</a>
				      <a href="dividend_rate12?stockNum=${stockNum}&pageNum=1">股息率（近12个月）</a>
				    </div>
				    
				</div>
				
				<!-- 代码 结束 -->
			

</body>

</html>