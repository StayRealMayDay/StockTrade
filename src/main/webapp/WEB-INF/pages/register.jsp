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
<title>注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />
<!--  <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> 
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<style type="text/css">
label.col-md-2.control-lable {
    text-align: right;
}</style>
</head>

<body>
<script>
window.onload=function(){
	
		$("#company").css("display","none");
		$("#workyear").css("display","none");
	
};
function onchangeSelect(){
	creater_seniority = $("#creater_seniority").val();
	/* alert(creater_seniority); */
	if(creater_seniority == '有工作经验'){
		$("#company").css("display","");
		$("#workyear").css("display","");
	}
	else{
		
		$("#company").css("display","none");
		$("#workyear").css("display","none");
	}
};
var flagName = 0;
function checkName1(){
	var name=$("#creater_name").val();
    var regName=/^[a-zA-Z]\w{3,15}$/;
    if(name == ""){
    	$("#prompt_creater_name").html("用户名不能为空！");
    	$("#prompt_creater_name").css("display","inline");
        $("#prompt_creater_name").css("color","red"); 
        $("#prompt_creater_name").css("font-size","14px");
      	return false;
    }else if(!regName.test(name)){
    	$("#prompt_creater_name").html("以英文字母开头,英文字母和数字组成,4-16位");
    	$("#prompt_creater_name").css("display","inline");
        $("#prompt_creater_name").css("color","red"); 
        $("#prompt_creater_name").css("font-size","14px");
      	return false;
    }else{
    	$.ajax({
			type : 'post',
			url : 'getNameValidation?u_name='+name,
			success : function (msg){
				if(msg == 'failure'){//用户不存在
					$("#prompt_creater_name").css("display","inline");
					$("#prompt_creater_name").html("");
					flagName = 1;
				}else{
					$("#prompt_creater_name").html("用户名已存在！请重输");
					$("#prompt_creater_name").css("display","inline");
					$("#prompt_creater_name").css("color","red");
					$("#prompt_creater_name").css("font-size","14px");
				}
			}
		});
    	if(flagName == 1){
			return true;
		}
		return false;
    } 
};

