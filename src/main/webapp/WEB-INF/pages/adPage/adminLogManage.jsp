<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Cloud Admin | Blank Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- STYLESHEETS --><!--[if lt IE 9]><script src="js/flot/excanvas.min.js"></script><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
    <link rel="stylesheet" type="text/css" href="css/cloud-admin.css" >
    <link rel="stylesheet" type="text/css"  href="css/themes/default.css" id="skin-switcher" >
    <link rel="stylesheet" type="text/css"  href="css/responsive.css" >

    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- DATE RANGE PICKER -->
    <link rel="stylesheet" type="text/css" href="js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
    <!-- FONTS -->
    <link href='http://fonts.useso.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
</head>
<body>
<!-- HEADER -->
<header class="navbar clearfix" id="header">
    <div class="container">
        <div class="navbar-brand">
            <!-- COMPANY LOGO -->
            <a style="text-decoration: none" href="index.html">
                <!--<img src="img/logo/logo.jpg" alt="Cloud Admin Logo" class="img-responsive" height="30" width="120">-->
                <h6 style="color: white;margin-left: 10%">科技产品服务产业化评价系统</h6>
            </a>
            <!-- /COMPANY LOGO -->
            <!-- TEAM STATUS FOR MOBILE -->
            <div class="visible-xs">
                <a href="#" class="team-status-toggle switcher btn dropdown-toggle">
                    <i class="fa fa-users"></i>
                </a>
            </div>
            <!-- /TEAM STATUS FOR MOBILE -->
            <!-- SIDEBAR COLLAPSE -->
            <!--<div id="sidebar-collapse" class="sidebar-collapse btn">
                <i class="fa fa-bars"
                    data-icon1="fa fa-bars"
                    data-icon2="fa fa-bars" ></i>
            </div>-->
            <!-- /SIDEBAR COLLAPSE -->
        </div>
        <!-- NAVBAR LEFT -->
        <ul class="nav navbar-nav pull-left hidden-xs" id="navbar-left">
            <li class="dropdown">
                <a href="#" class="team-status-toggle dropdown-toggle tip-bottom" data-toggle="tooltip"
                   title="Toggle Team View">
                    <i class="fa fa-users"></i>
                    <span class="name">Team Status</span>
                    <i class="fa fa-angle-down"></i>
                </a>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-cog"></i>
                    <span class="name">皮肤设置</span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu skins">
                    <li class="dropdown-title">
                        <span><i class="fa fa-leaf"></i> 主题皮肤</span>
                    </li>
                    <li><a href="#" data-skin="default">默认皮肤</a></li>
                    <li><a href="#" data-skin="night">夜间皮肤</a></li>
                    <li><a href="#" data-skin="earth">土色皮肤</a></li>
                    <li><a href="#" data-skin="utopia">理想皮肤</a></li>
                    <li><a href="#" data-skin="nature">自然皮肤</a></li>
                    <li><a href="#" data-skin="graphite">墨色皮肤</a></li>
                </ul>
            </li>
        </ul>
        <!-- /NAVBAR LEFT -->
        <!-- BEGIN TOP NAVIGATION MENU -->
        <ul class="nav navbar-nav pull-right">
            <!-- BEGIN NOTIFICATION DROPDOWN -->
            <li class="dropdown" id="header-notification">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-bell"></i>
                    <span class="badge">7</span>
                </a>
                <ul class="dropdown-menu notification">
                    <li class="dropdown-title">
                        <span><i class="fa fa-bell"></i> 7 Notifications</span>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-success"><i class="fa fa-user"></i></span>
									<span class="body">
										<span class="message">5 users online. </span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>Just now</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-primary"><i class="fa fa-comment"></i></span>
									<span class="body">
										<span class="message">Martin commented.</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>19 mins</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-warning"><i class="fa fa-lock"></i></span>
									<span class="body">
										<span class="message">DW1 server locked.</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>32 mins</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-info"><i class="fa fa-twitter"></i></span>
									<span class="body">
										<span class="message">Twitter connected.</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>55 mins</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-danger"><i class="fa fa-heart"></i></span>
									<span class="body">
										<span class="message">Jane liked. </span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>2 hrs</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="label label-warning"><i class="fa fa-exclamation-triangle"></i></span>
									<span class="body">
										<span class="message">Database overload.</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>6 hrs</span>
										</span>
									</span>
                        </a>
                    </li>
                    <li class="footer">
                        <a href="#">See all notifications <i class="fa fa-arrow-circle-right"></i></a>
                    </li>
                </ul>
            </li>
            <!-- END NOTIFICATION DROPDOWN -->
            <!-- BEGIN INBOX DROPDOWN -->
            <li class="dropdown" id="header-message">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-envelope"></i>
                    <span class="badge">3</span>
                </a>
                <ul class="dropdown-menu inbox">
                    <li class="dropdown-title">
                        <span><i class="fa fa-envelope-o"></i> 3 Messages</span>
                        <span class="compose pull-right tip-right" title="Compose message"><i
                                class="fa fa-pencil-square-o"></i></span>
                    </li>
                    <li>
                        <a href="#">
                            <img src="img/avatars/avatar2.jpg" alt=""/>
									<span class="body">
										<span class="from">Jane Doe</span>
										<span class="message">
										Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse mole ...
										</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>Just Now</span>
										</span>
									</span>

                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="img/avatars/avatar1.jpg" alt=""/>
									<span class="body">
										<span class="from">Vince Pelt</span>
										<span class="message">
										Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse mole ...
										</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>15 min ago</span>
										</span>
									</span>

                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img src="img/avatars/avatar8.jpg" alt=""/>
									<span class="body">
										<span class="from">Debby Doe</span>
										<span class="message">
										Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse mole ...
										</span>
										<span class="time">
											<i class="fa fa-clock-o"></i>
											<span>2 hours ago</span>
										</span>
									</span>

                        </a>
                    </li>
                    <li class="footer">
                        <a href="#">See all messages <i class="fa fa-arrow-circle-right"></i></a>
                    </li>
                </ul>
            </li>
            <!-- END INBOX DROPDOWN -->
            <!-- BEGIN TODO DROPDOWN -->
            <li class="dropdown" id="header-tasks">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-tasks"></i>
                    <span class="badge">3</span>
                </a>
                <ul class="dropdown-menu tasks">
                    <li class="dropdown-title">
                        <span><i class="fa fa-check"></i> 6 tasks in progress</span>
                    </li>
                    <li>
                        <a href="#">
									<span class="header clearfix">
										<span class="pull-left">Software Update</span>
										<span class="pull-right">60%</span>
									</span>
                            <div class="progress">
                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60"
                                     aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                    <span class="sr-only">60% Complete</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
									<span class="header clearfix">
										<span class="pull-left">Software Update</span>
										<span class="pull-right">25%</span>
									</span>
                            <div class="progress">
                                <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="25"
                                     aria-valuemin="0" aria-valuemax="100" style="width: 25%;">
                                    <span class="sr-only">25% Complete</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
									<span class="header clearfix">
										<span class="pull-left">Software Update</span>
										<span class="pull-right">40%</span>
									</span>
                            <div class="progress progress-striped">
                                <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="40"
                                     aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
                                    <span class="sr-only">40% Complete</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
									<span class="header clearfix">
										<span class="pull-left">Software Update</span>
										<span class="pull-right">70%</span>
									</span>
                            <div class="progress progress-striped active">
                                <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70"
                                     aria-valuemin="0" aria-valuemax="100" style="width: 70%;">
                                    <span class="sr-only">70% Complete</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="#">
									<span class="header clearfix">
										<span class="pull-left">Software Update</span>
										<span class="pull-right">65%</span>
									</span>
                            <div class="progress">
                                <div class="progress-bar progress-bar-success" style="width: 35%">
                                    <span class="sr-only">35% Complete (success)</span>
                                </div>
                                <div class="progress-bar progress-bar-warning" style="width: 20%">
                                    <span class="sr-only">20% Complete (warning)</span>
                                </div>
                                <div class="progress-bar progress-bar-danger" style="width: 10%">
                                    <span class="sr-only">10% Complete (danger)</span>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="footer">
                        <a href="#">See all tasks <i class="fa fa-arrow-circle-right"></i></a>
                    </li>
                </ul>
            </li>
            <!-- END TODO DROPDOWN -->
            <!-- BEGIN USER LOGIN DROPDOWN -->
            <li class="dropdown user" id="header-user">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <img alt="" src="img/avatars/avatar3.jpg"/>
                    <span class="username">Admin</span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu">
                    <li><a title="个人主页" href="#"><i class="fa fa-user"></i> 个人主页</a></li>
                    <li><a  title="账号设置" href="#"><i class="fa fa-cog"></i> 账号设置</a></li>
                    <li><a  title="退出系统" href="login.html"><i class="fa fa-power-off"></i> 退出系统</a></li>
                </ul>
            </li>
            <!-- END USER LOGIN DROPDOWN -->
        </ul>
        <!-- END TOP NAVIGATION MENU -->
    </div>
    <!-- TEAM STATUS -->
    <div class="container team-status" id="team-status">
        <div id="scrollbar">
            <div class="handle">
            </div>
        </div>
        <div id="teamslider">
            <ul class="team-list">
                <li class="current">
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar3.jpg" alt=""/>
				  </span>
				  <span class="title">
					You
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 35%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">6</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar1.jpg" alt=""/>
				  </span>
				  <span class="title">
					Max Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 15%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 40%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 20%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">2</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">8</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">4</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar2.jpg" alt=""/>
				  </span>
				  <span class="title">
					Jane Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 65%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 10%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 15%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">10</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">4</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar4.jpg" alt=""/>
				  </span>
				  <span class="title">
					Ellie Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 5%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 48%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 27%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">1</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">6</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">2</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar5.jpg" alt=""/>
				  </span>
				  <span class="title">
					Lisa Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 21%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 40%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">4</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">5</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">9</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar6.jpg" alt=""/>
				  </span>
				  <span class="title">
					Kelly Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 45%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 21%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">6</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">3</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar7.jpg" alt=""/>
				  </span>
				  <span class="title">
					Jessy Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 7%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 30%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 10%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">1</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">6</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">2</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);">
				  <span class="image">
					  <img src="img/avatars/avatar8.jpg" alt=""/>
				  </span>
				  <span class="title">
					Debby Doe
				  </span>
                        <div class="progress">
                            <div class="progress-bar progress-bar-success" style="width: 70%">
                                <span class="sr-only">35% Complete (success)</span>
                            </div>
                            <div class="progress-bar progress-bar-warning" style="width: 20%">
                                <span class="sr-only">20% Complete (warning)</span>
                            </div>
                            <div class="progress-bar progress-bar-danger" style="width: 5%">
                                <span class="sr-only">10% Complete (danger)</span>
                            </div>
                        </div>
					<span class="status">
						<div class="field">
							<span class="badge badge-green">13</span> completed
							<span class="pull-right fa fa-check"></span>
						</div>
						<div class="field">
							<span class="badge badge-orange">7</span> in-progress
							<span class="pull-right fa fa-adjust"></span>
						</div>
						<div class="field">
							<span class="badge badge-red">1</span> pending
							<span class="pull-right fa fa-list-ul"></span>
						</div>
				    </span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <!-- /TEAM STATUS -->
