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
<title>股票交易平台|股票信息管理</title>
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
										<li><a href="adminSelectAllNews?pageNum=1">股票信息管理</a></li>
										<li>公司详情页</li>
									</ul>
									<!-- /BREADCRUMBS -->
								</div>
							</div>

						</div>
						<!-- /PAGE HEADER -->
						<!-- 公司详情展示页 -->
						<div class="col-md-10">
							<!-- BOX -->
							<div class="box border #5e87b0" style="margin-top:40px;">
								<div class="box-title">
									<h4>
										<i class="fa fa-bars"></i>公司详情
									</h4>

								</div>
								<div class="box-body big" style="width:100%;">

								<div class="row" style="width:100%;margin-left:90px;">
									<h2 style="text-align:center"> <strong>${company.stockName }</strong></h2>
									<div class="col-xs-4" style="height:50px;margin-top:30px">
										<label>公司名称：</label>${company.stockName }
									</div>
									<div class="col-xs-4" style="height:50px;margin-top:30px">
										<label>股票代码：</label>${company.stockNum }
									</div>
									<div class="col-xs-4" style="height:50px;margin-top:30px">
										<label>公司所在地区：</label>${company.companyArea } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>相关概念：</label>${company.resolvedConcept }
									</div>
									
									<div class="col-xs-4" style="height:50px">
										<label>上市时间：</label>${company.lunchDate }
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>每股净资产：</label>${company.esNetAsset } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>每股收益：</label>${company.esIncome }
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>净利润：</label>${company.netProfit } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>净利润增长率：</label>${company.netProfitGrowthRate }
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>营业收入：</label>${company.revenue } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>每股现金流：</label>${company.esCashFlow }
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>每股公积金：</label>${company.esPublicFund } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>每股为分配利润：</label>${company.esNotProfit } 
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>总股本：</label>${company.totalCapital }
									</div>
									<div class="col-xs-4" style="height:50px">
										<label>流通股：</label>${company.floatingStock } 
									</div>
									<div class="col-xs-4" style="height:50px;width:80%">
										<label>主营业务：</label>${company.mainBusiness } 
									</div>
									 </div>
									
								</div>
							</div>
							<!-- /BOX -->
						</div>
						<!-- 新闻详情展示页 -->
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script>
		jQuery(document).ready(function() {
			App.setPage("nestable_lists"); //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>