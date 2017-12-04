<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>股票交易平台|修改公司信息</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="/ad_head.jsp" flush="true" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-markdown/css/bootstrap-markdown.min.css" />
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>

<script type="text/JavaScript">
	       function selectUserRole() {
		var objS = document.getElementById("userRole");
		var selectValue = objS.options[objS.selectedIndex].value;
		alert(selectValue);
	}
</script>
</head>
<body>
	<!-- HEADER -->
	<jsp:include page="/ad_header.jsp" flush="true" />
	<!--/HEADER -->
	<div class="copyrights">
		Collect from <a href="http://www.cssmoban.com/"></a>
	</div>
	<!-- PAGE -->
	<section id="page">
		<!-- SIDEBAR -->
		<jsp:include page="/ad_left.jsp" flush="true" />
		<!-- /SIDEBAR -->
		<div id="main-content">
			<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="modal fade" id="box-config" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">Ã</button>
							<h4 class="modal-title">Box Settings</h4>
						</div>
						<div class="modal-body">Here goes box setting content.</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
			<!-- /SAMPLE BOX CONFIGURATION MODAL FORM-->
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
										<li><a href="adminSelectAllNews?pageNum=1">公司信息管理</a></li>
										<li>编辑公司信息</li>
									</ul>

								</div>
							</div>
						</div>

						<div class="box border #5e87b0">
							<div class="box-title">
								<h4>
									<i class="fa fa-bars"></i>公司信息管理
								</h4>
							</div>
							<div class="box-body big">
								<form method="post" action="adminUpdateCompanyInfo" class="form-horizontal" role="form">
									
									<div class="form-group">
										<label class="col-sm-3 control-label">公司名称</label>
										<div class="col-sm-9">
											<input class="form-control" id="focusedInput" type="text"
												name="stockName" value="${company.stockName }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">股票代码</label>
										<div class="col-sm-9">
											<input class="form-control" id="1111" type="text"
												name="stockNum" value="${company.stockNum }">
										</div>
									</div> 
									<div class="form-group">
										<label class="col-sm-3 control-label">公司所在地区</label>
										<div class="col-sm-9">
											<input type="text" name="companyArea" class="form-control "
												value="${company.companyArea }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">相关概念</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="resolvedConcept"
												id="myDate" value="${company.resolvedConcept }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">上市时间</label>
										<div class="col-sm-9">
											<input class="form-control " type="date" name="lunchDate"
												id="myDate" value="${company.lunchDate }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">每股净资产</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="esNetAsset"
												id="myDate" value="${company.esNetAsset }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">每股收益</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="esIncome"
												id="myDate" value="${company.esIncome }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">净利润</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="netProfit"
												id="myDate" value="${company.netProfit }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">净利润增长率</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="netProfitGrowthRate"
												id="myDate" value="${company.netProfitGrowthRate }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">营业收入</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="revenue"
												id="myDate" value="${company.revenue }">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label">每股现金流</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="esCashFlow"
												id="myDate" value="${company.esCashFlow }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">每股公积金</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="esPublicFund"
												id="myDate" value="${company.esPublicFund }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">每股为分配利润</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="esNotProfit"
												id="myDate" value="${company.esNotProfit }">
										</div>
									</div>
									
									
									<div class="form-group">
										<label class="col-sm-3 control-label">总股本</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="totalCapital"
												id="myDate" value="${company.totalCapital }">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label">流通股</label>
										<div class="col-sm-9">
											<input class="form-control " type="text" name="floatingStock"
												id="myDate" value="${company.floatingStock }">
										</div>
									</div>

									<div class="form-group has-warning">
										<label class="col-sm-3 control-label">主营业务</label>
										<div class="col-sm-9">
											<textarea name="mainBusiness" rows="3" cols="135">
                                            ${company.mainBusiness }
                                            </textarea>
										</div>
									</div>
                                    <input type="hidden" name="companyId" value="${company.companyId }"/>   
									<button style="width: 200px; position: relative; left: 430px"
										type="submit" class="btn btn-primary">提交</button>
									
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script>
		
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>