<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">
<head>
<title>Commodities</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- //js -->
<!-- pop-up -->
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<!-- //pop-up -->
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
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
											<li><a href="#">免费版本</a></li> 
											<li><a href="#">远航版本</a></li>
											<li><a href="#">电脑版本</a></li>
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
							<a href="faq.jsp">FAQ</a><i>|</i>
						</li>
						<li class="w3layouts_header_list">
							<a href="contact.jsp">Contact Us</a>
						</li>
					</ul>
				</div>
				<div class="w3l_header_right">
					<ul class="w3layouts_header">
						<li class="w3layouts_header_list">
							<a href="login.jsp">登录</a><i>|</i>
						</li>
						<li>
							<a href="register.jsp">注册</a>
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
					<h1><a href="index.jsp"><span>股票</span> 市场<i>交易无处不在，还望谨慎投资。</i></a></h1>
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
	<div class="trade_navigation">
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
									<a href="index.jsp">首页</a>
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">A股<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="#">证券要闻</a>
											</li>
											<li>
												<a href="#">上市公司</a>
											</li>
										</ul>
									</div>
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">港股<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="#">港股通</a>
											</li>
											<li>
												<a href="#">港股公司</a>
											</li>
										</ul>
									</div>
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">美股<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="#">国际财经</a>
											</li>
											<li>
												<a href="#">美股学堂/a>
											</li>
										</ul>
									</div>
								</li>
									<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">名家专题<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="#">自媒体</a>
											</li>
											<li>
												<a href="#">入住号/a>
											</li>
										</ul>
									</div>
								</li>
								<li>
									<a href="commodities.jsp">Commodities</a>
								</li>		
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Research<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="funds.jsp">Fundamental</a>
											</li>
											<li>
												<a href="funds.jsp">Technical</a>
											</li>
											<li>
												<a href="funds.jsp">Mutual Funds</a>
											</li>
										</ul>
									</div>
								</li>
								<li>
									<a href="service.jsp">Customer Service</a>
								</li>
								<li>
									<a href="portfolio.jsp">投资组合</a>
								</li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>
<!-- //navigation -->
<!-- news -->
	<div class="news">
		<div class="news_grid">
			<h3>the goal of a successful trader is to make the best trades. money is secondary</h3>
		</div>
	</div>
