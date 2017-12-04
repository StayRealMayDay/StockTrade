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
<title>指标选项管理</title>
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
		/* $('#optionId').hide()
	    $('#optionid').hide() */
		var option_id = $('#option_id').val();
        var in_id = $('#in_id').val();
        /*  alert(in_id)  */
		 //增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addInOptions?in_id='+in_id);
			$('#form1').submit();
        });
		
		//修改数据
		$('#updateBtn').click(function(e) {
            $('#form1').attr('action','updateInOptions?in_id='+in_id);
			$('#form1').submit();
        });
		
		//删除数据
		$('#deleteBtn').click(function(e) {
			$('#form1').attr('action','deleteInOptions?in_id='+in_id);
			$('#form1').submit();       
        }); 
		
		//清空表单
		$('#clearBtn').click(function(e) {
            $('#option_id').val('');
		    $('#option_name').val('');
		    $('#option_value').val('');
		    $('input[name="ids"]').prop('checked',false);
			
			$('#updateBtn').prop('disabled',true);
		    $('#deleteBtn').prop('disabled',true);
        });
		
		//选择单选设置表单数据
		$('input[name="ids"]').click(function(e) {
			/* alert(111); */
           var optionId = $(this).parent().parent().find('td').eq(1).text();
		   var optionName = $(this).parent().parent().find('td').eq(2).text();
		   var optionValue = $(this).parent().parent().find('td').eq(3).text();
		   
		   $('#option_id').val($.trim(optionId));
		   $('#option_name').val($.trim(optionName));
		   $('#option_value').val($.trim(optionValue));
/* 		   if(memberGender =="男")
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
		   } */
		   
		   
		   $('#updateBtn').prop('disabled',false);
		   $('#deleteBtn').prop('disabled',false);
        });
		
    });
</script>
</head>

<body>


<!-- contact section -->
<section class="contact-w3ls">

	<div class="container">
		<div class="row">
	    <div class="space-bottom"></div>	    	    
	    <div class="span9" style="min-height: 400px;">
	    		 <div class="space-bottom"></div>  
	    		 <div style="text-align: center">  
	    		 <h2>指标选项管理--${indicator.in_name}</h2>
	    		 <input type="hidden"name="in_id" id="in_id" value="${indicator.in_id}" >
	    		 </div>
			<table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>选项编号</th>
                <th>选项内容</th>
                <th>选项分值</th>
              </tr>
               <c:forEach items="${optionList}" var="oplist">
              <tr>
                <td><input type="radio" name="ids"></td>
                <td>${oplist.option_id }</td>
                <td>${oplist.option_name }</td>
                <td>${oplist.option_value }</td>
              <%--   <c:if test="${ps.member_gender==1}">	
                <td>男</td>
                </c:if>
                <c:if test="${ps.member_gender==2}">	
                <td>女</td>
                </c:if> --%>
              
                
              </tr>
              </c:forEach> 
            </table>
          
           <div class="space-bottom"></div>
            
            <form id="form1" class="form-horizontal" name="form1" method="post" action="">
              <div class="form-group">
				<label class="col-sm-2 control-label">选项编号</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="option_id" id="option_id" readonly>
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">选项内容</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="option_name" id="option_name" placeholder="请输入选项内容...">
				</div>
		      </div>
		      <div class="form-group">
				<label class="col-sm-2 control-label">选项分值</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="option_value" id="option_value" onblur="checkValue()" placeholder="请输入选项分值(不大于10的数值)...">
					<label id="vali_option_value" style="font-size:9px;display:none;"></label>
				</div>
		      </div>
		      <!-- <div class="form-group">
				<label class="col-sm-2 control-label">选项类型</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" name="in_optiontype" id="in_optiontype" placeholder="请输入支持类别...">
				</div>
		      </div> -->
       
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
<script>
function checkValue(){
	//String sname= "scord_index"+s;
	var score=$("#option_value").val();
	var regscore=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
	if(score==""){
		$("#vali_option_value").html("请输入分值");}
		else if(!regscore.test(score)){
			
			$("#vali_option_value").html("请输入数值");
			
		}else if(score > 10){
			$("#vali_option_value").html("请输入符合要求的数值");
		}
		else{
			$("#vali_option_value").html("");
			return true;
		}
		$("#vali_option_value").css("display","inline");
			$("#vali_option_value").css("color","red");
			$("#vali_option_value").css("font-size","14px");
			return false;
	}
</script>
</body>
</html>