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
<title>科技成果产业化评价系统管理端|增加用户</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="/ad_head.jsp" flush="true" />
</head>
<body>
	<script type="text/javascript">
function onchangeSelect(){
	identify = $("#identify").val();
	if(identify == 0){//创业者
		$("#userArea").css("display","");
		$("#userSeniority").css("display","");
		$("#userEdu").css("display","");
		$("#userScientific").css("display","");
		$("#userCompany").css("display","none");
		$("#userWorkyear").css("display","none");
		$("#userResearch").css("display","none");
	}
	if(identify == 1){
		//基金经理
		$("#userArea").css("display","none");
		$("#userSeniority").css("display","none");
		$("#userEdu").css("display","none");
		$("#userScientific").css("display","none");
		$("#userCompany").css("display","");
		$("#userWorkyear").css("display","");
		$("#userResearch").css("display","");
	}
	if(identify == 2){
		//基金经理
		$("#userArea").css("display","none");
		$("#userSeniority").css("display","none");
		$("#userEdu").css("display","none");
		$("#userScientific").css("display","none");
		$("#userCompany").css("display","none");
		$("#userWorkyear").css("display","none");
		$("#userResearch").css("display","none");
	}
}
	function validation(){
		if(checkName() && checkps() && checkcps() && checkEmail()&&checkAge()){
			return true;
		}else{
			return false;
		}
	} 
	
	var flagName = 0;
	function checkName(){
		var name=$("#userName1").val();
	    var regName=/^[a-zA-Z]\w{3,15}$/;
	    if(name == ""){
	    	$("#prompt_name").html("用户名不能为空！");
	    	$("#prompt_name").css("display","inline");
	        $("#prompt_name").css("color","red"); 
	        $("#prompt_name").css("font-size","16px");
	      	return false;
	    }else if(!regName.test(name)){
	    	$("#prompt_name").html("以英文字母开头,英文字母和数字组成,4-16位");
	    	$("#prompt_name").css("display","inline");
	        $("#prompt_name").css("color","red"); 
	        $("#prompt_name").css("font-size","16px");
	      	return false;
	    }else{
	    	$.ajax({
				type : 'post',
				url : 'getNameValidation?userName='+name,
				success : function (msg){
					if(msg == 'failure'){//用户不存在
						$("#prompt_name").css("display","inline");
						$("#prompt_name").html("");
						flagName = 1;
					}else{
						$("#prompt_name").html("用户名已存在！请重输");
						$("#prompt_name").css("display","inline");
						$("#prompt_name").css("color","red");
						$("#prompt_name").css("font-size","16px");
					}
				}
			});
	    	if(flagName == 1){
				return true;
			}
			return false;
	    } 
	}
	
	function checkRealName(){
		var rname=$("#userRealname1").val();
		if(rname==""){
			$("#prompt_realname").html("请输入真实姓名");
		}else{
			$("#prompt_realname").html("");
			return true;}
		$("#prompt_realname").css("display","inline");
			$("#prompt_realname").css("color","red");
			$("#prompt_realname").css("font-size","16px");
			return false;
	}
	
	
	
	function checkAge(){
		var age=$("#userAge1").val();
		var regage=/^\d+$/;
		if(age==""){
			$("#prompt_age").html("请输入年龄");}
			else if(!regage.test(age)){
				$("#prompt_age").html("请输入数字");
				
			}else{
				$("#prompt_age").html("");
				return true;
			}
			$("#prompt_age").css("display","inline");
  			$("#prompt_age").css("color","red");
  			$("#prompt_age").css("font-size","16px");
  			return false;
		}
	
	function checkExe(){
		var exe=$("#userWorkyear1").val();
		var regexe=/\d/;
		if(exe==""){
			$("#prompt_exe").html("请输入工作年限");}
			else if(!regexe.test(exe)){
				$("#prompt_exe").html("请输入数字");
				
			}else{
				$("#prompt_exe").html("");
				return true;
			}
			$("#prompt_exe").css("display","inline");
  			$("#prompt_exe").css("color","red");
  			$("#prompt_exe").css("font-size","16px");
  			return false;
		}
	function checkExq(){
		var exq=$("#ex_qualification").val();
		if(exq==""){
			$("#prompt_exq").html("请输入级别");
		}else{
			$("#prompt_exq").html("");
			return true;}
		$("#prompt_exq").css("display","inline");
			$("#prompt_exq").css("color","red");
			$("#prompt_exq").css("font-size","16px");
			return false;
	}
	
	function checkExb(){
		var exb=$("#ex_businessfield").val();
		if(exb==""){
			$("#prompt_exb").html("请输入业务擅长领域");
		}else{
			$("#prompt_exb").html("");
			return true;}
		$("#prompt_exb").css("display","inline");
			$("#prompt_exb").css("color","red");
			$("#prompt_exb").css("font-size","16px");
			return false;
	}
	
	function checkRpq(){
		var rpq=$("#userSeniority1").val();
		if(rpq==""){
			$("#prompt_rpq").html("请输入资历");
		}else{
			$("#prompt_rpq").html("");
			return true;}
		$("#prompt_rpq").css("display","inline");
			$("#prompt_rpq").css("color","red");
			$("#prompt_rpq").css("font-size","16px");
			return false;
	}
	
	function checkRpf(){
		var rpf=$("#rp_field").val();
		if(rpf==""){
			$("#userResearch1").html("请输入研究方向");
		}else{
			$("#prompt_rpf").html("");
			return true;}
		$("#prompt_rpf").css("display","inline");
			$("#prompt_rpf").css("color","red");
			$("#prompt_rpf").css("font-size","16px");
			return false;
	}
	
