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
<title>股票交易平台|股票涨跌统计</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/themes/default.css"
	id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/responsive.css">

<!-- TYPEAHEAD -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/typeahead/typeahead.css" />
<!-- FILE UPLOAD -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-fileupload/bootstrap-fileupload.min.css" />
<!-- UNIFORM -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/uniform/css/uniform.default.min.css" />
<!-- JQUERY UPLOAD -->
<!-- blueimp Gallery styles -->
<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/blueimp/gallery/blueimp-gallery.min.css">

<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/jquery-upload/css/jquery.fileupload.css">
<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/jquery-upload/css/jquery.fileupload-ui.css">
<link
	href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- SELECT2 -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/select2/select2.min.css" />
<!-- UNIFORM -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/uniform/css/uniform.default.min.css" />
<!-- WIZARD -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-wizard/wizard.css" />
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<script type="text/javascript">
function validation() {
	if (checkProName() && checkProductName()) {
		return true;
	} else {
		return false;
	}
}
//验证项目名称的重复性
var flagName = 0;
function checkProName() {
	var name = $("#pj_name").val();
	if (name == null || name == undefined || name == "") {
		$("#prompt_name").html("项目名不能为空！");
		$("#prompt_name").css("display", "inline");
		$("#prompt_name").css("color", "red");
		$("#prompt_name").css("font-size", "16px");
		return false;
	} else {
		$.ajax({
			type : 'post',
			url : 'getProNameValidation?pjName=' + name,
			success : function(msg) {
				if (msg == 'failure') {//项目名不存在
					$("#prompt_name").css("display", "inline");
					$("#prompt_name").html("");
					flagName = 1;
				} else {
					$("#prompt_name").html("项目名已存在！请重输");
					$("#prompt_name").css("display", "inline");
					$("#prompt_name").css("color", "red");
					$("#prompt_name").css("font-size", "16px");
				}
			}
		});
		if (flagName == 1) {
			return true;
		}
		return false;
	}
}
//验证产品名称重复
var flagName1 = 0;
function checkProductName() {
	var name = $("#pd_name").val();
	if (name == null || name == undefined || name == "") {
		$("#prompt_name1").html("产品名不能为空！");
		$("#prompt_name1").css("display", "inline");
		$("#prompt_name1").css("color", "red");
		$("#prompt_name1").css("font-size", "16px");
		return false;
	} else {
		$.ajax({
			type : 'post',
			url : 'getProductNameValidation?pdName=' + name,
			success : function(msg) {
				if (msg == 'failure') {//产品名不存在
					$("#prompt_name1").css("display", "inline");
					$("#prompt_name1").html("");
					flagName1 = 1;
				} else {
					$("#prompt_name1").html("产品名已存在！请重输");
					$("#prompt_name1").css("display", "inline");
					$("#prompt_name1").css("color", "red");
					$("#prompt_name1").css("font-size", "16px");
				}
			}
		});
		if (flagName1 == 1) {
			return true;
		}
		return false;
	}
}
//验证输入的值是否是数字
function checkNumber(){
	var pro_bank=$("#pj_targetfinance").val();
	var regbank=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
	if(pro_bank==""){
		$("#prompt_name2").html("请输入金额");}
		else if(!regbank.test(pro_bank)){
			$("#prompt_name2").html("请输入数字");
			
		}else{
			$("#prompt_name2").html("");
			return true;
		}
		$("#prompt_name2").css("display","inline");
			$("#prompt_name2").css("color","red");
			$("#prompt_name2").css("font-size","14px");
			return false;
	}
