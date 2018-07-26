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
<title>股东信息统计</title>
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
<!-- start-s


moth-scrolling -->
</head>	
<body style="width:80%;border:1px solid #EBEBEB;margin-left:10%;margin-top:50px">
	<div style="display:block">
		<label style="width: 10%">股东类别选择：</label> 
		<select style="width:30%;height: 32px" id="roleId" > 
          	<option value="基金">基金</option> 
         	<option value="其它类型">其它类型</option> 
        </select>   
	</div>
    
    <div class="clearfix"></div>
 </body>
   