/* 	function checkRpr(){
		var rpr=$("#rp_research").val();
		if(rpr==""){
			$("#prompt_rpr").html("请输入科研情况");
		}else{
			$("#prompt_rpr").html("");
			return true;}
		$("#prompt_rpr").css("display","inline");
			$("#prompt_rpr").css("color","red");
			$("#prompt_rpr").css("font-size","16px");
			return false;
	} */
	
	function checkps(){
		var ps=$("#userPwd11").val();
		var regps = /^[a-zA-Z0-9]{6,12}$/;
		 
		if(ps == ""){
	    	$("#prompt_ps").html("请输入密码");
	    }
		else if(!regps.test(ps)){
			$("#prompt_ps").html("密码为6-12位的数字和字母");
			
		}else{
			$("#prompt_ps").html("");
			return true;
		}
		$("#prompt_ps").css("display","inline");
			$("#prompt_ps").css("color","red");
			$("#prompt_ps").css("font-size","16px");
			return false;
	}
	
	function checkcps(){
	    var ps=$("#userPwd11").val();
	    var cps=$("#userPwd22").val();
	    
	    if(cps == ""){
	    	$("#prompt_cps").html("请重复密码");
	    }else if(ps != cps){
	    	$("#prompt_cps").html("密码不一致");
  		}else{
  			$("#prompt_cps").html("");
  			return true;
  		}
	    $("#prompt_cps").css("display","inline");
			$("#prompt_cps").css("color","red");
			$("#prompt_cps").css("font-size","16px");
			return false;
	}

	var flag = 0;
	function checkEmail(){
			var email=$("#userEmail1").val();
		var regEmail = /^\w+@\w+\.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$/;
		if(!regEmail.test(email)){//邮箱格式的验证
			$("#prompt_mail").html("邮箱格式不正确");
  			$("#prompt_mail").css("display","inline");
  			$("#prompt_mail").css("color","red");
  			$("#prompt_mail").css("font-size","16px");
  			return false;
		}else{//邮箱是否存在的验证
			$.ajax({
				type : 'post',
				url : 'getEmailValidation?u_email='+email,
				success : function (msg){
					if(msg == 'success'){//不存在
						$("#prompt_mail").css("display","inline");
						$("#prompt_mail").html("");
						flag = 1;
					}else{
						$("#prompt_mail").css("display","inline");
						$("#prompt_mail").html("邮箱已存在！请重输");
						$("#prompt_mail").css("color","red");
						$("#prompt_mail").css("font-size","16px");
						
					}
				}
			}); 
			if(flag == 1){
				return true;
			}
			return false;
		}
}
</script>
	<!-- HEADER -->
	<jsp:include page="/ad_header.jsp" flush="true" />
	<!--/HEADER -->

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
								aria-hidden="true">&times;</button>
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
										<li><a href="#">用户管理</a></li>
										<li>增加系统用户</li>
									</ul>
									<!-- /BREADCRUMBS -->
									<div class="clearfix">
										<h3 class="content-title pull-left">增加系统用户</h3>
									</div>
									<div class="description">用户包括：创业者、基金经理</div>
								</div>
							</div>
						</div>
						<!-- /PAGE HEADER -->
						<!-- SAMPLE -->
						<div class="row">
							<div class="col-md-12">
								<!-- BOX -->
								<div class="box border " id="formWizard">
									<div class="box-title">
										<h4>
											<i class="fa fa-bars"></i>系统管理员增加系统用户 <span
												class="stepHeader">Step 1 of 3
										</h4>
									</div>
									<div class="box-body form">
										<form id="wizForm" action="userRegister" method="post"
											class="form-horizontal" onsubmit="return validation();">
											<div class="wizard-form">
												<div class="wizard-content">
													<ul class="nav nav-pills nav-justified steps">
														<li><a href="#account" data-toggle="tab"
															class="wiz-step"> <span class="step-number">1</span>
																<span class="step-name"><i class="fa fa-check"></i>
																	用户基本信息 </span>
														</a></li>

														<li><a href="#payment" data-toggle="tab"
															class="wiz-step active"> <span class="step-number">2</span>
																<span class="step-name"><i class="fa fa-check"></i>
																	用户详情</span>
														</a></li>
														<li><a href="#confirm" data-toggle="tab"
															class="wiz-step"> <span class="step-number">3</span>
																<span class="step-name"><i class="fa fa-check"></i>
																	提交 </span>
														</a></li>
													</ul>
													<div id="bar"
														class="progress progress-striped progress-sm active"
														role="progressbar">
														<div class="progress-bar progress-bar-warning"></div>
													</div>
													<div class="tab-content">
														<div class="alert alert-danger display-none">
															<a class="close" aria-hidden="true" href="#"
																data-dismiss="alert">×</a> Your form has errors. Please
															correct them to proceed.
														</div>
														<div class="alert alert-success display-none">
															<a class="close" aria-hidden="true" href="#"
																data-dismiss="alert">×</a> Your form validation is
															successful!
														</div>
														<div class="tab-pane active" id="account">
															<div class="form-group">
																<label class="control-label col-md-3">用户名<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" onblur="checkName()" id="userName1" name="userName"
																		placeholder="请输入您的用户名" onchange="OnInput (event)"/> <span class="error-span"></span>
																	<label id="prompt_name"
																		style="font-size: 9px; display: none;"></label>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">邮箱<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="email" class="form-control" onblur="checkEmail()" id="userEmail1" name="userEmail"
																		onchange="OnInput1 (event)" placeholder="请输入您的邮箱" /> <span class="error-span"></span>
																</div>
																<label id="prompt_mail"
																	style="display: none; font-size: 9px;"></label>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">密码<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="password" id="userPwd11" class="form-control"
																		onblur="checkps()" name="userPwd" placeholder="请输入您的密码" /> <span
																		class="error-span"></span>
																</div>
																<label id="prompt_ps"
																	style="font-size: 9px; display: none;"></label>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">确认密码<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="password" class="form-control"
																		onblur="checkcps()" id="userPwd22" name="userPwd2"  placeholder="请输入您的密码" /> <span
																		class="error-span"></span>
																</div>
																<label id="prompt_cps"
																	style="font-size: 9px; display: none;"></label>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">真实姓名<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" id="userRealname1" name="userRealname"
																		onchange="OnInput3 (event)" placeholder="请输入您的真实姓名" /> <span class="error-span"></span>
																</div>
																<label id="prompt_realname"
																	style="font-size: 9px; display: none;"></label>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">性别<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<label class="radio"> <input type="radio"
																		name="userGender" value="男" data-title="Male"
																		class="uniform" /> 男
																	</label> <label class="radio"> <input type="radio"
																		name="userGender" value="女" data-title="Female"
																		class="uniform" /> 女
																	</label>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">年龄<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" onblur="checkAge()" id="userAge1" name="userAge"
																		onchange="OnInput4 (event)" placeholder="请输入您的年龄" /> <span class="error-span"></span>
																</div>
																<label id="prompt_age"
																	style="font-size: 9px; display: none;"></label>
															</div>

														</div>
														<div class="tab-pane" id="payment">
															<div class="form-group">
																<label class="control-label col-md-3">请选择您要注册的角色身份</label>
																<div class="col-md-4">
																	<select name="userRole" id="identify"
																		class="col-md-12 full-width-fix"
																		onchange="onchangeSelect();">
																		<option id="" value="2" selected="selected">请选择</option>
																		<option id="" value="0">创业者</option>
																		<option id="" value="1">基金经理</option>
																	</select>
																</div>
															</div>
															<!-- 创业者 -->
															<div id="userArea" class="form-group">
																<label class="control-label col-md-3">地区<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" id="userArea1"
																		name="userArea" onchange="OnInput5 (event)" placeholder="请输入您所在的地区" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}" /> <span
																		class="error-span"></span>
																</div>
															</div>
															<div id="userSeniority" class="form-group">
																<label class="control-label col-md-3">工作资历<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" placeholder="请输入您的工作资历" id="userSeniority1"
																		class="form-control" name="userSeniority" onchange="OnInput6 (event)" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"/> <span
																		class="error-span"></span>
																</div>
															</div>
															<div class="form-group">
																<label class="control-label col-md-3">学历</label>
																<div class="col-md-4">
																	<select name="userEdu" id="userEdu1"
																		class="col-md-12 full-width-fix">
																		<option value="博士以上">博士以上</option>
																		<option value="博士">博士</option>
																		<option value="硕士">硕士</option>
																		<option value="本科">本科</option>
																		<option value="本科以下">本科以下</option>
																	</select>
																</div>
															</div>
															<div id="userScientific" class="form-group">
																<label class="control-label col-md-3">学科专业<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" placeholder="请输入您的学科专业"
																		onchange="OnInput7 (event)" class="form-control" name="userScientific" id="userScientific1" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"/> <span
																		class="error-span"></span>
																</div>
															</div>
															<!-- 基金经理 -->

															<div id="userCompany" class="form-group">
																<label class="control-label col-md-3">所属公司<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" placeholder="请输入您所在的公司名称"
																		onchange="OnInput8 (event)" maxlength="7" class="form-control"
																		name="userCompany" id="userCompany1" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"/> <span class="error-span"></span>
																</div>
															</div>
															<div id="userWorkyear" class="form-group">
																<label class="control-label col-md-3">工作年限<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" onchange="OnInput9 (event)"
																		id="userWorkyear1" name="userWorkyear" placeholder="请输入您的工作年限" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}"/> <span
																		class="error-span"></span>
																</div>
																<label id="prompt_exe"
																	style="font-size: 9px; display: none;"></label>
															</div>
															<div id="userResearch" class="form-group">
																<label class="control-label col-md-3">感兴趣领域<span
																	class="required">*</span></label>
																<div class="col-md-4">
																	<input type="text" class="form-control" id="userResearch1" onchange="OnInput10 (event)"
																		name="userResearch" placeholder="请输入您感兴趣的领域" onfocus="this.value='';"  onblur="if (this.value == '') {this.value = '';}" /> <span
																		class="error-span"></span>
																</div>
																<label id="prompt_rpf"
																	style="font-size: 9px; display: none;"></label>
															</div>
														</div>

														<div class="tab-pane" id="confirm">
															<h3 class="block">提交用户信息详情</h3>
															<h4 class="form-section">基本信息</h4>
															<div class="well">
																<div class="form-group">
																	<label class="control-label col-md-3">用户名:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="userName" id="userName2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">邮箱:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="email" id="userEmail2"></p>
																	</div>
																</div>
																<!-- <div class="form-group">
																	<label class="control-label col-md-3">密码:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="email" id="password2"></p>
																	</div>
																</div> -->
																<div class="form-group">
																	<label class="control-label col-md-3">真实姓名:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="fullname" id="userRealname2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">性别:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="gender" id="userGender2"></p>
																	</div>
																</div>
													
																<div class="form-group">
																	<label class="control-label col-md-3">年龄:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="fullname" id="userAge2"></p>
																	</div>
																</div>

															</div>
															<h4 class="form-section">用户详情信息</h4>
															<div class="well">
																<div class="form-group">
																	<label class="control-label col-md-3">地区:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_number" id="userArea2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">工作资历:</label>
																	<div class="col-md-4">
																		<p class="form-control-static" data-display="card_cvc" id="userSeniority2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">学历:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_expiry_date" id="userEdu2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">学科专业:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_name" id="userScientific2"></p>
																	</div>
																</div>

																<div class="form-group">
																	<label class="control-label col-md-3">所属公司:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_name" id="userCompany2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">工作年限:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_name" id="userWorkyear2"></p>
																	</div>
																</div>
																<div class="form-group">
																	<label class="control-label col-md-3">感兴趣领域:</label>
																	<div class="col-md-4">
																		<p class="form-control-static"
																			data-display="card_name" id="userResearch2"></p>
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="wizard-buttons">
													<div class="row">
														<div class="col-md-12">
															<div class="col-md-offset-3 col-md-9">
																<a href="javascript:;" class="btn btn-default prevBtn">
																	<i class="fa fa-arrow-circle-left"></i> 返回
																</a> <a href="javascript:;" class="btn btn-primary nextBtn">
																	继续 <i class="fa fa-arrow-circle-right"></i>
																</a>  <!-- <a href="javascript:void(document.form.submit())"
																	class="btn btn-success submitBtn"> 提交 <i
																	class="fa fa-arrow-circle-right"></i> 
																</a> -->								
															<input type="submit"/>
																	
															</div>
														</div>
													</div>
												</div>
											</div>
										</form>
									</div>
								</div>
								<!-- /BOX -->
							</div>
						</div>
						<!-- /SAMPLE -->
						<div class="footer-tools">
							<span class="go-top"> <i class="fa fa-chevron-up"></i> Top
							</span>
						</div>
					</div>
					<!-- /CONTENT-->
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/ad_footer.jsp" flush="true" />
	<script>
		jQuery(document).ready(function() {		
			App.setPage("wizards_validations");  //Set current page
			App.init(); //Initialise plugins and elements
			FormWizard.init();
		});
		
		function OnInput (event) {
	           
    		$("#userName2").html(event.target.value);
        }
		function OnInput1 (event) {
	           
    		$("#userEmail2").html(event.target.value);
        }
		/* function OnInput2 (event) {
	           
    		$("#userName2").html(event.target.value);
        } */
		function OnInput3 (event) {
	           
    		$("#userRealname2").html(event.target.value);
        }
		function OnInput4 (event) {
	           
    		$("#userAge2").html(event.target.value);
        }
		function OnInput5 (event) {
	           
    		$("#userArea2").html(event.target.value);
        }
		function OnInput6 (event) {
	           
    		$("#userSeniority2").html(event.target.value);
        }
		function OnInput7 (event) {
	           
    		$("#userScientific2").html(event.target.value);
        }
		function OnInput8 (event) {
	           
    		$("#userCompany2").html(event.target.value);
        }
		function OnInput9 (event) {
	           
    		$("#userWorkyear2").html(event.target.value);
        }
		function OnInput10 (event) {
	           
    		$("#userResearch2").html(event.target.value);
        }
	</script>

</body>
</html>