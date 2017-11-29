<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<title>产业链中心</title>
<!-- 引入 ECharts 文件 -->
    <script src="<%= basePath%>/static/uStyle/js/echarts.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/china.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/data-1469097271266-SkyrH7CP.json"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
addEventListener("load", function() {
	setTimeout(hideURLbar, 0);
}, false);

function hideURLbar() {
	window.scrollTo(0, 1);
}
</script>


<!-- //for-mobile-apps -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<%-- <script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/echarts.js"></script> --%>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- //js -->
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<script type="text/javascript">
jQuery(document).ready(function($) {
	$(".scroll").click(function(event) {
		event.preventDefault();
		$('html,body').animate({
			scrollTop: $(this.hash).offset().top
		}, 1000);
	});
});
</script>
<!-- start-smoth-scrolling -->

<style type="text/css">
	.tableOne{border:1px solid #DCE5F4;border-collapse:collapse;font-size:12px}
	.tableOne td{border:1px solid #DCE5F4;}
	.tableOne tr{height:30px}
	
	.tableTwo{border:1px solid #DCE5F4;border-collapse:collapse;font-size:12px;text-align:center;}
	.tableTwo td{border:1px solid #DCE5F4;}
	.tableTwo tr{height:30px}
	#myTabContent2{display:block !important;}
	
</style>
		
</head>

<body class="home-page">
<input type="text" name="stock" id="stock" style="display:none" value="${stock}"/>
<input type="text" name="stock" id="stock" style="display:none" value="${fn:substring(beiDouDetail.stockName,5,11)}"/>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sz${fn:substring(beiDouDetail.stockName,5,11)}" charset="utf-8"></script>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sh${fn:substring(beiDouDetail.stockName,5,11)}" charset="utf-8"></script>  
			<script type="text/javascript">
			var stock = document.getElementById('stock').value;
			 /* var ul=window.location.href.split("?")[1].split('=')[1]
			 alert(ul); */
			 /* alert(stock); */
			 var temp=stock.substring(0,1);
			 /* alert(temp); */
			 if(temp=="6"){
				 var url ="hq_str_sh"+stock;
			 }else{
				 var url ="hq_str_sz"+stock;
			 }
			var elements=eval(url).split(",");
			var updown=elements[3]-elements[2];
			var updownratio=updown/elements[2]*100;
			var updown10=elements[2]*0.1;
			var up=Number(elements[2])+Number(updown10);
			var down=Number(elements[2])-Number(updown10);
			var chengjiao=Number(elements[9]).toFixed(0)
			var chengjiaoliang=elements[8];
			var elements1=elements[1];
			var elements2=elements[2];
			var elements3=elements[3];
			var elements4=elements[4];
			var elements5=elements[5];
			$(function () {
				$('#current').html(elements3);
				$('#updownprice').html(updown.toFixed(3));
				$('#updownratio').html(updownratio.toFixed(3));
	 	        $('#updown').html("涨停："+up.toFixed(3)+"跌停："+down.toFixed(3));
	 	        $('#jinkai').html("今开："+elements1);
	 	        $('#zuigao').html("最高："+elements4);
	 	        $('#zuidi').html("最低："+elements5);
	 	        $('#zuoshou').html("昨收："+elements2);
	 	        $('#chengjiaoe').html("成交额："+chengjiao);
	 	       $('#chengjiaoliang').html("成交量："+chengjiaoliang);
	     	});
</script>
	<jsp:include page="/top_q.jsp" flush="true" />

<div class="news-original">
	<div class="container">	
		<nav class="agileinfo_news_original_grids" >
							<ul class="nav nav-tabs nav-tabs1 " style="background-color:#E0F2FA ;width:100%" role="tablist">
								<li style="font-size:18px;width:20%"><h3 style="color:red">产业链中心</h3></li>
								<li role="presentation" class="active">
									<a href="#brief" id="brief_tab" role="tab" data-toggle="tab" aria-controls="briefTab">行情概况</a>
								</li>
								<li role="presentation">
									<a href="#leader" id="leader_tab" role="tab" data-toggle="tab" aria-controls="leaderTab">行业地位</a>
								</li>
								<li role="presentation">
									<a href="#industry" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">行情表现</a>
								</li>
								<li role="presentation">
									<a href="#concept" id="concept_tab" role="tab" data-toggle="tab" aria-controls="conceptTab">行业统计</a>
								</li>
								<li role="presentation">
									<a href="#shareHolder" id="shareHolder_tab" role="tab" data-toggle="tab" aria-controls="shareHolderTab">公司对比</a>
								</li>
							</ul>
						</nav>
		
		<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane in active" id="brief" aria-labelledby="brief_tab">
									<div class="w3l_stocks">
										<div style="background:#F7F7F8;height:30px;text-align:left">无人驾驶产业链全景图--<span></span></div>
										<div>
											<div style="height:500px;width:100%">
												<img style="height:500px;width:100%" src="<%=basePath %>/static/uStyle/img/quanjingtu.png"></img>
											</div>
											
										</div>
										<div style="background:#F7F7F8;height:30px;text-align:left">产业生态图谱--<span></span></div>
										<div>
											<div style="height:500px;width:100%">
												<img style="height:500px;width:100%" src="<%=basePath %>/static/uStyle/img/shengtaitupu.png"></img>
											</div>
											
										</div>
									</div>
								</div>
							<div role="tabpanel" class="tab-pane fade" id="leader" aria-labelledby="leader_tab">
									<div class="w3l_stocks">
										<div style="background:#F7F7F8;height:30px;text-align:center">行业地位--<span></span></div>
										<div>
											<div style="height:20px"></div>
											<div style="height:400px;text-align:center;">
											
											<div style="width: 1090px;height:30px;border:1px;align:center;background:#EEF5FF">
											<b>产业链行业地位对比</b>
											</div>
												<div id="chain" style="width: 1090px;height:400px;border:1px;align:center;">
												</div>
											</div>
											
											<div style="height:50px"></div>
											<table class="tableTwo" style="width:100%">
												<tr>
													<td colspan="11" style="text-align:center;background:#EEF5FF">信息详情</td>
												</tr>
												<tr>
													<td><b>行业名称</b></td>
													<td><b>PE</b></td>
													<td><b>ROE-平均</b></td>
													<td><b>PE-TTM</b></td>
													<td><b>PE预测</b></td>
													<td><b>PB</b></td>
													<td><b>RS</b></td>
													<td><b>ROE-摊薄</b></td>
													<td><b>ROA</b></td>
													<td><b>营业收入增长率</b></td>
													<td><b>净利润增长率</b></td>
												</tr>
												<c:forEach items="${industryStatus}" var="v">
													<tr>
														<td>${v.industryName}</td>
														<td>${v.pe}</td>
														<td>${v.roeAve}</td>
														<td>${v.peTtm}</td>
														<td>${v.peForecast}</td>
														<td>${v.pb}</td>
														<td>${v.ps}</td>
														<td>${v.roeDiluted}</td>
														<td>${v.roa}</td>
														<td>${v.revenueIncreaseRate}</td>
														<td>${v.netprofitGrowthRate}</td>

													</tr>
												</c:forEach>
											</table>
											
									</div>
								</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="industry" aria-labelledby="industry_tab">
									<div class="w3l_stocks">	
										<div style="background:#F7F7F8;height:30px;text-align:center">行情表现--<span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span></div>
											<div style="margin-left:30px">
												<div style="height:20px"></div>
												<div style="height:400px;text-align:center;">
											
												<div style="width: 1000px;height:30px;border:1px;align:center;background:#EEF5FF">
												产业链行业指数涨跌幅
												</div>
												<div id="market" style="width: 1000px;height:400px;border:1px;align:center;">
												</div>
											</div>
												
												
												<div style="height:50px"></div>
												
													<table class="tableTwo" style="width:80%;margin-left:100px">
													<tr style="background:#EEF5FF">
														<td colspan="6" style="text-align:center">信息详情</td>
													</tr>
													<tr>
														<td>行业名称</td>
														<td>近一周涨跌幅(%)</td>
														<td>近一月涨跌幅(%)</td>
														<td>近三月涨跌幅(%)</td>
														<td>本年涨跌幅(%)</td>
														<td>近一年涨跌幅(%)</td>
													</tr>
													<c:forEach items="${marketPerformance}" var="v">
														<tr>
															<td>${v.industryName}</td>
															<td>${v.oneWeek}</td>
															<td>${v.oneMonth}</td>
															<td>${v.threeMonth}</td>
															<td>${v.currentYear}</td>
															<td>${v.oneYear}</td>

														</tr>
													</c:forEach>
												</table>
												
											</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="concept" aria-labelledby="concept_tab">
										<div class="w3l_stocks">	
										<div style="background:#F7F7F8;height:30px;text-align:center">同行业统计--<span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span></div>
											<br>
											<div style="width:100%;height:1150px;">
												<div style="width:100%;height:500px;">
												   <div class="chart" >
													<div style="width:545px;height:500px;float:left;border:1px solid #000" id="china">
													地域分布
													</div>
												  </div>
													<div style="width:545px;height:500px;float:left;border:1px solid #000" id='sectorDistribution'>
													上市板块分布
													</div>
												</div>
												<div style="height:20px;clear:both"></div>
												<div style="width:100%;height:500px;">
													<div style="width:1090px;height:300px;border:1px solid #000" id='pebDistribution'>
													PE/PB分布
													</div>
													<div style="height:20px;clear:both"></div>
													<div style="width:1090px;height:300px;border:1px solid #000" id='balanceDistribution'>
													资产与负债分布
													</div>
												</div>
											</div>
									</div>
									</div>
									
									<div role="tabpanel" class="tab-pane fade" id="shareHolder" aria-labelledby="shareHolder_tab">
									<div class="w3l_stocks">	
										<div style="background:#F7F7F8;height:30px;text-align:center"><span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span>&nbsp;&nbsp;主要股东</div>
										<div style="height:20px"></div>
										<table style="width: 100%; border: 1px solid #000000; text-align: center;" class="tableTwo">
											<thead>
											<tr>
												<th style="text-align: center">股票代码</th>
												<th style="text-align: center">股票简称</th>
												<th style="text-align: center">现价</th>
												<th style="text-align: center">涨跌幅(%)</th>
												<th style="text-align: center">涨跌</th>
												<th style="text-align: center">涨速(%)</th>
												<th style="text-align: center">换手(%)</th>
												<th style="text-align: center">量比</th>
												<th style="text-align: center">振幅(%)</th>
												<th style="text-align: center">成交额</th>
												<th style="text-align: center">流通股</th>
												<th style="text-align: center">流通市值</th>
												<th style="text-align: center">市盈率</th>
						
											</tr>
											</thead>
											<c:forEach items="${stockIndustry}" var="all">
												<tr>
													<td style="text-align: center"><a href="company_detail?beiDou=${all.stockNum}">${all.stockName}</a></td>
													<td style="text-align: center"><a href="company_detail?beiDou=${all.stockNum}">${all.stockNum}</a></td>
													<td style="text-align: center">${all.currentPrice}</td>
													<td style="text-align: center">${all.updownRatio }</td>
													<td style="text-align: center">${all.updownPrice }</td>
													<td style="text-align: center">${all.upSpeed }</td>
													<td style="text-align: center">${all.turnoverRate }</td>
													<td style="text-align: center">${all.equivalentRatio }</td>
													<td style="text-align: center">${all.amplitude}</td>
													<td style="text-align: center">${all.turnVolume}</td>
													<td style="text-align: center">${all.floatingStock}</td>
													<td style="text-align: center">${all.circulationMarketValue}</td>
													<td style="text-align: center">${all.peRatio}</td>
												</tr>
											</c:forEach>	
										</table>
										
									</div>
								</div>
									
									
								</div>
							</div>
		</div>
		<!-- //news-original -->
 <!--footer--> 
	<div class="footer ">
		<div class="container ">
			<ul class="agileits_w3layouts_footer_info ">
				<li><a href="index.jsp ">Home</a><i>|</i></li>
				<li><a href="news.jsp ">Markets</a><i>|</i></li>
				<li><a href="funds.jsp ">mutual funds</a><i>|</i></li>
				<li><a href="commodities.jsp ">commodities</a><i>|</i></li>
				<li><a href="portfolio.jsp ">portfolio</a><i>|</i></li>
				<li><a href="about.jsp ">About Us</a><i>|</i></li>
				<li><a href="ipo.jsp ">IPO</a><i>|</i></li>
				<li><a href="sitemap.jsp ">sitemap</a></li>
			</ul>
			<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank " href="http://sc.chinaz.com/moban/ ">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>
<!-- //footer -->
<!-- stacked-graph -->
	<script type="text/javascript " src="<%=basePath %>/js/raphael.js "></script>
    <script type="text/javascript " src="<%=basePath %>/js/jquery.enumerable.js "></script>
    <script type="text/javascript " src="<%=basePath %>/js/jquery.tufte-graph.js "></script>
	 <script type="text/javascript ">
      $(document).ready(function () {

        jQuery('#stacked-graph').tufteBar({
          data: [
            [[1.5, 1.0, 0.51], {label: '2013'}],
            [[2.0, 1.03, 0.6], {label: '2014'}],
            [[2.4, 0.9,  2.0], {label: '2015'}],
            [[1.5, 2.6, 0.45], {label: '2016'}]
          ],
          barLabel:  function(index) {
            amount = ($(this[0]).sum() * 10000).toFixed(0);
            return '$' + $.tufteBar.formatNumber(amount);
          },
          axisLabel: function(index) { return this[1].label },
          legend: {
            data: ["Finance ", "Metal ", "Telecom "]
          }
        });
      });
    </script>
<!-- //stacked-graph -->
<!-- script for marque -->
	<script>
	  $('.marquee').marquee({
		gap: 100,
		delayBeforeStart: 0,
		direction: 'left',
		duplicated: true,
		pauseOnHover: true
	});
	</script>
	
<!-- //script for marque -->
<!-- Bootstrap Core JavaScript -->
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
	// 基于准备好的dom，初始化echarts实例
       var myChart = echarts.init(document.getElementById('chain'));
       var dataBJ = [
    	   [7.09,16.25,39.79,8],[8.14,14.3,26.33,7.53],[4.54,33.63,47.96,92.02],[12.45,26.22,19.89,304.81],[5.87,12.44,28.65,7.39],[7.93,23.74,33.53,11.55],[6.76,13.89,46.43,11.89],[7.79,24.29,34.08,67.12],[10.89,28.08,29.59,29.88],[9.49,14.36,37,24.11],[6.56,7.48,32.84,10.34],[9.37,7.71,33.28,-57.19],[5.39,13.94,46.48,7.2],[6.09,18.75,53.05,7.19],[8.71,34.4,27.03,26.46],[7.89,22.8,38.92,65.68],[14.51,16.14,31.99,30.78],[6.95,5.69,18.75,16.43],[4.89,8.56,56.65,41.16],[6.47,28,36.59,42.93],[6.17,16.27,52.04,5.78],[7.24,8.38,26.89,-21.32],[8.18,23.16,29.35,18.39],[7.34,25.38,21.28,28.66],[5.27,-3.74,51.54,-35.1],[4.52,8.63,27.17,-36],[7.2,31.63,45.9,49.66],[8.4,29.1,23.85,73.57],[12.69,19.09,19.68,13.66],[7.93,26,41.48,33.08],[5.8,52.27,77.55,10.21],[9.51,57.28,11.48,202.64],[11.04,0.74,6.22,3.99],[6.55,23.36,39.54,43.62],[5.45,14.18,45.82,8.4],[7.24,31.98,40.97,3.33],[8.13,11.73,16.49,7.18],[6.11,13.83,36.79,23.96],[7.71,32.32,33.48,13.67],[6.07,3.34,36.58,5.98],[10.43,51.51,36.44,23.74],[7.26,4.36,20.36,25.96],[7.57,12.01,11.65,9.98],[8.68,28.22,27.68,57.69]
    	];


    	var schema = [
    	    {name: 'date', index: 0, text: '月'},
    	    {name: 'PM25', index: 1, text: 'PM2.5'},
    	    {name: 'AQIindex', index: 2, text: 'AQI指数'},
    	    {name: 'PM10', index: 3, text: 'PM10'},

    	];


    	var itemStyle = {
    	    normal: {
    	        opacity: 0.8,
    	        shadowBlur: 10,
    	        shadowOffsetX: 0,
    	        shadowOffsetY: 0,
    	        shadowColor: 'rgba(0, 0, 0, 0.5)'
    	    }
    	};

    	var option = {
    	    backgroundColor: '#404a59',
    	    color: [
    	        '#dd4444'
    	    ],
    	    legend: {
    	        y: 'top',
    	        data: ['北京'],
    	        textStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        }
    	    },
    	    grid: {
    	        x: '10%',
    	        x2: 150,
    	        y: '18%',
    	        y2: '10%'
    	    },
    	    tooltip: {
    	        padding: 10,
    	        backgroundColor: '#222',
    	        borderColor: '#777',
    	        borderWidth: 1,
    	        formatter: function (obj) {
    	            var value = obj.value;
    	            return '<div style="border-bottom: 1px solid rgba(255,255,255,.3); font-size: 18px;padding-bottom: 7px;margin-bottom: 7px">'
    	                + obj.seriesName + ' ' + obj.name + '月：'
    	                + '</div>'
    	                + schema[2].text + '：' + value[2] + '<br>'
    	                + schema[1].text + '：' + value[1] + '<br>'
    	                + schema[3].text + '：' + value[3] + '<br>';
    	        }
    	    },
    	    xAxis: {
    	        type: 'category',
    	        name: 'ROE-平均',
    	        data: ['7.09', '8.14', '4.54', '12.45', '5.87', '7.93', '6.76', '7.79', '10.89', '9.49', '6.56', '9.37', '5.39', '6.09', '8.71', '7.89', '14.51', '6.95', '4.89', '6.47', '6.17', '7.24', '8.18', '7.34', '5.27', '4.52', '7.2', '8.4', '12.69', '7.93', '5.8', '9.51', '11.04', '6.55', '5.45', '7.24', '8.13', '6.11', '7.71', '6.07', '10.43', '7.26', '7.57', '8.68'],
    	        nameGap: 16,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 14
    	        },
    	        //max: 31,
    	        splitLine: {
    	            show: false
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        }
    	    },
    	    yAxis: {
    	        type: 'value',
    	        name: 'PE',
    	        nameLocation: 'end',
    	        nameGap: 20,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        },
    	        splitLine: {
    	            show: false
    	        }
    	    },
    	    visualMap: [
    	        {
    	            left: 'right',
    	            top: '10%',
    	            dimension: 1,
    	            min: 0,
    	            max: 140,
    	            itemWidth: 30,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['圆形大小：营业收入增长率'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                symbolSize: [10, 70]
    	            },
    	            outOfRange: {
    	                symbolSize: [10, 70],
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        },
    	        {
    	            left: 'right',
    	            bottom: '5%',
    	            dimension: 3,
    	            min: 0,
    	            max: 130,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['明暗：净利润增长率'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                colorLightness: [1, 0.5]
    	            },
    	            outOfRange: {
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        }
    	    ],
    	    series: [
    	        {
    	            name: '产业链行业地位对比',
    	            type: 'scatter',
    	            itemStyle: itemStyle,
    	            data: dataBJ.map(function (item, index) {
    	                item = item.slice();
    	                item[0] = index;
    	                return item;
    	            })
    	        },

    	    ]
    	};
    // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option);
</script>

<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart1 = echarts.init(document.getElementById('market'));
       var labelTag = true;
       var resultData = {
           "times": ["影视传媒", "新能源汽车", "稀土", "钛白粉", "超导材料", "智能家居", "VR", "OLED", "机器人", "医药生物", "飞机制造", "畜牧养殖", "体育", "无人机", "环保", "智能手表", "食品饮料", "高铁", "量子通信", "石墨烯", "智能手机", "无人驾驶", "3D打印", "核电", "网络安全", "风电", "蓝宝石", "建筑材料", "人工智能", "大数据", "芯片", "煤炭", "金融", "锂电池", "电子竞技", "LED节能灯", "PPP", "光伏", "物联网", "教育", "物流", "房地产", "消费金融", "大健康"],
           "totalGDPs": ["2.28", "3.18", "3.53", "3.35", "2.53", "3.36", "3.74", "4.53", "2.78", "2.32", "2.01", "-2.06", "2.58", "1.68", "2.2", "3.84", "2.28", "0.85", "4.64", "3.85", "3.8", "3.92", "2.77", "2.36", "6.06", "2.32", "4.98", "1.7", "4.63", "3.64", "7.55", "4.41", "0.55", "2.64", "1.72", "3.76", "1.41", "3.11", "4.22", "2.67", "0.65", "1.21", "2.4", "3.16"],
           "increaseGDPs": ["-23.71", "-7.84", "-1.09", "0.99", "-16.8", "-12.14", "-16.14", "3.61", "-13.74", "1.12", "-18.83", "-11.64", "-26.72", "-15.42", "-7.8", "-7.36", "46.48", "-7.91", "-0.58", "-8.23", "-20.64", "-11.21", "-17.09", "-10.8", "-18.3", "-10.81", "4.72", "4.5", "-10.25", "-20.04", "46.08", "-1.66", "2.75", "-1.28", "-24.3", "-11.83", "-9.69", "-7.36", "-15.29", "-15.7", "-11.77", "-10.94", "5.48", "-10.07"]
       };

       function label() {
           if (labelTag) {
               return {
                   normal: {
                       show: true,
                       formatter: function(param) {
                           return param.value + '%'
                       },
                       position: 'top'
                   }
               }
           } else {
               return {
                   normal: {
                       show: false
                   }
               }
           }

       }

       function label2() {
           if (labelTag) {
               return {
                   normal: {
                       show: true,
                       formatter: function(param) {
                           return param.value + '%'
                       },
                       position: 'top'
                   }
               }
           } else {
               return {
                   normal: {
                       show: false
                   }
               }
           }

       }

       function xAxis() {
           return [{
               type: 'category',
               axisLabel: {
                   interval: 2
               },

               inverse: true,
               data: resultData.times
           }]
       }
      var option = {
           title: [{
               text: "",
               left: 'center',
               textStyle: {
                   color: "#454545",
                   fontSize: 10,
                   fontWeight: 'bold'
               }
           }, {
               text: '单位：%',
               right: 10,
               textStyle: {
                   color: "#006486",
                   fontSize: 12,
                   fontWeight: 'normal'
               }
           }],
           tooltip: {
               trigger: 'axis',
               formatter: function(params) {
                   console.log(params)
                   return params[0].name + '<br/>' + params[0].seriesName + ': ' + params[0].value + '%'+ '<br/>' + params[1].seriesName + ': ' + params[1].value + '%'
               }
           },
           legend: {
               data: ['近一周涨跌幅', '近一年涨跌幅'],
               selectedMode: true,
               bottom: 'bottom'
           },
           xAxis: xAxis(),
           yAxis: [{
               type: 'value',
               splitLine: {
                   show: true,
                   lineStyle: {
                       color: '#006486',
                       width: 1,
                       type: 'dashed'
                   }
               },
               min: 0,
               interval: 500,
               axisLabel: {
                   formatter: '{value}%'
               }
           }, {
               type: 'value',
               splitLine: {
                   show: false,
                   lineStyle: {
                       color: '#006486',
                       width: 1,
                       type: 'dashed'
                   }
               },
               interval: 10,
               axisLabel: {
                   formatter: '{value}%'
               }
           }],
           series: [{
               showAllSymbol: true, //当使用interval隔断时，显示所有的数据
               name: '近一周涨跌幅',
               type: 'line',
               label: label(),
               data: resultData.totalGDPs
           }, {
               name: '近一年涨跌幅',
               type: 'bar',
               barMaxWidth: '30px',
               label: label2(),
               yAxisIndex: 1,
               data: resultData.increaseGDPs
           }]
       }
    // 使用刚指定的配置项和数据显示图表。
      myChart1.setOption(option);
</script>

<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart2 = echarts.init(document.getElementById('sectorDistribution'));
       var option = {
    		    title : {
    		        text: '上市板块分布',
    		       /*  subtext: '纯属虚构', */
    		        x:'center'
    		    },
    		    tooltip : {
    		        trigger: 'item',
    		        formatter: "{a} <br/>{b} : {c} ({d}%)"
    		    },
    		    legend: {
    		        orient: 'vertical',
    		        left: 'left',
    		        data: ['沪市主板','深市主板','中小板','创业板','新三板']
    		    },
    		    series : [
    		        {
    		            name: '上市板块',
    		            type: 'pie',
    		            radius : '55%',
    		            center: ['50%', '60%'],
    		            data:[
    		                {value:10, name:'沪市主板'},
    		                {value:8, name:'深市主板'},
    		                {value:5, name:'中小板'},
    		                {value:6, name:'创业板'},
    		                {value:0, name:'新三板'}
    		            ],
    		            itemStyle: {
    		                emphasis: {
    		                    shadowBlur: 10,
    		                    shadowOffsetX: 0,
    		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
    		                }
    		            }
    		        }
    		    ]
    		};
    // 使用刚指定的配置项和数据显示图表。
       myChart2.setOption(option);
</script>

    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('china'));
        var chinaContourUrl = "static/uStyle/js/data-1469097271266-SkyrH7CP.json";
        var stock = document.getElementById('stock').value;
        
       //alert("daima"+stock);
        $.getJSON(chinaContourUrl, function (json) {
            echarts.registerMap('china-contour', json);
            
            myChart.setOption({
                geo: [{
                    map: 'china',
                    itemStyle: {
                        normal: {
                            borderWidth: 2,
                            shadowBlur: 50,
                            shadowColor: 'rgba(0, 0, 0, 0.2)',
                            borderColor: '#aaa',
                        }
                    }
                }]
            });
        });
        /* var uploadedDataURL = "asset/get/s/data-1487164546975-SyiFER-Yg.txt";
 */
        

        function randomData() {
            return Math.round(Math.random()*1000);
        }
		
 		$.getJSON('http://localhost:8080/Stock-Trade/getIndusDistri?stock='+stock, function (json) {
 			
 			
 			myChart.setOption( option = {
            title: {
                text: '本行业在全国各地分布情况',
                subtext: '空间分布图',
                left: 'center'
            },
            tooltip: {
                trigger: 'item'
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data:['2017年']
            },
            visualMap: {
                min: 0,
                max: 50,
                left: 'left',
                top: 'bottom',
                text: ['高','低'],           // 文本，默认为数值文本
                calculable: true,
                inRange: {
                        color: [ '#e0f3f8', '#ffffbf', '#fee090', '#fdae61', '#f46d43', '#d73027', '#a50026']
                    }
            },
            toolbox: {
                show: true,
                orient: 'vertical',
                left: 'right',
                top: 'center',
                feature: {
                    dataView: {readOnly: false},
                    restore: {},
                    saveAsImage: {}
                }
            },
            series: [
                {
                    name: '2016年',
                    type: 'map',
                    mapType: 'china',
                    roam: false,
                    label: {
                        normal: {
                            show: true
                        },
                        emphasis: {
                            show: true
                        }
                    },
                    data:json
                },
                
                
            ]
        } );
 	});
 		$('.chart').resize(function () {
 		    myChart.resize();
 		});
    </script>
    <script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart3 = echarts.init(document.getElementById('pebDistribution'));
       var dataBJ = [
    	    [201312, 72, 99, 82],
    	    [201401, 92, 118, 104],
    	    [201402, 130, 158, 115],
    	    [201403, 83, 115, 121],
    	    [201404, 55, 90, 89],
    	    [201405, 54, 85, 82],
    	    [201406, 48, 74, 27],
    	    [201407, 75, 105, 33],
    	    [201408, 56, 83, 31],
    	    [201409, 59, 84, 35],
    	    [201410, 103, 132, 68],
    	    [201411, 86, 116, 102],
    	    [201412, 58, 87, 81],
    	    [201501, 89, 118, 70],
    	    [201502, 83, 116, 65],
    	    [201503, 78, 112, 122],
    	    [201504, 63, 93, 83],
    	    [201505, 50, 80, 73],
    	    [201506, 52, 81, 45],
    	    [201507, 52, 77, 44],
    	    [201508, 40, 64, 47],
    	    [201509, 41, 63, 43],
    	    [201510, 60, 87, 54],
    	    [201511, 100, 121, 39],
    	    [201512, 134, 167, 68],
    	    [201601, 60, 88, 50],
    	    [201602, 46, 68, 45],
    	    [201603, 84, 116, 93],
    	    [201604, 58, 90, 87],
    	    [201605, 49, 80, 66],
    	    [201606, 53, 80, 42],
    	    [201607, 59, 84, 33],
    	    [201608, 40, 62, 37],
    	    [201609, 47, 69, 40],
    	    [201610, 70, 102, 49],
    	    [201611, 90, 121, 94],
    	    [201612, 105, 133, 66]
    	];


    	var schema = [
    	    {name: 'date', index: 0, text: '月'},
    	    {name: 'PM25', index: 1, text: 'PM2.5'},
    	    {name: 'AQIindex', index: 2, text: 'AQI指数'},
    	    {name: 'PM10', index: 3, text: 'PM10'},

    	];


    	var itemStyle = {
    	    normal: {
    	        opacity: 0.8,
    	        shadowBlur: 10,
    	        shadowOffsetX: 0,
    	        shadowOffsetY: 0,
    	        shadowColor: 'rgba(0, 0, 0, 0.5)'
    	    }
    	};

    	var option = {
    	    backgroundColor: '#404a59',
    	    color: [
    	        '#dd4444'
    	    ],
    	    legend: {
    	        y: 'top',
    	        data: [''],
    	        textStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        }
    	    },
    	    grid: {
    	        x: '10%',
    	        x2: 150,
    	        y: '18%',
    	        y2: '10%'
    	    },
    	    tooltip: {
    	        padding: 10,
    	        backgroundColor: '#222',
    	        borderColor: '#777',
    	        borderWidth: 1,
    	        formatter: function (obj) {
    	            var value = obj.value;
    	            return '<div style="border-bottom: 1px solid rgba(255,255,255,.3); font-size: 18px;padding-bottom: 7px;margin-bottom: 7px">'
    	                + obj.seriesName + ' ' + obj.name + '月：'
    	                + '</div>'
    	                + schema[2].text + '：' + value[2] + '<br>'
    	                + schema[1].text + '：' + value[1] + '<br>'
    	                + schema[3].text + '：' + value[3] + '<br>';
    	        }
    	    },
    	    xAxis: {
    	        type: 'category',
    	        name: '月份',
    	        data: ['201312', '201401', '201402', '201403', '201404', '201405', '201406', '201407', '201408', '201409', '201410', '201411', '201412', '201501', '201502', '201503','201504', '201505', '201506', '201507', '201508', '201509', '201510', '201511', '201512', '201601', '201602', '201603', '201604', '201605', '201606', '201607', '201608', '201609', '201610', '201611', '201612'],
    	        nameGap: 16,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 14
    	        },
    	        //max: 31,
    	        splitLine: {
    	            show: false
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        }
    	    },
    	    yAxis: {
    	        type: 'value',
    	        name: 'AQI指数',
    	        nameLocation: 'end',
    	        nameGap: 20,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        },
    	        splitLine: {
    	            show: false
    	        }
    	    },
    	    visualMap: [
    	        {
    	            left: 'right',
    	            top: '10%',
    	            dimension: 1,
    	            min: 0,
    	            max: 140,
    	            itemWidth: 30,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['圆形大小：PM2.5'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                symbolSize: [10, 70]
    	            },
    	            outOfRange: {
    	                symbolSize: [10, 70],
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        },
    	        {
    	            left: 'right',
    	            bottom: '5%',
    	            dimension: 3,
    	            min: 0,
    	            max: 130,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['明暗：PM10'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                colorLightness: [1, 0.5]
    	            },
    	            outOfRange: {
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        }
    	    ],
    	    series: [
    	        {
    	            name: '北京',
    	            type: 'scatter',
    	            itemStyle: itemStyle,
    	            data: dataBJ.map(function (item, index) {
    	                item = item.slice();
    	                item[0] = index;
    	                return item;
    	            })
    	        },

    	    ]
    	};
    // 使用刚指定的配置项和数据显示图表。
      myChart3.setOption(option);
</script>
    
    <script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart4 = echarts.init(document.getElementById('balanceDistribution'));
       var dataBJ = [
    	    [201312, 72, 99, 82],
    	    [201401, 92, 118, 104],
    	    [201402, 130, 158, 115],
    	    [201403, 83, 115, 121],
    	    [201404, 55, 90, 89],
    	    [201405, 54, 85, 82],
    	    [201406, 48, 74, 27],
    	    [201407, 75, 105, 33],
    	    [201408, 56, 83, 31],
    	    [201409, 59, 84, 35],
    	    [201410, 103, 132, 68],
    	    [201411, 86, 116, 102],
    	    [201412, 58, 87, 81],
    	    [201501, 89, 118, 70],
    	    [201502, 83, 116, 65],
    	    [201503, 78, 112, 122],
    	    [201504, 63, 93, 83],
    	    [201505, 50, 80, 73],
    	    [201506, 52, 81, 45],
    	    [201507, 52, 77, 44],
    	    [201508, 40, 64, 47],
    	    [201509, 41, 63, 43],
    	    [201510, 60, 87, 54],
    	    [201511, 100, 121, 39],
    	    [201512, 134, 167, 68],
    	    [201601, 60, 88, 50],
    	    [201602, 46, 68, 45],
    	    [201603, 84, 116, 93],
    	    [201604, 58, 90, 87],
    	    [201605, 49, 80, 66],
    	    [201606, 53, 80, 42],
    	    [201607, 59, 84, 33],
    	    [201608, 40, 62, 37],
    	    [201609, 47, 69, 40],
    	    [201610, 70, 102, 49],
    	    [201611, 90, 121, 94],
    	    [201612, 105, 133, 66]
    	];


    	var schema = [
    	    {name: 'date', index: 0, text: '月'},
    	    {name: 'PM25', index: 1, text: 'PM2.5'},
    	    {name: 'AQIindex', index: 2, text: 'AQI指数'},
    	    {name: 'PM10', index: 3, text: 'PM10'},

    	];


    	var itemStyle = {
    	    normal: {
    	        opacity: 0.8,
    	        shadowBlur: 10,
    	        shadowOffsetX: 0,
    	        shadowOffsetY: 0,
    	        shadowColor: 'rgba(0, 0, 0, 0.5)'
    	    }
    	};

    	var option = {
    	    backgroundColor: '#404a59',
    	    color: [
    	        '#dd4444'
    	    ],
    	    legend: {
    	        y: 'top',
    	        data: ['北京'],
    	        textStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        }
    	    },
    	    grid: {
    	        x: '10%',
    	        x2: 150,
    	        y: '18%',
    	        y2: '10%'
    	    },
    	    tooltip: {
    	        padding: 10,
    	        backgroundColor: '#222',
    	        borderColor: '#777',
    	        borderWidth: 1,
    	        formatter: function (obj) {
    	            var value = obj.value;
    	            return '<div style="border-bottom: 1px solid rgba(255,255,255,.3); font-size: 18px;padding-bottom: 7px;margin-bottom: 7px">'
    	                + obj.seriesName + ' ' + obj.name + '月：'
    	                + '</div>'
    	                + schema[2].text + '：' + value[2] + '<br>'
    	                + schema[1].text + '：' + value[1] + '<br>'
    	                + schema[3].text + '：' + value[3] + '<br>';
    	        }
    	    },
    	    xAxis: {
    	        type: 'category',
    	        name: '月份',
    	        data: ['201312', '201401', '201402', '201403', '201404', '201405', '201406', '201407', '201408', '201409', '201410', '201411', '201412', '201501', '201502', '201503','201504', '201505', '201506', '201507', '201508', '201509', '201510', '201511', '201512', '201601', '201602', '201603', '201604', '201605', '201606', '201607', '201608', '201609', '201610', '201611', '201612'],
    	        nameGap: 16,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 14
    	        },
    	        //max: 31,
    	        splitLine: {
    	            show: false
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        }
    	    },
    	    yAxis: {
    	        type: 'value',
    	        name: 'AQI指数',
    	        nameLocation: 'end',
    	        nameGap: 20,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        },
    	        splitLine: {
    	            show: false
    	        }
    	    },
    	    visualMap: [
    	        {
    	            left: 'right',
    	            top: '10%',
    	            dimension: 1,
    	            min: 0,
    	            max: 140,
    	            itemWidth: 30,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['圆形大小：PM2.5'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                symbolSize: [10, 70]
    	            },
    	            outOfRange: {
    	                symbolSize: [10, 70],
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        },
    	        {
    	            left: 'right',
    	            bottom: '5%',
    	            dimension: 3,
    	            min: 0,
    	            max: 130,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['明暗：PM10'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                colorLightness: [1, 0.5]
    	            },
    	            outOfRange: {
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        }
    	    ],
    	    series: [
    	        {
    	            name: '北京',
    	            type: 'scatter',
    	            itemStyle: itemStyle,
    	            data: dataBJ.map(function (item, index) {
    	                item = item.slice();
    	                item[0] = index;
    	                return item;
    	            })
    	        },

    	    ]
    	};
    // 使用刚指定的配置项和数据显示图表。
      myChart4.setOption(option);
</script>
    
</body>
</html>