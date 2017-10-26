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
													<th>股票代码</th>
													<th>名称</th>
													<th>现价</th>
													<th>涨跌幅（%）</th>
													<th>涨跌</th>
													<th>涨速（%）</th>
													<th>换手（%）</th>
													<th>量比</th>
													<th>振幅（%）</th>
													<th>成交额</th>
													<th>流通股</th>
													<th>流通市值</th>
													<th>市盈率</th>
													<th>概念</th>
													<th>操作</th>
												</tr>
											</thead>

											<tbody>
												<c:forEach items="${stockAndCompanieList}" var="v" varStatus="sta">
												<tr class="gradeX">
												    <td>${v.stockinfo.stockNum}</td>
													<td><a href="#" title="点击查看此类型新闻详情">${v.stockinfo.stockName}</a></td>
													<td><font color="red">${v.stockinfo.currentPrice}</font></td>
													<td><font color="red">${v.stockinfo.updownRatio}</font></td>
													<td><font color="red">${v.stockinfo.updownPrice}</font></td>
													<td>${v.stockinfo.upSpeed}</td>
													<td>${v.stockinfo.turnoverRate}</td>
													<td><font color="red">${v.stockinfo.equivalentRatio}</font></td>
													<td><font color="red">${v.stockinfo.amplitude}</font></td>
													<td>${v.stockinfo.turnVolume}</td>
													<td>${v.stockinfo.floatingStock}</td>
													<td>${v.stockinfo.circulationMarketValue}</td>
													<td>${v.stockinfo.peRatio}</td>
													<td><div style="width:200px;overflow:hidden;text-overflow:ellipsis;white-space:nowrap;">${v.company.resolvedConcept}</div></td>
													<td>
														<button class="btn btn-xs btn-primary" onclick="deleteItem('${v.stockinfo.stockId}')">删除</button>
														<a class="btn btn-xs btn-primary" href="<%=basePath %>/adminEditItem?stockId=${v.stockinfo.stockId}">修改</a>
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

						<!-- FORMS -->
						<div class="row">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-12">
										<div class="box border purple">
											<div class="box-title">
												<h4><i class="fa fa-bars"></i>股票</h4>

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

												<!-- <form id="itemForm" class="form-horizontal" role="form">
													<div class="form-group">
														<label class="col-sm-3 control-label">新闻类型名称</label>

														<div class="col-sm-9">
															<input type="text" class="form-control"
															name="newTypeName" id="newTypeName" onblur="checkName()"/>
															<span id="prompt_name"><br/></span>
														</div>
													</div>
													<div class="form-group">
														<label class="col-sm-3 control-label">新闻类型备注</label>

														<div class="col-sm-9">
                                                        <textarea class="form-control" rows="6"
                                                        name="newsTypeRemark" id="newsTypeRemark" 
																  style="resize: vertical;"></textarea>
														<span id="prompt_content"><br/></span>
														</div>
													</div>
													
													<div class="form-group">
														<label class="col-sm-3 control-label"></label>
														<button class="btn btn-purple" style="margin-left: 15px;margin-right: 15px;"
																onclick="insertItem()">提交更改</button>
														<button class="btn btn-light-grey" style="margin-left: 15px;margin-right: 15px;" onclick="reset()">取 消</button>
													</div>
												</form> -->
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
		var enterName = $("#newTypeName").val();
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
	
	/* function insertItem(){
		
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
	} */
function insertItem(){
		
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
		
	}
	
	function reset(){
		$("#itemForm").reset();
	}
	</script>
</body>
</html>