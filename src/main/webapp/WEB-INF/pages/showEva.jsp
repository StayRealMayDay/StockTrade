<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />
<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
 --><!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<script type="text/javascript" src="<%=basePath%>/static/uStyle/js/echarts.js"></script>
<script src="<%=basePath%>/static/uStyle/js/echarts.js"></script>
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>


<div class="banner_1">
	<div class="container">
		<div id="search_wrapper1">
		   <div id="search_form" class="clearfix">
		    <h1>Start your job search</h1>
		    <p>
			 <input type="text" class="text" placeholder=" " value="Enter Keyword(s)" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Keyword(s)';}">
			 <input type="text" class="text" placeholder=" " value="Location" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Location';}">
			 <label class="btn2 btn-2 btn2-1b"><input type="submit" value="Find Jobs"></label>
			</p>
           </div>
		</div>
   </div> 
</div>	
<div class="container">
    <div class="single">  
	   <div class="col-md-8 single_right">
	   <div id="main2" style="width: 800px; height: 540px;"></div>
								        <script type="text/javascript">
								        
									// 基于准备好的dom，初始化echarts实例
									var myChart2 = echarts.init(document.getElementById('main2'));
                                     var i=0; 
                                    
									option = {
										    title: {
										        text: '项目评估结果雷达图'
										    },
										    tooltip: {},
										    legend: {
										        data: ['指标', '均值']
										    },
										    radar: {
										        // shape: 'circle',
										        indicator: [
										           { name: '基础投入指标', max: 10},
													{ name: '中间转化指标', max: 10},
													{ name: '实现产业化指标', max: 10},
													{ name: '生产指标', max: 10},
													{ name: '财务指标', max: 10},
													{ name: '团队指标', max: 10},
													{ name: '技术水平', max: 10},
													{ name: '风险指标', max: 10}
										        ]
										    },
										    series: [{
										        name: '指标vs 均值',
										        type: 'radar',
										        // areaStyle: {normal: {}},
										        data : [
										             ${leidatu1} ]}]};
									
									// 使用刚指定的配置项和数据显示图表。
								 	myChart2.setOption(option); 
								</script>
	  
	       <div class="candidates-item">
          	 <h5>评估记录</h5>	
          	 <c:forEach items="${evaluationlist}" var="evaluation" >
	            <div class="candidate_1"> 	
				 <div class="thumb"><img src="<%=basePath%>/static/uStyle/images/pic8.jpg" class="img-responsive" alt=""/></div>
	             <div class="thumb_desc">
				   <h6 class="title"><a href="#">${userMap1[evaluation.evaExpertUuid]}</a></h6>
				   <span class="meta">${evaluation.evaTime}</span>
	               <div class="candidate_but">
	                <p><fmt:formatNumber value="${evaluation.evaValue}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>  </p>
	               </div>
				   <p class="sm_1">专家意见</p>
				</div>
				<div class="clearfix"></div>	
			   </div>
		  </c:forEach>
		   
		</div>
	     
	     
		</div>
       </div>
       <div class="col-md-4">
	   	 <img src="<%= basePath%>/static/uStyle/img/${project.pjLogo}" class="img-responsive" alt=""/>
	  </br>
	  </br></br>
          <table class="condidate_detail">
          	<h3>评估信息</h3>
			<tbody>
			     <tr>
					<td>项目名称</td>
					<td>${project.pjName}</td>
				</tr>
				<tr>
					<td>评估次数</td>
					<td>${project.pjEvatimes}</td>
				</tr>

				<tr>
					<td>专家评估结果</td>
					<td><fmt:formatNumber value="${project.pjManualEvalue}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber> </td>
				</tr>

				<tr>
					<td>评估申请人</td>
					<td>${username}</td>
				</tr>

			</tbody>
		 </table>
       </div>
       <div class="clearfix"> </div>
    </div>
   
</br>
</br>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>
</body>
</html>