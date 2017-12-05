<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<head>
<title>个股</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<!-- //for-mobile-apps -->
<%-- <link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" /> --%>
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- //js -->
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<!-- start-smoth-scrolling -->
<link rel=stylesheet type=text/css href="<%= basePath%>/static/uStyle/css/lrtk.css">
<style type="text/css">
	#myTabContent2{display:block !important;}
</style>
			
<!-- 引入 ECharts 文件 -->
    <script src="<%= basePath%>/static/uStyle/js/echarts.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>

</head>
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
<body class="home-page">
<input type="text" name="stock" id="stock" style="display:none" value="${company.stockNum}"/>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sz${company.stockNum}" charset="utf-8"></script>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sh${company.stockNum}" charset="utf-8"></script>  
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
			var elements1=elements[1];
			var elements2=elements[2];
			var elements3=elements[3];
			var elements4=elements[4];
			var elements5=elements[5];
			var updown=elements[3]-elements[2];
			var updownratio=updown/elements[2]*100;
			var updown10=elements[2]*0.1;
			var up=Number(elements[2])+Number(updown10);
			var down=Number(elements[2])-Number(updown10);
			var chengjiao=Number(elements[9]).toFixed(0);
			var chengjiaoliang=elements[8];
			var elements10=elements[10];
			var elements11=elements[11];var elements12=elements[12];var elements13=elements[13];var elements14=elements[14];var elements15=elements[15];
			var elements16=elements[16];var elements17=elements[17];var elements18=elements[18];var elements19=elements[19];var elements20=elements[20];
			var elements21=elements[21];var elements22=elements[22];var elements23=elements[23];var elements24=elements[24];var elements25=elements[25];
			var elements26=elements[26];var elements27=elements[27];var elements28=elements[28];var elements29=elements[29];
			$(function () {
				$('#current').html(elements3);
				$('#updownprice').html(updown.toFixed(3));
				$('#updownratio').html(updownratio.toFixed(3));
	 	        $('#updown').html("涨停："+up.toFixed(3)+"跌停："+down.toFixed(3));
	 	        $('#jinkai').html("今开："+elements1);
	 	        $('#zuigao').html("最高："+elements4);
	 	        $('#zuidi').html("最低："+elements5);
	 	        $('#zuoshou').html("昨收："+elements2);
	 	        $('#chengjiaoliang').html("成交量："+chengjiaoliang);
	 	        $('#chengjiaoe').html("成交额："+chengjiao);
	 	        $('#fivehandicapbuy').html("<p>买一	--	<font color='red'>"+elements11+"</font>"+"	--	<font color='blue'>"+elements10+"</font></p>"+
						"<p>买二	--	<font color='red'>"+elements13+"</font>"+"	--	<font color='blue'>"+elements12+"</font></p>"+
						"<p>买三	--	<font color='red'>"+elements15+"</font>"+"	--	<font color='blue'>"+elements14+"</font></p>"+
						"<p>买四	--	<font color='red'>"+elements17+"</font>"+"	--	<font color='blue'>"+elements16+"</font></p>"+
						"<p>买五	--	<font color='red'>"+elements19+"</font>"+"	--	<font color='blue'>"+elements18+"</font></p>");
	 	       $('#fivehandicapsale').html("<p>买一	--	<font color='red'>"+elements21+"</font>"+"	--	<font color='blue'>"+elements20+"</font></p>"+
						"<p>买二	--	<font color='red'>"+elements23+"</font>"+"	--	<font color='blue'>"+elements22+"</font></p>"+
						"<p>买三	--	<font color='red'>"+elements25+"</font>"+"	--	<font color='blue'>"+elements24+"</font></p>"+
						"<p>买四	--	<font color='red'>"+elements27+"</font>"+"	--	<font color='blue'>"+elements26+"</font></p>"+
						"<p>买五	--	<font color='red'>"+elements29+"</font>"+"	--	<font color='blue'>"+elements28+"</font></p>");
	     	});
</script>


