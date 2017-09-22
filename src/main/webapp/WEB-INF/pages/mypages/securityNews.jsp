<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">
	<head>
		<title>证券要闻</title>
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
		<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
		<!-- calender -->
		<link type="text/css" href="<%=basePath %>/css/jquery.simple-dtpicker.css" rel="stylesheet" />
		<!-- //calender -->
		<!-- different-chart-bar -->
		<link rel="stylesheet" href="<%=basePath %>/css/chart.min.css">
		<!-- //different-chart-bar -->
		<!-- font-awesome icons -->
		<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
		<!-- //font-awesome icons -->
		<!-- js -->
		<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
		<!-- js -->
		<!-- pop-up -->
		<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
		<!-- //pop-up -->
		<!-- left-chart -->
		<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
		<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
		<!-- //left-chart -->
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
								<a href="faq">问题解决</a><i>|</i>
							</li>
							<li class="w3layouts_header_list">
								<a href="contact">联系我们</a>
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
						<h1><a href="index"><span>股票</span> 市场<i>交易无处不在，还望谨慎投资。</i></a></h1>
					</div>
					<div class="agileits_search">
						<form action="#" method="post">
							<input name="Search" type="text" placeholder="有什么可以帮助你呢？" required="">
							<select id="agileinfo_search" name="agileinfo_search">
								<option value="commodities">Commodities</option>
								<option value="navs">NAVs</option>
								<option value="quotes">Quotes</option>
								<option value="videos">Videos</option>
								<option value="news">News</option>
								<option value="notices">Notices</option>
								<option value="all">All</option>
							</select>
							<input type="submit" value="搜索">
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
									<a href="index">首页</a>
								</li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">A股<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="securityNews">证券要闻</a>
											</li>
											<li>
												<a href="listedCompany">上市公司</a>
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
												<a href="company">港股公司</a>
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
												<a href="#">美股学堂</a>
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
												<a href="#">入住号</a>
											</li>
										</ul>
									</div>
								</li>
								<li>
									<a href="commodities">Commodities</a>
								</li>	
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Research<span class="caret"></span></a>
									<div class="dropdown-menu w3ls_vegetables_menu">
										<ul>
											<li>
												<a href="funds">Fundamental</a>
											</li>
											<li>
												<a href="funds">Technical</a>
											</li>
											<li>
												<a href="funds">Mutual Funds</a>
											</li>
										</ul>
									</div>
								</li>
								<li>
									<a href="service">Customer Service</a>
								</li>
								<li>
									<a href="portfolio">投资组合</a>
								</li>
							</ul>
						</nav>
					</div>
				</ nav>
			</div>
		</div>
		<!-- //navigation -->
		<!-- banner-bottom -->
		<div class="banner-bottom">
			<div class="panel panel-default agile_panel">
				<div class="panel-body agile_panel_body">
					<div style="float: left; width: 15%;background-color:#EDEDED; ">
							<i class="fa fa-viadeo" aria-hidden="true"></i>&nbsp;&nbsp;
							<a href="marketOverview">行情中心</a>&nbsp;&nbsp;<i>|-----|</i>
					</div>
					<ul style="float: left; width: 85%; background-color: #EDEDED;">
						<li>
							<table class="w3_table_trade">
								<tr>
									<td style="text-align: center;">
										<a href="marketOverview">大盘纵览</a>
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
										<a href="largeSingleTracklist">大单追踪</a>
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
			<div class='agileinfo_marquee'>
				<div data-speed="1000" class="marquee">
					<ul>
						<li>
							<a href="single">重大事件1：NPAs of associate banks to weigh on SBI: Religare Capital<span>\</span></a>
						</li>
						<li>
							<a href="single">重大事件2：Julius Baer analyst sees opportunities in despised China market</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- //banner-bottom -->
		<!-- news-original -->
		<div class="faq">
			<div class="container">
			<div class="w3layouts_market_movers" style="background-color:#E0F2FA">
					<h2 ><i class="fa fa-bar-chart" aria-hidden="true"></i><b>证券要闻</b></h2>
				</div>
				<div class="col-md-9 agileinfo_news_original_grids_left">
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>中国工业企业交出亮丽成绩单</b></h4> 2017年9月12日01:23</a>
						<p>　路 透社北京9月9日电 受原材料价格强劲增长刺激，8月中国的工业生产者出厂价格指数(PPI)增速超预期，
						创4个月新高，表明工厂利润和经济实现强劲和可持续增长。国家统计局今天称，8月PPI同比增长6.3%。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>河南专员办：做实绩效评价 提质预算监管</b></h4>2017年9月12日01:23</a>
						<p>河南是中央转移支付大省。河南专员办牢牢抓住做实转移支付绩效评价这一“牛鼻子”，推动地方各级财政
						、主管部门及相关项目单位关注资金绩效，全面提升预算监管水平，促进中央资金提质增效，取得了明显效果。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4>山东省潍坊市财政局服务“放管服”改革打造阳光政府采购</h4>2017年9月12日01:23</a>
						<p>　近年来，山东省潍坊市财政局以“放管服”改革为抓手，以提高政府采购监管质量和服务水平为目标，依法作为、敢于担当、主动服务，让政府采购真正成为效率采购、效益采购、阳光采购。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>财政支出低增为年内常态 8月土地出让仍高增</b></h4>2017年9月12日01:23</a>
						<p>　8月财政收入同比7.2%，前值11.1%；财政支出同比2.9%，前值5.4%；1-8月政府性基金收入同比31.3%，前值31.6%。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>新华网：长沙推出万套定向限价房保刚需</b></h4>2017年9月12日01:23</a>
						<p>记者从长沙市住房保障服务局获悉，长沙市日前正式推出万套定向限价商品住房，预计年内有望上市2702套住房。其中，部分住房的销售价格仅为每平方米4950元。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>经济加速人民币升值暖心 中国消费者信心逾20年最强</b></h4>2017年9月12日01:23</a>
						<p>　新浪美股讯 北京时间12日彭 博称，随着中国各项经济指标回暖，消费者和家庭的信心达到逾二十年来最强。</p>
					</div><hr />
					<div class="w3l_faq_grid">
						<a href="single"><h4><b>中国推进“一带一路”空间信息走廊建设 促卫星数据与东盟共享</b></h4>2017年9月12日01:23</a>
						<p>　中新社南宁9月11日电 (记者 林浩)中国国防科技工业局副局长吴艳华11日表示，中国愿与“一带一路”沿线国家共享遥感、
						通信、导航等各类卫星数据资源，补充完善天际信息网，共建分布合理、
						功能齐全的地面信息服务网络和区域重大应用服务系统，为重大工程建设提供信息支撑。</p>
					</div>	
				</div>

					<!--主页最右边部分  -->
					<div class="col-md-3 agileinfo_news_original_grids_right">
						<div class="w3layouts_add_market">
							<img src="<%=basePath %>/images/32.jpg" alt=" " class="img-responsive" />
							<div class="w3layouts_add_market_pos">
								<h3>Important thing, pay attention</h3>
							</div>
							
							<div style="height:50px"></div>
						</div>
							<div class="w3layouts_market_movers">
							<h3 style="background-color:#E0F2FA"><i class="fa fa-bar-chart" aria-hidden="true" ></i><b>最热新闻排行</b></h3> 
							<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
								<ul id="myTab1" class="nav nav-tabs" role="tablist">
								<li><a style="font-size: 20px;" href="companySingle">20只翻倍股六成有“国家队”身影</a></li>
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
		</div>


		<!-- footer -->
		<div class="footer">
			<div class="container">
				<ul class="agileits_w3layouts_footer_info">
					<li>
						<a href="index">Home</a><i>|</i></li>
					<li>
						<a href="news">Markets</a><i>|</i></li>
					<li>
						<a href="funds">mutual funds</a><i>|</i></li>
					<li>
						<a href="commodities">commodities</a><i>|</i></li>
					<li>
						<a href="portfolio">portfolio</a><i>|</i></li>
					<li>
						<a href="about">About Us</a><i>|</i></li>
					<li>
						<a href="ipo">IPO</a><i>|</i></li>
					<li>
						<a href="sitemap">sitemap</a>
					</li>
				</ul>
				<p>Copyright &copy; 2016.Company name All rights reserved.
				</p>
			</div>
		</div>
		<!-- //footer -->
		<script>
			$('.marquee').marquee({
				gap: 100,
				delayBeforeStart: 0,
				direction: 'left',
				duplicated: true,
				pauseOnHover: true
			});
		</script>
		<!-- Bootstrap Core JavaScript -->
		<script src="<%=basePath %>/js/bootstrap.min.js"></script>
		<script>
			$(document).ready(function() {
				$(".dropdown").hover(
					function() {
						$('.dropdown-menu', this).stop(true, true).slideDown("fast");
						$(this).toggleClass('open');
					},
					function() {
						$('.dropdown-menu', this).stop(true, true).slideUp("fast");
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

				$().UItoTop({
					easingType: 'easeOutQuart'
				});

			});
		</script>
		<!-- //here ends scrolling icon -->
	</body>

</html>

