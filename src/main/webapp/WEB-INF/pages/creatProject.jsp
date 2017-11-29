<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
<title>创建项目</title>

<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
 <link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />

<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->

<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/css/jquery.step.css">
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/jquery.step.js"></script>
<style type="text/css">
	
.navbar {
    min-height: 100%;
    margin-bottom: 0;
}

.navbar-default {
    background-color: #f15f43 !important;
    border-color: #f15f43;
    border-radius: 0px;
}
label.col-md-3.control-lable {
    text-align: right;
}
.col-md-9 {
    width: 8%;
}
.form-group {
    margin-bottom: 20px;
}

</style>
</head>
<body>

<jsp:include page="/u_top.jsp"></jsp:include>

 <div class="container"> 
<div class="step-body" id="myStep">
	<div class="step-header" style="width:80%">
		<ul>
			<li><p>项目基本信息</p></li>
			<li><p>技术水平</p></li>
			<li><p>商业模式</p></li>
			<li><p>市场因素</p></li>
			<li><p>产业化过程</p></li>
			<li><p>组织与管理</p></li>
			<li><p>生产水平</p></li>
			<li><p>团队水平</p></li>
			<li><p>财务水平</p></li>
			<li><p>风险防范</p></li> 
			
		</ul>
	</div>
	
	<div class="step-content">
	<form role="form" id="addform" action="addProject" method="post">
		<div class="step-list">
		</br>
	    </br>
		<div class="form-container">
		
		
		 <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">项目名称</label>
                <div class="col-md-9">
                    <input style="width:651px;" type="text" name="pj_name" id="pj_name" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">项目背景</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="6" value=" " name="pj_background" id="pj_background"    > </textarea>
                </div>
            </div>
        </div>
         <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">产品名称</label>
                <div class="col-md-9">
                    <input type="text"style="width:651px;" name="pd_name" id="pd_name" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">产品类型</label>
                <div class="col-md-9" >
                    <select  style="width:651px;" name="pd_type" id="pd_type" class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <option value="传统行业">传统行业产品</option>
                        <option value="新兴IT行业产品">新兴IT行业产品</option>
                    </select>
               </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">产品实用性</label>
                <div class="col-md-9">
                    <input type="text" style="width:651px;" name="pd_practical" id="pd_practical"  class="form-control input-sm"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">产品原理</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pd_principle" id="pd_principle"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">产品描述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pd_description" id="pd_description"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">进展阶段</label>
                <div class="col-md-9">
                    <input type="text" style="width:651px;"  name="pj_period" id="pj_period" class="form-control input-sm"/>
                </div>
            </div>
        </div>
        
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">融资目标金额</label>
                <div class="col-md-9">
                    <input type="text" style="width:651px;"  name="pj_targetfinance" id="pj_targetfinance" class="form-control input-sm"/>
                </div>
            </div>
        </div>
       <%--  <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="lastName">融资用途</label>
                <div class="col-md-9">
                    <input type="text" style="width:651px;"  name="user_age" id="user_age"  value="${user.userAge} "class="form-control input-sm"/>
                </div>
            </div>
        </div> --%>
		<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">短期规划</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="4" value=" " name="pj_shortplan" id="pj_shortplan" > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">中长期规划</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="4" value=" " name="pj_mlplan" id="pj_mlplan"    > </textarea>
                </div>
            </div>
        </div>
        
		
		
		</div>
		</div>
		<div class="step-list">
		    </br>
	    </br>
		<div class="form-container">
		
		
		 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">技术水平概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pd_technology" id="pd_technology"    > </textarea>
                </div>
            </div>
        </div>
       
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">创新程度概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="tech_innovatelevel" id="tech_innovatelevel"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">技术难度概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="tech_difficulty" id="tech_difficulty"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">成熟程度概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="tech_maturelevel" id="tech_maturelevel"    > </textarea>
                </div>
            </div>
        </div>
		<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">技术水平概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="tech_techlevel" id="tech_techlevel"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">专利状态概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="2" value=" " name="tech_patent" id="tech_patent"    > </textarea>
                </div>
            </div>
        </div>
        
         <c:forEach items="${ins}" var="in" varStatus="status" begin="2" end="2"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;" name="options${inNext.inUuid}" id="options${inNext.inUuid}" class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option  value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
        
      <%--   <c:forEach items="${ins}" var="in" varStatus="status" begin="2" end="2"> 
								       
									<div class="tab-pane active" id="vtab${status.index+1}">
									  	
		                                <!-- <h2 style="text-align: center">请针对指标进行打分</h2> -->
									   <!--  <form class="form-horizontal" role="form"> -->
										
										<div class="col-md-8">
												<div style="text-align: center">	  
											  <a><i class="fa fa-magic pr-10"></i>${in.inName} </a>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
												
											   <c:if test="${inNext.inParent == in.inUuid}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.inName}</label>
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option" varStatus="status">
												      <c:if test="${option.inUuid == inNext.inUuid}">
										
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.inUuid}" id="optionsRadios${status.index+1}" value="${option.opValue}">
																${option.opName}&nbsp(${option.opValue}分)
															</label>
														  </div> 
													  
                                                        
												      </c:if> 
													</c:forEach>
													</div>	
													</div><div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
										
									</div>

									</c:forEach> 
         --%>
        
        
		
		
		</div>
		</div>
		<div class="step-list">
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">商业模式概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pd_businessmodel" id="pd_businessmodel"    > </textarea>
                </div>
            </div>
        </div>
       
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">客户概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="bus_customer" id="bus_customer"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">产品概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="bus_product" id="bus_product"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">价格概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="bus_price" id="bus_price"    > </textarea>
                </div>
            </div>
        </div>
		<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">渠道概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="bus_channel" id="bus_channel"    > </textarea>
                </div>
            </div>
        </div>
        
         <c:forEach items="${ins}" var="in" varStatus="status" begin="0" end="0"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;"  name="options${inNext.inUuid}" id="options${inNext.inUuid}" class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option  value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
      
		
		
		</div>
		</div>
		<div class="step-list">
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">总体概况</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="ma_general" id="ma_general"    > </textarea>
                </div>
            </div>
        </div>
       
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">市场特征</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="ma_character" id="ma_character"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">市场环境概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="ma_environment" id="ma_environment"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">市场前景概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="ma_prospect" id="ma_prospect"    > </textarea>
                </div>
            </div>
        </div>
		<div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">政治环境概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="enviro_policy" id="enviro_policy"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">经济环境概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="2" value=" " name="enviro_economy" id="enviro_economy"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">社会环境概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="enviro_culture" id="enviro_culture"    > </textarea>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">技术环境概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="2" value=" " name="enviro_technology" id="enviro_technology"    > </textarea>
                </div>
            </div>
        </div>
        
         <c:forEach items="${ins}" var="in" varStatus="status" begin="3" end="4"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;"  name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
  
	
		
		</div>
		</div>
		<div class="step-list">
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        
         <c:forEach items="${ins}" var="in" varStatus="status" begin="5" end="5"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;"  name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option  value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
  
		
		
		</div>
		</div>
		<div class="step-list">
		
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        
         <c:forEach items="${ins}" var="in" varStatus="status" begin="6" end="6"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;"  name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
  
		
		
		</div>
		
		</div>
		<div class="step-list">
		
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">生产水平概述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pj_production" id="pj_production"    > </textarea>
                </div>
            </div>
        </div>
         <c:forEach items="${ins}" var="in" varStatus="status" begin="7" end="7"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;" name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
  
		
		
		</div>
		
		</div>
		<div class="step-list">
		
		</br>
	    </br>
		<div class="form-container">
		
		
		 
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="subjects">团队描述</label>
                <div class="col-md-9">
                   <textarea cols="77" rows="3" value=" " name="pj_team" id="pj_team"    > </textarea>
                </div>
            </div>
        </div>
         <c:forEach items="${ins}" var="in" varStatus="status" begin="9" end="9"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;" name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>

		</div>
		
		</div>
		<div class="step-list">
		
		</br>
	    </br>
		<div class="form-container">

         <c:forEach items="${ins}" var="in" varStatus="status" begin="8" end="8"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;"name="options${inNext.inUuid}" id="options${inNext.inUuid}" class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option  value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
	
		</div>
		
		</div>
		<div class="step-list">
		</br>
	    </br>
		<div class="form-container">

         <c:forEach items="${ins}" var="in" varStatus="status" begin="1" end="1"> 
        
            <c:forEach items="${inNexts}" var="inNext">
                
                <c:if test="${inNext.inParent == in.inUuid}">
                <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable">${inNext.inName}</label>
                <div class="col-md-9">
                    <select style="width:651px;" name="options${inNext.inUuid}" id="options${inNext.inUuid}"  class="form-control input-sm">
                        <option value="0_请选择">请选择</option>
                        <c:forEach items="${options}" var="option" varStatus="status">
						      <c:if test="${option.inUuid == inNext.inUuid}">
				                     <option value="${option.opValue}_${option.opName}">${option.opName}</option>
						      </c:if> 
						</c:forEach>
                    </select>
               </div>
                 </div>
        </div>
               </c:if>
            </c:forEach>
          
        </c:forEach>
  	
		</div>
		
		<div class="row">
            <div class="form-actions floatRight">
                <input type="submit" value="完成创建" class="btn btn-primary btn-sm">
            </div>
        </div>
		</div>
		
		
		</form>
	</div>

</div>
</br>
	    </br>
<div style="text-align:center;">
<button id="preBtn">上一步</button>
<button id="nextBtn">下一步</button>
<!-- <button id="goBtn">跳转的指定的步骤</button> -->
</div>
<!-- <div style="text-align:center;">
<p>来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div> -->
</div>
</br>
</br>
</br>

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>


</body>
</html>