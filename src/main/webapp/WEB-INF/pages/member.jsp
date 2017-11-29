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
<title>团队合作者</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!----font-Awesome----->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
    <div class="single">  
	   <div class="col-md-9 single_right">
	      <div class="but_list">
	       <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <!-- <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">Available jobs</a></li> -->
			  <li role="presentation" class="active"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">团队合作者</a></li>
		   </ul>
		<div id="myTabContent" class="tab-content">
		  
		  <div role="tabpanel" class="tab-pane fade in active" id="profile" aria-labelledby="profile-tab">
		    <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<!-- <div class="date">30 <span>Jul</span></div> -->
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="jobs_single.html" class="read-more">更多</a>
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li>
							<li><a href="#" class="fa fa-star"></a></li>
							<li><a href="#" class="fa fa-link"></a></li> -->
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			<div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="jobs_single.html" class="read-more">更多</a>
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			<div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="jobs_single.html" class="read-more">更多</a>
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			 <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="jobs_single.html" class="read-more">更多</a>
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			 <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="jobs_single.html" class="read-more">更多</a>
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			 <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date_desc"><h6 class="title"><a href="jobs_single.html">张玉筱</a></h6>
						  <span class="meta">sicd, 硕士, 技术岗</span>
						</div>
						<div class="clearfix"> </div>
                       <ul class="top-btns">
                            <a href="member_single.html" class="read-more">更多</a>
						</ul> 
						<p class="description">在本次项目中负责项目成果的研发，同另外几个技术骨干合作该项目技术方面。张玉筱研究生在读期间师从西交大sicd实验室。</p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>

			 </div>
		  </div>
	  </div>
     </div>

    <ul class="pagination jobs_pagination">
		<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
		<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
	</ul>
   </div>
   <div class="col-md-3">
	   	  <div class="widget_search">
			<h5 class="widget-title">快速查找</h5>
			<div class="widget-content">
				<span>我想查询 ...</span>
                <select class="form-control jb_1">
					<option value="0">硕士</option>
					<option value="">博士</option>
					<option value="">本科</option>
					<option value="">本科以下</option>
					<option value="">股东</option>
				</select>
                <span>in</span>
                <input type="text" class="form-control jb_2" placeholder="项目名">
                <input type="text" class="form-control jb_2" placeholder="关键字">
                <input type="submit" class="btn btn-default" value="查询">
			</div>
		  </div>
	   	  <div class="col_3">
	   	  	<h3>学历分布</h3>
	   	  	  <table class="table">
                    <tbody>
                        <tr>
                            <td>
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td>
                                博士
                            </td>
                            <td>
                                (2)
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td>
                                硕士
                            </td>
                            <td>
                                (5)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td>
                                本科
                            </td>
                            <td>
                                (10)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            <td class="hidden-xs">
                                <input type="checkbox" class="checkbox">
                            </td>
                            <td>
                                本科以下
                            </td>
                            <td>
                                (15)
                            </td>
                        </tr>
                       
                </tbody>
             </table>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>团队简介</h3>
	   	  	<span>&nbsp &nbsp团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介团队简介。</span>
	   	  	<p>&nbsp &nbsp主要组成。</p>
	   	  </div>
	   </div>
  <div class="clearfix"> </div>
 </div>
</div>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

</body>
</html>	