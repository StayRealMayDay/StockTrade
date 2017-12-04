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
<title>科技成果产业化评价系统管理端|查看项目信息</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="/ad_head.jsp" flush="true" />
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
		Collect from <a href="http://www.cssmoban.com/">ç§æäº§åæå¡äº§ä¸åè¯ä»·ç³»ç»-åå°ç®¡ç</a>
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
					<div class="col-md-12">
						<!-- BOX -->
						<div class="box border">
							<div class="box-title">
								<h4>
									<i class="fa fa-user"></i><span class="hidden-inline-mobile">项目名称:</span><a
										href="adminSelectProItem?projectUuid=${project.projectUuid }"></a>${project.pjName }
								</h4>
							</div>
							<div class="box-body">
								<div class="tabbable header-tabs user-profile">
									<ul class="nav nav-tabs">
										<li class="active"><a href="#pro_overview"
											data-toggle="tab"><i class="fa fa-dot-circle-o"></i> <span
												class="hidden-inline-mobile">Overview</span></a></li>
									</ul>
									<div class="tab-content">
										<!-- OVERVIEW -->
										<div class="tab-pane fade active in" id="pro_overview">
											<div class="row">
												<!-- PROFILE PIC -->
												<div class="col-md-3">
													<div class="list-group">
														<li class="list-group-item zero-padding"><img alt=""
															class="img-responsive"
															src="<%=basePath%>/static/adStyle/img/profile/avatar.jpg">
														</li>
														<div class="list-group-item profile-details">
															<h2>
																<a
																	href="adminSelectProItem?projectUuid=${project.projectUuid }"
																	title="查看详情">${project.pjName }</a>
															</h2>
															<p>
																<i class="fa fa-circle text-green"></i> 项目背景
															</p>
															<p>${project.pjBackground }</p>
															<p>
																<a href="adminLogin">首页</a>
															</p>

														</div>
														<a href="#" class="list-group-item"><i
															class="fa fa-user fa-fw"></i> 项目基本信息</a> <a href="#"
															class="list-group-item"> <span
															class="badge badge-red">9</span> <i
															class="fa fa-calendar fa-fw"></i> 产品基本信息
														</a> <a href="#" class="list-group-item"><i
															class="fa fa-comment-o fa-fw"></i> 项目概述</a> <a href="#"
															class="list-group-item"><i
															class="fa fa-picture-o fa-fw"></i> 产品概述</a> <a href="#"
															class="list-group-item"><i class="fa fa-cog fa-fw"></i>
															技术概述</a>
															<a href="#"
															class="list-group-item"><i class="fa fa-cog fa-fw"></i>
															商业模式概述</a>
															<a href="#"
															class="list-group-item"><i class="fa fa-cog fa-fw"></i>
															市场概述</a>
															<a href="#"
															class="list-group-item"><i class="fa fa-cog fa-fw"></i>
															自动化评估指标详情</a>
													</div>
												</div>
												<!-- /PROFILE PIC -->
												<!-- PROFILE DETAILS -->
												<div class="col-md-9">
													<!-- ROW 1 -->
													<div class="row">
														<br>
														<div class="col-md-12">
															<h2>项目基本信息</h2>
															<table class="table table-hover">
																<tbody>
																	<tr>
																		<td><i class="fa fa-font"></i> 项目名称</td>
																		<td id="card-name"><a
																			href="adminSelectProItem?projectUuid=${project.projectUuid }"
																			title="查看详情"> ${project.pjName }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>所属行业</td>
																		<td><a href="http://www.baidu.com"
																			target="_Blank">${industry.iName }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>项目创建人</td>
																		<td><a
																			href="selectUserInfo?userUuid=${project.userUuid }"
																			title="查看详情">${user.userName }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-font"></i> 包含的产品服务</td>
																		<td id="card-name"><a href="#" title="查看详情">
																				${product.pdName }</a></td>
																	</tr>

																	<tr>
																		<td><i class="fa fa-rub"></i>融资目标金额</td>
																		<td>${project.pjTargetfinance }</td>
																	</tr>

																	<tr>
																		<td><i class="fa fa-home"></i> 系统评估值</td>
																		<td>${project.pjAutoEvalue }</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 专家评估值</td>
																		<td>${project.pjManualEvalue }</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 评估提交时间</td>
																		<td>${project.pjProtime }</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 项目商业计划书</td>
																		<td><a title="项目商业计划书下载" href="#">下载</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 项目附件</td>
																		<td><a title="项目附件下载" href="#">下载</a></td>
																	</tr>


																</tbody>
															</table>
															<hr class="hr-normal">
															<h2>产品基本信息</h2>
															<table class="table table-hover">
																<tbody>
																	<tr>
																		<td><i class="fa fa-font"></i> 产品名称</td>
																		<td id="card-name"><a href="#" title="查看详情">${product.pdName }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>产品类型</td>
																		<td>${product.pdType }</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>产品实用性</td>
																		<td><a href="#" title="查看详情">${product.pdPractical }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>产品原理性</td>
																		<td><a href="#" title="查看详情">${product.pdPrinciple }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>产品描述</td>
																		<td><a href="#" title="查看详情">${product.pdDescription }</a></td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 产品附件</td>
																		<td><a title="产品附件下载" href="#">下载</a></td>
																	</tr>


																</tbody>
															</table>
														</div>

													</div>

												</div>

												<div class="col-md-12">
													<h2>项目概述</h2>
													<div class="box border blue">

														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>项目概述
															</h4>

														</div>
														<div class="box-body">
															<h4>短期规划</h4>
															<p>${project.pjShortplan }</p>
															<h4>中期规划</h4>
															<p>${project.pjMlplan }</p>
															<h4>团队描述</h4>
															<p>${project.pjTeam }</p>
															<h4>生产概述</h4>
															<p>${project.pjProduction }</p>
														</div>
													</div>
												</div>
												<div class="col-md-12">
													<h2>产品概述</h2>
													<div class="box border blue">
														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>产品概述
															</h4>
														</div>
														<div class="box-body">
															<h4>产品原理</h4>
															<p>${product.pdPrinciple }</p>
															<h4>产品描述</h4>
															<p>${product.pdDescription }</p>
														</div>
													</div>
												</div>
												<div class="col-md-12">
													<h2>技术概述</h2>
													<div class="box border blue">

														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>技术概述
															</h4>

														</div>
														<div class="box-body">
															<h4>技术水平概述</h4>
															<p>${technology.techInnovatelevel }</p>
															<h4>创新程度概述</h4>
															<p>${technology.techInnovatetech }</p>
															<h4>技术难度概述</h4>
															<p>${technology.techDifficulty }</p>
															<h4>成熟程度概述</h4>
															<p>${technology.techMaturelevel }</p>
															<h4>技术水平概述</h4>
															<p>${technology.techTechlevel }</p>
															<h4>专利状态概述</h4>
															<p>${technology.techPatent }</p>													
														</div>
													</div>
												</div>
												<div class="col-md-12">
													<h2>商业模式概述</h2>
													<div class="box border blue">

														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>商业模式概述
															</h4>

														</div>
														<div class="box-body">
															<h4>商业模式概述</h4>
															<p>${business.busChannel }</p>
															<h4>客户概述</h4>
															<p>${business.busCustomer }</p>
															<h4>产品概述</h4>
															<p>${business.busProduct }</p>
															<h4>价格概述</h4>
															<p>${business.busPrice }</p>
															<h4>渠道概述</h4>
															<p>${business.busChannel }</p>
															<h4>服务概述</h4>
														</div>
													</div>
												</div>
												<div class="col-md-12">
													<h2>市场概述</h2>
													<div class="box border blue">

														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>市场概述
															</h4>

														</div>
														<div class="box-body">
															<h4>总体概述</h4>
															<p>${market.maGeneral }</p>
															<h4>市场特征</h4>
															<p>${market.maCharacter }</p>
															<h4>市场环境概述</h4>
															<p>${market.maEnvironment }</p>
															<h4>市场前景概述</h4>
															<p>${market.maProspect }</p>
															<h4>政治环境概述</h4>
															<p>${environment.enviroPolicy }</p>
															<h4>经济环境概述</h4>
															<p>${environment.enviroEconomy }</p>
															<h4>社会环境概述</h4>
															<p>${environment.enviroCulture }</p>
															<h4>技术环境概述</h4>
															<p>${environment.enviroTechnology }</p>
														</div>
													</div>
												</div>
												<div class="col-md-12">
													<h2>自动化评估指标详情</h2>
													<div class="box border blue">

														<div class="box-title">
															<h4>
																<i class="fa fa-code"></i>技术概述
															</h4>

														</div>
														<div class="box-body">

															<table class="table">
																<thead>
																	<tr>
																		<th>指标名称</th>
																		<th>指标选项</th>
																		<th>指标得分</th>
																	</tr>
																</thead>
																<tbody>
																	<c:forEach items="${listEva}" var="listEva"
																		varStatus="status">
																		<tr>
																			<td>${listEva.in_name }</td>
																			<td>${listEva.op_name }</td>
																			<td><strong style="color:red">${listEva.er_value}分</strong>(满分：10分)</td>
																		</tr>
																	</c:forEach>
																</tbody>
															</table>



														</div>
													</div>
												</div>
		
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- /USER PROFILE -->
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script>
		function swapScreen(id) {
			jQuery('.visible').removeClass('visible animated fadeInUp');
			jQuery('#' + id).addClass('visible animated fadeInUp');
		}
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
			App.setPage("index"); //Set current page
			App.init(); //Initialise plugins and elements
		});
		function deleteUser() {
			var a = confirm("确定要删除这个用户吗？");
			if (a == true) {
				/*document.write("恭喜你答对了！");*/
				alert("删除成功");
				begin();
			} else {
				/*document.write("你真是猪，这么简单的问题都答不对！");*/
				alert("暂时不删除");
				//deleteUser();
			}
		}
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>