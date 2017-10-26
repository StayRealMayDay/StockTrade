<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">

	<head>
		<title>上市公司</title>
		<!-- for-mobile-apps -->
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
		<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
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
	</head>

	<body>
		<!-- header -->
		<div class="header">
			<div class="w3ls_header_top">
				<div class="container">
					<div class="w3l_header_left">
						<ul class="w3layouts_header">
							<li class="w3layouts_header_list">
								<ul>
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown">软件下载<span class="caret"></span></a>
										<div class="mega-dropdown-menu">
											<ul class="dropdown-menu w3_dropdown">
												<li>
													<a href="#">免费版本</a>
												</li>
												<li>
													<a href="#">远航版本</a>
												</li>
												<li>
													<a href="#">电脑版本</a>
												</li>
											</ul>
										</div>
									</li>
									<li>
										<i>|</i>
									</li>
								</ul>
							</li>
							<li class="w3layouts_header_list">
								<a href="#">买基金</a><i>|</i>
							</li>
							<li class="w3layouts_header_list">
								<a href="faq">FAQ</a><i>|</i>
							</li>
							<li class="w3layouts_header_list">
								<a href="contact">Contact Us</a>
							</li>
						</ul>
					</div>
					<div class="w3l_header_right">
						<ul class="w3layouts_header">
							<li class="w3layouts_header_list">
								<a href="login">登录</a><i>|</i>
							</li>
							<li>
								<a href="register">注册</a>
							</li>
						</ul>
						<h2><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+(000) 123 456 678</h2>

					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="w3ls_header_middle">
				<div class="container">
					<div class="agileits_logo">
						<h1><a href="index"><span>股票</span> 市场---公司<i>交易无处不在，还望谨慎投资。</i></a></h1>
					</div>
					<div class="agileits_search">
						<form action="#" method="post">
							<input name="Search" type="text" placeholder="Search" required="">
							<select id="agileinfo_search" name="agileinfo_search">
								<option value="commodities">Commodities</option>
								<option value="navs">NAVs</option>
								<option value="quotes">Quotes</option>
								<option value="videos">Videos</option>
								<option value="news">News</option>
								<option value="notices">Notices</option>
								<option value="all">All</option>
							</select>
							<input type="submit" value="Search">
						</form>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!-- //header -->
		<!-- navigation -->
		<div class="trade_navigation" style="background-color:#287AB4 ;">
			<div class="container">
				<nav class="navbar nav_bottom">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header nav_2">
						<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
						<nav class="wthree_nav">
							<ul class="nav navbar-nav nav_1">
								<li>
									<a href="#"><h3>公司首页</h3></a>
								</li>
								<li class="dropdown">
									<a href="companyNews" >个股聚焦</a>
								</li>
								<li class="dropdown">
									<a href="companyNews" >公司新闻</a>
								</li>
								<li class="dropdown">
									<a href="companyRating" >公司评级</a>
								</li>
								<li class="dropdown">
									<a href="companyNews" >公司研究</a>
								</li>
								<li>
									<a href="institutionRating">机构评级</a>
								</li>
								<li>
									<a href="companyNews">公司公告</a>
								</li>
								<li>
									<a href="companyNews">公司解读</a>
								</li>
								<li>
									<a href="largeSingleTrack">大单追踪</a>
								</li>
							</ul>
						</nav>
					</div>
				</nav>
			</div>
		</div>
		<!-- //navigation -->
			<script src="<%=basePath %>/js/jquery.bootstrap.newsbox.min.js" type="text/javascript"></script>
	<!-- news-original -->
		<div class="news-original">
			<div class="container">
				<div class="agileinfo_news_original_grids">
					<div class="col-md-4 agileinfo_news_original_grids_left">
						<div class="news">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
						</div>
						<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司新闻-----------------------------<a href="securityNews?pageNum=1">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ol id="myTab1" class="nav nav-tabs" role="tablist" style="margin:0px">
									<c:forEach items="${news}" var="row" begin="0" end="6" >
										<li><a style="font-size: 15px;" href="companySingle">${row.newsTitle}</a></li>
									</c:forEach>
								</ol>
							</div>
						</div>
						
						
						<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司评级-----------------------------<a href="证券要闻.html">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
							</div>
						</div>
						
							<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>涨停股原因揭秘----------------------<a href="证券要闻.html">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
							</div>
						</div>
						
						<div class="w3layouts_market_movers">
							<h3><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公告解读-----------------------------<a href="securityNews">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
							</div>
						</div>
					</div>
					
					
		
					<!--首页中间部分开始处 -->>
					<div class="col-md-5 agileinfo_news_original_grids_left1">
						
						<div class="w3l_your_stocks">
							<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
									<li role="presentation" class="active">
										<a href="#mystock" id="my_tab" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">自选股</a>
									</li>
									<li role="presentation">
										<a href="#my_news" role="tab" id="news-tab" data-toggle="tab" aria-controls="newTab">自选股新闻</a>
									</li>
								</ul>
								<div id="myTabContent2" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tab">
										<div class="w3l_stocks" style="padding-top:5px">
											<table style="width: 100%;">
											<thead>
												<tr style="width: 100%;height:40px">
													<th style="width: 25%;">股票名称</th>
													<th style="width: 25%;">股价</th>
													<th style="width: 25%;">涨跌幅</th>
													<th style="width: 25%;">转手率</th>
												</tr>
											</thead>	
											<tbody>
												<c:forEach items="${stockInfo}" var="rowo" >
													<tr style="width: 100%;height:30px">
														<td><a href="company?stockNum=${rowo.stockNum}">${rowo.stockName}</a></td>
														<td>${rowo.currentPrice}</td>
														<td>${rowo.updownRatio}</td>
														<td>${rowo.turnoverRate}</td>
													</tr>
												</c:forEach>
											</tbody>
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tab">
										<div class="w3l_stocks">
									
											<ul id="myTab1" class="nav nav-tabs" role="tablist" >
												<c:forEach items="${news}" var="row" begin="8" end="13" >
													<li><a style="font-size: 15px;" href="companySingle">${row.newsTitle}</a></li>
												</c:forEach>
											</ul>
									
							
										</div>
									</div>
								</div>
							</div>
						</div>
						
						</div>
		
						<div class="w3l_news_board" >
							<div>
								<h2><i class="fa fa-file-text-o" aria-hidden="true"></i>公告日历</h2>
								<hr />
							</div>
							<div class="w3l_news_board">
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">研报查询</a>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">机构评级</a>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">业绩公告</a>
								<div class="clearfix"></div>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">业绩预告</a>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">特别提示</a>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">公告速递</a>
								<div class="clearfix"></div>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">龙虎榜</a>
								<a style="float: left;border: 1px solid #A1A1A1; font-size: 15px; margin: 5px;">大宗交易</a>
							</div>
							<div class="clearfix"></div>
						</div>
						
						
						<div class="wthree_performance">
							<h3><i class="fa fa-users" aria-hidden="true">&nbsp;个股排行榜</i></h3>
							<br />
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
									<li role="presentation" class="active">
										<a href="#oneDay" id="one_tab" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">24小时</a>
									</li>
									<li role="presentation">
										<a href="#threeDay" role="tab" id="three-tab" data-toggle="tab" aria-controls="newTab">72小时</a>
									</li>
								</ul>
								<div id="myTabContent2" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="oneDay" aria-labelledby="one_tab">
										<div class="w3l_stocks">
											<table style="width: 100%;">
												<tr >
													<td style="width: 33.3%;">1</td>
													<td style="width: 33.3%;"><a href="company">方大炭素</a></td>
													<td style="width: 33.3%;">60996</td>		
												</tr>
												<tr>
													<td>2</td>
													<td><a href="company">中国联通</a></td>
													<td>56973</td>
													
												</tr>
												<tr>
													<td>3</td>
													<td><a href="company">中国联通</a></td>
													<td>-3.41%</td>		
												</tr>
												<tr>
													<td>4</td>
													<td><a href="company">方大炭素</a></td>
													<td>-3.41%</td>	
												</tr>
												<tr>
													<td>5</td>
													<td><a href="company">方大炭素</a></td>
													<td>-3.41%</td>	
												</tr>	
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="threeDay" aria-labelledby="three-tab">
											<div class="w3l_stocks">
											<table style="width: 100%;">
												<tr >
													<td style="width: 33.3%;">1</td>
													<td style="width: 33.3%;"><a href="company">方大炭素</a></td>
													<td style="width: 33.3%;">60996</td>		
												</tr>
												<tr>
													<td>2</td>
													<td><a href="company">中国联通</a></td>
													<td>56973</td>
													
												</tr>
												<tr>
													<td>3</td>
													<td><a href="company">中国联通</a></td>
													<td>-3.41%</td>		
												</tr>
												<tr>
													<td>4</td>
													<td><a href="company">方大炭素</a></td>
													<td>-3.41%</td>	
												</tr>
												<tr>
													<td>5</td>
													<td><a href="company">方大炭素</a></td>
													<td>-3.41%</td>	
												</tr>	
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="agile_chat" style="background-color: #EFEFEF;">
							<div style="padding: 0px;">
								<img class="blink_me" src="<%=basePath %>/images/1.png" alt=" " style="float: left;" /><h3>龙虎榜</h3>
							</div>
							<div class="clearfix"></div>
							<div style="padding-left: 50px;">
								<table>
									<tr>
										<th style="width: 50%;">股票名称</th>
										<th style="width: 50%;">上榜类型</th>
									</tr>
									<tr>
										<td><a href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
									<tr>
										<td><a  href="company">银都股份</a></td>
										<td>新股首日交易信息</td>
									</tr>
								</table>
							</div>
						</div>
						
						
						<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>公司传闻-----------------------------<a href="证券要闻.html">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
									<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
							</div>
						</div>
					
						<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>独家公司互动-----------------<a href="证券要闻.html">更多</a></b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
								<li><a style="font-size: 15px;" href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
								<li><a style="font-size: 15px;" href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
								<li><a style="font-size: 15px;" href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
								<li><a style="font-size: 15px;" href="companySingle">强势股机构分歧大</a></li>
								</ul>
							</div>
						</div>
						</div>
					</div>
					<!--主页最右边部分  -->
					<div class="col-md-3 agileinfo_news_original_grids_right">
						<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
									<li role="presentation" class="active">
										<a href="#home2" id="home2-tab" role="tab" data-toggle="tab" aria-controls="home2" aria-expanded="true">股票</a>
									</li>
									<li role="presentation">
										<a href="#latest2" role="tab" id="latest2-tab" data-toggle="tab" aria-controls="latest2">基金</a>
									</li>
									<li role="presentation">
										<a href="#experts2" role="tab" id="experts2-tab" data-toggle="tab" aria-controls="experts2">期货</a>
									</li>
									<li role="presentation">
										<a href="#experts3" role="tab" id="experts3-tab" data-toggle="tab" aria-controls="experts3">外汇</a>
									</li>
								</ul>
								<div id="myTabContent2" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="home2" aria-labelledby="home2-tab">
										<div class="w3l_stocks">
											
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="latest2" aria-labelledby="latest2-tab">
										<div class="w3l_stocks">
											
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="experts2" aria-labelledby="experts2-tab">
										<div class="w3l_stocks">
											
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="experts3" aria-labelledby="experts3-tab">
										<div class="w3l_stocks">
											
										</div>
									</div>
								</div>
							</div>
						</div>
						
						<div class="wthree_international">
							<img src="<%=basePath %>/images/18.jpg" alt=" " class="img-responsive" />
							<div class="wthree_international_pos">
								<p>international markets</p>
							</div>
						</div>
						
						<div class="w3l_your_stocks">
							<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<div class="w3layouts_market_movers">
										<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>涨跌幅榜单---------<a href="#">更多</a></b></h3> 
								</div>
								<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
									<li role="presentation" class="active">
										<a href="#hu" id="hu_tab" role="tab" data-toggle="tab" aria-controls="huTab" aria-expanded="true">沪A</a>
									</li>
									<li role="presentation">
										<a href="#shen" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">深A</a>
									</li>
								</ul>
								<div id="myTabContent2" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="hu" aria-labelledby="hu_tab">
										<div class="w3l_stocks" style="width: 100%;">
											<table style="width: 100%;">
												<thead>
												<tr style="width: 100%;height:40px;font-size:15px">
													<th style="width: 33%;">股票名称</th>
													<th style="width: 33%;">股票代码</th>
													<th style="width: 33%;">涨跌幅</th>
												</tr>
												</thead>
												<tbody>
													<c:forEach items="${stockHuA}" var="huA">
														<tr style="width: 100%;height:30px">
															<td><a href="company">${huA.stockName}</a></td>
															<td>${huA.stockNum}</td>
															<td>${huA.updownRatio}</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="shen" aria-labelledby="shen-tab">
										<div class="w3l_stocks">
											<table style="width: 100%;">
												<thead>
												<tr style="width: 100%;height:40px;font-size:15px">
													<th style="width: 33%;">股票名称</th>
													<th style="width: 33%;">股票代码</th>
													<th style="width: 33%;">涨跌幅</th>
												</tr>
												</thead>
												<tbody>
													<c:forEach items="${stockShenA}" var="shenA">
														<tr style="width: 100%;height:30px">
															<td><a href="company">${shenA.stockName}</a></td>
															<td>${shenA.stockNum}</td>
															<td>${shenA.updownRatio}</td>
														</tr>
													</c:forEach>
												</tbody>
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
							<div class="w3l_your_stocks">
							<div class="w3_stocks">
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<div class="w3layouts_market_movers">
										<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>资金流向-----------<a href="#">更多</a></b></h3> 
								</div>
								<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
									<li role="presentation" class="active">
										<a href="#liuru" id="ru_tab" role="tab" data-toggle="tab" aria-controls="ruTab" aria-expanded="true">流入</a>
									</li>
									<li role="presentation">
										<a href="#liuchu" role="tab" id="chu-tab" data-toggle="tab" aria-controls="chuTab">流出</a>
									</li>
								</ul>
								<div id="myTabContent2" class="tab-content">
									<div role="tabpanel" class="tab-pane fade in active" id="liuru" aria-labelledby="ru_tab">
										<div class="w3l_stocks">
											<table style="width: 100%;">
												<tr >
													<th >股票代码</th>
													<th >股票名称</th>
													<th >净额（亿）</th>
											
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
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="liuchu" aria-labelledby="chu-tab">
										<div class="w3l_stocks">
											<table style="width: 100%;">
												<tr >
													<th >股票代码</th>
													<th >股票名称</th>
													<th >净额（亿）</th>
											
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
											</table>
										</div>
									</div>
								</div>
							</div>
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