</header>
<!--/HEADER -->

<!-- PAGE -->
<section id="page">
    <!-- SIDEBAR -->
    <div id="sidebar" class="sidebar">
        <div class="sidebar-menu nav-collapse">
            <div class="divide-20"></div>
            <!-- SEARCH BAR -->
            <div id="search-bar">
                <input class="search" type="text" placeholder="Search"><i class="fa fa-search search-icon"></i>
            </div>
            <!-- /SEARCH BAR -->

            <!-- SIDEBAR MENU -->
            <ul>
                <li>
                    <a href="index.html">
                        <i class="fa fa-tachometer fa-fw"></i> <span class="menu-text">主页</span>
                    </a>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">销售人员管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="elements.html"><span class="sub-menu-text"></span></a></li>
                        <li><a class="" href="notifications.html"><span
                                class="sub-menu-text">Hubspot Notifications</span></a></li>
                        <li><a class="" href="buttons_icons.html"><span class="sub-menu-text">Buttons & Icons</span></a>
                        </li>
                        <li><a class="" href="sliders_progress.html"><span
                                class="sub-menu-text">Sliders & Progress</span></a></li>
                        <li><a class="" href="typography.html"><span class="sub-menu-text">Typography</span></a></li>
                        <li><a class="" href="tabs_accordions.html"><span class="sub-menu-text">Tabs & Accordions</span></a>
                        </li>
                        <li><a class="" href="treeview.html"><span class="sub-menu-text">Treeview</span></a></li>
                        <li><a class="" href="nestable_lists.html"><span class="sub-menu-text">Nestable Lists</span></a>
                        </li>
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">Third Level Menu</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">Item 1</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">Item 2</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a class="" href="frontend_theme/index.html" target="_blank"><i class="fa fa-desktop fa-fw"></i>
                    <span class="menu-text">客户管理</span></a></li>
                <li><a class="" href="inbox.html"><i class="fa fa-envelope-o fa-fw"></i> <span
                        class="menu-text">公司员工管理</span></a></li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-table fa-fw"></i> <span class="menu-text">楼盘管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="simple_table.html"><span class="sub-menu-text">Simple Tables</span></a>
                        </li>
                        <li><a class="" href="dynamic_tables.html"><span class="sub-menu-text">Dynamic Tables</span></a>
                        </li>
                        <li><a class="" href="jqgrid_plugin.html"><span class="sub-menu-text">jqGrid Plugin</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">楼幢管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="forms.html"><span class="sub-menu-text">Forms</span></a></li>
                        <li><a class="" href="wizards_validations.html"><span class="sub-menu-text">Wizards & Validations</span></a>
                        </li>
                        <li><a class="" href="rich_text_editors.html"><span
                                class="sub-menu-text">Rich Text Editors</span></a></li>

                        <li><a class="" href="dropzone_file_upload.html"><span class="sub-menu-text">Dropzone File Upload</span></a>
                        </li>
                    </ul>
                </li>
                <li><a class="" href="widgets_box.html"><i class="fa fa-th-large fa-fw"></i> <span class="menu-text">房屋管理</span></a>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bar-chart-o fa-fw"></i> <span class="menu-text">单元管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="flot_charts.html"><span class="sub-menu-text">Flot Charts</span></a></li>
                        <li><a class="" href="xcharts.html"><span class="sub-menu-text">xCharts</span></a></li>

                        <li><a class="" href="others.html"><span class="sub-menu-text">Others</span></a></li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-columns fa-fw"></i> <span class="menu-text">户型管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="mini_sidebar.html"><span class="sub-menu-text">Mini Sidebar</span></a>
                        </li>
                        <li><a class="" href="fixed_header.html"><span class="sub-menu-text">Fixed Header</span></a>
                        </li>

                        <li><a class="" href="fixed_header_sidebar.html"><span class="sub-menu-text">Fixed Header & Sidebar</span></a>
                        </li>
                    </ul>
                </li>
                <li><a class="" href="gallery.html"><i class="fa fa-picture-o fa-fw"></i> <span class="menu-text">最适房源统计信息管理</span></a>
                <li><a class="" href="calendar.html"><i class="fa fa-calendar fa-fw"></i>
								<span class="menu-text">权限管理
									<span class="tooltip-error pull-right" title="" data-original-title="3 New Events">
										<span class="label label-success">New</span>
									</span>
								</span>
                </a>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-map-marker fa-fw"></i> <span class="menu-text">日志管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="google_maps.html"><span class="sub-menu-text">Google Maps</span></a></li>
                        <li><a class="" href="vector_maps.html"><span class="sub-menu-text">Vector Maps</span></a></li>
                    </ul>
                </li>

                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-file-text fa-fw"></i> <span class="menu-text">财务管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="login.html"><span
                                class="sub-menu-text">Login & Register Option 1</span></a></li>
                        <li><a class="" href="adminLogin.html"><span
                                class="sub-menu-text">Login & Register Option 2</span></a></li>
                        <li><a class="" href="user_profile.html"><span class="sub-menu-text">User profile</span></a>
                        </li>

                        <li><a class="" href="chats.html"><span class="sub-menu-text">Chats</span></a></li>
                        <li><a class="" href="todo_timeline.html"><span class="sub-menu-text">Todo & Timeline</span></a>
                        </li>
                        <li><a class="" href="address_book.html"><span class="sub-menu-text">Address Book</span></a>
                        </li>

                        <li><a class="" href="pricing.html"><span class="sub-menu-text">Pricing</span></a></li>
                        <li><a class="" href="invoice.html"><span class="sub-menu-text">Invoice</span></a></li>
                        <li><a class="" href="orders.html"><span class="sub-menu-text">Orders</span></a></li>
                    </ul>
                </li>
                <li class="has-sub active">
                    <a href="javascript:;" class="">
                        <i class="fa fa-briefcase fa-fw"></i> <span class="menu-text">企业信息管理 <span
                            class="badge pull-right">9</span></span>
                        <span class="arrow open"></span>
                        <span class="selected"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="search_results.html"><span class="sub-menu-text">Search Results</span></a>
                        </li>
                        <li><a class="" href="email_templates.html"><span
                                class="sub-menu-text">Email Templates</span></a></li>

                        <li><a class="" href="error_404.html"><span class="sub-menu-text">Error 404 Option 1</span></a>
                        </li>
                        <li><a class="" href="error_404_2.html"><span
                                class="sub-menu-text">Error 404 Option 2</span></a></li>
                        <li><a class="" href="error_404_3.html"><span
                                class="sub-menu-text">Error 404 Option 3</span></a></li>
                        <li><a class="" href="error_500.html"><span class="sub-menu-text">Error 500 Option 1</span></a>
                        </li>
                        <li><a class="" href="error_500_2.html"><span
                                class="sub-menu-text">Error 500 Option 2</span></a></li>
                        <li><a class="" href="faq.html"><span class="sub-menu-text">FAQ</span></a></li>
                        <li class="current"><a class="" href="blank_page.html"><span
                                class="sub-menu-text">Blank Page</span></a></li>
                    </ul>
                </li>
            </ul>
            <!-- /SIDEBAR MENU -->
        </div>
    </div>
    <!-- /SIDEBAR -->
    <div id="main-content">
        <div class="container">
            <div class="row">
                <div id="content" class="col-lg-12">
                    <!-- PAGE HEADER-->
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="page-header">
                                <!-- STYLER -->

                                <!-- /STYLER -->
                                <!-- BREADCRUMBS -->
                                <ul class="breadcrumb">
                                    <li>
                                        <i class="fa fa-home"></i>
                                        <a href="index.html">Home</a>
                                    </li>
                                    <li>
                                        <a href="#">日志管理</a>
                                    </li>
                                    <li>查看日志信息</li>
                                </ul>
                                <!-- /BREADCRUMBS -->
                                <div class="clearfix">
                                    <h3 class="content-title pull-left">日志管理</h3>
                                </div>
                                <div class="description">查看日志信息</div>
                            </div>
                        </div>
                    </div>
                    <!-- /PAGE HEADER -->

                    <div id="filter-controls" class="btn-group">
                        <form class="form-inline">
                            <div class="form-group">
                                <label for="exampleInputName2">时间从：</label>
                                <input type="text" class="form-control" id="exampleInputName2" placeholder="开始时间">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail2">到：</label>
                                <input type="email" class="form-control" id="exampleInputEmail2" placeholder="结束时间">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail22">操作模块：</label><br>
                                <select class="form-control" id="exampleInputEmail22">
                                    <option>模块一</option>
                                    <option>模块二</option>
                                    <option>模块三</option>
                                </select>
                            </div>

                            <br>
                            <br>
                            <div class="form-group">
                                <label>角色:</label>&nbsp;&nbsp;&nbsp;
                                <label class="radio-inline">
                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked="checked"> 不限
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 成果提供者
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 项目投资人
                                </label>
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="exampleInputEmail2">具体用户：</label>
                                <input type="datetime" class="form-control" id="exampleInputEmail6" placeholder="用户名称">
                            </div>
                            <button style="margin-left: 40%;" class="btn btn-primary">搜索</button>
                        </form>
                        <hr>
                        <br>
                        <div>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <label>全选</label>  <input type="checkbox">
                            <label>全不选</label>  <input type="checkbox">
                            <button class="btn btn-primary">批量删除</button>
                        </div>
                    </div>

                    <table id="datatable1" cellpadding="0" cellspacing="0" border="0"
                           class="datatable table table-striped table-bordered table-hover dataTable"
                           aria-describedby="datatable1_info">
                        <thead>
                        <tr role="row">
                            <th class="sorting_asc" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-sort="ascending"
                                aria-label="Rendering engine: activate to sort column descending"
                                style="width: 80px;">选择
                            </th>
                            <th class="sorting_asc" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-sort="ascending"
                                aria-label="Rendering engine: activate to sort column descending"
                                style="width: 258.333px;">操作者
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Browser: activate to sort column ascending"
                                style="width: 361.333px;">操作时间
                            </th>
                            <th class="hidden-xs sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Platform(s): activate to sort column ascending"
                                style="width: 328.333px;">操作动作
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Engine version: activate to sort column ascending"
                                style="width: 224.333px;">IP地址
                            </th>
                            <th class="hidden-xs sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="CSS grade: activate to sort column ascending"
                                style="width: 168.333px;">删除
                            </th>
                        </tr>
                        </thead>

                        <tfoot>
                        <tr>
                            <th rowspan="1" colspan="1">选择</th>
                            <th rowspan="1" colspan="1">操作者</th>
                            <th rowspan="1" colspan="1">操作时间</th>

                            <th rowspan="1" colspan="1">操作动作</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">IP地址</th>
                            <!--<th rowspan="1" colspan="1">Engine version</th>-->
                            <th class="hidden-xs" rowspan="1" colspan="1">删除</th>
                        </tr>
                        </tfoot>
                        <tbody role="alert" aria-live="polite" aria-relevant="all">
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"> <input type="checkbox"></td>
                            <td class=" sorting_1"> Calar</td>
                            <td class=" ">2017-03-23 10:56:19</td>
                            <td class="hidden-xs ">登录系统</td>
                            <td class="center ">127.0.0.1</td>
                            <td class="center hidden-xs "><button class="btn btn-xs btn-primary">删除</button></td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="pull-left">
                                <div class="dataTables_info" id="datatable1_info">Showing 1 to 10 of
                                    57 entries
                                </div>
                            </div>
                            <div class="pull-right">
                                <div class="dataTables_paginate paging_bs_full"
                                     id="datatable1_paginate">
                                    <ul class="pagination">
                                        <li class="disabled"><a tabindex="0"
                                                                class="paginate_button first"
                                                                id="datatable1_first">First</a></li>
                                        <li class="disabled"><a tabindex="0"
                                                                class="paginate_button previous"
                                                                id="datatable1_previous">Previous</a>
                                        </li>
                                        <li class="active"><a tabindex="0">1</a></li>
                                        <li><a tabindex="0">2</a></li>
                                        <li><a tabindex="0">3</a></li>
                                        <li><a tabindex="0">4</a></li>
                                        <li><a tabindex="0">5</a></li>
                                        <li><a tabindex="0" class="paginate_button next"
                                               id="datatable1_next">Next</a></li>
                                        <li><a tabindex="0" class="paginate_button last"
                                               id="datatable1_last">Last</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <section id="footer" class="color-light pattern">
        <div class="container">
            <div id="column-footer" class="row-fluid">
                <div class="col-sm-4">
                    <h3>Learn More</h3>
                    <ul>
                        <li><a href="#">How it works</a></li>
                        <li><a href="#">Safety measures</a></li>
                        <li><a href="#">Testimonials</a></li>
                        <li><a href="#">The Blog</a></li>
                    </ul>
                </div>
                <div class="col-sm-4">
                    <h3>Help &amp; Support</h3>
                    <ul>
                        <li><a href="#">Frequently Asked Questions</a></li>
                        <li><a href="#">Creative Requirements</a></li>
                        <li><a href="#">Glossary of Terms</a></li>
                        <li><a href="#">The Safety</a></li>
                    </ul>
                </div>
                <div class="col-sm-4">
                    <h3>About Us</h3>
                    <ul>
                        <li><a href="#">Press</a></li>
                        <li><a href="#">Our Team</a></li>
                        <li><a href="#">Careers</a></li>
                        <li><a href="#">Our Partners</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
</section>
<!--/PAGE -->
<!-- JAVASCRIPTS -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- JQUERY -->
<script src="js/jquery/jquery-2.0.3.min.js"></script>
<!-- JQUERY UI-->
<script src="js/jquery-ui-1.10.3.custom/js/jquery-ui-1.10.3.custom.min.js"></script>
<!-- BOOTSTRAP -->
<script src="bootstrap-dist/js/bootstrap.min.js"></script>


<!-- DATE RANGE PICKER -->
<script src="js/bootstrap-daterangepicker/moment.min.js"></script>

<script src="js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
<!-- SLIMSCROLL -->
<script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script><script type="text/javascript" src="js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
<!-- COOKIE -->
<script type="text/javascript" src="js/jQuery-Cookie/jquery.cookie.min.js"></script>
<!-- CUSTOM SCRIPT -->
<script src="js/script.js"></script>
<script>
    jQuery(document).ready(function() {
        App.setPage("widgets_box");  //Set current page
        App.init(); //Initialise plugins and elements
    });
</script>
<!-- /JAVASCRIPTS -->
</body>
</html>