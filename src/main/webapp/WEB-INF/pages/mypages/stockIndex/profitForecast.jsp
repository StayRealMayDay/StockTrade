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
<title>盈利预测</title>
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

<div >
	<div style="width:90%;margin-left:100px">
		<div style="float:left;width:100%;height:200px">
			<h4><i class="fa fa-table"></i>沪深市场</h4>
			<div style="margin:10px;width:95%" id="hushen"></div>
		</div>
		<div style="float:left;width:100%">
		
			<div class="box border purple">
						<div class="box-title">
							<h4><i class="fa fa-table"></i>个股行情</h4>
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
									<th>股票名称</th>
									<th>预测每股收益平均值</th>
									<th>预测每股收益标准差</th>
									<th>预测主营业务收入平均值</th>
									<th>预测主营业务收入标准差</th>
									<!-- <th>预测息税前利润（EBIT）平均值</th>
									<th>预测息税前利润（EBIT）标准差</th> -->
									<th>预测每股净资产（BPS）平均值</th>
									<th>预测每股净资产（BPS）标准差</th>
									<th>预测利润总额平均值</th>
									<th>预测利润总额标准差</th>
									<th>预测总资产收益率（ROA）平均值</th>
									<th>预测总资产收益率（ROA）标准差</th>
									<!-- <th>预测营业利润平均值</th>
									<th>预测营业利润标准差</th> -->
									<th>一月内净利润调低家数</th>
									<th>一月内净利润调高家数</th>
									<th>一月内净利润维持家数</th>
									<th>预测净利润增长率</th>
									<th>预测主营业务收入增长率</th>
									<th>未来3年净利润复合年增长率</th>
									<th>未来3年主营业务收入复合年增长率</th>
								</tr>
							</thead>
	
							<tbody>
								<c:forEach items="${profitForecast}" var="v" varStatus="sta">
								<tr class="gradeX">
								
								    <td><a href="company?stockNum=${fn:substring(v.stockCode,0,6)}">${v.stockName}</a></td>
									<td>${v.forecastAvePerShare }</td>
									<td>${v.forecastSdPerShare }</td>
									<td>${v.mainAveIncome }</td>
									<td>${v.mainSdIncome }</td>
									<%-- <td>${v.aveEbit }</td>
									<td>${v.sdEbit }</td> --%>
									<td>${v.aveBps }</td>
									<td>${v.sdBps }</td>
									<td>${v.aveProfitTotal }</td>
									<td>${v.sdProfitTotal }</td>
									<td>${v.aveTcapitalRoa }</td>
									<td>${v.sdTcapitalRoa }</td>
									<%-- <td>${v.aveOperationProfit }</td>
									<td>${v.sdOperationProfit }</td> --%>
									<td>${v.onemonthNetDown }</td>
									<td>${v.onemonthNetUp }</td>
									<td>${v.onemonthNetKeep }</td>
									<td>${v.netProfitGrowthRate }</td>
									<td>${v.mainIncomeGrowthRate }</td>
									<td>${v.netProfitGrowthRateCompound }</td>
									<td>${v.mainIncomeGrowthRateCompound }</td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
		</div>
			
	
		<div id="footer-aside" class="box-hover">
			<aside class="widget">
				<div class="adv-footer">
					<a class="banner-bottom-left" href="#"><img class="hover-effect responsive-img" src="placeholders/728x90-banner.jpg" alt="" /></a>
					<a class="banner-bottom-right" href="#"><img class="hover-effect responsive-img ml-10" src="placeholders/220x90/sample-ad-3.jpg" alt="" /></a>
				</div><!--end:adv-footer-->
				<div class="clear"></div>
			</aside>
		</div><!--end:footer-aside-->	
		<footer>
			<div class="wrapper clearfix">
				<p id="copyrights">Copyright © 2012 KopaTheme. All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>   <a id="scroll-to-top" href="#top">Back to top</a>
			</div><!--end:wrapper-->
		</footer>
		</div>
	</div><!--main-content-->
	<script src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
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
	
	<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('hushen'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            tooltip: {},
            legend: {
                data:['销量']
            },
            xAxis: {
                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
            },
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>