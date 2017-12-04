<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Favicon -->

<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/css/themes/default.css"
	id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/css/responsive.css">
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/uniform/css/uniform.default.min.css" />
<link
	href="<%= basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
          href="<%= basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css"/>
<!-- ANIMATE -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/css/animatecss/animate.min.css" />
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/uniform/css/uniform.default.css" />
<!-- TODO -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/jquery-todo/css/styles.css" />
<!-- FULL CALENDAR -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/fullcalendar/fullcalendar.min.css" />
<!-- GRITTER -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/gritter/css/jquery.gritter.css" />
<!-- FONTS -->

<!-- FONTS -->
<!-- DATE RANGE PICKER -->

<!-- SELECT2 -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/select2/select2.min.css" />
<!-- UNIFORM -->

<!-- WIZARD -->
<link rel="stylesheet" type="text/css"
	href="<%= basePath%>/static/adStyle/js/bootstrap-wizard/wizard.css" />
<!-- FONTS -->





	
	
	