<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      <% String path=request.getContextPath();
     String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
     response.setHeader("Content-Range", "bytes 0-800/801");
     request.setCharacterEncoding("UTF-8") ;
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>成员管理</title>
<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <jsp:include page="/head.jsp" flush="true"/>
      <script type="text/javascript"
	src="<%= basePath%>/static/media/js/jquery.js"></script>
	<script type="text/javascript" src="<%= basePath%>/static/media/js/zebra_dialog.js"></script> 
<script type="text/javascript">
			
	$(document).ready(function(e) {
		var pagenum = $('#pagenum').val();
		var proId = $('#check_pro_id').val();
/* 		//增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addmember?pageNum='+pagenum);
			$('#form1').submit();
        }); */
       //增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addPromember?pro_id='+proId);
			$('#form1').submit();
        });
       /*  $('#nextBtn').click(function(e) {
            $('#form1').attr('action','toAddProPolicy?pageNum=1');
			$('#form1').submit();
        }); */
/* 		//修改数据
		$('#updateBtn').click(function(e) {
            $('#form1').attr('action','updatemember?pageNum='+pagenum);
			$('#form1').submit();
        });
		
		//删除数据
		$('#deleteBtn').click(function(e) {
			$('#form1').attr('action','deletemember?pageNum='+pagenum);
			$('#form1').submit();       
        }); */
		
     	//清空表单
		$('#clearBtn').click(function(e) {
            $('#team_member').val('');
		    $('#t_name').val('');
		    $('input[name="ids"]').prop('checked',false);
			
        }); 
		
		//选择单选设置表单数据
		$('input[name="ids"]').click(function(e) {
			/* alert(111); */
           var memberId = $(this).parent().parent().find('td').eq(1).text();
		   var memberName = $(this).parent().parent().find('td').eq(2).text();
		   
		   $('#team_member').val($.trim(memberId));
		   $('#t_name').val($.trim(memberName));
        });
		
    });
</script>
</head>

<body>
<jsp:include page="/header1.jsp" flush="true"/>

