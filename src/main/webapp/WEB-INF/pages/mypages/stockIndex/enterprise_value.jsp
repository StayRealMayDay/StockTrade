<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>市场估值</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

<div  style="float:left;margin-left:300px">
			<jsp:include page="/left_value.jsp" flush="true" />
</div>
<div class="wrapper" style="float:left">
	<div id="main-content">
		
		<div class="secondary" style="float:right;width:200px">
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div style="height:1000px">
		<section id="page">
		<!-- SIDEBAR -->
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
										<li><i class="fa fa-home"></i> <a href="index">首页</a>
										</li>
										<li><a href="company?stockNum=${stockNum}">个股</a></li>
										<li>企业价值</li>
									</ul>
									<!-- /BREADCRUMBS -->
								</div>
							</div>

						</div>
						<!-- /PAGE HEADER -->
						<div id="filter-controls" class="btn-group">
							<form class="form-inline " action="comapny">
								<div class="form-group">
									<label for="projectName">股票代码：</label> <input id="stockNum" name="stockNum"
										type="text" class="form-control" placeholder="股票代码">

								</div>
								<button style="margin-top: 5%" class="btn btn-primary">搜索</button>
							</form>
							<hr>
							<!-- <div>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label>全选</label> <input
									type="checkbox"> <label>全不选</label> <input
									type="checkbox">
								<button class="btn btn-primary">批量删除</button>
							</div> -->
						</div>
						<table id="datatable1" cellpadding="0" cellspacing="0" border="0"
							class="datatable table table-striped table-bordered table-hover dataTable"
							aria-describedby="datatable1_info" style="width:92%">
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
										style="width: 258.333px;">股票名称</th>
									
									<th class="hidden-xs sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Platform(s): activate to sort column ascending"
										style="width: 128.333px;">股票代码</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 124.333px;">总市值</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 164.333px;">当前价格</th>
									<th class="sorting" role="columnheader" tabindex="0"
										aria-controls="datatable1" rowspan="1" colspan="1"
										aria-label="Engine version: activate to sort column ascending"
										style="width: 114.333px;">涨跌幅(%)</th>
									
								</tr>
							</thead>

							
							<tbody role="alert" aria-live="polite" aria-relevant="all">
								<c:forEach var="v" items="${enterpValue}" varStatus="">
									<tr class="gradeA odd">
										<td class=" sorting_1"><input type="checkbox"></td>
										<td>${v.stockName}</td>
										<%-- <td class="hidden-xs ">${v.userUuid}</td> --%>
										<td >${v.stockCode}</td>
										<td ><font color="red">${v.enterpriseValue}</font></td>
										<td >${v.stocktemp.currentPrice}</td>
										<td >${v.stocktemp.updownRatio}</td>
										
									</tr>
									<input type="hidden" name="pageNum" value="${pager.pageNum}">
								</c:forEach>

							</tbody>
						</table>

						<div class="row">
							<div class="col-sm-12">
								<%-- <div >
									<div class="dataTables_info" id="datatable1_info">显示 1 to
										${pager.pageSize } 总共 ${pager.recordCount }条</div>
								</div> --%>
								<div >
									<div class="dataTables_paginate paging_bs_full"
										id="datatable1_paginate">
										<ul class="pagination" style="text-align: center;">

											<li><a href="#">共 ${pager.recordCount} 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a></li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="enterprise_value?stockNum=${stockNum}&pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="enterprise_value?stockNum=${stockNum}&pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="enterprise_value?stockNum=${stockNum}&pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="enterprise_value?stockNum=${stockNum}&pageNum=${pager.pageCount }">末页</a></li>
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
		</div>
			
	
		<div id="footer-aside" class="box-hover">
			<aside class="widget">
				<div class="adv-footer">
					<a class="banner-bottom-left" href="#"><img class="hover-effect responsive-img" src="placeholders/728x90-banner.jpg" alt="" /></a>
					<a class="banner-bottom-right" href="#"><img class="hover-effect responsive-img ml-10" src="placeholders/220x90/sample-ad-3.jpg" alt="" /></a>
				</div><!--end:adv-footer-->
				<div class="clear"></div>
			</aside>
		</div><!--end:footer-aside-->	
		<footer>
			<div class="wrapper clearfix">
				<p id="copyrights">Copyright © 2012 KopaTheme. All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>   <a id="scroll-to-top" href="#top">Back to top</a>
			</div><!--end:wrapper-->
		</footer>
	</div><!--main-content-->
</div><!--end:wrapper-->

</body>
</html>