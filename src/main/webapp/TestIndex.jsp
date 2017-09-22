<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <title>Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

        <!-- Styles -->
        <link href='<%= basePath%>/static/adStyle/add/vendor/font-awesome/css/font-awesome.min.css' rel='stylesheet' type='text/css'>
        <link href='<%= basePath%>https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
        <link href='<%= basePath%>https://fonts.googleapis.com/css?family=Playfair+Display:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
        <link href='<%= basePath%>https://fonts.googleapis.com/css?family=Raleway:400,700,300' rel='stylesheet' type='text/css'>
        <link href="<%= basePath%>/static/adStyle/add/fonts/Stroke-Gap-Icons-Webfont/style.css" rel="stylesheet" type="text/css" />

        <!-- components -->
        <link href="<%= basePath%>/static/adStyle/add/vendor/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="<%= basePath%>/static/adStyle/add/vendor/owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet" type="text/css" /> 
        <link href="<%= basePath%>/static/adStyle/add/vendor/slider-pro/dist/css/slider-pro.min.css" rel="stylesheet" type="text/css" /> 
        <link href="<%= basePath%>/static/adStyle/add/vendor/slick-carousel/slick/slick.css" rel="stylesheet" type="text/css" /> 
        <link href="<%= basePath%>/static/adStyle/add/vendor/animate.css/animate.min.css" rel="stylesheet" type="text/css" /> 
        <link href="<%= basePath%>/static/adStyle/add/vendor/fancybox/source/jquery.fancybox.css" rel="stylesheet" type="text/css" /> 

        <link href="<%= basePath%>/static/adStyle/add/css/main.css" rel="stylesheet" type="text/css" />

    </head>
    <body data-scrolling-animations="true">

        <div id="page-preloader"><span class="spinner"></span></div>

        <!-- ========================== -->
        <!-- Navigation -->
        <!-- ========================== -->
        <header class="header scrolling-header">
            <nav id="nav" class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="container relative-nav-container">
                    <a class="toggle-button visible-xs-block" data-toggle="collapse" data-target="#navbar-collapse">
                        <i class="fa fa-navicon"></i>
                    </a>
                    <a class="navbar-brand scroll" href="/ventureassess/Index">
                        <img class="normal-logo hidden-xs" src="<%= basePath%>/static/adStyle/add/img/logo-free.png"  alt="logo" /><font color="white" size="6px">Venture Assess</font>
                        <img class="scroll-logo hidden-xs" src="<%= basePath%>/static/adStyle/add/img/logo-dark.png" alt="logo" />
                        <img class="scroll-logo visible-xs-block" src="<%= basePath%>/static/adStyle/add/img/logo-free.png" alt="logo" />
                    </a>
                   <!--  <ul class="nav navbar-nav navbar-right nav-icons wrap-user-control">
                        <li>
                            <a id="search-open" href="#fakelink"><i class="fa fa-search"></i></a>
                        </li>
                        <li class="open-signup">
                            <a href="#fakelink"><i class="fa fa-search"></i></a>
                        </li>
                    </ul> -->
                    <ul class="nav navbar-nav navbar-right nav-icons wrap-user-control">
                        <li>
                            <a id="search-open" href="#fakelink"><i class="fa fa-search"></i></a>
                        </li>
                        <li class="open-signup">
                            <a id="user-open" href="/ventureassess/toLogin"><i class="fa fa-user"></i></a>
                        </li>
                    </ul>
                    <div class="navbar-collapse collapse floated" id="navbar-collapse">
                        <ul class="nav navbar-nav navbar-with-inside clearfix navbar-right with-border"> 
                            <li><a href="/ventureassess/Index">Home</a></li>
                            <li><a href="/ventureassess/toAboutMe">About Us</a></li>
                            <li><a href="/ventureassess/enterpriseItem?enterOrder=1">Process</a></li>
                            <li><a href="/ventureassess/toRegister">Register</a></li>
                        </ul>
                    </div>
                </div>
                <div class="navbar-search ">
                    <div class="container">
                        <form>
                            <div class="input-group">
                                <input type="text" placeholder="Type your search..." class="form-control" autocomplete="off">
                                <span class="input-group-btn">
                                    <button type="reset" class="btn search-close" id="search-close">
                                        <i class="fa fa-close"></i>
                                    </button>
                                </span>
                            </div>
                        </form>
                    </div>
                </div>
            </nav>
        </header><!--./navigation -->

        <!-- ========================== -->
        <!-- HOME - HEADER -->
        <!-- ========================== -->
        <section class="top-header home-header with-bottom-effect transparent-effect dark">
            <div class="bottom-effect"></div>
            <div class="header-container">	
                <div class="wrap-section-slider" id="topSlider">
                    <div class="sp-slides">
                        <div class="slide-item sp-slide">
                            <div class="slide-image">
                                <img src="<%= basePath%>/static/adStyle/add/img/sections/home-top-background.jpg"  alt="" />
                            </div>
                            <div class="slide-content ">
                                <p class="top-title sp-layer"  data-show-transition="left" data-hide-transition="up" data-show-delay="400" data-hide-delay="100" >we are oscend</p>
                                <div class="title sp-layer" data-show-transition="right" data-hide-transition="up" data-show-delay="500" data-hide-delay="150">flexible & universal</div>
                                <div class="under-title sp-layer" data-show-transition="up" data-hide-transition="up" data-show-delay="600" data-hide-delay="200">for all your business needs</div>
                                <div class="controls sp-layer" data-show-transition="up" data-hide-transition="up" data-show-delay="800" data-hide-delay="250">
                                    <a href="#" class="btn btn-primary">Get Started NOW</a>
                                    <a href="#" class="btn btn-info">&nbsp;&nbsp;Discover More&nbsp;&nbsp;</a>
                                </div>
                            </div>
                        </div>
                        <div class="slide-item sp-slide">
                            <div class="slide-image">
                                <img src="<%= basePath%>/static/adStyle/add/img/sections/section-11.jpg" alt="" />
                            </div>
                            <div class="slide-content sp-layer">
                                <p class="top-title sp-layer"  data-show-transition="left" data-hide-transition="up" data-show-delay="400" data-hide-delay="100" >we are oscend</p>
                                <div class="title sp-layer" data-show-transition="right" data-hide-transition="up" data-show-delay="500" data-hide-delay="150">flexible & universal</div>
                                <div class="under-title sp-layer" data-show-transition="up" data-hide-transition="up" data-show-delay="600" data-hide-delay="200">for all your business needs</div>
                                <div class="controls sp-layer" data-show-transition="up" data-hide-transition="up" data-show-delay="800" data-hide-delay="250">
                                    <a href="#" class="btn btn-primary">Get Started NOW</a>
                                    <a href="#" class="btn btn-info">&nbsp;&nbsp;Discover More&nbsp;&nbsp;</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--./container-->
        </section>  



        <!-- ========================== -->
        <!-- HOME - SERVICES  -->
        <!-- ========================== -->
        <section class="services-section ">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-Flag"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>新闻动态</h4>
                                <!-- <p><em>best solutions that works</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list listr">
			                          <c:forEach items="${news1}" var="new1" begin="0" end="2">
										<li><a title="${new1.newsTitle}"
											href="/ventureassess/newsDetail?news_uuid=${new1.newsUuid}">${new1.newsTitle}</a>
										</li>
			                          </c:forEach>
									</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-Carioca"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>评审专家</h4>
                                <!-- <p><em>lorem ipsum dolor sit amet</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list listr">
										 <c:forEach items="${experts}" var="v" begin="0" end="2">
										<li><a title="${v.userRealname}"
											href="/ventureassess/newsDetail?news_uuid=${v.userUuid}">${v.userRealname} ${v.userEdu} ${v.userResearch}方向</a>
										</li>
			                          </c:forEach>
									</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-Planet"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>发布需求</h4>
                                <!-- <p><em>providing excellent services</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list">
										<li>
											<a title="风险投资的涵义" href="#"> <span class="tz_tit">风险投资的涵义</span></a>
										</li>
										<li>
											<a title="风险投资价值评估对象和因素" href="#"> <span class="tz_tit">风险投资价值评估对象和因素</span></a>
										</li>
										<li>
											<a title="风险投资的价值" href="#"> <span class="tz_tit">风险投资的价值</span></a>
										</li>
									</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="services-divider">
                        <div class="col-md-4 col-sm-4 col-xs-4"></div>
                        <div class="col-md-4 col-sm-4 col-xs-4"></div>
                        <div class="col-md-4 col-sm-4 col-xs-4"></div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-Folder"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>行业动态</h4>
                                <!-- <p><em>providing excellent services</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list listr">
										 <c:forEach items="${news2}" var="new2" begin="0" end="2">
										<li><a title="${new2.newsTitle}"
											href="/ventureassess/newsDetail?news_uuid=${new2.newsUuid}">${new2.newsTitle}</a>
										</li>
			                          </c:forEach>
									</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-Layers"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>政策法规</h4>
                                <!-- <p><em>best solutions that works</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list listr">
	                                	<c:forEach items="${news3}" var="new3" begin="0" end="2">
											<li><a title="${new3.newsTitle}"
												href="/ventureassess/newsDetail?news_uuid=${new3.newsUuid}">${new3.newsTitle}</a>
											</li>
			                          	</c:forEach>
		                          	</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-4">
                        <div class="service-item">
                            <div class="media-left">
                                <div class="wrap-service-icon">
                                    <div class="service-icon">
                                        <span class="icon icon-DesktopMonitor"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="media-body">
                                <h4>成果预览</h4>
                                <!-- <p><em>lorem ipsum dolor sit amet</em></p> -->
                                <p ><a href="/VentureAssessPlatform/expert"><img src="<%= basePath%>/static/adStyle/global/img/more.gif"></a></p>
                                <p>
                                	<ul class="tz_list listr">
			                            <c:forEach items="${pros}" var="pro" begin="0" end="2">
										<li><a title="${pro.pjName}"
											href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a>
										</li>
			                            </c:forEach>
									</ul>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>


        <!-- ========================== -->
        <!-- FOOTER -->
        <!-- ========================== -->
        <footer>
           
            <!-- ========================== -->
            <!-- FOOTER - SOCIAL -->
            <!-- ========================== -->
            <section class="social-section dark dark-strong">
                <div class="container dark-content">
                    <div class="tt">We are social 24/7 - Get in touch</div>
                    <ul class="list-socials">
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                        <li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
                    </ul>
                </div>
            </section>

           

            <section class="copyright-section">
                <p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">风险投资评估系统</a></p>
            </section>
        </footer>



        <!-- Scripts -->

        <!-- components -->
        <script src="<%= basePath%>/static/adStyle/add/js/jquery-1.11.3.min.js"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/owl-carousel/owl-carousel/owl.carousel.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/waypoints/lib/jquery.waypoints.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/slider-pro/dist/js/jquery.sliderPro.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/slick-carousel/slick/slick.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/wow/dist/wow.min.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/vendor/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/js/modernizr.js" type="text/javascript"></script>

        <!-- custom scripts -->
        <script src="<%= basePath%>/static/adStyle/add/js/contact.js" type="text/javascript"></script>
        <script src="<%= basePath%>/static/adStyle/add/js/custom.js" type="text/javascript"></script>
        <!--<script src="js/map.js" type="text/javascript"></script>-->
<!-- 增加 -->
		<script src="<%= basePath%>/static/adStyle/global/js/jquery.js"></script>
		<script src="<%= basePath%>/static/adStyle/global/js/jquery-1.11.1.js"></script>
		<script src="<%= basePath%>/static/adStyle/global/js/bootstrap.min.js"></script>
		<script src="<%= basePath%>/static/adStyle/global/js/jquery.mockjax.js"></script>
		<script src="<%= basePath%>/static/adStyle/global/js/jquery.validate.js"></script>
		<script type="text/javascript" src="<%= basePath%>/static/adStyle/global/js/login.js"></script>
		<script type="text/javascript" src="<%= basePath%>/static/adStyle/global/js/recordquery.js"></script>
    </body>
</html>

