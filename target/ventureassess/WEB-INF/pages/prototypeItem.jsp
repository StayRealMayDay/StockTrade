<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.vcevaluation.pojo.User" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	User user = (User)request.getSession().getAttribute("user");
	String username = "";
	if (user!=null){
		username = user.getUser_name();
	}
%>
<!DOCTYPE html>
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<title>样机详情</title>
	<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
	<meta name="author" content="htmlcoder.me">

	<!-- Mobile Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
       <jsp:include page="/head.jsp" flush="true"/>
       <script type="text/javascript"
	src="<%=basePath%>/static/adStyle/global/js/jquery-1.9.1.min.js"></script>
	   <script type="text/javascript" src="<%=basePath%>/static/adStyle/global/js/echarts.min.js"></script>
       <script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
	</head>

	<!-- body classes: 
			"boxed": boxed layout mode e.g. <body class="boxed">
			"pattern-1 ... pattern-9": background patterns for boxed layout mode e.g. <body class="boxed pattern-1"> 
	-->
	<body>
		<!-- scrollToTop -->
		<!-- ================ -->
		<div class="scrollToTop"><i class="icon-up-open-big"></i></div>

		<!-- page wrapper start -->
		<!-- ================ -->
		<div class="page-wrapper">

        <jsp:include page="/header1.jsp" flush="true"/>
        
			<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">首页</a></li>
								<li><i class="fa fa-reply-all"></i><a href="">查看所有样机</a></li>
								<li class="active">样机详情</li>
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

							<!-- page-title start -->
							<!-- ================ -->
							<h1 class="page-title margin-top-clear">样机展示</h1>
							<!-- page-title end -->
							<div class="row">
								<div class="col-md-7">
									<h3>${result.res_name}</h3>
									<div class="separator-2"></div>
									<p>${result.res_introduction}</p>
								</div>
								<div class="col-md-5">
									<!-- Nav tabs -->
									<ul class="nav nav-pills white space-top" role="tablist">
										<li class="active"><a href="#portfolio-images" role="tab" data-toggle="tab" title="images"><i class="fa fa-camera pr-5"></i> Photo</a></li>
									</ul>
									<!-- Tab panes -->
									<div class="tab-content clear-style">
										<div class="tab-pane active" id="portfolio-images">
											
											<c:if test="${fn:length(ups) > 0}">
											<div class="owl-carousel content-slider-with-controls">
										         <c:forEach var="up" items="${ups}">
										            <div class="overlay-container">
													   <img src="<%= basePath%>/static/adStyle/img/${up.upload_name}" alt="" style="height:300px">
													   <a href="<%= basePath%>/static/adStyle/img/${up.upload_name}" class="popup-img overlay" title="image title"><i class="fa fa-search-plus"></i></a>
												    </div>
										         </c:forEach>
                                             </div>
                                            </c:if>
                                            <c:if test="${fn:length(ups) == 0}">
                                            <div class="owl-carousel content-slider-with-controls">
												<div class="overlay-container">
													<img src="<%=basePath %>/static/projectstyle/images/portfolio-item-1.jpg" alt="" style="height:300px">
													<a href="<%=basePath %>/static/projectstyle/images/portfolio-item-1.jpg" class="popup-img overlay" title="image title"><i class="fa fa-search-plus"></i></a>
												</div>
												<div class="overlay-container">
													<img src="<%=basePath %>/static/projectstyle/images/portfolio-item-2.jpg" alt="" style="height:300px">
													<a href="<%=basePath %>/static/projectstyle/images/portfolio-item-2.jpg" class="popup-img overlay" title="image title"><i class="fa fa-search-plus"></i></a>
												</div>
												<div class="overlay-container">
													<img src="<%=basePath %>/static/projectstyle/images/portfolio-item-3.jpg" alt="" style="height:300px">
													<a href="<%=basePath %>/static/projectstyle/images/portfolio-item-3.jpg" class="popup-img overlay" title="image title"><i class="fa fa-search-plus"></i></a>
												</div> 
												</div>
												<%if(user.getUser_type()==1){%>
												<button id="uploadmodal" class="btn btn-sm" data-toggle="modal" data-target="#myModal">上传图片</button>
												<p><h4>暂时还没有样品图片，快来上传吧</h4><%-- <a href="/vcevaluation/toUploadProtoImage?res_id=${result.res_id}" class="btn btn-white margin-top-clear"></a> --%></p>
												<%}%>
											</c:if>
										
										
										</div>
										
									</div>
								</div>
							</div>
							<hr>
							<div class="row">
								<div class="col-md-3 col-xs-12">
									<h3>样品详情</h3>
									<ul class="list">
                                        <li><strong class="vertical-divider">申请人 </strong><a href=" #">${user.user_name}</a></li>		
                                        <li><strong class="vertical-divider">附件 </strong>文件名
											 <a href="<%=basePath %>/download?upload_id=${result.res_url}">下载</a></li>
                                        <c:if test="${prototype.pt_entity==1}">
										   <li><strong class="vertical-divider">有无样品实体 </strong> 有样机</li>
										</c:if>
										<c:if test="${prototype.pt_entity==0}">
										   <li><strong class="vertical-divider">有无样品实体 </strong> 无样机，有设计图</li>
										</c:if>
										
										<c:if test="${prototype.pt_market==1}">
										   <li><strong class="vertical-divider">市场选择策略 </strong> 密集性市场策略</li>
										</c:if>
										<c:if test="${prototype.pt_market==2}">
										   <li><strong class="vertical-divider">市场选择策略 </strong> 产品专业化策略</li>
										</c:if>
										<c:if test="${prototype.pt_market==3}">
										   <li><strong class="vertical-divider">市场选择策略</strong> 市场专业化策略</li>
										</c:if>
										<c:if test="${prototype.pt_market==4}">
										   <li><strong class="vertical-divider">市场选择策略 </strong> 有选择的专业化策略</li>
										</c:if>
										<c:if test="${prototype.pt_market==5}">
										   <li><strong class="vertical-divider">市场选择策略</strong> 全部市场策略</li>
										</c:if>
										
										<c:if test="${prototype.pt_product==1}">
										   <li><strong class="vertical-divider">将来的产品定位 </strong> 奢侈品</li>
										</c:if>
										<c:if test="${prototype.pt_product==2}">
										   <li><strong class="vertical-divider">将来的产品定位</strong> 高端产品</li>
										</c:if>
										<c:if test="${prototype.pt_product==3}">
										   <li><strong class="vertical-divider">将来的产品定位 </strong> 行业针对性产品</li>
										</c:if>
										<c:if test="${prototype.pt_product==4}">
										   <li><strong class="vertical-divider">将来的产品定位 </strong> 必需品</li>
										</c:if>
										
										<li><strong class="vertical-divider">预期价格 </strong>${prototype.pt_price}</li>		
										
										<c:if test="${prototype.pt_safety==1}">
										   <li><strong class="vertical-divider">安全属性</strong> 属于食品行业，对安全属性要求最高</li>
										</c:if>
										<c:if test="${prototype.pt_safety==2}">
										   <li><strong class="vertical-divider">安全属性</strong> 属于其他对安全属性要求较高的领域</li>
										</c:if>
										<c:if test="${prototype.pt_safety==3}">
										   <li><strong class="vertical-divider">安全属性</strong> 不属于安全性要求高的领域</li>
										</c:if>
										
										<c:if test="${prototype.pt_compete==1}">
										   <li><strong class="vertical-divider">市场竞争性</strong> 所属领域为垄断性</li>
										</c:if>
										<c:if test="${prototype.pt_compete==2}">
										   <li><strong class="vertical-divider">市场竞争性</strong> 同类型产品竞争激烈</li>
										</c:if>
										<c:if test="${prototype.pt_compete==3}">
										   <li><strong class="vertical-divider">市场竞争性</strong> 同类型产品竞争不激烈</li>
										</c:if>
										
										<c:if test="${prototype.pt_ditch==1}">
										   <li><strong class="vertical-divider">渠道特性</strong> 销售渠道集中</li>
										</c:if>
										<c:if test="${prototype.pt_ditch==2}">
										   <li><strong class="vertical-divider">渠道特性</strong> 销售渠道分散</li>
										</c:if>
										<!-- 写到这里 -->
										
										<c:if test="${prototype.pt_aimgroup==1}">
										   <li><strong class="vertical-divider">目标群体</strong> 专业人员</li>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==2}">
										   <li><strong class="vertical-divider">目标群体</strong> 高端人士</li>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==3}">
										   <li><strong class="vertical-divider">目标群体</strong> 普通大众</li>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==4}">
										   <li><strong class="vertical-divider">目标群体</strong> 中小企业</li>
										</c:if>
										<c:if test="${prototype.pt_aimgroup==5}">
										   <li><strong class="vertical-divider">目标群体</strong> 大型企业</li>
										</c:if>
									</ul>
								</div>
							 	<div class="col-md-3 col-xs-12">
									<h3>评估信息</h3>
									<ul class="list">
										<c:if test="${result.res_flag==1}">
										<li><strong class="vertical-divider">评估状态</strong>待评估</li>
										</c:if>
										<c:if test="${result.res_flag==2}">
										<li><strong class="vertical-divider">评估状态</strong>评估截至</li>
										</c:if>
										<li><strong class="vertical-divider">评估截止时间</strong>${result.res_eva_deadline}</li>
										<li><strong class="vertical-divider">评估次数 </strong> ${result.res_times}</li>
										<li><strong class="vertical-divider">评估均值</strong>${result.res_evalue}</li>
									</ul>
										<c:if test="${result.res_flag==1}" >
								        <%if(user.getUser_type()==0){%>
								        <p>根据上述样品信息进行评估</p>
										<a href="/vcevaluation/toEva_prototype?res_id=${result.res_id}" class="btn btn-white margin-top-clear">开始评估</a>
										
								        <%}%>
								        </c:if>
								        <c:if test="${result.res_flag==2}" >
										<div class="col-md-6 col-xs-12">
										<h2>
													<c:if test="${result.res_evalue>=7}">
													<p>评估通过<i class="fa fa-check"></i></p>
													</c:if>
													<c:if test="${result.res_evalue<7}">
													<p>评估未通过<i class="fa fa-close"></i></p>
													</c:if>
										</h2>			
										</div>
										</c:if>
								   
								</div> 
								
								<div class="col-md-6 col-xs-12">
								<div id="main1" style="width: 600px; height: 400px;"></div>
								        <script type="text/javascript">
								        
									// 基于准备好的dom，初始化echarts实例
									var myChart1 = echarts.init(document.getElementById('main1'));
                                     var i=0; 
                                    
									option = {
										    title: {
										        text: '样机评估结果雷达图'
										    },
										    tooltip: {},
										    legend: {
										        data: ['指标', '实际开销（Actual Spending）']
										    },
										    radar: {
										        // shape: 'circle',
										        indicator: [
										           { name: '客户', max: 10},
													{ name: '产品', max: 10},
													{ name: '价格', max: 10},
													{ name: '渠道', max: 10},
													{ name: '创新程度', max: 10},
													{ name: '技术难度', max: 10},
													{ name: '成熟程度', max: 10},
													{ name: '技术水平', max: 10},
													{ name: '专利状态', max: 10},
													{ name: '市场环境', max: 10},
													{ name: '市场前景', max: 10}
										        ]
										    },
										    series: [{
										        name: '预算 vs 开销（Budget vs spending）',
										        type: 'radar',
										        // areaStyle: {normal: {}},
										        data : [
										             ${leidatu1} ]}]};
									
									// 使用刚指定的配置项和数据显示图表。
								 	myChart1.setOption(option); 
								</script>
								
								</div>
								
								
								
								<!-- Modal -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
											<h4 class="modal-title" id="myModalLabel">给样机上传图片</h4>
											<form name="Form5" action="/vcevaluation/uploadProtoImage1" method="post"  enctype="multipart/form-data">
											   
											    <input type="hidden" id="res_idInput" name="res_id" value="${result.res_id}">
											    
											   <input type="file" name="file" accept="image/*">
											   <input type="submit" id="BtDelet" value="上传图片"/>
											   <c:forEach var="up" items="${ups}" begin="0" end="0">
											    <img src="<%=basePath %>/static/adStyle/img/${up.upload_name}"  alt="Head Portraits"/>
											    </c:forEach>
											</form>
										</div>
										<div class="modal-body">
										
                                            		 							
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-sm btn-dark" data-dismiss="modal">关闭</button>
										</div>
									</div>
								</div>
							</div> 
								<!-- <div class="col-md-6 col-xs-12">
									<h3>More info</h3>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>
									<form role="form">
										<div class="form-group has-feedback">
											<input type="email" class="form-control" id="exampleInputEmail3" placeholder="Email">
											<i class="fa fa-envelope-o form-control-feedback"></i>
										</div>
										<a href="#" class="btn btn-white margin-top-clear">Subscribe</a>
									</form>
								</div> -->
							</div>
						</div>
						<!-- main end -->
					
					</div>
				</div>
			</section>
			<!-- main-container end -->


       <jsp:include page="/footer1.jsp" flush="true"/>
	</body>
</html>
