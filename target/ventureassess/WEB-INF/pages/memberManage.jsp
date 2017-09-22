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
		//增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addmember?pageNum='+pagenum);
			$('#form1').submit();
        });
		
		//修改数据
		$('#updateBtn').click(function(e) {
            $('#form1').attr('action','updatemember?pageNum='+pagenum);
			$('#form1').submit();
        });
		
		//删除数据
		$('#deleteBtn').click(function(e) {
			$('#form1').attr('action','deletemember?pageNum='+pagenum);
			$('#form1').submit();       
        });
		
		//清空表单
		$('#clearBtn').click(function(e) {
            $('#member_id').val('');
		    $('#member_name').val('');
		    $('#member_gender').val('');
		    $('#member_edu').val('');
		    $('#member_job').val('');
		    $('#member_email').val('');
		    $('input[name="ids"]').prop('checked',false);
			
			$('#updateBtn').prop('disabled',true);
		    $('#deleteBtn').prop('disabled',true);
        });
		
		//选择单选设置表单数据
		$('input[name="ids"]').click(function(e) {
			/* alert(111); */
           var memberId = $(this).parent().parent().find('td').eq(1).text();
		   var memberName = $(this).parent().parent().find('td').eq(2).text();
		   var memberGender = $(this).parent().parent().find('td').eq(3).text();
		   var memberEdu = $(this).parent().parent().find('td').eq(4).text();
		   var memberJob = $(this).parent().parent().find('td').eq(5).text();
		   var memberEmail = $(this).parent().parent().find('td').eq(6).text();
		   
		   $('#member_id').val($.trim(memberId));
		   $('#member_name').val($.trim(memberName));
		   if(memberGender =="男")
		   {
			   $("#member_gender_option_male").prop('selected',true);
			   $("#member_gender_option_female").prop('selected',false);
		   }else{
			   $("#member_gender_option_female").prop('selected',true);
			   $("#member_gender_option_male").prop('selected',false);
		   }
		   if(memberEdu =="博士")
		   {
			   $("#member_edu_1").prop('selected',true);
			   $("#member_edu_2").prop('selected',false);
			   $("#member_edu_3").prop('selected',false);
			   $("#member_edu_4").prop('selected',false);
		   }else if(memberEdu =="硕士"){
			   $("#member_edu_1").prop('selected',false);
			   $("#member_edu_2").prop('selected',true);
			   $("#member_edu_3").prop('selected',false);
			   $("#member_edu_4").prop('selected',false);
		   }else if(memberEdu =="本科"){
			   $("#member_edu_1").prop('selected',false);
			   $("#member_edu_2").prop('selected',false);
			   $("#member_edu_3").prop('selected',true);
			   $("#member_edu_4").prop('selected',false);
		   }else{
			   $("#member_edu_1").prop('selected',false);
			   $("#member_edu_2").prop('selected',false);
			   $("#member_edu_3").prop('selected',false);
			   $("#member_edu_4").prop('selected',true);
		   }
		   $('#member_job').val($.trim(memberJob));
		   $('#member_email').val($.trim(memberEmail));
		   
		   $('#updateBtn').prop('disabled',false);
		   $('#deleteBtn').prop('disabled',false);
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
	    <div class="space-bottom"></div>	    	    
	    <div class="span9" style="min-height: 400px;">
	    		 <div class="space-bottom"></div> 
	    		 <div style="text-align: center">    
	    		  <h2>成员管理</h2>
	    		  </div>
			<table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>成员编号</th>
                <th>成员名称</th>
                <th>成员性别</th>
                <th>成员学历</th>
                <th>成员经历</th>
                <th>成员email</th> 
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
                <td>${member.member_job }</td>
                <td>${member.member_email }</td> 
                
              </tr>
              </c:forEach> 
            </table>
            <ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								    <input type="hidden" id="pagenum" value="${pager.pageNum}">
						    </ul>
						   
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddmember?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddmember?pageNum=${pager.pageNum-1}">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddmember?pageNum=${pager.pageNum+1}">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddmember?pageNum=${pager.pageCount}">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>
           <div class="space-bottom"></div>
            
            <form id="form1" class="form-horizontal" name="form1" method="post" action="">
              <div class="form-group">
				<label class="col-sm-2 control-label">成员编号</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="member_id" id="member_id" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员名称</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="member_name" id="member_name" placeholder="请输入成员名称...">
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员性别</label>
				<div class="col-sm-8">
				        <select class="form-control" name="member_gender" id="member_gender">
								<option id="member_gender_option_male" value="1">男</option>
								<option id="member_gender_option_female" value="2">女</option>
						 </select>
<!-- 					<input type="text" class="form-control" name="member_gender" id="member_gender" placeholder="请输入样机名称...">
 -->				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员学历</label>
				<div class="col-sm-8">
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
				<label class="col-sm-2 control-label">成员email</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="member_job" id="member_job" placeholder="请输入成员email...">
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">成员经历</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="member_email" id="member_email" placeholder="请输入成员经历...">
				</div>
		      </div>
           	  <!-- <table class="table table-bordered"> -->
            	<!--   <tr>
            	    <td>成员编号</td>
            	    <td><input type="text" name="member_id" id="member_id" readonly></td>
            	    <td>成员名称</td>
            	    <td><input type="text" name="member_name" id="member_name"></td>
            	    <td>成员性别</td>
            	    <td><input type="text" name="member_gender" id="member_gender"></td>
            	    <td>成员学历</td>
            	    <td><input type="text" name="member_edu" id="member_edu"></td>
            	    <td>成员email</td>
            	    <td><input type="text" name="member_job" id="member_job"></td>
            	    <td>成员经历</td>
            	    <td><input type="text" name="member_email" id="member_email"></td>
          	    </tr> -->
            	<!--   <tr>
            	    <td colspan="4" style="text-align: center"> -->
            	    <div style="text-align: center">
                    	<input type="button" name="button" id="insertBtn" value="增加" class="btn btn-primary">
                        <input type="button" name="button2" id="updateBtn" value="修改" class="btn btn-primary" disabled>
                        <input type="button" name="button3" id="deleteBtn" value="删除" class="btn btn-primary" disabled>
                        <input type="button" name="button4" id="clearBtn" value="清空" class="btn btn-primary">
                    </div>    
                   <!--  </td>
           	    </tr> -->
          	  </table>
            </form>                		
						
	    </div>
	</div>
    
	</div>	
</section>			
<!-- /contact section -->

<jsp:include page="/footer1.jsp" flush="true"/>

</body>
</html>