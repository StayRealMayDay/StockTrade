<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>管理员管理</title>
<meta name="description"
	content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Favicon -->
<link rel="shortcut icon" href="images/favicon.ico">


<jsp:include page="/head.jsp" flush="true" />
<script>
			function nextfun(){
				$("#f2").css("display","")
				$("#f1").css("display","none")
			}
			function nextfun2(){
				$("#f3").css("display","")
				$("#f2").css("display","none")
			}	
			function prefun2(){
				$("#f1").css("display","")
				$("#f2").css("display","none")
			}
			function prefun3(){
				$("#f2").css("display","")
				$("#f3").css("display","none")
			}
			function onchangeSelect(){
	        	identify = $("#identify").val();
	        	if(identify == 1){//成果提供者
	        		$("#u_qualification2").css("display","");
	        		$("#u_field").css("display","");
	        		$("#u_research").css("display","");
	        		$("#u_qualification1").css("display","none");
	        		$("#u_expertise").css("display","none");
	        		$("#u_businessfield").css("display","none");
	        	}
	        	if(identify == 0){
	        		//基金经理
	        		$("#u_qualification2").css("display","none");
	        		$("#u_field").css("display","none");
	        		$("#u_research").css("display","none");
	        		$("#u_qualification1").css("display","");
	        		$("#u_expertise").css("display","");
	        		$("#u_businessfield").css("display","");
	        	}
	        }
			
			function validation(){
				if(checkName() && checkps() && checkcps() && checkEmail()){
					return true;
				}else{
					return false;
				}
			}
			
			var flagName = 0;
			function checkName(){
				var name=$("#u_name").val();
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
	    				url : 'getNameValidation?u_name='+name,
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
				var rname=$("#u_realname").val();
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
			
			function checkRemark(){
				var remark=$("#u_remark").val();
				if(remark==""){
					$("#prompt_remark").html("请输入简介");
				}else{
					$("#prompt_remark").html("");
					return true;}
				$("#prompt_remark").css("display","inline");
      			$("#prompt_remark").css("color","red");
      			$("#prompt_remark").css("font-size","16px");
      			return false;
			}
			
			function checkAge(){
				var age=$("#u_age").val();
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
				var exe=$("#ex_expertise").val();
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
				var rpq=$("#rp_qualification").val();
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
					$("#prompt_rpf").html("请输入研究方向");
				}else{
					$("#prompt_rpf").html("");
					return true;}
				$("#prompt_rpf").css("display","inline");
      			$("#prompt_rpf").css("color","red");
      			$("#prompt_rpf").css("font-size","16px");
      			return false;
			}
			
			function checkRpr(){
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
			}
			
			function checkps(){
				var ps=$("#u_pwd").val();
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
			    var ps=$("#u_pwd").val();
			    var cps=$("#u_repeat_pwd").val();
			    
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
	   			var email=$("#u_email").val();
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
</head>

<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
<body>
	<!-- scrollToTop -->
	<!-- ================ -->
	<div class="scrollToTop">
		<i class="icon-up-open-big"></i>
	</div>

	<!-- page wrapper start -->
	<!-- ================ -->
	<div class="page-wrapper">

		<!-- header-top start -->
		<!-- ================ -->
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-xs-2  col-sm-6"></div>
					<div class="col-xs-10 col-sm-6">

						<!-- header-top-second start -->
						<!-- ================ -->
						<div id="header-top-second" class="clearfix">

							<!-- header top dropdowns start -->
							<!-- ================ -->
							<div class="header-top-dropdown">
								<div class="btn-group dropdown">
									<button type="button" class="btn dropdown-toggle"
										data-toggle="dropdown">
										<i class="fa fa-search"></i> Search
									</button>
									<ul
										class="dropdown-menu dropdown-menu-right dropdown-animation">
										<li>
											<form role="search" class="search-box">
												<div class="form-group has-feedback">
													<input type="text" class="form-control"
														placeholder="Search"> <i
														class="fa fa-search form-control-feedback"></i>
												</div>
											</form>
										</li>
									</ul>
								</div>

							</div>
							<!--  header top dropdowns end -->

						</div>
						<!-- header-top-second end -->

					</div>
				</div>
			</div>
		</div>
		<!-- header-top end -->

		<!-- header start (remove fixed class from header in order to disable fixed navigation mode) -->
		<!-- ================ -->
		<header class="header fixed clearfix">
		<div class="container">
			<div class="row">
				<div class="col-md-3">

					<!-- header-left start -->
					<!-- ================ -->
					<div class="header-left clearfix">

						<!-- logo -->
						<div class="logo">
							<a href="index.html"><img id="logo"
								src="<%= basePath%>/static/projectstyle/images/logo_red.png"
								alt="iDea"></a>
						</div>

						<!-- name-and-slogan -->
						<div class="site-slogan">风险评估指标系统后台管理</div>

					</div>
					<!-- header-left end -->

				</div>
				<div class="col-md-9">

					<!-- header-right start -->
					<!-- ================ -->
					<div class="header-right clearfix">

						<!-- main-navigation start -->
						<!-- ================ -->
						<div class="main-navigation animated">

							<!-- navbar start -->
							<!-- ================ -->
							<nav class="navbar navbar-default" role="navigation">
							<div class="container-fluid">

								<!-- Toggle get grouped for better mobile display -->
								<div class="navbar-header">
									<button type="button" class="navbar-toggle"
										data-toggle="collapse" data-target="#navbar-collapse-1">
										<span class="sr-only">Toggle navigation</span> <span
											class="icon-bar"></span> <span class="icon-bar"></span> <span
											class="icon-bar"></span>
									</button>
								</div>

								<!-- Collect the nav links, forms, and other content for toggling -->
								<div class="collapse navbar-collapse" id="navbar-collapse-1">
									<ul class="nav navbar-nav navbar-right">
										<li><a href="ad_login" class="dropdown active dropdown-toggle"
											>首页</a></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理成果</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加成果</a></li>
												<li><a href="#">查看成果</a></li>
												<li><a href="#">编辑成果</a></li>
												<li><a href="#">检索成果</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理项目</a>
											<ul class="dropdown-menu">
												<li><a href="#">增加项目</a></li>
												<li><a href="#">查看项目</a></li>
												<li><a href="#">编辑项目</a></li>
												<li><a href="#">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">管理指标</a>
											<ul class="dropdown-menu">
												<li><a href="selectIndexFactor">增加指标</a></li>
												<li><a href="selectIndexFactor">查看指标</a></li>
												<li><a href="selectIndexFactor">编辑指标</a></li>
												<li><a href="selectIndexFactor">检索项目</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">用户管理</a>
											<ul class="dropdown-menu">
												<li><a href="ad_addUser">增加用户</a></li>
												<li class="active"><a href="ad_userManage">查看用户</a></li>
												<!-- <li><a href="#">编辑用户</a></li> -->
												<li><a href="#">查询用户</a></li>
											</ul></li>
										<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">日志管理</a>
											<ul class="dropdown-menu">
												<li><a href="getAllLogs1?pageNum=1">查看日志</a></li>
												<li class="active"><a href="#">检索日志</a></li>
											</ul></li>
									</ul>
								</div>

							</div>
							</nav>
							<!-- navbar end -->

						</div>
						<!-- main-navigation end -->

					</div>
					<!-- header-right end -->

				</div>
			</div>
		</div>
		</header>
		<!-- header end -->

		<!-- page-intro start-->
		<!-- ================ -->
		<div class="page-intro">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ol class="breadcrumb">
							<li><i class="fa fa-home pr-10"></i><a href="#">Home</a></li>
							<li class="active">后台管理</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		<!-- page-intro end -->

		<!-- main-container start -->
		<!-- ================ -->
		<section class="main-container">

		<div class="container">
			<div class="row">

				<!-- sidebar start -->
				<jsp:include page="/ad_left.jsp" flush="true" />
				<!-- sidebar end -->

				<!-- main start -->
				<!-- ================ -->
				<div class="main col-md-8 col-md-offset-1">
					<form role="form" action="/vcevaluation/ad_addUser1" method="post"
						Content-Range="bytes 0-800/801" enctype="multipart/form-data"
						class="registration-form" onsubmit="return validation();">
						<div class="form-bottom">
							<div class="form-group">
								<label class="sr-only" for="form-last-name">用户名</label> <input
									type="text" style="width:67%" name="u_name" id="u_name" onblur="checkName()"
									placeholder="请输入用户名..." class="form-last-name form-control">
								<label id="prompt_name" style="font-size: 9px; display: none;"></label>

							</div>
							<div class="form-group">
								<label class="sr-only" for="form-last-name">真实姓名</label> <input
									style="width:67%" type="text" name="u_realname" id="u_realname"
									onblur="checkRealName()" placeholder="请输入真实姓名..."
									class="form-last-name form-control"> <label
									id="prompt_realname" style="font-size: 9px; display: none;"></label>

							</div>
							<div class="form-group">
								<label class="sr-only" for="form-email">Email</label> <input
									style="width:67%" type="text" name="u_email" id="u_email" onblur="checkEmail()"
									placeholder="请输入你的Email..." class="form-email form-control">
								<label id="prompt_mail" style="display: none; font-size: 9px;"></label>
							</div>
							<div class="form-group">
								<label class="sr-only" for="form-about-yourself">简介</label>
								<textarea name="u_remark" id="u_remark" onblur="checkRemark()"
									style="width:67%" placeholder="请输入你的简介..."
									class="form-about-yourself form-control"></textarea>
								<label id="prompt_remark" style="font-size: 9px; display: none;"></label>
							</div>
							<div class="form-group">
								<a class="select" id="select"> <select
									style="height: 50px; width: 505px" id="u_gender"
									name="u_gender">
										<option style="height: 25px;" value="0">请选择性别：</option>
										<option style="height: 25px; text-align: center" value="1">男</option>
										<option style="height: 25px; text-align: center" value="2">女</option>
								</select>
								</a>
							</div>
							<div class="form-group">
								<a class="select" id="select"> <span class="cur-select"></span>
									<select style="height: 50px; width: 505px" id="u_edu"
									name="u_edu">
										<option style="height: 25px;" value="0">请选择学历：</option>
										<option style="height: 25px; text-align: center" value="1">博士</option>
										<option style="height: 25px; text-align: center" value="2">硕士</option>
										<option style="height: 25px; text-align: center" value="3">本科</option>
										<option style="height: 25px; text-align: center" value="4">本科以下</option>
								</select>
								</a>
							</div>
							<div class="form-group">
								<label class="sr-only" for="form-facebook">年龄</label> <input
									style="width:67%" type="text" name="u_age" id="u_age" onblur="checkAge()"
									placeholder="输入您的年龄..." class="form-facebook form-control">
								<label id="prompt_age" style="font-size: 9px; display: none;"></label>
							</div>
							<div class="form-group">
								<label class="sr-only" for="form-password">密码</label> <input
									style="width:67%" type="password" name="u_pwd" id="u_pwd" onblur="checkps()"
									placeholder="请输入你的密码..." class="form-password form-control">
								<label id="prompt_ps" style="font-size: 9px; display: none;"></label>
							</div>
							<div class="form-group">
								<label class="sr-only" for="form-repeat-password">重复密码</label> <input
									style="width:67%" type="password" name="u_repeat_pwd" id="u_repeat_pwd"
									onblur="checkcps()" placeholder="再次输入密码..."
									class="form-repeat-password form-control"> <label
									id="prompt_cps" style="font-size: 9px; display: none;"></label>
							</div>
							<div class="form-group">
								<!--  <select id="id_identify" name="identify"  >
								                <option style="text-align:center;height:30px" value="0">学生</option>
								                <option style="text-align:center;height:30px" value="1">教师</option>
							                </select>-->
								<a class="select"> <select
									style="height: 50px; width: 505px" id="identify"
									name="identify" onchange="onchangeSelect();">
										<option style="height: 25px; text-align: center" value="0">基金经理</option>
										<option style="height: 25px; text-align: center" value="1">成果提供者</option>
								</select>
								</a>
							</div>
							<div id="u_qualification1" class="form-group">
								<label class="sr-only" for="form-facebook">级别</label> <input
									style="width:67%" type="text" name="ex_qualification" id="ex_qualification"
									onblur="checkExq()" placeholder="输入您的级别..."
									class="form-facebook form-control"> <label
									id="prompt_exq" style="font-size: 9px; display: none;"></label>
							</div>
							<div id="u_expertise" class="form-group">
								<label class="sr-only" for="form-twitter">工作年限</label> <input
									style="width:67%" type="text" name="ex_expertise" id="ex_expertise"
									onblur="checkExe()" placeholder="输入您的工作年限..."
									class="form-twitter form-control"> <label
									id="prompt_exe" style="font-size: 9px; display: none;"></label>
							</div>
							<div id="u_businessfield" class="form-group">
								<label class="sr-only" for="form-google-plus">业务擅长领域</label> <input
									style="width:67%" type="text" name="ex_businessfield" id="ex_businessfield"
									onblur="checkExb()" placeholder="输入您的业务擅长领域..."
									class="form-google-plus form-control"> <label
									id="prompt_exb" style="font-size: 9px; display: none;"></label>
							</div>
							<div id="u_qualification2" class="form-group"
								style="display: none">
								<label class="sr-only" for="form-facebook">资历</label> <input
									style="width:67%" type="text" name="rp_qualification" id="rp_qualification"
									onblur="checkRpq()" placeholder="输入您的资历..."
									class="form-facebook form-control"> <label
									id="prompt_rpq" style="font-size: 9px; display: none;"></label>
							</div>
							<div id="u_field" class="form-group" style="display: none">
								<label class="sr-only" for="form-twitter">研究方向</label> <input
									style="width:67%" type="text" name="rp_field" id="rp_field" onblur="checkRpf()"
									placeholder="输入您的研究方向..." class="form-twitter form-control">
								<label id="prompt_rpf" style="font-size: 9px; display: none;"></label>
							</div>
							<div id="u_research" class="form-group" style="display: none">
								<label class="sr-only" for="form-google-plus"
									style="width:67%" style="display: none">科研情况</label> <input type="text"
									name="rp_research" id="rp_research" onblur="checkRpr()"
									placeholder="输入您的科研情况..." class="form-google-plus form-control">
								<label id="prompt_rpr" style="font-size: 9px; display: none;"></label>
							</div>
							<div class="form-group">
								<p style="display: inline">
									上传资历凭证:&nbsp&nbsp&nbsp <input type="file" name="file4"
										style="display: inline">
								</p>
							</div>
							<button type="submit" class="btn btn-default">增加用户</button>
					</form>
					</div>
				</div>
			</div>
			<!-- main end -->

		</div>
	</div>
	</section>
	<!-- main-container end -->


	<jsp:include page="/footer1.jsp" flush="true" />

</body>
</html>
