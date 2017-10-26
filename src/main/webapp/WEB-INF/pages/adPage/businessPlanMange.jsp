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

            <!-- SIDEBAR QUICK-LAUNCH -->
            <!-- <div id="quicklaunch">
            <!-- /SIDEBAR QUICK-LAUNCH -->

            <!-- SIDEBAR MENU -->
            <ul>
                <li class="active">
                    <a href="index.html">
                        <i class="fa fa-tachometer fa-fw"></i> <span class="menu-text">主页</span>
                        <span class="selected"></span>
                    </a>

                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">用户管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="notifications.html"><span class="sub-menu-text">查看所有用户</span></a></li>
                        <li><a class="" href="sliders_progress.html"><span class="sub-menu-text">查看所有产品服务提供者</span></a>
                        </li>
                        <li><a class="" href="typography.html"><span class="sub-menu-text">查看所有基金经理</span></a></li>
                        <li><a class="" href="elements.html"><span class="sub-menu-text">增加产品服务提供者</span></a></li>
                        <li><a class="" href="buttons_icons.html"><span class="sub-menu-text">增加基金经理</span></a></li>
                        <!--<li><a class="" href="tabs_accordions.html"><span class="sub-menu-text">检索产品服务提供者信息</span></a></li>-->
                        <!--<li><a class="" href="treeview.html"><span class="sub-menu-text">检索基金经理信息</span></a></li>-->
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">检索用户信息</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">检索产品服务提供者信息</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">检索基金经理信息</span></a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">产品服务管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看所有产品服务</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评审通过的产品服务</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评审未通过的产品服务</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看待评估的产品服务</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评估截止的产品服务</span></a></li>
                            </ul>
                        </li>
                        <li><a class="" href="tabs_accordions.html"><span class="sub-menu-text">增加产品服务</span></a></li>
                        <li><a class="" href="treeview.html"><span class="sub-menu-text">检索产品服务</span></a></li>

                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">项目管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看所有项目</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评审通过的项目</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评审未通过的项目</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看待评估的项目</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看评估截止的项目</span></a></li>
                            </ul>
                        </li>
                        <li><a class="" href="tabs_accordions.html"><span class="sub-menu-text">增加项目</span></a></li>
                        <li><a class="" href="treeview.html"><span class="sub-menu-text">检索项目</span></a></li>

                    </ul>
                </li>
                <li><a class="" href="frontend_theme/index.html" target="_blank"><i class="fa fa-desktop fa-fw"></i>
                    <span class="menu-text">商业计划书管理</span></a></li>
                <li><a class="" href="frontend_theme/index.html" target="_blank"><i class="fa fa-desktop fa-fw"></i>
                    <span class="menu-text">产品服务-项目管理</span></a></li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">指标管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看所有指标</span>
                                <span class="arrow"></span>
                            </a>
                            <!-- <ul class="sub-sub">
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">产品服务指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">项目行业指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">投资收益指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">发展规划指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">团队合作指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">财务指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">风险指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">估值指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">收入模式指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">市场指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">营销模式指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">订单合约指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">公司组织架构指标</span></a></li>
                                 <li><a class="" href="#"><span class="sub-sub-menu-text">竞争对手指标</span></a></li>
                             </ul>-->
                        </li>
                        <li><a class="" href="tabs_accordions.html"><span class="sub-menu-text">增加指标</span></a></li>
                        <li><a class="" href="treeview.html"><span class="sub-menu-text">检索指标</span></a></li>

                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-table fa-fw"></i> <span class="menu-text">系统自动评估管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="dynamic_tables.html"><span class="sub-menu-text">查看所有成果评估</span></a>
                        </li>
                        <li><a class="" href="jqgrid_plugin.html"><span class="sub-menu-text">查看所有项目评估</span></a>
                        </li>
                        <li><a class="" href="simple_table.html"><span class="sub-menu-text">评估成果</span></a>
                        </li>
                        <li><a class="" href="simple_table.html"><span class="sub-menu-text">评估项目</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-table fa-fw"></i> <span class="menu-text">新闻管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="simple_table.html"><span class="sub-menu-text">查看所有新闻</span></a>
                        </li>
                        <li><a class="" href="dynamic_tables.html"><span class="sub-menu-text">增加新闻</span></a>
                        </li>
                        <li><a class="" href="jqgrid_plugin.html"><span class="sub-menu-text">检索新闻</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-table fa-fw"></i> <span class="menu-text">政策管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="simple_table.html"><span class="sub-menu-text">查看所有政策</span></a>
                        </li>
                        <li><a class="" href="dynamic_tables.html"><span class="sub-menu-text">增加政策</span></a>
                        </li>
                        <li><a class="" href="jqgrid_plugin.html"><span class="sub-menu-text">检索政策</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">上传文件管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看所有的上传文件</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看产品的上传相册</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看项目的上传文件</span></a></li>
                            </ul>
                        </li>
                        <li><a class="" href="forms.html"><span class="sub-menu-text">检索产品的上传相册</span></a></li>
                        <li><a class="" href="wizards_validations.html"><span class="sub-menu-text">检索项目的上传文件</span></a>
                        </li>
                        <!-- <li><a class="" href="rich_text_editors.html"><span
                                 class="sub-menu-text">Rich Text Editors</span></a></li>

                         <li><a class="" href="dropzone_file_upload.html"><span class="sub-menu-text">Dropzone File Upload</span></a>
                         </li>-->
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">权限管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看角色权限</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看产品服务提供者的所有权限</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看基金经理的所有权限</span></a></li>
                            </ul>
                        </li>
                        <li><a class="" href="forms.html"><span class="sub-menu-text">增加产品服务提供者的权限</span></a></li>
                        <li><a class="" href="wizards_validations.html"><span class="sub-menu-text">增加基金经理的权限</span></a>
                        </li>
                    </ul>
                </li>
                <li class="has-sub">
                    <a href="javascript:;" class="">
                        <i class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">日志管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li class="has-sub-sub">
                            <a href="javascript:;" class=""><span class="sub-menu-text">查看所有日志</span>
                                <span class="arrow"></span>
                            </a>
                            <ul class="sub-sub">
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看产品服务提供者的所有日志</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看基金经理的所有日志</span></a></li>
                                <li><a class="" href="#"><span class="sub-sub-menu-text">查看异常的日志信息</span></a></li>
                            </ul>
                        </li>
                        <li><a class="" href="forms.html"><span class="sub-menu-text">检索产品服务提供者的日志</span></a></li>
                        <li><a class="" href="wizards_validations.html"><span class="sub-menu-text">检索基金经理的日志</span></a>
                        </li>
                    </ul>
                </li>
                <li><a class="" href="inbox.html"><i class="fa fa-envelope-o fa-fw"></i> <span
                        class="menu-text">回收站</span></a></li>
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
                                        <a href="#">项目管理</a>
                                    </li>
                                    <li>查看项目</li>
                                </ul>
                                <!-- /BREADCRUMBS -->
                                <div class="clearfix">
                                    <h3 class="content-title pull-left">项目管理</h3>
                                </div>
                                <div class="description">查看项目</div>
                            </div>
                        </div>

                    </div>
                    <!-- /PAGE HEADER -->
                    <div id="filter-controls" class="btn-group">
                        <form class="form-inline">
                            <div class="form-group">
                                <label  for="projectName" >产业化项目名称：</label>
                                <input id="projectName" type="text" class="form-control"  placeholder="开始时间">

                            </div>
                            <button style="margin-top: 5%" class="btn btn-primary">搜索</button>
                        </form>
                        <hr>
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
                                style="width: 58.333px;"> <input type="checkbox"/>
                            </th>
                            <th class="sorting_asc" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-sort="ascending"
                                aria-label="Rendering engine: activate to sort column descending"
                                style="width: 258.333px;">项目名称
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Browser: activate to sort column ascending"
                                style="width: 161.333px;">包含的产品服务
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Browser: activate to sort column ascending"
                                style="width: 161.333px;">商业计划书
                            </th>
                            <th class="hidden-xs sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Platform(s): activate to sort column ascending"
                                style="width: 128.333px;">项目负责人
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Engine version: activate to sort column ascending"
                                style="width: 224.333px;">系统自动评估分数
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Engine version: activate to sort column ascending"
                                style="width: 124.333px;">是否有人投资
                            </th>
                            <th class="sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="Engine version: activate to sort column ascending"
                                style="width: 114.333px;">投资人
                            </th>
                            <th class="hidden-xs sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="CSS grade: activate to sort column ascending"
                                style="width: 168.333px;">投资金额
                            </th>
                            <th class="hidden-xs sorting" role="columnheader" tabindex="0"
                                aria-controls="datatable1" rowspan="1" colspan="1"
                                aria-label="CSS grade: activate to sort column ascending"
                                style="width: 168.333px;">操作
                            </th>
                        </tr>
                        </thead>

                        <tfoot>
                        <tr>
                            <th rowspan="1" colspan="1"><input type="checkbox"/></th>
                            <th rowspan="1" colspan="1">项目名称</th>
                            <th rowspan="1" colspan="1">包含的产品服务</th>
                            <th rowspan="1" colspan="1">商业计划书</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">项目负责人</th>
                            <!--<th rowspan="1" colspan="1">Engine version</th>-->
                            <th class="hidden-xs" rowspan="1" colspan="1">系统自动评估分数</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">是否有人投资</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">投资人</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">投资金额</th>
                            <th class="hidden-xs" rowspan="1" colspan="1">操作</th>
                        </tr>
                        </tfoot>
                        <tbody role="alert" aria-live="polite" aria-relevant="all">
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        <tr class="gradeA odd">
                            <td class=" sorting_1"><input type="checkbox"></td>
                            <td><a href="#">家庭健康监测系统</a> </td>
                            <td class="hidden-xs "><a href="#">点击查看</a></td>
                            <td class="center "><a href="#">点击查看</a> </td>
                            <td class="center hidden-xs "><a href="#">肖遥</a> </td>
                            <td class="center hidden-xs ">8.9</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">无</td>
                            <td class="center hidden-xs ">零</td>
                            <td class="center hidden-xs ">
                                <button class="btn btn-xs btn-info">删除</button>
                                <button class="btn btn-xs btn-info">编辑</button>
                                <button class="btn btn-xs btn-info">查看</button>

                            </td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="pull-left">
                                <div class="dataTables_info" id="datatable1_info">显示 1 to 10 总共
                                    57 条
                                </div>
                            </div>
                            <div class="pull-right">
                                <div class="dataTables_paginate paging_bs_full"
                                     id="datatable1_paginate">
                                    <ul class="pagination">
                                        <li class="disabled"><a tabindex="0"
                                                                class="paginate_button first"
                                                                id="datatable1_first">首页</a></li>
                                        <li class="disabled"><a tabindex="0"
                                                                class="paginate_button previous"
                                                                id="datatable1_previous">上一页</a>
                                        </li>
                                        <li class="active"><a tabindex="0">1</a></li>
                                        <li><a tabindex="0">2</a></li>
                                        <li><a tabindex="0">3</a></li>
                                        <li><a tabindex="0">4</a></li>
                                        <li><a tabindex="0">5</a></li>
                                        <li><a tabindex="0" class="paginate_button next"
                                               id="datatable1_next">下一页</a></li>
                                        <li><a tabindex="0" class="paginate_button last"
                                               id="datatable1_last">尾页</a></li>
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