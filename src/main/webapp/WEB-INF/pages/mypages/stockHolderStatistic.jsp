<%@page import="com.sun.xml.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<head>
<title>详细版本</title>
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/bootstrap.css">
<link href="<%=basePath %>/css/component.css" rel="stylesheet">
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- <link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet"> -->
<!-- start-smoth-scrolling -->
<%-- <script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script> --%>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/echarts.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js "></script>
<!-- start-smoth-scrolling -->
</head>	
<body style="width:80%;border:1px solid #EBEBEB;margin-left:10%;margin-top:50px">
	<h1>${institutionName.institutionName}</h1>
    <div id="priceChart" style="width:75%;height:600px;float:left"> </div>
    <div style="width:25%;height:550px;float:left;margin-top:50px">
    	<div style="width:100%"">
	    	<table class="tbody" style="border:1px solid;border-bottom:1px solid;width:90%">	
	   			<tr style="height:35px;background-color:#EBEBEB"> 
					<th style="border:1px solid;border-top:1px solid;width:40%;text-align:center">股票名称</th>
					<th style="border:1px solid;border-top:1px solid;width:10%;text-align:center">类型</th>
					<th style="border:1px solid;border-top:1px solid;width:10%;text-align:center">时间</th>
				</tr>
		    	<tbody id="tbody2"></tbody>
	    	</table>
	    	<button onclick="similarSelect()">相似投资行为分析</button>
	    	<button onclick="clearAll()">清空已有内容</button>
	    </div>   
	    <div id="result" style="width:100%;display:none;">
	    	<h2>分析结果如下:</h2>
	    	<table class="tbody" style="border:1px solid;border-bottom:1px solid;width:90%">	
	   			<tr style="height:35px;background-color:#EBEBEB"> 
					<th style="border:1px solid;border-top:1px solid;width:40%;text-align:center">机构名称</th>
				</tr>
		    	<tbody id="tbody3"></tbody>
	    	</table>
	    </div>
    </div>
    <div class="clearfix"></div>
   
    <div id="theme" style="width:80%;height:500px;margin-left:10%"></div>
    <div id="industryBar" style="width:80%;height:500px;display:none"></div>
    <div id="liRunGraph" style="width:80%;height:500px;display:none"></div>
</body>
</html>