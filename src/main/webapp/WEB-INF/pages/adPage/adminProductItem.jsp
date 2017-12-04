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
									<i class="fa fa-user"></i><span class="hidden-inline-mobile">Hello,
										Jennifer!</span>
								</h4>
							</div>
							<div class="box-body">
								<div class="tabbable header-tabs user-profile">
									<ul class="nav nav-tabs">
										<li><a href="#pro_help" data-toggle="tab"><i
												class="fa fa-question"></i> <span
												class="hidden-inline-mobile"> Help</span></a></li>
										<li class=""><a href="#pro_edit" data-toggle="tab"><i
												class="fa fa-edit"></i> <span class="hidden-inline-mobile">
													Edit Account</span></a></li>
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
															<h2>Jennifer Doe</h2>
															<p>
																<i class="fa fa-circle text-green"></i> 创业者
															</p>
															<p>业者是指某个人发现某种信息、资源、机会或掌握某种技术，利用或借用相应的平台或载体，将其发现的信息、资源、机会或掌握的技术，以一定的方式，转化、创造成更多的财富、价值，并实现某种追求或目标的过程的人。</p>
															<p>
																<a href="#">www.jenniferblogs.com</a>
															</p>
															<ul class="list-inline">
																<li><i class="fa fa-facebook fa-2x"></i></li>
																<li><i class="fa fa-twitter fa-2x"></i></li>
																<li><i class="fa fa-dribbble fa-2x"></i></li>
																<li><i class="fa fa-bitbucket fa-2x"></i></li>
															</ul>
														</div>
														<a href="#" class="list-group-item"><i
															class="fa fa-user fa-fw"></i> 个人信息</a> <a href="#"
															class="list-group-item"> <span
															class="badge badge-red">9</span> <i
															class="fa fa-calendar fa-fw"></i> 个人事件
														</a> <a href="#" class="list-group-item"><i
															class="fa fa-comment-o fa-fw"></i> 系统消息</a> <a href="#"
															class="list-group-item"><i
															class="fa fa-picture-o fa-fw"></i> 个人照片</a> <a href="#"
															class="list-group-item"><i class="fa fa-cog fa-fw"></i>
															系统设置</a>
													</div>
												</div>
												<!-- /PROFILE PIC -->
												<!-- PROFILE DETAILS -->
												<div class="col-md-9">
													<!-- ROW 1 -->
													<div class="row">
														<br>
														<div class="col-md-12">
															<table class="table table-hover">
																<tbody>
																	<tr>
																		<td><i class="fa fa-font"></i> 用户名</td>
																		<td id="card-name">John Doe</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-font"></i> 真实姓名</td>
																		<td id="card-name">John Doe</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-envelope"></i>邮箱</td>
																		<td>sampleemail@gmail.com</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>性别</td>
																		<td>男</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-rub"></i>年龄</td>
																		<td>男</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 所在地区</td>
																		<td>795 Folsom Ave, Suite 600 San Francisco, CA
																			94107 P: (123) 456-7890</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 工作资历</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 学历</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 学科专业</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 所属公司</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 工作年限</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-home"></i> 感兴趣领域</td>
																		<td>aaaaaaa</td>
																	</tr>
																	<tr>
																		<td><i class="fa fa-phone"></i> 电话</td>
																		<td>+001 8753-3648-002</td>
																	</tr>

																</tbody>
															</table>
														</div>
													</div>
													<!-- /ROW 1 -->
													<div class="divide-40"></div>
													<!-- ROW 2 -->
													<div class="row">
														<div class="col-md-12">
															<div class="box border blue">
																<div class="box-title">
																	<h4>
																		<i class="fa fa-columns"></i> <span
																			class="hidden-inline-mobile">个人概括</span>
																	</h4>
																</div>
																<div class="box-body">
																	<div class="tabbable">
																		<ul class="nav nav-tabs">
																			<li class="active"><a href="#sales"
																				data-toggle="tab"><i class="fa fa-signal"></i> <span
																					class="hidden-inline-mobile">自己提交的产品服务</span></a></li>
																			<li><a href="#feed" data-toggle="tab"><i
																					class="fa fa-rss"></i> <span
																					class="hidden-inline-mobile">自己提交的项目</span></a></li>
																		</ul>
																		<div class="tab-content">
																			<div class="tab-pane active" id="sales">
																				<table
																					class="table table-striped table-bordered table-hover">
																					<thead>
																						<tr>
																							<th><i class="fa fa-user"></i> Client</th>
																							<th class="hidden-xs"><i
																								class="fa fa-quote-left"></i> Sales Item</th>
																							<th><i class="fa fa-dollar"></i> Amount</th>
																							<th><i class="fa fa-bars"></i> Status</th>
																						</tr>
																					</thead>
																					<tbody>
																						<tr>
																							<td><a href="#">Fortune 500</a></td>
																							<td class="hidden-xs">Gold Level Virtual
																								Server</td>
																							<td>$ 2310.23</td>
																							<td><span
																								class="label label-success label-sm">Paid</span></td>
																						</tr>
																						<tr>
																							<td><a href="#">Cisco Inc.</a></td>
																							<td class="hidden-xs">Platinum Level Virtual
																								Server</td>
																							<td>$ 5502.67</td>
																							<td><span
																								class="label label-warning label-sm">Pending</span></td>
																						</tr>
																						<tr>
																							<td><a href="#">VMWare Ltd.</a></td>
																							<td class="hidden-xs">Hardware Switch</td>
																							<td>$ 3472.54</td>
																							<td><span
																								class="label label-success label-sm">Paid</span></td>
																						</tr>
																						<tr>
																							<td><a href="#">Wall-Mart Stores</a></td>
																							<td class="hidden-xs">Branding &amp;
																								Marketing</td>
																							<td>$ 6653.25</td>
																							<td><span
																								class="label label-success label-sm">Paid</span></td>
																						</tr>
																						<tr>
																							<td><a href="#">Exxon Mobil</a></td>
																							<td class="hidden-xs">UX and UI Services</td>
																							<td>$ 45645.45</td>
																							<td><span
																								class="label label-danger label-sm">Overdue</span></td>
																						</tr>
																						<tr>
																							<td><a href="#">General Electric</a></td>
																							<td class="hidden-xs">Web Designing</td>
																							<td>$ 3432.11</td>
																							<td><span
																								class="label label-warning label-sm">Pending</span></td>
																						</tr>
																					</tbody>
																				</table>
																			</div>
																			<div class="tab-pane" id="feed">
																				<div class="slimScrollDiv"
																					style="position: relative; overflow: hidden; width: auto; height: 250px;">
																					<div class="scroller" data-height="250px"
																						data-always-visible="1" data-rail-visible="1"
																						style="overflow: hidden; width: auto; height: 250px;">
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-check btn btn-info"></i>
																								<a class="user" href="#"> John Doe </a> accepted
																								your connection request. <br> <a href="#">View
																									profile</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 5 hours ago
																							</div>
																						</div>
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-picture-o btn btn-danger"></i>
																								<a class="user" href="#"> Jack Doe </a> uploaded
																								a new photo. <br> <a href="#">Take a
																									look</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 5 hours ago
																							</div>
																						</div>
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-edit btn btn-pink"></i>
																								<a class="user" href="#"> Jess Doe </a> edited
																								their skills. <br> <a href="#">Endorse
																									them</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 5 hours ago
																							</div>
																						</div>
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-bitcoin btn btn-yellow"></i>
																								<a class="user" href="#"> Divine Doe </a> made a
																								bitcoin payment. <br> <a href="#">Check
																									your financials</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 6 hours ago
																							</div>
																						</div>
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-dropbox btn btn-primary"></i>
																								<a class="user" href="#"> Lisbon Doe </a> saved
																								a new document to Dropbox. <br> <a href="#">Download</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 1 day ago
																							</div>
																						</div>
																						<div class="feed-activity clearfix">
																							<div>
																								<i
																									class="pull-left roundicon fa fa-pinterest btn btn-inverse"></i>
																								<a class="user" href="#"> Bob Doe </a> pinned a
																								new photo to Pinterest. <br> <a href="#">Take
																									a look</a>

																							</div>
																							<div class="time">
																								<i class="fa fa-clock-o"></i> 2 days ago
																							</div>
																						</div>
																					</div>
																					<div class="slimScrollBar"
																						style="background: rgb(161, 178, 189); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div>
																					<div class="slimScrollRail"
																						style="width: 7px; height: 100%; position: absolute; top: 0px; display: block; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.1; z-index: 90; right: 1px;"></div>
																				</div>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
														
													
													</div>
													<!-- /ROW 2 -->
												</div>
												<!-- /PROFILE DETAILS -->
											</div>
										</div>
										<!-- /OVERVIEW -->

										<!-- EDIT ACCOUNT -->
										<div class="tab-pane fade" id="pro_edit">
											<form class="form-horizontal" action="#">
												<div class="row">
													<div class="col-md-6">
														<div class="box border green">
															<div class="box-title">
																<h4>
																	<i class="fa fa-bars"></i>个人信息
																</h4>
															</div>
															<div class="box-body big">
																<div class="row">
																	<div class="col-md-12">
																		<h4>基本信息</h4>
																		<div class="form-group">
																			<label class="col-md-4 control-label">用户名</label>
																			<div class="col-md-8">
																				<input type="text" name="regular"
																					class="form-control" value="Jennifer">
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">真实姓名</label>
																			<div class="col-md-8">
																				<input type="text" name="regular"
																					class="form-control" value="Jennifer">
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">邮箱</label>
																			<div class="col-md-8">
																				<input type="email" name="regular"
																					class="form-control" value="Jennifer">
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">密码</label>
																			<div class="col-md-8">
																				<input type="text" name="regular"
																					class="form-control" value="Jennifer">
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">性别</label>
																			<div class="col-md-8">
																				<label class="radio">
																					<!-- <div class="radio"> -->
																						<span class="checked"><input type="radio"
																							class="uniform" name="optionsRadios1"
																							value="option1"></span>
																					<!-- </div> --> Male
																				</label> <label class="radio">
																					<!-- <div class="radio"> -->
																						<span class=""><input type="radio"
																							class="uniform" name="optionsRadios1"
																							value="option2" checked=""></span>
																					<!-- </div> --> Female
																				</label>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">年龄</label>
																			<div class="col-md-8">
																				<input type="text" name="regular"
																					class="form-control" value="Jennifer">
																			</div>
																		</div>
																		<!-- <div class="form-group">
																			<label class="col-md-4 control-label">Birthday</label>
																			<div class="col-md-8">
																				<input class="form-control datepicker hasDatepicker"
																					type="text" name="regular" size="10"
																					id="dp1492087436739">
																			</div>
																		</div> -->
																		
																		<h4>个人详情</h4>
																		<div class="form-group">
																			<label class="col-md-4 control-label">Phone</label>
																			<div class="col-md-8">
																				<input type="number" name="regular"
																					class="form-control" value="1002927323">
																			</div>
																		</div>

																		<div class="form-group">
																			<label class="col-md-4 control-label">所在地区</label>
																			<div class="col-md-8">
																				<textarea name="regular" class="form-control"></textarea>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">工作资历</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon">http://</span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">学历</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon">http://</span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">学科专业</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon">http://</span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">所属公司</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon">http://</span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">工作年限</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon"></span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">工作资历</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon"></span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		<div class="form-group">
																			<label class="col-md-4 control-label">感兴趣领域</label>
																			<div class="col-md-8">
																				<div class="input-group">
																					<span class="input-group-addon"></span> <input
																						type="text" class="form-control"
																						placeholder="Website">
																				</div>
																			</div>
																		</div>
																		
																	</div>
																</div>
															</div>
														</div>
													</div>
													<div class="col-md-6 form-vertical">
														<div class="box border inverse">
															<div class="box-title">
																<h4>
																	<i class="fa fa-bars"></i>Profile Settings
																</h4>
															</div>
															<div class="box-body big">
																<h4>Security Settings</h4>
																<div class="form-group">
																	<label class="col-md-4 control-label">Secure
																		Browsing</label>
																	<div class="col-md-8">
																		<label class="checkbox-inline">
																			<div class="checker">
																				<span class="checked"><input type="checkbox"
																					class="uniform" value="" checked=""></span>
																			</div> Enable
																		</label> <label class="checkbox-inline">
																			<div class="checker">
																				<span><input type="checkbox" class="uniform"
																					value=""></span>
																			</div> Disable
																		</label>
																	</div>
																</div>
																<div class="form-group">
																	<label class="col-md-4 control-label">Login
																		Notifications</label>
																	<div class="col-md-8">
																		<label class="checkbox-inline">
																			<div class="checker">
																				<span><input type="checkbox" class="uniform"
																					value=""></span>
																			</div> Enable
																		</label> <label class="checkbox-inline">
																			<div class="checker">
																				<span class="checked"><input type="checkbox"
																					class="uniform" value="" checked=""></span>
																			</div> Disable
																		</label>
																	</div>
																</div>
																<div class="form-group">
																	<label class="col-md-4 control-label">Recognized
																		Devices</label>
																	<div class="col-md-8">
																		<label class="checkbox">
																			<div class="checker">
																				<span class="checked"><input type="checkbox"
																					class="uniform" value="" checked=""></span>
																			</div> Apple iPhone
																		</label> <label class="checkbox">
																			<div class="checker">
																				<span class="checked"><input type="checkbox"
																					class="uniform" value="" checked=""></span>
																			</div> Samsung Galaxy Note 3
																		</label> <label class="checkbox">
																			<div class="checker">
																				<span><input type="checkbox" class="uniform"
																					value=""></span>
																			</div> Google Nexus 5
																		</label>
																	</div>
																</div>
																<div class="form-group">
																	<label class="col-md-4 control-label">Active
																		sessions</label>
																	<div class="col-md-8">
																		<div class="divide-10"></div>
																		<p>
																			Logged in from <a href="#"><strong>New
																					York, US</strong></a> and <a href="#">6 other</a> locations
																		</p>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
											</form>
											<div class="form-actions clearfix">
												<input type="submit" value="Update Account"
													class="btn btn-primary pull-right">
											</div>
										</div>
										<!-- /EDIT ACCOUNT -->

										<!-- HELP -->
										<div class="tab-pane fade" id="pro_help">
											<!-- FAQ -->
											<div class="row">
												<!-- NAV -->
												<div id="list-toggle" class="col-md-3">
													<div class="list-group">
														<a href="#tab1" data-toggle="tab"
															class="list-group-item active"> <i
															class="fa fa-suitcase"></i> General Questions
														</a> <a href="#tab2" data-toggle="tab" class="list-group-item"><i
															class="fa fa-tags"></i> Payment related</a> <a href="#tab3"
															data-toggle="tab" class="list-group-item"><i
															class="fa fa-user"></i> Terms of Service</a> <a href="#tab4"
															data-toggle="tab" class="list-group-item"><i
															class="fa fa-sitemap"></i> Account Queries</a> <a
															href="#tab5" data-toggle="tab" class="list-group-item"><i
															class="fa fa-arrows"></i> Other Questions</a>
													</div>
												</div>
												<!-- /NAV -->
												<!-- CONTENT -->
												<div class="col-md-9">
													<div class="tab-content">
														<div class="tab-pane active" id="tab1">
															<div class="panel-group" id="accordion">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_1">1.
																				If I post to a public community, does that mean all
																				my friends and followers can see it? </a>
																		</h3>
																	</div>
																	<div id="collapse1_1"
																		class="panel-collapse collapse in">
																		<div class="panel-body">No, the posts you share
																			to a public community will not show up in your
																			friends and followers’ Home streams, unless your
																			friends and followers are also members of the same
																			community. Your public community posts will be
																			visible to people who navigate to your profile page
																			unless you have set your settings for them not to
																			appear. Visitors will see text indicating that it was
																			shared to a community. Remember that your private
																			community posts will only be visible to people in
																			those communities, regardless of whether or not you
																			show community posts on your profile.</div>
																	</div>
																</div>
																<div class="panel panel-info">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_2">2.
																				How can I control whether my public community posts
																				appear on my profile page? </a>
																		</h3>
																	</div>
																	<div id="collapse1_2" class="panel-collapse collapse">
																		<div class="panel-body">While in communities:
																			Place your cursor in the top left corner for the main
																			menu. Select Settings. Scroll to 'Profile'. Check or
																			uncheck the box next to Show your Google+ communities
																			posts on your Google+ profile</div>
																	</div>
																</div>
																<div class="panel panel-success">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_3">3.
																				Can I change my community from public to private, or
																				vice versa? </a>
																		</h3>
																	</div>
																	<div id="collapse1_3" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new. A
																			communit's privacy settings currently can't be
																			changed once it's been created. Please pick your
																			desired setting from the start.</div>
																	</div>
																</div>
																<div class="panel panel-danger">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_4">4.
																				Why aren't people seeing my invites? </a>
																		</h3>
																	</div>
																	<div id="collapse1_4" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new.
																			Notifications default on in communities where the
																			membership is moderated - that is, private
																			communities, or public communities where you need to
																			ask to join. It's also on by default for any
																			community you create.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_5">5.
																				If I moderate a post out of my community, is it
																				deleted? </a>
																		</h3>
																	</div>
																	<div id="collapse1_5" class="panel-collapse collapse">
																		<div class="panel-body">Notifications default on
																			in communities where the membership is moderated -
																			that is, private communities, or public communities
																			where you need to ask to join. It's also on by
																			default for any community you create.A communit's
																			privacy settings currently can't be changed once it's
																			been created. Please pick your desired setting from
																			the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_6">6.
																				Are community names unique? If someone else has a
																				"Software" community, does that prevent me from
																				owning one? </a>
																		</h3>
																	</div>
																	<div id="collapse1_6" class="panel-collapse collapse">
																		<div class="panel-body">They may not see your
																			invites if they don’t have you in their circles, or
																			if they’ve limited the “Who can send you
																			notifications?” setting. Learn more about who can
																			send you notifications. They may not see your invites
																			if they don’t have you in their circles, or if
																			they’ve limited the “Who can send you notifications?”
																			setting. Learn more about who can send you
																			notifications.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse1_7">7.
																				How can I control how many community invitations I
																				receive? </a>
																		</h3>
																	</div>
																	<div id="collapse1_7" class="panel-collapse collapse">
																		<div class="panel-body">A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start. A communit's privacy settings currently can't
																			be changed once it's been created. Please pick your
																			desired setting from the start. A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start.</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="tab-pane" id="tab2">
															<div class="panel-group" id="accordion">
																<div class="panel panel-danger">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_1">1.
																				If I post to a public community, does that mean all
																				my friends and followers can see it? </a>
																		</h3>
																	</div>
																	<div id="collapse2_1" class="panel-collapse collapse">
																		<div class="panel-body">No, the posts you share
																			to a public community will not show up in your
																			friends and followers’ Home streams, unless your
																			friends and followers are also members of the same
																			community. Your public community posts will be
																			visible to people who navigate to your profile page
																			unless you have set your settings for them not to
																			appear. Visitors will see text indicating that it was
																			shared to a community. Remember that your private
																			community posts will only be visible to people in
																			those communities, regardless of whether or not you
																			show community posts on your profile.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_2">2.
																				How can I control whether my public community posts
																				appear on my profile page? </a>
																		</h3>
																	</div>
																	<div id="collapse2_2" class="panel-collapse collapse">
																		<div class="panel-body">While in communities:
																			Place your cursor in the top left corner for the main
																			menu. Select Settings. Scroll to 'Profile'. Check or
																			uncheck the box next to Show your Google+ communities
																			posts on your Google+ profile</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_3">3.
																				Can I change my community from public to private, or
																				vice versa? </a>
																		</h3>
																	</div>
																	<div id="collapse2_3" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new. A
																			communit's privacy settings currently can't be
																			changed once it's been created. Please pick your
																			desired setting from the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_4">4.
																				Why aren't people seeing my invites? </a>
																		</h3>
																	</div>
																	<div id="collapse2_4"
																		class="panel-collapse collapse in">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new.
																			Notifications default on in communities where the
																			membership is moderated - that is, private
																			communities, or public communities where you need to
																			ask to join. It's also on by default for any
																			community you create.</div>
																	</div>
																</div>
																<div class="panel panel-success">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_5">5.
																				If I moderate a post out of my community, is it
																				deleted? </a>
																		</h3>
																	</div>
																	<div id="collapse2_5" class="panel-collapse collapse">
																		<div class="panel-body">Notifications default on
																			in communities where the membership is moderated -
																			that is, private communities, or public communities
																			where you need to ask to join. It's also on by
																			default for any community you create.A communit's
																			privacy settings currently can't be changed once it's
																			been created. Please pick your desired setting from
																			the start.</div>
																	</div>
																</div>
																<div class="panel panel-warning">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_6">6.
																				Are community names unique? If someone else has a
																				"Software" community, does that prevent me from
																				owning one? </a>
																		</h3>
																	</div>
																	<div id="collapse2_6" class="panel-collapse collapse">
																		<div class="panel-body">They may not see your
																			invites if they don’t have you in their circles, or
																			if they’ve limited the “Who can send you
																			notifications?” setting. Learn more about who can
																			send you notifications. They may not see your invites
																			if they don’t have you in their circles, or if
																			they’ve limited the “Who can send you notifications?”
																			setting. Learn more about who can send you
																			notifications.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse2_7">7.
																				How can I control how many community invitations I
																				receive? </a>
																		</h3>
																	</div>
																	<div id="collapse2_7" class="panel-collapse collapse">
																		<div class="panel-body">A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start. A communit's privacy settings currently can't
																			be changed once it's been created. Please pick your
																			desired setting from the start. A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start.</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="tab-pane" id="tab3">
															<div class="panel-group" id="accordion">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_1">1.
																				If I post to a public community, does that mean all
																				my friends and followers can see it? </a>
																		</h3>
																	</div>
																	<div id="collapse3_1" class="panel-collapse collapse">
																		<div class="panel-body">No, the posts you share
																			to a public community will not show up in your
																			friends and followers’ Home streams, unless your
																			friends and followers are also members of the same
																			community. Your public community posts will be
																			visible to people who navigate to your profile page
																			unless you have set your settings for them not to
																			appear. Visitors will see text indicating that it was
																			shared to a community. Remember that your private
																			community posts will only be visible to people in
																			those communities, regardless of whether or not you
																			show community posts on your profile.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_2">2.
																				How can I control whether my public community posts
																				appear on my profile page? </a>
																		</h3>
																	</div>
																	<div id="collapse3_2" class="panel-collapse collapse">
																		<div class="panel-body">While in communities:
																			Place your cursor in the top left corner for the main
																			menu. Select Settings. Scroll to 'Profile'. Check or
																			uncheck the box next to Show your Google+ communities
																			posts on your Google+ profile</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_3">3.
																				Can I change my community from public to private, or
																				vice versa? </a>
																		</h3>
																	</div>
																	<div id="collapse3_3" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new. A
																			communit's privacy settings currently can't be
																			changed once it's been created. Please pick your
																			desired setting from the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_4">4.
																				Why aren't people seeing my invites? </a>
																		</h3>
																	</div>
																	<div id="collapse3_4" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new.
																			Notifications default on in communities where the
																			membership is moderated - that is, private
																			communities, or public communities where you need to
																			ask to join. It's also on by default for any
																			community you create.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_5">5.
																				If I moderate a post out of my community, is it
																				deleted? </a>
																		</h3>
																	</div>
																	<div id="collapse3_5"
																		class="panel-collapse collapse in">
																		<div class="panel-body">Notifications default on
																			in communities where the membership is moderated -
																			that is, private communities, or public communities
																			where you need to ask to join. It's also on by
																			default for any community you create.A communit's
																			privacy settings currently can't be changed once it's
																			been created. Please pick your desired setting from
																			the start.</div>
																	</div>
																</div>
																<div class="panel panel-info">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_6">6.
																				Are community names unique? If someone else has a
																				"Software" community, does that prevent me from
																				owning one? </a>
																		</h3>
																	</div>
																	<div id="collapse3_6" class="panel-collapse collapse">
																		<div class="panel-body">They may not see your
																			invites if they don’t have you in their circles, or
																			if they’ve limited the “Who can send you
																			notifications?” setting. Learn more about who can
																			send you notifications. They may not see your invites
																			if they don’t have you in their circles, or if
																			they’ve limited the “Who can send you notifications?”
																			setting. Learn more about who can send you
																			notifications.</div>
																	</div>
																</div>
																<div class="panel panel-success">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse3_7">7.
																				How can I control how many community invitations I
																				receive? </a>
																		</h3>
																	</div>
																	<div id="collapse3_7" class="panel-collapse collapse">
																		<div class="panel-body">A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start. A communit's privacy settings currently can't
																			be changed once it's been created. Please pick your
																			desired setting from the start. A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start.</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="tab-pane" id="tab4">
															<div class="panel-group" id="accordion">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_1">1.
																				If I post to a public community, does that mean all
																				my friends and followers can see it? </a>
																		</h3>
																	</div>
																	<div id="collapse4_1"
																		class="panel-collapse collapse in">
																		<div class="panel-body">No, the posts you share
																			to a public community will not show up in your
																			friends and followers’ Home streams, unless your
																			friends and followers are also members of the same
																			community. Your public community posts will be
																			visible to people who navigate to your profile page
																			unless you have set your settings for them not to
																			appear. Visitors will see text indicating that it was
																			shared to a community. Remember that your private
																			community posts will only be visible to people in
																			those communities, regardless of whether or not you
																			show community posts on your profile.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_2">2.
																				How can I control whether my public community posts
																				appear on my profile page? </a>
																		</h3>
																	</div>
																	<div id="collapse4_2" class="panel-collapse collapse">
																		<div class="panel-body">While in communities:
																			Place your cursor in the top left corner for the main
																			menu. Select Settings. Scroll to 'Profile'. Check or
																			uncheck the box next to Show your Google+ communities
																			posts on your Google+ profile</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_3">3.
																				Can I change my community from public to private, or
																				vice versa? </a>
																		</h3>
																	</div>
																	<div id="collapse4_3" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new. A
																			communit's privacy settings currently can't be
																			changed once it's been created. Please pick your
																			desired setting from the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_4">4.
																				Why aren't people seeing my invites? </a>
																		</h3>
																	</div>
																	<div id="collapse4_4" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new.
																			Notifications default on in communities where the
																			membership is moderated - that is, private
																			communities, or public communities where you need to
																			ask to join. It's also on by default for any
																			community you create.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_5">5.
																				If I moderate a post out of my community, is it
																				deleted? </a>
																		</h3>
																	</div>
																	<div id="collapse4_5" class="panel-collapse collapse">
																		<div class="panel-body">Notifications default on
																			in communities where the membership is moderated -
																			that is, private communities, or public communities
																			where you need to ask to join. It's also on by
																			default for any community you create.A communit's
																			privacy settings currently can't be changed once it's
																			been created. Please pick your desired setting from
																			the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_6">6.
																				Are community names unique? If someone else has a
																				"Software" community, does that prevent me from
																				owning one? </a>
																		</h3>
																	</div>
																	<div id="collapse4_6" class="panel-collapse collapse">
																		<div class="panel-body">They may not see your
																			invites if they don’t have you in their circles, or
																			if they’ve limited the “Who can send you
																			notifications?” setting. Learn more about who can
																			send you notifications. They may not see your invites
																			if they don’t have you in their circles, or if
																			they’ve limited the “Who can send you notifications?”
																			setting. Learn more about who can send you
																			notifications.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse4_7">7.
																				How can I control how many community invitations I
																				receive? </a>
																		</h3>
																	</div>
																	<div id="collapse4_7" class="panel-collapse collapse">
																		<div class="panel-body">A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start. A communit's privacy settings currently can't
																			be changed once it's been created. Please pick your
																			desired setting from the start. A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start.</div>
																	</div>
																</div>
															</div>
														</div>
														<div class="tab-pane" id="tab5">
															<div class="panel-group" id="accordion">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_1">1.
																				If I post to a public community, does that mean all
																				my friends and followers can see it? </a>
																		</h3>
																	</div>
																	<div id="collapse5_1" class="panel-collapse collapse">
																		<div class="panel-body">No, the posts you share
																			to a public community will not show up in your
																			friends and followers’ Home streams, unless your
																			friends and followers are also members of the same
																			community. Your public community posts will be
																			visible to people who navigate to your profile page
																			unless you have set your settings for them not to
																			appear. Visitors will see text indicating that it was
																			shared to a community. Remember that your private
																			community posts will only be visible to people in
																			those communities, regardless of whether or not you
																			show community posts on your profile.</div>
																	</div>
																</div>
																<div class="panel panel-success">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_2">2.
																				How can I control whether my public community posts
																				appear on my profile page? </a>
																		</h3>
																	</div>
																	<div id="collapse5_2" class="panel-collapse collapse">
																		<div class="panel-body">While in communities:
																			Place your cursor in the top left corner for the main
																			menu. Select Settings. Scroll to 'Profile'. Check or
																			uncheck the box next to Show your Google+ communities
																			posts on your Google+ profile</div>
																	</div>
																</div>
																<div class="panel panel-info">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_3">3.
																				Can I change my community from public to private, or
																				vice versa? </a>
																		</h3>
																	</div>
																	<div id="collapse5_3" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new. A
																			communit's privacy settings currently can't be
																			changed once it's been created. Please pick your
																			desired setting from the start.</div>
																	</div>
																</div>
																<div class="panel panel-warning">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_4">4.
																				Why aren't people seeing my invites? </a>
																		</h3>
																	</div>
																	<div id="collapse5_4" class="panel-collapse collapse">
																		<div class="panel-body">You can turn your
																			community notifications on or off by clicking on the
																			icon on a community’s page. Community members can use
																			notifications to know when new things are shared with
																			their communities. If notifications are On you’ll get
																			a notification by email, on your device, and by the
																			Google toolbar when someone posts something new.
																			Notifications default on in communities where the
																			membership is moderated - that is, private
																			communities, or public communities where you need to
																			ask to join. It's also on by default for any
																			community you create.</div>
																	</div>
																</div>
																<div class="panel panel-danger">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_5">5.
																				If I moderate a post out of my community, is it
																				deleted? </a>
																		</h3>
																	</div>
																	<div id="collapse5_5" class="panel-collapse collapse">
																		<div class="panel-body">Notifications default on
																			in communities where the membership is moderated -
																			that is, private communities, or public communities
																			where you need to ask to join. It's also on by
																			default for any community you create.A communit's
																			privacy settings currently can't be changed once it's
																			been created. Please pick your desired setting from
																			the start.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_6">6.
																				Are community names unique? If someone else has a
																				"Software" community, does that prevent me from
																				owning one? </a>
																		</h3>
																	</div>
																	<div id="collapse5_6" class="panel-collapse collapse">
																		<div class="panel-body">They may not see your
																			invites if they don’t have you in their circles, or
																			if they’ve limited the “Who can send you
																			notifications?” setting. Learn more about who can
																			send you notifications. They may not see your invites
																			if they don’t have you in their circles, or if
																			they’ve limited the “Who can send you notifications?”
																			setting. Learn more about who can send you
																			notifications.</div>
																	</div>
																</div>
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">
																			<a class="accordion-toggle" data-toggle="collapse"
																				data-parent="#accordion" href="#collapse5_7">7.
																				How can I control how many community invitations I
																				receive? </a>
																		</h3>
																	</div>
																	<div id="collapse5_7" class="panel-collapse collapse">
																		<div class="panel-body">A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start. A communit's privacy settings currently can't
																			be changed once it's been created. Please pick your
																			desired setting from the start. A communit's privacy
																			settings currently can't be changed once it's been
																			created. Please pick your desired setting from the
																			start.</div>
																	</div>
																</div>
															</div>
														</div>

													</div>
												</div>
											</div>
											<!-- /FAQ -->
											<div class="divide-40"></div>
										</div>
										<!-- /HELP -->
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