<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<title>科技成果产业化评价系统管理端|产品服务管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<!-- STYLESHEETS -->
<!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
<jsp:include page="/ad_head.jsp" flush="true" />
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
										<li><a href="#">产品服务管理</a></li>
										<li>查看所有的产品服务</li>
									</ul>
									<!-- /BREADCRUMBS -->
								</div>
							</div>

						</div>
						<!-- /PAGE HEADER -->
						<div id="filter-controls" class="btn-group">
							<form class="form-inline">
								<div class="form-group">
									<label for="projectName">产业化项目名称：</label> <input
										id="projectName" type="text" class="form-control"
										placeholder="开始时间">

								</div>
								<button style="margin-top: 5%" class="btn btn-primary">搜索</button>
							</form>
							<hr>
							<div>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label>全选</label> <input
									type="checkbox"> <label>全不选</label> <input
									type="checkbox">
								<button class="btn btn-primary">批量删除</button>
							</div>
						</div>
						<table id="datatable1" cellpadding="0" cellspacing="0" border="0"
							class="datatable table table-striped table-bordered table-hover dataTable"
							aria-describedby="datatable1_info">
							<thead>
								<tr role="row">
									<th class="sorting_asc" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-sort="ascending"
										aria-label="Rendering engine: activate to sort column descending"
										style="width: 58.333px;"><input type="checkbox" /></th>
									<th class="sorting_asc" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-sort="ascending"
										aria-label="Rendering engine: activate to sort column descending"
										style="width: 258.333px;">产品服务名称</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Browser: activate to sort column ascending"
										style="width: 161.333px;">产品类型</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Browser: activate to sort column ascending"
										style="width: 161.333px;">产品实用性</th>
									<th class="hidden-xs sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Platform(s): activate to sort column ascending"
										style="width: 128.333px;">所属项目</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 124.333px;">产品提交人</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 164.333px;">系统自动评估分数</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 114.333px;">查看产品详情</th>
									<th class="hidden-xs sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="CSS grade: activate to sort column ascending"
										style="width: 168.333px;">操作</th>
								</tr>
							</thead>

							<tfoot>
								<tr>
									<th rowspan="1" colspan="1"><input type="checkbox" /></th>
									<th rowspan="1" colspan="1">产品服务名称</th>
									<th rowspan="1" colspan="1">产品类型</th>
									<th rowspan="1" colspan="1">产品实用性</th>
									<th class="hidden-xs" rowspan="1" colspan="1">所属项目</th>
									<!--<th rowspan="1" colspan="1">Engine version</th>-->
									<th class="hidden-xs" rowspan="1" colspan="1">产品提交人</th>
									<th class="hidden-xs" rowspan="1" colspan="1">系统自动评估分数</th>
									<th class="hidden-xs" rowspan="1" colspan="1">查看产品详情</th>

									<th class="hidden-xs" rowspan="1" colspan="1">操作</th>
								</tr>
							</tfoot>
							<tbody role="alert" aria-live="polite" aria-relevant="all">
								<c:forEach var="apl" items="${allProductList }" varStatus="">
									<tr class="gradeA odd">
										<td class=" sorting_1"><input type="checkbox"></td>
										<td><a href="#">${apl.pdName}</a></td>
										<td class="hidden-xs ">${apl.pdType}</td>
										<td class="center ">${apl.pdPractical}</td>
										<c:forEach var="pl" items="${projectList }" varStatus="">
											<c:if test="${pl.projectUuid==apl.projectUuid }">
												<td class="center hidden-xs "><a href="#">${pl.pjName }</a></td>
											</c:if>
										</c:forEach>
										<c:forEach var="ul" items="${userList }" varStatus="">
											<c:if test="${apl.userUuid == ul.userUuid}">
												<td class="center hidden-xs "><a href="#">${ul.userName }</a></td>
											</c:if>
										</c:forEach>
										<c:if test="${not empty apl.pdEvalue}">
											<td class="center hidden-xs ">${apl.pdEvalue}</td>
										</c:if>
										<c:if test="${empty apl.pdEvalue}">
											<td class="center hidden-xs ">暂无评分</td>
										</c:if>

										<td class="center hidden-xs "><a href="#">查看产品详情</a></td>
										<td class="center hidden-xs "><input type="hidden"
											value="${apl.productUuid}" name="productUuid" /> <a
											title="删除该产品服务" class="btn btn-xs btn-info"
											href="/ventureassess/deleteProduct?productUuid=${apl.productUuid}"
											onclick="deleteUser()">删除</a> <a title="编辑该产品服务"
											class="btn btn-xs btn-info"
											href="/ventureassess/editUsers?productUuid=${apl.productUuid}"
											onclick="deleteUser()">修改</a></td>
									</tr>
								</c:forEach>

							</tbody>
						</table>

						<div class="row">
							<div class="col-sm-12">
								<div class="pull-left">
									<div class="dataTables_info" id="datatable1_info">显示 1 to
										10 总共 57 条</div>
								</div>
								<div class="pull-right">
									<div class="dataTables_paginate paging_bs_full"
										id="datatable1_paginate">	
										<ul class="pagination" style="text-align: center;">

											<li><a href="#">共 ${pager.recordCount } 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a></li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="selectAllProduct?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="selectAllProduct?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="selectAllProduct?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="selectAllProduct?pageNum=${pager.pageCount }">末页</a></li>
											<li><a>转到 </a></li>
											<li><a><input id="changePage" type="text"
													style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
											<li><a>页 </a></li>
											<li><a href="javascript:goPage();">跳转</a></li>

										</ul>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script>
		function goPage() {
			var curPage = document.getElementById("changePage").value * 1;
			if (!/^[1-9]\d*$/.test(curPage)) {
				alert("请输入正整数");
				return;
			}
			var max = $
			{
				pager.pageCount
			}
			;
			if (curPage > max) {
				alert("超出数据页面");
				return;
			}
			//  alert(curPage);
			window.location.href = "?pageNum=" + curPage;
		}
		jQuery(document).ready(function() {
			App.setPage("nestable_lists"); //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>