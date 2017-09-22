<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>修改个人信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.fr.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />

<link rel="stylesheet" href="<%= basePath%>/static/uStyle/css/bootstrap-datetimepicker.css">
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.js"></script>
<%-- <script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.zh-CN.js"></script> --%>

<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<style type="text/css">
	.verticle_line{
		width: 1px;
		border: solid;
		background-color: black;
	}
	.tag_btn_active{
		background: #fff!important;
		color: #f15f43!important; 
		border: 1px solid #f15f43;
	}
	.myContainer{
		margin-left: 10%;
		margin-right: 10%;
	}
	.left_sideBar{
		padding: 2em 0;
	}
	label.col-md-2.control-lable {
    text-align: right;
}
    .col-md-9{
    padding-left: 0px;}
</style>
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>

<script>

    function selectDefault(defaultId){  
    
    $("select option").each(function(){  
        if($(this).val()==defaultId){  
            $(this).attr("selected","selected");  
        }  
    });  
    //alert(defaultId);  
    }
    
	$(document).ready(function(e){  
		var userFlag = "${user.userFlag}"; 
		var userSeniority = "${user.userSeniority}"; 
		if(userFlag=='创业者'){
			if(userSeniority=='有工作经验'){

				var defaultId = "${user.userEdu}"; 
			    var defaultId1 = "${user.userSeniority}";
			    var defaultId2 = "${user.userWorkyear}";
			    selectDefault(defaultId);
			    selectDefault(defaultId1);
				selectDefault(defaultId2);
			}
			else{
				var defaultId = "${user.userEdu}"; 
			    var defaultId1 = "${user.userSeniority}";
			    selectDefault(defaultId);
			    selectDefault(defaultId1);
			}
		}
		else{
			var defaultId = "${user.userEdu}"; 
		    var defaultId2 = "${user.userWorkyear}";
		    selectDefault(defaultId);
			selectDefault(defaultId2);
		}
		if(userFlag=='创业者'){
			if(userSeniority == '有工作经验'){
				$("#company").css("display","");
				$("#workyear").css("display","");
			}
			else{
				
				$("#company").css("display","none");
				$("#workyear").css("display","none");
			}
		}
		else{
			$("#company").css("display","");
			$("#workyear").css("display","");
		}
	    //alert(defaultId);  
	    
	    //增加数据
		$('#insertBtn').click(function(e) {
            $('#form1').attr('action','addles');
			$('#form1').submit();
        });
		
		//修改数据
		$('#updateBtn').click(function(e) {
            $('#form1').attr('action','updateles');
			$('#form1').submit();
        });
		
		//删除数据
		$('#deleteBtn').click(function(e) {
			$('#form1').attr('action','deleteles');
			$('#form1').submit();       
        });
		
		//清空表单
		$('#clearBtn').click(function(e) {
            $('#luuid').val('');
		    $('#lstart').val('');
		    $('#lend').val('');
		    $('#lschool').val('');
		    $('#ledu').val('');
		    $('input[name="ids_les"]').prop('checked',false);
			
			$('#updateBtn').prop('disabled',true);
		    $('#deleteBtn').prop('disabled',true);
        });
		
		//选择单选设置表单数据
		$('input[name="ids_les"]').click(function(e) {
			/* alert(111); */
           var leUuid = $(this).parent().parent().find('td').eq(5).text();
		   var leStart = $(this).parent().parent().find('td').eq(1).text();
		   var leEnd = $(this).parent().parent().find('td').eq(2).text();
		   var leSchool = $(this).parent().parent().find('td').eq(3).text();
		   var leEdu = $(this).parent().parent().find('td').eq(4).text();
		   
		   $('#luuid').val($.trim(leUuid));
		   $('#lstart').val($.trim(leStart));
		   $('#lend').val($.trim(leEnd));
		   $('#lschool').val($.trim(leSchool));
		   $('#ledu').val($.trim(leEdu));
		   
		   
		   $('#updateBtn').prop('disabled',false);
		   $('#deleteBtn').prop('disabled',false);
        });
		
		 
	    //增加数据
		$('#insertBtn1').click(function(e) {
            $('#form2').attr('action','addwes');
			$('#form2').submit();
        });
		
		//修改数据
		$('#updateBtn1').click(function(e) {
            $('#form2').attr('action','updatewes');
			$('#form2').submit();
        });
		
		//删除数据
		$('#deleteBtn1').click(function(e) {
			$('#form2').attr('action','deletewes');
			$('#form2').submit();       
        });
		
		//清空表单
		$('#clearBtn1').click(function(e) {
            $('#wuuid').val('');
		    $('#wstart').val('');
		    $('#wend').val('');
		    $('#wcompany').val('');
		    $('#wrank').val('');
		    $('input[name="ids_wes"]').prop('checked',false);
			
			$('#updateBtn1').prop('disabled',true);
		    $('#deleteBtn1').prop('disabled',true);
        });
		
		//选择单选设置表单数据
		$('input[name="ids_wes"]').click(function(e) {
			/* alert(111); */
           var weUuid = $(this).parent().parent().find('td').eq(5).text();
		   var weStart = $(this).parent().parent().find('td').eq(1).text();
		   var weEnd = $(this).parent().parent().find('td').eq(2).text();
		   var wCompany = $(this).parent().parent().find('td').eq(3).text();
		   var wRank = $(this).parent().parent().find('td').eq(4).text();
		   
		   $('#wuuid').val($.trim(weUuid));
		   $('#wstart').val($.trim(weStart));
		   $('#wend').val($.trim(weEnd));
		   $('#wcompany').val($.trim(wCompany));
		   $('#wrank').val($.trim(wRank));
		   
		   
		   $('#updateBtn1').prop('disabled',false);
		   $('#deleteBtn1').prop('disabled',false);
        });
	    
	});  
	function onchangeSelect(){
		user_seniority = $("#user_seniority").val();
		 alert(user_seniority);
		if(user_seniority == '有工作经验'){
			$("#company").css("display","");
			$("#workyear").css("display","");
		}
		else{
			
			$("#company").css("display","none");
			$("#workyear").css("display","none");
		}
	};
	

