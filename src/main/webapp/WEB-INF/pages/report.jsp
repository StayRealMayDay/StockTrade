<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.stock.pojo.User"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title>查看评估报告</title>
	<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/css/cv.css">
	<script type="text/javascript" src="<%=basePath%>/static/uStyle/js/echarts.js"></script>
     <script src="<%=basePath%>/static/uStyle/js/echarts.js"></script>
	<style type="text/css">
	.p_table2 td {
    padding-left: 15px;
}
.width_12p {
    width: 20%;
}
</style>
</head>

<body>
	<div style="background-color:#eee">
	<div class="p_main">
	 	<div class="p_head">
	 	  <div >
			    <h4 style="text-align: center;font-size: 28px;">项目评估报告</h4>
			    </div>
	 	
	 		评估提交时间  ${project.pjProtime}
	 	</div>
	 	<div class="p_content">
			<!--个人信息 start-->
			<p class="p_title">项目基本信息</p>
			<table class="p_table2" style=" float:left">
				<tbody>
					<tr>
						<td class="width_12p text_right" style="width: 12%;">项目名称： </td>
						<td class="width_25p ">${project.pjName}</td>
						<td class="width_12p text_right" style="width: 12%;">产品类型：</td>
						<td class="width_25p">${product.pdType}</td>
						
					</tr>
					<tr>
						<td class="width_12p text_right" style="width: 12%;">进展阶段：</td>
						<td class="width_25p ">${project.pjPeriod}</td>
						<td class="width_12p text_right" style="width: 12%;">行业：</td>
						<td class="width_25p">${project.pjIndustry}</td>
						
					</tr>
					<tr>
						<td class="width_12p text_right" style="width: 12%;">产品名称：</td>
						<td class="width_25p ">${product.pdName}</td>
						<td class="width_12p text_right" style="width: 12%;">产品实用性：</td>
						<td class="width_25p">${product.pdPractical}</td>
						
					</tr>
					<tr>
						<td class="width_12p text_right" style="width: 12%;">评估申请人：</td>
						<td class="width_25p ">${userMap[project.userUuid]}</td>
						<td class="width_12p text_right" style="width: 12%;">综合得分：</td>
						<td class="width_25p"><fmt:formatNumber type="number" value="${project.pjAutoEvalue}" maxFractionDigits="2"/></td>
						
					</tr>
				</tbody>
			</table>        
			<!--个人信息 end -->
			
			<br>
			
			<c:forEach items="${ins}" var="in" begin="2" end="2"> 
	        <!--奖励活动 start-->
			<p class="p_title">${in.inName}  (该项总分： <fmt:formatNumber type="number" value="${recordMap[in.inUuid]}" maxFractionDigits="2"/>)</p>
			<table class="p_table2">
				<tbody>
				<tr>
						<td class="width_12p text_right"></td>
						<td></td>
						<td rowspan="16">
								<div id="main2" style="width: 488px; height: 318px;"></div>
								        <script type="text/javascript">
								        
									// 基于准备好的dom，初始化echarts实例
									var myChart2 = echarts.init(document.getElementById('main2'));
                                     var i=0; 
                                    
                                     option = {
                                    		    title: {
                                    		        text: '项目评估结果雷达图'
                                    		    },
                                    		    tooltip: {
                                    		        trigger: 'axis'
                                    		    },
                                    		    legend: {
                                    		        x: 'center',
                                    		        data:['指标']
                                    		    },
                                    		    radar: [
                                    		        {
                                    		            indicator: [
                                    		                {text: '商业模式', min:5,max: 10},
                                    		                {text: '风险指标', min:5, max: 10},
                                    		                {text: '技术水平', min:5, max: 10},
                                    						{text: '市场环境', min:5, max: 10},
                                    						{text: '市场前景', min:5, max: 10},
                                    						{text: '产业化', min:5, max: 10},
                                    						{text: '组织与管理', min:5, max: 10},
                                    						{text: '生产', min:5, max: 10},
                                    						{text: '财务', min:5, max: 10},
                                    						{text: '团队', min:5, max: 10}
                                    		            ],
                                    		            center: ['50%','55%'],
                                    		            radius: 110
                                    		        },
                                    		        
                                    		    ],
                                    		    series: [
                                    		        {
                                    		            type: 'radar',
                                    		             tooltip: {
                                    		                trigger: 'item'
                                    		            },
                                    		            itemStyle: {normal: {areaStyle: {type: 'default'}}},
                                    		            data: [
                                    		                {
                                    		                    value: ${valueString},
                                    		                    name: '指标'
                                    		                }
                                    		            ]
                                    		        },
                                    		       
                                    		        
                                    		    ]
                                    		};
									
									// 使用刚指定的配置项和数据显示图表。
								 	myChart2.setOption(option); 
								</script>
						</td>
					</tr>
				<c:forEach items="${evas}" var="eva">
											
					 <c:if test="${eva.in_parent == in.inUuid}">
					<tr>
	                	<td class=" width_12p text_right">${eva.in_name}:</td>
	                	<td>${eva.op_name}</td>
	                	
	              	</tr>
	               	</c:if> 
	             </c:forEach> 
				
	             
	            </tbody>
			</table>
	        <!--活动奖励 end-->
	        
	        <br>
	        </c:forEach>
	        
	        <c:forEach items="${ins}" var="in" begin="0" end="0"> 
	        <!--奖励活动 start-->
			<p class="p_title">${in.inName}  (该项总分：<fmt:formatNumber type="number" value="${recordMap[in.inUuid]}" maxFractionDigits="2"/>)</p>
			<table class="p_table2">
				<tbody>
				 <c:forEach items="${evas}" var="eva">
											
					 <c:if test="${eva.in_parent == in.inUuid}">
					<tr>
	                	<td class=" width_12p text_right">${eva.in_name}:</td>
	                	<td>${eva.op_name}</td>
	              	</tr>
	               	</c:if> 
	             </c:forEach> 	
	            
	            </tbody>
			</table>
	        <!--活动奖励 end-->
	      
	        <br>
	        </c:forEach>
	        
	        <c:forEach items="${ins}" var="in" begin="3" end="9"> 
	        <!--奖励活动 start-->
			<p class="p_title">${in.inName} (该项总分：<fmt:formatNumber type="number" value="${recordMap[in.inUuid]}" maxFractionDigits="2"/>)</p>
			<table class="p_table2">
				<tbody>
				 <c:forEach items="${evas}" var="eva">
											
					 <c:if test="${eva.in_parent == in.inUuid}">
					<tr>
	                	<td class=" width_12p text_right">${eva.in_name}:</td>
	                	<td>${eva.op_name}</td>
	              	</tr>
	               	</c:if> 
	             </c:forEach> 	
	            
	              
	            </tbody>
			</table>
	        <!--活动奖励 end-->
	        
	        
	        <br>
	        </c:forEach>
	        
	        
	        <c:forEach items="${ins}" var="in" begin="1" end="1"> 
	        <!--奖励活动 start-->
			<p class="p_title">${in.inName} (该项总分：<fmt:formatNumber type="number" value="${recordMap[in.inUuid]}" maxFractionDigits="2"/>)</p>
			<table class="p_table2">
				<tbody>
				 <c:forEach items="${evas}" var="eva">
											
					 <c:if test="${eva.in_parent == in.inUuid}">
					<tr>
	                	<td class=" width_12p text_right">${eva.in_name}:</td>
	                	<td>${eva.op_name}</td>
	              	</tr>
	               	</c:if> 
	             </c:forEach> 	
	            
	            </tbody>
			</table>
	        <!--活动奖励 end-->
	        
	        <br>
	        </c:forEach>
	        
	   		<div class="clear"></div>
	   		
	 	</div> 
	</div>
</div>


<!-- START NetEase Devilfish 2006 -->
<script src="./cv_files/ntes.js" type="text/javascript"></script>
<script type="text/javascript">
_ntes_nacc = "hr";
neteaseTracker();
</script>
<!-- END NetEase Devilfish 2006 -->


</body></html>