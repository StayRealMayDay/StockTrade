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
<script type="text/javascript"
	src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
<jsp:include page="/head.jsp" flush="true" />
</head>

<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
<body>
	<script type="text/javascript"
		src="<%=basePath%>/static/media/js/popwin.js"></script>
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
										<li><a href="ad_login"
											class="dropdown active dropdown-toggle">首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="ad_resultsManage1">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="ad_resultsManage1">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="selectAllProject?pageNum=1">查看项目</a></li>
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
												<li><a href="ad_selectUsers">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看所有日志</a></li>
												<li class="active"><a href="getUserTypeLogs1">检索日志</a></li>
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
							<li><i class="fa fa-home pr-10"></i><a href="#">Home</a></li>
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

		<div class="container">
			<div class="row">

				<!-- sidebar start -->
				<jsp:include page="/ad_left.jsp" flush="true" />
				<!-- sidebar end -->

				<!-- main start -->
				<!-- ================ -->
				<div class="main col-md-8 col-md-offset-1">
					<h2>项目-成果管理</h2>
					<!-- <form class="form-horizontal" role="form">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">项目状态:</label>
							<div class="col-sm-10">
								<select id="inputEmail3" class="form-control">
									<option>拥有成果的项目</option>
									<option>2</option>
								</select>
							</div>
						</div>
						<button type="submit" class="btn btn-default">Confirm
							identity</button>
					</form> -->
					<br>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>项目名称</th>
								<th>项目拥有的成果</th>
								<th>新增成果</th>
								<!-- <th>Username</th> -->
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listRespro}" var="lp">
								<tr>
									<td>${lp.pro_name}</td>
									<td>

										<button id="${lp.pro_id}"
											style="color: red; background: transparent; border: 0px;"
											class="btn btn-sml" data-toggle="modal"
											onclick="return getProjectsInfoid(this.id)"
											data-target="#myModal">已有的成果</button>
									</td>
									<td><button id="resultsInfo${lp.pro_id}"
											style="color: red; background: transparent; border: 0px;"
											class="btn btn-sml" data-toggle="modal"
											onclick="return getProjectsInfoid1(this.id)"
											data-target="#myModal1">添加新的成果</button></td>
								</tr>
								<input type="hidden" name="pro_id" value="${lp.pro_id}"
									id="${lp.pro_id}">
								<%-- <input type="hidden" name="res_id" value="${lp.rpro_res_id}" id="${lp.rpro_res_id}">  --%>
							</c:forEach>
						</tbody>
					</table>
                     <ul class="pagination" style="text-align: center;">

				<li><a href="#">共 ${pager.recordCount } 条数据，每页
						${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第 ${pager.pageNum}
						页</a></li>

			</ul>

			<ul class="pagination">

				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="proResManage?pageNum=1">首页</a></li>
				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="proResManage?pageNum=${pager.pageNum-1 }">上页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="proResManage?pageNum=${pager.pageNum+1 }">下页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="proResManage?pageNum=${pager.pageCount }">末页</a></li>
				<li><a>转到 </a></li>
				<li><a><input id="changePage" type="text"
						style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
				<li><a>页 </a></li>
				<li><a href="javascript:goPage();">跳转</a></li>

			</ul>



				</div>
				<!-- main end -->

			</div>
			

		</div>
		</section>
		<!-- 模态框 -->

		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">已添加的成果</h4>
					</div>
					<div class="modal-body">

						<input type="hidden" id="hiddenId" name="user_id" />
						<table class="table table-hover">
							<thead>
								<tr>
									<th>选择</th>
									<th>成果名称</th>
									<th>查看更多</th>
								</tr>
							</thead>
							<tbody id="res">


							</tbody>
						</table>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-sm btn-dark"
							data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-sm btn-default">保存</button>
					</div>
				</div>
			</div>
		</div>

		<!--  添加成果-->
		<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">
							<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">给项目添加更多成果</h4>
					</div>
					<div class="modal-body">

						<input type="hidden" id="hiddenId" name="user_id" />
						<table class="table table-hover">
							<thead>
								<tr>
									<th>选择</th>
									<th>成果名称</th>
									<th>查看更多</th>
								</tr>
							</thead>
							<tbody id="listResInfo">
								<c:forEach items="${listPassedResult}" var="lpr">
									<tr>
										<td><input type="checkbox" id="resultsIn${lpr.res_id}"
											onclick="return getResInfoid(this.id)"></td>
										<td>${lpr.res_name}</td>
										<td><a
											href="/vcevaluation/resultItem1?res_id=${lpr.res_id}">查看更多</a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-sm btn-dark"
							data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-sm btn-default">保存</button>
					</div>
				</div>
			</div>
		</div>
	</div>


	<jsp:include page="/footer1.jsp" flush="true" />
	<script type="text/javascript">
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
			
			window.location.href = "?pageNum=" + curPage;

		}
		
		    var pro_idd;
			function getProjectsInfoid(id) {
				pro_idd = id;
				//alert(pro_id);
				$.ajax({
					type : "GET", //type：(string)请求方式，POST或GET        
					url : 'proOwnedRes?rpro_pro_id='+pro_idd,//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
					success : function(jsonArray) {
						jsonObject = eval("(" + jsonArray + ")");	
						jsonObjectLength = jsonObject.length;    href="/vcevaluation/resultItem1?res_id=${lar.res_id}"
						var str = "";  
						for (var i = 0; i < jsonObjectLength; i++) {             
							str += "<tr><td><input onclick='return resultDelete(this.id)' id='rrrr"+jsonObject[i].rpro_res_id+"'type='checkbox' checked='checked'></td><td>"
									+jsonObject[i].rpro_res_id
									+"</td><td><a href='/vcevaluation/resultItem1?res_id="+jsonObject[i].rpro_res_id+"'>查看更多<a/>"+"</td></tr>";	     
						}                    
						$("#res").html(str);	
					}
				});	
			} 
			var pro_id;
			function getProjectsInfoid1(id) {
				
		    	var reg = /[a-zA-Z]/g;  
				pro_id = id.replace(reg,"");
			}  
			//成果id
			function getResInfoid(id){  	 
				 if($('#'+id).is(':checked')==true){
						//alert(pro_id);   //项目id
						var reg = /[a-zA-Z]/g;  
						var res_id = id.replace(reg,"");
						//alert(res_id);   //成果id
						
						$.ajax({
				             type: "GET", //POST
				             url: "addResPro",
				             data: {rpro_pro_id:pro_id, rpro_res_id:res_id}, //组装参数
				             dataType: "json",
				             success: function(data){
				                         alert('成功');
				                      }
				         });
						alert("给该项目成功添加了一个成果");

					}else{
						//给数据库插数据
						
						alert("没有选中");
						
					}
			}
			
			function resultDelete(res_id){
				var reg = /[a-zA-Z]/g;  
				var resId = res_id.replace(reg,"");
				//alert(pro_idd);
				//alert(resId);
				if($('#'+resId).is(':checked')==true){
					alert("已经是该项目的成果了！");
				}else{
					$.ajax({
			             type: "GET", //POST
			             url: "deleteResPro",
			             data: {rpro_pro_id:pro_idd,rpro_res_id:resId}, //组装参数
			             dataType: "json",
			             success: function(data){
			                         alert('成功');
			                      }
			         });
					alert("删除了本项目的该成果");
				}
			}
			
	</script>
</body>
</html>
