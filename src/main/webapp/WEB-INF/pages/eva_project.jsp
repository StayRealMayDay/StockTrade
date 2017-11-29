<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  %>
      <% String path=request.getContextPath();
     String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
     response.setHeader("Content-Range", "bytes 0-800/801");
    %>
    <%@ page import="java.util.*"%>
<%@ page import="com.stock.pojo.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<title>项目评估</title>
		<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
		<meta name="author" content="htmlcoder.me">

		<!-- Mobile Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<%-- 	<jsp:include page="/head.jsp" flush="true"/> --%>
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.fr.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />

<link rel="stylesheet" href="<%= basePath%>/static/uStyle/css/bootstrap-datetimepicker.css">
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.js"></script>
<style type="text/css">
	.verticle_line{
		width: 1px;
		border: solid;
		background-color: black;
	}
	.tag_btn_active{
		background: #fff!important;
		color: #f15f43!important; 
		border: 1px solid #f15f43;
	}
	.myContainer{
		margin-left: 10%;
		margin-right: 10%;
	}
	.left_sideBar{
		padding: 2em 0;
	}
	label.col-md-2.control-lable {
    text-align: right;
}
    .col-md-9{
    padding-left: 0px;}
</style>
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<style type="text/css">
		.vertical .nav-tabs {
    -webkit-box-shadow: none;
    box-shadow: none;
    border-bottom-color: transparent;
    background-color: #999;
    }
    .radio, .checkbox {
    position: relative;
    display: block;
    min-height: 20px;
    margin-top: 0px;
    margin-bottom: 10px;
   
		</style>

		
		</script>
		
	</head>

	<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
	<body>
<%-- 	<jsp:include page="/header1.jsp" flush="true"/> --%>
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>

		<!-- page wrapper start -->
		<!-- ================ -->
		<div class="page-wrapper">

			<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li class="active">评估项目</li>
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

						<!-- main start -->
						<!-- ================ -->
						<div class="main col-md-12">

							<!-- Tabs start -->
							<!-- ============================================================================== -->
							<div style="text-align: center">
							<h2>项目指标评估</h2>
							 
							</div>
							<h3>指标项</h3>
							<form id="form3"  role="form" action="/vcevaluation/Eva_project" method="post" onsubmit="return validation();">
							<!-- Tabs start -->
							<!-- ================ -->
							<input type="hidden" name="pro_uuid" value="${project.proUuid}">
							<div class="vertical">
								<!-- Nav tabs -->
								<ul class="nav nav-tabs" role="tablist">
								  <c:forEach  items="${ins}" var="in" varStatus="status" begin="0" end="0">
									<li class="active"><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.inName}</a></li>
								  </c:forEach>
								  <c:forEach  items="${ins}" var="in" varStatus="status" begin="1" >
									<li><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.inName}</a></li>
								  </c:forEach>
								</ul>
								<!-- Tab panes -->
								<div class="tab-content" style="width:1140px;height:700px">
								   
								   <c:forEach items="${ins}" var="in" varStatus="status" begin="0" end="0"> 
								       
									<div class="tab-pane active" id="vtab${status.index+1}">
									  	
		                                <!-- <h2 style="text-align: center">请针对指标进行打分</h2> -->
									   <!--  <form class="form-horizontal" role="form"> -->
										
										<div class="col-md-8">
												<div style="text-align: center">	  
											  <a><i class="fa fa-magic pr-10"></i>${in.inName} </a>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
												
											   <c:if test="${inNext.inParent == in.inUuid}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.inName}</label>
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option" varStatus="status">
												      <c:if test="${option.inUuid == inNext.inUuid}">
										
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.inUuid}" id="optionsRadios${status.index+1}" value="${option.opValue}">
																${option.opName}&nbsp(${option.opValue}分)
															</label>
														  </div> 
													  
                                                        
												      </c:if> 
													</c:forEach>
													</div>	
													</div><div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
										
									</div>

									</c:forEach> 
								   
                                   <c:forEach items="${ins}" var="in" varStatus="status" begin="1"> 
								       
										<div class="tab-pane fade" id="vtab${status.index+1}">
											
										<div class="col-md-8">
										<div style="text-align: center">	  
											  <a><i class="fa fa-magic pr-10"></i>${in.inName} </a>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
							
											   <c:if test="${inNext.inParent == in.inUuid}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.inName}</label>
											     
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option" varStatus="status">
												      <c:if test="${option.inUuid == inNext.inUuid}">
												      
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.inUuid}" id="optionsRadios${status.index+1}" value="${option.opValue}">
																${option.opName} &nbsp(${option.opValue}分) 
															</label>
														  </div> 
												      </c:if> 
													</c:forEach>
													</div>	
													</div>
													<div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
										</div>

									</c:forEach> 
									
								</div>
							</div>
							<div class="form-group">
									<div>
										<button type="submit" class="btn btn-default" style="width:1140px">提交评估</button>
									</div>
								</div>
							<!-- tabs end -->
							</form>
					   </div>
				    </div>
			    </div>
			</section>
			<!-- main-container end -->
			<!-- main-container end -->

			<div class="space"></div>
		</div>
		<!-- page-wrapper end -->

		<!-- JavaScript files placed at the end of the document so the pages load faster
		================================================== -->
		<%-- <jsp:include page="/footer1.jsp" flush="true"/> --%>
<script>
function isAllChecked() {
	 
	  for (var i = 197; i < 226; i++) {
	    var radios = document.getElementsByName('optionsRadios' + i);
	    var checkedCount = 0;
	    for (var j = 0; j < radios.length; j++) {
	      if (radios[j].checked) {
	        checkedCount++;
	      }
	    }
	    if (!checkedCount) {
	      return false;
	    }
	  }
	 
	  return true;
	}
function validation(){
	if(isAllChecked()){
		return true;
	}else{
		
		alert("请给所有选项打分！");
		return false;
	}
}
</script>
	</body>
</html>