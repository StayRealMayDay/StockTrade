<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
												<a href="#">证券要闻</a>
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
					<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
						<ul id="myTab1" class="col-md-12 nav nav-tabs" role="tablist" >
							<c:forEach items="${securityNews}" var="row">	
								<li>
									<div class="w3l_faq_grid"  style="height:80px; width:700px">
										<table>
											<tr>
												<td>
													<div style="width:500px">
														<a style="font-size: 20px;" href="companySingle">${row.newsTitle}</a>
													</div>
												</td>
											</tr>
											<tr><td>${row.newsTime}</td></tr>
											<tr>
												<td>
													<div style="width:800px;white-space:nowrap;text-overflow:ellipsis;overflow:hidden;" title="这是要显示的文本">
														<a href="companySingle">${row.newsContent}</a>
													</div>
												</td>
											</tr>
										</table>
									</div>							
								</li>
								<input type="hidden" name="pageNum" value="${pager.pageNum}">
							</c:forEach>
						</ul>
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
					<div class="clearfix"></div>
					
					
					<div class="row">
							<div class="col-md-9">
								<div class="pull-left">
									<div class="dataTables_info" id="datatable1_info">显示 1 to
										${pager.pageSize } 总共 ${pager.recordCount }条</div>
								</div>
								<div class="pull-right">
									<div class="dataTables_paginate paging_bs_full" id="datatable1_paginate">
										<ul class="pagination" style="text-align: center;">
											<li><a href="#">共 ${pager.recordCount} 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a>
											</li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="securityNews?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="securityNews?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="securityNews?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="securityNews?pageNum=${pager.pageCount }">末页</a></li>
											<li><a>转到 </a></li>
											<li><a><input id="changePage" type="text"
													style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
											<li><a>页 </a></li>
											<li><a href="javascript:goPage();">跳转</a></li>

										</ul>
									</div>
								</div>
								<div class="clearfix"></div>
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
			<script>
		function goPage() {
			var curPage = document.getElementById("changePage").value * 1;
			if (!/^[1-9]\d*$/.test(curPage)) {
				alert("请输入正整数");
				return;
			}
			var max = $
			{
				pager.pageCount
			}
			;
			if (curPage > max) {
				alert("超出数据页面");
				return;
			}
			//  alert(curPage);
			window.location.href = "?pageNum=" + curPage;
		}
		jQuery(document).ready(function() {
			App.setPage("nestable_lists"); //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	</body>

</html>

