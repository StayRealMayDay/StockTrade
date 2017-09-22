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
<title>Cloud Admin | Forms</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<!-- STYLESHEETS -->
<!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/themes/default.css"
	id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/responsive.css">

<link
	href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- TYPEAHEAD -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/typeahead/typeahead.css" />
<!-- FILE UPLOAD -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-fileupload/bootstrap-fileupload.min.css" />
<!-- SELECT2 -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/select2/select2.min.css" />
<!-- UNIFORM -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/uniform/css/uniform.default.min.css" />
<!-- JQUERY UPLOAD -->
<!-- blueimp Gallery styles -->
<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/blueimp/gallery/blueimp-gallery.min.css">
<!-- CSS to style the file input field as button and adjust the Bootstrap progress bars -->
<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/jquery-upload/css/jquery.fileupload.css">
<link rel="stylesheet"
	href="<%=basePath%>/static/adStyle/js/jquery-upload/css/jquery.fileupload-ui.css">
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>
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
										<li><a href="#">文件管理</a></li>
										<li>上传项目-产品图片</li>
									</ul>
								</div>
							</div>
						</div>

						<!-- <div class="separator"></div> -->

						<div class="row">
							<div class="col-md-12">
								<div  class="box border blue" >
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i>上传文件
										</h4>						
									</div>
									<div class="box-body">
										<form id="fileupload"
											action="http://jquery-file-upload.appspot.com/" method="POST"
											enctype="multipart/form-data">
											<!-- Redirect browsers with JavaScript disabled to the origin page -->
											<noscript>
												<input type="hidden" name="redirect"
													value="http://blueimp.github.io/jQuery-File-Upload/">
											</noscript>
											<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->
											<div class="divide-20"></div>
											<div class="row fileupload-buttonbar">
												<div class="col-lg-12">
													<!-- The fileinput-button span is used to style the file input field as button -->
													<span class="btn btn-success fileinput-button"> <i
														class="fa fa-plus"></i> <span>添加文件</span> <input
														type="file" name="files[]" multiple>
													</span>
													<button type="submit" class="btn btn-primary start">
														<i class="fa fa-arrow-circle-o-up"></i> <span>开始上传</span>
													</button>
													<button type="reset" class="btn btn-warning cancel">
														<i class="fa fa-ban"></i> <span>取消上传</span>
													</button>
													<button type="button" class="btn btn-danger delete">
														<i class="fa fa-trash-o"></i> <span>删除</span>
													</button>
													<input type="checkbox" class="toggle">
													<!-- The loading indicator is shown during file processing -->
													<span class="fileupload-loading"></span>
												</div>
												<!-- The global progress information -->
												<div class="col-lg-5 fileupload-progress fade">
													<!-- The global progress bar -->
													<div class="progress progress-striped active"
														role="progressbar" aria-valuemin="0" aria-valuemax="100">
														<div class="progress-bar progress-bar-success"
															style="width: 0%;"></div>
													</div>
													<!-- The extended global progress information -->
													<div class="progress-extended">&nbsp;</div>
												</div>
											</div>
											<!-- The table listing the files available for upload/download -->
											<table role="presentation" class="table table-striped">
												<tbody class="files"></tbody>
											</table>
										</form>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">上传说明</h3>
											</div>
											<div class="panel-body">
												<ul>
													<li>可以上传图片、视频、文件</li>
													<li>实现多文件上传</li>
													<li>你可以取消上传中的文件
													</li>
												</ul>
											</div>
										</div>
										<!-- The blueimp Gallery widget -->
										<div id="blueimp-gallery"
											class="blueimp-gallery blueimp-gallery-controls"
											data-filter=":even">
											<div class="slides"></div>
											<h3 class="title"></h3>
											<a class="prev">‹</a> <a class="next">›</a> <a class="close">×</a>
											<a class="play-pause"></a>
											<ol class="indicator"></ol>
										</div>
										<script id="template-upload" type="text/x-tmpl">
								{% for (var i=0, file; file=o.files[i]; i++) { %}
									<tr class="template-upload fade">
										<td>
											<span class="preview"></span>
										</td>
										<td>
											<p class="name">{%=file.name%}</p>
											{% if (file.error) { %}
												<div><span class="label label-danger">Error</span> {%=file.error%}</div>
											{% } %}
										</td>
										<td>
											<p class="size">{%=o.formatFileSize(file.size)%}</p>
											{% if (!o.files.error) { %}
												<div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="progress-bar progress-bar-success" style="width:0%;"></div></div>
											{% } %}
										</td>
										<td>
											{% if (!o.files.error && !i && !o.options.autoUpload) { %}
												<button class="btn btn-primary start">
													<i class="fa fa-arrow-circle-o-up"></i>
													<span>Start</span>
												</button>
											{% } %}
											{% if (!i) { %}
												<button class="btn btn-warning cancel">
													<i class="fa fa-ban"></i>
													<span>Cancel</span>
												</button>
											{% } %}
										</td>
									</tr>
								{% } %}
								</script>
										<!-- The template to display files available for download -->
										<script id="template-download" type="text/x-tmpl">
								{% for (var i=0, file; file=o.files[i]; i++) { %}
									<tr class="template-download fade">
										<td>
											<span class="preview">
												{% if (file.thumbnailUrl) { %}
													<a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img src="{%=file.thumbnailUrl%}"></a>
												{% } %}
											</span>
										</td>
										<td>
											<p class="name">
												{% if (file.url) { %}
													<a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
												{% } else { %}
													<span>{%=file.name%}</span>
												{% } %}
											</p>
											{% if (file.error) { %}
												<div><span class="label label-danger">Error</span> {%=file.error%}</div>
											{% } %}
										</td>
										<td>
											<span class="size">{%=o.formatFileSize(file.size)%}</span>
										</td>
										<td>
											{% if (file.deleteUrl) { %}
												<button class="btn btn-danger delete" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
													<i class="fa fa-trash-o"></i>
													<span>Delete</span>
												</button>
												<input type="checkbox" name="delete" value="1" class="toggle">
											{% } else { %}
												<button class="btn btn-warning cancel">
													<i class="fa fa-ban"></i>
													<span>Cancel</span>
												</button>
											{% } %}
										</td>
									</tr>
								{% } %}
								</script>
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
		src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
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
		src="js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>
	<!-- FILE UPLOAD -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/bootstrap-fileupload/bootstrap-fileupload.min.js"></script>
	<!-- SELECT2 -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/select2/select2.min.js"></script>
	<!-- UNIFORM -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/uniform/jquery.uniform.min.js"></script>
	<!-- JQUERY UPLOAD -->
	<!-- The Templates plugin is included to render the upload/download listings -->
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
	<!-- COOKIE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("forms");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>