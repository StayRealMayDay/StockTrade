<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
	<title>Cloud Admin | Entrepreneurial_process</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<!-- STYLESHEETS --><!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/css/cloud-admin.css" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/themes/default.css" id="skin-switcher" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/responsive.css" >
	
	<link href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- JQUERY UI-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css" />
	<!-- DATE RANGE PICKER -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
	<!-- DATA TABLES -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/css/jquery.dataTables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/assets/css/datatables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/css/TableTools.min.css" />
	<link href="<%= basePath%>/static/media/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-skins.min.css" />
	<script src="<%= basePath%>/static/media/assets/js/ace-extra.min.js"></script>
	<!-- FONTS -->
	<!-- <link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'> -->
</head>
<body>
	<!-- HEADER -->
	<jsp:include page="/ad_header.jsp" flush="true" />
	<!--/HEADER -->
	
	<!-- PAGE -->
	<section id="page">
		<!-- SIDEBAR -->
		<jsp:include page="/ad_left.jsp" flush="true" />
		<!-- /SIDEBAR -->
		<div id="main-content">
			<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="modal fade" id="box-config" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
				  <div class="modal-content">
					<div class="modal-header">
					  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					  <h4 class="modal-title">Box Settings</h4>
					</div>
					<div class="modal-body">
					  Here goes box setting content.
					</div>
					<div class="modal-footer">
					  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					  <button type="button" class="btn btn-primary">Save changes</button>
					</div>
				  </div>
				</div>
			  </div>
			<!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="container">
				<div class="row">
					<div id="content" class="col-lg-12">
						<!-- PAGE HEADER-->
						<div class="row">
							<div class="col-sm-12">
								<div class="page-header">
									<!-- STYLER -->

									<!-- /STYLER -->
									<!-- BREADCRUMBS -->
									<ul class="breadcrumb">
										<li>
											<i class="fa fa-home"></i>
											<a href="index.html">Home</a>
										</li>
										<li>
											<a href="#">股票信息管理</a>
										</li>
									</ul>
									<!-- /BREADCRUMBS -->
									<div class="clearfix">
										<h3 class="content-title pull-left">股票信息管理</h3>
									</div>
									<!--<div class="description">Form Elements and Features</div>-->
								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->

						<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
						<div class="modal fade" id="table-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
							  <div class="modal-content modal-table">
								<div class="modal-header">
								  <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
								  <h4 class="modal-title">Table inside a Modal</h4>
								</div>
								<div class="modal-body">
								  <table class="table table-bordered table-hover">
									<thead>
									  <tr>
										<th>#</th>
										<th>First Name</th>
										<th>Last Name</th>
										<th>Username</th>
									  </tr>
									</thead>
									<tbody>
									  <tr>
										<td>1</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
									  </tr>
									  <tr>
										<td>2</td>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@fat</td>
									  </tr>
									  <tr>
										<td>3</td>
										<td>Larry</td>
										<td>the Bird</td>
										<td>@twitter</td>
									  </tr>
									</tbody>
									</table>
								</div>
								<div class="modal-footer">
								  <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
								</div>
							  </div>
							</div>
						  </div>
						
						<!-- BOX -->
							<div class="separator"></div>
								<div class="box border red">
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i> <span class="hidden-inline-mobile">板块情况概览</span>
										</h4>
									</div>
									<div class="box-body">
										<div class="tabbable header-tabs">
											<ul class="nav nav-tabs">
												<li><a href="#box_tab3" data-toggle="tab"><i
														class="fa fa-search-plus"></i> <span
														class="hidden-inline-mobile">地域指数</span></a></li>
												<li><a href="#box_tab2"
													data-toggle="tab"><i class="fa fa-bar-chart-o"></i> <span
														class="hidden-inline-mobile">概念指数</span></a></li>
												<li class="active"><a href="#box_tab1"
													data-toggle="tab"><i class="fa fa-bar-chart-o"></i> <span
														class="hidden-inline-mobile">行业指数</span></a></li>
											</ul>
											<div class="tab-content">
												<div class="tab-pane fade in active" id="box_tab1">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">111</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
												<div class="tab-pane fade" id="box_tab2">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">222</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
												<div class="tab-pane fade" id="box_tab3">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">333</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
											</div>
										</div>
									</div>
									
									<!-- BOX -->
							<div class="separator"></div>
								<div class="box border red">
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i> <span class="hidden-inline-mobile">各版块指数详情</span>
										</h4>
									</div>
									<div class="box-body">
										<div class="tabbable header-tabs">
											<ul class="nav nav-tabs">
												<li><a href="#box_tab6" data-toggle="tab"><i
														class="fa fa-search-plus"></i> <span
														class="hidden-inline-mobile">地域指数</span></a></li>
												<li><a href="#box_tab5"
													data-toggle="tab"><i class="fa fa-bar-chart-o"></i> <span
														class="hidden-inline-mobile">概念指数</span></a></li>
												<li class="active"><a href="#box_tab4"
													data-toggle="tab"><i class="fa fa-bar-chart-o"></i> <span
														class="hidden-inline-mobile">行业指数</span></a></li>
											</ul>
											<div class="tab-content">
												<div class="tab-content">
												<div class="tab-pane fade in active" id="box_tab4">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">444</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
												<div class="tab-pane fade" id="box_tab5">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">555</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
												<div class="tab-pane fade" id="box_tab6">
													<!-- TAB 1 -->
													<div id="chart-dash" class="chart">666</div>
													<hr class="margin-bottom-0">
													<!-- /TAB 1 -->
												</div>
											</div>
											</div>
										</div>
									</div>
									<!-- /BOX -->
											
											<%-- <div style="height:100px;">
												<div style="border:1px solid #003;width:200px;height:60px;margin-top:15px;margin-left:20px;float:left;margin-right:5px;">
												<div class="infobox-icon">
													<i class="icon-comments">小图标</i>
												</div>
	
												<div class="infobox-data">
													<span class="infobox-data-number">${news_all}</span>
													<div class="infobox-content" >
														<a href="/stock/scannews?flag=all&page=1">数据库股票总量</a>
													</div>
												</div>
												<div style="font-color:red">0.07% 涨跌图标</div>
											</div>
											
											<div style="border:1px solid #003;width:200px;height:60px;margin-top:15px;margin-left:20px;float:left;margin-right:5px;">
												<div class="infobox-icon">
													<i class="icon-comments">小图标</i>
												</div>
	
												<div class="infobox-data">
													<span class="infobox-data-number">${news_all}</span>
													<div class="infobox-content" >
														<a href="/stock/scannews?flag=all&page=1">今日新增股票总量</a>
													</div>
												</div>
												<div style="font-color:red">25% 涨跌图标</div>
											</div>
											
											<div style="border:1px solid #003;width:200px;height:60px;margin-top:15px;margin-left:20px;float:left;margin-right:5px;">
												<div class="infobox-icon">
													<i class="icon-comments">小图标</i>
												</div>
	
												<div class="infobox-data">
													<span class="infobox-data-number">${news_all}</span>
													<div class="infobox-content" >
														<a href="/stock/scannews?flag=all&page=1">最近一周新闻爬取量</a>
													</div>
												</div>
												<div style="font-color:red">25% 涨跌图标</div>
											</div>
											
											<div style="border:1px solid #003;width:200px;height:60px;margin-top:15px;margin-left:20px;float:left;margin-right:5px;">
												<div class="infobox-icon">
													<i class="icon-comments">小图标</i>
												</div>
	
												<div class="infobox-data">
													<span class="infobox-data-number">${news_all}</span>
													<div class="infobox-content" >
														<a href="/stock/scannews?flag=all&page=1">最近一月新闻爬取量</a>
													</div>
												</div>
												<div style="font-color:red">25% 涨跌图标</div>
											</div> --%>
													
												
											</div>
										</div>
									</div>
								</div>
								<div class="separator"></div>

