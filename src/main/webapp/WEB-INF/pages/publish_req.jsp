<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>发布需求</title>
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
<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>


<div class="container">
    <div class="single">  
	   <div class="col-md-4">
	   	  <div class="col_3">
	   	  	<h3>今日最新项目</h3>
	   	  	<ul class="list_1">
	   	  		<li><a href="#">移动存储设备</a></li>
	   	  		<li><a href="#">微纳操作机器人</a></li>		
	   	  		<li><a href="#">合成橡胶后处理成套工艺装备</a></li>
	   	  		<li><a href="#">实体档案智能存取机器人系统</a></li>		
	   	  		<li><a href="#">陪护机器人</a></li>
	   	  		<li><a href="#">一种指纹考勤系统</a></li>		
	   	  		<li><a href="#">一种车载智能香薰系统</a></li>					
	   	  	</ul>
	   	  </div>
    <!--       <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div> -->
	   	  <div class="col_3">
	   	  	<h3>最新新闻动态</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news1}" var="new1">
	   	  		<li><a href="/ventureassess/newsDetail?news_uuid=${new1.newsUuid}">${new1.newsTitle}</a></li>		
	   	  	</c:forEach>			
	   	  	</ul>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>最新行业动态</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news2}" var="new2">
	   	  		<li><a href="/ventureassess/newsDetail?news_uuid=${new2.newsUuid}">${new2.newsTitle}</a></li>
	   	  	</c:forEach>				
	   	  	</ul>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>最新政策法规</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news3}" var="new3">
	   	  	<li><a href="/ventureassess/newsDetail?news_uuid=${new3.newsUuid}">${new3.newsTitle}</a></li>
	   	  	</c:forEach>							
	   	  	</ul>
	   	  </div>
	   	  
	 </div>
	 <div class="col-md-8 single_right">
                <div class="form-container">
                    <form id="form1" action="publishReq" method="post">
                        <div class="section-title" align="center">
                            <h3>发布需求</h3>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">需求标题</span>
                                <input  type="text" id="req_name" name="req_name" required="required" class="form-control" placeholder="请输入标题...">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">行业分类</span>
                                <select name="req_brief" id="req_brief"  class="form-control">
			                        <option value="">请选择</option>
			                        <c:forEach items="${industries}" var="industry">
			                        <option value="${industry.iName}">${industry.iName}</option>
			                        </c:forEach>  
			                    </select>
                                <!-- <input type="text"id="req_brief" name="req_brief" required="required" class="form-control " placeholder="请输入行业分类..."> -->
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">内容说明</span>
                                 <textarea cols="78" rows="10"id="req_content" name="req_content"  onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">联系方式</span>
                                <input type="text"id="req_phone" name="req_phone" required="required" class="form-control " placeholder="请输入联系方式...">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">联系方式</span>
                                <input type="text"id="req_email" name="req_email" required="required" class="form-control " placeholder="请输入联系方式...">
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">参考价格</span>
                                <input type="text"id="req_money" name="req_money" required="required" class="form-control " placeholder="请输入参考价格...">
                            </div>
                        </div>
                        <div class="login-btn" align="center">
					   <input type="submit" value="发布">
					 
					</div>
                     </form>
                   
					
					<div class="login-bottom">
					
<!-- 					 <div class="social-icons">

						<h4>Don,t have an Account? <a href="register.html"> Register Now!</a></h4>
					 </div> -->
		           </div>
                </div>
     
   </div>
  <div class="clearfix"> </div>
 </div>
</div>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

</body>
</html>	