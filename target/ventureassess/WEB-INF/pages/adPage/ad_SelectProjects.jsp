<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>管理员管理</title>
<meta name="description"
	content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Favicon -->
<link rel="shortcut icon" href="images/favicon.ico">



<jsp:include page="/head.jsp" flush="true" />


</head>


<body>

	<!-- scrollToTop -->
	<!-- ================ -->
	<div class="scrollToTop">
		<i class="icon-up-open-big"></i>
	</div>

	<!-- page wrapper start -->
	<!-- ================ -->
	<div class="page-wrapper">

		<!-- header-top start -->
		<!-- ================ -->
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-xs-2  col-sm-6"></div>
					<div class="col-xs-10 col-sm-6">

						<!-- header-top-second start -->
						<!-- ================ -->
						<div id="header-top-second" class="clearfix">

							<!-- header top dropdowns start -->
							<!-- ================ -->
							<div class="header-top-dropdown">
								<div class="btn-group dropdown">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<i class="fa fa-search"></i> Search
									</button>
									<ul
										class="dropdown-menu dropdown-menu-right dropdown-animation">
										<li>
											<form role="search" class="search-box">
												<div class="form-group has-feedback">
													<input type="text" class="form-control"
														placeholder="Search"> <i
														class="fa fa-search form-control-feedback"></i>
												</div>
											</form>
										</li>
									</ul>
								</div>

							</div>
							<!--  header top dropdowns end -->

						</div>
						<!-- header-top-second end -->

					</div>
				</div>
			</div>
		</div>
		<!-- header-top end -->

		<!-- header start (remove fixed class from header in order to disable fixed navigation mode) -->
		<!-- ================ -->
		<header class="header fixed clearfix">
		<div class="container">
			<div class="row">
				<div class="col-md-3">

					<!-- header-left start -->
					<!-- ================ -->
					<div class="header-left clearfix">

						<!-- logo -->
						<div class="logo">
							<a href="index.html"><img id="logo"
								src="<%=basePath%>/static/projectstyle/images/logo_red.png"
								alt="iDea"></a>
						</div>

						<!-- name-and-slogan -->
						<div class="site-slogan">风险评估指标系统后台管理</div>

					</div>
					<!-- header-left end -->

				</div>
				<div class="col-md-9">

					<!-- header-right start -->
					<!-- ================ -->
					<div class="header-right clearfix">

						<!-- main-navigation start -->
						<!-- ================ -->
						<div class="main-navigation animated">

							<!-- navbar start -->
							<!-- ================ -->
							<nav class="navbar navbar-default" role="navigation">
							<div class="container-fluid">

								<!-- Toggle get grouped for better mobile display -->
								<div class="navbar-header">
									<button type="button" class="navbar-toggle"
										data-toggle="collapse" data-target="#navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span> <span
											class="icon-bar"></span> <span class="icon-bar"></span> <span
											class="icon-bar"></span>
									</button>
								</div>

								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse" id="navbar-collapse-1">
									<ul class="nav navbar-nav navbar-right">
										<li><a href="ad_login" class="dropdown active dropdown-toggle"
											>首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="#">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="#">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="#">查看项目</a></li>
												<li><a href="#">编辑项目</a></li>
												<li><a href="#">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理指标</a>
											<ul class="dropdown-menu">
												<li><a href="selectIndexFactor">增加指标</a></li>
												<li><a href="selectIndexFactor">查看指标</a></li>
												<li><a href="selectIndexFactor">编辑指标</a></li>
												<li><a href="selectIndexFactor">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">用户管理</a>
											<ul class="dropdown-menu">
												<li><a href="ad_addUser">增加用户</a></li>
												<li class="active"><a href="ad_userManage">查看用户</a></li>
												<!-- <li><a href="#">编辑用户</a></li> -->
												<li><a href="#">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看日志</a></li>
												<li class="active"><a href="#">检索日志</a></li>
											</ul></li>
									</ul>
								</div>

							</div>
							</nav>
							<!-- navbar end -->

						</div>
						<!-- main-navigation end -->

					</div>
					<!-- header-right end -->

				</div>
			</div>
		</div>
		</header>
		<!-- header end -->

		<!-- page-intro start-->
		<!-- ================ -->
		<div class="page-intro">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ol class="breadcrumb">
							<li><i class="fa fa-home pr-10"></i><a href="index.html">Home</a></li>
							<li class="active">后台管理</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		<!-- page-intro end -->

		<!-- main-container start -->
		<!-- ================ -->
		<section class="main-container">

		<div class="container" style="margin-top: -55px;">
			<div class="row">
				<jsp:include page="/ad_left.jsp" flush="true" />
				<div class="main col-md-9" style="width: 75%">
					<!-- <h2>日志管理</h2> -->
					   <br><br>
						<label>按照项目评估类型：</label> <select name="jumpMenu" id="pro_flag">
							<option value="所有项目">所有项目</option>
							<option value="评审通过项目">评审通过项目</option>
							<option value="评审未通过项目">评审未通过项目</option>
						</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<label>按照项目名称：</label>
						<input id="pro_name" type="text" placeholder="Search">
						<ul class="drop_ul" style="float:right;margin-right:35%;display:none">
						<!-- <li class="drop_li">1</li>
						<li class="drop_li">2</li> -->
						</ul>
						<!--  <a href="#"
							class="btn btn-default btn-sm">搜索</a> --><br> <label>按照项目评审日期：</label>
						(开始日期：) <input id="pro_protime" style="height: 10%" type="date" name="bday">
						(截止日期：) <input id="pro_eva_deadline" type="date" name="bday">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						
						<button class="btn btn-default btn-sm" id="searchLogs" >搜索</button>
					    
							<table class="table table-hover">
								<thead>
									<tr>
										<th>项目名称</th>
										<th>负责人</th>
										<th>评估团队</th>
										<th>状态</th>
										<th>评估值</th>
										<th>评估开始时间</th>
										<th>评估截止时间</th>
									</tr>
								</thead>
								<tbody id="tbody">
									
								</tbody>
							</table>
					

			</div>


		</div>
	</div>
	</section>
	<!-- main-container end -->


	<jsp:include page="/footer1.jsp" flush="true" />
	
	
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/global/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
	<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
	
	<script type="text/javascript">
		 $(function () {
		    $("#searchLogs").click(function(){    	
		    	var pro_flag = $('#pro_flag option:selected').val();
		    	
		    	if(pro_flag=="评审通过项目"){
		    		pro_flag=2;
		    	}else if(pro_flag=="评审未通过项目"){
		    		pro_flag=1;
		    	}
		    	//alert(pro_flag);
		    	var pro_name = $('#pro_name').val();
		    	//alert(pro_name);
		    	var reg = /[a-zA-Z]/g;  	
		    	var pro_protime = $("#pro_protime").val().replace(reg," ");
		    	//alert(pro_protime);
		    	var pro_eva_deadline = $("#pro_eva_deadline").val().replace(reg," ");
		    	//alert(pro_eva_deadline);
		        $.ajax({
		            type: "GET",        //type：(string)请求方式，POST或GET        
		            url: "ad_selectProjects1",  //url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
					data:{
						pro_flag:pro_flag,
						pro_name:pro_name,
						pro_protime:pro_protime,
						pro_eva_deadline:pro_eva_deadline
					},
		            success:function(jsonArray) {
						//alert("success");
		                jsonObject = eval("(" + jsonArray + ")");
						//alert(jsonObject); 
						jsonObjectLength = jsonObject.length;
						//alert(jsonObjectLength); 
		                var str = ""; 
		                for (var i = 0 ; i < jsonObjectLength ; i++) {
		                    str += "<tr><td>"+jsonObject[i].pro_name+"</td><td>"+jsonObject[i].pro_creater+"</td><td>"
		                    +jsonObject[i].pro_team+"</td><td>"+jsonObject[i].pro_flag+"</td><td>"+jsonObject[i].pro_evalue
		                    +"</td><td>"+jsonObject[i].pro_protime+"</td><td>"+jsonObject[i].pro_eva_deadline+"</td></tr>";    
		                } 
		                alert(str);
		                $("#tbody").html(str); 
		                
		            }
		        });
		    });
		}); 
	</script>

</body>
</html>