<jsp:include page="/top_company.jsp" flush="true" />
<!-- news-original -->
<div class="news-original">
<div class="container">
	<div class="company_info">
		<div class="col-md-10 " style="margin-left:5px;border: 1px solid #F0F0F0;width:1100px">
			<div>
				<div class="col-md-2" style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px;">
					<h3>${company.stockName}</h3>
					<h3>${company.stockNum}</h3>
					<input type="button" value="加入自选"  />
					
				</div>
			</div>
			<div class="col-xs-4" style="border: 1px solid #F0F0F0; margin-top: 20px; height: 115px; ">
				<table style="margin-top:10px;margin-left:40px; width: 200px; height:100px">
					<tr >
						<td rowspan="2" style="text-align:center;">
							<p><span style="color:#C10D01; font-size: 40px; " id="current">
							</span></p>
						</td>
					
						<td>
							<p><span style="color:#C10D01; font-size: 20px; " id="updownprice">
							</span></p>
						</td>
					</tr>
					<tr>
						<td><p><span style="color:#C10D01; font-size: 20px; " id="updownratio">
						</span></p></td>
					</tr>
					<tr>
						<td colspan="2">
							<span id="updown">
							</span>
						</td>
					</tr>
				</table>
				<br>
				
			</div>
			
			
			
			<div class="col-md-6"style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px;width:530px;">
				<table style="width:530px">
					<tr>
					
						<td style="width: 30%;" id="jinkai">
						
						<td  style="width: 37%;" id="chengjiaoliang">
						</td>
						<td  style="width: 33%;">振幅：${stockinfo.amplitude}</td>
					</tr>
					<tr>
						<td style="width: 30%;"id="zuigao">
						</td>
						<td style="width: 37%;" id="chengjiaoe">
						</td>
						<td style="width: 33%;">换手率：${stockinfo.turnoverRate}%</td>
					</tr>
					<tr>
						<td style="width: 30%;" id="zuidi">
						</td>
						<td style="width: 37%;">流通市值：${stockinfo.circulationMarketValue}</td>
						<td style="width: 33%;">量比：${stockinfo.equivalentRatio}</td>
					</tr>
					<tr>
						<td style="width: 30%;" id="zuoshou">
						</td>
						<td style="width: 37%;">流通股：${stockinfo.floatingStock}</td>
						<td style="width: 33%;">市盈率：${stockinfo.peRatio}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div style="height:30px"></div>
			<div class="agileinfo_news_original_grids">
				<div class="col-md-3 agileinfo_news_original_grids_left">
					<div class="w3l_your_stocks">
						<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active">
									<a href="#mystock" id="my_tab" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">最近访问</a>
								</li>
								<li role="presentation">
									<a href="#my_news" role="tab" id="news-tab" data-toggle="tab" aria-controls="newTab">我的自选股</a>
								</li>
								<li role="presentation">
									<a href="#my_link" role="tab" id="news-tab" data-toggle="tab" aria-controls="newTab">产业链</a>
								</li>
								
							</ul>
							
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tab">
									<div class="w3l_stocks">
										<table>
											<tr style="width: 100%;">
												<th style="width: 25%;">股票名称</th>
												<th style="width: 25%;">股价</th>
												<th style="width: 25%;">涨跌幅</th>
											
											</tr>
											<tr>
												<td><a href="company">万马科技</a></td>
												
												<td>
												10.25
												</td>
												
												<td>
												1.56%
												</td>
											
											</tr>
											<tr>
												<td><a href="company">江丰电子</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
											
											</tr>
											<tr>
												<td><a href="company">祥和实业</a></td>
												<td>15.48</td>
												<td>-5.78%</td>
											</tr>
											<tr>
												<td><a href="company">天安新材</a></td>
												<td>18.60</td>
												<td>1.61%</td>
											
											</tr>
											
	
											<tr>
												<td><a href="company">振华科技</a></td>
												<td>11.12</td>
												<td>2.56%</td>
												
											</tr>
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>6.52</td>
												<td>-1.02%</td>
											</tr>
										</table>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tab">
									<div class="w3l_stocks">
										<ul id="myTab1" class="nav nav-tabs" role="tablist">
							<li><a href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
							<li><a  href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>

							<li><a href="companySingle">强势股机构分歧大</a></li>
							</ul>
									</div>
								</div>
								
								<div role="tabpanel" class="tab-pane fade" id="my_link" aria-labelledby="news-tab">
									<div class="w3l_stocks">
										<ul id="myTab1" class="nav nav-tabs" role="tablist">
							<li><a href="industryChain?stock=${company.stockNum}"><b>行业概况</b></a><br></li>
							<li><a  href="industryChain?stock=${company.stockNum}"> <b>行业分析</b></a></li>

							</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					</div>
						
					<div class="w3layouts_market_movers">
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>个股预览-------------</b></h3> 
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" >
							<!-- 代码 开始 -->
							 <div id="firstpane" class="menu_list" >
							    <p class="menu_head" style="width:268px;">精选数据</p>
							    <div style="display:none" class=menu_body >
							      <a href="capital_flow">资金流向</a>
							      <a href="#">龙虎榜单</a>
							      <a href="#">大宗交易</a>
							      <!-- <a href="areaSectionAll">所属板块</a>
							      <a href="#">财务状况</a>
							      <a href="#">驱动事件</a> -->
							      <a href="#">重大事项</a>
							      <!-- <a href="#">融资融券</a> -->
							      <a href="#">个股体检</a>
							      <a href="#">风险评价</a>
							    </div>
							    
							    <!-- <p class="menu_head" style="width:268px">交易数据</p>
							    <div style="display:none" class=menu_body >
							      <a href="#">明细统计</a>
							      <a href="#">大单统计</a>
							      <a href="#">分价统计</a>
							      <a href="#">分时统计</a>
							      <a href="#">大单分析</a>
							      <a href="#">盘口分析</a>
							      <a href="#">交易提示</a>
							      
							    </div> -->
							    <p class="menu_head" style="width:268px">资讯公告</p>
							    <div style="display:none" class=menu_body >
							      <!-- <a href="#">个股资讯</a> -->
							      <a href="resolvedIndusNewsList?stocklist[]=${stocklist}&pageNum=1">行业资讯</a>
							      <!-- <a href="#">机构评级</a> -->
							      <a href="companyBulletinList?stockNum=${company.stockNum}&pageNum=1">个股公告</a>
							      <a href="#">个股研报</a>
							    </div>
							    <!-- <p class="menu_head" style="width:268px">基本资料</p>
							    <div style="display:none" class=menu_body >
							      <a href="#">公司概况</a>
							      <a href="#">证券资料</a>
							      <a href="#">公司高管（现在）</a>
							      <a href="#">公司高管（历任）</a>
							      
							    </div> -->
							    
							    <!-- <p class="menu_head" style="width:268px">财务报表</p>
							    <div style="display:none" class=menu_body >
							      <a href="#">核心指标</a>
							      <a href="#">资产负债表</a>
							      <a href="#">利润分配表</a>
							      <a href="#">现金流量表</a>
							    </div> -->
							    
							    <!-- <p class="menu_head" style="width:268px">报表附注</p>
							    <div style="display:none" class=menu_body >
							      <a href="#">存货明细</a>
							      <a href="#">主要供应商和客户明细</a>
							      <a href="#">应收账款</a>
							      <a href="#">关联方债权债务</a>
							      <a href="#">主营业务构成</a>
							    </div> -->
							    
							    <p class="menu_head" style="width:268px">财务分析</p>
							    <div style="display:none" class=menu_body >
							     <!--  <a href="#">每股指标</a> -->
							      <a href="profitability">盈利能力</a>
							      <a href="growth_ability">成长能力</a>
							      <!-- <a href="#">资本结构</a>
							      <a href="#">收益质量</a>
							      <a href="#">现金流量</a>
							      <a href="#">偿债能力</a> -->
							      <a href="operate_capacity">营运能力</a>
							      <a href="du_pont_analysis">杜邦分析</a>
							      <a href="z_swarning">Z值预警</a>
							      <!-- <a href="#">EVA数据</a>
							      <a href="#">单季度指标</a> -->
							    </div>
							    
							    <p class="menu_head" style="width:268px">盈利预测</p>
							    <div style="display:none" class=menu_body >
							      <a href="profitForecast">盈利预测综合值</a>
							      <a href="comprehensiveInvestmentRank">投资评级综合值</a>
							      <a href="performancePreview">上市公司业绩预告</a>
							    </div>
							    <p class="menu_head" style="width:268px">估值指标分析</p>
							    <div style="display:none" class=menu_body >
							      <a href="PE?stockNum=${company.stockNum}&pageNum=1">市盈率</a>
							      <a href="PB?stockNum=${company.stockNum}&pageNum=1">市净率</a>
							      <a href="PS?stockNum=${company.stockNum}&pageNum=1">市销率</a>
							      <a href="total_value?stockNum=${company.stockNum}&pageNum=1">总市值</a>
							    </div>
							    
							    
							    <p class="menu_head" style="width:268px">风险分析</p>
							    <div style="display:none" class=menu_body >
							      <a href="riskAnalysis">BETA值</a>
							      <a href="riskAnalysis">年化收益率</a>
							      <a href="riskAnalysis">年化波动率</a>
							    </div>
							    
							    <p class="menu_head" style="width:268px">行情指标分析</p>
							    <div style="display:none" class=menu_body >
							      <a href="dailyQuotation">日行情</a>
							      <a href="weekQuotation">周行情</a>
							      <a href="weekQuotation">月行情</a>
							      <a href="yearQuotation">年行情</a>
							    </div>
							    <!-- <p class="menu_head" style="width:268px">技术形态分析</p>
							    <div style="display:none" class=menu_body >
							      <a href="#">连涨天数</a>
							      <a href="#">连跌天数</a>
							      <a href="#">创历史新高</a>
							      <a href="#">创历史新低</a>
							      <a href="#">创阶段新高</a>
							      <a href="#">创阶段新低</a>
							      <a href="#">向上有效突破</a>
							      <a href="#">向下有效突破</a>
							      <a href="#">涨停打开日</a>
							      <a href="#">跌停打开日</a>
							    </div> -->
							    <%-- <p class="menu_head" style="width:268px">重要日期</p>
							    <div style="display:none" class=menu_body >
							      <a href="importantDays?stockNum=${company.stockNum}">重要日期</a>
							      <a href="#">董事会预案公告日</a>
							      <a href="#">预案阶段复牌日</a>
							      <a href="#">董事征集投票权起始日</a>
							      <a href="#">董事征集投票权截止日</a>
							      <a href="#">股东大会公告日</a>
							      <a href="#">股东大会召开日</a>
							      <a href="#">现场股东大会登记起始日</a>
							      <a href="#">现场股东大会登记截止日</a>
							      <a href="#">股东大会股权登记日</a>
							      <a href="#">获准公告日</a>
							      <a href="#">对价支付股票上市日</a>
							    </div> --%>
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
							</script>
						</div>
					</div>
						
					<div class="w3layouts_market_movers">
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司简介-------------<a href="company_detail?beiDou=${company.stockNum}">更多</a></b></h3> 
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<p>所属地域：${company.companyArea }</p>
							<p>涉及概念：${company.resolvedConcept}</p>
							<p>主营业务：
								<c:if test="${fn:length(company.mainBusiness) > 30 }">
									<td>${fn:substring(company.mainBusiness,0,30)}.....</td>
								</c:if>
								<c:if test="${fn:length(company.mainBusiness)  <= 30 }">
									<td>${company.mainBusiness}</td>
								</c:if>		
						    </p>
							<p>上市日期：${company.lunchDate}</p>
							<p>每股净资产：${company.esNetAsset }</p>
							<p>每股收益：${company.esIncome }</p>
							<p>净利润：${company.netProfit }</p>
							<p>净利润增长率：${company.netProfitGrowthRate }</p>
							<p>营业收入：${company.revenue }</p>
							<p>每股现金流：${company.esCashFlow}</p>
							<p>每股公积金：${company.esPublicFund }</p>
							<p>每股未分配利润：${company.esNotProfit }</p>
							<p>总股本：${company.totalCapital }</p>
							<p>流通股：${comapny.floatingStock}</p>
						</div>
					</div>

					<div class="w3layouts_market_movers" >
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司公告-----------<a href="companyBulletinList?stockNum=${stockNum}&pageNum=1">更多</a></b></h3> 
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<c:forEach items="${bulletins}" var="bulletins">
									<li><a href="companyBulletinDetail?id=${bulletins.id}">
										<c:if test="${fn:length(bulletins.title) > 15}">
											${fn:substring(bulletins.title,0,15)}...
										</c:if>
										<c:if test="${fn:length(bulletins.title) <= 15}">
											${bulletins.title}
										</c:if>   
									</a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				
				<!--首页中间部分开始处 -->>
				<div class="col-md-5 agileinfo_news_original_grids_left1" style="border: 1px solid #F0F0F0;width:550px;">
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 330px;width:533px;">
							
							<ul id="myTab" class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active">
									<a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">分时图</a>
								</li>
								<li role="presentation">
									<a href="#latest" role="tab" id="latest-tab" data-toggle="tab" aria-controls="latest">日K线图</a>
								</li>
								<li role="presentation">
									<a href="#experts" role="tab" id="experts-tab" data-toggle="tab" aria-controls="experts">周K线图</a>
								</li>
								<li role="presentation">
									<a href="#read" role="tab" id="read-tab" data-toggle="tab" aria-controls="read">月K线图</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
							
							
								<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
									<img  alt="" src="http://image.sinajs.cn/newchart/min/n/sz${stockNum}.gif"/>
									<img  alt="" src="http://image.sinajs.cn/newchart/min/n/sh${stockNum}.gif"/>
									<!-- style="width:450px;height:320px" -->
								</div>
								<div role="tabpanel" class="tab-pane fade" id="latest" aria-labelledby="latest-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/daily/n/sh${stockNum}.gif"/>
									<img alt="" src="http://image.sinajs.cn/newchart/daily/n/sz${stockNum}.gif"/>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="experts" aria-labelledby="experts-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/weekly/n/sh${stockNum}.gif"/>
									<img alt="" src="http://image.sinajs.cn/newchart/weekly/n/sz${stockNum}.gif"/>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="read" aria-labelledby="read-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/monthly/n/sh${stockNum}.gif"/>
									<img alt="" src="http://image.sinajs.cn/newchart/monthly/n/sz${stockNum}.gif"/>
								</div>
							</div>
					</div>
					<div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 250px;width:533px;">
							
							<ul id="myTab" class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active">
									<a href="#change" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">异动信息</a>
								</li>
								<li role="presentation">
									<a href="#transactionhints" role="tab" id="latest-tab" data-toggle="tab" aria-controls="latest">交易提示</a>
								</li>
								<li role="presentation">
									<a href="#investmenthighlights" role="tab" id="experts-tab" data-toggle="tab" aria-controls="experts">投资要点</a>
								</li>
								<li role="presentation">
									<a href="#researchreports" role="tab" id="read-tab" data-toggle="tab" aria-controls="read">研报精选</a>
								</li>
								<li role="presentation">
									<a href="#sharesconsultation" role="tab" id="read-tab" data-toggle="tab" aria-controls="read">投顾诊股</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
							
							
								<div role="tabpanel" class="tab-pane fade in active" id="change" aria-labelledby="home-tab">
									<br>
									公司新闻：<a href="#">丹邦科技控股股东减持1095.8万股</a><br>
									龙虎榜：<a href="#">日涨幅偏离值达7%的前三只证券 买5合计：7151.59万元，卖5合计：2267.89万元，0家机构介入</a><br>
									大宗交易：<a href="#">成交1：折价率-0.09%成交1095.80万股，占总成交量382.90%</a><br>
									融资融券：<a href="#">暂无数据</a><br>
									千股千评：<a href="#">多方力量强大;建议跟进。</a><br>
									公告点评:<a href="#">暂无数据</a><br>
									新闻情绪：<a href="#">正面</a><br>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="transactionhints" aria-labelledby="latest-tab">
									<br>
									最新提示：1)2017年三季报预约披露:2017年10月31日 <br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2)预计2017年度归属于上市公司股东的净利润2213.09至3196.69万元 <br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3)10月31日披露2017年三季度报告：归属净利润1677.55万，同比增2.77%<br>
									分红配送：2017年中报--不分配不转增
									限售解禁：解禁股数:2264.0万股 解禁日期:2014-10-29 解禁类型:首发解禁
									定增：2013年度拟非公开发行不超过5289.0万股,增发价格26.5元/股(2013年01月21日董事会通过)
								</div>
								<div role="tabpanel" class="tab-pane fade" id="investmenthighlights" aria-labelledby="experts-tab">
									【要点1】<br>
									1.公司专注于微电子柔性互连与封装业务,是全球极少数产业链涵盖从基材、基板到芯片封装的企业之一,形成了从FCCL→FPC、FCCL→COF柔性封装基板→COF产品的完整产业链。公司近两年成为中国最大的CO...<br>
									--------------------------------------------------------------<br>
									【要点2】<br>
									2. 2011年12月,公司拟使用超募资金7089.27万元和自筹资金7910.73万元投资主要用于生产柔性封装基板材料。 <a href="#">[更多]</a>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="researchreports" aria-labelledby="read-tab">
									<br>
									<a href="#">丹邦科技:A股COF基板龙头,高端PI膜量产迎爆发</a><br>
									机构：申万宏源集团股份有限公司评级：增持预测目标价：--<br>
									--------------------------------------------------------------<br>
									<a href="#">丹邦科技:产业升级稀缺投资标的</a><br>
									机构：国海证券股份有限公司评级：买入预测目标价：--<br>
									--------------------------------------------------------------<br>
									<a href="#">丹邦科技14年报点评:业绩增长加速</a><br>
									机构：国海证券股份有限公司评级：增持预测目标价：--<br>
									--------------------------------------------------------------<br>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="sharesconsultation" aria-labelledby="read-tab">
									
									【问：】财友48qu5o90：丹邦科技(002618)002618现在能进吗老师...<br>
									【答：】投资顾问孙修祥已回答该问题，<a href="#">点击查看回答详情>></a><br>
									--------------------------------------------------------------<br>
									【问：】醉清风2：丹邦科技(002618)...<br>
									【答：】投资顾问波段女神已回答该问题，<a href="#">点击查看回答详情>></a><br>
									--------------------------------------------------------------<br>
									【问：】财友59635wsq：丹邦科技(002618)补涨吗？12.5的本，还能...<br>
									【答：】投资达人牛魔王已回答该问题，<a href="#">点击查看回答详情>></a><br>
									--------------------------------------------------------------<br>
									<a href="#">查看更多问答>></a><br>
									
								</div>
							</div>
					</div>
					
					<!-- <div class="clearfix"></div>
					<div class="w3l_your_stocks">
						<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							</div>
						</div>
				
					</div> -->
					<div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 300px;width:533px;">
						<h4><i class="fa fa-users" aria-hidden="true">&nbsp;实时成交分布</i></h4>
						<div style="height:8px"></div>
						<div  style="width:100%" >
							<div style="float: left;border: 1px solid #576F8F;">
								<div style="height: 150px;align:center;">
									<ul style="list-style-type: none;margin-top:50px">
										<li style="height: 30px;"><b>总流入：9407.37万元</b></li>
										<li style="height: 30px;"><b>总流出：11426.64万元</b></li>
										<li style="height: 30px;"><b>净 额：-2021.27万元</b></li>
									</ul>
								</div>
							</div>
							<div style="float: left;border: 1px solid #576F8F; height: 200px;width: 368px;"id="shishichengjiao">
							</div>
							<div class="clearfix"></div>
							<div style="margin-left: 30px;width: 100%;">
								<table style="width: 100%; font-size:10px"  >
									<tr>
										<th style="text-align: center;">分类</th>
										<th style="text-align: center;">流入（万元）</th>
										<th style="text-align: center;">流出（万元）</th>
									</tr>
									<tr>
										<td style="text-align: center;">大单</td>
										<td style="text-align: center;">4024</td>
										<td style="text-align: center;">6154</td>
									</tr>
									<tr>
										<td style="text-align: center;">中单</td>
										<td style="text-align: center;">2874</td>
										<td style="text-align: center;">2926</td>
									</tr>
									<tr>
										<td style="text-align: center;">小单</td>
										<td style="text-align: center;">2521</td>
										<td style="text-align: center;">2350</td>
									</tr>
								</table>
							</div>
						</div>
						
					</div>	
					<!-- <div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 265px;width:533px;">	
						<h4><i class="fa fa-users" aria-hidden="true">&nbsp;资金流向历史统计--------------更多></i></h4>
						<div style="height:8px"></div>
						<div>
							<div style="border: 1px solid #576F8F; height: 200px;width: 518px;">
								<div>
									图展示
								</div>
							</div>
							<div class="clearfix"></div>
							<div style="margin-left: 30px;width: 450px;">
								<p>近5日内该股资金总体呈流出状态，低于行业平均水平，
									5日共流出-16822.71万元。据统计，近10日内主力集中了一定的筹码，呈中度控盘状态。</p>
							</div>
						</div>
						
					</div> -->
					
					<div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 265px;width:533px;">	
						<h4><i class="fa fa-users" aria-hidden="true">&nbsp;机构评级--------------<a href="#">更多></a></i></h4>
						<div style="height:8px"></div>
						<div>
							<div style="border: 1px solid #576F8F; height: 240px;width: 518px;">
							<input id='rank' type='hidden' value="${fn:substring(rankAndPredict.rankContent,0,1)}"/>
								<div style="border: 1px solid #576F8F; height: 100px;width: 518px;" id="rankimg">
									
								</div>
								<div style="border: 1px solid #576F8F; height: 109px;width: 518px;">
									<table style=" height: 100px;width: 500px;align:center;margin:20px">
										<tr>
											<th>研究机构</th>
											<th>评级日期</th>
											<th>最新评级</th>
											<th>评级研究员</th>
										</tr>
										<tr>
											<td>${rankAndPredict.rankInstitution}</td>
											<td>${rankAndPredict.rankTime}</td>
											<td>${rankAndPredict.rankContent}</td>
											<td>${rankAndPredict.rankResearcher}</td>
										</tr>
									</table>
								</div>
								<div class="clearfix"></div>
								<div style="margin-left: 30px;width: 450px;" id="rank_text">
									
								</div>
							</div>
							
						</div>
						
					</div>
					
					<div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 265px;width:533px;">	
						<h4><i class="fa fa-users" aria-hidden="true">&nbsp;机构预测--------------<a href="#">更多></a></i></h4>
						<div style="height:8px"></div>
						<div>
							<div style="border: 1px solid #576F8F; height: 200px;width: 520px;margin-left:10px" id="profit_predict">
							
							</div>
							<div class="clearfix"></div>
							<div style="margin-left: 30px;margin-top: 10px;width: 450px;">
								<p>该股2017年每股收益与前一年相同，长期投资价值一般。</p>
							</div>
						</div>
						
					</div>
					
					<div style="height:15px"></div>
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 250px;width:533px;">
						<h4><i class="fa fa-users" aria-hidden="true">&nbsp;牛叉诊股</i></h4>
						<div style="height:8px"></div>
						<div  style="width:533px" >
							<div style="float: left;border: 1px solid #576F8F; height: 225px;width: 20%;">
									图展示
							</div>
							<div style="float: left;border: 1px solid #576F8F;height: 225px;width: 40%;">
									<ul style="list-style-type: none;">
										<li style="height: 30px;"><b>总流入：34180.25万元</b></li>
										<li style="height: 30px;"><b>总流出：54544.79万元</b></li>
										<li style="height: 30px;"><b>净 额：-20364.54万元</b></li>
									</ul>
							</div>
							
							<div style="float: left;border: 1px solid #576F8F; height: 225px;width: 40%;">
									<ul style="list-style-type: none;">
										<li style="height: 30px;"><b>总流入：34180.25万元</b></li>
										<li style="height: 30px;"><b>总流出：54544.79万元</b></li>
										<li style="height: 30px;"><b>净 额：-20364.54万元</b></li>
									</ul>
							</div>
							
						</div>
						
					</div>	
					
				</div>
				<!--主页最右边部分  -->
				<div class="col-md-3 agileinfo_news_original_grids_right">
					<div class="w3l_your_stocks">
						<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="font-size: 10px;">
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active">
									<a href="#hu" id="hu_tab" role="tab" data-toggle="tab" aria-controls="huTab" aria-expanded="true" >五档盘口</a>
								</li>
								<li role="presentation">
									<a href="#shen" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">资金流向</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="hu" aria-labelledby="hu_tab">
									<div class="w3l_stocks">
										<div style="border-bottom: 1px dotted ;">
											<p>委比：100%  委差：50809</p>
										</div >
										<div style="border-bottom: 1px dotted;" id="fivehandicapbuy">
										
										</div>
										<div id="fivehandicapsale">
											
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="shen" aria-labelledby="shen-tab">
									<div class="w3l_stocks">
										<table style="width: 100%;border-collapse:   separate;   border-spacing:   3px;font-size:10px;">
											
											<tr style="color:blue">
												<!-- <th >排序</th> -->
												<th >股票名称</th>
												<th >流入量</th>
												<th >流入金额</th>
											</tr>
											<c:forEach var="v" items="${capitalFlowInlist}" varStatus="status">  
											<tr>  
											    <%-- <td>${ status.index + 1}</td> --%>
											    <td>${ v.flowName}</td>   
											    <td>${ v.flowinCount}</td>  
											    <td>${ v.flowinMoney}</td>  
											</tr>  
											</c:forEach>  
											
										</table>
										
										<table style="width: 100%;border-collapse:   separate;   border-spacing:   3px;font-size:10px;">
											<tr style="color:blue">
												<!-- <th >排序</th> -->
												<th >股票名称</th>
												<th >流出量</th>
												<th >流出金额</th>
											</tr>
											<c:forEach var="v" items="${capitalFlowOutlist}" varStatus="status">  
											<tr>  
											    <%-- <td>${ status.index + 1}</td>   --%>
											    <td>${ v.flowName}</td>   
											    <td>${ v.flowoutCount}</td>  
											    <td>${ v.flowoutMoney}</td>  
											</tr>  
											</c:forEach>  
											
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					</div>
					
					<div class="w3l_your_stocks">
						<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
	
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active">
									<a href="#liuru" id="ru_tab" role="tab" data-toggle="tab" aria-controls="ruTab" aria-expanded="true">成交明细</a>
								</li>
								<li role="presentation">
									<a href="#shortline" id="ru_tab" role="tab" data-toggle="tab" aria-controls="ruTab" aria-expanded="true">短线精灵</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="liuru" aria-labelledby="ru_tab">
									<div class="w3l_stocks">
										<table style="width: 100%;border-collapse:   separate;   border-spacing:   3px;">
											<tr >
												<th >时间</th>
												<th >成交价</th>
												<th >现手</th>
												<th>性质</th>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:10</td>
												<td>18.23</td>
												<td>45</td>
												<td>买入</td>
											</tr>
											<tr>
												<td>15:15</td>
												<td>18.45</td>
												<td>80</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:20</td>
												<td>14.30</td>
												<td>38</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:50</td>
												<td>15.25</td>
												<td>78</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>16:01</td>
												<td>16.14</td>
												<td>56</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>16:10</td>
												<td>16.20</td>
												<td>46</td>
												<td>买入</td>
											</tr>
											<tr>
												<td>16:01</td>
												<td>16.14</td>
												<td>56</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>16:10</td>
												<td>16.20</td>
												<td>46</td>
												<td>买入</td>
											</tr>
											
										</table>
									</div>
								</div>
								
								<div role="tabpanel" class="tab-pane fade" id="shortline" aria-labelledby="short_tab">
									<div class="w3l_stocks">
										<table style="width: 100%;" >
											<tr>		
												<td>10:52:00-</td>
												<td><a href="#">环球印务-</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00-</td>
												<td><a href="#">环球印务-</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00-</td>
												<td><a href="#">环球印务-</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00-</td>
												<td><a href="#">环球印务-</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											<tr>		
												<td>10:52:00</td>
												<td><a href="#">环球印务</a></td>
												<td><font color="red">急速拉升</font>  </td>
											</tr>
											
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					</div>
					
					<!-- <div class="w3l_your_stocks">
						<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="font-size: 10px;">
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active">
									<a href="#zhubi" id="hu_tab" role="tab" data-toggle="tab" aria-controls="huTab" aria-expanded="true" >逐笔</a>
								</li>
								<li role="presentation">
									<a href="#dadan" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">大单</a>
								</li>
								<li role="presentation">
									<a href="#fenshi" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">分时</a>
								</li>
								<li role="presentation">
									<a href="#fenjia" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">分价</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="zhubi" aria-labelledby="hu_tab">
									<div class="w3l_stocks">
										<table style="font-size:10px;align:centre">
											<tr>
												<th>时间</th>
												<th>成交价（元）</th>
												<th>成交量（手）</th>
												<th>性质</th>
											</tr>
											<tr style="text-align:centre">
												<td>10:15</td><td >8.29</td><td>36</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:14</td><td>8.29</td><td>124</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:12</td><td>8.29</td><td>23</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:11</td><td>8.30</td><td>12</td><td>卖入</td>
											</tr>
											<tr>
												<td>10:10</td><td>8.29</td><td>159</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:09</td><td>8.29</td><td>30</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:08</td><td>8.30</td><td>8</td><td>买入</td>
											</tr>
											<tr>
												<td>10:07</td><td>8.29</td><td>91</td><td>卖出</td>
											</tr>
											<tr>
												<td>10:06</td><td>8.28</td><td>59</td><td>卖出</td>
											</tr>
											
											<tr>
												<td>10:05</td><td></td><td>15</td><td>卖出</td>
											</tr>
										</table>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="dadan" aria-labelledby="shen-tab">
									<div class="w3l_stocks">
										<table style="font-size:10px;text-align:center">
											<tr>
												<th>时间</th>
												<th>成交价（元）</th>
												<th>成交量（手）</th>
												<th>性质</th>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
											
											<tr>
												<td>15:00:03</td><td>16.30</td><td>1591</td><td>卖出</td>
											</tr>
										</table>
									</div>
								</div>
								
								<div role="tabpanel" class="tab-pane fade" id="fenshi" aria-labelledby="shen-tab">
									<div class="w3l_stocks">
										<table style="font-size:10px;text-align:center">
											<tr>
												<th>时间</th>
												<th>成交价（元）</th>
												<th>成交量（手）</th>
												
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
											
											<tr>
												<td>14:53</td><td>16.26</td><td>32.56万</td>
											</tr>
										</table>
									</div>
								</div>
								
								<div role="tabpanel" class="tab-pane fade" id="fenjia" aria-labelledby="shen-tab">
									<div class="w3l_stocks">
										<table style="font-size:10px;text-align:center">
											<tr>
												<th>成交价（元）</th>
												<th>成交量（手）</th>
												<th>占比</th>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
											
											<tr>
												<td>16.26</td><td>32.56万</td><td>4.68%</td>
											</tr>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					</div> -->
					
					<%-- <div class="w3_latest_stock">
						<img src="<%=basePath %>/images/19.jpg" alt=" " class="img-responsive" />
						<div class="w3_latest_stock_pos">
							<h3>latest <span>stock <i>market</i> updates</span></h3>
						</div>
					</div> --%>
					<div class="clearfix"></div>
					<div class="w3_latest_stock"  >
						<div style="background-color:#F0F8FF;height:30px">
							<h4 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司新闻-----------<a href="证券要闻.html">更多</a></b></h4> 
						</div>
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<c:forEach items="${companyNewsList}" var="companyNewsList">
										<li><a href="companyNewsDetail?id=${companyNewsList.id}">
											<c:if test="${fn:length(companyNewsList.newsTitle) > 20}">
												${fn:substring(companyNewsList.newsTitle,0,20)}...
											</c:if>
											<c:if test="${fn:length(companyNewsList.newsTitle) <= 20}">
												${companyNewsList.newsTitle}
											</c:if>   
										</a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
					
					<div class="w3_latest_stock"  >
						<div style="background-color:#F0F8FF;height:30px">
							<h4 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>同行业市场表现排行----<a href="similarIndustry?stockNum=${stockNum }">更多</a></b></h4> 
						</div>
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
						<%-- <select name="select" id="select_k1" class="xla_k">
					   		<option value="选择品牌">选择品牌</option>
							<option value="选择品牌1">选择品牌1</option>
							<option value="选择品牌2">选择品牌2</option>
					    </select>--%>
							<table style="width: 100%;font-size:15px" >
											<tr >
												<th >名称</th>
												<th >最新价</th>
												<th >涨幅</th>
											</tr>
											<c:forEach items="${stockList}" var="v" varStatus="sta">
												<tr>		
													<td><a href="company?stockNum=${v.stockNum}">${v.stockName}</a></td>
													<td>${v.currentPrice}</a></td>
													<td><font color="red">${v.updownRatio }</font>  </td>
												</tr>
											</c:forEach>
											
										</table>
						</div>
					</div>
					
					<div class="w3layouts_market_movers" >
						<div style="background-color:#F0F8FF;height:30px">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true" ></i><b>研究报告----------<a href="证券要闻.html">更多</a></b></h3> 
						</div>
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="width:100%">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
							<li><a href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
							<li><a  href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
							<li><a  href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
							<li><a href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
							<li><a href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
							<li><a href="companySingle">强势股机构分歧大</a></li>
							</ul>
						</div>
					</div>
					<div class="w3layouts_market_movers" >
						<div style="background-color:#F0F8FF;height:30px">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>行业资讯------------<a href="resolvedIndusNewsList?stocklist[]=${stocklist}&pageNum=1">更多</a></b></h3> 
						</div>
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="width:100%">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<c:forEach items="${industryList}" var="industry" begin="0" end="4">
									<li><a href="resolvedIndusNewsDetail?id=${industry.id}">${industry.title}</a></li>
								</c:forEach>
							</ul>
						</div>
					</div>
					
					
				</div><%--最左边结束 --%>
				<div class="clearfix"> </div>
			</div>
			</div>
		</div>
		<!-- //news-original -->
