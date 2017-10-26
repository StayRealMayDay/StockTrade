<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html>
	<head>
	<title>机构评级</title>
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
						<h1><a href="index.jsp"><span>股票</span> 市场---公司<i>交易无处不在，还望谨慎投资。</i></a></h1>
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
									<a href="company.jsp"><h3>公司首页</h3></a>
								</li>
								<li class="dropdown">
									<a href="securityNews.jsp" >个股聚焦</a>
								</li>
								<li class="dropdown">
									<a href="securityNews.jsp" >公司新闻</a>
								</li>
								<li class="dropdown">
									<a href="companyRating.jsp" >公司评级</a>
								</li>
								<li class="dropdown">
									<a href="securityNews.jsp" >公司研究</a>
								</li>
								<li>
									<a href="institutionRating.jsp">机构评级</a>
								</li>
								<li>
									<a href="securityNews.jsp">公司公告</a>
								</li>
								<li>
									<a href="securityNews.jsp">公司解读</a>
								</li>
								<li>
									<a href="largeSingleTrack.jsp">大单追踪</a>
								</li>
							</ul>
						</nav>
					</div>
				</nav>
			</div>
		</div>
		<!-- //navigation -->
		<!-- banner-bottom -->	
		<div class="banner-bottom">
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
										<a href="marketOverview.jsp">大盘纵览</a>
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
				$(function() {
					$(".demo1").bootstrapNews({
						newsPerPage: 1,
						autoplay: true,
						pauseOnHover: true,
						direction: 'up',
						newsTickerInterval: 3000,
						onToDo: function() {
							//console.log(this);
						}
					});

					$(".demo2").bootstrapNews({
						newsPerPage: 3,
						autoplay: true,
						pauseOnHover: true,
						navigation: false,
						direction: 'up',
						newsTickerInterval: 3000,
						onToDo: function() {
							//console.log(this);
						}
					});
				});
			</script>
			<script src="<%=basePath %>/js/jquery.bootstrap.newsbox.min.js" type="text/javascript"></script>
		</div>
		<!-- //banner-bottom -->


<!-- news-original -->
	<div class="news-original">
		<div class="container">
			<div class="agileinfo_news_original_grids w3_agile_news_market_grids">
				<div class="col-md-10 w3_agile_news_market_commodity">
					<div class="col-md-6 w3_agile_news_market">
						<div class="w3layouts_commodity_news">
							<h3>明星理财师</h3>
						</div>
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/36.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 31, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid1">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/38.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 30, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/37.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid_gas">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/40.jpg" alt=" " class="img-responsive" />
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
					</div>
	
					<div class="col-md-6 w3_agile_news_market_left">
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/36.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 31, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid1">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/38.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 30, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/37.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						</div>
						<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid_gas">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/40.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						</div>
							<div class="w3layouts_commodity_news_grid w3layouts_commodity_news_grid_gas">
							<div class="w3layouts_commodity_news_grid_left">
								<a href="single.jsp">刘昊</a>
								<p><i class="fa fa-blind" aria-hidden="true"></i>所在机构：<span>新浪特约</span></p>
								<p><i class="fa fa-deaf" aria-hidden="true"></i>所在地：<span>美国-美国</span></p>
								<p><i class="fa fa-first-order" aria-hidden="true"></i>证券职业资格号：<span>LCS201406191166</span></p>
								<p>简介：<span>价值投资者，利用量化投资的方式针对分级基金及场内衍生产品的投资机会进行把握。</span></p>
							</div>
							<div class="w3layouts_commodity_news_grid_right">
								<img src="<%=basePath %>/images/40.jpg" alt=" " class="img-responsive" />
							</div>
							<div class="clearfix"> </div>
							<p class="agileits_w3layouts_para">August 28, 2016</p>
						
					</div>
					<div class="clearfix"> </div>
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