<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>项目详情</title>
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
<style type="text/css">
.box_2 {
    margin-bottom: 1em;
}

</style>
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
	.right_div{
		    padding-left: 10%;
    		padding-right: 10%;
	}
	.grid_1 {
    padding: 1em 0 2em;
}
.right_div {
    padding-left: 10%;
    padding-right: 10%;
    padding-top: 4%;
}
.box_2 h3, .box_1 h3, .box_3 h3 {
    color: #333;
    font-size: 1.5em;
}
</style>


<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>
<script type="text/javascript">

function addInno(){
	var inno_level = $("#inno_level").val();
	alert(1111111111111);
	var inno_description = $("#inno_description").val();
	var inno_prove = $("#inno_prove").val();
	var inno_product_uuid = $("#inno_product_uuid").val();
	 var result = "";  
	$.ajax({
		type:"post",
		 url:'addInnovation?inno_level='+inno_level+'&inno_description='+inno_description+'&inno_prove='+inno_prove+'&product_uuid='+inno_product_uuid, 
        contentType: "application/json;charset=utf-8",  
        dataType: "json",  
        async: false,//同步  
		beforeSend: function(XMLHttpRequest){
			$("#showInno tbody").html("加载中...");
		},
		success: function(data, textStatus){
			result = eval(data);  
			alert(2222222222222);
			alert(result);
			document.getElementById("addInnovation").style.display="none";
			$("#showInno tbody").html("");
			$("item",data).each(function(i, domEle){
				alert(33333333);
				 $("#showInno tbody").append("<tr><td>" + $(domEle).children("innoLevel").text() + "</td>"+"<td>" + $(domEle).children("innoDescription").text()+ "</td>"+"<td>" + $(domEle).children("innoProve").text()+ "</td></tr>");
				
			});
		},
		complete: function(XMLHttpRequest, textStatus){
			//HideLoading();
		},
		error: function(){
			//请求出错处理
			$("#showInno tbody").html("加载失败,稍后重试...");
		}
});
	
}

</script>

<br/>
<div class="container">
    <div class="single" style="padding-left: 10%; padding-right: 10%; padding-bottom: 20px; margin-top: 5%">  
       <div class="box_1" style="margin-bottom: 0px !important">
       	<h3>${project.pjName}</h3>
        
        <div class="col-md-7 service_box1" style="padding-left: 5%;">
        	<h5>${product.pdType} &nbsp ${product.pdPractical} &nbsp ${project.pjIndustry}</h5>
        	<p>${project.pjBackground} </p>
        	<p>${project.pjShortplan} 
        	</p>
        	<p>${project.pjMlplan} 
        	</p>
        	<h4><a href="/ventureassess/toReport?project_uuid=${project.projectUuid}">系统评估报告</a></h4>
        	<h4><a href="/ventureassess/toShowEva?project_uuid=${project.projectUuid}&&pageNum=1">专家评估记录</a></h4>
        	<h4><a href="/ventureassess/planWord?project_uuid=${project.projectUuid}">生成项目计划书</a></h4>
        	</br>
        </div>
        <div class="col-md-5">
        	<img src="<%= basePath%>/static/uStyle/img/${project.pjLogo}" class="img-responsive" alt=""/>
        </div>
        <div class="clearfix"> </div>
       </div>
       <c:if test="${photos!=null && fn:length(photos) > 0}">
       <h3><p class="fa fa-briefcase"></p> 产品</h3> 
       <div class="grid_1">
       <ul id="flexiselDemo3">
	  <c:forEach items="${photos}" var="photo">
	      <li><img src="<%= basePath%>/static/uStyle/img/${photo.photoUrl}" class="img-responsive" /></li>
	     
