<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html>
	<head>
		<title>大单追踪</title>
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
						<h1><a href="index"><span>股票</span> 市场<i>交易无处不在，还望谨慎投资。</i></a></h1>
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
		<div class="trade_navigation"  style="background-color:#287AB4 ;">
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
						<a href="company">公司首页</a>
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
						<a href="institutionalRating">机构评级</a>
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
		
		<div class="faq">
		<div class="container">
		
			<div class="w3l_faq_grids">
				<div class="w3l_faq_grid">
					<a href="single"><h3><b>行业涨跌情况统计一览 (截至09.12-15点)</b></h3> 2017年9月12日01:23</a>
					<p>　 截至15点，上证大盘涨3.07点，报3379.49点，463家上涨，803家下跌，45家平盘；
						深证大盘跌10.12点，报11043.61点，279家上涨，0家下跌，0家平盘；板块表现为：汽车制造股有24家上涨，
						7家下跌，0家平盘。水泥制造股有15家上涨，9家下跌，0家平盘。</p>
				</div>
				<hr />
				<div class="w3l_faq_grid">
					<a href="single"><h3><b>2017年9月12日收盘资金流向报告</b></h3>2017年9月12日01:23</a>
					<p>河南是中央转移支付大省。河南专员办牢牢抓住做实转移支付绩效评价这一“牛鼻子”，推动地方各级财政
						、主管部门及相关项目单位关注资金绩效，全面提升预算监管水平，促进中央资金提质增效，取得了明显效果。</p>
				</div>
				<hr />
				<div class="w3l_faq_grid">
					<a href="single"><h3>个股大单金额流向排名 (截至09.12-15点)</h3>2017年9月12日01:23</a>
					<p> 截至15点，沪深两市大单金额流入排名前3位的个股分别为中科三环（000970）(6.77亿)，浪潮信息（000977）(6.55亿)，西水股份（600291）(4.23亿)。</p>
				</div>
				<hr />
				<div class="w3l_faq_grid">
					<a href="single"><h3><b>[个股异动]山东钢铁(600022):大笔卖出(2017-09-12 14:59:48)</b></h3>2017年9月12日01:23</a>
					<p> 截至14:59，山东钢铁（600022）报2.51，涨1.21%，大笔卖出共10100手；
						昨日（2017-09-11）主力流入15162.97万元，流出21172.32万元，散户流入3719.39万元，流出2427.99万元。
						山东钢铁近1月涨跌幅在行业内名列第15， 小于上证指数。流通市值在行业内名列第9，高于行业平均 ，高于市场平均。</p>
				</div>
				<hr />
				<div class="w3l_faq_grid">
					<a href="single"><h3><b>[个股异动]山东钢铁(600022):大笔卖出(2017-09-12 14:59:38)</h3>2017年9月12日01:23</a>
					<p>记者从长沙市住房保障服务局获悉，长沙市日前正式推出万套定向限价商品住房，预计年内有望上市2702套住房。其中，部分住房的销售价格仅为每平方米4950元。</p>
				</div>
				<hr />
				<div class="w3l_faq_grid">
					<a href="single"><h3><b>[个股异动]四川长虹(600839):大笔卖出(2017-09-12 14:59:06)</b></h3>2017年9月12日01:23</a>
					<p>　 截至14:59，四川长虹（600839）报3.59，跌1.1%，大笔卖出共10020手；
    昨日（2017-09-11）主力流入1721.12万元，流出2241.29万元，散户流入953.59万元，流出907.45万元。
    四川长虹近1月涨跌幅在行业内名列第15， 小于上证指数。
    流通市值在行业内名列第11，高于行业平均 ，高于市场平均。</p>
				</div>
				
			</div>
		</div>
		<div class="footer ">
		<div class="container ">
			<ul class="agileits_w3layouts_footer_info ">
				<li><a href="index ">Home</a><i>|</i></li>
				<li><a href="news ">Markets</a><i>|</i></li>
				<li><a href="funds">mutual funds</a><i>|</i></li>
				<li><a href="commodities ">commodities</a><i>|</i></li>
				<li><a href="portfolio ">portfolio</a><i>|</i></li>
				<li><a href="about ">About Us</a><i>|</i></li>
				<li><a href="ipo ">IPO</a><i>|</i></li>
				<li><a href="sitemap ">sitemap</a></li>
			</ul>
			<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank " href="http://sc.chinaz.com/moban/ ">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>
	</div>
	</body>
</html>
    