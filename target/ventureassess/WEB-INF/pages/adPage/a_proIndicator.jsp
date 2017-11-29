<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
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

<jsp:include page="/head.jsp" flush="true" />
<link href="<%=basePath%>/static/adStyle/css/tree.css" rel="stylesheet">

</head>

<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
<body>
	<!-- scrollToTop -->
	<!-- ================ -->
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
										<li><a href="ad_login" class="dropdown active dropdown-toggle"
											>首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="#">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="#">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="#">查看项目</a></li>
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
												<li><a href="#">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看日志</a></li>
												<li class="active"><a href="#">检索日志</a></li>
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
							<li><i class="fa fa-home pr-10"></i><a href="index.html">Home</a></li>
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
				<aside class="col-md-3">
				<div class="sidebar">
					<div class="block clearfix">
						<h3 class="title">后台管理菜单</h3>
						<div class="separator"></div>
						<nav>
						<ul class="nav nav-pills nav-stacked">
							<li><a href="ad_login">统计</a></li>
							<!-- <li class="active"><a href="#">管理成果提供者</a></li>
											<li><a href="#">管理评审专家</a></li> -->
							<li><a href="#">管理成果</a></li>
							<li><a href="#">管理项目</a></li>
							<li><a href="selectIndexFactor">管理指标</a></li>
							<li><a href="/vcevaluation/ad_userManage">用户管理</a></li>
							<li><a href="getAllLogs1?pageNum=1">日志管理</a></li>
						</ul>
						</nav>
					</div>
				</div>
				</aside>
				<!-- sidebar end -->

				<!-- main start -->
				<!-- ================ -->
				<div class="main col-md-8 col-md-offset-1">

					<!-- page-title start -->
					<!-- ================ -->
					<div class="container">
						<section id="main_content">
						<h3>
							<span>项目评估指标管理</span>
						</h3>
						<div>
							<button type="button" class="btn btn-primary" data-toggle="modal"
								data-target="#myModal">添加指标</button>
							<!-- <button type="button" id="deleteIndicator"
								onclick="deleteIndicator()" class="btn btn-primary">删除指标</button> -->
							<!-- Modal -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">
												<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
											</button>
											<h4 class="modal-title" id="myModalLabel">新增项目评估指标</h4>
										</div>
										<div class="modal-body">
											<form role="form" action="/vcevaluation/addproIndicator">
											<input type="hidden" name="pageNum"
												value="${pager.pageNum}"> 
												<div class="form-group">
													<label>指标名称:</label> <input
														type="text" class="form-control" name="index_name"
														id="index_name" placeholder="请输入指标名称...">
												</div>
												<div class="form-group">
													<label>指标权重:</label> <input
														type="text" class="form-control" name="index_weight"
														id="index_weight" placeholder="请输入指标权重...">
												</div>
										
												<div class="radio">
													<label> <input type="radio" id="inlineRadio1"
														name="in_level" value="1">一级指标
													</label> <label> <input type="radio" id="inlineRadio2"
														name="in_level" value="2" checked="checked">二级指标
													</label>
												</div>
												<div id="selectFather" class="form-group">
													<label for="selectFather">父指标:</label> <select
														class="form-control" id="selectFather1"
														name="optionFather">
														<c:forEach items="${ins}" var="a">
															<option value="${a.in_id}">${a.in_name}</option>
														</c:forEach>
													</select>
												</div>
												<div id="selectType" class="radio">
													<label> <input type="radio" id="intypeRadio1"
														name="in_optiontype" value="1" checked="checked">自定义选项
													</label> <label> <input type="radio" id="intypeRadio2"
														name="in_optiontype" value="2">常规选项
													</label>
												</div>
												<div id="selectCategory" class="radio">
													<label> <input type="radio" id="incategoryRadio1"
														name="in_optioncategory" value="1" checked="checked">单选
													</label> <label> <input type="radio" id="incategoryRadio2"
														name="in_optioncategory" value="2">多选
													</label>
												</div>
												<button type="submit" class="btn btn-default"
													onclick="check()">提交</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
											</form>
										</div>
									</div>
								</div>
							</div>

							<!-- Modal -->

							<!-- Modal -->
							<div class="modal fade" id="myModal1" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">
												<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
											</button>
											<h4 class="modal-title" id="myModalLabel1">编辑项目评估指标</h4>
										</div>
										<div class="modal-body">
											<form role="form" action="/vcevaluation/editproIndicator1">
											<input type="hidden" id="index_Id1" name="index_id1" value="">
											<input type="hidden" name="pageNum" id="pagenum"
												value="${pager.pageNum}"> 
												<div class="form-group">
													<label>指标名称:</label> <input
														type="text" class="form-control" name="index_name1"
														id="index_name1" placeholder="请输入指标名称...">
												</div>
												<div class="form-group">
													<label>指标权重:</label> <input
														type="text" class="form-control" name="index_weight1"
														id="index_weight1" placeholder="请输入指标权重...">
												</div>
												<!--<div class="form-group">-->
												
												<button type="submit" class="btn btn-default"
													onclick="check()">提交</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
											</form>
										</div>
									</div>
								</div>
							</div>


							<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">
												<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
											</button>
											<h4 class="modal-title" id="myModalLabel2">编辑项目评估指标</h4>
										</div>
										<div class="modal-body">
											<form role="form" action="/vcevaluation/editproIndicator2">
											<input type="hidden" id="indexCId" name="index_id2" value="">
											<input type="hidden" name="pageNum"
												value="${pager.pageNum}"> 
												<div class="form-group">
													<label>指标名称:</label> <input
														type="text" class="form-control" name="index_name2"
														id="index_name2" placeholder="请输入指标名称...">
												</div>
												<div class="form-group">
													<label>指标权重:</label> <input
														type="text" class="form-control" name="index_weight2"
														id="index_weight2" placeholder="请输入指标权重...">
												</div>
												<div id="selectFather1" class="form-group">
													<label>父指标:</label> 
													<select
														class="form-control" id="selectFather2"
														name="optionFather1">
														<c:forEach items="${ins}" var="a">
														    
															<option id="" value="${a.in_id}">${a.in_name}</option>
															
														</c:forEach>
													</select>
												</div>
												<div id="selectType1" class="radio">
													<label> <input type="radio" id="editintypeRadio1"
														name="in_optiontype1" value="1">自定义选项
													</label> <label> <input type="radio" id="editintypeRadio2"
														name="in_optiontype1" value="2">常规选项
													</label>
												</div>
												<div id="selectCategory1" class="radio">
													<label> <input type="radio" id="editincategoryRadio1"
														name="in_optioncategory1" value="1">单选
													</label> <label> <input type="radio" id="editincategoryRadio2"
														name="in_optioncategory1" value="2">多选
													</label>
												</div>
									            
												
												<button type="submit" class="btn btn-default"
													onclick="check()">提交</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
											</form>
										</div>
									</div>
								</div>
							</div>

							<!-- Modal -->

							<!--<button type="button" class="btn btn-primary">Primary</button>-->
						</div>
						<form action="" style="width: 60%">
							<c:forEach items="${ins}" var="in" varStatus="status"  begin="${pager.start}" end="${pager.start+pager.pageSize-1}">
								<ul
									style="border: 0px; background-color: white; list-style-type: none"
									class="sTree2  listsClass" id="sTree2">
									<li id="item_${status.index+1}" class="item_a"
										style="list-style-type: none" data-module="a">
										<div>

											<%-- <input type="checkbox" id="checkFather_${status.index+1}"
												class="checkFather" name="checkBox"> --%>
											${in.in_name}(${in.in_weight}%) 
											<input type="hidden" id="inName${in.in_id}" value="${in.in_name}"> 
											<input type="hidden" id="inWeight${in.in_id}" value="${in.in_weight}%"> 
											<button
												style="background: transparent; color: red; border: 0px; font-size: 16px; padding: 0px"
												type="button" class="btn btn-primary btn-sm"
												data-toggle="modal" data-target="#myModal1"
												id="editFather${in.in_id}" onclick="return editfirstIn(this.id)">编辑指标</button>
												<a
												style="background: transparent; color: red; border: 0px; font-size: 16px; padding: 0px"
												type="button" class="btn btn-primary btn-sm"
												id="deleteFather${in.in_id}" href="deleteIndicator?pageNum=${pager.pageNum}&in_id=${in.in_id}">删除指标</a>
											<!--  <input
									style="float: right; text-align: center; width: auto; margin-top: -0.5%"
									type="text" value="" name="assessDataFatherValue" /> -->
										</div>
										<ul style="list-style-type: none" class="">
											<c:forEach items="${inNexts}" var="inNext" varStatus="status">

												<c:if test="${inNext.in_parent == in.in_id}">
													<li style="list-style-type: none"
														id="subitem_${status.index+1}" data-module="b">
														<div>
															<%-- <input type="checkbox" id="checkChild_${status.index+1}"
																name="checkBox1"> --%> ${inNext.in_name}
															(${inNext.in_weight}%) 
															<input type="hidden" id="indexNameC${inNext.in_id}" value="${inNext.in_name}"> 
															<input type="hidden" id="indexWeightC${inNext.in_id}" value="${inNext.in_weight}%"> 
															<input type="hidden" id="indexFatherC${inNext.in_id}" value="${inNext.in_parent}">
															<input type="hidden" id="indexTypeC${inNext.in_id}" value="${inNext.in_optiontype}">
															<input type="hidden" id="indexCategoryC${inNext.in_id}" value="${inNext.in_optioncategory}">
															<button
																style="background: transparent; color: red; border: 0px; font-size: 14px; padding: 0px"
																type="button" class="btn btn-primary btn-sm"
																data-toggle="modal" data-target="#myModal2"
																id="editChild${inNext.in_id}" onclick="return editNextIn(this.id)">编辑指标</button>
															   <a
																style="background: transparent; color: red; border: 0px; font-size: 14px; padding: 0px"
																type="button" class="btn btn-primary btn-sm"
																id="deleteChild${inNext.in_id}" href="deleteIndicator?pageNum=${pager.pageNum}&in_id=${inNext.in_id}">删除指标</a>	
																<a
																style="background: transparent; color: red; border: 0px; font-size: 14px; padding: 0px"
																type="button" class="btn btn-primary btn-sm"
																id="manageOption${inNext.in_id}" href="selectInOptions?in_id=${inNext.in_id}">指标选项管理</a>
														</div>
													</li>
												</c:if>

											</c:forEach>
										</ul>
									</li>
								</ul>
							</c:forEach>
							<!-- <button type="submit" class="btn btn-default">提交</button> -->
						</form>
						</section>
						<!-- <script type="text/javascript">
							//                alert(111);
							var checkBox1 = document
									.getElementById('inlineCheckbox1');
							var checkBox2 = document
									.getElementById('inlineCheckbox2');
							function check() {

								if (checkBox1.checked) {
									alert("指标是一级指标");

								} else if (checkBox2.checked) {
									alert("指标是二级指标");

								} else {
									alert("提示：您没有选择指标类型！！！");
								}

							}
						</script> -->
						<!-- <script type="text/javascript">
							function deleteIndicator() {
								for (var i = 1; i < 4; i++) {
									var checkObj = $('#checkFather_' + i);
									var Obj = $('#item_' + i);
									if (checkObj[0].checked) {
										Obj.hide();
									} else {
										Obj.show();
									}
								}
								for (var j = 1; j < 5; j++) {
									var checkChild = $('#checkChild_' + j);
									var subitem = $('#subitem_' + j);
									if (checkChild[0].checked) {
										subitem.hide();
									} else {
										subitem.show();
									}
								}
							}
						</script> -->

					</div>
                       <ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
						</ul>
						    
					<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectProIndicator?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectProIndicator?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectProIndicator?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectProIndicator?pageNum=${pager.pageCount }">末页</a></li>
								
							</ul>

				</div>
				<!-- main end -->

			</div>
		</div>
		</section>
		<!-- main-container end -->

		<jsp:include page="/footer1.jsp" flush="true" />
		
		
		<script type="text/javascript">
		
		 $(function(){
		  $(":radio").click(function(){
			  var radio_val = $(this).val();
			  if(radio_val ==1)
			  {
				  $("#selectFather").css("display", "none");
				  $("#selectType").css("display", "none");
				  $("#selectCategory").css("display", "none");
			  }
			  if(radio_val ==2)
			  {
				  $("#selectFather").css("display", "");
				  $("#selectType").css("display", "");
				  $("#selectCategory").css("display", "");
			  }
		  });
		 });
		 function deletefirstIn(id) {
			 var in_id = id.substring(id.indexOf('deleteFather')+12);
			 
		 }

		 function editfirstIn(id) {
		       
		     var in_id = id.substring(id.indexOf('editFather')+10);
		     var in_name = $('#inName'+in_id).val();
		     var in_weight = $('#inWeight'+in_id).val();
		     $("#index_name1").val(in_name);
		     $("#index_weight1").val(in_weight);
		     $("#index_Id1").val(in_id);
		     }
		 
		 function editNextIn(id) {
		 
		     var in_id = id.substring(id.indexOf('editChild')+9);
		    /*  alert(in_id); */
		     var  in_nameC= $('#indexNameC'+in_id).val();
		   /*   alert(in_nameC); */
		     var in_weightC = $('#indexWeightC'+in_id).val();
		     
		     var in_fatherC = $('#indexFatherC'+in_id).val();
		     var in_typeC = $('#indexTypeC'+in_id).val();
		     var in_categoryC = $('#indexCategoryC'+in_id).val();
		     $("#index_name2").val(in_nameC);
		     $("#index_weight2").val(in_weightC);
		     $("#indexCId").val(in_id);
		     
		     obj = document.getElementById("selectFather2");
		  
		     for(i=0;i<obj.length;i++){
		         if(obj[i].value==in_fatherC)
		             obj[i].selected = true;
		     }
		    
		    
		     obj1 = document.getElementById("editintypeRadio1");
		     if(obj1.value==in_typeC){
		             obj1.checked = true;
		     }else{obj1.checked = false;}
		     
		     
		     obj2 = document.getElementById("editintypeRadio2");
		     if(obj2.value==in_typeC){
		             obj2.checked = true;
		     }else{obj2.checked = false;}
		     
		     obj3 = document.getElementById("editincategoryRadio1");
		     if(obj3.value==in_categoryC){
	             obj3.checked = true;
	         }else{obj3.checked = false;}
		     
		     obj4 = document.getElementById("editincategoryRadio2");
		     if(obj4.value==in_categoryC){
	             obj4.checked = true;
	         }else{obj4.checked = false;}
	     }
		</script>
</body>
</html>
