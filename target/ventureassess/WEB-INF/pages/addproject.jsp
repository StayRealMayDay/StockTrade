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
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>创建项目</title>
<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
      <jsp:include page="/head.jsp" flush="true"/>
</head>
<body>
<script type="text/javascript"
	src="<%= basePath%>/static/media/js/popwin.js"></script>
	<script type="text/javascript"
	src="<%= basePath%>/static/media/js/jquery.js"></script>
	<jsp:include page="/header1.jsp" flush="true"/>

	
 
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
								<li><i class="fa fa-home pr-10"></i><a href="index.html">Home</a></li>
								<li class="active">创建项目</li>
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
							
							<h2 class="text-center title">创建项目</h2>
							<div class="space-bottom"></div>
							<form id="form1" role="form" name="form1" class="form-horizontal" method="post"  Content-Range="bytes 0-800/801" enctype="multipart/form-data" onsubmit="return validation();" >
							
								<div class="form-group">
									<label class="col-sm-2 control-label">项目名称</label>
									<div class="col-sm-10">
										<input type="text" class="form-control" name="pro_name" id="pro_name"  onblur="checkPname()"  placeholder="请输入项目名称...">
										<label id="validate_proname" style="font-size:9px;display:none;"></label>
									</div>
								</div>
						<!-- 	<tr>
									<td class="col-sm-2 control-label">选择项目包含的成果</td>
									<td>
									
									<div id="selectList"></div>	 
										<input type="button" name="addresseeBtn1" id="addresseeBtn1" value="选择成果" class="btn btn-gray btn-sm" >
										<input type="button" name="button" id="addresseeBtn3" value="清空" class="btn btn-light-gray btn-sm">
									</td>
						        </tr> -->
								 <div class="form-group">
				                <label class="col-sm-2 control-label">选择包含成果</label>
				                
							     <div id="selectList" class="col-sm-10">	 </div>
							     <div class="col-sm-10">
									<input type="button" name="addresseeBtn1" id="addresseeBtn1" value="选择成果" class="btn btn-gray btn-sm" >
									<input type="button" name="button3" id="addresseeBtn3" value="清空" class="btn btn-light-gray btn-sm">
					           </div>
					           </div>  
					           <!-- <div class="form-group">
				    				<label class="col-sm-2 control-label">选择包含成员</label>
									<div  class="col-sm-10"> 
                                      <input type="button"value="选择成员" name="addresseeBtn2" id="addresseeBtn2" class="btn btn-gray btn-sm" onclick="return getMember()"  >
								      <input type="button" name="button4" id="addresseeBtn4" value="清空" class="btn btn-light-gray btn-sm">	
								      <div id="selectList1" name = "selectList1">
								      
								      
								      </div>			
								    </div>
								</div> -->
								<!-- <div class="form-group">
				    				<label class="col-sm-2 control-label">选择包含成员</label>
									<div  class="col-sm-10"> 
                                      <input type="button"value="选择成员" class="btn btn-gray btn-sm" onclick="return getMember()"  >
								      <input type="button" value="收起" class="btn btn-light-gray btn-sm">		
								      <div id="selectList1" name = "selectList1">
								      
								      
								      </div>			
								    </div>
								</div>  -->
								<div class="form-group">
									<label class="col-sm-2 control-label">硬件与技术是否配套</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pro_fit" id="pro_fit">
											<option value="1">硬件十分先进，能支持技术</option>
											<option value="2">硬件基本能支持技术</option>
											<option value="3">硬件还有待改进来满足此次项目所需技术</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">涉及领域是否有最近政策支持</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pro_support" id="pro_support">
											<option value="0">没有政策支持</option>
											<option value="1">有政策支持</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">涉及领域处于什么时期</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pro_period" id="pro_period">
											<option value="1">市场爆发期</option>
											<option value="2">市场增长期</option>
											<option value="3">市场稳定期</option>
											<option value="4">市场衰退期或不确定</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">银行贷款</label>
									<div class="col-sm-10">
									<div class="input-group">
										<input type="text" class="form-control" name="pro_bank" id="pro_bank" onblur="checkNumber1()"  placeholder="请输入银行贷款...">
										 <div class="input-group-addon">￥（万元）</div>
										</div>
										<label id="validate_bank" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">企业自筹资金</label>
									<div class="col-sm-10">
									<div class="input-group">
										<input type="text" class="form-control" name="pro_capital" id="pro_capital" onblur="checkNumber2()" placeholder="请输入企业自筹资金...">
										 <div class="input-group-addon">￥（万元）</div>
										</div>
										<label id="validate_capital" style="font-size:9px;display:none;"></label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">去年企业年利润</label>
									<div class="col-sm-10">
										<select class="form-control"  name="pro_lastbenifit" id="pro_lastbenifit">
											<option value="1">年利润为0或亏损</option>
											<option value="2">1% - 10%</option>
											<option value="3">10% - 20%</option>
											<option value="4">20% - 30%</option>
											<option value="5">30%以上</option>
								        </select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">项目计划</label>
									<div class="col-sm-10">
								    <textarea class="form-control" rows="10" name="pro_plan" id="pro_plan"  placeholder="请输入项目计划..."></textarea>
								    </div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">项目方案</label>
									<div class="col-sm-10">
								    <textarea class="form-control" rows="10" name="pro_scheme" id="pro_scheme"  placeholder="请输入项目方案..."></textarea>
								    </div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">上传项目相关文件</label>
									<div class="col-sm-10" style="float:left;">
										<input type="file" class="form-control" name="proFile" id="proFile" >
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 control-label">选择评估截至时间</label>
									<div class="col-sm-10">
										<input type="text" class="form-control Wdate" onFocus="WdatePicker({lang:'zh-cn',dateFmt:'yyyy-MM-dd HH:mm:ss'})" name="pro_eva_deadline" id="pro_eva_deadline" style="height:40px">
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-offset-2 col-sm-10">
										<button type="submit" name="creatManyBtn" id="creatManyBtn" class="btn btn-default" style="width:700px">创建项目（快去添加成员吧）</button>
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
											<li><a href="">提交样机</a></li>
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
		<jsp:include page="/footer1.jsp" flush="true"/>
			<script type="text/javascript">
	
			$(document).ready(function(e) {
		
				//新建项目
				 $('#creatManyBtn').click(function(e) {
		        $('#form1').attr('action','creatProject');
		        $('#form1').submit();
		        });
				
				//选择多个成果模态窗口
				$('#addresseeBtn1').click(function(){			
					popWin.showWin("600","500","选择多个成果","selectPassResultSmall");
				});
			/* 	//选择多个成员模态窗口
				$('#addresseeBtn2').click(function(){			
					popWin.showWin("600","500","选择多个成员","selectPassResultSmall");
				}); */
				/* //选择团队模态窗口
				$('#teamBtn').click(function(){			
					popWin.showWin("600","500","选择团队","selectTeamSmall");				
				}); */
				//清空多选
				$('#addresseeBtn3').click(function() {
						$('#selectList').empty();
				});

		});
	</script>
		<script>
	
	function checkNumber1(){
		var pro_bank=$("#pro_bank").val();
		var regbank=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
		if(pro_bank==""){
			$("#validate_bank").html("请输入金额");}
			else if(!regbank.test(pro_bank)){
				$("#validate_bank").html("请输入数字");
				
			}else{
				$("#validate_bank").html("");
				return true;
			}
			$("#validate_bank").css("display","inline");
				$("#validate_bank").css("color","red");
				$("#validate_bank").css("font-size","14px");
				return false;
		}
	function checkNumber2(){
		var pro_capital=$("#pro_capital").val();
		var regcapital=/^[0-9]+([.]{1}[0-9]+){0,1}$/;
		if(pro_bank==""){
			$("#validate_capital").html("请输入金额");}
			else if(!regcapital.test(pro_capital)){
				$("#validate_capital").html("请输入数字");
				
			}else{
				$("#validate_capital").html("");
				return true;
			}
			$("#validate_capital").css("display","inline");
				$("#validate_capital").css("color","red");
				$("#validate_capital").css("font-size","14px");
				return false;
		}
	
	var flag = 0;
