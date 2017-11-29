<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">
<head>
<title>Products</title>
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
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- //js -->
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
							<li><a href="index.jsp">Home</a></li>
							<li><a href="equity.jsp">Equity</a></li>
							<li><a href="commodities.jsp">Commodities</a></li>
							<li><a href="news.jsp">News</a></li>
							<li class="act"><a href="products.jsp">Products</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Short Codes<span class="caret"></span></a>				
								<div class="dropdown-menu w3ls_vegetables_menu">
									<ul>	
										<li><a href="icons.jsp">Icons</a></li>
										<li><a href="typography.jsp">Typography</a></li>
									</ul>             
								</div>
							</li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Research<span class="caret"></span></a>				
								<div class="dropdown-menu w3ls_vegetables_menu">
									<ul>	
										<li><a href="funds.jsp">Fundamental</a></li>
										<li><a href="funds.jsp">Technical</a></li>
										<li><a href="funds.jsp">Mutual Funds</a></li>
									</ul>             
								</div>				
							</li>
							<li><a href="service.jsp">Customer Service</a></li>
							<li><a href="portfolio.jsp">Portfolio</a></li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>
<!-- //navigation -->
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="panel panel-default agile_panel">
			<div class="panel-body agile_panel_body">
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
			</div>
		<div class="panel-footer"> </div>
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
<!-- products -->
	<div class="news-original">
		<div class="container">
			<div class="agileinfo_news_original_grids w3_agile_news_market_grids">
				<div class="col-md-9 w3ls_mutual_funds_grid1_jkjk">
					<div class="w3ls_mutual_funds_grid_left w3ls_products_grid">
						<div class="w3_agile_points_trade_market">
							<h3>Products of Trade Market</h3>
							<div class="w3layouts_market_reports">
								<h4>All market reports</h4>
								<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
									<ul id="myTab" class="nav nav-tabs" role="tablist">
										<li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">Capital Market</a></li>
										<li role="presentation" class=""><a href="#latest" role="tab" id="latest-tab" data-toggle="tab" aria-controls="latest" aria-expanded="false">Derivatives</a></li>
										<li role="presentation" class=""><a href="#experts" role="tab" id="experts-tab" data-toggle="tab" aria-controls="experts" aria-expanded="false">Debt Market</a></li>
									</ul>
									<div id="myTabContent" class="tab-content">
										<div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
											<div class="w3_agileits_gain_list">
												<h5>Equities</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bhavcopy file  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Bhavcopy</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Day-wise Turnover &amp; Business Growth</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bhavcopy (PR)  (zip)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Security-wise Price, Volume &amp; Deliverable Positions</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Advancing and Declining Stocks</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Market Activity Report  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Price Bands : Complete List</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Percentage % Share of Top 'N' Securities / Members</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Security-wise Delivery Positions  (DAT)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">EQ &amp; TT : Complete List</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Monthly details of Client Funded by Members Fund</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Volatility  (CSV)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">VAR Margins</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Security Category and Impact Cost</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">STT Non-applicability Report  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Monthly Reports</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bulk Deals</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Short Selling</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Margin Trading Disclosure</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
												</table>
												<h5>Indices</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Nifty 50  Top 10 Holdings  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Indices Data</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Monthly Index Returns</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">-</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">India Vix</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Impact Cost Nifty</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">P/E, P/B &amp; Div Yield values</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Total Returns Index Values</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Past changes to constituents</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Comparison of Indices</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Monthly Reports</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
												</table>
												<h5>Mutual Fund</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Statistics</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Historical Trade Statistics</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Close Ended MF Schemes (Listed)</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">MF Tracker</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Latest NAVs</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">List of eligible AMC schemes</a>
														</td>
													</tr>
												</table>
												<h5>Exchange Traded Funds - ETFs</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Price Volume data</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">ETF's information</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Download securities available for Trading in ETF</a>
														</td>
													</tr>
												</table>
												<h5>IPO</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Book Building - Current Issues</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Past Issues</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">List of SCSBs</a>
														</td>
													</tr>
												</table>
												<h5>SLBS</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">List of eligible securities in SLBS(csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Historical Trade Statistics</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Settlement Calendar</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bhavcopy Download(DAT)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Security-wise Price and Volume</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Weekly Reports</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Monthly Reports</a>
														</td>
													</tr>
												</table>
											</div>
										</div>
										
										<div role="tabpanel" class="tab-pane fade" id="latest" aria-labelledby="latest-tab">
											<div class="w3_agileits_gain_list">
												<h5>Equity Derivatives</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bhavcopy file  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Contract-wise Price Volume data</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Day-wise Turnover &amp;  Business Growth</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Security in ban period for F&amp;O segment  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Category-wise Turnover</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Nifty Close on Expiry</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="singlejsp">NSE Open Interest  (zip)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Historical Volatility</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Monthly Settlement Statistics</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Settlement Prices  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Historical Settlement Prices</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Quantity Freeze</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">FII derivatives statistics  (xls)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">SPAN  - Parameters Files</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Average Quarter Sigma</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Category-Wise Turnover  (xls)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">List of Underlying and Underlying Info</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Top 10 Clearing Member Volumes  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Permitted Lot Sizes</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Participant wise Open Interest  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Participant wise Trading Volumes  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily SPAN - Files</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Latency Statistics</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
												</table>
												<h5>Currency Derivatives</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Bhavcopy  (zip)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Day-wise Turnover</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Day-wise Turnover &amp; Business Growth</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Settlement Prices  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Contract Wise Price Volume</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Internet Trading Statistics</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Market Activity Report  (zip)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">RBI Reference Rates</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Latency Statistics</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Approved list of Securities</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Approved list of Mutual funds</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">-</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Approved list of Banks for issuance of BG and FDR</a>
														</td>
													</tr>
												</table>
											</div>
										</div>
										
										<div role="tabpanel" class="tab-pane fade" id="experts" aria-labelledby="experts-tab">
											<div class="w3_agileits_gain_list">
												<h5>Negotiated trade reporting problem</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Daily Report  (zip)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Security-wises Trade Data</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Business Growth</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">-</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Weekly Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Monthly Reports</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Securities available for trading  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Most Active Securities</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Debt Update</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">-</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Monthly Reports</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
												</table>
												<h5>Corporate Bond Market</h5>
												<table class="w3_agile_all_trade w3_agile_all_trade_funds w3_table_trade">
													<tr>
														<th class="w3_agileits_head w3_agileits_head_w3"><b>Daily Report</b></th>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Archives</b></td>
														<td class="w3_agileits_head1 w3_agileits_head_w3"><b>Monthly Report</b></td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bhavcopy for the day  (csv)</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Security-wise Trade Data</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">Day-wise Turnover &amp; Business Growth</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Corporate Bond Trading Data</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">All Historical Reports</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Security master</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bonds Listed - Public Issue</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Bonds Listed - Private Placement</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Settlement Details</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">Category-wise Settlement Information</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
													</tr>
													<tr>
														<th class="w3_agile_th">
															<a href="single.jsp">All end of the day reports</a>
														</th>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
														<td class="agileits_w3layouts_td">
															<a href="single.jsp">-</a>
														</td>
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
<!-- //products -->
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
<!-- stacked-graph -->
	<script type="text/javascript" src="<%=basePath %>/js/raphael.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/jquery.enumerable.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/jquery.tufte-graph.js"></script>
	 <script type="text/javascript">
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
            data: ["Finance", "Metal", "Telecom"]
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
<script src="<%=basePath %>/js/bootstrap.min.js"></script>
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