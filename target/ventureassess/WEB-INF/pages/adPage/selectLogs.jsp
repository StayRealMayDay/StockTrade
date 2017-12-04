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
						<label>按照用户角色类型：</label> <select name="jumpMenu" id="jumpMenu">
							<option value="超级管理员">超级管理员</option>
							<option value="成果提供者">成果提供者</option>
							<option value="评审专家">评审专家</option>
						</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label>按照用户角色名称：</label>
						<input id="search" type="text" placeholder="Search">
						<ul class="drop_ul" style="float:right;margin-right:35%;display:none">
						<!-- <li class="drop_li">1</li>
						<li class="drop_li">2</li> -->
						</ul>
						<!--  <a href="#"
							class="btn btn-default btn-sm">搜索</a> --><br> <label>按照用户操作日期：</label>
						(从) <input id="dateTimeStart" style="height: 10%" type="date" name="bday">
						(到) <input id="dateTimeEnd" type="date" name="bday">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						
						<button class="btn btn-default btn-sm" id="searchLogs" >搜索</button><br>
					<!-- <div class="form-group has-feedback">
						<select class="form-control">
							<option>超级管理员</option>
							<option>成果提供者</option>
						</select>
						<a href="#" class="btn btn-default btn-sm">搜索</a>
					<input type="text" class="form-control" placeholder="Search">
					<i class="fa fa-search form-control-feedback"></i>
					</div> -->
					<table class="table table-hover">
						<thead>
							<tr>
								<th>用户类型</th>
								<th>用户名</th>
								<th>开始时间</th>
								<th>操作</th>
								<th>结束时间</th>
								<th>请求IP</th>
							</tr>
						</thead>
						<tbody class="tbody">

						</tbody>
					</table>

					<ul class="pagination" style="text-align: center;">

						<li><a href="#">共 ${pager.recordCount } 条数据，每页
								${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
								${pager.pageNum } 页</a></li>

					</ul>
					<ul class="pagination">
						<li ${pager.pageNum==1?'class="disabled"':''}><a
							href="getAllLogs1?pageNum=1">首页</a></li>
						<li ${pager.pageNum==1?'class="disabled"':''}><a
							href="getAllLogs1?pageNum=${pager.pageNum-1 }">上页</a></li>
						<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
							href="getAllLogs1?pageNum=${pager.pageNum+1 }">下页</a></li>
						<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
							href="getAllLogs1?pageNum=${pager.pageCount }">末页</a></li>
						<li><a>转到 </a></li>
						<li><a><input id="changePage" type="text"
								style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
						<li><a>页 </a></li>
						<li><a href="javascript:goPage();">跳转</a></li>

					</ul>

				</div>
				<!-- pills end -->

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
	<script>
		function goPage() {
			var curPage = document.getElementById("changePage").value * 1;
			if (!/^[1-9]\d*$/.test(curPage)) {
				alert("请输入正整数");
				return;
			}
			var max = $
			{
				pager.pageCount
			}
			;
			if (curPage > max) {
				alert("超出数据页面");
				return;
			}
			//  alert(curPage);
			window.location.href = "?pageNum=" + curPage;
		}
	</script>
	<script type="text/javascript">
		$(function () {
		    $("#searchLogs").click(function () {    	
		    	var userType = $('#jumpMenu option:selected').val();
		    	//alert(userType);
		    	var createBy = $('#createBy').val();
		    	//alert(createBy);
		    	var reg = /[a-zA-Z]/g;  	
		    	var dateTimeStart = $("#dateTimeStart").val().replace(reg," ");
		    	//alert(dateTimeStart);
		    	var dateTimeEnd = $("#dateTimeEnd").val().replace(reg," ");
		    	//alert(dateTimeEnd);
		        $.ajax({
		            type: "GET",        //type：(string)请求方式，POST或GET        
		            url: "getUserTypeLogs",//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
					data:{
						userType:userType,
						createBy:createBy,
						dateTimeStart:dateTimeStart,
						dateTimeEnd:dateTimeEnd
					},
		            success:function(jsonArray) {
						
		            	jsonObject = eval("(" + jsonArray + ")");
						//alert(jsonObject);
						jsonObjectLength = jsonObject.length;
		                var str = "";
		                for (var i = 0 ; i < jsonObjectLength ; i++) {
		                    str += "<tr><td>" + jsonObject[i].userType + "</td><td>" + jsonObject[i].createBy + "</td><td>"
		                    + jsonObject[i].dateTimeStart + "</td><td>" + jsonObject[i].description + "</td><td>" + jsonObject[i].dateTimeEnd +"</td><td>" + jsonObject[i].requestIp+ "</td></tr>";
		                   
		                }
		                //alert(str);
		                $(".tbody").html(str);
		                
		            }
		        });
		    });
		});
	</script>
	
	<script type="text/javascript">
	    $('#search').val('');
	    
	    $("#search").keyup(function(){ 
	    $('.drop_ul').css('display','block');
		var key=$(this).val();
		 $.ajax({
			type:'get',
			dataType:'json',
			url:'getByUserNameLogs?key='+key,
			success:function(data){
				jsonObject = eval("(" + data + ")");
				//alert(jsonObject);
				jsonObjectLength = jsonObject.length;
                var str = "";
                for (var i = 0 ; i < jsonObjectLength ; i++) {
                    str += "<li>" + jsonObject[i].userType + "</li><li>" + jsonObject[i].createBy + "</li><li>"
                    + jsonObject[i].dateTimeStart + "</li><li>" + jsonObject[i].description + "</li><li>" + jsonObject[i].dateTimeEnd +"</li><li>" + jsonObject[i].requestIp+ "</li></li>";
                   
                }
                //alert(str);
                //$(".tbody").html(str);
				$('.drop_ul').html(str);
			
			    
			}

		}); 
	});
	

  $(document).on('click','#search',function(){
              /* var item=$(this).find('.searchkey');
              var key=item.text();
              $('#search').val(key);
              $('.drop_ul').css('display','none'); */
	          var drop = $('.drop_ul').css('display','');
              if(drop==none){
            	  $('.drop_ul').css('display','');
              }else{
            	  $('.drop_ul').css('display','none');
              }
              
  });
  $(document).on('click','.drop_li',function(){
      var item=$(this).find('.searchkey');
      var key=item.text();
      $('#search').val(key);
      $('.drop_ul').css('display','none');
      
});
	
	</script>

</body>
</html>
