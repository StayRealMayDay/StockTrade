<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>资金流向</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<!-- 于花蕾 2017年9月27 -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet"type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet"type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<script src="<%=basePath %>/js/bootstrap.min.js"></script>
<!-- 引入 ECharts 文件 -->
    <script src="<%= basePath%>/static/uStyle/js/echarts.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
<!-- STYLESHEETS --><!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/css/cloud-admin.css" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/themes/default.css" id="skin-switcher" >
	<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/responsive.css" >
	
	<link href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	<!-- JQUERY UI-->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css" />
	<!-- DATE RANGE PICKER -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
	<!-- DATA TABLES -->
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/css/jquery.dataTables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/assets/css/datatables.min.css" />
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/css/TableTools.min.css" />
	<link href="<%= basePath%>/static/media/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-skins.min.css" />
	<script src="<%= basePath%>/static/media/assets/js/ace-extra.min.js"></script>
	<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />
<style type="text/css">
	#myTabContent2{display:block !important;}
</style>
<link rel="shortcut icon" href="<%=basePath %>/images/favicon.ico" />
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.carouFredSel-5.6.2.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.sticky.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-scroller-v1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/kendo.web.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/custom.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
<link rel=stylesheet type=text/css href="<%= basePath%>/static/uStyle/css/lrtk.css">

</head>
<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#qwertyui").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}
</script>

<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#myTabContent").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}

</script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
			$(".div2").click(function(){ 
				$(this).next("div").slideToggle("slow")  
				.siblings(".div3:visible").slideUp("slow");
			});
		});
</script>

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />
	<div style="height:1000px;margin-left:50px">
		<div  style="margin-left:6%">
			<div class="left">
			<jsp:include page="/left_flow.jsp" flush="true" />
				
			</div> 
				<!-- 代码 结束 -->
			
			<div class="secondary" style="width:75%;height:600px">
				<div class="row">
					<div id="content" class="col-lg-12">
						<div class="row">
							<div class="col-sm-12">							
									<ul class="breadcrumb">
										<li><i class="fa fa-home"></i> <a href="#">市场资金流向概览>>></a>
										</li>
										
									</ul>
									<!-- /BREADCRUMBS -->
							</div>
						</div>

						<div id="filter-controls" class="btn-group"  style="margin-bottom: 2%">
							<form class="form-inline">
								<div class="form-group">
									<label for="projectName">股票名称：</label> <input id="projectName"
										type="text" class="form-control" placeholder="股票名称">

								</div>
								<button class="btn btn-primary">搜索</button>
							</form>
						</div>
						<div style="width:100%;height:250px;border:1px solid #000">
							<div style="width:60%;height:230px;float:left;border:1px solid #000;margin:10px" id="capital_flow">
								
							</div>
							<div style="width:35%;height:230px;float:left;border:1px solid #000;margin:10px">
								<table style="width:90%;border-collapse:separate; border-spacing:0px 10px;margin-left:20px">
									<tr style="background-color:#F0FFFF;">
										<th>   </th>
										<th>沪深300</th>
										<th>沪A</th>
										<th>深A</th>
									</tr>
									<tr>
										<td>净流入</td>
										<td>68只</td>
										<td>290只</td>
										<td>397只</td>
									</tr>
									<tr>
										<td>净流出</td>
										<td>219只</td>
										<td>1023只</td>
										<td>1531只</td>
									</tr>
									<tr>
										<td>主力流入</td>
										<td>85只</td>
										<td>328只</td>
										<td>531只</td>
									</tr>
									<tr>
										<td>主力流出</td>
										<td>198只</td>
										<td>628只</td>
										<td>896只</td>
									</tr>
									<tr>
										<td>散户流入</td>
										<td>91只</td>
										<td>406只</td>
										<td>601只</td>
									</tr>
									<tr>
										<td>散户流出</td>
										<td>196只</td>
										<td>907只</td>
										<td>1327只</td>
									</tr>
								</table>
							</div>
						</div>
						<div class="clearfix"></div>
						
						<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane in active" id="brief" aria-labelledby="brief_tab">
									<div class="w3l_stocks">
									
									<div class="box border purple">
										<div class="box-title">
											<h4><i class="fa fa-table"></i>概念资金流向</h4>
											<div class="tools hidden-xs">
												<a href="#box-config" data-toggle="modal" class="config">
													<i class="fa fa-cog"></i>
												</a>
												<a href="javascript:;" class="reload">
													<i class="fa fa-refresh"></i>
												</a>
												<a href="javascript:;" class="collapse">
													<i class="fa fa-chevron-up"></i>
												</a>
												<a href="javascript:;" class="remove">
													<i class="fa fa-times"></i>
												</a>
											</div>
										</div>
									<div class="box-body">
										<table id="datatable1" cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>编号</th>
													<th>行业</th>
													<th>现价</th>
													<th>涨跌幅（%）</th>
													<th>大单流入资金/万</th>
													<th>大单流出资金/万</th>
													<th>净流入量/股</th>
													<th>金额流入率</th>
													
													
												</tr>
											</thead>

											<tbody>
												<c:forEach items="${capitalFlows}" var="v" varStatus="sta">
												<tr class="gradeX">
												    <td>${sta.index+1}</td>
													<td><a href="#" title="点击查看行业详情">${v.company.industry}</a></td>
													<td><font color="red">${v.currentPrice}</font></td>
													<td><font color="red">${v.updownRate}</font></td>
													<td><font color="red">${v.flowinMoney}</font></td>
													<td>${v.flowoutMoney}</td>
													<td><font color="red">${v.netFlowinCount}</font></td>
													<td>${v.dayFlowinRate}</td>
												</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
										
										
									</div>
								</div>
								
					   </div>
						
						
						<div class="clearfix"></div>
						<nav class="agileinfo_news_original_grids" >
							<ul class="nav nav-tabs nav-tabs1 " style="background-color:#E0F2FA ;width:100%" role="tablist">
								<li style="font-size:18px;width:20%">个股资金</li>
								<li role="presentation" class="active">
									<a href="#jingliuru" id="brief_tab" role="tab" data-toggle="tab" aria-controls="briefTab">净流入排名</a>
								</li>
								<li role="presentation">
									<a href="#zhuli" id="leader_tab" role="tab" data-toggle="tab" aria-controls="leaderTab">主力净流入排名</a>
								</li>
								<li role="presentation">
									<a href="#tedadanactive" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">特大单主动流入排名</a>
								</li>
								<li role="presentation">
									<a href="#tedadanpassitive" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">特大单被动流入排名</a>
								</li>
								<li role="presentation">
									<a href="#dadanactive" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">大单主动流入排名</a>
								</li>
								<li role="presentation">
									<a href="#dadanpassitive" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">大单被动流入排名</a>
								</li>
							</ul>
						</nav>
						
						<div role="tabpanel" class="tab-pane" id="jingliuru" aria-labelledby="brief_tab">
									<div class="w3l_stocks">
										<div>
											<div style="height:20px"></div>
											<table style="font-size:20px;align:center;width:90%">
															<tr>
																<th></th>
																<th>板块名称</th>
																<th>均价</th>
																<th>涨跌幅</th>
																<th>流入资金/万</th>
																<th>流出资金/万</th>
																<th>净流入/万</th>
																<th>净流出/万</th>
															</tr>
															<tr style="text-align:centre">
																<td></td><td>15:00</td><td >16.30</td><td>1591</td><td>卖出</td><td >16.30</td><td>1591</td><td>卖出</td>
															</tr>
															<tr>
																<td></td><td>15:00</td><td>16.30</td><td>1591</td><td>卖出</td><td >16.30</td><td>1591</td><td>卖出</td>
															</tr>
															<tr>
																<td></td><td>15:00</td><td>16.30</td><td>1591</td><td>卖出</td><td >16.30</td><td>1591</td><td>卖出</td>
															</tr>
															<tr>
																<td></td><td>15:00</td><td>16.30</td><td>1591</td><td>卖出</td><td >16.30</td><td>1591</td><td>卖出</td>
															</tr>
															<tr>
																<td></td><td>15:00</td><td>16.30</td><td>1591</td><td>卖出</td><td >16.30</td><td>1591</td><td>卖出</td>
															</tr>
															
														</table>
										</div>
									</div>
						</div>
						
					</div>
				</div>
			</div>
		</div>		
	</div>
