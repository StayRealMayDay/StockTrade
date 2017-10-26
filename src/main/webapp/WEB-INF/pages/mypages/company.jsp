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
<title>公司</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />

<!-- //for-mobile-apps -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- //js -->
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<!-- start-smoth-scrolling -->

<style type="text/css">
	#myTabContent2{display:block !important;}
</style>

</head>

<body class="home-page">
<jsp:include page="/top_q.jsp" flush="true" />
<!-- news-original -->
<div class="news-original">
<div class="container">
	<div class="company_info">
		<div class="col-md-10 " style="margin-left:50px">
			<div>
				<div class="col-md-2" style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px;">
					<h3>${company.stockName}</h3>
					<h3>${company.stockNum}</h3>
					<input type="button" value="加入自选"  />
				</div>
			</div>
			<div class="col-xs-4" style="border: 1px solid #F0F0F0; margin-top: 20px; height: 113px; ">
				<table style="margin: 0px; width: 200px; ">
					<tr >
						<td rowspan="2">
							<p><span style="color:#C10D01; font-size: 40px; ">20.33</span></p>
						</td>
					
						<td>
							<p><span style="color:#C10D01; font-size: 20px; ">1.85</span></p>
						</td>
					</tr>
					<tr>
						<td><p><span style="color:#C10D01; font-size: 20px; ">10.01%</span></p></td>
					</tr>
					<tr>
						<td colspan="2">
							<span>涨停：2033     跌停：16.63</span>
						</td>
					</tr>
				</table>
			</div>
			<div class="col-md-6"style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px;">
				<table style="width:450px">
					<tr>
						<td style="width: 33.3%;">今日：20.33</td>
						<td  style="width: 33.3%;">成交量：4.57万</td>
						<td  style="width: 33.3%;">振幅：0.00%</td>
					</tr>
					<tr>
						<td>最高：20.33</td>
						<td>成交量：4.57万</td>
						<td>换手：0.00%</td>
					</tr>
					<tr>
						<td>最低：20.33</td>
						<td>总市值：4.57万</td>
						<td>市净率：0.00%</td>
					</tr>
					<tr>
						<td>昨收：20.33</td>
						<td>流通市值：4.57万</td>
						<td>市盈率(动)：0.00%</td>
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
												<td><a href="company">横店东磁</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
											
											</tr>
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
											
											</tr>
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
											</tr>
											<tr>
												<td>横店东磁</td>
												<td>11.88</td>
												<td>-3.41%</td>
											
											</tr>
											
	
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
												
											</tr>
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
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
							</div>
						</div>
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
				<div class="col-md-5 agileinfo_news_original_grids_left1">
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs" style="border: 1px solid #ADADAD; height: 350px;">
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
							<div id="myTabContent" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/min/n/sh${stockNum}.gif">
									<img alt="" src="http://image.sinajs.cn/newchart/min/n/sz${stockNum}.gif">
								</div>
								<div role="tabpanel" class="tab-pane fade" id="latest" aria-labelledby="latest-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/daily/n/sh${stockNum}.gif">
									<img alt="" src="http://image.sinajs.cn/newchart/min/n/sz${stockNum}.gif">
								</div>
								<div role="tabpanel" class="tab-pane fade" id="experts" aria-labelledby="experts-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/weekly/n/sh${stockNum}.gif">
									<img alt="" src="http://image.sinajs.cn/newchart/min/n/sz${stockNum}.gif">
								</div>
								<div role="tabpanel" class="tab-pane fade" id="read" aria-labelledby="read-tab">
									<img alt="" src="http://image.sinajs.cn/newchart/monthly/n/sh${stockNum}.gif">
									<img alt="" src="http://image.sinajs.cn/newchart/min/n/sz${stockNum}.gif">
								</div>
							</div>
					</div>
					
					<div class="clearfix"></div>
					<div class="w3l_your_stocks">
						<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							</div>
						</div>
				
					</div>
	
				
					<!-- <div class="wthree_performance">
						<h3><i class="fa fa-users" aria-hidden="true">&nbsp;实时成交分布</i></h3>
						<div>
							<div style="float: left;border: 1px solid #576F8F;">
								<div style="margin: 20px;">
									<ul style="list-style-type: none;">
										<li style="height: 30px;"><b>总流入：34180.25万元</b></li>
										<li style="height: 30px;"><b>总流出：54544.79万元</b></li>
										<li style="height: 30px;"><b>净 额：-20364.54万元</b></li>
									</ul>
								</div>
							</div>
							<div style="float: left;border: 1px solid #576F8F; height: 130px;width: 200px;">
								<div>
									图展示
								</div>
							</div>
							<div class="clearfix"></div>
							<div style="margin-left: 30px;width: 550px;">
								<table style="width: 100%;" >
									<tr>
										<td colspan="2" style="text-align: center;">流入（万元）</td>
										<td >流出（万元）</td>
									</tr>
									<tr>
										<td style="text-align: center;">大单</td>
										<td style="text-align: center;">18028</td>
										<td style="text-align: center;">26283</td>
									</tr>
									<tr>
										<td style="text-align: center;">中单</td>
										<td style="text-align: center;">18028</td>
										<td style="text-align: center;">26283</td>
									</tr>
									<tr>
										<td style="text-align: center;">小单</td>
										<td style="text-align: center;">18028</td>
										<td style="text-align: center;">26283</td>
									</tr>
								</table>
							</div>
						</div>
						
					</div> -->		
					<!-- 	<div class="wthree_performance">
						<h3><i class="fa fa-users" aria-hidden="true">&nbsp;资金流向历史统计--------------更多></i></h3>
						<div>
				
							<div style="border: 1px solid #576F8F; height: 150px;width: 450px;">
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

					<div class="clearfix"></div>
					<div class="w3layouts_market_movers" >
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司新闻-----------------------------<a href="证券要闻.html">更多</a></b></h3> 
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
					
					<!-- <div class="w3layouts_market_movers" >
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>研究报告--------------<a href="证券要闻.html">更多</a></b></h3> 
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
							<li><a href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
							<li><a  href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
							<li><a  href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
							<li><a href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
							<li><a href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
							<li><a href="companySingle">强势股机构分歧大</a></li>
							</ul>
						</div>
					</div> -->
					<div class="w3layouts_market_movers" >
						<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>行业资讯------------<a href="resolvedIndusNewsList?stocklist[]=${stocklist}&pageNum=1">更多</a></b></h3> 
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<c:forEach items="${industryList}" var="industry">
									<li><a href="resolvedIndusNewsDetail?id=${industry.id}">${industry.title}</a></li>
								</c:forEach>
							</ul>
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
										<div style="border-bottom: 1px dotted;">
										<p>卖五	--	0</p>
										<p>卖四	--	0</p>
										<p>卖三	--	0</p>
										<p>卖二	--	0</p>
										<p>卖一	--	0</p>
										</div>
										<div>
										<p>买一	13.15	5.9万</p>
										<p>买二	13.14	200</p>
										<p>买三	13.13	15</p>
										<p>买四	13.12	5</p>
										<p>买五	13.10	42</p>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="shen" aria-labelledby="shen-tab">
									<div class="w3l_stocks">
										<div class="w3l_stocks">
										<div style="border-bottom: 1px dotted ;">
											<p>委比：100%  委差：50809</p>
										</div >
										<div style="border-bottom: 1px dotted;">
										<p>卖五	--	0</p>
										<p>卖四	--	0</p>
										<p>卖三	--	0</p>
										<p>卖二	--	0</p>
										<p>卖一	--	0</p>
										</div>
										<div>
										<p>买一	13.15	5.9万</p>
										<p>买二	13.14	200</p>
										<p>买三	13.13	15</p>
										<p>买四	13.12	5</p>
										<p>买五	13.10	42</p>
										</div>
									</div>
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
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="liuru" aria-labelledby="ru_tab">
									<div class="w3l_stocks">
										<table style="width: 100%;">
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
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
											<tr>
												<td>15:00</td>
												<td>13.15</td>
												<td>30</td>
												<td>卖出</td>
											</tr>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					</div>
					<div class="w3_latest_stock">
						<img src="<%=basePath %>/images/19.jpg" alt=" " class="img-responsive" />
						<div class="w3_latest_stock_pos">
							<h3>latest <span>stock <i>market</i> updates</span></h3>
						</div>
					</div>
				</div>
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
</body>
</html>