</script>

<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
    <div class="single">  
	    <div class="col-md-2 left_sideBar" id="tag_btnList">
	   	  	<div class="col_3" id="userInfo" onclick="tabChangeFunc(this)">
	   	  		<h3>个人信息</h3>
	   	  	</div>
	   	  	<div class="col_3" id="education" onclick="tabChangeFunc(this)">
	   	  		<h3>学习经历</h3>
	   	  	</div>
	   	  	<div class="col_3" id="working" onclick="tabChangeFunc(this)">
	        	<h3>工作经历</h3>
    	    </div>
    	   <!--  <div class="col_3" id="rewards" onclick="tabChangeFunc(this)">
	        	<h3>所获奖项</h3>
    	    </div> -->
		</div>
		 <!-- <div class="verticle_line"> -->
		<div class="col-md-10 single_right" >

			<div id="myTabContent" class="tab-content" >
				  <div role="tabpanel" class="tab-pane fade in active" id="userInfo_tab" aria-labelledby="home-tab">
				    
						<div class="myContainer">
						    <div class="single">  
							   <div class="form-container">
						       <form role="form" id="form" action="editUserInfo" method="post">
          
        <div class="row">
					<!-- 获取当前用户的id -->
					<input type="hidden" id="user_uuid" name="user_uuid"
						value="${user.userUuid}" /> 
		</div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">姓名</label>
                <div class="col-md-9">
                    <input type="text" name="user_realname" id="user_realname"  value="${user.userRealname} "class="form-control input-sm"/>
                    
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">年龄</label>
                <div class="col-md-9">
                    <input type="text" name="user_age" id="user_age"  value="${user.userAge} "class="form-control input-sm"/>
                   
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="sex">性别</label>
                <div class="col-md-9" class="form-control input-sm">
                    <div class="radios">
                    <c:if test="${user.userGender  == '男'}">
                    
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="user_gender" name="user_gender" value="男" checked=""> 男
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="user_gender" name="user_gender" value="女"> 女
				        </label>
				    </c:if>
				    <c:if test="${user.userGender == '女'}">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="user_gender" name="user_gender" value="男" > 男
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="user_gender" name="user_gender" value="女" checked=""> 女
				        </label>
				    </c:if>
	                </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">学历</label>
                <div class="col-md-9">
                    <select name="user_edu" id="user_edu" class="form-control input-sm">
                        <option id="eduop_0" value="">请选择</option>
                        <c:forEach items="${edulist}" varStatus="status" var="edu">
                        <option id="eduop_${status.index+1}" value="${edu.ddValue}">${edu.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">E-mail</label>
                <div class="col-md-9">
                    <input type="text" name="user_email" id="user_email" value="${user.userEmail} " class="form-control input-sm"/>
                   
                </div>
            </div>
        </div>
         <c:if test="${user.userFlag == '创业者'}">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">研究方向</label>
                <div class="col-md-9">
                    <input type="text" name="user_research" id="user_research" value="${user.userResearch}" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">科研情况</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6"  name="user_scientific" id="user_scientific"  onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}">${user.userScientific} </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">所获奖项</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6"  name="user_price" id="user_price" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> ${user.userPrice}</textarea>
                    
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="country">工作资历</label>
                <div class="col-md-9">
                    <select name="user_seniority" id="user_seniority" onchange="onchangeSelect();" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${senioritylist}" var="seniority">
                        <option value="${seniority.ddValue}">${seniority.ddValue}</option>
                        </c:forEach>  
                    </select>
                    
                </div>
            </div>
        </div>
        </c:if>
        <%-- <c:if test="${user.userSeniority == '有工作经验'||user.userFlag == '基金经理'}"> --%>
        <div id="company" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">所属公司</label>
                <div class="col-md-9">
                    <input type="text" name="user_company" id="user_company" value="${user.userCompany} "class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div id="workyear" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">工作年限</label>
                <div class="col-md-9">
                    <select name="user_workyear" id="user_workyear" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${workyearlist}" var="workyear">
                        <option value="${workyear.ddValue}">${workyear.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
     <%--    </c:if> --%>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">感兴趣领域</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" name="user_area" id="user_area" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}">${user.userArea} </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">自我介绍</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" name="user_brief" id="user_brief" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}">${user.userBrief} </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="保存资料" class="btn btn-primary btn-sm">
                <input type="button" value="返回" onclick="javascript:history.go(-1);" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
						    </div>
						 </div>
						</div>

				  </div>
				  <div role="tabpanel" class="tab-pane fade" id="education_tab" aria-labelledby="home-tab">
				  <div class="myContainer">
						    <div class="single">  
				     <div class="form-container">
				     <table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>开始时间</th>
                <th>结束时间</th>
                <th>学校</th>
                <th>学历</th>
               <th  style="visibility: hidden;">学习经历编号</th>
                
              </tr>
               <c:forEach items="${les}" var="les">
              <tr>
                <td><input type="radio" name="ids_les"></td>
                 <td>${les.leStart }</td>
                <td>${les.leEnd }</td>
                <td>${les.leSchool }</td>
                <td>${les.leEdu }</td> 
                <td  style="visibility: hidden;">${les.leUuid }</td>
               
              </tr>
              </c:forEach> 
            </table>
            </br>
            </br>
				  <form id="form1" class="form-horizontal" name="form1" method="post" action="">
				  <div class="row">
            <div class="form-group col-md-12">
          <!--       <label  type="hidden"  class="col-md-2 control-lable" for="lastName">编号</label> -->
                <div class="col-md-9">
                    <input type="hidden" name="luuid" id="luuid"  class="form-control"/>
                </div>
            </div>
        </div>
				  <div class="row">
				  <div class="form-group col-md-12">
      <label for="dtp_input2" class="col-md-2 control-lable">开始年份</label>
      <div class="input-group date form_date col-md-9" data-date="" data-date-format="yyyy" data-link-field="dtp_input2" data-link-format="yyyy">
          <input class="form-control" size="16" name="lstart" id="lstart" type="text" value="">
        <!--  <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
	 <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
