<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.stock.pojo.User"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>需求详情</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />
<style type="text/css">
.box_2 {
    margin-bottom: 1em;
}

</style>
<style type="text/css">
	.verticle_line{
		width: 1px;
		border: solid;
		background-color: black;
	}
	.tag_btn_active{
		background: #fff!important;
		color: #f15f43!important; 
		border: 1px solid #f15f43;
	}
	.myContainer{
		margin-left: 10%;
		margin-right: 10%;
	}
	.left_sideBar{
		padding: 2em 0;
	}
	.right_div{
		    padding-left: 10%;
    		padding-right: 10%;
	}
</style>


<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>


<br />
<div class="container">
    <div class="single" style="padding-left: 10%; padding-right: 10%; padding-bottom: 300px; margin-top: 5%">  
       <div class="box_1" style="margin-bottom: 0px !important">
       	<h3 align="center">${requirement.reqName}  </h3>
        
        <div class="col-md-12 service_box1" style="padding-left: 0%;">
        	<h5>所属行业：	${requirement.reqBrief} ;信息发布时间：${requirement.reqProtime}</h5>
        	<p><font size="5px">需求详细内容：</font> ${requirement.reqContent} </p>
        	
        	
        </div>
        <div class="clearfix"> </div>
       </div>
       <h3><p class="fa fa-phone"></p> 意向联系方式</h3> 
       <p style="color:#090">${requirement.reqPhone} &nbsp ${requirement.reqEmail}  </p>
       </br>
       <h3><p class="fa fa-money"></p> 参考价格</h3> 
       <h3><p style="color:#090">  ${requirement.reqMoney}</p></h3>

     <!--   <div class="comments">
	      	<h6>评论</h6>
			<div class="media media_1">
			  <div class="media-left"><a href="#"> </a></div>
			  <div class="media-body">
			    <h4 class="media-heading"><a class="author" href="#">Sollicitudin</a><a class="reply" href="#">回复</a><div class="clearfix"> </div></h4>
			    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
			  </div>
			  <div class="clearfix"> </div>
			</div>
			<div class="media">
			  <div class="media-left"><a href="#"> </a></div>
			  <div class="media-body">
			    <h4 class="media-heading"><a class="author" href="#">Sollicitudin</a><a class="reply" href="#">回复</a><div class="clearfix"> </div></h4>
			    Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
			  </div>
			</div>
		  </div> -->
        </br>
</div>
</div>

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

</body>
</html>	