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
						<div style="width:100%;height:800px;border:1px solid #000">
							<div style="width:98%;height:780px;align:center;border:1px solid #000;margin:10px;" id="capital_flow">
								
							</div>
							
						</div>
						<div class="clearfix"></div>
						<div id="myTabContent2" class="tab-content">
								
					   </div>
						<div class="clearfix"></div>
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
		        text: '漏斗图',
		        subtext: '纯属虚构',
		        left: 'left',
		        top: 'bottom'
		    },
		    tooltip: {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c}"
		    },
		    toolbox: {
		        orient: 'vertical',
		        top: 'center',
		        feature: {
		            dataView: {readOnly: false},
		            restore: {},
		            saveAsImage: {}
		        }
		    },
		    legend: {
		        orient: 'vertical',
		        left: 'left',
		        data: ['光学光电子','建筑装饰','银行','房地产开发','证券','综合','零售','港口航运','有色冶炼加工','通信设备','化学制品','','传媒','通信服务','通用设备','白色家电','专用设备','电力','汽车零部件','基础化学','饮料制造','食品加工制造','计算机应用','汽车整车','物流','包装印刷','交运设备服务','养殖业','环保工程','保险及其他','化学制药','纺织制造','农产品加工','国防军工','采掘服务','石油矿业开采','中药','生物制品','化工合成材料','燃气水务','电子制造','家用轻工','公路铁路运输','机场航运','贸易','电气设备','仪器仪表','园区开发','农业服务','医药商业','景点及旅游','非汽车交运','公交','视听器材','造纸','酒店及餐饮','种植业与林业','医疗器械服务','其他电子','化工新材料','计算机设备','半导体及元器件','煤炭开采','新材料','建筑材料','钢铁']
		    },
		    calculable: true,
		    series: [
		        {
		            name: '漏斗图',
		            type: 'funnel',
		            width: '40%',
		            height: '45%',
		            left: '5%',
		            top: '50%',
		            data:[
		            	{value: 243318545, name:'光学光电子'},
		            	{value: 139073655, name:'建筑装饰'},
		            	{value: 84564362, name:'银行'},
		            	{value: 80002733, name:'房地产开发'},
		            	{value: 65404796, name:'证券'},
		            	{value: 65351064, name:'综合'},
		            	{value: 65052173, name:'零售'},
		            	{value: 60770810, name:'港口航运'},
		            	{value: 58146672, name:'有色冶炼加工'},
		            	{value: 54076328, name:'通信设备'},
		            	{value: 48992856, name:'化学制品'},
		            	{value: 47502847, name:''},
		            	{value: 44930314, name:'传媒'},
		            	{value: 42421225, name:'通信服务'},
		            	{value: 37372908, name:'通用设备'},
		            	{value: 35594617, name:'白色家电'},
		            	{value: 34918205, name:'专用设备'},
		            	{value: 33683655, name:'电力'},
		            	{value: 30034668, name:'汽车零部件'},
		            	{value: 26954310, name:'基础化学'},
		            	{value: 26264588, name:'饮料制造'},
		            	{value: 25744593, name:'食品加工制造'},
		            	{value: 25710233, name:'计算机应用'},
		            	{value: 25226819, name:'汽车整车'},
		            	{value: 21648298, name:'物流'},
		            	{value: 20324489, name:'包装印刷'},
		            	{value: 19728885, name:'交运设备服务'},
		            	{value: 17278201, name:'养殖业'},
		            	{value: 15216300, name:'环保工程'},
		            	{value: 15165304, name:'保险及其他'},
		            	{value: 13598699, name:'化学制药'},
		            	{value: 12691482, name:'纺织制造'},
		            	{value: 11947920, name:'农产品加工'},
		            	{value: 10868920, name:'国防军工'},
		            	{value: 10586517, name:'采掘服务'},
		            	{value: 10336411, name:'石油矿业开采'},
		            	{value: 9818377, name:'中药'},
		            	{value: 9732270, name:'生物制品'},
		            	{value: 9152735, name:'化工合成材料'},
		            	{value: 8714747, name:'燃气水务'},
		            	{value: 8475877, name:'电子制造'},
		            	{value: 6841853, name:'家用轻工'},
		            	{value: 6534777, name:'公路铁路运输'},
		            	{value: 6489583, name:'机场航运'},
		            	{value: 6346538, name:'贸易'},
		            	{value: 4326904, name:'电气设备'},
		            	{value: 4266201, name:'仪器仪表'},
		            	{value: 3589245, name:'园区开发'},
		            	{value: 3099386, name:'农业服务'},
		            	{value: 3005313, name:'医药商业'},
		            	{value: 2222560, name:'景点及旅游'},
		            	{value: 1011997, name:'非汽车交运'},
		            	{value: 768396, name:'公交'},
		            	{value: 640918, name:'视听器材'},
		            	{value: 300760, name:'造纸'}
		                
		            ]
		        },
		        {
		            name: '金字塔',
		            type: 'funnel',
		            width: '40%',
		            height: '45%',
		            left: '5%',
		            top: '5%',
		            sort: 'ascending',
		            data:[
		            	{value: 111788, name:'酒店及餐饮'},
		            	{value: 226131, name:'种植业与林业'},
		            	{value: 940254, name:'医疗器械服务'},
		            	{value: 2361268, name:'其他电子'},
		            	{value: 4525548, name:'化工新材料'},
		            	{value: 8955220, name:'计算机设备'},
		            	{value: 16722334, name:'半导体及元器件'},
		            	{value: 17677692, name:'煤炭开采'},
		            	{value: 49217043, name:'新材料'},
		            	{value: 56802639, name:'建筑材料'},
		            	{value: 264124151, name:'钢铁'}
		            	
		            ]
		        },
		        {
		            name: '漏斗图',
		            type:'funnel',
		            width: '40%',
		            height: '45%',
		            left: '55%',
		            top: '5%',
		            label: {
		                normal: {
		                    position: 'left'
		                }
		            },
		            data:[
		            	{value: 243318545, name:'光学光电子'},
		            	{value: 139073655, name:'建筑装饰'},
		            	{value: 84564362, name:'银行'},
		            	{value: 80002733, name:'房地产开发'},
		            	{value: 65404796, name:'证券'},
		            	{value: 65351064, name:'综合'},
		            	{value: 65052173, name:'零售'},
		            	{value: 60770810, name:'港口航运'},
		            	{value: 58146672, name:'有色冶炼加工'},
		            	{value: 54076328, name:'通信设备'},
		            	{value: 48992856, name:'化学制品'},
		            	{value: 47502847, name:''},
		            	{value: 44930314, name:'传媒'},
		            	{value: 42421225, name:'通信服务'},
		            	{value: 37372908, name:'通用设备'},
		            	{value: 35594617, name:'白色家电'},
		            	{value: 34918205, name:'专用设备'},
		            	{value: 33683655, name:'电力'},
		            	{value: 30034668, name:'汽车零部件'},
		            	{value: 26954310, name:'基础化学'},
		            	{value: 26264588, name:'饮料制造'},
		            	{value: 25744593, name:'食品加工制造'},
		            	{value: 25710233, name:'计算机应用'},
		            	{value: 25226819, name:'汽车整车'},
		            	{value: 21648298, name:'物流'},
		            	{value: 20324489, name:'包装印刷'},
		            	{value: 19728885, name:'交运设备服务'},
		            	{value: 17278201, name:'养殖业'},
		            	{value: 15216300, name:'环保工程'},
		            	{value: 15165304, name:'保险及其他'},
		            	{value: 13598699, name:'化学制药'},
		            	{value: 12691482, name:'纺织制造'},
		            	{value: 11947920, name:'农产品加工'},
		            	{value: 10868920, name:'国防军工'},
		            	{value: 10586517, name:'采掘服务'},
		            	{value: 10336411, name:'石油矿业开采'},
		            	{value: 9818377, name:'中药'},
		            	{value: 9732270, name:'生物制品'},
		            	{value: 9152735, name:'化工合成材料'},
		            	{value: 8714747, name:'燃气水务'},
		            	{value: 8475877, name:'电子制造'},
		            	{value: 6841853, name:'家用轻工'},
		            	{value: 6534777, name:'公路铁路运输'},
		            	{value: 6489583, name:'机场航运'},
		            	{value: 6346538, name:'贸易'},
		            	{value: 4326904, name:'电气设备'},
		            	{value: 4266201, name:'仪器仪表'},
		            	{value: 3589245, name:'园区开发'},
		            	{value: 3099386, name:'农业服务'},
		            	{value: 3005313, name:'医药商业'},
		            	{value: 2222560, name:'景点及旅游'},
		            	{value: 1011997, name:'非汽车交运'},
		            	{value: 768396, name:'公交'},
		            	{value: 640918, name:'视听器材'},
		            	{value: 300760, name:'造纸'}
		            ]
		        },
		        {
		            name: '金字塔',
		            type:'funnel',
		            width: '40%',
		            height: '45%',
		            left: '55%',
		            top: '50%',
		            sort: 'ascending',
		            label: {
		                normal: {
		                    position: 'left'
		                }
		            },
		            data:[
		            	{value: 111788, name:'酒店及餐饮'},
		            	{value: 226131, name:'种植业与林业'},
		            	{value: 940254, name:'医疗器械服务'},
		            	{value: 2361268, name:'其他电子'},
		            	{value: 4525548, name:'化工新材料'},
		            	{value: 8955220, name:'计算机设备'},
		            	{value: 16722334, name:'半导体及元器件'},
		            	{value: 17677692, name:'煤炭开采'},
		            	{value: 49217043, name:'新材料'},
		            	{value: 56802639, name:'建筑材料'},
		            	{value: 264124151, name:'钢铁'}
		            ]
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