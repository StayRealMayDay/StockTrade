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
							<div style="width:90%;height:780px;align:center;border:1px solid #000;margin:10px;margin-left:50px" id="capital_flow">
								
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
		        data: ['北京市','浙江省','上海市','四川省','广东省','福建省','山东省','河南省','湖北省','陕西省','吉林省','内蒙古自治区','海南省','天津市','河北省','广西壮族自治区','--','青海省','黑龙江省','甘肃省','西藏自治区','宁夏回族自治区','贵州省','云南省','辽宁省','江西省','重庆市','湖南省','新疆维吾尔自治区','安徽省','江苏省','山西省']
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
		            	{value:547886706, name:'北京市'},
		            	{value:175197980, name:'浙江省'},
		            	{value:101139025, name:'上海市'},
		            	{value:69197547, name:'四川省'},
		            	{value:68899667, name:'广东省'},
		            	{value:64324166, name:'福建省'},
		            	{value:51336145, name:'山东省'},
		            	{value:41135752, name:'河南省'},
		            	{value:36796014, name:'湖北省'},
		            	{value:27007982, name:'陕西省'},
		            	{value:24415307, name:'吉林省'},
		            	{value:21931040, name:'内蒙古自治区'},
		            	{value:20397612, name:'海南省'},
		            	{value:16623511, name:'天津市'},
		            	{value:15352598, name:'河北省'},
		            	{value:10395283, name:'广西壮族自治区'},
		            	{value:8078446, name:'--'},
		            	{value:7075829, name:'青海省'},
		            	{value:5809372, name:'黑龙江省'},
		            	{value:3905541, name:'甘肃省'},
		            	{value:3366089, name:'西藏自治区'},
		            	{value:2222958, name:'宁夏回族自治区'},
		            	{value:1276425, name:'贵州省'},
		            	{value:630218, name:'云南省'},
		            	{value:340418, name:'辽宁省'}
		                
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
		                
		            	{value: 637507, name:'江西省'},
		            	{value: 791930, name:'重庆市'},
		            	{value: 2121156, name:'湖南省'},
		            	{value: 4202553, name:'新疆维吾尔自治区'},
		            	{value: 11284074, name:'安徽省'},
		            	{value: 18784443, name:'江苏省'},
		            	{value: 32741197, name:'山西省'}
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
		            	{value:547886706, name:'北京市'},
		            	{value:175197980, name:'浙江省'},
		            	{value:101139025, name:'上海市'},
		            	{value:69197547, name:'四川省'},
		            	{value:68899667, name:'广东省'},
		            	{value:64324166, name:'福建省'},
		            	{value:51336145, name:'山东省'},
		            	{value:41135752, name:'河南省'},
		            	{value:36796014, name:'湖北省'},
		            	{value:27007982, name:'陕西省'},
		            	{value:24415307, name:'吉林省'},
		            	{value:21931040, name:'内蒙古自治区'},
		            	{value:20397612, name:'海南省'},
		            	{value:16623511, name:'天津市'},
		            	{value:15352598, name:'河北省'},
		            	{value:10395283, name:'广西壮族自治区'},
		            	{value:8078446, name:'--'},
		            	{value:7075829, name:'青海省'},
		            	{value:5809372, name:'黑龙江省'},
		            	{value:3905541, name:'甘肃省'},
		            	{value:3366089, name:'西藏自治区'},
		            	{value:2222958, name:'宁夏回族自治区'},
		            	{value:1276425, name:'贵州省'},
		            	{value:630218, name:'云南省'},
		            	{value:340418, name:'辽宁省'}
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
		            	{value: 637507, name:'江西省'},
		            	{value: 791930, name:'重庆市'},
		            	{value: 2121156, name:'湖南省'},
		            	{value: 4202553, name:'新疆维吾尔自治区'},
		            	{value: 11284074, name:'安徽省'},
		            	{value: 18784443, name:'江苏省'},
		            	{value: 32741197, name:'山西省'}
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