<!-- //news -->
<!-- banner-bottom -->
	<div class="banner-bottom">
			<div class="panel panel-default agile_panel">
				<div class="panel-body agile_panel_body">
					<div style="float: left; width: 15%;background-color:#EDEDED; ">
							<i class="fa fa-viadeo" aria-hidden="true"></i>&nbsp;&nbsp;
							<a href="#">行情中心</a>&nbsp;&nbsp;<i>|-----|</i>
					</div>
					<ul style="float: left; width: 85%; background-color: #EDEDED;">
						<li>
							<table class="w3_table_trade">
								<tr>
									<td style="text-align: center;">
										<a href="#">大盘纵览</a>
									</td>
									<td style="text-align: center;">
										<a href="#">概念热点</a>
									</td>
									<td style="text-align: center;">
										<a href="#">证监会行业</a>
									</td>
									<td style="text-align: center;">
										<a href="#">自选股</a>
									</td>
									<td style="text-align: center;">
										<a href="#">新股</a>
									</td>
									<td style="text-align: center;">
										<a href="#">区域板块</a>
									</td>
									<td style="text-align: center;">
										<a href="#">沪股通</a>
									</td>
									<td style="text-align: center;">
										<a href="#">港股</a>
									</td>
									<td style="text-align: center;">
										<a href="#">美股</a>
									</td>
								</tr>
							</table>
						</li>
					</ul>
					<hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
					<div class="clearfix"> </div>
					<div style="float: left; width: 15%;background-color:#EDEDED; ">
							<i class="fa fa-viadeo" aria-hidden="true"></i>&nbsp;&nbsp;
							<a href="#">数据中心</a>&nbsp;&nbsp;<i>|-----|</i>
					</div>
					<ul style="float: left; width: 85%; background-color: #EDEDED;">

						<li style="background-color:#EDEDED;">
							<table class="w3_table_trade">
								<tr>
									<td style="text-align: center;">
										<a href="#">业绩预告</a>
									</td>
									<td style="text-align: center;">
										<a href="#">新股上会</a>
									</td>
									<td style="text-align: center;">
										<a href="#">新股申报表</a>
									</td>
									<td style="text-align: center;">
										<a href="#">资金流向</a>
									</td>
									<td style="text-align: center;">
										<a href="#">龙虎榜</a>
									</td>
									<td style="text-align: center;">
										<a href="#">宏观数据</a>
									</td>
									<td style="text-align: center;">
										<a href="#">高送转</a>
									</td>
									<td style="text-align: center;">
										<a href="#">融资融券</a>
									</td>
									<td style="text-align: center;">
										<a href="#">大宗交易</a>
									</td>
								</tr>
							</table>
						</li>
					</ul>
					<hr style="height:1px;border:none;border-top:1px dashed #0066CC;" />
					<div class="clearfix"> </div>
					<div style="float: left; width: 15%;background-color:#EDEDED; height: 60px; padding-top: 10px;">
							<i class="fa fa-viadeo" aria-hidden="true"></i>&nbsp;&nbsp;
							<a href="#">全球指数</a>&nbsp;&nbsp;<i>|-----|</i>
					</div>
					<ul style="float: right; width: 85%;">
						<li>
							<ul style="">
								<li style="float: left; width: 90%;">
									<ul class="demo1">
										<li class="news-item">
											<table class="w3_table_trade">
												<tr>
													<td class="w3_agileits_td demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">NIFTY 50</td>
															</tr>
															<tr>
																<td>8,638.23<i><span class="caret"></span>-8.35(-0.10%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">SILVER</td>
															</tr>
															<tr>
																<td>46,343.56<i><span class="caret"></span>-186.00(-0.40%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;">Dollar-Rupee</td>
															</tr>
															<tr>
																<td>66.8650<i class="wthree_i"><span class="caret caret1"></span>0.00(0.00%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">CRUDEOIL</td>
															</tr>
															<tr>
																<td>3,097.00<i><span class="caret"></span>-7.00(-0.23%)</i></td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</li>
										<li class="news-item">
											<table class="w3_table_trade">
												<tr>
													<td class="w3_agileits_td demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">gold</td>
															</tr>
															<tr>
																<td>31,350.23<i><span class="caret"></span>-117.00(-0.37%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">ftsc</td>
															</tr>
															<tr>
																<td>6.887.93<i><span class="caret"></span>-5.99(-0.09%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">cac</td>
															</tr>
															<tr>
																<td>4,436.70<i><span class="caret"></span>-23.00(0.54%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">dax</td>
															</tr>
															<tr>
																<td>10,596.00<i><span class="caret"></span>-79.89(-0.75%)</i></td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</li>
										<li class="news-item">
											<table class="w3_table_trade">
												<tr>
													<td class="w3_agileits_td demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">sensex</td>
															</tr>
															<tr>
																<td>2,7993.64<i><span class="caret"></span>-66.59(-0.24%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">nhai</td>
															</tr>
															<tr>
																<td>1,256.00<i style="color:#00AA00"><span class="caret caret1"></span>16.20(1.31%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;">Euro-Rupee</td>
															</tr>
															<tr>
																<td>75.42<i class="wthree_i"><span class="caret caret1"></span>0.03(0.04%)</i></td>
															</tr>
														</table>
													</td>
													<td class="demo1_w3_table_trade">
														<table class="agileits_w3layouts_table">
															<tr>
																<td style="color:#01A9CE;text-transform:uppercase;">iifl</td>
															</tr>
															<tr>
																<td>1,006.51<i><span class="caret"></span>-1.25(-0.12%)</i></td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</li>
									</ul>
								</li>
								<li style="float: right;width: 10%;">
									<div class="panel-footer"> </div>
								</li>
							</ul>
						</li>
					</ul>

				</div>

			</div>
		<script type="text/javascript">
			$(function () {
				$(".demo1").bootstrapNews({
					newsPerPage: 1,
					autoplay: true,
					pauseOnHover:true,
					direction: 'up',
					newsTickerInterval: 3000,
					onToDo: function () {
						//console.log(this);
					}
				});
				
				$(".demo2").bootstrapNews({
					newsPerPage: 3,
					autoplay: true,
					pauseOnHover: true,
					navigation: false,
					direction: 'up',
					newsTickerInterval: 2500,
					onToDo: function () {
						//console.log(this);
					}
				});
			});
		</script>
		<script src="<%=basePath %>/js/jquery.bootstrap.newsbox.min.js" type="text/javascript"></script>
		<div class='agileinfo_marquee'>
			<div data-speed="10" class="marquee">
				<ul>
					<li><a href="single.jsp">NPAs of associate banks to weigh on SBI: Religare Capital<span>\</span></a></li>
					<li><a href="single.jsp">Julius Baer analyst sees opportunities in despised China market</a></li>
				</ul>
			</div>
		</div>
	</div>
<!-- //banner-bottom -->
<!-- news-original -->
	<div class="news-original">
		<div class="container">
			<div class="agileinfo_news_original_grids w3_agile_news_market_grids">
				<div class="col-md-9 w3_agile_news_market_commodity">
					<div class="col-md-7 w3_agile_news_market">
						<div class="w3layouts_commodity_news">
							<h3>Commodity News</h3>
						</div>
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">Gold slips on steady dollar with Fed rate hike in focus</a>
								<p>The case for raising US interest rates has strengthened in recent months due to improvements in the labour market, Fed Chair Janet Yellen said on Friday.</p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/36.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 31, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid1">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.html">Crude oil at 7-month high; racing towards US$ 50 a bbl</a>
								<p>The global oil supply is expected to cut by nearly 
									4 million barrels per day this month. Data shows that US crude ...</p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/38.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 30, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">Offsetting currency fluctuation risk! S&amp;P BSE Gold Hedged Indices launched</a>
								<p>The S&amp;P BSE SENSEX Gold Hedge is calculated as a combination of a long S&amp;P BSE SENSEX total return positio...</p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/37.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid_gas">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">Natural gas extends win streak; oil futures bounce</a>
								<p>Natural-gas futures score their ninth gain in 10 sessions, 
									while oil prices recoup some of the previous session’s hefty 
									losses.</p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/40.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						</div>
						<div class="w3_commodity_prices">
							<h3><i class="fa fa-hand-o-right" aria-hidden="true"></i>Commodity Prices</h3>
							<div class="agileinfo_fund_offers_table">
								<table class="w3_table_trade">
									<tr>
										<th>Commodity</th>
										<th class="w3_agileits_head1">Rs\-</th>
										<th class="w3_agileits_head1">Change</th>
										<th class="w3_agileits_head1">%Change</th>
									</tr>
									<tr>
										<td><a href="single.jsp">Gold - 5 Oct</a></td>
										<td class="agileits_w3layouts_td">30947.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">43.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-0.14%</td>
									</tr>  
									<tr>
										<td><a href="single.jsp">Silver - 5 Sep</a></td>
										<td class="agileits_w3layouts_td">43710.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">267.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-0.61%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Crudeoil - 19 Sep</a></td>
										<td class="agileits_w3layouts_td">3166.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">28.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-0.88%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Natural Gas - 27 Sep</a></td>
										<td class="agileits_w3layouts_td">195.50</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">2.30</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-1.16%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Aluminium - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">109.65</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.10</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.09%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Copper - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">308.95</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">1.00</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.32%</td>
									</tr> 	
									<tr>
										<td><a href="single.jsp">Nickel - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">659.80</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">3.00</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.46%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Lead - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">125.45</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.20</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.16%</td>
									</tr>
									<tr>
										<td><a href="single.jsp">Zinc - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">155.95</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.20</td>
										<td class="agileits_w3layouts_td" style="color:#00AA00;">0.13%</td>
									</tr> 
									<tr>
										<td><a href="single.jsp">Methanol - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">884.90</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">2.20</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-0.25%</td>
									</tr>
									<tr>
										<td><a href="single.jsp">Cotton - 31 Aug</a></td>
										<td class="agileits_w3layouts_td">20240.90</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">150.00</td>
										<td class="agileits_w3layouts_td" style="color:#FF0000;">-0.74%</td>
									</tr> 								
								</table>
							</div>
						</div>
					</div>
					<div class="col-md-5 w3_agile_news_market_left">
						<div class="w3l_commodity_top_news">
							<h3><i class="fa fa-file-text-o" aria-hidden="true"></i>top news</h3>
							<ul>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Oil prices extend losses as dealers eye output talks</a></li>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Gold holds above 4-week low, awaits clues on Fed rate hike</a></li>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Ram Vilas Paswan favours ban on sugar futures</a></li>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Gold ends flat, silver slips on poor buying</a></li>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Gold steady as investors await US rate hike clues</a></li>
								<li class="fa fa-long-arrow-right" aria-hidden="true"><a href="single.jsp">Oil prices fall on US crude stocks build; fears over China demand</a></li>
							</ul>
						</div>
						<div class="w3layouts_commodity_news_grid_sub">
							<a href="single.jsp">Gold steady above 4-week lows as dollar slips ahead of Yellen speech</a>
							<img src="<%=basePath %>/images/39.jpg" alt=" " class="img-responsive" />
							<p>"Gold prices are in the sidelines, waiting for clues from Yellen's speech," said Helen Lau, an analyst with Argonaut Securities in Hong Kong.</p>
						</div>
						<div class="agileits_commodity_statistics">
							<h3><i class="fa fa-building-o" aria-hidden="true"></i>Commodity Statistics</h3>
							<div class="agileinfo_commodity_top_gain">
								<h4>Top Gainers</h4>
								<div class="agileinfo_fund_offers_table">
									<table class="w3_agileits_commodity_top w3_table_trade">
										<tr>
											<th>Contract</th>
											<th>Last</th>
											<th class="wthree_change">Chg</th>
										</tr>
										
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CARDAMOM-Nov 16</a></td>
											<td>1,224.00</td>
											<td class="agileits_w3layouts_td" style="color:#00AA00;">20</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">NICKELM-Oct 16</a></td>
											<td>673.00</td>
											<td class="agileits_w3layouts_td" style="color:#00AA00;">4</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">NICKELM-Sep 16</a></td>
											<td>666.20</td>
											<td class="agileits_w3layouts_td" style="color:#00AA00;">3</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">COPPERM-Feb 17</a></td>
											<td>322.00</td>
											<td class="agileits_w3layouts_td" style="color:#00AA00;">1</td>
										</tr>			
									</table>
								</div>
							</div>
							<div class="agileinfo_commodity_top_gain">
								<h4>Top Losers</h4>
								<div class="agileinfo_fund_offers_table">
									<table class="w3_agileits_commodity_top w3_table_trade">
										<tr>
											<th>Contract</th>
											<th>Last</th>
											<th class="wthree_change">Chg</th>
										</tr>
										
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOIL-Jan 17</a></td>
											<td>3,387.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-44</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOIL-Oct 16</a></td>
											<td>3,219.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-34</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOIL-Sep 16</a></td>
											<td>3,162.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-32</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOILM-Sep 16</a></td>
											<td>3,162.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-32</td>
										</tr>		
									</table>
								</div>
							</div>
							<div class="agileinfo_commodity_top_gain">
								<h4>Active (Volume)</h4>
								<div class="agileinfo_fund_offers_table">
									<table class="w3_agileits_commodity_top w3_table_trade">
										<tr>
											<th>Contract</th>
											<th>Last</th>
											<th class="wthree_change">Chg</th>
										</tr>
										
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOILM-Sep 16</a></td>
											<td>3,162.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-32</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">CRUDEOIL-Sep 16</a></td>
											<td>3,162.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-32</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">SILVERMIC-Aug 16</a></td>
											<td>43,715.00</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-294</td>
										</tr>
										<tr>
											<td style="text-align:left;"><a href="single.jsp">NATURAL GAS-Sep 16</a></td>
											<td>196.30</td>
											<td class="agileits_w3layouts_td" style="color:#FF0000;">-2</td>
										</tr>			
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>
					<div class="agile_commodity_videos">
						<h3><i class="fa fa-video-camera" aria-hidden="true"></i>commodity videos</h3>
						<ul id="flexiselDemo1">	
							<li>
								<div class="agile_commodity_videos_grid">
									<div class="w3ls_market_video_grid1">
										<img src="<%=basePath %>/images/41.jpg" alt=" " class="img-responsive" />
										<a class="w3_play_icon w3ls_play_icon" href="#small-dialog1">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
									<div class="w3ls_market_video_grid2">
										<a href="single.jsp">Rupee closes stronger against US dollar at 67.40</a>
									</div>
								</div>
							</li>
							<li>
								<div class="agile_commodity_videos_grid">
									<div class="w3ls_market_video_grid1">
										<img src="<%=basePath %>/images/42.jpg" alt=" " class="img-responsive" />
										<a class="w3_play_icon w3ls_play_icon" href="#small-dialog1">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
									<div class="w3ls_market_video_grid2">
										<a href="single.jsp">As per industry sources, Cotton imports may see a new high this fiscal as the overall area where co</a>
									</div>
								</div>
							</li>
							<li>
								<div class="agile_commodity_videos_grid">
									<div class="w3ls_market_video_grid1">
										<img src="<%=basePath %>/images/38.jpg" alt=" " class="img-responsive" />
										<a class="w3_play_icon w3ls_play_icon" href="#small-dialog1">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
									<div class="w3ls_market_video_grid2">
										<a href="single.jsp">Growth in petroleum sector driven by growth in Indian eco</a>
									</div>
								</div>
							</li>
							<li>
								<div class="agile_commodity_videos_grid">
									<div class="w3ls_market_video_grid1">
										<img src="<%=basePath %>/images/39.jpg" alt=" " class="img-responsive" />
										<a class="w3_play_icon w3ls_play_icon" href="#small-dialog1">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
									<div class="w3ls_market_video_grid2">
										<a href="single.jsp">Gold slips as investors await central bank decisions</a>
									</div>
								</div>
							</li>
							<li>
								<div class="agile_commodity_videos_grid">
									<div class="w3ls_market_video_grid1">
										<img src="<%=basePath %>/images/40.jpg" alt=" " class="img-responsive" />
										<a class="w3_play_icon w3ls_play_icon" href="#small-dialog1">
											<span class="glyphicon glyphicon-play-circle" aria-hidden="true"></span>
										</a>
									</div>
									<div class="w3ls_market_video_grid2">
										<a href="single.jsp">Crude prices trade flat, strong dollar weighs on gold</a>
									</div>
								</div>
							</li>
						</ul>
						<!-- pop-up-box -->  
							<script src="<%=basePath %>/js/jquery.magnific-popup.js" type="text/javascript"></script>
						<!--//pop-up-box -->
						<div id="small-dialog1" class="mfp-hide">
							<iframe src="https://player.vimeo.com/video/6495257"></iframe>
						</div>
						<script>
							$(document).ready(function() {
							$('.w3ls_play_icon').magnificPopup({
								type: 'inline',
								fixedContentPos: false,
								fixedBgPos: true,
								overflowY: 'auto',
								closeBtnInside: true,
								preloader: false,
								midClick: true,
								removalDelay: 300,
								mainClass: 'my-mfp-zoom-in'
							});
																							
							});
						</script>
						<script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 4,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 2
										}, 
										landscape: { 
											changePoint:640,
											visibleItems:3
										},
										tablet: { 
											changePoint:768,
											visibleItems: 4
										}
									}
								});
								
							});
					</script>
					<script type="text/javascript" src="<%=basePath %>/js/jquery.flexisel.js"></script>
					</div>
				</div>
				<div class="col-md-3 agileinfo_news_original_grids_right">
					<div class="w3layouts_add_market">
						<img src="<%=basePath %>/images/13.jpg" alt=" " class="img-responsive" />
						<div class="w3layouts_add_market_pos">
							<h3>pay demat dues online</h3>
						</div>
					</div>
					<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active"><a href="#home2" id="home2-tab" role="tab" data-toggle="tab" aria-controls="home2" aria-expanded="true">Stocks</a></li>
								<li role="presentation"><a href="#latest2" role="tab" id="latest2-tab" data-toggle="tab" aria-controls="latest2">Funds</a></li>
								<li role="presentation"><a href="#experts2" role="tab" id="experts2-tab" data-toggle="tab" aria-controls="experts2">Commodities</a></li>
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="home2" aria-labelledby="home2-tab">
									<div class="w3l_stocks">
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Axis Bank</h4></a>
											<p>579.80<i style="color:#00AA00;"><span class="caret caret1"></span>1.85<label>(0.33%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Infosys</h4></a>
											<p>1,016.35<i><span class="caret"></span>-4.95<label>(-0.48%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>SBI</h4></a>
											<p>255.70<i><span class="caret"></span>-3.75<label>(-1.45%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Sun Pharma</h4></a>
											<p>808.25<i><span class="caret"></span>-13.75<label>(-1.75%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>TCS</h4></a>
											<p>2,548.70<i><span class="caret"></span>-54.80<label>(-2.10%)</label></i></p>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="latest2" aria-labelledby="latest2-tab">
									<div class="w3l_stocks">
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Kotak Select Focus Fund - Regular (G)</h4></a>
											<p>25.975<i style="color:#00AA00;"><span class="caret caret1"></span>0.06<label>(0.25%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Birla SL Frontline Equity (G)</h4></a>
											<p>180.83<i style="color:#00AA00;"><span class="caret caret1"></span>0.14<label>(0.08%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>SBI Blue Chip Fund (G)</h4></a>
											<p>31.918<i style="color:#00AA00;"><span class="caret caret1"></span>0.02<label>(0.05%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>Principal Emerging Bluechip (G)</h4></a>
											<p>80.11<i style="color:#00AA00;"><span class="caret caret1"></span>0.37<label>(0.46%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4>SBI Magnum Multicap Funds (G)</h4></a>
											<p>37.592<i style="color:#00AA00;"><span class="caret caret1"></span>0.14<label>(0.36%)</label></i></p>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="experts2" aria-labelledby="experts2-tab">
									<div class="w3l_stocks">
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4 style="text-transform:capitalize;">Copper Spt 25,2016</h4></a>
											<p>318.10<i><span class="caret"></span>-4.05<label>(-1.26%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4 style="text-transform:capitalize;">natural gas Spt 24,2016</h4></a>
											<p>177.10<i style="color:#00AA00;"><span class="caret caret1"></span>2.1<label>(1.2%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4 style="text-transform:capitalize;">crude oil Spt 23,2016</h4></a>
											<p>3231.00<i><span class="caret"></span>-61<label>(-1.85%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4 style="text-transform:capitalize;">Silver Spt 22,2016</h4></a>
											<p>44726.00<i><span class="caret"></span>-718<label>(-1.58%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single.jsp"><h4 style="text-transform:capitalize;">gold Spt 21,2016</h4></a>
											<p>31285.00<i><span class="caret"></span>-119<label>(-0.38%)</label></i></p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="agileinfo_chat">
						<h3><i class="fa fa-comments-o" aria-hidden="true"></i>Chat</h3>
						<div class="agileinfo_chat_left">
							<img src="<%=basePath %>/images/17.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="agileinfo_chat_right">
							<h4>Mark Allen</h4>
							<p>investments in fixed income</p>
						</div>
						<div class="clearfix"> </div>
						<h5><i>Head funds & fixed income research, CRISIL <span>(25 Sep 2016 - 20:00hrs)</span></i></h5>
						<a href="single.jsp"><span class="blink_me">Chat Now</span></a>
					</div>
					<div class="wthree_international">
						<img src="<%=basePath %>/images/18.jpg" alt=" " class="img-responsive" />
						<div class="wthree_international_pos">
							<p>international markets</p>
						</div>
					</div>
					<div class="w3layouts_newsletter">
						<h3><i class="fa fa-envelope" aria-hidden="true"></i>Newsletter</h3>
						<form action="#" method="post">
							<input class="email" name="Email" type="email" placeholder="Email" required="">
							<input type="submit" value="Send">
						</form>
						<p>Trade market offers you a choice of email alerts on your investments for FREE!</p>
					</div>
					<div class="w3_latest_stock">
						<img src="<%=basePath %>/images/19.jpg" alt=" " class="img-responsive" />
						<div class="w3_latest_stock_pos">
							<h3>latest <span>stock <i>market</i> updates</span></h3>
						</div>
					</div>
					<div class="w3l_your_stocks">
						<h3><i class="fa fa-stack-exchange" aria-hidden="true"></i>Your Stocks</h3>
						<form action="#" method="post">
							<span>
								<label>Name</label>
								<input type="text" name="Name" placeholder=" " required="">
							</span>
							<span>
								<label>Mobile</label>
								<input type="text" name="Mobile" placeholder=" " required="">
							</span>
							<span>
								<label>Email</label>
								<input type="email" name="Email" placeholder=" " required="">
							</span>
							<span>
								<label>Location</label>
								<input type="text" name="Location" placeholder=" " required="">
							</span>
							<span>
								<label>Pin</label>
								<input type="text" name="Pin" placeholder=" " required="">
							</span>
							<input type="submit" value="Submit Now">
						</form>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //news-original -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<ul class="agileits_w3layouts_footer_info">
				<li><a href="index.jsp">Home</a><i>|</i></li>
				<li><a href="news.jsp">Markets</a><i>|</i></li>
				<li><a href="funds.jsp">mutual funds</a><i>|</i></li>
				<li><a href="commodities.jsp">commodities</a><i>|</i></li>
				<li><a href="portfolio.jsp">portfolio</a><i>|</i></li>
				<li><a href="about.jsp">About Us</a><i>|</i></li>
				<li><a href="ipo.jsp">IPO</a><i>|</i></li>
				<li><a href="sitemap.jsp">sitemap</a></li>
			</ul>
			<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>
<!-- //footer -->
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
<script src="js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
<!-- //Bootstrap Core JavaScript -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
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