<!-- contact section -->
<section class="contact-w3ls">

	<div class="container">
		<div class="row">
		
		<div class="col-md-4">
		<div class="space-bottom"></div>
		<div class="space-bottom"></div>
		 <div style="text-align: center">    
	    		  <h2>成员列表</h2>
	    		  </div>
		<table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>编号</th>
                <th>名称</th>
                <th>性别</th>
                <th>学历</th> 
              </tr>
               <c:forEach items="${members}" var="member">
              <tr>
                <td><input type="radio" name="ids"></td>
                <td>${member.member_id }</td>
                <td>${member.member_name }</td>
                <c:if test="${member.member_gender==1}">	
                <td>男</td>
                </c:if>
                <c:if test="${member.member_gender==2}">	
                <td>女</td>
                </c:if>
                <c:if test="${member.member_edu==1}">	
                <td>博士</td>
                </c:if>
                <c:if test="${member.member_edu==2}">	
                <td>硕士</td>
                </c:if>
                <c:if test="${member.member_edu==3}">	
                <td>本科</td>
                </c:if>
                <c:if test="${member.member_edu==4}">	
                <td>本科以下</td>
                </c:if>
                
              </tr>
              </c:forEach> 
            </table>
            <input type="button" name="insertMemberBtn" id="insertMemberBtn" value="增加新成员"data-toggle="modal"
								data-target="#myModal" class="btn btn-primary">
								<!-- Modal -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
								aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">
												<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
											</button>
											<h4 class="modal-title" id="myModalLabel">新增成员</h4>
										</div>
										<div class="modal-body">
											<form role="form" class="form-horizontal"  action="/vcevaluation/addmember1?pro_id=${pro_id}">
												
											      <div class="form-group">
													<label class="col-sm-3 control-label">成员名称</label>
													<div class="col-sm-7">
														<input type="text" class="form-control" name="member_name" id="member_name" placeholder="请输入成员名称...">
													</div>
											      </div>
											      <div class="form-group">
													<label class="col-sm-3 control-label">成员性别</label>
													<div class="col-sm-7">
													        <select class="form-control" name="member_gender" id="member_gender">
																	<option id="member_gender_option_male" value="1">男</option>
																	<option id="member_gender_option_female" value="2">女</option>
															 </select>
									<!-- 					<input type="text" class="form-control" name="member_gender" id="member_gender" placeholder="请输入样机名称...">
									 -->				</div>
											      </div>
											      <div class="form-group">
													<label class="col-sm-3 control-label">成员学历</label>
													<div class="col-sm-7">
													 <select class="form-control" name="member_edu" id="member_edu">
																<option id="member_edu_1" value="1">博士</option>
																<option id="member_edu_2" value="2">硕士</option>
																<option id="member_edu_3" value="3">本科</option>
																<option id="member_edu_4" value="4">本科以下</option>		
															 </select>
									<!-- 					<input type="text" class="form-control" name="member_edu" id="member_edu" placeholder="请输入样机名称...">
									 -->				</div>
											      </div>
											      <div class="form-group">
													<label class="col-sm-3 control-label">成员email</label>
													<div class="col-sm-7">
														<input type="text" class="form-control" name="member_job" id="member_job" placeholder="请输入成员email...">
													</div>
											      </div>
											      <div class="form-group">
													<label class="col-sm-3 control-label">成员经历</label>
													<div class="col-sm-7">
														<input type="text" class="form-control" name="member_email" id="member_email" placeholder="请输入成员经历...">
													</div>
											      </div>
											      <div style="text-align: center">
												<button type="submit" class="btn btn-default"
													onclick="check()">提交</button>
												<button type="button" class="btn btn-default"
													data-dismiss="modal">关闭</button>
													</div>
											</form>
										</div>
									</div>
								</div>
							</div>

							<!-- Modal -->
          <%--   <ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								    <input type="hidden" id="pagenum" value="${pager.pageNum}">
						    </ul>
						    --%>
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddPromember?pageNum=1&&pro_id=${pro_id}">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddPromember?pageNum=${pager.pageNum-1}&&pro_id=${pro_id}">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddPromember?pageNum=${pager.pageNum+1}&&pro_id=${pro_id}">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddPromember?pageNum=${pager.pageCount}&&pro_id=${pro_id}">末页</a></li>
									<!-- <li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>	 -->	
								
							</ul>
		
		</div>
		
		<div class="main col-md-7 col-md-offset-1">
	    <div class="space-bottom"></div>	    	    
	    <div class="span9" style="min-height: 400px;">
	    		 <div class="space-bottom"></div> 
	    		 <div style="text-align: center">    
	    		  <h2>该项目已选成员</h2>
	    		   <input type="hidden"  name="check_pro_id" id="check_pro_id" value="${pro_id}" > 
	    		  </div>
			<table class="table table-bordered table-striped">
              <tr>
                
                <!-- <th>选择</th> -->
                <th>成员编号</th>
                <th>成员名称</th>
                <th>成员职务</th> 
                
              </tr>
               <c:forEach items="${teams}" var="team">
              <tr>
              <!--   <td><input type="radio" name="ids1"></td> -->
               <%--  <td>${team.team_id }</td> --%>
                <td>${team.member_id }</td>
                <td>${membermap[team.member_id]}</td>
                <td>${team.team_job }</td>
              </tr>
              </c:forEach> 
            </table>
           <div class="space-bottom"></div>
            <h2>请从成员列表中选择成员</h2>
            <form id="form1" class="form-horizontal" name="form1" method="post" action="">
              <!-- <div class="form-group">
				<label class="col-sm-2 control-label">已选编号</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="team_id" id="team_id" readonly>
				</div>
		      </div> -->
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员编号</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="team_member" id="team_member" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员名称</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="t_name" id="t_name" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员职务</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="team_job" id="team_job" placeholder="请输入成员职务...">
				</div>
		      </div>
		    
            	    <div style="text-align: center">
                    	<input type="button" name="button" id="insertBtn" value="增加项目成员" class="btn btn-primary">
                   <!--      <input type="button" name="button2" id="updateBtn" value="修改" class="btn btn-primary" disabled>
                        <input type="button" name="button3" id="deleteBtn" value="删除" class="btn btn-primary" disabled> -->
                        <input type="button" name="button4" id="clearBtn" value="清空" class="btn btn-primary">
                        <a type="button" name="button2" id="nextBtn" class="btn btn-primary" href="toAddProPolicy?pageNum=1&pro_id=${pro_id}">下一步</a>
                    </div>    
                   <!--  </td>
           	    </tr> -->
          	  </table>
            </form>                		
						
	    </div>
	    </div>
	</div>
    
	</div>	
</section>			
<!-- /contact section -->

<jsp:include page="/footer1.jsp" flush="true"/>

</body>
</html>