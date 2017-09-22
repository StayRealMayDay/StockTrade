<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">
<head>
<title>公司</title>
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
		<!-- //navigation -->
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
<!-- single -->
		<div class="news-original">
		<div class="container">
			<div class="agileinfo_news_original_grids w3_agile_news_market_grids">
				<div class="col-md-9 w3ls_mutual_funds_grid1_jkjk">
					<div class="w3_agileits_single_grids">
						<h3>Interdum et malesuada fames ac ante ipsum elementum vel lorem eu primis in faucibus</h3>
						<h4>"Curabitur laoreet sem eros, id viverra augue dapibus ut. Mauris vitae 
							mi vitae metus auctor fermentum. Ut cursus eros vitae lacus gravida 
							porttitor. In id est eros. Aenean cursus pretium diam, eu placerat massa 
							vestibulum ut. Etiam non lacus vitae lacus cursus efficitur a non sapien.</h4>
						<div class="news-shar-buttons">
							<ul>
								<li>
									<div class="fb-like" data-href="https://www.facebook.com/w3layouts" data-layout="button_count" data-action="like" data-size="small" data-show-faces="false" data-share="false"></div>
									<script>(function(d, s, id) {
									  var js, fjs = d.getElementsByTagName(s)[0];
									  if (d.getElementById(id)) return;
									  js = d.createElement(s); js.id = id;
									  js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.7";
									  fjs.parentNode.insertBefore(js, fjs);
									}(document, 'script', 'facebook-jssdk'));</script>
								</li>
								<li>
									<div class="fb-share-button" data-href="https://www.facebook.com/w3layouts" data-layout="button_count" data-size="small" data-mobile-iframe="true"><a class="fb-xfbml-parse-ignore" target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fwww.facebook.com%2Fw3layouts&amp;src=sdkpreparse">Share</a></div>
								</li>
								<li class="news-twitter">
									<a href="https://twitter.com/w3layouts" class="twitter-follow-button" data-show-count="false">Follow @w3layouts</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
								</li>
								<li>
									<a href="https://twitter.com/intent/tweet?screen_name=w3layouts" class="twitter-mention-button" data-show-count="false">Tweet to @w3layouts</a><script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
								</li>
								<li>
									<!-- Place this tag where you want the +1 button to render. -->
									<div class="g-plusone" data-size="medium"></div>

									<!-- Place this tag after the last +1 button tag. -->
									<script type="text/javascript">
									  (function() {
										var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
										po.src = 'https://apis.google.com/js/platform.js';
										var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
									  })();
									</script>
								</li>
							</ul>
						</div>
						<div class="agileits_w3layouts_comments">
							<p><span>Posted By :</span> <a href="#"><i class="fa fa-user" aria-hidden="true"></i> Admin</a> &nbsp;&nbsp; <i class="fa fa-calendar" aria-hidden="true"></i> July 5, 2016 &nbsp;&nbsp; <a href="#"><i class="fa fa-comments" aria-hidden="true"></i> Comments (10)</a></p>
							<img src="<%=basePath %>/images/55.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="agile_trade_figure_bottom">
							<p>Integer rhoncus vestibulum lectus ac sodales. Vestibulum dapibus, 
								magna quis finibus scelerisque, sapien nisl rutrum mauris, eget 
								ullamcorper est purus pharetra orci. Nam eu magna sit amet dui 
								convallis rhoncus non vel odio. Phasellus in libero nec nunc venenatis 
								finibus sed in neque. <span>Nullam auctor, quam ut eleifend hendrerit, 
								tellus mauris dignissim nibh, nec euismod felis odio ac ex. Maecenas 
								finibus lacinia fermentum.Vestibulum hendrerit, mauris vel 
								convallis semper, ante purus vehicula diam, non blandit leo leo ac 
								justo. Praesent viverra, lacus et tempus tincidunt, massa eros 
								eleifend massa, ac tempus ipsum justo vel erat.</span> Mauris vitae magna lacinia, vehicula diam 
								sed, rutrum tortor. Maecenas orci nibh, tincidunt quis eros ac, 
								vehicula rhoncus lacus. Maecenas ut justo sit amet lectus consequat 
								mollis. Phasellus vehicula consequat vehicula. <i>"Fusce nulla turpis, 
								tempor at auctor et, dignissim semper ligula. Cras eu dolor blandit, 
								facilisis mi et, ultrices orci sapien nisl rutrum mauris, eget 
								ullamcorper est purus pharetra orci. Nam eu magna sit amet dui 
								convallis rhoncus non vel odio. Phasellus in libero nec nunc venenatis 
								finibus sed in neque.</i> Vestibulum hendrerit, mauris vel 
								convallis semper, ante purus vehicula diam, non blandit leo leo ac 
								justo. Praesent viverra, lacus et tempus tincidunt, massa eros 
								eleifend massa, ac tempus ipsum justo vel erat.</p>
						</div>
						<div class="w3_agile_tags">
							<ul>
								<li>Tags</li>
								<li><a href="single">Investment</a></li>
								<li><a href="single">Government</a></li>
								<li><a href="single">Growth</a></li>
								<li><a href="single">Macro - Economy</a></li>
								<li><a href="single">Policy</a></li>
								<li><a href="single">Inflation</a></li>
								<li><a href="single">Banking Sector</a></li>
								<li><a href="single">Debt</a></li>
								<li><a href="single">Economy</a></li>
								<li><a href="single">Shares</a></li>
							</ul>
						</div>
					</div>
					<div class="w3layouts_admin">
						<h3><i class="fa fa-user" aria-hidden="true"></i>Admin</h3>
						<div class="w3layouts_admin_left">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
						<div class="w3layouts_admin_right">
							<a href="single">Christopher</a>
							<p>Quisque nec dictum dolor. Etiam eget ante dolor. Sed nisl odio, 
								bibendum ac lorem ut, molestie hendrerit risus. Vivamus interdum, 
								ipsum non blandit ornare, neque nisi eleifend massa, non tincidunt 
								dui ante et odio. Nam consequat, libero at lobortis auctor, sapien 
								neque auctor elit, at feugiat urna tortor sed ipsum.</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="w3_single_trade_comments">
						<h3><i class="fa fa-comments-o" aria-hidden="true"></i>Comments</h3>
						<div class="fb-comments" data-href="https://w3layouts.com/" data-width="100%" data-numposts="5"></div>
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
											<a href="single"><h4>Kotak Select Focus Fund - Regular (G)</h4></a>
											<p>25.975<i style="color:#00AA00;"><span class="caret caret1"></span>0.06<label>(0.25%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4>Birla SL Frontline Equity (G)</h4></a>
											<p>180.83<i style="color:#00AA00;"><span class="caret caret1"></span>0.14<label>(0.08%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4>SBI Blue Chip Fund (G)</h4></a>
											<p>31.918<i style="color:#00AA00;"><span class="caret caret1"></span>0.02<label>(0.05%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4>Principal Emerging Bluechip (G)</h4></a>
											<p>80.11<i style="color:#00AA00;"><span class="caret caret1"></span>0.37<label>(0.46%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4>SBI Magnum Multicap Funds (G)</h4></a>
											<p>37.592<i style="color:#00AA00;"><span class="caret caret1"></span>0.14<label>(0.36%)</label></i></p>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="experts2" aria-labelledby="experts2-tab">
									<div class="w3l_stocks">
										<div class="w3l_stocks1">
											<a href="single"><h4 style="text-transform:capitalize;">Copper Spt 25,2016</h4></a>
											<p>318.10<i><span class="caret"></span>-4.05<label>(-1.26%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4 style="text-transform:capitalize;">natural gas Spt 24,2016</h4></a>
											<p>177.10<i style="color:#00AA00;"><span class="caret caret1"></span>2.1<label>(1.2%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4 style="text-transform:capitalize;">crude oil Spt 23,2016</h4></a>
											<p>3231.00<i><span class="caret"></span>-61<label>(-1.85%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4 style="text-transform:capitalize;">Silver Spt 22,2016</h4></a>
											<p>44726.00<i><span class="caret"></span>-718<label>(-1.58%)</label></i></p>
										</div>
										<div class="w3l_stocks1">
											<a href="single"><h4 style="text-transform:capitalize;">gold Spt 21,2016</h4></a>
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
<!-- //single -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<ul class="agileits_w3layouts_footer_info">
				<li><a href="index">Home</a><i>|</i></li>
				<li><a href="news">Markets</a><i>|</i></li>
				<li><a href="funds">mutual funds</a><i>|</i></li>
				<li><a href="commodities">commodities</a><i>|</i></li>
				<li><a href="portfolio">portfolio</a><i>|</i></li>
				<li><a href="about">About Us</a><i>|</i></li>
				<li><a href="ipo">IPO</a><i>|</i></li>
				<li><a href="sitemap">sitemap</a></li>
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
<script src="<%=basePath%>>/js/bootstrap.min.js"></script>
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