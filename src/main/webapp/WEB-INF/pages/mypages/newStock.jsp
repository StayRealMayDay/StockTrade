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
<title>新股</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<!-- 于花蕾 2017年9月27 -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet"type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet"type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<script src="<%=basePath %>/js/bootstrap.min.js"></script>

<!--[if IE 7]><link rel="stylesheet" href="css/ie7.css" type="text/css" media="all" />
	<![endif]-->
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<link rel="stylesheet" href="css/ie.css" type="text/css" media="all" />
	<![endif]-->
<!-- Favicons
	================================================== -->
<link rel="shortcut icon" href="<%=basePath %>/images/favicon.ico" />
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.carouFredSel-5.6.2.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.sticky.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-scroller-v1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/kendo.web.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/custom.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#qwertyui").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}
</script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
			$(".div2").click(function(){ 
				$(this).next("div").slideToggle("slow")  
				.siblings(".div3:visible").slideUp("slow");
			});
		});
</script>

<style>
.secondary {border:1px solid #CCCCCC;height:800px;margin-left:2%;margin-top:2%;}
</style>



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
									<label for="projectName">股票名称：</label> <input id="projectName"
										type="text" class="form-control" placeholder="股票名称">

								</div>
								<button class="btn btn-primary">搜索</button>
							</form>
						</div>
						
						<div class="col-md-12 agileinfo_news_original_grids_left">
							<table style="width: 100%; border: 1px solid #000000; text-align: center;" class="table table-striped table-hover">
								<thead>
								<tr>
									<th style="text-align: center">序号</th>
									<th style="text-align: center">股票代码</th>
									<th style="text-align: center">申购代码</th>
									<th style="text-align: center">股票简称</th>
									<th style="text-align: center">申购日期</th>
									<th style="text-align: center">中签日期</th>
									<th style="text-align: center">中签缴款日</th>
									<th style="text-align: center">上市日期</th>
									<th style="text-align: center">发行价(元)</th>
									<th style="text-align: center">行业市盈率</th>
									<th style="text-align: center">发行总数(万股)</th>
									<th style="text-align: center">申购上限(万股)</th>
									<th style="text-align: center">顶格申购所需市值(万元)</th>
									<th style="text-align: center">中签率(%)</th>
									<th style="text-align: center">中签号</th>
								</tr>
								</thead>
								
							<c:forEach items="${newStockList}" var="all">
								<tr>
									<td><a href="company?stockId=${all.nstockCode}">${all.nstockId}</a></td>
									<td>${all.nstockCode}</td>
									<td><a href="company?stockId=${all.nstockCode}">${all.nstockApcode}</a></td>
									<td>${all.nstockName }</td>
									<td>${all.applyDate }</td>
									<td>${all.payDate }</td>
									<td>${all.listDate }</td>
									<td>${all.issuePrice }</td>
									<td>${all.issueTotal}</td>
									<td>${all.issuePeRatio}</td>
									<td>${all.industryPeRatio}</td>
									<td>${all.applyUplimit}</td>
									<td>${all.topApplyMvalue}</td>
									<td>${all.centerCheckRatio}</td>
									<td>${all.centerCheckNum }</td>
								</tr>
							</c:forEach>	
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
													${pager.pageNum } 页</a></li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="newStock?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="newStock?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="newStock?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="newStock?pageNum=${pager.pageCount }">末页</a></li>
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
	</div>
</body>
</html>