function checkPname(){
		var proname=$("#pro_name").val();

	if(proname==""){
		$("#validate_proname").html("请输入项目名称");
			$("#validate_proname").css("display","inline");
			$("#validate_proname").css("color","red");
			$("#validate_proname").css("font-size","14px");
			return false;
	}else{//论文名称是否存在的验证
		$.ajax({
			type : 'post',
			url : 'getPronameValidation?pro_name='+proname,
			success : function (msg){
				if(msg == 'success'){//不存在
					$("#validate_proname").css("display","inline");
					$("#validate_proname").html("");
					flag = 1;
				}else{
					$("#validate_proname").css("display","inline");
					$("#validate_proname").html("该名称已存在！请重输");
					$("#validate_proname").css("color","red");
					$("#validate_proname").css("font-size","14px");
					
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
    var str = document.getElementById("proFile").value;
    if(str.length==0)
    {
        alert("请选择上传");
        return false;
    }
    return true;
}
function validation(){
	if(checkNumber1() && checkNumber2()&& checkPname()&&checkFile()){
		return true;
	}else{
		return false;
	}
}
	</script>
<!-- js files -->
<%-- <script src="<%= basePath%>/static/media/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/media/js/bootstrap.min.js"></script>
<script src="<%= basePath%>/static/media/js/SmoothScroll.min.js"></script>
<script src="<%= basePath%>/static/media/js/index.js"></script>
<script src="<%= basePath%>/static/media/js/top.js"></script>
<script src="<%= basePath%>/static/media/js/jqBootstrapValidation.js"></script>
<!--  <script src="<%= basePath%>/static/media/js/contact_me.js"></script>	-->  --%>
<!-- /js files -->
	
</body>
</html>