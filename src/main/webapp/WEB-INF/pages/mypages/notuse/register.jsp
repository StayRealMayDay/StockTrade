<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<html lang="en">
<head>
<title>注册页面</title>
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
							<li><a href="index.jsp">首页</a></li>
							<li><a href="equity.jsp">A股</a></li>
							<li><a href="commodities.jsp">港股</a></li>
							<li><a href="news.jsp">美股</a></li>
							<li><a href="products.jsp">Products</a></li>
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
<!-- register -->
	<div class="login">
		<div class="container">
			<h3>用户注册</h3>
			<form action="#" method="post">
				<span class="input input--kuro">
					<input class="input__field input__field--kuro kuro_w3" type="text" id="input-7" placeholder="" required="">
					<label class="input__label input__label--kuro" for="input-7">
						<span class="input__label-content input__label-content--kuro">用户名</span>
					</label>
				</span>
				<span class="input input--kuro">
					<input class="input__field input__field--kuro kuro_w3" type="password" id="input-8" placeholder="" required="">
					<label class="input__label input__label--kuro" for="input-8">
						<span class="input__label-content input__label-content--kuro">密码</span>
					</label>
				</span>
					<span class="input input--kuro">
					<input class="input__field input__field--kuro kuro_w3" type="password" id="input-9" placeholder="" required="">
					<label class="input__label input__label--kuro" for="input-9">
						<span class="input__label-content input__label-content--kuro">确认密码</span>
					</label>
				</span>
				<span class="input input--kuro">
					<input class="input__field input__field--kuro kuro_w3" type="text" id="input-10" placeholder="" required="">
					<label class="input__label input__label--kuro" for="input-10">
						<span class="input__label-content input__label-content--kuro">电话号码</span>
					</label>
				</span>
				<span class="input input--kuro">
					<input class="input__field input__field--kuro kuro_w3" type="text" id="input-11" placeholder="" required="">
					<label class="input__label input__label--kuro" for="input-11">
						<span class="input__label-content input__label-content--kuro">邮箱绑定</span>
					</label>
				</span>
				<div class="agileinfo_remember">
					<div class="agileinfo_remember_left">
						<input type="checkbox" id="brand1" value="">
						<label for="brand1"><span></span>Remember me</label>
					</div>
					<div class="agileinfo_remember_right">
						<a href="#">Forgot Password?</a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<input type="submit" value="Submit">
			</form>
			<div class="w3l_login_form_bottom">
				<h4>(Or)<span>Share With</span></h4>
				<div class="agileits_social_icons">
					<ul> 
						<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i><span class="text">Facebook</span></a></li>
						<li class="w3ls_w3_twitter"><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i><span class="text">Twitter</span></a></li>
						<div class="clearfix"> </div>
					</ul> 
				</div>
			</div>
			<div class="w3l_login_form_bottom1">
				<a href="register.jsp">返回首页</a>
			</div>
		</div>
	</div>
<!-- //login -->
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