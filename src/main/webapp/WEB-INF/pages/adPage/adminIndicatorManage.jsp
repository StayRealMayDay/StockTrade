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
<title>科技成果产业化评价系统管理端|指标管理</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/cloud-admin.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/themes/default.css"
	id="skin-switcher">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/responsive.css">

<link
	href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- JQUERY UI-->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css" />
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- FONTS -->
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>
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
			<!-- SAMPLE BOX CONFIGURATION MODAL FORM-->
			<div class="modal fade" id="box-config" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
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
										<li><a href="#">指标管理</a></li>
										<li>查看所有指标</li>
									</ul>
									<!-- /BREADCRUMBS -->

									<div class="description">动态配置指标</div>
								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->
						<menu id="nestable-menu" style="margin: 2px 0">
							<button class="btn btn-primary" type="button"
								data-action="expand-all">
								<i class="fa fa-caret-square-o-right"></i> 全部展开
							</button>
							<button class="btn btn-primary" type="button"
								data-action="collapse-all">
								<i class="fa fa-caret-square-o-up"></i> 全部折叠
							</button>
							<button class="btn btn-primary" type="button"
								data-action="collapse-all">
								<i class="fa fa-caret-square-o-up"></i> 编辑指标
							</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<lable>项目类型：</lable>
							<label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="inlineRadio1" value="option1">
								传统行业
							</label>
							<label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="inlineRadio2" value="option2">
								互联网行业
							</label>
							<label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="inlineRadio3" value="option3">
								制造行业
							</label>
							<label class="radio-inline"> <input type="radio"
								name="inlineRadioOptions" id="inlineRadio4" value="option3">
								制造行业
							</label>
						</menu>
						<!-- SAMPLE -->
						<div class="row hide">
							<div class="col-md-6">
								<!-- BOX -->
								<div class="box border orange">
									<div class="box-title">
										<h4>
											<i class="fa fa-list-ul"></i>Nestable List 1
										</h4>
										<div class="tools">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a> <a href="javascript:;" class="reload"> <i
												class="fa fa-refresh"></i>
											</a> <a href="javascript:;" class="collapse"> <i
												class="fa fa-chevron-up"></i>
											</a> <a href="javascript:;" class="remove"> <i
												class="fa fa-times"></i>
											</a>
										</div>
									</div>
									<div class="box-body clearfix">
										<div class="dd" id="nestable">
											<ol class="dd-list">
												<li class="dd-item" data-id="1">
													<div class="dd-handle">Item 1</div>
												</li>
												<li class="dd-item" data-id="2">
													<div class="dd-handle">Item 2</div>
													<ol class="dd-list">
														<li class="dd-item" data-id="3">
															<div class="dd-handle">Item 3</div>
														</li>
														<li class="dd-item" data-id="4">
															<div class="dd-handle">Item 4</div>
														</li>
														<li class="dd-item" data-id="5">
															<div class="dd-handle">Item 5</div>
															<ol class="dd-list">
																<li class="dd-item" data-id="6">
																	<div class="dd-handle">Item 6</div>
																</li>
																<li class="dd-item" data-id="7">
																	<div class="dd-handle">Item 7</div>
																</li>
																<li class="dd-item" data-id="8">
																	<div class="dd-handle">Item 8</div>
																</li>
															</ol>
														</li>
														<li class="dd-item" data-id="9">
															<div class="dd-handle">Item 9</div>
														</li>
														<li class="dd-item" data-id="10">
															<div class="dd-handle">Item 10</div>
														</li>
													</ol>
												</li>
												<li class="dd-item" data-id="11">
													<div class="dd-handle">Item 11</div>
												</li>
												<li class="dd-item" data-id="12">
													<div class="dd-handle">Item 12</div>
												</li>
											</ol>
										</div>
									</div>
								</div>
								<!-- /BOX -->
								<p>
									<strong>Serialised Output for List 1</strong>
								</p>
								<textarea class="form-control" id="nestable-output"><pre></pre></textarea>
							</div>
							<div class="col-md-6">
								<!-- BOX -->
								<div class="box border red">
									<div class="box-title">
										<h4>
											<i class="fa fa-list-ul"></i>Nestable List 2
										</h4>
										<div class="tools">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a> <a href="javascript:;" class="reload"> <i
												class="fa fa-refresh"></i>
											</a> <a href="javascript:;" class="collapse"> <i
												class="fa fa-chevron-up"></i>
											</a> <a href="javascript:;" class="remove"> <i
												class="fa fa-times"></i>
											</a>
										</div>
									</div>
									<div class="box-body clearfix">
										<div class="dd" id="nestable2">
											<ol class="dd-list">
												<li class="dd-item" data-id="13">
													<div class="dd-handle">Item 13</div>
												</li>
												<li class="dd-item" data-id="14">
													<div class="dd-handle">Item 14</div>
												</li>
												<li class="dd-item" data-id="15">
													<div class="dd-handle">Item 15</div>
													<ol class="dd-list">
														<li class="dd-item" data-id="16">
															<div class="dd-handle">Item 16</div>
														</li>
														<li class="dd-item" data-id="17">
															<div class="dd-handle">Item 17</div>
														</li>
														<li class="dd-item" data-id="18">
															<div class="dd-handle">Item 18</div>
														</li>
													</ol>
												</li>
											</ol>
										</div>
									</div>
								</div>
								<!-- /BOX -->
								<p>
									<strong>Serialised Output for List 2</strong>
								</p>
								<textarea class="form-control" id="nestable2-output"></textarea>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border blue">
									<div class="box-title"
										style="background-color: #4b739a; border-color: #3c5c7b;">
										<h4>
											<i class="fa fa-arrows"></i>评估指标
										</h4>
										<div class="tools hidden-xs">
											<a href="#box-config" data-toggle="modal" class="config">
												<i class="fa fa-cog"></i>
											</a> <a href="javascript:;" class="reload"> <i
												class="fa fa-refresh"></i>
											</a> <a href="javascript:;" class="collapse"> <i
												class="fa fa-chevron-up"></i>
											</a> <a href="javascript:;" class="remove"> <i
												class="fa fa-times"></i>
											</a>
										</div>
									</div>
									<div class="box-body clearfix">
										<div class="dd" id="nestable3">
											<input type="checkbox" />全选 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
												type="checkbox" />全不选


											<c:forEach var="fil" items="${firstIndicList }"
												begin="${pager.start}" end="${pager.start+pager.pageSize-1}">
												<ol class="dd-list">
													<li class="dd-item dd3-item" data-id="15">
														<div class="dd-handle dd3-handle"></div>
														<div style="width: 165%" class="dd3-content">
															<input type="checkbox" /><label
																id="FirInName${fil.inUuid}">${fil.inName }</label> <label
																id="FirInWeight${fil.inUuid}" style="margin-left: 8%">${fil.inWeight*100 }%</label>

															<button
																style="color: red; margin-top: -1px; margin-right: 10%; padding: 0px 5px; background: transparent; border: 0px"
																class="btn btn-xs btn-default" data-toggle="modal"
																data-target="#myModal2" id="editFirst${fil.inUuid}"
																onclick="return editFistIndicator(this.id)">编辑</button>
														</div> <c:forEach var="sil" items="${secondIndicList }">
															<c:if test="${fil.inUuid == sil.inParent}">
																<ol class="dd-list">
																	<li class="dd-item dd3-item" data-id="16">
																		<div class="dd-handle dd3-handle"></div>
																		<div style="width: 165%" class="dd3-content">
																			<input type="checkbox" /> <label
																				id="SecInName${sil.inUuid}">${sil.inName }</label> <label
																				id="SecInWeight${sil.inUuid}"
																				style="margin-left: 12%">${sil.inWeight*100 }%</label>

																			<button
																				style="color: red; margin-top: -1px; margin-right: 10%; padding: 0px 5px; background: transparent; border: 0px"
																				class="btn btn-xs btn-default" data-toggle="modal"
																				data-target="#myModal2" id="editSecond${sil.inUuid}"
																				onclick="return editSecondIndicator(this.id)">编辑</button>

																		</div> <c:forEach var="ol" items="${optionList }">
																			<c:if test="${sil.inUuid==ol.inUuid}">
																				<ol class="dd-list">
																					<li class="dd-item dd3-item" data-id="2">
																						<div class="dd-handle dd3-handle"></div>
																						<div style="width: 165%" class="dd3-content">
																							<input type="checkbox" /> <label style="color:#6C6C6C" id="optionName${ol.opUuid }">${ol.opName }
																							</label>
																							<label id="optionValue${ol.opUuid }">(${ol.opValue }分)</label>								
																							<button
																								style="color: red; margin-top: -1px; margin-right: 10%; padding: 0px 5px; background: transparent; border: 0px"
																								class="btn btn-xs btn-default"
																								data-toggle="modal" data-target="#myModal3"
																								id="editOption${ol.opUuid}"
																								onclick="return editOption(this.id)">编辑</button>

																						</div>
																					</li>

																				</ol>
																			</c:if>
																		</c:forEach>
																	</li>

																</ol>
															</c:if>

														</c:forEach>
													</li>
												</ol>
											</c:forEach>

										</div>
										<!-- 编辑指标 -->
										<div class="modal fade" id="myModal2" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel2">编辑评估指标</h4>
													</div>
													<div class="modal-body">
														<form action="adminEditIndicator">
															<input type="hidden" id="index_Id1" name="inUuid"
																value=""> <input type="hidden" name="pageNum"
																value="${pager.pageNum}">
															<div class="form-group">
																<label>指标名称:</label> <input type="text"
																	class="form-control" name="inName" id="index_name2"
																	placeholder="请输入指标名称...">
															</div>
															<div class="form-group">
																<label>指标权重:</label> <input type="text"
																	class="form-control" name="index_weight2"
																	id="index_weight2" disabled="true"
																	placeholder="请输入指标权重...">
															</div>
															<div class="form-group">
																<label> <input type="radio" id="inlineRadio5"
																	name="in_level" value="1" disabled>一级指标
																</label> <label> <input type="radio" id="inlineRadio6"
																	name="in_level" value="2" disabled>二级指标
																</label>
															</div>

															<div id="selectType1" class="form-group">
																<label> <input type="radio"
																	id="editintypeRadio1" name="in_optiontype1" value="1"
																	disabled>自定义选项
																</label> <label> <input type="radio"
																	id="editintypeRadio2" name="in_optiontype1" value="2"
																	disabled>常规选项
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
										<!-- 模态框-编辑指标选项 -->
										<div class="modal fade" id="myModal3" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel2">编辑指标选项</h4>
													</div>
													<div class="modal-body">
														<form action="adminEditOption">
															<input type="hidden" id="index_Id2" name="opUuid"
																value=""> <input type="hidden" name="pageNum"
																value="${pager.pageNum}">
															<div class="form-group">
																<label>选项名称:</label> <input type="text"
																	class="form-control" name="opName" id="index_name3"
																	placeholder="请输入指标名称...">
															</div>
															<div class="form-group">
																<label>选项值:</label> <input type="text"
																	class="form-control" name="opValue"
																	id="index_weight3" 
																	placeholder="请输入指标权重...">
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
										<!-- 模态框-编辑指标选项 -->
									</div>
									<!--分页-->
									<div>
										<ul class="pagination" style="text-align: center;">

											<li><a href="#">共 ${pager.recordCount } 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a></li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="adminSelectAllIndicator?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="adminSelectAllIndicator?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="adminSelectAllIndicator?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="adminSelectAllIndicator?pageNum=${pager.pageCount }">末页</a></li>
											<li><a>转到 </a></li>
											<li><a><input id="changePage" type="text"
													style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
											<li><a>页 </a></li>
											<li><a href="javascript:goPage();">跳转</a></li>

										</ul>
									</div>
									<!--分页-->
								</div>
								<!-- /BOX -->
							</div>
						</div>
						<!-- /SAMPLE -->
						<div class="footer-tools">
							<span class="go-top"> <i class="fa fa-chevron-up"></i> Top
							</span>
						</div>
					</div>
					<!-- /CONTENT-->
				</div>
			</div>
		</div>
	</section>
	<!--/PAGE -->
	<!-- JAVASCRIPTS -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- JQUERY -->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<!-- JQUERY UI-->
	<script
		src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<!-- BOOTSTRAP -->
	<script
		src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>


	<!-- DATE RANGE PICKER -->
	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>

	<script
		src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<!-- SLIMSCROLL -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<!-- BLOCK UI -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<!-- NESTABLE LISTS -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/nestable/jquery.nestable.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script>
		//编辑一级指标
		function editFistIndicator(id) {
			var FirID = id.replace(/[^0-9]/ig, "");
			var FirInName = $('#FirInName' + FirID).html();
			var FirInWeight = $('#FirInWeight' + FirID).html();
			$("#index_name2").val(FirInName);
			$("#index_weight2").val(FirInWeight);
			$("#index_Id1").val(FirID);
			//alert($("#index_Id1").val(FirID));
			$("#inlineRadio5").attr('checked', true);
			//$("#index_Id1").val();
		}
		//编辑二级指标
		function editSecondIndicator(id) {
			var SecID = id.replace(/[^0-9]/ig, "");
			var SecInName = $('#SecInName' + SecID).html();
			var SecInWeight = $('#SecInWeight' + SecID).html();
			$("#index_name2").val(SecInName);
			$("#index_weight2").val(SecInWeight);
			$("#index_Id1").val(SecID);
			$("#inlineRadio6").attr('checked', true);

		}
		//编辑指标选项
		function editOption(id){
			var opUuid = id.replace(/[^0-9]/ig, "");
			var optionName= $('#optionName'+opUuid).html();
			var optionValue= $('#optionValue'+opUuid).html().replace('(','').replace(')','').replace('分','');
			$('#index_name3').val(optionName);
			$('#index_weight3').val(optionValue);
			$("#index_Id2").val(opUuid);
		}
		//分页输入整数
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