<script type="text/javascript ">
	$(".abc ").mouseover(function(){
				 $(this).css({'background-color':'#F0E3E3','color':'#fff'});
				 $(".shows ").html("11111111 ");
			});
			
	$(".abd ").mouseover(function(){
				 $(this).css({'background-color':'#F0E3E3','color':'#fff'});
				 $(".shows ").html("22222 ");
			});
			
	$(".abe ").mouseover(function(){
				 $(this).css({'background-color':'#F0E3E3','color':'#fff'});
				 $(".shows ").html("33333 ");
			});
			
	$(".abc ").mouseout(function(){
		 $(this).css({'background-color':'#F8F8F8','color':'#000408'});
	});
	
	$(".abd ").mouseout(function(){
		 $(this).css({'background-color':'#F8F8F8','color':'#000408'});
	});
	
	$(".abe ").mouseout(function(){
		 $(this).css({'background-color':'#F8F8F8','color':'#000408'});
	});
</script>
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
<!-- //Bootstrap Core JavaScript -->
<!-- here stars scrolling icon -->
	<script type="text/javascript ">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart2 = echarts.init(document.getElementById('shishichengjiao'));
       var option = {
    		    title : {
    		        text: '成交分布',
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
    		        data: ['大单流入','中单流入','小单流入','大单流出','中单流出','小单流出']
    		    },
    		    series : [
    		        {
    		            name: '上市板块',
    		            type: 'pie',
    		            radius : '55%',
    		            center: ['50%', '60%'],
    		            data:[
    		                {value:4024, name:'大单流入'},
    		                {value:2874, name:'中单流入'},
    		                {value:2512, name:'小单流入'},
    		                {value:6154, name:'大单流出'},
    		                {value:2926, name:'中单流出'},
    		                {value:2350, name:'小单流出'}
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
var rank = document.getElementById("rank").value;
var div = document.getElementById('rankimg');
var rank_text = document.getElementById('rank_text');
if(rank==1){
	div.style.backgroundImage = 'url(<%=basePath %>/static/uStyle/images/rank1.png)';
	div.style.backgroundRepeat = "no-repeat";
	rank_text.innerHTML=('<p>最近30个交易日，机构评级以买入为主，认为该股票非常值得关注。</p>');
}else if(rank==2){
	div.style.backgroundImage = "url(<%=basePath %>/static/uStyle/images/rank2.png)";
	div.style.backgroundRepeat = "no-repeat";
	rank_text.innerHTML=('<p>最近30个交易日，机构评级以增持为主，认为该股票值得关注。</p>');
}else if(rank==3){
	div.style.backgroundImage = 'url(<%=basePath %>/static/uStyle/images/rank3.png)';
	div.style.backgroundRepeat = "no-repeat";
	rank_text.innerHTML=('<p>最近30个交易日，机构评级以中性为主，认为该股票一般。</p>');
}else if(rank==(4)){
	div.style.backgroundImage = 'url(<%=basePath %>/static/uStyle/images/rank4.png)';
	div.style.backgroundRepeat = "no-repeat";
	rank_text.innerHTML=('<p>最近30个交易日，机构评级以减持为主，认为该股票不值得关注。</p>');
}else{
	div.style.backgroundImage = 'url(<%=basePath %>/static/uStyle/images/rank5.png)';
	div.style.backgroundRepeat = "no-repeat";
	rank_text.innerHTML=('<p>最近30个交易日，机构评级以卖出为主，认为该股票非常不值得关注。</p>');
}
</script>
<script type="text/javascript">
		var stock = document.getElementById("stock").value;
	   // 基于准备好的dom，初始化echarts实例
       var myChart = echarts.init(document.getElementById('profit_predict'));
       $.getJSON('profit_predict?stockNum='+stock, function (data) {
       myChart.setOption(option = {
   		    title: {
		        text: ''
		    },
		    tooltip: {},
		    legend: {
		        data:['盈利预测']
		    },
		    xAxis: {
		        data: data.categories
		    },
		    yAxis: {},
		    series: [{
		        name: '盈利预测',
		        type: 'bar',
		        data: data.data
		    }]
		}); 
    	   
       });
    // 使用刚指定的配置项和数据显示图表。
       //myChart2.setOption(option);
</script>
</body>
</html>