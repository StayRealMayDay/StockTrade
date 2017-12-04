<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">

	<head>
		<title>大盘纵观</title>
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
						<h1><a href="index.html"><span>股票</span> 市场<i>交易无处不在，还望谨慎投资。</i></a></h1>
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
												<a href="company">上市公司</a>
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
												<a href="listedCompany">港股公司</a>
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
				</nav>
			</div>
		</div>
		<!-- //navigation -->
		<!-- banner-bottom -->
		<div class="banner-bottom">
			<script type="text/javascript">
				$(".demo2").bootstrapNews({
				newsPerPage: 3,
				autoplay: true,
				pauseOnHover: true,
				navigation: false,
				direction: 'up',
				newsTickerInterval: 2500,
				onToDo: function() {
					//console.log(this);
				}
				});
			</script>
			<script src="<%=basePath %>/js/jquery.bootstrap.newsbox.min.js" type="text/javascript"></script>
			<div class='agileinfo_marquee'>
				<div data-speed="10" class="marquee">
					<ul>
						<li>
							<a href="single">NPAs of associate banks to weigh on SBI: Religare Capital<span>\</span></a>
						</li>
						<li>
							<a href="single">Julius Baer analyst sees opportunities in despised China market</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- //banner-bottom -->
		<!-- equity -->
		<div class="equity" >
		<div class=" container "  >
			<div class="col-md-12 w3_equity_market_analysis "  >
			<div class="w3_equity_market_analysis_grid" style="height: 300px; padding: 0 20px 10px 100px;">
				<h3><i class="fa fa-external-link"></i>沪深市场</h3>
				<div style="width: 20%; float: left; height: 450px;">
					<div style="background-color: #F8F8F8 ; height: 150px;" class="abc">
						<div style="text-align: center; padding-top: 20px;">
							<i class="fa fa-building-o"></i>&nbsp;&nbsp;&nbsp;<span>涨跌分布</span>
						</div>
						<div>
							<ul style="display:inline-block; list-style-type: none;">
								<li style="float: left;">上涨：<span>2168只</span></li>
								<li style="float: left;">下跌：<span>2168只</span></li>
							</ul>
						</div>
					</div>

					<div style="background-color: #F8F8F8 ; height: 150px;" class="abd">
						<div style="text-align: center; padding-top: 20px;">
							<i class="fa fa-building-o"></i>&nbsp;&nbsp;&nbsp;<span>涨跌停</span>
						</div>
						<div>
							<ul style="display:inline-block; list-style-type: none;">
								<li style="float: left;">涨停：<span>2168只</span></li>
								<li style="float: left;">跌停：<span>2168只</span></li>
							</ul>
						</div>
					</div>
					<div style="background-color: #F8F8F8 ; height: 150px;" class="abe">
						<div style="text-align: center; padding-top: 20px;">
							<i class="fa fa-building-o"></i>&nbsp;&nbsp;&nbsp;<span>昨日涨停今日收益</span>
						</div>
						<div>
							<ul style="display:inline-block; list-style-type: none;">
								<li style="float: left;">涨停：<span>2168只</span></li>
								<li style="float: left;">跌停：<span>2168只</span></li>
							</ul>
						</div>
					</div>
				</div>
				<div style="width: 80%; float:left ; border:1px solid #D6D6D6 ;height: 450px;" class="shows"></div>
			</div>

			<div class="clearfix"></div>

			<div class="w3_equity_market_analysis_chart">
			</div>
		</div>
		<div class="clearfix"> </div>
		
		<div class="col-md-12 w3_equity_market_analysis" style="height: 260px; padding: 40px 20px 10px 100px;">
			<div  class="col-md-4" style="height: 200px; border: 1px solid #1DA1F2 ;float: left;">
				<p><i class="fa fa-sitemap"></i><b>上市指数</b></p>
				<div>
					1111
				</div>
			</div>
			<div style="height: 200px; border: 1px solid #1DA1F2 ;float: left;margin-left:20px; width:320px">
				<p><i class="fa fa-sitemap"></i><b>深证指数</b></p>
				<div>
					2222
				</div>
			</div>
			<div style="height: 200px; border: 1px solid #1DA1F2 ;float: right;margin-left:20px;width:320px"">
				<p><i class="fa fa-sitemap"></i><b>创业板指指数</b></p>
				<div>
					33333
				</div>
			</div>
		</div>
		<div class="clearfix"> </div>
		<div class="col-md-12 w3_equity_market_analysis" ">
				<div class="w3_equity_market_analysis_grid " style="height: 500px; padding: 0px 20px 10px 100px; ">
					<h3><i class="fa fa-external-link "></i>个人行情</h3>
					<div class="bs-example bs-example-tabs " role="tabpanel " data-example-id="togglable-tabs ">
						<ul id="myTab " class="nav nav-tabs " role="tablist ">
							<li role="presentation " class="active ">
								<a href="#h" id="all-tab" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">全部股票</a>
							</li>
							<li role="presentation ">
								<a href="#l" role="tab" id="shangzheng-tab" data-toggle="tab" aria-controls="shangTab">上证A股</a>
							</li>
							<li role="presentation ">
								<a href="#e" role="tab" id="shenzheng-tab " data-toggle="tab" aria-controls="shenTab">深证A股</a>
							</li>
							<li role="presentation ">
								<a href="#c" role="tab" id="zhongxiao-tab" data-toggle="tab" aria-controls="zhongTab">中小板</a>
							</li>
								<li role="presentation ">
								<a href="#re" role="tab " id="chuangye-tab" data-toggle="tab" aria-controls="chuangTab">创业板</a>
							</li>
						</ul>
						<div id="myTabContent" class="tab-content">
							<div role="tabpanel" class="tab-pane fade in active" id="h" aria-labelledby="all-tab">
								<table  class="table ">
									<thead>
									<tr>
										<th>序号</th>
										<th>代码</th>
										<th>名称</th>
										<th>现价</th>
										<th>涨跌幅(%)</th>
										<th>涨跌</th>
										<th>涨速(%)</th>
										<th>换手(%)</th>
										<th>量比</th>
										<th>振幅(%)</th>
										<th>成交额</th>
										<th>流通股</th>
										<th>流通市值</th>
										<th>市盈率</th>
										<th>加自选</th>
									</tr>
									</thead>
									<tr>
										<td>1</td>
									</tr>
									<tr>
										<td>2</td>
									</tr>
									<tr>
										<td>3</td>
									</tr>
									<tr>
										<td>4</td>
									</tr>
									<tr>
										<td>5</td>
									</tr>
									<tr>
										<td>6</td>
									</tr>
								</table>
							</div>
							<div role="tabpanel " class="tab-pane fade " id="l" aria-labelledby="shangzheng-tab">
								<table  class="table ">
									<thead>
									<tr>
										<th>序号</th>
										<th>代码</th>
										<th>名称</th>
										<th>现价</th>
										<th>涨跌幅(%)</th>
										<th>涨跌</th>
										<th>涨速(%)</th>
										<th>换手(%)</th>
										<th>量比</th>
										<th>振幅(%)</th>
										<th>成交额</th>
										<th>流通股</th>
										<th>流通市值</th>
										<th>市盈率</th>
										<th>加自选</th>
									</tr>
									</thead>
									<tr>
										<td>2-1</td>
									</tr>
								</table>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="e" aria-labelledby="shenzheng-tab">
								<table  class="table ">
								<thead>
									<tr>
										<th>序号</th>
										<th>代码</th>
										<th>名称</th>
										<th>现价</th>
										<th>涨跌幅(%)</th>
										<th>涨跌</th>
										<th>涨速(%)</th>
										<th>换手(%)</th>
										<th>量比</th>
										<th>振幅(%)</th>
										<th>成交额</th>
										<th>流通股</th>
										<th>流通市值</th>
										<th>市盈率</th>
										<th>加自选</th>
									</tr>
									</thead>
									<tr>
										<td>3-1</td>
									</tr>
								</table>
							</div>
							<div role="tabpanel " class="tab-pane fade " id="c" aria-labelledby="zhongxiao-tab ">
									<table  class="table ">
									<thead>
									<tr>
										<th>序号</th>
										<th>代码</th>
										<th>名称</th>
										<th>现价</th>
										<th>涨跌幅(%)</th>
										<th>涨跌</th>
										<th>涨速(%)</th>
										<th>换手(%)</th>
										<th>量比</th>
										<th>振幅(%)</th>
										<th>成交额</th>
										<th>流通股</th>
										<th>流通市值</th>
										<th>市盈率</th>
										<th>加自选</th>
									</tr>
									</thead>
									<tr>
										<td>4-1</td>
									</tr>
								</table>
							</div>
							<div role="tabpanel " class="tab-pane fade " id="re" aria-labelledby="chuangye-tab ">
									<table class="table ">
										<thead>
											<tr>
												<th>序号</th>
												<th>代码</th>
												<th>名称</th>
												<th>现价</th>
												<th>涨跌幅(%)</th>
												<th>涨跌</th>
												<th>涨速(%)</th>
												<th>换手(%)</th>
												<th>量比</th>
												<th>振幅(%)</th>
												<th>成交额</th>
												<th>流通股</th>
												<th>流通市值</th>
												<th>市盈率</th>
												<th>加自选</th>
											</tr>
										</thead>
									</table>
							</div>
						</div>
					</div>
				</div>
			</div>
	    </div>
<!-- //equity -->
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
<!-- footer -->
	<!--<div class="footer ">
		<div class="container ">
			<ul class="agileits_w3layouts_footer_info ">
				<li><a href="index.html ">Home</a><i>|</i></li>
				<li><a href="news.html ">Markets</a><i>|</i></li>
				<li><a href="funds.html ">mutual funds</a><i>|</i></li>
				<li><a href="commodities.html ">commodities</a><i>|</i></li>
				<li><a href="portfolio.html ">portfolio</a><i>|</i></li>
				<li><a href="about.html ">About Us</a><i>|</i></li>
				<li><a href="ipo.html ">IPO</a><i>|</i></li>
				<li><a href="sitemap.html ">sitemap</a></li>
			</ul>
			<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank " href="http://sc.chinaz.com/moban/ ">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>-->
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