function checkRealName1(){
	var rname=$("#creater_realname").val();
	if(rname==""){
		$("#prompt_creater_realname").html("请输入真实姓名");
	}else{
		$("#prompt_creater_realname").html("");
		return true;}
	$("#prompt_creater_realname").css("display","inline");
		$("#prompt_creater_realname").css("color","red");
		$("#prompt_creater_realname").css("font-size","14px");
		return false;
};
function checkAge1(){
	var age=$("#creater_age").val();
	var regage=/^\d+$/;
	if(age==""){
		$("#prompt_creater_age").html("请输入年龄");}
		else if(!regage.test(age)){
			$("#prompt_creater_age").html("请输入数字");
			
		}else{
			$("#prompt_creater_age").html("");
			return true;
		}
		$("#prompt_creater_age").css("display","inline");
			$("#prompt_creater_age").css("color","red");
			$("#prompt_creater_age").css("font-size","14px");
			return false;
	};
	function checkps1(){
		var ps=$("#creater_pwd").val();
		var regps = /^[a-zA-Z0-9]{6,12}$/;
		 
		if(ps == ""){
	    	$("#prompt_creater_pwd").html("请输入密码");
	    }
		else if(!regps.test(ps)){
			$("#prompt_creater_pwd").html("密码为6-12位的数字和字母");
			
		}else{
			$("#prompt_creater_pwd").html("");
			return true;
		}
		$("#prompt_creater_pwd").css("display","inline");
			$("#prompt_creater_pwd").css("color","red");
			$("#prompt_creater_pwd").css("font-size","14px");
			return false;
	}
	
	function checkcps1(){
	    var ps=$("#creater_pwd").val();
	    var cps=$("#creater_check_pwd").val();
	    
	    if(cps == ""){
	    	$("#prompt_creater_cps").html("请重复密码");
	    }else if(ps != cps){
	    	$("#prompt_creater_cps").html("密码不一致");
  		}else{
  			$("#prompt_creater_cps").html("");
  			return true;
  		}
	    $("#prompt_creater_cps").css("display","inline");
			$("#prompt_creater_cps").css("color","red");
			$("#prompt_creater_cps").css("font-size","14px");
			return false;
	}

	var flag = 0;
	function checkEmail1(){
			var email=$("#creater_email").val();
		var regEmail = /^\w+@\w+\.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/;
		if(!regEmail.test(email)){//邮箱格式的验证
			$("#prompt_creater_email").html("邮箱格式不正确");
  			$("#prompt_creater_email").css("display","inline");
  			$("#prompt_creater_email").css("color","red");
  			$("#prompt_creater_email").css("font-size","14px");
  			return false;
		}else{//邮箱是否存在的验证
			$.ajax({
				type : 'post',
				url : 'getEmailValidation?u_email='+email,
				success : function (msg){
					if(msg == 'success'){//不存在
						$("#prompt_creater_email").css("display","inline");
						$("#prompt_creater_email").html("");
						flag = 1;
					}else{
						$("#prompt_creater_email").css("display","inline");
						$("#prompt_creater_email").html("邮箱已存在！请重输");
						$("#prompt_creater_email").css("color","red");
						$("#prompt_creater_email").css("font-size","14px");
						
					}
				}
			}); 
			if(flag == 1){
				return true;
			}
			return false;
		}
		}
	
	
	var flagName = 0;
	function checkName2(){
		var name=$("#financer_name").val();
	    var regName=/^[a-zA-Z]\w{3,15}$/;
	    if(name == ""){
	    	$("#prompt_financer_name").html("用户名不能为空！");
	    	$("#prompt_financer_name").css("display","inline");
	        $("#prompt_financer_name").css("color","red"); 
	        $("#prompt_financer_name").css("font-size","14px");
	      	return false;
	    }else if(!regName.test(name)){
	    	$("#prompt_financer_name").html("以英文字母开头,英文字母和数字组成,4-16位");
	    	$("#prompt_financer_name").css("display","inline");
	        $("#prompt_financer_name").css("color","red"); 
	        $("#prompt_financer_name").css("font-size","14px");
	      	return false;
	    }else{
	    	$.ajax({
				type : 'post',
				url : 'getNameValidation?u_name='+name,
				success : function (msg){
					if(msg == 'failure'){//用户不存在
						$("#prompt_financer_name").css("display","inline");
						$("#prompt_financer_name").html("");
						flagName = 1;
					}else{
						$("#prompt_financer_name").html("用户名已存在！请重输");
						$("#prompt_financer_name").css("display","inline");
						$("#prompt_financer_name").css("color","red");
						$("#prompt_financer_name").css("font-size","14px");
					}
				}
			});
	    	if(flagName == 1){
				return true;
			}
			return false;
	    } 
	};

	function checkRealName2(){
		var rname=$("#financer_realname").val();
		if(rname==""){
			$("#prompt_financer_realname").html("请输入真实姓名");
		}else{
			$("#prompt_financer_realname").html("");
			return true;}
		$("#prompt_financer_realname").css("display","inline");
			$("#prompt_financer_realname").css("color","red");
			$("#prompt_financer_realname").css("font-size","14px");
			return false;
	};
	function checkAge2(){
		var age=$("#financer_age").val();
		var regage=/^\d+$/;
		if(age==""){
			$("#prompt_financer_age").html("请输入年龄");}
			else if(!regage.test(age)){
				$("#prompt_financer_age").html("请输入数字");
				
			}else{
				$("#prompt_financer_age").html("");
				return true;
			}
			$("#prompt_financer_age").css("display","inline");
				$("#prompt_financer_age").css("color","red");
				$("#prompt_financer_age").css("font-size","14px");
				return false;
		};
		function checkps2(){
			var ps=$("#financer_pwd").val();
			var regps = /^[a-zA-Z0-9]{6,12}$/;
			 
			if(ps == ""){
		    	$("#prompt_financer_pwd").html("请输入密码");
		    }
			else if(!regps.test(ps)){
				$("#prompt_financer_pwd").html("密码为6-12位的数字和字母");
				
			}else{
				$("#prompt_financer_pwd").html("");
				return true;
			}
			$("#prompt_financer_pwd").css("display","inline");
				$("#prompt_financer_pwd").css("color","red");
				$("#prompt_financer_pwd").css("font-size","14px");
				return false;
		}
		
		function checkcps2(){
		    var ps=$("#financer_pwd").val();
		    var cps=$("#financer_check_pwd").val();
		    
		    if(cps == ""){
		    	$("#prompt_financer_cps").html("请重复密码");
		    }else if(ps != cps){
		    	$("#prompt_financer_cps").html("密码不一致");
	  		}else{
	  			$("#prompt_financer_cps").html("");
	  			return true;
	  		}
		    $("#prompt_financer_cps").css("display","inline");
				$("#prompt_financer_cps").css("color","red");
				$("#prompt_financer_cps").css("font-size","14px");
				return false;
		}

		var flag = 0;
		function checkEmail2(){
				var email=$("#financer_email").val();
			var regEmail = /^\w+@\w+\.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/;
			if(!regEmail.test(email)){//邮箱格式的验证
				$("#prompt_financer_email").html("邮箱格式不正确");
	  			$("#prompt_financer_email").css("display","inline");
	  			$("#prompt_financer_email").css("color","red");
	  			$("#prompt_financer_email").css("font-size","14px");
	  			return false;
			}else{//邮箱是否存在的验证
				$.ajax({
					type : 'post',
					url : 'getEmailValidation?u_email='+email,
					success : function (msg){
						if(msg == 'success'){//不存在
							$("#prompt_financer_email").css("display","inline");
							$("#prompt_financer_email").html("");
							flag = 1;
						}else{
							$("#prompt_financer_email").css("display","inline");
							$("#prompt_financer_email").html("邮箱已存在！请重输");
							$("#prompt_financer_email").css("color","red");
							$("#prompt_financer_email").css("font-size","14px");
							
						}
					}
				}); 
				if(flag == 1){
					return true;
				}
				return false;
			}
			}
		
		
		var flagName = 0;
		function checkName3(){
			var name=$("#expert_name").val();
		    var regName=/^[a-zA-Z]\w{3,15}$/;
		    if(name == ""){
		    	$("#prompt_expert_name").html("用户名不能为空！");
		    	$("#prompt_expert_name").css("display","inline");
		        $("#prompt_expert_name").css("color","red"); 
		        $("#prompt_expert_name").css("font-size","14px");
		      	return false;
		    }else if(!regName.test(name)){
		    	$("#prompt_expert_name").html("以英文字母开头,英文字母和数字组成,4-16位");
		    	$("#prompt_expert_name").css("display","inline");
		        $("#prompt_expert_name").css("color","red"); 
		        $("#prompt_expert_name").css("font-size","14px");
		      	return false;
		    }else{
		    	$.ajax({
					type : 'post',
					url : 'getNameValidation?u_name='+name,
					success : function (msg){
						if(msg == 'failure'){//用户不存在
							$("#prompt_expert_name").css("display","inline");
							$("#prompt_expert_name").html("");
							flagName = 1;
						}else{
							$("#prompt_expert_name").html("用户名已存在！请重输");
							$("#prompt_expert_name").css("display","inline");
							$("#prompt_expert_name").css("color","red");
							$("#prompt_expert_name").css("font-size","14px");
						}
					}
				});
		    	if(flagName == 1){
					return true;
				}
				return false;
		    } 
		};

		function checkRealName3(){
			var rname=$("#expert_realname").val();
			if(rname==""){
				$("#prompt_expert_realname").html("请输入真实姓名");
			}else{
				$("#prompt_expert_realname").html("");
				return true;}
			$("#prompt_expert_realname").css("display","inline");
				$("#prompt_expert_realname").css("color","red");
				$("#prompt_expert_realname").css("font-size","14px");
				return false;
		};
		function checkAge3(){
			var age=$("#expert_age").val();
			var regage=/^\d+$/;
			if(age==""){
				$("#prompt_expert_age").html("请输入年龄");}
				else if(!regage.test(age)){
					$("#prompt_expert_age").html("请输入数字");
					
				}else{
					$("#prompt_expert_age").html("");
					return true;
				}
				$("#prompt_expert_age").css("display","inline");
					$("#prompt_expert_age").css("color","red");
					$("#prompt_expert_age").css("font-size","14px");
					return false;
			};
			function checkps3(){
				var ps=$("#expert_pwd").val();
				var regps = /^[a-zA-Z0-9]{6,12}$/;
				 
				if(ps == ""){
			    	$("#prompt_expert_pwd").html("请输入密码");
			    }
				else if(!regps.test(ps)){
					$("#prompt_expert_pwd").html("密码为6-12位的数字和字母");
					
				}else{
					$("#prompt_expert_pwd").html("");
					return true;
				}
				$("#prompt_expert_pwd").css("display","inline");
					$("#prompt_expert_pwd").css("color","red");
					$("#prompt_expert_pwd").css("font-size","14px");
					return false;
			}
			
			function checkcps3(){
			    var ps=$("#expert_pwd").val();
			    var cps=$("#expert_check_pwd").val();
			    
			    if(cps == ""){
			    	$("#prompt_expert_cps").html("请重复密码");
			    }else if(ps != cps){
			    	$("#prompt_expert_cps").html("密码不一致");
		  		}else{
		  			$("#prompt_expert_cps").html("");
		  			return true;
		  		}
			    $("#prompt_expert_cps").css("display","inline");
					$("#prompt_expert_cps").css("color","red");
					$("#prompt_expert_cps").css("font-size","14px");
					return false;
			}

			var flag = 0;
			function checkEmail3(){
					var email=$("#expert_email").val();
				var regEmail = /^\w+@\w+\.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/;
				if(!regEmail.test(email)){//邮箱格式的验证
					$("#prompt_expert_email").html("邮箱格式不正确");
		  			$("#prompt_expert_email").css("display","inline");
		  			$("#prompt_expert_email").css("color","red");
		  			$("#prompt_expert_email").css("font-size","14px");
		  			return false;
				}else{//邮箱是否存在的验证
					$.ajax({
						type : 'post',
						url : 'getEmailValidation?u_email='+email,
						success : function (msg){
							if(msg == 'success'){//不存在
								$("#prompt_expert_email").css("display","inline");
								$("#prompt_expert_email").html("");
								flag = 1;
							}else{
								$("#prompt_expert_email").css("display","inline");
								$("#prompt_expert_email").html("邮箱已存在！请重输");
								$("#prompt_expert_email").css("color","red");
								$("#prompt_expert_email").css("font-size","14px");
								
							}
						}
					}); 
					if(flag == 1){
						return true;
					}
					return false;
				}
				}
		
		
		function validation1(){
			if(checkName1() && checkps1() && checkcps1() && checkEmail1() && checkRealName1() && checkAge1()){
				return true;
			}else{
				return false;
			}
		}
		function validation2(){
			if(checkName2() && checkps2() && checkcps2() && checkEmail2() && checkRealName2() && checkAge2()){
				return true;
			}else{
				return false;
			}
		}
		function validation3(){
			if(checkName3() && checkps3() && checkcps3() && checkEmail3() && checkRealName3() && checkAge3()){
				return true;
			}else{
				return false;
			}
		}
