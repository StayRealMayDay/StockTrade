<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  %>
      <% String path=request.getContextPath();
     String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
     response.setHeader("Content-Range", "bytes 0-800/801");
    %>
    <%@ page import="java.util.*"%>
<%@ page import="com.vcevaluation.pojo.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
	
<style type="text/css">
		.vertical .nav-tabs {
    -webkit-box-shadow: none;
    box-shadow: none;
    border-bottom-color: transparent;
    background-color: #999;
    }
    .radio, .checkbox {
    position: relative;
    display: block;
    min-height: 20px;
    margin-top: 0px;
    margin-bottom: 10px;
   
		</style>

		
		</script>
		
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
								<li class="active">评估样机</li>
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
						<div class="main col-md-12">

							<!-- Tabs start -->
							<!-- ============================================================================== -->
							<div style="text-align: center">
							<h2>样机指标评估</h2>
							 
							</div>
							<h3>指标项</h3>
							<form id="form3"  role="form" action="/vcevaluation/Eva_prototype" method="post" onsubmit="return validation();">
							<!-- Tabs start -->
							<!-- ================ -->
							<input type="hidden" name="res_id" value="${result.res_id}">
							<div class="vertical">
								<!-- Nav tabs -->
								<ul class="nav nav-tabs" role="tablist">
								  <c:forEach  items="${ins}" var="in" varStatus="status" begin="0" end="0">
									<li class="active"><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.in_name}</a></li>
								  </c:forEach>
								  <c:forEach  items="${ins}" var="in" varStatus="status" begin="1" >
									<li><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.in_name}</a></li>
								  </c:forEach>
								</ul>
								<!-- Tab panes -->
								<div class="tab-content" style="width:1140px;height:700px">
								   
								   <c:forEach items="${ins}" var="in" varStatus="status" begin="0" end="0"> 
								       
									<div class="tab-pane active" id="vtab${status.index+1}">
									  	
		                                <!-- <h2 style="text-align: center">请针对指标进行打分</h2> -->
									   <!--  <form class="form-horizontal" role="form"> -->
										
										<div class="col-md-8">
												<div style="text-align: center">	  
											  <a><i class="fa fa-magic pr-10"></i>${in.in_name} </a>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
												
											   <c:if test="${inNext.in_parent == in.in_id}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.in_name}</label>
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option" varStatus="status">
												      <c:if test="${option.option_in_id == inNext.in_id}">
										
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.option_in_id}" id="optionsRadios${status.index+1}" value="${option.option_value}">
																${option.option_name}&nbsp(${option.option_value}分)
															</label>
														  </div> 
													  
                                                        
												      </c:if> 
													</c:forEach>
													</div>	
													</div><div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
										
										<div class="col-md-4">
										<h4>样机参考信息</h4>
										<c:if test="${fn:length(ups) > 0}">
											
										         <c:forEach var="up" items="${ups}" begin="0" end="0">
										           
													   <img src="<%= basePath%>/static/adStyle/img/${up.upload_name}" alt="">
													  
												
										         </c:forEach>
                                            
                                            </c:if>
                                           <div class="space"></div>
												<c:if test="${prototype.pt_entity==1}">
												 <li>有无样品实体:有样机</li>
												</c:if>
												<c:if test="${prototype.pt_entity==0}">
												  <li>有无样品实体:无样机，有设计图</li>
												</c:if>
												
												<c:if test="${prototype.pt_market==1}">
												   <li>市场选择策略:密集性市场策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==2}">
												   <li>市场选择策略:产品专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==3}">
												   <li>市场选择策略:市场专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==4}">
												   <li>市场选择策略:有选择的专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==5}">
												   <li>市场选择策略:全部市场策略</li>
												</c:if>
												
												<c:if test="${prototype.pt_product==1}">
												   <li>将来的产品定位:奢侈品</li>
												</c:if>
												<c:if test="${prototype.pt_product==2}">
												   <li>将来的产品定位:高端产品</li>
												</c:if>
												<c:if test="${prototype.pt_product==3}">
												   <li>将来的产品定位:行业针对性产品</li>
												</c:if>
												<c:if test="${prototype.pt_product==4}">
												   <li>将来的产品定位:必需品</li>
												</c:if>
												
												<li>预期价格:${prototype.pt_price}</li>
												
												<c:if test="${prototype.pt_safety==1}">
												   <li>安全属性:对安全属性要求最高</li>
												</c:if>
												<c:if test="${prototype.pt_safety==2}">
												   <li>安全属性:对安全属性要求较高</li>
												</c:if>
												<c:if test="${prototype.pt_safety==3}">
												   <li>安全属性:不属于安全性要求高的领域</li>
												</c:if>
												
												<c:if test="${prototype.pt_compete==1}">
												   <li>市场竞争性:所属领域为垄断性</li>
												</c:if>
												<c:if test="${prototype.pt_compete==2}">
												   <li>市场竞争性:同类型产品竞争激烈</li>
												</c:if>
												<c:if test="${prototype.pt_compete==3}">
												   <li>市场竞争性:同类型产品竞争不激烈</li>
												</c:if>
												
												<c:if test="${prototype.pt_ditch==1}">
												   <li>渠道特性:销售渠道集中</li>
												</c:if>
												<c:if test="${prototype.pt_ditch==2}">
												   <li>渠道特性:销售渠道分散</li>
												</c:if>
												<!-- 写到这里 -->
												
												<c:if test="${prototype.pt_aimgroup==1}">
												   <li>目标群体:专业人员</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==2}">
												   <li>目标群体:高端人士</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==3}">
												   <li>目标群体:普通大众</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==4}">
												   <li>目标群体:中小企业</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==5}">
												   <li>目标群体:大型企业</li>
												</c:if>
										</div>
										
									<!-- </form> -->
									<!-- </div>  -->
									</div>

									</c:forEach> 
								   
                                   <c:forEach items="${ins}" var="in" varStatus="status" begin="1"> 
								       
										<div class="tab-pane fade" id="vtab${status.index+1}">
									  <!--   <div style="text-align: center">	  -->		
		                                <!-- <h2 style="text-align: center">请针对指标进行打分</h2> -->
									   <!--  <form class="form-horizontal" role="form"> -->
											
										<div class="col-md-8">
										<div style="text-align: center">	  
											  <a><i class="fa fa-magic pr-10"></i>${in.in_name} </a>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
							
											   <c:if test="${inNext.in_parent == in.in_id}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.in_name}</label>
											     
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option" varStatus="status">
												      <c:if test="${option.option_in_id == inNext.in_id}">
												      
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.option_in_id}" id="optionsRadios${status.index+1}" value="${option.option_value}">
																${option.option_name} &nbsp(${option.option_value}分) 
															</label>
														  </div> 
												      </c:if> 
													</c:forEach>
													</div>	
													</div>
													<div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
										
										<div class="col-md-4">
										<h4>样机参考信息</h4>
										<c:if test="${fn:length(ups) > 0}">
											
										         <c:forEach var="up" items="${ups}" begin="0" end="0">
										           
													   <img src="<%= basePath%>/static/adStyle/img/${up.upload_name}" alt="">
													  
												
										         </c:forEach>
                                            
                                            </c:if>
                                            <div class="space"></div>
												<c:if test="${prototype.pt_entity==1}">
												    <li>有无样品实体:有样机</li>
												</c:if>
												<c:if test="${prototype.pt_entity==0}">
												   <li>有无样品实体:无样机，有设计图</li>
												</c:if>
												
												<c:if test="${prototype.pt_market==1}">
												   <li>市场选择策略:密集性市场策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==2}">
												   <li>市场选择策略:产品专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==3}">
												   <li>市场选择策略:市场专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==4}">
												   <li>市场选择策略:有选择的专业化策略</li>
												</c:if>
												<c:if test="${prototype.pt_market==5}">
												   <li>市场选择策略:全部市场策略</li>
												</c:if>
												
												<c:if test="${prototype.pt_product==1}">
												    <li>将来的产品定位:奢侈品</li>
												</c:if>
												<c:if test="${prototype.pt_product==2}">
												    <li>将来的产品定位:高端产品</li>
												</c:if>
												<c:if test="${prototype.pt_product==3}">
												    <li>将来的产品定位:行业针对性产品</li>
												</c:if>
												<c:if test="${prototype.pt_product==4}">
												    <li>将来的产品定位:必需品</li>
												</c:if>
												
												<li>预期价格:  ${prototype.pt_price}</li>
												
												<c:if test="${prototype.pt_safety==1}">
												    <li>安全属性:对安全属性要求最高</li>
												</c:if>
												<c:if test="${prototype.pt_safety==2}">
												    <li>安全属性:对安全属性要求较高</li>
												</c:if>
												<c:if test="${prototype.pt_safety==3}">
												    <li>安全属性:不属于安全性要求高的领域</li>
												</c:if>
												
												<c:if test="${prototype.pt_compete==1}">
												    <li>市场竞争性:所属领域为垄断性</li>
												</c:if>
												<c:if test="${prototype.pt_compete==2}">
												    <li>市场竞争性:同类型产品竞争激烈</li>
												</c:if>
												<c:if test="${prototype.pt_compete==3}">
												    <li>市场竞争性:同类型产品竞争不激烈</li>
												</c:if>
												
												<c:if test="${prototype.pt_ditch==1}">
												    <li>渠道特性:销售渠道集中</li>
												</c:if>
												<c:if test="${prototype.pt_ditch==2}">
												    <li>渠道特性:销售渠道分散</li>
												</c:if>
												<!-- 写到这里 -->
												
												<c:if test="${prototype.pt_aimgroup==1}">
												    <li>目标群体:专业人员</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==2}">
												    <li>目标群体:高端人士</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==3}">
												    <li>目标群体:普通大众</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==4}">
												    <li>目标群体:中小企业</li>
												</c:if>
												<c:if test="${prototype.pt_aimgroup==5}">
												    <li>目标群体:大型企业</li>
												</c:if>
										
										</div>
									<!-- </form> -->
									<!-- </div>  -->
									</div>

									</c:forEach> 
									<%-- 
								   <c:forEach items="${ins}" var="in" varStatus="status"> 
								        <input type="hidden"  value="">
										<div class="tab-pane fade" id="vtab${status.index+1}">
										 <div style="text-align: center">
										  <c:forEach items="${inNexts}" var="inNext">
							
											   <c:if test="${inNext.in_parent == in.in_id}">
											     <input type="hidden" class="form-control" id="input" value="">
											   
											     <li> ${inNext.in_id}</li>
											     <li> ${inNext.in_name}</li>
											     
												    <c:forEach items="${options}" var="option" >
												      <c:if test="${option.option_in_id == inNext.in_id}">
															<input type="radio" name="optionsRadios${option.option_in_id}" id="optionsRadios1" value="option1" checked="">
															${option.option_name}
												      </c:if> 
													</c:forEach>
												</c:if>
											</c:forEach> </div>
										</div>
									</c:forEach>  --%>
								
									
									
								</div>
							</div>
							<div class="form-group">
									<div>
										<button type="submit" class="btn btn-default" style="width:1140px">提交评估</button>
									</div>
								</div>
							<!-- tabs end -->
							</form>
					   </div>
				    </div>
			    </div>
			</section>
			<!-- main-container end -->
			<!-- main-container end -->

			<div class="space"></div>
		</div>
		<!-- page-wrapper end -->

		<!-- JavaScript files placed at the end of the document so the pages load faster
		================================================== -->
		<jsp:include page="/footer1.jsp" flush="true"/>
<script>
function isAllChecked() {
	 
	  for (var i = 154; i < 189; i++) {
	    var radios = document.getElementsByName('optionsRadios' + i);
	    var checkedCount = 0;
	    for (var j = 0; j < radios.length; j++) {
	      if (radios[j].checked) {
	        checkedCount++;
	      }
	    }
	    if (!checkedCount) {
	      return false;
	    }
	  }
	 
	  return true;
	}
function validation(){
	if(isAllChecked()){
		return true;
	}else{
		
		alert("请给所有选项打分！");
		return false;
	}
}
	/* alert(isAllChecked()); */
/* function checkRadio(){
	
     for(var j=154;j<189;j++){
    	 var option = document.getElementsByName("optionsRadios"+j);
    	 for(var i=0;i<option.length;i++){
    		  if(option[i].checked==true){
    		   return true;
    		  }
    		  alert("请给所有选项打分！");
    	    return false; 
         }
    	 
     } 
	 
	 
}
function validation(){
	if(checkRadio()){
		return true;
	}else{
		return false;
	}
}*/
</script>
	</body>
</html>