<script src="<%=basePath %>/js/bootstrap.min.js "></script>
<script>
$(document).ready(function(){
    $(".dropdown ").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast ");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast ");
            $(this).toggleClass('open');       
        }
    );
});
</script>
 <script type="text/javascript">
//基于准备好的dom，初始化echarts实例
 var myChart = echarts.init(document.getElementById('capital_flow'));
 var option = {
	    title: {
	        text: '资金流向折线图'
	    },
	    tooltip: {
	        trigger: 'axis'
	    },
	    legend: {
	        data:['净流入量','流入量','流入金额','流出量','流出金额']
	    },
	    grid: {
	        left: '3%',
	        right: '5%',
	        bottom: '2%',
	        containLabel: true
	    },
	    toolbox: {
	        feature: {
	            saveAsImage: {}
	        }
	    },
	    xAxis: {
	        type: 'category',
	        boundaryGap: false,
	        data: ['周一','周二','周三','周四','周五']
	    },
	    yAxis: {
	        type: 'value'
	    },
	    series: [
	        {
	            name:'净流入量',
	            type:'line',
	            stack: '总量',
	            data:[-12546, 344168, 230168, -15640, 42017]
	        },
	        {
	            name:'流入量',
	            type:'line',
	            stack: '总量',
	            data:[345892, 454531, 569261, 158910, 235210]
	        },
	        {
	            name:'流入金额',
	            type:'line',
	            stack: '总量',
	            data:[518838, 909062, 740039, 222474, 376336]
	        },
	        {
	            name:'流出量',
	            type:'line',
	            stack: '总量',
	            data:[333346, 110363, 339093, 174550, 193193]
	        },
	        {
	            name:'流出金额',
	            type:'line',
	            stack: '总量',
	            data:[333346, 110363, 339093, 174550, 193193]
	        }
	    ]
	};
	//使用刚指定的配置项和数据显示图表。
	 myChart.setOption(option);
</script>

	<script src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/assets/js/datatables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/TableTools.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/ZeroClipboard.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/my.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("dynamic_table");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<script src="<%=basePath %>/js/bootstrap.min.js"></script>
</body>

</html>