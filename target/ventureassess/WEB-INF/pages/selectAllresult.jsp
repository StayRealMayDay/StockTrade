<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询成果</title>
<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<jsp:include page="/head.jsp" flush="true"/>
</head>

<body>
<jsp:include page="/header1.jsp" flush="true"/>
	<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li><a href="/vcevaluation/selectResult">查询成果</a></li>
								<li class="active">成果展示</li>
							</ol>
						</div>
					</div>
				</div>
			</div>
			<!-- page-intro end -->
<!-- typography page -->
<div class="typography">

			<!-- container-wrap -->
			<div class="container">
				<div class="grid_3 grid_5">
				 
					<h3 class="hdg" style="font-family:	\5FAE\8F6F\96C5\9ED1">成果查询</h3>
				
					<table class="table table-hover">
									<thead>
										<tr>
		                                    <th>成果类型</th>
		                                    <th>成果名称</th>
		                                    <th>成果提供者</th>
		                                    <th>成果提交时间</th>
		                                    <th>评估状态</th>
		                                    <th>评估结果</th>
		                                    <th>评估次数</th>
		                                    <th>评估均值</th>
		                                    <th>评估截止日期</th>
		                                    <th>更多</th>
	                                    </tr>
									</thead>
									<tbody>
										<c:forEach items="${list}" var="lar" >
											<tr>
											   <c:if test="${lar.res_type==1}">
												<td>论文</td>
												</c:if>
												<c:if test="${lar.res_type==2}">
												<td>专利</td>
												</c:if>
												<c:if test="${lar.res_type==3}">
												<td>软件</td>
												</c:if>
												<c:if test="${lar.res_type==4}">
												<td>样机</td>
												</c:if>
												<td>${ lar.res_name}</td>
												<td>${ lar.res_provider}</td>
												<td>${ lar.res_protime}</td>
												<c:if test="${lar.res_flag==1}">
												<td>待评估</td>
												<td>无结果</td>
												</c:if>
												<c:if test="${lar.res_flag==2}">
												<td>评估截至</td>
													<c:if test="${lar.res_evalue >= 8}">
	                                    	        <td ><i class="fa fa-check"></i></td>                                    
	                                                </c:if>
	                                                <c:if test="${lar.res_evalue < 8}">
		                                            <td ><i class="fa fa-close"></i></td>
	                                                </c:if>
												</c:if>
												<td>${ lar.res_times}</td>
												<td>${ lar.res_evalue}</td>
												<td>${ lar.res_eva_deadline}</td>
												<td><a class="" href="/vcevaluation/resultItem?res_id=${lar.res_id}">查看详情</a></td>
											</tr>
									    </c:forEach>
									</tbody>
							    </table>
				</div>
					<!-- pagination start -->
							<ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
						    </ul>
						    
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectAllResult?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectAllResult?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectAllResult?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectAllResult?pageNum=${pager.pageCount }">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>
							<!-- pagination end -->
				<br>
				<br>
				
			</div>
			<!-- //container-wrap -->
		</div>
	<!-- //typography -->
	
<!-- footer section -->
<jsp:include page="/footer1.jsp" flush="true"/>
<!-- /footer section -->

</body>
</html>