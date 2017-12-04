<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
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
<script type="text/javascript"
	src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
<jsp:include page="/head.jsp" flush="true" />
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
												<li><a href="ad_resultsManage1">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="ad_resultsManage1">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="selectAllProject?pageNum=1">查看项目</a></li>
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
												<li><a href="ad_selectUsers">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看所有日志</a></li>
												<li class="active"><a href="getUserTypeLogs1">检索日志</a></li>
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
							<li><i class="fa fa-home pr-10"></i><a href="#">Home</a></li>
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
			 <jsp:include page="/ad_left.jsp" flush="true" />
				<div class="main col-md-8 col-md-offset-1">
				<h2 class="text-center title">项目-查看编辑信息</h2>
							<div class="separator"></div>
							<p class="text-center">编辑项目的基本信息</p>
                <form name="form1" action="editProject2" method="post" id="form1"  enctype="multipart/form-data" Content-Range="bytes 0-800/801">
					
					<table border="0" class="table table-striped">
						
                        <tr>
							<td>项目名称</td>
							<td><input value="${project.pro_name}" type="text" name="pro_name" id="pro_name" onblur="checkPname()" style="height:35px;width: 75%" ></td>
							 <label id="validate_proname" style="font-size:9px;display:none;"></label>
							
						</tr>
					    
						<tr>
							<td>选择项目包含的成果</td>
							<td>
							
							<div id="selectList"></div>	 
								<input type="button" name="addresseeBtn1" id="addresseeBtn1" value="选择成果" class="btn btn-gray btn-sm" >
								<input type="button" name="button" id="addresseeBtn3" value="清空" class="btn btn-light-gray btn-sm">
							</td>
						</tr>
						<!-- <tr>
	                    <td>选择团队</td>
		                     <td><input type="text" name="team_name" id="team_name" readonly style="height:35px;width: 75%">
		                      <input type="hidden" name="team_id" id="team_id">
		                      <input type="button" name="button" id="teamBtn" value="选择团队" class="btn btn-gray btn-sm"></td>
	                    </tr> -->
	                    <tr>
	                    
	                        <td>硬件与技术是否配套</td>
	                        <td><select class="form-control" id="pro_fit" name="pro_fit" style="width: 75%">
	                               <c:if test="${project.pro_fit==1}">
									<option selected="selected" value="1">硬件十分先进，能支持技术</option>
									<option value="2">硬件基本能支持技术</option>
									<option value="3">硬件还有待改进来满足此次项目所需技术</option>
									</c:if>
									<c:if test="${project.pro_fit==2}">
									<option  value="1">硬件十分先进，能支持技术</option>
									<option selected="selected" value="2">硬件基本能支持技术</option>
									<option value="3">硬件还有待改进来满足此次项目所需技术</option>
									</c:if>
									<c:if test="${project.pro_fit==3}">
									<option  value="1">硬件十分先进，能支持技术</option>
									<option value="2">硬件基本能支持技术</option>
									<option selected="selected" value="3">硬件还有待改进来满足此次项目所需技术</option>
									</c:if>
							</select>
							</td>
	                    </tr>
	                    <tr>
	                       <td>涉及领域是否有最近政策支持</td>
	                       <td>
	                       <select class="form-control" id="pro_support" name="pro_support" style="width: 75%">
	                              <c:if test="${project.pro_support==0}">
									<option selected="selected" value="0">没有政策支持</option>
									<option value="1">有政策支持</option>
								  </c:if>
								  <c:if test="${project.pro_support==1}">
									<option value="0">没有政策支持</option>
									<option selected="selected" value="1">有政策支持</option>
								  </c:if>
							</select>
							</td>
	                    </tr>
	                     <tr>
	                       <td>涉及领域处于什么时期</td>
	                       <td>
	                       <select class="form-control" id="pro_period" name="pro_period" style="width: 75%">
	                             <c:if test="${project.pro_period==1}">
									<option selected="selected" value="1">市场爆发期</option>
									<option value="2">市场增长期</option>
									<option value="3">市场稳定期</option>
									<option value="4">市场衰退期或不确定</option>
								 </c:if>
								 <c:if test="${project.pro_period==2}">
									<option  value="1">市场爆发期</option>
									<option selected="selected" value="2">市场增长期</option>
									<option value="3">市场稳定期</option>
									<option value="4">市场衰退期或不确定</option>
								 </c:if>
								 <c:if test="${project.pro_period==3}">
									<option  value="1">市场爆发期</option>
									<option value="2">市场增长期</option>
									<option selected="selected" value="3">市场稳定期</option>
									<option value="4">市场衰退期或不确定</option>
								 </c:if>
								 <c:if test="${project.pro_period==4}">
									<option selected="selected" value="1">市场爆发期</option>
									<option value="2">市场增长期</option>
									<option value="3">市场稳定期</option>
									<option selected="selected" value="4">市场衰退期或不确定</option>
								 </c:if>
							</select></td>
	                    </tr>
	                     <tr>
	                       <td>银行贷款(:万元)</td>
	                       <td><input type="text" value="${project.pro_bank}" name="pro_bank" id="pro_bank" style="height:35px;width: 75%" datatype="*"></td>
	                    </tr>
	                    
	                     <tr>
	                       <td>企业自筹资金(:万元)</td>
	                       <td><input type="text" value="${project.pro_capital}" name="pro_capital" id="pro_capital" style="height:35px;width: 75%" datatype="*"></td>
	                    </tr>
	                     
	                    <tr>
	                       <td>去年企业年利润</td>
	                       <td>
	                       <select class="form-control" id="pro_lastbenifit" name="pro_lastbenifit" style="width: 75%" >
	                       <c:if test="${project.pro_lastbenifit==0}">
	                       <option selected="selected" value="0">年利润为0或亏损</option>
	                       <option value="1">1% - 10%</option>
	                       <option value="2">10% - 20%</option>
	                       <option value="3">20% - 30%</option>
	                       <option value="4">30%以上</option>
	                       </c:if>
	                       <c:if test="${project.pro_lastbenifit==1}">
	                       <option  value="0">年利润为0或亏损</option>
	                       <option selected="selected" value="1">1% - 10%</option>
	                       <option value="2">10% - 20%</option>
	                       <option value="3">20% - 30%</option>
	                       <option value="4">30%以上</option>
	                       </c:if>
	                       <c:if test="${project.pro_lastbenifit==2}">
	                       <option  value="0">年利润为0或亏损</option>
	                       <option selected="selected" value="1">1% - 10%</option>
	                       <option value="2">10% - 20%</option>
	                       <option value="3">20% - 30%</option>
	                       <option value="4">30%以上</option>
	                       </c:if>
	                       <c:if test="${project.pro_lastbenifit==3}">
	                       <option  value="0">年利润为0或亏损</option>
	                       <option value="1">1% - 10%</option>
	                       <option value="2">10% - 20%</option>
	                       <option selected="selected" value="3">20% - 30%</option>
	                       <option value="4">30%以上</option>
	                       </c:if>
	                       <c:if test="${project.pro_lastbenifit==4}">
	                       <option  value="0">年利润为0或亏损</option>
	                       <option value="1">1% - 10%</option>
	                       <option value="2">10% - 20%</option>
	                       <option value="3">20% - 30%</option>
	                       <option selected="selected" value="4">30%以上</option>
	                       </c:if>
	                       </select>
	                       </td>
	                    </tr>
						<tr>
							<td>项目计划</td>
							<td><textarea value="${project.pro_plan}" name="pro_plan" id="pro_plan"
									rows="10" style="width: 90%;" datatype="*"></textarea></td>
						</tr>
						<tr>
							<td>项目方案</td>
							<td><textarea value="${project.pro_scheme}" name="pro_scheme" id="pro_scheme"
									rows="13" style="width: 90%;" datatype="*"></textarea></td>
						</tr>
						<tr>
						<td> 上传项目相关文件</td>
						 <td>
						 
						 <input type="file" id="file1" name="file1" ><br/>   </td>
						 
						 </tr> 
						 <tr>
						 <td>选择项目负责人</td>
						 <td> <select style="height:34px;width:200px" class="form-control" name="pro_creater">
									<c:forEach items="${users}" var="users">
									<c:if test="${users.user_id ==project.pro_creater}">
									<option selected="selected" value="${users.user_id}">${users.user_name}</option>
									</c:if>
								     </c:forEach>
							</select></td>
						 </tr>
					</table>
					<input type="hidden" value="${project.pro_id}" name="pro_id"/>
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" style="width: 500px">提交修改信息</button>
					</div>
				</form>
					




				</div>
				

			</div>
		
			
		</div>
		</section>
		<!-- main-container end -->


		<jsp:include page="/footer1.jsp" flush="true" />
		<script type="text/javascript">
	
			$(document).ready(function(e) {
		
				//新建项目
				/*  $('#creatManyBtn').click(function(e) {
		        $('#form1').attr('action','editProject2');
		        $('#form1').submit();
		        }); */
				
				//选择多个成果模态窗口
				$('#addresseeBtn1').click(function(){			
					popWin.showWin("600","500","选择多个成果","selectPassResultSmall");
				});
			/* 	//选择多个成员模态窗口
				$('#addresseeBtn2').click(function(){			
					popWin.showWin("600","500","选择多个成员","selectPassResultSmall");
				}); */
				/* //选择团队模态窗口
				$('#teamBtn').click(function(){			
					popWin.showWin("600","500","选择团队","selectTeamSmall");				
				}); */
				//清空多选
				$('#addresseeBtn3').click(function() {
						$('#selectList').empty();
				});

		});
	</script>
		
</body>
</html>
