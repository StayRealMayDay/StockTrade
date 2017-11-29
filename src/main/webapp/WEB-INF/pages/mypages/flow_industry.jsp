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
				<!-- 代码 开始 -->
				 <!-- <div id="firstpane" class="menu_list">
				 	<p class="menu_head current" style="width:240px;"><a href="#">市场资金流向</a></p>
				    <p class="menu_head current" style="width:240px;">板块资金流向</p>
				    <div style="display:block" class=menu_body >
				      <a href="#">地域板块</a>
				      <a href="#">行业板块</a>
				      <a href="#">概念板块</a>
				      
				    </div>
				    <p class="menu_head current" style="width:240px;">个股资金流向</p>
				    <div style="display:block" class=menu_body >
				      <a href="#">净流入额排名</a>
				      <a href="#">金额流入率排名</a>
				      <a href="#">特大单主动流入排名</a>
				      <a href="#">特大单被动流入排名</a>
				      <a href="#">特大单主动流出排名</a>
				      <a href="#">特大单被动流出排名</a>
				    </div>
				    <p class="menu_head current" style="width:240px;">资金路线图</p>
				    <div style="display:block" class=menu_body >
				      <a href="#">地域板块资金路线图</a>
				      <a href="#">行业板块资金路线图</a>
				      <a href="#">概念板块资金路线图</a>
				      <a href="#">个股阶段统计</a>
				    </div>
				    
				</div>
				<script type=text/javascript>
				$(document).ready(function(){
					$("#firstpane .menu_body:eq(0)").show();
					$("#firstpane p.menu_head").click(function(){
						$(this).addClass("current").next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
						$(this).siblings().removeClass("current");
					});
					$("#secondpane .menu_body:eq(0)").show();
					$("#secondpane p.menu_head").mouseover(function(){
						$(this).addClass("current").next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
						$(this).siblings().removeClass("current");
					});
					
				});
				</script>-->
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
						<div style="width:100%;height:320px;border:1px solid #000">
							<div style="width:90%;height:300px;align:center;border:1px solid #000;margin:10px;margin-left:50px" id="capital_flow">
								
							</div>
							
						</div>
						<div class="clearfix"></div>
						
						
						<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane in active" id="brief" aria-labelledby="brief_tab">
									<div class="w3l_stocks">
									
									<div class="box border purple">
										<div class="box-title">
											<h4><i class="fa fa-table"></i>行业资金流向</h4>
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
	        data:['流出量','流入量','净流入量','金额流入率']
	    },
	    grid: {
	        left: '3%',
	        right: '4%',
	        bottom: '3%',
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
	        data: ['','专用设备','中药','交运设备服务','仪器仪表','传媒','保险及其他','光学光电子','公交','公路铁路运输','其他电子','养殖业','农业服务','农产品加工','包装印刷','化学制品','化学制药','化工合成材料','化工新材料','医疗器械服务','医药商业','半导体及元器件','园区开发','国防军工','基础化学','家用轻工','建筑材料','建筑装饰','房地产开发','新材料','景点及旅游','有色冶炼加工','机场航运','汽车整车','汽车零部件','港口航运','煤炭开采','燃气水务','物流','环保工程','生物制品','电力','电子制造','电气设备','白色家电','石油矿业开采','种植业与林业','纺织制造','综合','视听器材','计算机应用','计算机设备','证券','贸易','通信服务','通信设备','通用设备','造纸','酒店及餐饮','采掘服务','钢铁','银行','零售','非汽车交运','食品加工制造','饮料制造']
	    },
	    yAxis: {
	        type: 'value'
	    },
	    series: [
	        {
	            name:'流出量',
	            type:'line',
	            stack: '总量',
	            data:[12938007043,3788069279,2204678761,207835125,251211684,3942177793,9281218624,16357336692,46097556,442922690,2925877290,637740681,138143524,941713133,576663832,4970638751,4765648737,2024654541,1907300621,1273851638,455306528,8129404755,165997969,977137151,1241256072,1175280972,2748030118,6251231294,3445442295,3724617503,480518534,8880844103,949733160,2526693911,2332921923,909721782,1654352600,395402588,1067899070,1319063783,2844329014,1303161754,5214658177,8497601643,5452361367,647306151,172840676,429519759,2706767448,465479917,12144029596,3880855369,6701726110,399945438,3488103333,4542344252,2156989481,537282702,74004247,241804874,2444791175,18504085863,1342115905,156034651,2406783678,6133575146]
	        },
	        {
	            name:'流入量',
	            type:'line',
	            stack: '总量',
	            data:[12522816273,3938019272,2029527436,166293930,202200982,3284979548,10679312233,14956585977,34968795,419107022,2997960654,557403584,89187401,1063873374,393707324,4579000139,3924094869,1889977457,2255999235,1264173929,435129245,8415717509,139819397,869266158,922619846,1215628605,3100586688,3996736893,2436347897,4589870212,512889322,5772063583,1086187828,2406057592,2774047022,519587046,1727172749,299058093,813544026,985724300,2938799515,1042067253,5868028388,9513296725,6102150019,489730838,202721016,294128045,2139181398,577820384,13574223330,3983692700,6032923521,338814372,3149097674,4267724606,1946990226,439165509,122849099,142387544,3890070572,16718450404,957179369,151362229,2326380876,6681842783]
	        },
	        {
	            name:'净流入量',
	            type:'line',
	            stack: '总量',
	            data:[-47502847,-34918205,-9818377,-19728885,-4266201,-44930314,-15165304,-243318545,-768396,-6534777,2361268,-17278201,-3099386,-11947920,-20324489,-48992856,-13598699,-9152735,4525548,940254,-3005313,16722334,-3589245,-10868920,-26954310,-6841853,56802639,-139073655,-80002733,49217043,-2222560,-58146672,-6489583,-25226819,-30034668,-60770810,17677692,-8714747,-21648298,-15216300,-9732270,-33683655,-8475877,-4326904,-35594617,-10336411,226131,-12691482,-65351064,-640918,-25710233,8955220,-65404796,-6346538,-42421225,-54076328,-37372908,-300760,111788,-10586517,264124151,-84564362,-65052173,-1011997,-25744593,-26264588]
	        },
	        {
	            name:'金额流入率',
	            type:'line',
	            stack: '总量',
	            data:[-2.1319675675675676,-4.1126641666666695,-4.189165,-3.592481818181818,-3.437545833333333,-4.652320833333333,0.8683043478260865,-2.291225,-1.6119499999999998,-5.248447826086957,-0.6648588235294121,-4.450754999999999,-3.583677777777778,-3.789763333333333,-5.5449875,-3.9825464788732403,-2.492089610389611,-3.20196,-2.3813000000000004,-2.2382340909090916,0.8315375000000003,-1.0578338983050848,-3.5070799999999998,-2.9474827586206893,-6.290281578947368,-0.14023272727272748,-3.2352525423728813,-5.01190412371134,-4.9720189999999995,1.618853846153847,-3.2041349999999995,-5.834555882352941,-0.06874999999999983,-5.124108333333333,-2.095449411764706,-6.74274,-2.2707124999999997,-5.3633500000000005,-4.594015384615385,-7.447912,-3.4252900000000004,-6.506231666666666,-0.8434210526315788,-0.9924627586206886,-3.3045292682926832,-4.860525,-0.6102312500000002,-3.129652631578947,-7.156291666666665,-1.3850222222222222,-3.4998149253731348,-0.320285,-5.302396874999999,-3.844178571428572,-7.3195250000000005,-3.150334328358208,-3.3771422764227634,-2.4427250000000003,2.636677777777777,-6.145475,6.3983608695652165,-2.55406,-6.12993582089552,-1.2821466666666665,-4.368886046511628,-2.06862
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