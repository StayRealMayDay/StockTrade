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
<title>大宗交易</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- 于花蕾 2017年9月27 -->

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<script type="text/javascript" src="js/jquery.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />
	<div >
			
			<div class="secondary" style="width:95%">
				<div class="row">
					<div id="content" class="col-lg-12">
						<div class="row">
							<div class="col-sm-12">							
									<ul class="breadcrumb">
										<li><i class="fa fa-home"></i> <a href="index.html">沪深股票</a>
										</li>
										<li><a href="adminSelectAllNews?pageNum=1">沪深A股</a></li>
										<li>所有股票列表</li>
									</ul>
									<!-- /BREADCRUMBS -->
							</div>
						</div>

						<div id="filter-controls" class="btn-group"  style="margin-bottom: 2%">
							<form class="form-inline">
								<div class="form-group">
									<label for="projectName">股票名称：</label> 
									<input id="projectName" type="text" class="form-control" placeholder="股票名称">
								</div>
								<button class="btn btn-primary" onclick="selectStockDzjy()">搜索</button>
							</form>
						</div>
						
						<div class="col-md-10 agileinfo_news_original_grids_center">
							<table style="width: 100%; border: 1px solid #000000; text-align: center;margin-left:150px" class="table table-striped table-hover">
								<thead>
								<tr>
									<th style="text-align: center">序号</th>
									<th style="text-align: center">交易时间</th>
									<th style="text-align: center">股票代码</th>
									<th style="text-align: center">股票简称</th>
									<th style="text-align: center">最新价格</th>
									<th style="text-align: center">成交价格</th>
									<th style="text-align: center">成交量(万股)</th>
									<th style="text-align: center">溢价率</th>
									<th style="text-align: center">买方营业部</th>
									<th style="text-align: center">卖方营业部</th>
								</tr>
								</thead>
								<tbody id="tbody2">
									<c:forEach items="${dzjyList}" var="all" varStatus= "idx">
										<tr>	
											<td>${idx.index} </td>
											<td>${all.transactionDate}</td>
											<td><a href="company?stockNum=${all.stockId}">${all.stockId}</a></td>
											<td><a href="company?stockNum=${all.stockId}">${all.stockName}</a></td>
											<td>${all.latestPrice }</td>
											<td>${all.dealPrice }</td>
											<td>${all.dealNum }</td>
											<td>${all.premiumRate }</td>
											<td>${all.purchasingDepartment}</td>
											<td>${all.salesDepartment}</td>
										</tr>
									</c:forEach>	
								</tbody>
							</table>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<div class="pull-left">
									<div class="dataTables_info" id="datatable1_info">显示 1 to
										${pager.pageSize } 总共 ${pager.recordCount }条</div>
								</div>
								<div class="pull-right">
									<div class="dataTables_paginate paging_bs_full"
										id="datatable1_paginate">
										<ul class="pagination" style="text-align: center;">
											<li><a href="#">共 ${pager.recordCount} 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a>
											</li>
										</ul>
										<ul class="pagination">
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="dzjy?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageCount }">末页</a></li>
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
	<!-- <script type="text/javascript">
		function selectStockDzjy(){
			var stockId = document.getElementById('projectName').value;
			 $.ajax({
		          type: "POST",
		          url: "ajaxSelectStockDzjy",
		          data: {
		          	"stockId":stockId
		          },
		          dataType: "json",
		          success: function(data) {
		          	var dzjyList = data.DzjyList;	
		          	if(dzjyList.length == 0){
		          	}else{
		          		var permissionHtml = "";
		  				for (var i = 0; i < dzjyList.length; i++) {		  					  			
		  					 permissionHtml = permissionHtml
							   +'<tr>'
		        			   +'<td><a href="company">${idx.index}</td>'
		        			   +'<td><a href="company">'+dzjyList[i].transactionDate+'</td>'
		          			   +'<td>'+dzjyList[i].stockId+'</td>'
		          			   +'<td>'+dzjyList[i].stockName+'</td>'
		          			   +'<td>'+dzjyList[i].latestPrice+'</td>'
		          			   +'<td>'+dzjyList[i].dealPrice+'</td>'
		          			   +'<td>'+dzjyList[i].dealNum+'</td>'
		          			   +'<td>'+dzjyList[i].premiumRate+'</td>'
		          			   +'<td>'+dzjyList[i].purchasingDepartment+'</td>'
		          			   +'<td>'+dzjyList[i].salesDepartment+'</td>'
		  				}
		  				
		  				$("#tbody2")[0].innerHTML = permissionHtml;   
		          	}
		          } 
		      }) 	   
		}
	</script> -->
</body>
</html>