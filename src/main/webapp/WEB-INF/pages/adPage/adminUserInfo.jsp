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
<title>科技成果产业化评价系统管理端|查看用户信息</title>
<style type="text/css">
.demo1 {
	height: 300px;
}
</style>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="/ad_head.jsp" flush="true" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/adStyle/css/laydate.css" />
<link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700'
	rel='stylesheet' type='text/css'>

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
					<div class="col-md-3">
						<div class="list-group">
							<label>个人照片</label>
							<li class="list-group-item zero-padding"><img alt=""
								class="img-responsive"
								src="<%=basePath%>/static/adStyle/img/profile/avatar.jpg">

							</li>
							<div class="list-group-item profile-details">
								<h2>
									<a href="/ventureassess/selectUserInfo?userUuid=${el.userUuid}">
										${user.userName }</a>
								</h2>
								<p>
									<i class="fa fa-circle text-green"></i> 创业者
								</p>

							</div>
							<label class="list-group-item"><i
								class="fa fa-user fa-fw"></i>用户名：<a
								href="/ventureassess/selectUserInfo?userUuid=${el.userUuid}">
									${user.userName }</a></label> <label class="list-group-item"> <span
								class="badge badge-red"></span> <i class="fa fa-user fa-fw"></i>真实姓名：${user.userRealname }
							</label> <label class="list-group-item"><i
								class="fa fa-user fa-fw"></i> 邮箱：${user.userEmail }</label> <label
								class="list-group-item"><i class="fa fa-user fa-fw"></i>性别：
								${user.userGender }</label> <label " class="list-group-item"><i
								class="fa fa-user fa-fw"></i> 年龄：${user.userAge }</label> <label
								class="list-group-item"><i class="fa fa-user fa-fw"></i>所在区域：
								${user.userArea }</label> <label class="list-group-item"><i
								class="fa fa-user fa-fw"></i> 工作经验：${user.userSeniority }</label> <label
								class="list-group-item"><i class="fa fa-user fa-fw"></i>
								学历：${user.userEdu }</label>
							<%-- <label href="#"
								class="list-group-item"><i class="fa fa-user fa-fw"></i>
								研究领域：${user.userScientific }</label> --%>
							<label class="list-group-item"><i
								class="fa fa-user fa-fw"></i>所在公司：${user.userCompany }</label> <label
								class="list-group-item"><i class="fa fa-user fa-fw"></i>
								工作年限：${user.userWorkyear }</label> <label class="list-group-item"><i
								class="fa fa-user fa-fw"></i>研究方向： ${user.userResearch }</label> <a
								href="#" class="list-group-item"><i class="fa fa-cog fa-fw"></i>
								系统设置</a>
							<button
								style="color: red; margin-top: -1px; margin-right: 10%; padding: 0px 5px; background: transparent; border: 0px"
								class="btn btn-xs btn-default" data-toggle="modal"
								data-target="#myModal3" id="editOption${user.userUuid }"
								onclick="return editOption(this.id)">修改密码</button>
							<input id="UserUuid" type="hidden" value="${user.userFlag }" />
						</div>
					</div>


					<div class="modal fade" id="myModal3" tabindex="-1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">

								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal">
										<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
									</button>
									<h4 class="modal-title" id="myModalLabel2">修改用户密码</h4>
								</div>
								<div class="modal-body">
									<form action="adminUpdatePwd" onsubmit="return check();">
										<input type="hidden" id="index_Id2" name="opUuid" value="">
										<input id="UserUuid1" type="hidden" name="userUuid"
											value="${user.userUuid }" /> <input type="hidden"
											name="pageNum" value="${pager.pageNum}">
										<div class="form-group">
											<label>旧密码:</label> <input type="password"
												class="form-control" name="opName" id="index_name3"
												placeholder="请输入旧密码">
										</div>
										<label id="prompt_ps" style="font-size: 9px; display: none;"></label>
										<div class="form-group">
											<label>设置新密码:</label> <input type="password"
												class="form-control" name="userPwd" id="index_pwd3"
												placeholder="请输入新密码...">
										</div>
										<div class="form-group">
											<label>再次输入新密码:</label> <input type="password"
												class="form-control" name="opValue" id="index_pwd4"
												placeholder="再次输入新密码">
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
					<div class="col-md-9">
						<!-- BOX -->
						<div class="box border">
							<div class="box-title">
								<h4>
									<i class="fa fa-user"></i><span class="hidden-inline-mobile">Hello,
										${user.userName }</span>
								</h4>
							</div>
							<div class="box-body">
								<div class="tabbable header-tabs user-profile">
									<ul class="nav nav-tabs">
										<li id="index1" class=""><a href="#follow_requirement"
											data-toggle="tab"><i class="fa fa-edit"></i> <span
												class="hidden-inline-mobile"> 关注的需求</span></a></li>
										<li id="index2" class=""><a href="#create_project"
											data-toggle="tab"><i class="fa fa-dot-circle-o"></i> <span
												class="hidden-inline-mobile">创建的项目</span></a></li>
										<li id="index3" class=""><a href="#release_requirement"
											data-toggle="tab"><i class="fa fa-dot-circle-o"></i> <span
												class="hidden-inline-mobile">发布的需求</span></a></li>
										<li id="index4" class=""><a href="#follow_project"
											data-toggle="tab"><i class="fa fa-dot-circle-o"></i> <span
												class="hidden-inline-mobile">关注的项目</span></a></li>
										<li id="index5" class="active"><a href="#person_intro"
											data-toggle="tab"><i class="fa fa-dot-circle-o"></i> <span
												class="hidden-inline-mobile">个人简介</span></a></li>
									</ul>
									<div class="tab-content">
										<!-- 个人简介 -->
										<div class="tab-pane fade active in" id="person_intro">
											<div class="row">

												<div class="col-md-12">

													<h2 style="color: #5e87b0; font-weight: bold;"
														align="center">______学习经历______</h2>
													<div style="border: 1px solid #5e87b0;" class="experience">
														<div class="box-body">

															<table class="table">
																<thead>
																	<tr>
																		<th>入学时间</th>
																		<th>毕业时间</th>
																		<th>所在学校</th>
																		<th>学历</th>
																		<th>操作</th>
																	</tr>
																</thead>
																<tbody>
																	<c:forEach var="ll" items="${leList }" varStatus="">
																		<tr>
																			<td id="start${ll.leUuid}">${ll.leStart }</td>
																			<td id="end${ll.leUuid}">${ll.leEnd }</td>
																			<td id="school${ll.leUuid}">${ll.leSchool }</td>
																			<td id="edu${ll.leUuid}">${ll.leEdu }</td>
																			<td><a title="删除学习经历"
																				class="btn btn-xs btn-info"
																				href="/ventureassess/adminDeleteLearnExperience?leUuid=${ll.leUuid}&userUuid1=${ll.userUuid}"
																				onclick="deleteUser()">删除</a>
																				<button class="btn btn-xs btn-info"
																					data-toggle="modal" data-target="#myModa34"
																					id="${ll.leUuid}"
																					onclick="return editLearnExperience(this.id)">编辑</button>
																			</td>
																		</tr>
																	</c:forEach>
																</tbody>
															</table>
														</div>
													</div>
													<button class="btn btn-xs btn-default" data-toggle="modal"
														data-target="#myModa33">
														<strong>添加学习经历</strong>
													</button>
													<br>
													<h2 style="color: #5e87b0; font-weight: bold;"
														align="center">______工作经历______</h2>
													<div style="border: 1px solid #5e87b0;" class="experience">
														<div class="box-body">
															<table class="table">
																<thead>
																	<tr>
																		<th>入职时间</th>
																		<th>离职时间</th>
																		<th>所在公司</th>
																		<th>具体职称</th>
																		<th>操作</th>
																	</tr>
																</thead>
																<tbody>
																	<c:forEach var="wl" items="${weList }" varStatus="">
																		<tr>
																			<td id="weStart${wl.weUuid }">${wl.weStart }</td>
																			<td id="weEnd${wl.weUuid }">${wl.weEnd }</td>
																			<td id="weCompany${wl.weUuid }">${wl.weCompany }</td>
																			<td id="weRank${wl.weUuid }">${wl.weRank }</td>
																			<td><a title="删除学习经历"
																				class="btn btn-xs btn-info"
																				href="/ventureassess/adminDeletetWorkExperience?weUuid=${wl.weUuid}&userUuid4=${wl.userUuid}"
																				onclick="deleteUser()">删除</a>
																				<button class="btn btn-xs btn-info"
																					data-toggle="modal" data-target="#myModa42"
																					id="${wl.weUuid }"
																					onclick="return editWorkExperience(this.id)">编辑</button>
																			</td>
																		</tr>
																	</c:forEach>
																</tbody>
															</table>
														</div>
													</div>
													<button class="btn btn-xs btn-default" data-toggle="modal"
														data-target="#myModa41">
														<strong>添加工作经历</strong>
													</button>
													<br>
													<h2 style="color: #5e87b0; font-weight: bold;"
														align="center">______研究领域______</h2>
													<div style="border: 1px solid #5e87b0;" class="experience">
														<div class="box-body">
															<label>${user.userScientific }</label>
														</div>
													</div>
													
												</div>
											</div>
										</div>
										<!-- 模态框-添加学习经历 -->
										<div class="modal fade" id="myModa33" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel3">添加学习经历</h4>
													</div>
													<div class="modal-body">
														<form id="wizForm" action="adminAddLearnExperience"
															method="post" class="form-horizontal">
															<input type="hidden" name="userUuid1"
																value="${user.userUuid }">
															<div class="form-group">
																<label class="control-label col-md-3">入学时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input name="leStart" type="date" />
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">所在学校<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" name="leSchool"
																		placeholder="请输入所在学校">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">学历<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<select class="form-control" name="pj_period">
																		<option value="">请选择</option>
																		<c:forEach items="${edulist}" var="edu">
																			<option value="${edu.ddValue}">${edu.ddValue}</option>
																		</c:forEach>
																	</select>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">毕业时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input name="leEnd" type="date" />
																</div>
															</div>
															<input type="submit" value="提交" />
															<!-- <button type="submit" class="btn btn-default"
																>提交</button> -->
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
														</form>
													</div>
												</div>
											</div>
										</div>
										<!-- 修改学习经历 -->
										<div class="modal fade" id="myModa34" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel3">修改学习经历</h4>
													</div>
													<div class="modal-body">
														<form id="wizForm" action="adminEditLearnExperience"
															method="post" class="form-horizontal">
															<input type="hidden" id="index_Id2" name="userUuid2"
																value="${user.userUuid }"> <input type="hidden"
																id="index_Id3" name="leUuid2" value="">
															<div class="form-group">
																<label class="control-label col-md-3">入学时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="leStart2" name="leStart" type="date" />
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">所在学校<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="leSchool2" type="text" class="form-control"
																		name="leSchool" placeholder="请输入所在学校">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">学历<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<select class="form-control" name="leEdu">
																		<option id="leEdu2" value="">请选择</option>
																		<c:forEach items="${edulist}" var="edu">
																			<option value="${edu.ddValue}">${edu.ddValue}</option>
																		</c:forEach>
																	</select>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">毕业时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="leEnd2" name="leEnd" type="date" />
																</div>
															</div>
															<input type="submit" value="提交" />
															<!-- <button type="submit" class="btn btn-default"
																>提交</button> -->
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
														</form>
													</div>
												</div>
											</div>
										</div>
										<!-- 添加工作经历 -->
										<div class="modal fade" id="myModa41" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel3">添加工作经历</h4>
													</div>
													<div class="modal-body">
														<form id="wizForm" action="adminAddWorkExperience"
															method="post" class="form-horizontal">
															<input type="hidden" name="userUuid3"
																value="${user.userUuid }">
															<div class="form-group">
																<label class="control-label col-md-3">入职时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input name="weStart" type="date" />
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">所在公司<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" name="weCompany"
																		placeholder="请输入所在公司">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">具体职务<span  
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" name="weRank"
																		placeholder="请输入具体职称">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">离职时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input name="weEnd" type="date" />
																</div>
															</div>
															<input type="submit" value="提交" />
															<!-- <button type="submit" class="btn btn-default"
																>提交</button> -->
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
														</form>
													</div>
												</div>
											</div>
										</div>
										<!-- 修改工作经历 -->
										<div class="modal fade" id="myModa42" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal">
															<span aria-hidden="true">&times;</span><span
																class="sr-only">Close</span>
														</button>
														<h4 class="modal-title" id="myModalLabel3">修改工作经历</h4>
													</div>
													<div class="modal-body">
														<form id="wizForm" action="adminAddLearnExperience"
															method="post" class="form-horizontal">
															<input type="hidden" name="userUuid5"
																value="${user.userUuid }">
																<input id="index" type="hidden" name="weUuid"
																value="">
															<div class="form-group">
																<label class="control-label col-md-3">入职时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="weStart2" name="weStart" type="date" />
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">所在公司<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" id="weCompany2" class="form-control" name="weCompany"
																		placeholder="请输入所在公司">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">具体职务<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="weRank2" type="text" class="form-control" name="weRank"
																		placeholder="请输入具体职务">
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">离职时间<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input id="weEnd2" name="weEnd" type="date" />
																</div>
															</div>
															<input type="submit" value="提交" />
															<!-- <button type="submit" class="btn btn-default"
																>提交</button> -->
															<button type="button" class="btn btn-default"
																data-dismiss="modal">关闭</button>
														</form>
													</div>
												</div>
											</div>
										</div>
										<!-- 个人简介 -->

										<!-- 关注的项目-->
										<div class="tab-pane fade" id="follow_project">
											<div id="filter-controls" class="btn-group">
												<form class="form-inline">
													<div class="form-group">
														<label for="projectName">项目名称：</label> <input
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
											<table id="datatable1" cellpadding="0" cellspacing="0"
												border="0"
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
															style="width: 258.333px;">项目名称</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">包含的产品服务</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">商业计划书</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 128.333px;">项目负责人</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 104.333px;">系统自动<br>评估分数
														</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 108.333px;">目标金额<br>(单位:万元)
														</th>

														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 168.333px;">取消收藏</th>
													</tr>
												</thead>

												<tfoot>
													<tr>
														<th rowspan="1" colspan="1"><input type="checkbox" /></th>
														<th rowspan="1" colspan="1">项目名称</th>
														<th rowspan="1" colspan="1">包含的产品服务</th>
														<th rowspan="1" colspan="1">商业计划书</th>
														<th class="hidden-xs" rowspan="1" colspan="1">项目负责人</th>
														<th class="hidden-xs" rowspan="1" colspan="1">系统自动<br>评估分数
														</th>
														<th rowspan="1" colspan="1">目标金额<br>(单位:万元)
														</th>
														<th class="hidden-xs" rowspan="1" colspan="1">取消收藏</th>
													</tr>
												</tfoot>
												<tbody role="alert" aria-live="polite" aria-relevant="all">

													<tr class="gradeA odd">
														<td class=" sorting_1"><input type="checkbox"></td>
														<td><a href="#">aaaa</a></td>
														<td class="hidden-xs "><a href="#">iiii</a></td>
														<td class="center "><a href="#">点击查看</a></td>
														<td class="center hidden-xs "><a href="#">ooo</a>
														<td class="center hidden-xs ">000</td>
														<%-- <c:forEach var="rl" items="${relationList }" varStatus="">
											<c:if test="${empty rl.userUuid}">
												<td class="center hidden-xs ">否</td>
											</c:if>
											<c:if test="${not empty rl.userUuid}">
												<td class="center hidden-xs ">是</td>
											</c:if>
										</c:forEach> --%>
														<td class="center hidden-xs "></td>
														<td class="center hidden-xs "><a title="是否取消关注该项目"
															class="btn btn-xs btn-info"
															href="/ventureassess/adminDeleteProject?projectUuid=&pageNum="
															onclick="deleteUser()">取消收藏</a></td>
													</tr>
												</tbody>
											</table>
											<div class="row">
												<div class="col-sm-12">
													<div class="pull-left">
														<div class="dataTables_info" id="datatable1_info">显示
															1 to 10 总共 57 条</div>
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
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProduct?pageNum=${pager.pageNum+1 }">下页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
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
										<!-- 关注的项目-->

										<!-- 发布的需求 -->
										<div class="tab-pane fade" id="release_requirement">
											<div id="filter-controls" class="btn-group">
												<form class="form-inline">
													<div class="form-group">
														<label for="projectName">项目名称：</label> <input
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
											<table id="datatable1" cellpadding="0" cellspacing="0"
												border="0"
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
															style="width: 258.333px;">项目名称</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">包含的产品服务</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">商业计划书</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 128.333px;">项目负责人</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 104.333px;">系统自动<br>评估分数
														</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 108.333px;">目标金额<br>(单位:万元)
														</th>

														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 168.333px;">取消收藏</th>
													</tr>
												</thead>

												<tfoot>
													<tr>
														<th rowspan="1" colspan="1"><input type="checkbox" /></th>
														<th rowspan="1" colspan="1">项目名称</th>
														<th rowspan="1" colspan="1">包含的产品服务</th>
														<th rowspan="1" colspan="1">商业计划书</th>
														<th class="hidden-xs" rowspan="1" colspan="1">项目负责人</th>
														<th class="hidden-xs" rowspan="1" colspan="1">系统自动<br>评估分数
														</th>
														<th rowspan="1" colspan="1">目标金额<br>(单位:万元)
														</th>
														<th class="hidden-xs" rowspan="1" colspan="1">取消收藏</th>
													</tr>
												</tfoot>
												<tbody role="alert" aria-live="polite" aria-relevant="all">

													<tr class="gradeA odd">
														<td class=" sorting_1"><input type="checkbox"></td>
														<td><a href="#">aaaa</a></td>
														<td class="hidden-xs "><a href="#">iiii</a></td>
														<td class="center "><a href="#">点击查看</a></td>
														<td class="center hidden-xs "><a href="#">ooo</a>
														<td class="center hidden-xs ">000</td>
														<%-- <c:forEach var="rl" items="${relationList }" varStatus="">
											<c:if test="${empty rl.userUuid}">
												<td class="center hidden-xs ">否</td>
											</c:if>
											<c:if test="${not empty rl.userUuid}">
												<td class="center hidden-xs ">是</td>
											</c:if>
										</c:forEach> --%>
														<td class="center hidden-xs "></td>
														<td class="center hidden-xs "><a title="是否取消关注该项目"
															class="btn btn-xs btn-info"
															href="/ventureassess/adminDeleteProject?projectUuid=&pageNum="
															onclick="deleteUser()">取消收藏</a></td>
													</tr>
												</tbody>
											</table>
											<div class="row">
												<div class="col-sm-12">
													<div class="pull-left">
														<div class="dataTables_info" id="datatable1_info">显示
															1 to 10 总共 57 条</div>
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
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProduct?pageNum=${pager.pageNum+1 }">下页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
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
										<!-- 发布的需求 -->

										<!-- 创建的项目 -->
										<div class="tab-pane fade" id="create_project">
											<div id="filter-controls" class="btn-group">
												<form class="form-inline">
													<div class="form-group">
														<label for="projectName">项目名称：</label> <input
															id="projectName" type="text" class="form-control"
															placeholder="开始时间">

													</div>
													<button style="margin-top: 5%" class="btn btn-primary">搜索</button>
												</form>
												<hr>
											</div>
											<table id="datatable1" cellpadding="0" cellspacing="0"
												border="0"
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
															style="width: 258.333px;">项目名称</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">包含的产品服务</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">商业计划书</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 128.333px;">项目负责人</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 104.333px;">系统自动<br>评估分数
														</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 108.333px;">目标金额<br>(单位:万元)
														</th>

														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 168.333px;">取消收藏</th>
													</tr>
												</thead>

												<tfoot>

													<tr>
														<th rowspan="1" colspan="1"><input type="checkbox" /></th>
														<th rowspan="1" colspan="1">项目名称</th>
														<th rowspan="1" colspan="1">包含的产品服务</th>
														<th rowspan="1" colspan="1">商业计划书</th>
														<th class="hidden-xs" rowspan="1" colspan="1">项目负责人</th>
														<th class="hidden-xs" rowspan="1" colspan="1">系统自动<br>评估分数
														</th>
														<th rowspan="1" colspan="1">目标金额<br>(单位:万元)
														</th>
														<th class="hidden-xs" rowspan="1" colspan="1">取消收藏</th>
													</tr>

												</tfoot>
												<tbody role="alert" aria-live="polite" aria-relevant="all">
													<c:forEach var="lcp" items="${listCreatePro }" varStatus="">
														<tr class="gradeA odd">
															<td class=" sorting_1"><input type="checkbox"></td>
															<td><a href="#">${lcp.pjName }</a></td>
															<td class="hidden-xs "><a href="#">iiii</a></td>
															<td class="center "><a href="#">点击查看</a></td>
															<td class="center hidden-xs "><a href="#">${user.userName }</a>
															<td class="center hidden-xs ">${lcp.pjEvalue }</td>

															<td class="center hidden-xs ">${lcp.pjTargetfinance }</td>
															<td class="center hidden-xs "><a title="是否取消关注该项目"
																class="btn btn-xs btn-info"
																href="/ventureassess/adminDeleteProject?projectUuid=&pageNum="
																onclick="deleteUser()">取消收藏</a></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
											<div class="row">
												<div class="col-sm-12">
													<div class="pull-left">
														<div class="dataTables_info" id="datatable1_info">显示
															1 to 10 总共 57 条</div>
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
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProduct?pageNum=${pager.pageNum+1 }">下页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
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
										<!-- 创建的项目 -->

										<!-- 关注的需求 -->
										<div class="tab-pane fade" id="follow_requirement">
											<div id="filter-controls" class="btn-group">
												<form class="form-inline">
													<div class="form-group">
														<label for="projectName">项目名称：</label> <input
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
											<table id="datatable1" cellpadding="0" cellspacing="0"
												border="0"
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
															style="width: 258.333px;">项目名称</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">包含的产品服务</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 161.333px;">商业计划书</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 128.333px;">项目负责人</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 104.333px;">系统自动<br>评估分数
														</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 108.333px;">目标金额<br>(单位:万元)
														</th>

														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 168.333px;">取消收藏</th>
													</tr>
												</thead>

												<tfoot>
													<tr>
														<th rowspan="1" colspan="1"><input type="checkbox" /></th>
														<th rowspan="1" colspan="1">项目名称</th>
														<th rowspan="1" colspan="1">包含的产品服务</th>
														<th rowspan="1" colspan="1">商业计划书</th>
														<th class="hidden-xs" rowspan="1" colspan="1">项目负责人</th>
														<th class="hidden-xs" rowspan="1" colspan="1">系统自动<br>评估分数
														</th>
														<th rowspan="1" colspan="1">目标金额<br>(单位:万元)
														</th>
														<th class="hidden-xs" rowspan="1" colspan="1">取消收藏</th>
													</tr>
												</tfoot>
												<tbody role="alert" aria-live="polite" aria-relevant="all">

													<tr class="gradeA odd">
														<td class=" sorting_1"><input type="checkbox"></td>
														<td><a href="#">aaaa</a></td>
														<td class="hidden-xs "><a href="#">iiii</a></td>
														<td class="center "><a href="#">点击查看</a></td>
														<td class="center hidden-xs "><a href="#">ooo</a>
														<td class="center hidden-xs ">000</td>
														<%-- <c:forEach var="rl" items="${relationList }" varStatus="">
											<c:if test="${empty rl.userUuid}">
												<td class="center hidden-xs ">否</td>
											</c:if>
											<c:if test="${not empty rl.userUuid}">
												<td class="center hidden-xs ">是</td>
											</c:if>
										</c:forEach> --%>
														<td class="center hidden-xs "></td>
														<td class="center hidden-xs "><a title="是否取消关注该项目"
															class="btn btn-xs btn-info"
															href="/ventureassess/adminDeleteProject?projectUuid=&pageNum="
															onclick="deleteUser()">取消收藏</a></td>
													</tr>
												</tbody>
											</table>

											<div class="row">
												<div class="col-sm-12">
													<div class="pull-left">
														<div class="dataTables_info" id="datatable1_info">显示
															1 to 10 总共 57 条</div>
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
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProduct?pageNum=${pager.pageNum+1 }">下页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
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
										<!-- 关注的需求 -->

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
	<script type="text/javascript"
		src="<%=basePath%>/static/adStyle/js/laydate.dev.js"></script>
	<script type="text/javascript">
		laydate({
			elem : '#J-xl'
		});
		document.getElementById('J-xl-2-btn').onclick = function() {
			laydate({
				elem : '#J-xl-2'
			});
		}
		laydate({
			elem : '#J-xl-3'
		});
		laydate({
			elem : document.getElementById('J-xl-4')
		});
	</script>
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
		function selectUserRole() {
			var objS = $("#UserUuid").val();
			//alert(objS);
			if (objS == "创业者") {

				$("#index1").show();
				$("#index2").show();
				$("#index5").show();
				$("#follow_requirement").show(); //关注的需求 
				$("#create_project").show(); //创建的项目     
				$("#index3").hide();
				$("#index4").hide();
				$("#release_requirement").hide(); //发布的需求
				$("#follow_project").hide(); //关注的项目
			} else if (objS == "基金经理") {
				alert("基金经理");
				$("#index1").hide();
				$("#index2").hide();
				$("#index5").show();
				$("#follow_requirement").hide(); //关注的需求 
				$("#create_project").hide(); //创建的项目     
				$("#index3").show();
				$("#index4").show();
				$("#release_requirement").show(); //发布的需求
				$("#follow_project").show(); //关注的项目
			}

		}
		window.onload = selectUserRole(); //仅需要加这一句
		//验证用户旧密码的正确性
		function checkNamePwd() {
			var a_pwd = $("#index_name3").val();
			var userUuid = $("#UserUuid1").val();
			var result = false;
			$.ajax({
				async : false,
				type : 'post',
				url : 'checkUserPWD/?a_pwd=' + a_pwd + "&userUuid=" + userUuid,
				success : function(msg) {
					if (msg == 'success') {
						result = true;
					} else {
						$("#prompt_ps").css("display", "inline");
						$("#prompt_ps").css("color", "red");
						$("#prompt_ps").html("旧密码错误！");
						$("#prompt_ps").css("font-size", "16px");
						result = false;
					}
				}
			});

			return result;
		}
		//验证两次密码是否相同
		function checkPwdSame() {
			var result = false;
			var pwd1 = $('#index_pwd3').val();

			var pwd2 = $('#index_pwd4').val();

			if (pwd1 == pwd2) {
				result = true;

			} else {
				$("#prompt_ps").css("display", "inline");
				$("#prompt_ps").css("color", "red");
				$("#prompt_ps").html("两次密码不一致！");
				$("#prompt_ps").css("font-size", "16px");
				result = false;
			}
			return result;
		}
		function check() {
			if (checkNamePwd() && checkPwdSame()) {
				return true;
			} else {
				return false;
			}
			alert("密码修改成功");
		}
		function deleteUser() {
			if (confirm("确定删除吗？")) {
				alert("确定删除");
			} else {
				alert("取消删除");
			}
		}
		//编辑学习经历
		function editLearnExperience(id) {
			var leStart = $('#start' + id).html();
			$('#index_Id3').val(id);
			$('#leStart2').val(leStart);
			var leSchool = $('#school' + id).html();
			$('#leSchool2').val(leSchool);
			var leEdu = $('#edu' + id).html();
			$('#leEdu2').val(leEdu);
			var leEnd = $('#end' + id).html();
			$('#leEnd2').val(leEnd);
		}
		//编辑工作经历
		function editWorkExperience(id){		
			var weStart = $('#weStart'+id).html();  
			$('#weStart2').val(weStart);
			$('#index').val(id); 
			var weCompany = $('#weCompany'+id).html();  
			$('#weCompany2').val(weCompany);
			var weRank = $('#weRank'+id).html();  
			$('#weRank2').val(weRank);
			var weEnd = $('#weEnd'+id).html();  
			$('#weEnd2').val(weEnd);
		}
	</script>
</body>
</html>