</script>

<jsp:include page="/u_top.jsp"></jsp:include>


<div class="container">
    <div class="single">  
    	   <div class="col-md-12 single_right">
	      <div class="but_list">
	       <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">创业者</a></li>
			  <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">基金经理</a></li>
			  <li role="presentation"><a href="#expert" role="tab" id="expert-tab" data-toggle="tab" aria-controls="expert">评审专家</a></li>
		   </ul>
		<div id="myTabContent" class="tab-content">
		  <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
		    <div class="form-container">
		      </br>
        <h2>创业者注册</h2>
        <form role="form" id="form1" action="createrRegister" method="post" onsubmit="return validation1();">
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="firstName">用户名</label>
                <div class="col-md-9">
                    <input type="text" name="creater_name" id="creater_name" onblur="checkName1()" placeholder="以英文字母开头,英文字母和数字组成,4-16位..." class="form-control"/>
                    <label id="prompt_creater_name" style="font-size:9px;display:none;"></label>
                </div>
            </div>
         </div><div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">密码</label>
                <div class="col-md-9">
                    <input type="password" name="creater_pwd" id="creater_pwd" onblur="checkps1()" placeholder="请输入你的密码，密码为6-12位的数字和字母..." class="form-control input-sm"/>
                    <label id="prompt_creater_pwd" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">确认密码</label>
                <div class="col-md-9">
                    <input type="password" name="creater_check_pwd" id="creater_check_pwd" onblur="checkcps1()" class="form-control input-sm"/>
                    <label id="prompt_creater_cps" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">姓名</label>
                <div class="col-md-9">
                    <input type="text" name="creater_realname" id="creater_realname" onblur="checkRealName1()" class="form-control input-sm"/>
                    <label id="prompt_creater_realname" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">年龄</label>
                <div class="col-md-9">
                    <input type="text" name="creater_age" id="creater_age" onblur="checkAge1()" class="form-control input-sm"/>
                    <label id="prompt_creater_age" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="sex">性别</label>
                <div class="col-md-9" class="form-control input-sm">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="creater_gender" name="creater_gender" value="男" checked=""> 男
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="creater_gender" name="creater_gender" value="女"> 女
				        </label>
	                </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">学历</label>
                <div class="col-md-9">
                    <select name="creater_edu" id="creater_edu" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${edulist}" var="edu">
                        <option value="${edu.ddValue}">${edu.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">E-mail</label>
                <div class="col-md-9">
                    <input type="text" name="creater_email" id="creater_email" onblur="checkEmail1()" class="form-control input-sm"/>
                    <label id="prompt_creater_email" style="display:none;font-size:9px;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">研究方向</label>
                <div class="col-md-9">
                    <input type="text" name="creater_research" id="creater_research" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">科研情况</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="creater_scientific" id="creater_scientific" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">所获奖项</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="creater_price" id="creater_price" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="country">工作资历</label>
                <div class="col-md-9">
                    <select name="creater_seniority" id="creater_seniority" onchange="onchangeSelect();" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${senioritylist}" var="seniority">
                        <option value="${seniority.ddValue}">${seniority.ddValue}</option>
                        </c:forEach>  
                    </select>
                    
                </div>
            </div>
        </div>
        <div id="company" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">所属公司</label>
                <div class="col-md-9">
                    <input type="text" name="creater_company" id="creater_company" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div id="workyear" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">工作年限</label>
                <div class="col-md-9">
                    <select name="creater_workyear" id="creater_workyear" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${workyearlist}" var="workyear">
                        <option value="${workyear.ddValue}">${workyear.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">感兴趣领域</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="creater_area" id="creater_area" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">自我介绍</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="creater_brief" id="creater_brief" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="注册" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
     </br>
    </div>
			
			 
		  </div>
		  <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
		  </br>
		    <div class="form-container">
        <h2>基金经理注册</h2>
        <form role="form" id="form2" action="financerRegister" method="post" onsubmit="return validation2();" >
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="firstName">用户名</label>
                <div class="col-md-9">
                    <input type="text" name="financer_name" id="financer_name" onblur="checkName2()" placeholder="以英文字母开头,英文字母和数字组成,4-16位..." class="form-control input-sm"/>
                    <label id="prompt_financer_name" style="font-size:9px;display:none;"></label>
                </div>
            </div>
         </div><div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">密码</label>
                <div class="col-md-9">
                    <input type="password" name="financer_pwd" id="financer_pwd" onblur="checkps2()" placeholder="请输入你的密码，密码为6-12位的数字和字母..." class="form-control input-sm"/>
                    <label id="prompt_financer_pwd" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">确认密码</label>
                <div class="col-md-9">
                    <input type="password" name="financer_check_pwd" id="financer_check_pwd" onblur="checkcps2()" class="form-control input-sm"/>
                    <label id="prompt_financer_cps" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">姓名</label>
                <div class="col-md-9">
                    <input type="text" name="financer_realname" id="financer_realname" onblur="checkRealName2()" class="form-control input-sm"/>
                    <label id="prompt_financer_realname" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">年龄</label>
                <div class="col-md-9">
                    <input type="text" name="financer_age" id="financer_age" onblur="checkAge2()" class="form-control input-sm"/>
                    <label id="prompt_financer_age" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="sex">性别</label>
                <div class="col-md-9" class="form-control input-sm">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="financer_gender" name="financer_gender" checked=""> 男
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="financer_gender" name="financer_gender"> 女
				        </label>
	                </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">学历</label>
                <div class="col-md-9">
                    <select name="financer_edu" id="financer_edu" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${edulist}" var="edu">
                        <option value="${edu.ddValue}">${edu.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">E-mail</label>
                <div class="col-md-9">
                    <input type="text" name="financer_email" id="financer_email" onblur="checkEmail2()" class="form-control input-sm"/>
                    <label id="prompt_financer_email" style="font-size:9px;display:none;"></label>
                </div>
                
            </div>
        </div>
       
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">所属公司</label>
                <div class="col-md-9">
                    <input type="text" name="financer_company" id="financer_company" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">工作年限</label>
                <div class="col-md-9">
                    <select name="financer_workyear" id="financer_workyear" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${workyearlist}" var="workyear">
                        <option value="${workyear.ddValue}">${workyear.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">感兴趣领域</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="financer_area" id="financer_area" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">自我介绍</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="financer_brief" id="financer_brief" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="注册" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
     </br>
    </div>
		  </div>
		  
		  <div role="tabpanel" class="tab-pane fade" id="expert" aria-labelledby="expert-tab">
		    <div class="form-container">
		      </br>
        <h2>评审专家注册</h2>
        <form role="form" id="form3" action="expertRegister" method="post" onsubmit="return validation3();">
          <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="firstName">用户名</label>
                <div class="col-md-9">
                    <input type="text" name="expert_name" id="expert_name" onblur="checkName3()" placeholder="以英文字母开头,英文字母和数字组成,4-16位..." class="form-control"/>
                    <label id="prompt_expert_name" style="font-size:9px;display:none;"></label>
                </div>
            </div>
         </div><div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">密码</label>
                <div class="col-md-9">
                    <input type="password" name="expert_pwd" id="expert_pwd" onblur="checkps3()" placeholder="请输入你的密码，密码为6-12位的数字和字母..." class="form-control input-sm"/>
                    <label id="prompt_expert_pwd" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">确认密码</label>
                <div class="col-md-9">
                    <input type="password" name="expert_check_pwd" id="expert_check_pwd" onblur="checkcps3()" class="form-control input-sm"/>
                    <label id="prompt_expert_cps" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">姓名</label>
                <div class="col-md-9">
                    <input type="text" name="expert_realname" id="expert_realname" onblur="checkRealName3()" class="form-control input-sm"/>
                    <label id="prompt_expert_realname" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="lastName">年龄</label>
                <div class="col-md-9">
                    <input type="text" name="expert_age" id="expert_age" onblur="checkAge3()" class="form-control input-sm"/>
                    <label id="prompt_expert_age" style="font-size:9px;display:none;"></label>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="sex">性别</label>
                <div class="col-md-9" class="form-control input-sm">
                    <div class="radios">
				        <label for="radio-01" class="label_radio">
				            <input type="radio" id="expert_gender" name="expert_gender" value="男" checked=""> 男
				        </label>
				        <label for="radio-02" class="label_radio">
				            <input type="radio" id="expert_gender" name="expert_gender" value="女"> 女
				        </label>
	                </div>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">学历</label>
                <div class="col-md-9">
                    <select name="expert_edu" id="expert_edu" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${edulist}" var="edu">
                        <option value="${edu.ddValue}">${edu.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">E-mail</label>
                <div class="col-md-9">
                    <input type="text" name="expert_email" id="expert_email" onblur="checkEmail3()" class="form-control input-sm"/>
                    <label id="prompt_expert_email" style="display:none;font-size:9px;"></label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">研究方向</label>
                <div class="col-md-9">
                    <input type="text" name="expert_research" id="expert_research" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">科研情况</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="expert_scientific" id="expert_scientific" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">所获奖项</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="expert_price" id="expert_price" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="country">工作资历</label>
                <div class="col-md-9">
                    <select name="expert_seniority" id="expert_seniority" onchange="onchangeSelect();" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${senioritylist}" var="seniority">
                        <option value="${seniority.ddValue}">${seniority.ddValue}</option>
                        </c:forEach>  
                    </select>
                    
                </div>
            </div>
        </div>
        <div id="company" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="email">所属公司</label>
                <div class="col-md-9">
                    <input type="text" name="expert_company" id="expert_company" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div id="workyear" class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable">工作年限</label>
                <div class="col-md-9">
                    <select name="expert_workyear" id="expert_workyear" class="form-control input-sm">
                        <option value="">请选择</option>
                        <c:forEach items="${workyearlist}" var="workyear">
                        <option value="${workyear.ddValue}">${workyear.ddValue}</option>
                        </c:forEach>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">感兴趣领域</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="expert_area" id="expert_area" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-2 control-lable" for="subjects">自我介绍</label>
                <div class="col-md-9 sm_1">
                   <textarea cols="77" rows="6" value=" " name="expert_brief" id="expert_brief" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                    
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="注册" class="btn btn-primary btn-sm">
            </div>
        </div>
    </form>
     </br>
    </div>
			
			 
		  </div>
		  
	  </div>
     </div>
    </div>
    
   </div>
	   
 </div>
</div>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

</body>
</html>	