<%-- 		  <li><img src="<%= basePath%>/static/uStyle/images/a2.jpg"  class="img-responsive" /></li>
		  <li><img src="<%= basePath%>/static/uStyle/images/a3.jpg"  class="img-responsive" /></li>
		  <li><img src="<%= basePath%>/static/uStyle/images/a4.jpg"  class="img-responsive" /></li>
		  <li><img src="<%= basePath%>/static/uStyle/images/a5.jpg"  class="img-responsive" /></li>
		  <li><img src="<%= basePath%>/static/uStyle/images/a6.jpg"  class="img-responsive" /></li>	 --%>
	   </c:forEach>	  
	   </ul>
	    <script type="text/javascript">
		 $(window).load(function() {
			$("#flexiselDemo3").flexisel({
				visibleItems: 6,
				animationSpeed: 1000,
				autoPlay:false,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	   </script>
	   <script type="text/javascript" src="<%= basePath%>/static/uStyle/js/jquery.flexisel.js"></script>
	 </div>
	 </c:if>
       <p style="color:#444">${product.pdName} </p>
      	 </br>
       <div class="row" >
			<div class="col-sm-6 column_grid">
			<p>产品描述：${product.pdDescription}</p>
			</div>
			<div class="col-sm-6 column_grid">
			<p>产品原理：${product.pdPrinciple}</p>
			</div>
		</div>
        </br>	    
		 <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>技术水平</h3> 
			
				<p style="color:#444">概述：${product.pdTechnology}</p>
				</br>
				<p style="font-size: 0.85em">创新程度：${tech.techInnovatelevel}</p>
				<p style="font-size: 0.85em">技术难度：${tech.techDifficulty}</p>
				<p style="font-size: 0.85em">成熟程度：${tech.techMaturelevel}</p>
				<p style="font-size: 0.85em">技术水平：${tech.techTechlevel}</p>
				<p style="font-size: 0.85em">专利状态：${tech.techPatent}</p>
				<c:if test="${innovations!=null && fn:length(innovations) > 0}">
			    <div id="showInno">
			    <table class="table table-hover">
						<thead>
							<tr>
                                   <th>创新点水平</th>
                                   <th>创新点描述</th>
                                   <th>证明叙述&nbsp</th>
                                  </tr>
						</thead>
						<tbody>
							<c:forEach items="${innovations}" var="innovation">
								<tr>
									<td>${innovation.innoLevel}</td>
									<td>${innovation.innoDescription}</td>
									<td>${innovation.innoProve}</td>
								</tr>
						    </c:forEach>
						</tbody>
				    </table>
			    </div>
			    </c:if>
			    <div style="text-align: right">
			    <input type="button"  value="添加创新点" onclick="document.getElementById('addInnovation').style.display='block'"class="btn btn-primary">
			    <input type="button"  value="收起" onclick="document.getElementById('addInnovation').style.display='none'"class="btn btn-primary">
			    </div>
			    </br>
			    <div id="addInnovation" style="text-align: center;display:none">
			    <div class="form-container">
                    <form id="addInnoform" action="" method="post">
                        <!-- <div class="section-title" align="center">
                            <h3></h3>
                        </div> -->
                         <input  type="hidden" id="inno_product_uuid" name="inno_product_uuid" value="${product.productUuid}" class="form-control" >
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">创新点水平</span>
                                <input  type="text" id="inno_level" name="inno_level" required="required" class="form-control" placeholder="请输入标题...">
                            </div>
                        </div>
                         <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">创新点描述</span>
                                 <textarea style="margin: 0px 100px 0px 0px; width: 816px; height: 230px;" cols="78" rows="10"id="inno_description" name="inno_description"  onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}"> </textarea>
                            </div>
                        </div>
                        <div class="textbox-wrap">
                            <div class="input-group">
                                <span class="input-group-addon ">证明叙述&nbsp</span>
                                 <input  type="text" id="inno_prove" name="inno_prove" style="padding:5px" required="required" class="form-control" placeholder="请输入标题...">
                            </div>
                        </div>
                        <div class="login-btn" align="center">
					   <input type="button"onclick="addInno()" value="添加">
					 
					</div>
                     </form>
                     </div>
			    </div>
		 </div>
		 <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>商业模式</h3> 
			
				<p style="color:#444">概述：${product.pdBusinessmodel}</p>
				</br>
				<div class="row" >
					<div class="col-sm-3 column_grid">
					<p>客户：${bus.busCustomer}</p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>产品：${bus.busProduct}</p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>价格：${bus.busPrice} </p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>渠道：${bus.busChannel} </p>
					</div>
				</div>
	      </br>
		 </div>
		 <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>市场</h3> 
			
				<p style="color:#444">总体概况：${product.pdMarket}</p>
				<p style="color:#444">市场特征：${market.maCharacter}</p>
				</br>
				<p style="font-size: 0.85em">市场环境概述：${market.maEnvironment}</p>
				<div class="row" >
					<div class="col-sm-3 column_grid">
					<p>技术环境：${enviro.enviroTechnology}</p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>政治环境：${enviro.enviroPolicy}</p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>经济环境： ${enviro.enviroEconomy}</p>
					</div>
					<div class="col-sm-3 column_grid">
					<p>社会环境： ${enviro.enviroCulture}</p>
					</div>
				</div>
			<!-- 	 <div style="text-align: right">
			    <input type="button" name="button5" id="insertBtn1" value="添加竞争对手" class="btn btn-primary">
			    </div> -->
				<p style="font-size: 0.85em">市场前景概述：${market.maProspect}</p>
				<!-- <div class="row" >
					<div class="col-sm-4 column_grid">
					<p>市场调查：</p>
					</div>
					<div class="col-sm-4 column_grid">
					<p>市场容量估算： </p>
					</div>
					<div class="col-sm-4 column_grid">
					<p>市场需求： </p>
					</div>
				</div> -->
			    <!-- 
			    <div style="text-align: right">
			    <input type="button" name="button5" id="insertBtn1" value="完善市场调查信息" class="btn btn-primary">
			    <input type="button" name="button5" id="insertBtn1" value="完善市场容量估算" class="btn btn-primary">
			    </div> -->
		 </div>
		  <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>生产水平</h3> 
			
				<p style="color:#444">生产概述：${project.pjProduction}</p>
				</br>
				
		 </div>
		 <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>团队</h3> 
			
				<p style="color:#444">团队描述：${project.pjTeam}</p>
				</br>
				<!-- <div style="text-align: right">
			    <input type="button" name="button5" id="insertBtn1" value="添加团队成员信息" class="btn btn-primary">
			    </div> -->
		 </div>
		<!--  <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>风险</h3> 
			
				<p style="color:#444">风险概述：</p>
				</br>
				<div style="text-align: right">
			    <input type="button" name="button5" id="insertBtn1" value="添加风险项" class="btn btn-primary">
			    </div>
		 </div> -->
		<!--  <div class="box_2">
				<h3  style="margin-bottom: 0.5em;font-size: 1.5em"><p class="fa fa-angle-double-right"></p>企业组织架构</h3> 
			
				<div style="text-align: right">
			    <input type="button" name="button5" id="insertBtn1" value="添加企业组织信息" class="btn btn-primary">
			    </div>
				</br>
				
		 </div> -->
	      <div class="box_3">
       	  <h3><p class="fa fa-briefcase"></p>项目投资人say</h3>
       	  <div class="col-md-6 testimonial">
		    <blockquote>
				<p>团队产品是否具备快速占领市场的特质，并可能形成一定壁垒，如果不能形成一定规模，就会很容易被大公司复制而干掉；风险预测远比市场预期更重要，成功就是看到机会的同时要洞悉危机的存在，活下来才有机会。</p>
			</blockquote>
			<div class="author">
				<figure class="author-img">
					<img src="<%= basePath%>/static/uStyle/images/f2.jpg" class="img-responsive" alt=""/>
				</figure>
				<h6>markjob</h6>
				<span class="author-info">基金经理, XXX投资有限公司</span>
			</div>
		  </div>
		  <div class="col-md-6 testimonial">
		    <blockquote>
				<p>要站在特殊的角度去评断该项目，尤其是注重项目创始人的品行和格局，投资项目其实是投资人；</p>
				<p>专注某一领域，深耕精研，在熟悉的领域成功的可能性会更大；</p>
			</blockquote>
			<div class="author">
				<figure class="author-img">
					<img src="<%= basePath%>/static/uStyle/images/f1.jpg" class="img-responsive" alt=""/>
				</figure>
				<h6>Selina</h6>
				<span class="author-info">基金经理, XXX投资分析有限公司</span>
			</div>
		 </div>
		 <div class="clearfix"> </div>
       </div>
       </div>
       </div>
		
 </br>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

</body>
</html>	
