<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  %>
      <% String path=request.getContextPath();
     String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
     response.setHeader("Content-Range", "bytes 0-800/801");
    %>
    <%@ page import="java.util.*"%>
<%@ page import="com.vcevaluation.pojo.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<title>Forms</title>
		<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
		<meta name="author" content="htmlcoder.me">

		<!-- Mobile Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<jsp:include page="/head.jsp" flush="true"/>
<!-- 		<style type="text/css">
		.col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12{
			padding-right:0px;
		}
	
		</style>  -->
		

	</head>

	<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
	<body>
	<jsp:include page="/header1.jsp" flush="true"/>
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>

		<!-- page wrapper start -->
		<!-- ================ -->
		<div class="page-wrapper">

			<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li class="active">创建样机</li>
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

						<!-- main start -->
						<!-- ================ -->
						<div class="main col-md-9">

							<!-- Forms start -->
							<!-- ============================================================================== -->
							
							<h2 class="text-center title">创建样机</h2>
							<div class="space-bottom"></div>
							<form id="form4" role="form" class="form-horizontal" action="upload4" method="post"  Content-Range="bytes 0-800/801" enctype="multipart/form-data" onsubmit="return validation();" >
							
								<div class="form-group">
									<label class="col-sm-2 control-label">样机名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="pt_name" id="pt_name" onblur="checkPtname()" placeholder="请输入样机名称...">
										<label id="validate_ptname" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">是否有样机</label>
									<div class="col-sm-10">
										<div class="radio">
										<label>
											<input type="radio" name="pt_entity" id="optionsRadios3" value="1" checked>有样机
										</label>
									    </div>
									    <div class="radio">
										<label>
											<input type="radio" name="pt_entity" id="optionsRadios4" value="0">无样机，有设计图

										</label>
								        </div>
										
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">市场选择策略 </label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_market" id="pt_market">
											<option value="1">密集性市场策略</option>
											<option value="2">产品专业化策略</option>
											<option value="3">市场专业化策略</option>
											<option value="4">有选择的专业化策略</option>
											<option value="5">全部市场策略</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">将来的产品定位</label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_product" id="pt_product">
											<option value="1">奢侈品</option>
											<option value="2">高端产品</option>
											<option value="3">行业针对性产品</option>
											<option value="4">必需品</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">预期价格</label>
									<div class="col-sm-10">
									<div class="input-group">
										<input type="text" class="form-control" name="pt_price" id="pt_price" onblur="checkNumber()" placeholder="请输入预期价格...">
										 <div class="input-group-addon">￥</div>
										</div>
										<label id="validate_number" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">是否属于安全属性高的领域</label>
									<div class="col-sm-10">
									    <p class="help-block">食品、化妆品、住房、交通等产品就属于对安全性要求高的领域，尤其是食品领域</p>
										<div class="radio">
										<label>
											<input type="radio" name="pt_safety" id="pt_safety1" value="1" checked>
											属于食品行业，对安全属性要求最高
										</label>
									    </div>
									    <div class="radio">
										<label>
											<input type="radio" name="pt_safety" id="pt_safety2" value="2">
											属于其他对安全属性要求较高的领域
										</label>
								        </div>
								        <div class="radio">
								        <label>
										<input type="radio" name="pt_safety" id="pt_safety3" value="3">
											不属于安全性要求高的领域
										</label>
								        </div>
								    </div>    
									
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">市场竞争性</label>
									<div class="col-sm-10">
										<select class="form-control" name="pt_compete" id="pt_compete">
											<option value="1">所属领域为垄断性</option>
											<option value="2">同类型产品竞争激烈</option>
											<option value="3">同类型产品竞争不激烈</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">渠道特性</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pt_ditch" id="pt_ditch">
											<option value="1">销售渠道集中</option>
											<option value="2">销售渠道分散</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">目标群体</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pt_aimgroup" id="pt_aimgroup">
											<option value="1">专业人员</option>
											<option value="2">高端人士</option>
											<option value="3">普通大众</option>
											<option value="4">中小企业</option>
											<option value="5">大型企业</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">简介</label>
									<div class="col-sm-10">
								    <textarea class="form-control" rows="6" name="pt_introduction" id="pt_introduction"></textarea>
								    </div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">上传样机相关文件</label>
									<div class="col-sm-10" style="float:left;">
										<input type="file" class="form-control" name="InputFile" id="InputFile" >
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 control-label">选择评估截至时间</label>
									<div class="col-sm-10">
										<input type="text" class="form-control Wdate" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="pt_eva_deadline" id="pt_eva_deadline" style="height:40px">
									</div>
								</div>
								
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" class="btn btn-default" style="width:700px">提交样机</button>
									</div>
								</div>
							</form>
							<!-- <div class="space-bottom"></div> -->
							
						</div>
						<!-- main end -->

						<!-- sidebar start -->
						<aside class="col-md-3">
							<div class="sidebar">
								<div class="block clearfix">
									<h3 class="title">您还可以</h3>
									<div class="separator"></div>
									<nav>
										<ul class="nav nav-pills nav-stacked">
											<li><a href="">提交论文</a></li>
											<li><a href="">提交专利</a></li>
											<li><a href="">提交软件</a></li>
											<li><a href="">创建项目</a></li>
										</ul>
									</nav>
								</div>
							</div>
						</aside>
						<!-- sidebar end -->

					</div>
				</div>
			</section>
			<!-- main-container end -->

			<div class="space"></div>
		</div>
		<!-- page-wrapper end -->

		<!-- JavaScript files placed at the end of the document so the pages load faster
		================================================== -->
		<jsp:include page="/footer1.jsp" flush="true"/>
<script>
function checkNumber(){
	var number=$("#pt_price").val();
	var regnumber=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
	if(number==""){
		$("#validate_number").html("请输入金额");}
		else if(!regnumber.test(number)){
			$("#validate_number").html("请输入数字");
			
		}else{
			$("#validate_number").html("");
			return true;
		}
		$("#validate_number").css("display","inline");
			$("#validate_number").css("color","red");
			$("#validate_number").css("font-size","14px");
			return false;
	}


var flag = 0;
function checkPtname(){
	/* alert(111); */
		var ptname=$("#pt_name").val();

	if(ptname==""){
		$("#validate_ptname").html("请输入样机名称");
			$("#validate_ptname").css("display","inline");
			$("#validate_ptname").css("color","red");
			$("#validate_pname").css("font-size","14px");
			return false;
	}else{//论文名称是否存在的验证
		$.ajax({
			type : 'post',
			url : 'getRnameValidation?r_name='+ptname,
			success : function (msg){
				if(msg == 'success'){//不存在
					$("#validate_ptname").css("display","inline");
					$("#validate_ptname").html("");
					flag = 1;
				}else{
					$("#validate_ptname").css("display","inline");
					$("#validate_ptname").html("该名称已存在！请重输");
					$("#validate_ptname").css("color","red");
					$("#validate_ptname").css("font-size","14px");
					
				}
			}
		}); 
		if(flag == 1){
			return true;
		}
		return false;
	}
	}
function checkFile(){
    var str = document.getElementById("InputFile").value;
    if(str.length==0)
    {
        alert("请选择上传");
        return false;
    }
    return true;
}
function validation(){
	if(checkPtname() && checkNumber()&&checkFile()){
		return true;
	}else{
		return false;
	}
}
</script>
	</body>
</html>
