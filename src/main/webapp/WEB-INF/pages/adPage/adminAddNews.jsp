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
<title>科技成果产业化评价系统管理端|增加新闻</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="/ad_head.jsp" flush="true" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-markdown/css/bootstrap-markdown.min.css" />
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>

<script type="text/JavaScript">
	       function selectUserRole() {
		var objS = document.getElementById("userRole");
		var selectValue = objS.options[objS.selectedIndex].value;
		alert(selectValue);
	}
</script>
</head>
<body>
	<!-- HEADER -->
	<jsp:include page="/ad_header.jsp" flush="true" />
	<!--/HEADER -->
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/"></a>
	</div>
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
								aria-hidden="true">Ã</button>
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
										<li><a href="adminSelectAllNews?pageNum=1">新闻管理</a></li>
										<li>发布新闻</li>
									</ul>

								</div>
							</div>
						</div>

						<div class="box border #5e87b0">
							<div class="box-title">
								<h4>
									<i class="fa fa-bars"></i>新闻管理
								</h4>
							</div>
							<div class="box-body big">
								<form action="adminAddNews1" class="form-horizontal" role="form">
									<div class="form-group">
										<label class="col-sm-3 control-label">新闻名称</label>
										<div class="col-sm-9">
											<input class="form-control" id="focusedInput" type="text"
												name="newsTitle" placeholder="请输入新闻名称">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">来源</label>
										<div class="col-sm-9">
											<input class="form-control" id="1111" type="text"
												name="newsOrigin" 　placeholder="请输入新闻的来源">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">作者</label>
										<div class="col-sm-9">
											<input type="text" name="newsAuthor" class="form-control "
												placeholder="请输入新闻的作者">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">时间</label>
										<div class="col-sm-9">

											<input class="form-control " type="date" name="newsTime" id="myDate">

										</div>
									</div>
									<div class="form-group has-success">
										<label class="col-sm-3 control-label">新闻类型</label>
										<div class="col-sm-9">
											<select name="newsType" class="form-control">
												<option value="新闻动态">新闻动态</option>
												<option value="行业动态">行业动态</option>
												<option value="政策法规">政策法规</option>
											</select>
										</div>
									</div>

									<div class="form-group">

										<label class="col-sm-3 control-label">新闻热度</label>
										<div class="col-md-9">
											<label class="radio-inline"> <span><input
													type="radio" class="uniform" name="newsHot" value="热度很高"></span>
												热度很高
											</label> <label class="radio-inline"> <span class="checked"><input
													type="radio" class="uniform" name="newsHot" value="热度较高"
													checked="checked"></span> 热度较高
											</label> <label class="radio-inline"> <span><input
													type="radio" class="uniform" name="newsHot" value="热度一般"></span>
												热度一般
											</label>
										</div>
									</div>
									<div class="form-group has-warning">
										<label class="col-sm-3 control-label">新闻内容</label>
										<div class="col-sm-9">
											<textarea name="newsContent" rows="3" cols="135">

                                            </textarea>
										</div>
									</div>

									<button style="width: 200px; position: relative; left: 430px"
										type="submit" class="btn btn-primary">提交</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script>
		
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>