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
<title>科技成果产业化评价系统管理端|查看所有用户</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">

<jsp:include page="/ad_head.jsp" flush="true" />
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
										<li><a href="#">用户管理</a></li>
										<li>查看所有的用户</li>
									</ul>

								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->
						<!-- BOX TABS -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border blue">
									<div class="box-title">
										<h4>
											<i class="fa fa-table"></i>查看所有的用户
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
									<div class="box-body">
										<div id="datatable1_wrapper"
											class="dataTables_wrapper form-inline" role="grid">
											<div class="row">
												<div class="col-sm-12">
													<div class="pull-right">
														<div class="dataTables_filter" id="datatable1_filter">
															<label> <select id="userRole"
																onchange="selectUserRole()" class="form-control">
																	<option value="创业者">创业者</option>
																	<option value="基金经理">基金经理</option>
															</select>
															</label>
														</div>
													</div>
													<div class="pull-left">
														<div id="datatable1_length" class="dataTables_length">
															<label>Show <select size="1"
																name="datatable1_length" aria-controls="datatable1"
																class="form-control input-sm"><option
																		value="10" selected="selected">10</option>
																	<option value="25">25</option>
																	<option value="50">50</option>
																	<option value="100">100</option></select> Rows
															</label>
														</div>
													</div>
													<div class="clearfix"></div>
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
															style="width: 80px;">选择</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 124px;">用户类型</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Browser: activate to sort column ascending"
															style="width: 224px;">用户名</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 185px;">真实姓名</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="Platform(s): activate to sort column ascending"
															style="width: 185px;">性别</th>
														<th class="sorting" role="columnheader" tabindex="0"
															aria-controls="datatable1" rowspan="1" colspan="1"
															aria-label="Engine version: activate to sort column ascending"
															style="width: 160px;">邮箱</th>
														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 194px;">查看个人信息</th>

														<th class="hidden-xs sorting" role="columnheader"
															tabindex="0" aria-controls="datatable1" rowspan="1"
															colspan="1"
															aria-label="CSS grade: activate to sort column ascending"
															style="width: 194px;">操作</th>
													</tr>
												</thead>

												<tfoot>
													<tr>
														<th rowspan="1" colspan="1">操作</th>
														<th rowspan="1" colspan="1">用户类型</th>
														<th rowspan="1" colspan="1">用户名</th>
														<th class="hidden-xs" rowspan="1" colspan="1">真实姓名</th>
														<th rowspan="1" colspan="1">性别</th>
														<th rowspan="1" colspan="1">邮箱</th>
														<th class="hidden-xs" rowspan="1" colspan="1">查看个人信息</th>
														<th class="hidden-xs" rowspan="1" colspan="1">操作</th>
													</tr>
												</tfoot>
												<tbody role="alert" aria-live="polite" aria-relevant="all">
													<c:forEach var="el" items="${listAllUsersByPager }"
														varStatus="">
														<tr class="gradeA odd">
															<td class="  sorting_1"><input type="checkbox" /> <input
																type="hidden" id="" name="${el.userUuid}"
																value="${el.userUuid}" /></td>
															<td class=" ">${el.userFlag}</td>	
															<td class=" ">${el.userName}</td>
															<td class="hidden-xs ">${el.userRealname}</td>
															<td class="center ">${el.userGender}</td>
															<td class="center hidden-xs ">${el.userEmail}</td>
															<td class="center hidden-xs "><a href="/ventureassess/selectUserInfo?userUuid=${el.userUuid}">查看个人信息</a></td>
															<td class="center hidden-xs ">
																<a title="删除用户"
																class="btn btn-xs btn-info" href="/ventureassess/deleteUsers?userUuid=${el.userUuid}"
																onclick="deleteUser()">删除</a>
																<a title="删除用户"
																class="btn btn-xs btn-info" href="/ventureassess/editUsers?userUuid=${el.userUuid}"
																>修改</a>
															</td>
														</tr>                          
                                                    </c:forEach>

												</tbody>
											</table>
											<div class="row">
												<div class="col-sm-12">
													<div class="pull-left">
														<div class="dataTables_info" id="datatable1_info">Showing
															1 to 10 of 57 entries</div>
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
																	href="selectAllProject?pageNum=1">首页</a></li>
																<li ${pager.pageNum==1?'class="disabled"':''}><a
																	href="selectAllProject?pageNum=${pager.pageNum-1 }">上页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProject?pageNum=${pager.pageNum+1 }">下页</a></li>
																<li
																	${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
																	href="selectAllProject?pageNum=${pager.pageCount }">末页</a></li>
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
								<!-- /BOX -->
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
			App.setPage("index"); //Set current page
			App.init(); //Initialise plugins and elements
		});
		 function deleteUser(){
	    	 var a=confirm("确定要删除这个用户吗？");
	    	 if(a==true)
	    	 {
	    	 /*document.write("恭喜你答对了！");*/
	    	 alert("删除成功");
	    	 begin();
	    	 }
	    	 else
	    	 {
	    	 /*document.write("你真是猪，这么简单的问题都答不对！");*/
	    	 alert("暂时不删除");
	    	 //deleteUser();
	    	 }
	    }
	</script>
	<!-- /JAVASCRIPTS -->
</body>
</html>