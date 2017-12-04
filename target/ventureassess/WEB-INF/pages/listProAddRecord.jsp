<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.vcevaluation.pojo.User"  import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	User user = (User)request.getSession().getAttribute("user");
%>
<!DOCTYPE html>
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<title>查看项目新增评估记录</title>
		<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
		<meta name="author" content="htmlcoder.me">

		<!-- Mobile Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<jsp:include page="/head.jsp" flush="true"/>
	</head>

    <body class="front">
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>


			<!-- header-top start -->
			
			<!-- ================ -->
			<div class="header-top">
				<div class="container">
					<div class="row">
						<div class="col-xs-2  col-sm-6">

						</div>
						<div class="col-xs-10 col-sm-6">

							<!-- header-top-second start -->
							<!-- ================ -->
							<div id="header-top-second"  class="clearfix">

							</div>
							<!-- header-top-second end -->

						</div>
					</div>
				</div>
			</div>
			<!-- header-top end -->

			<!-- header start (remove fixed class from header in order to disable fixed navigation mode) -->
			<!-- ================ --> 
			<jsp:include page="/header1.jsp"></jsp:include>
            <!-- header end -->
            <!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li class="active">个人中心</li>
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
							<aside class="col-md-2">
								<div class="sidebar">
									<div class="block clearfix">
										<h3 class="title">个人中心</h3>
										<div class="separator"></div>
										<nav>
											<ul class="nav nav-pills nav-stacked">
												<li><a href="/vcevaluation/toIndex">待办事项</a></li>
												<%if(user.getUser_type()==1){%>  
				                                <li><a href="/vcevaluation/selectSubResultByUserId?pageNum=1">查询我提交的成果</a></li>
												<li><a href="/vcevaluation/selectSubProByUserId?pageNum=1">查询我提交的项目</a></li>								
												<li><a href="/vcevaluation/selectNoEvaResult?pageNum=1">查询待评估的成果</a></li>
												<li><a href="/vcevaluation/selectNoEvaProject?pageNum=1">查询待评估的项目</a></li>
												<%}%>
												<%if(user.getUser_type()==0){%>  
												<li><a href="/vcevaluation/selectEvaResultByUserId?pageNum=1">查询我评估过的成果</a></li>
												<li class="active"><a href="/vcevaluation/selectEvaProByUserId?pageNum=1">查询我评估过的项目</a></li>
												<li><a href="/vcevaluation/selectNoEvaResult?pageNum=1">查询待评估的成果</a></li>
												<li><a href="/vcevaluation/selectNoEvaProject?pageNum=1">查询待评估的项目</a></li>
												<%}%>
											</ul>
										</nav>
									</div>
								   <div class="block clearfix">
										<h3 class="title">资料设置</h3>
										<div class="separator"></div>
										<nav>
											<ul class="nav nav-pills nav-stacked">
												<li><a href="/vcevaluation/userInfo">查看个人资料</a></li>
												<li><a href="/vcevaluation/showUserInfo">修改个人资料</a></li>
											</ul>
										</nav>
									</div>
								</div>
							</aside>
							<!-- sidebar end -->
	
							<!-- main start -->
							<!-- ================ -->
							<div class="main col-md-10">
	
								<!-- page-title start -->
								<!-- ================ -->
								<h3 class="page-title">项目新增评估记录</h3>
								<div class="separator-2"></div>
								<!-- page-title end -->
	
								<table class="table table-hover">
									<thead>
										<tr>
		                                    
		                                    <th>项目名称</th>
		                                    <th>此次评分</th>
		                                    <th>评估时间</th>
		                                    <th>评估人</th>
		                                    <th>项目现状</th>
		                                    <th>评估结果</th>
		                                    <th>评估次数</th>
		                                    <th>项目得分</th>
		                                    <th>更多</th>
	                                    </tr>
									</thead>
									<tbody>
										<c:forEach items="${evas}" var="eva">
											<tr>
											
												<td>${ pro.pro_name}</td>
												<td>${ eva.eva_manual_value}</td>
												<td>${ eva.eva_time}</td>
												<td>${ usermap[eva.eva_ex_id]}</td>
												<c:if test="${pro.pro_flag==1}">
												<td>待评估</td>
												<td>无结果</td>
												</c:if>
												<c:if test="${pro.pro_flag==2}">
												<td>评估截至</td>
												   <c:if test="${pro.pro_evalue >= 8}">
	                                    	        <td ><i class="fa fa-check"></i></td>                                    
	                                                </c:if>
	                                                <c:if test="${pro.pro_evalue < 8}">
		                                            <td ><i class="fa fa-close"></i></td>
	                                                </c:if>
												</c:if>
												<td>${ pro.pro_times}</td>
												<td>${ pro.pro_evalue}</td>
												<td><a class="" href="/vcevaluation/projectItem?pro_id=${pro.pro_id}">项目详情</a><br>
												</td>
											</tr>
											
									      </c:forEach>
									  </tbody>
							      </table>
	                      
							<%-- <!-- pagination start -->
							<ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount} 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
						    </ul>
						    
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectEvaProByUserId?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectEvaProByUserId?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectEvaProByUserId?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectEvaProByUserId?pageNum=${pager.pageCount }">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>
							<!-- pagination end --> --%>
	
							</div>
							<!-- main end -->
	
						</div>
					</div>
				</section>
				<!-- main-container end -->
	


			<!-- footer start (Add "light" class to #footer in order to enable light footer) -->
			<!-- ================ -->
			<jsp:include page="/footer1.jsp" flush="true"/>
		   
			<!-- footer end -->

	</body> 
</html>