<!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
						<div class="separator"></div>
						<!-- EXPORT TABLES -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border purple">
									<div class="box-title">
										<h4><i class="fa fa-table"></i>股票情况概览</h4>
										<div class="tools hidden-xs">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a>
											<a href="javascript:;" class="reload">
												<i class="fa fa-refresh"></i>
											</a>
											<a href="javascript:;" class="collapse">
												<i class="fa fa-chevron-up"></i>
											</a>
											<a href="javascript:;" class="remove">
												<i class="fa fa-times"></i>
											</a>
										</div>
									</div>
									<div class="box-body">
										<table id="datatable1" cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>股票类型名称</th>
													<th>股票数量</th>
													<th>备注</th>
													<th>操作动作</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${newsTypesList}" var="v" varStatus="sta">
												<tr class="gradeX">
													<td>${v.newTypeName}</td>
													<td>${v.newsTypeNum}</td>
													<td>${v.newsTypeRemark}</td>
													<td>
														<button class="btn btn-xs btn-primary" onclick="deleteItem('${v.newsTypeId}')">删除</button>
														<a class="btn btn-xs btn-primary" href="<%=basePath %>/adminEditItem?enterUuid=${v.newsTypeId}">修改</a>
													</td>
												</tr>
												</c:forEach>
											</tbody>
											<!-- <tfoot>
												<tr>
													<th class="hidden-xs">创业事项编号</th>
													<th>创业事项名称</th>
													<th>创业事项内容</th>
													<th class="hidden-xs">操作动作</th>
												</tr>
											</tfoot> -->
										</table>
									</div>
								</div>
								<!-- /BOX -->
							</div>
						</div>



							</div>
							<div class="separator"></div>
						</div>
						<!-- /EXPORT TABLES -->
						<div class="footer-tools">
							<span class="go-top">
								<i class="fa fa-chevron-up"></i> Top
							</span>
						</div>
					</div><!-- /CONTENT-->
				</div>
			</div>
		</div>
	</section>
	
	<!-- <section id="footer" class="color-light pattern">
	<div class="container">
		<div id="column-footer" class="row-fluid">
			<div class="col-sm-4">
				<h3>Learn More</h3>
				<ul>
					<li><a href="#">How it works</a></li>
					<li><a href="#">Safety measures</a></li>
					<li><a href="#">Testimonials</a></li>
					<li><a href="#">The Blog</a></li>
				</ul>
			</div>
			<div class="col-sm-4">
				<h3>Help &amp; Support</h3>
				<ul>
					<li><a href="#">Frequently Asked Questions</a></li>
					<li><a href="#">Creative Requirements</a></li>
					<li><a href="#">Glossary of Terms</a></li>
					<li><a href="#">The Safety</a></li>
				</ul>
			</div>
			<div class="col-sm-4">
				<h3>About Us</h3>
				<ul>
					<li><a href="#">Press</a></li>
					<li><a href="#">Our Team</a></li>
					<li><a href="#">Careers</a></li>
					<li><a href="#">Our Partners</a></li>
				</ul>
			</div>
		</div>
	</div>
	</section> -->
	
	<!--/PAGE -->
	<!-- JAVASCRIPTS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- JQUERY -->
	<script src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<!-- JQUERY UI-->
	<script src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>
	
		
	<!-- DATE RANGE PICKER -->
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>
	
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- DATA TABLES -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/assets/js/datatables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/TableTools.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/ZeroClipboard.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/my.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("dynamic_table");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
	
	<script type="text/javascript">
	function deleteItem(enterUuid){
		
		var result = false;
		
		if (confirm("确定删除这条数据吗 ?") == false) {
            return;
        }
		
		$.ajax({
			async : false,//将async设置为false,才能使得return 返回true/false有效
			type : 'post',
			url : 'adminDeleItem?enterUuid=' + enterUuid,
			success : function(msg) {
				if (msg == 'success') {
					window.location.reload();
					result = true;
					alert("删除成功！");
				} else {
					result = false;
					alert("删除失败");
				}
			}
		});
	}
	
	function checkName(){
		
		var result = false;
		var enterName = $("#enterName").val();
		if(enterName == ""){
			$("#prompt_name").css("color","red");
			$("#prompt_name").html("不能为空");
			result = false;
		}else if(enterName.length > 255){
			$("#prompt_name").css("color","red");
			$("#prompt_name").html("长度超过限制！");
			result = false;
		}else{
			$.ajax({
				async : false,//将async设置为false,才能使得return 返回true/false有效
				type : 'post',
				url : 'adminExistItemName?enterName='+enterName,
				success : function(msg) {
					if (msg == 'success') {
						$("#prompt_name").html("<br/>");
						result = true;
					} else {
						$("#prompt_name").css("color","red");
						$("#prompt_name").html("名称重复！请重新输入");
						result = false;
					}
				}
			});
		}		
		return result;
	}
	
	function checkContent(){
		
		var result = false;
		var enterContent = $("#enterContent").val();
		
		if(enterContent == ""){
			$("#prompt_content").css("color","red");
			$("#prompt_content").html("不能为空！");
			result = false;
		}else if(enterContent.length > 2000){
			$("#prompt_content").css("color","red");
			$("#prompt_content").html("长度超过限制！");
			result = false;
		}else{
			$("#prompt_content").html("<br/>");
			result = true;
		}

		return result;
	}
	
	function checkOrder(){
		
        var result = false;
		var enterOrder = $("#enterOrder").val();
		
		if(enterOrder == ""){
			$("#prompt_order").css("color","red");
			$("#prompt_order").html("不能为空！");
			result = false;
		}else if(enterOrder.length > 50){
			$("#prompt_order").css("color","red");
			$("#prompt_order").html("长度超过限制！");
			result = false;
		}else{
			
			$.ajax({
				async : false,//将async设置为false,才能使得return 返回true/false有效
				type : 'post',
				url : 'adminExistItemOrder?enterOrder='+enterOrder,
				success : function(msg) {
					if (msg == 'success') {
						$("#prompt_order").html("<br/>");
						result = true;
					} else {
						$("#prompt_order").css("color","red");
						$("#prompt_order").html("序号重复！请重新输入");
						result = false;
					}
				}
			});
		}
		
		return result;
	}
	
	function checkall(){
		
		return checkName() && checkContent() && checkOrder();
	}
	
	function insertItem(){
		
		if(userLogin() && checkall()){
			var formElement = document.getElementById("itemForm");
			formData = new FormData(formElement);
			
			$.ajax({
		        url: "adminInsertItem",
		        type: 'post',
		        data: formData,
		        cache: false,
		        async: false,        //同步
		        processData: false,  //很重要，告诉jquery不要对form进行处理
		        contentType: false,  //很重要，指定为false才能形成正确的Content-Type
		        success: function (msg) {
		       		if(msg == 'success'){
		                alert("新增成功~~~");
		                location.reload(true);
		       	    }else{
				 		alert("新增失败！！！");	
		       	    }
		        }
		    }); 
		}else{
			alert("新增错误！请先确认登录系统！");
		}
	}
	
	function reset(){
		$("#itemForm").reset();
	}
	</script>
</body>
</html>