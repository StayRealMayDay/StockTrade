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
	<title>Cloud Admin | Dynamic Tables</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
	<meta name="description" content="">
	<meta name="author" content="">

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
											<a href="#">创业流程修改</a>
										</li>
									</ul>
									<!-- /BREADCRUMBS -->
									<div class="clearfix">
										<h3 class="content-title pull-left">创业流程修改</h3>
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
						<!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
						<div class="separator"></div>
						<!-- EXPORT TABLES -->

						<!-- FORMS -->
						<div class="row">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-12">
										<div class="box border purple">
											<div class="box-title">
												<h4><i class="fa fa-bars"></i>创业流程修改</h4>

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
											<div class="box-body big">
												<!--<h3 class="form-title">Supported controls</h3>-->

												<form method="post" action="adminSaveItem" onsubmit="return checkall()" class="form-horizontal" role="form">
													<input type="hidden" name="enterUuid" value="${enterpriseItem.enterUuid}">
													<div class="form-group">
														<label class="col-sm-3 control-label">创业事项名称</label>

														<div class="col-sm-9">
															<input type="text" class="form-control" name="enterName" id="enterName" value="${enterpriseItem.enterName}"/>
															<span id="prompt_name"><br/></span>
														</div>
													</div>
													<div class="form-group">
														<label class="col-sm-3 control-label">创业事项内容</label>

														<div class="col-sm-9">
                                                        <textarea class="form-control" rows="10" name="enterContent" id="enterContent"
																  style="resize: vertical;">${enterpriseItem.enterContent}</textarea>
														<span id="prompt_content"><br/></span>
														</div>
													</div>
													<div class="form-group">
														<label class="col-sm-3 control-label">创业流程编号</label>

														<div class="col-sm-9">
															<input type="text" class="form-control" name="enterOrder" id="enterOrder" value="${enterpriseItem.enterOrder}"/>
															<span id="prompt_order"><br/></span>
														</div>
													</div>
													
													<div class="form-group">
														<label class="col-sm-3 control-label"></label>
														<button class="btn btn-purple" style="margin-left: 15px;margin-right: 15px;"
															type="submit">提交更改</button>
														<button class="btn btn-light-grey" style="margin-left: 15px;margin-right: 15px;">取 消</button>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
								<div class="separator"></div>

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
	<script>
		jQuery(document).ready(function() {		
			App.setPage("dynamic_table");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
	
	<script type="text/javascript">
	function checkName(){
		var enterName = $("#enterName").val();
		if(enterName == ""){
			$("#prompt_name").css("color","red");
			$("#prompt_name").html("不能为空！");
			return false;
		}else if(enterName.length > 255){
			$("#prompt_name").css("color","red");
			$("#prompt_name").html("长度超过限制！");
			return false;
		}else{
			$("#prompt_name").html("<br/>");
			return true;
		}
	}
	function checkContent(){
		var enterContent = $("#enterContent").val();
		if(enterContent == ""){
			$("#prompt_content").css("color","red");
			$("#prompt_content").html("不能为空！");
			return false;
		}else if(enterContent.length > 2000){
			$("#prompt_content").css("color","red");
			$("#prompt_content").html("长度超过限制！");
			return false;
		}else{
			$("#prompt_content").html("<br/>");
			return true;
		}
	}
	function checkOrder(){
		var enterOrder = $("#enterOrder").val();
		if(enterOrder == ""){
			$("#prompt_order").css("color","red");
			$("#prompt_order").html("不能为空！");
			return false;
		}else if(enterOrder.length > 50){
			$("#prompt_order").css("color","red");
			$("#prompt_order").html("长度超过限制！");
			return false;
		}else{
			$("#prompt_order").html("<br/>");
			return true;
		}
	}
	function checkall(){
		return checkName() && checkContent() && checkOrder();
	}
	</script>
</body>
</html>