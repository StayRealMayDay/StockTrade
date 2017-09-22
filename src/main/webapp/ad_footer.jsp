<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
	<!-- footer start (Add "light" class to #footer in order to enable light footer) -->
	<!-- ================ -->
	<section id="footer" class="color-light pattern">
	<div class="container" style="text-align:center;width:100%">
		<div id="column-footer" class="row-fluid" style="text-align:center;width:100%">
			
			<div class="col-sm-4">
				<div style="align:center;"><a href="#">股票交易平台</a>版权所有@2017 Finance Group</div>
			</div>
			
		</div>
	</div>
	</section>
	<!-- footer end -->

	<!--/PAGE -->
	<!-- JAVASCRIPTS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- JQUERY -->
	<script
		src="<%= basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<!-- JQUERY UI-->
	<script
		src="<%= basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script
		src="<%= basePath%>/static/adStyle/frontend_theme/bootstrap-dist/js/bootstrap.min.js"></script>


	<!-- DATE RANGE PICKER -->
	<script
		src="<%= basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>

	<script
		src="<%= basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<!-- SLIMSCROLL -->
    <script type="text/javascript" src="<%= basePath%>/static/adStyle/js/bootstrap-markdown/js/markdown.js"></script>
	
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/bootstrap-markdown/js/to-markdown.js"></script>
	
	
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/bootstrap-markdown/js/bootstrap-markdown.min.js"></script>
	<!-- BLOCK UI -->
	
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/bootstrap-wysiwyg/jquery.hotkeys.min.js"></script>
	
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/bootstrap-wysiwyg/bootstrap-wysiwyg.min.js"></script>
	<!-- CKEDITOR -->
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/ckeditor/ckeditor.js"></script>
	<!-- COOKIE -->
	<!-- UNIFORM -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/uniform/jquery.uniform.min.js"></script>
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<script type="text/javascript" src="<%= basePath%>/static/adStyle/js/nestable/jquery.nestable.min.js"></script>
	<!-- SPARKLINES -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/sparklines/jquery.sparkline.min.js"></script>
	<!-- EASY PIE CHART -->
	<script
		src="<%= basePath%>/static/adStyle/js/jquery-easing/jquery.easing.min.js"></script>
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/easypiechart/jquery.easypiechart.min.js"></script>
	<!-- FLOT CHARTS -->
	<!-- BACKSTRETCH -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/backstretch/jquery.backstretch.min.js"></script>
	<script src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.time.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.selection.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.resize.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.pie.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.stack.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/flot/jquery.flot.crosshair.min.js"></script>
	<!-- TODO -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/jquery-todo/js/paddystodolist.js"></script>
	<!-- TIMEAGO -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/timeago/jquery.timeago.min.js"></script>
	<!-- FULL CALENDAR -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/fullcalendar/fullcalendar.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- GRITTER -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/gritter/js/jquery.gritter.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/select2/select2.min.js"></script>

	<!-- WIZARD -->
	<script
		src="<%= basePath%>/static/adStyle/js/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
	<!-- WIZARD -->
	<script
		src="<%= basePath%>/static/adStyle/js/jquery-validate/jquery.validate.min.js"></script>
	<script
		src="<%= basePath%>/static/adStyle/js/jquery-validate/additional-methods.min.js"></script>
	<!-- BOOTBOX -->
	<script type="text/javascript"
		src="<%= basePath%>/static/adStyle/js/bootbox/bootbox.min.js"></script>
	
	<script
		src="<%= basePath%>/static/adStyle/js/bootstrap-wizard/form-wizard.min.js"></script>
	<script src="<%= basePath%>/static/adStyle/js/script.js"></script>

	 <script>
		jQuery(document).ready(function() {		
			App.setPage("login_bg");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<script type="text/javascript">
		function swapScreen(id) {
			jQuery('.visible').removeClass('visible animated fadeInUp');
			jQuery('#'+id).addClass('visible animated fadeInUp');
		}
	</script> 
</body>
</html>








	
	
	