</div>
        </div>
        <div class="row">
        <div class="form-group col-md-12">
      <label for="dtp_input2" class="col-md-2 control-lable">结束年份</label>
      <div class="input-group date form_date col-md-9" data-date="" data-date-format="yyyy" data-link-field="dtp_input2" data-link-format="yyyy">
          <input class="form-control" size="16" name="lend" id="lend" type="text" value="">
        <!--  <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
	 <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
</div>
        </div>
				 <!--  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">开始</label>
                <div class="col-md-9">
                <input size="16" type="text" name="lstart" id="lstart"readonly class="form_datetime">                    
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">结束</label>
                <div class="col-md-9">
                    <input size="16" type="text"  name="lend" id="lend" readonly class="form_datetime">
                </div>
            </div>
        </div> -->
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">学校</label>
                <div class="col-md-9">
                    <input type="text" name="lschool" id="lschool"  class="form-control"/>
                </div>
            </div>
        </div>
				    <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">学历</label>
                <div class="col-md-9">
                    <select name="ledu" id="ledu" class="form-control">
                        <option value="">请选择</option>
                        <c:forEach items="${edulist}" var="edu">
                        <option value="${edu.ddValue}">${edu.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>  
         <div style="text-align: center">
                	<input type="button" name="button" id="insertBtn" value="增加学习经历" class="btn btn-primary">
                    <input type="button" name="button2" id="updateBtn" value="修改学习经历" class="btn btn-primary" disabled>
                    <input type="button" name="button3" id="deleteBtn" value="删除学习经历" class="btn btn-primary" disabled>
                    <input type="button" name="button4" id="clearBtn" value="清空" class="btn btn-primary">
                </div>    
     <!--  
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit"  style="float:right;width: 20%;margin-right:34px" value="保存资料" class="btn btn-primary btn-sm">
                
                
            </div>
        </div> -->
        </form></div></div></div>
				  </div>
				  <div role="tabpanel" class="tab-pane fade" id="working_tab" aria-labelledby="home-tab">
				    <div class="myContainer">
						    <div class="single">  
				     <div class="form-container">
				     <table class="table table-bordered table-striped">
              <tr>
                <th>选择</th>
                <th>开始时间</th>
                <th>结束时间</th>
                <th>公司描述</th>
                <th>职位</th>
                 <th style="visibility: hidden;">工作经历编号</th> 
                
              </tr>
               <c:forEach items="${wes}" var="wes">
              <tr>
                <td><input type="radio" name="ids_wes"></td>
                <td>${wes.weStart }</td>
                <td>${wes.weEnd }</td>
                <td>${wes.weCompany }</td>
                <td>${wes.weRank }</td> 
                <td style="visibility: hidden;">${wes.weUuid }</td> 
                
              </tr>
              </c:forEach> 
            </table>
				  <form id="form2" class="form-horizontal" name="form2" method="post" action="">
				   
      <div class="row">
            <div class="form-group col-md-12">
               <!--  <label class="col-md-2 control-lable" for="lastName">编号</label> -->
                <div class="col-md-9">
                    <input type="hidden" name="wuuid" id="wuuid"  class="form-control"/>
                </div>
            </div>
        </div>
				  <div class="row">
				  <div class="form-group col-md-12">
      <label for="dtp_input2" class="col-md-2 control-lable">开始年份</label>
      <div class="input-group date form_date col-md-9" data-date="" data-date-format="yyyy" data-link-field="dtp_input2" data-link-format="yyyy">
          <input class="form-control" size="16" name="wstart" id="wstart" type="text" value="">
        <!--  <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
	 <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
</div>
        </div>
        <div class="row">
        <div class="form-group col-md-12">
      <label for="dtp_input2" class="col-md-2 control-lable">结束年份</label>
      <div class="input-group date form_date col-md-9" data-date="" data-date-format="yyyy" data-link-field="dtp_input2" data-link-format="yyyy">
          <input class="form-control" size="16" name="wend" id="wend" type="text" value="">
        <!--  <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span> -->
	 <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div>
</div>
        </div>
				 <!--  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">开始</label>
                <div class="col-md-9">
                <input size="16" type="text" name="lstart" id="lstart"readonly class="form_datetime">                    
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">结束</label>
                <div class="col-md-9">
                    <input size="16" type="text"  name="lend" id="lend" readonly class="form_datetime">
                </div>
            </div>
        </div> -->
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">公司情况</label>
                <div class="col-md-9">
                    <input type="text" name="wcompany" id="wcompany"  class="form-control"/>
                </div>
            </div>
        </div>
				  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">职位</label>
                <div class="col-md-9">
                    <input type="text" name="wrank" id="wrank"  class="form-control"/>
                </div>
            </div>
        </div>
         <div style="text-align: center">
                	<input type="button" name="button5" id="insertBtn1" value="增加工作经历" class="btn btn-primary">
                    <input type="button" name="button6" id="updateBtn1" value="修改工作经历" class="btn btn-primary" disabled>
                    <input type="button" name="button7" id="deleteBtn1" value="删除工作经历" class="btn btn-primary" disabled>
                    <input type="button" name="button8" id="clearBtn1" value="清空" class="btn btn-primary">
                </div>    
      
        </form></div></div></div>
				  </div>
				 
			</div>  
		  
	   </div>
	  <div class="clearfix"> </div>

    </div>
</div>

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>


<script type="text/javascript">
	
	function tabChangeFunc(event){
		var id = event.id;
		var click_button_list = document.getElementById('tag_btnList').getElementsByTagName('div');
		var click_h3_list = document.getElementById('tag_btnList').getElementsByTagName('h3');
		var click_tag_list = document.getElementById('myTabContent').children;
		
		
		for(var i=0; i<click_button_list.length; i++)
		{
			
			if(click_button_list[i].id == id)
			{
				click_h3_list[i].className = 'tag_btn_active';
			}else{
				click_h3_list[i].className = '';
			}
		}

		for(var j=0; j<click_tag_list.length; j++)
		{
			
			if( click_tag_list[j].nodeName == 'DIV')
			{
				if(  click_tag_list[j].id == (id + '_tab') )
				{
					click_tag_list[j].className = 'tab-pane fade in active';
				}else{
					click_tag_list[j].className = 'tab-pane fade in';
				}
			}
			
		}

	}
	

</script>

<script type="text/javascript">
    
	$('.form_date').datetimepicker({
        language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 4,
		minView: 4,
		forceParse: 0
    });
	
</script>
</body>
</html>	