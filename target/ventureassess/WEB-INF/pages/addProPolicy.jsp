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

       //增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addProPolicy?pro_id='+proId);
			$('#form1').submit();
        });
        $('#finishBtn').click(function(e) {
            $('#form1').attr('action','selectNoEvaProject?pageNum=1');
			$('#form1').submit();
        });
     	//清空表单
		$('#clearBtn').click(function(e) {
            $('#ps_id').val('');
		    $('#ps_way').val('');
            $('#ps_rank').val('');
		    $('#ps_category').val('');
		    
		    $('input[name="ids"]').prop('checked',false);
			
        }); 
		
		//选择单选设置表单数据
		$('input[name="ids"]').click(function(e) {
			/* alert(111); */
           var psId = $(this).parent().parent().find('td').eq(1).text();
		   var psWay = $(this).parent().parent().find('td').eq(2).text();
		   var psRank = $(this).parent().parent().find('td').eq(3).text();
		   var psCategory = $(this).parent().parent().find('td').eq(4).text();
		   
		   $('#ps_id').val($.trim(psId));
		   $('#ps_way').val($.trim(psWay));
		   $('#ps_rank').val($.trim(psRank));
		   $('#ps_category').val($.trim(psCategory));
		   
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
		
		<div class="col-md-5">
		<div class="space-bottom"></div>
		<div class="space-bottom"></div>
		 <div style="text-align: center">    
	    		  <h2>政策支持列表</h2>
	    		  </div>
		<table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>编号</th>
                <th>方式</th>
                <th>级别</th>
                <th>类别</th>
              </tr>
               <c:forEach items="${psSupports}" var="psSupport">
              <tr>
                <td><input type="radio" name="ids"></td>
                <td>${psSupport.ps_id }</td>
                <td>${psSupport.ps_way }</td>
                <td>${psSupport.ps_rank }</td>
                <td>${psSupport.ps_category }</td>
              </tr>
              </c:forEach> 
            </table>    
								
          <%--   <ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								    <input type="hidden" id="pagenum" value="${pager.pageNum}">
						    </ul>
						    --%>
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddProPolicy?pageNum=1&&pro_id=${pro_id}">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="toAddProPolicy?pageNum=${pager.pageNum-1}&&pro_id=${pro_id}">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddProPolicy?pageNum=${pager.pageNum+1}&&pro_id=${pro_id}">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="toAddProPolicy?pageNum=${pager.pageCount}&&pro_id=${pro_id}">末页</a></li>
									<!-- <li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>	 -->	
								
							</ul>
		
		</div>
		
		<div class="main col-md-7 ">
	    <div class="space-bottom"></div>	    	    
	    <div class="span9" style="min-height: 400px;">
	    		 <div class="space-bottom"></div> 
	    		 <div style="text-align: center">    
	    		  <h2>该项目已选政策支持</h2>
	    		   <input type="hidden"  name="check_pro_id" id="check_pro_id" value="${pro_id}" >
	    		  </div>
			<table class="table table-bordered table-striped">
              <tr>
                <th>支持项目名称</th>
                <th>支持方式</th>
                <th>支持级别</th>
                <th>支持类别</th> 
                <th>支持金额</th> 
              </tr>
               <c:forEach items="${p_ps}" var="p_p">
              <tr>
                
                <td>${p_p.pro_ps_name}</td>
                <td>${p_p.ps_way}</td>
                <td>${p_p.ps_rank}</td>
                <td>${p_p.ps_category}</td>
                <td>${p_p.fund}</td>
              </tr>
              </c:forEach> 
            </table>
           <div class="space-bottom"></div>
            <h2>请从政策支持列表中选择支持政策</h2>
            <form id="form1" class="form-horizontal" name="form1" method="post" action="">
              <div class="form-group">
				<label class="col-sm-2 control-label">支持编号</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="ps_id" id="ps_id" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">支持方式</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="ps_way" id="ps_way" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">支持级别</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="ps_rank" id="ps_rank" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">支持类别</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="ps_category" id="ps_category" readonly>
				</div>
		      </div>
		    <div class="form-group">
				<label class="col-sm-2 control-label">支持项目名称</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="pro_ps_name" id="pro_ps_name" placeholder="请输入支持项目名称...">
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">支持金额</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="fund" id="fund" placeholder="请输入支持金额...">
				</div>
		      </div>
            	    <div style="text-align: center">
                    	<input type="button" name="button" id="insertBtn" value="增加项目支持" class="btn btn-primary">
                   <!--      <input type="button" name="button2" id="updateBtn" value="修改" class="btn btn-primary" disabled>
                        <input type="button" name="button3" id="deleteBtn" value="删除" class="btn btn-primary" disabled> -->
                        <input type="button" name="button4" id="clearBtn" value="清空" class="btn btn-primary">
                        <input type="button" name="button1" id="finishBtn" value="完成项目创建" class="btn btn-primary">
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