</script>
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
			<div class="modal fade" id="box-config" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title">Box Settings</h4>
						</div>
						<div class="modal-body">Here goes box setting content.</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
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
										<li><i class="fa fa-home"></i> <a href="index.html">Home</a>
										</li>
										<li><a href="adminSelectAllNews?pageNum=1">股票信息管理</a></li>
										<li>股票涨跌统计</li>
									</ul>

								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->
						<!-- SAMPLE -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border red" id="formWizard">
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i>股票涨跌统计 <!-- <span
												class="stepHeader">Step 1 of 3</span> -->
										</h4>
										<div class="tools hidden-xs">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a> <a href="javascript:;" class="reload"> <i
												class="fa fa-refresh"></i>
											</a> <a href="javascript:;" class="collapse"> <i
												class="fa fa-chevron-up"></i>
											</a> <a href="javascript:;" class="remove"> <i
												class="fa fa-times"></i>
											</a>
										</div>
									</div>
									
									<div class="col-lg-6" style="width:350px;margin-left:30px;margin-top:30px;margin-bottom:30px">
													<div class="dashbox panel panel-default">
														<div class="panel-body">
															<div class="panel-left blue">
																<i class="fa fa-instagram fa-3x"></i>
															</div>
															<div class="panel-right">
																<div class="number">1300</div>
																<div class="title">今日上涨股票数量</div>
																<span class="label label-success"> 26% <i
																	class="fa fa-arrow-up"></i>
																</span>
															</div>
														</div>
													</div>
												</div>
												
												<div class="col-lg-6" style="width:350px;margin-left:30px;margin-top:30px;margin-bottom:30px">
													<div class="dashbox panel panel-default">
														<div class="panel-body">
															<div class="panel-left red">
																<i class="fa fa-instagram fa-3x"></i>
															</div>
															<div class="panel-right">
																<div class="number">1205</div>
																<div class="title">今日下跌股票数量</div>
																<span class="label label-warning"> 30% <i
																	class="fa fa-arrow-down"></i>
																</span>
															</div>
														</div>
													</div>
												</div>
												
												<div class="col-lg-6" style="width:350px;margin-left:30px;margin-top:30px;margin-bottom:30px">
													<div class="dashbox panel panel-default">
														<div class="panel-body">
															<div class="panel-left blue">
																<i class="fa fa-instagram fa-3x"></i>
															</div>
															<div class="panel-right">
																<div class="number">1323</div>
																<div class="title">最近一周上涨股票数量</div>
																<span class="label label-success"> 16% <i
																	class="fa fa-arrow-up"></i>
																</span>
															</div>
														</div>
													</div>
												</div>
												
												<div class="col-lg-6" style="width:350px;margin-left:30px;margin-top:30px;margin-bottom:30px">
													<div class="dashbox panel panel-default">
														<div class="panel-body">
															<div class="panel-left red">
																<i class="fa fa-instagram fa-3x"></i>
															</div>
															<div class="panel-right">
																<div class="number">1420</div>
																<div class="title">最近一月下跌股票数量</div>
																<span class="label label-warning"> 13% <i
																	class="fa fa-arrow-down"></i>
																</span>
															</div>
														</div>
													</div>
												</div>
									<%-- <div class="box-body form">
										<div style="height:100px;">
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
											</div>
														
									</div>
								</div> --%>
								<!-- /BOX -->
							</div>
						</div>
						
						<div class="separator"></div>
						<!-- EXPORT TABLES -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border purple">
									<div class="box-title">
										<h4><i class="fa fa-table"></i>股票上涨详情概览</h4>
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
													<th>股票名称</th>
													<th>股票代码</th>
													<th>涨跌</th>
													<th>当前价格</th>
													<th>换手率</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${stockinfosup}" var="v" varStatus="sta">
												<tr class="gradeX">
													<td>${v.stockName}</td>
													<td>${v.stockNum}</td>
													<td><font color="green">${v.updownRatio}</font></td>
													<td>${v.currentPrice}</td>
													<td>${v.turnoverRate}</td>
													<td>
														<button class="btn btn-xs btn-primary" onclick="deleteItem('${v.stockId}')">删除</button>
														<a class="btn btn-xs btn-primary" href="<%=basePath %>/adminEditItem?enterUuid=${v.stockId}">修改</a>
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
						
						
						<div class="separator"></div>
						<!-- EXPORT TABLES -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border purple">
									<div class="box-title">
										<h4><i class="fa fa-table"></i>股票下跌详情概览</h4>
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
													<th>股票名称</th>
													<th>股票代码</th>
													<th>涨跌</th>
													<th>当前价格</th>
													<th>换手率</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${stockinfosdown}" var="v" varStatus="sta">
												<tr class="gradeX">
													<td>${v.stockName}</td>
													<td>${v.stockNum}</td>
													<td><font color="red">${v.updownRatio}</font></td>
													<td>${v.currentPrice}</td>
													<td>${v.turnoverRate}</td>
													<td>
														<button class="btn btn-xs btn-primary" onclick="deleteItem('${v.stockId}')">删除</button>
														<a class="btn btn-xs btn-primary" href="<%=basePath %>/adminEditItem?enterUuid=${v.stockId}">修改</a>
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
						<!-- /SAMPLE -->
						<div class="footer-tools">
							<span class="go-top"> <i class="fa fa-chevron-up"></i> Top
							</span>
						</div>
					</div>
					<!-- /CONTENT-->
				</div>
			</div>
		</div>
	</section>
	<!--/PAGE -->
	<!-- JAVASCRIPTS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- JQUERY -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<!-- JQUERY UI-->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script
		src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>


	<!-- DATE RANGE PICKER -->
	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>

	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- SELECT2 -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/select2/select2.min.js"></script>
	<!-- UNIFORM -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/uniform/jquery.uniform.min.js"></script>
	<!-- WIZARD -->
	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
	<!-- WIZARD -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-validate/jquery.validate.min.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-validate/additional-methods.min.js"></script>
	<!-- BOOTBOX -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/bootbox/bootbox.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>

	<!-- TYPEHEAD -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/typeahead/typeahead.min.js"></script>
	<!-- AUTOSIZE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/autosize/jquery.autosize.min.js"></script>
	<!-- COUNTABLE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/countable/jquery.simplyCountable.min.js"></script>
	<!-- INPUT MASK -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
	<!-- FILE UPLOAD -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/bootstrap-fileupload/bootstrap-fileupload.min.js"></script>



	<script
		src="<%=basePath%>/static/adStyle/js/blueimp/javascript-template/tmpl.min.js"></script>
	<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
	<script
		src="<%=basePath%>/static/adStyle/js/blueimp/javascript-loadimg/load-image.min.js"></script>
	<!-- The Canvas to Blob plugin is included for image resizing functionality -->
	<script
		src="<%=basePath%>/static/adStyle/js/blueimp/javascript-canvas-to-blob/canvas-to-blob.min.js"></script>
	<!-- blueimp Gallery script -->
	<script
		src="<%=basePath%>/static/adStyle/js/blueimp/gallery/jquery.blueimp-gallery.min.js"></script>
	<!-- The basic File Upload plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload.min.js"></script>
	<!-- The File Upload processing plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-process.min.js"></script>
	<!-- The File Upload image preview & resize plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-image.min.js"></script>
	<!-- The File Upload audio preview plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-audio.min.js"></script>
	<!-- The File Upload video preview plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-video.min.js"></script>
	<!-- The File Upload validation plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-validate.min.js"></script>
	<!-- The File Upload user interface plugin -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-upload/js/jquery.fileupload-ui.min.js"></script>
	<!-- The main application script -->
	<script src="<%=basePath%>/static/adStyle/js/jquery-upload/js/main.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-wizard/form-wizard.min.js"></script>


	<script>
		jQuery(document).ready(function() {
			App.setPage("wizards_validations"); //Set current page
			App.init(); //Initialise plugins and elements
			FormWizard.init();
		});
		/* var pjName = document.getElementById("pjName").value;
		alert(pjName);
		var pdName = document.getElementById("pdName").value;	
		 */
		function OnInput(event) {

			$("#pjName1").html(event.target.value);
		}
		function OnInput1(event) {

			$("#pdName1").html(event.target.value);

		}
	
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>