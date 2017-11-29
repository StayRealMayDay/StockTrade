<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=basePath%>/static/adStyle/css/index.css" type="text/css" rel="stylesheet">
<title>管理员管理</title>
</head>
<body>
	<!-- sidebar start -->
	<div id="sidebar" class="sidebar">
		<div class="sidebar-menu nav-collapse">
			<div class="divide-20"></div>
			<!-- SEARCH BAR -->
			<div id="search-bar">
				<input class="search" type="text" placeholder="Search"><i
					class="fa fa-search search-icon"></i>
			</div>
			<!-- /SEARCH BAR -->

			<!-- SIDEBAR QUICK-LAUNCH -->
			<!-- <div id="quicklaunch">
            <!-- /SIDEBAR QUICK-LAUNCH -->

			<!-- SIDEBAR MENU -->
			<ul>
				<li class="active"><a href="adminLogin"> <i
						class="fa fa-tachometer fa-fw"></i> <span class="menu-text">主页</span>
						<span class="selected"></span>
				</a></li>
				
				<li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">权限管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a href="javascript:;" class=""><span
								class="sub-menu-text">查看所有角色列表</span> 
						</a>
						</li>
						<li class="has-sub-sub"><a href="javascript:;" class=""><span
								class="sub-menu-text">查看所有权限列表</span> 
						</a>
						</li>
						<li><a class="has-sub-sub" href="allUsers?pageNum=1"><span
								class="sub-menu-text">查看所有用户</span></a></li>	
						<li class="has-sub-sub"><a href="adminAddUser" class=""><span
								class="sub-menu-text">增加用户</span> </a></li>									
					</ul></li>
				
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">用户管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li><a class="" href="allUsers?pageNum=1"><span
								class="sub-menu-text">查看所有用户</span></a></li>
						<li class="has-sub-sub"><a href="adminAddUser" class=""><span
								class="sub-menu-text">增加用户</span> </a></li>
					</ul></li> -->
				<li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-file-text-o"></i> <span class="menu-text">新闻信息管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li><a class="" href="<%=basePath%>/adminNewsNum">
								<span class="sub-menu-text">新闻总量统计</span>
						</a></li>
						<li><a class="" href="<%=basePath%>/todayNewsCompany"> <span
								class="sub-menu-text">今日新闻相关公司</span>
						</a></li>
						<li><a class="" href="<%=basePath%>/todayNewsSource"> <span
								class="sub-menu-text">今日新闻来源统计</span>
						</a></li>
						<li><a class="" href="<%=basePath%>/todayNewsIndustry"> <span
								class="sub-menu-text">今日新闻行业分布</span>
						</a></li>
						<li><a class="" href="<%=basePath%>/newsIndustry_Source"> <span
								class="sub-menu-text">近期新闻行业与来源一览</span>
						</a></li>
					</ul></li>
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">产品服务管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a
							href="adminSelectAllProject?pageNum=1" class=""><span
								class="sub-menu-text">查看所有产品服务</span> 
						</a></li>
						<li><a class="" href="adminAccessPro"><span
								class="sub-menu-text">增加产品服务</span></a></li>
						<li><a class="" href="treeview.html"><span
								class="sub-menu-text">检索产品服务</span></a></li>

					</ul></li> -->
				<li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-bookmark-o fa-fw"></i> <span class="menu-text">股票信息管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub">
						<a href="<%=basePath%>/stockSection" class=""><span
								class="sub-menu-text">股票各板块指数统计</span> 
						</a>
						</li>
						
				<div class="dd-inner">
					<div class="font-item">
						<div class="item fore1">
							<h3><a href="">行业板块</a></h3>
							<i>></i>
						</div>
						<div class="font-item1">
						
							<div class="font-lefty">
								<dl class="fore1">
									<dd>
										<a href="">A 农林牧渔</a><a href="">B 采矿业</a><a href="">C0 食品材料</a><a href="">C1 纺织服装</a>
										<a href="">C2 木材家具</a><a href="">C3 造纸印刷</a><a href="">
										<a href="">C4 石化塑胶</a><a href="">C5 电子</a>
										<a href="">C6 金属非金属</a><a href="">C7 机械设备</a>
										<a href="">C8 医药生物</a><a href="">C9 其他制造业</a>
										<a href="">D 水电煤气</a><a href="">E 建筑业</a>
										<a href="">F 运输仓储</a><a href="">G 信息技术</a>
										<a href="">H 批发零售</a><a href="">I 金融保险</a>
										<a href="">J 房地产业</a><a href="">K 社会服务</a>
										<a href="">L 传播文化</a><a href="">M 综合类</a>
										<a href="">其他板块</a><a href="">概念板块</a>
										<a href="">能源</a><a href="">M 综合类</a>
									</dd>
								
							</div>
						</div>
					</div>
					<div class="font-item">
						<div class="item fore1">
							<h3><a href="#">概念板块</a></h3>
							<i>></i>
						</div>
						<div class="font-item1">
							<div class="font-lefty">
								<dl class="fore1">
									<dd>
									
										<%-- <c:forEach items="${stockTypesList2}" var="v" varStatus="sta">
											<a href="">${v.typeName}</a>
										</c:forEach> --%>
										<a href="<%=basePath%>/stockConceptionSection?conception=4G">4G</a><a href="<%=basePath%>/stockConceptionSection?conception=MSCI">MSCI</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=O2O">O2O</a><a href="<%=basePath%>/stockConceptionSection?conception=OLED">OLED</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=PPP">PPP</a><a href="<%=basePath%>/stockConceptionSection?conception=ST板块">ST板块</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=一带一路">一带一路</a><a href="<%=basePath%>/stockConceptionSection?conception=举牌">举牌</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=万达私有化">万达私有化</a><a href="<%=basePath%>/stockConceptionSection?conception=上海国资改革">上海国资改革</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=上海自贸区">上海自贸区</a><a href="<%=basePath%>/stockConceptionSection?conception=东盟自贸区">东盟自贸区</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=中字头股票">中字头股票</a><a href="<%=basePath%>/stockConceptionSection?conception=二胎概念">二胎概念</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=云计算">云计算</a><a href="<%=basePath%>/stockConceptionSection?conception=互联网">互联网</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=京津冀一体化">京津冀一体化</a><a href="<%=basePath%>/stockConceptionSection?conception=人工智能">人工智能</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=体育产业">体育产业</a><a href="<%=basePath%>/stockConceptionSection?conception=供应链金融">供应链金融</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=债转股">债转股</a><a href="<%=basePath%>/stockConceptionSection?conception=健康中国">健康中国</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=充电桩">充电桩</a><a href="<%=basePath%>/stockConceptionSection?conception=广覆概念">广覆概念</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=共享单车">共享单车</a><a href="<%=basePath%>/stockConceptionSection?conception=养老概念">养老概念</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=军工">军工</a><a href="<%=basePath%>/stockConceptionSection?conception=军民融合">军民融合</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=农业现代化">农业现代化</a><a href="<%=basePath%>/stockConceptionSection?conception=区块链">区块链</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=医疗器械">医疗器械</a><a href="<%=basePath%>/stockConceptionSection?conception=医疗电商">医疗电商</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=卫星导航">卫星导航</a><a href="<%=basePath%>/stockConceptionSection?conception=参股保险">参股保险</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=参股券商">参股券商</a><a href="<%=basePath%>/stockConceptionSection?conception=参股新三板">参股新三板</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=参股民营银行">参股民营银行</a><a href="<%=basePath%>/stockConceptionSection?conception=固废处理">固废处理</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=在线教育">在线教育</a><a href="<%=basePath%>/stockConceptionSection?conception=基因测序">基因测序</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=大数据">大数据</a><a href="<%=basePath%>/stockConceptionSection?conception=天然气">天然气</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=安防">安防</a><a href="<%=basePath%>/stockConceptionSection?conception=家用电器">家用电器</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=小金属">小金属</a><a href="<%=basePath%>/stockConceptionSection?conception=工业4.0">工业4.0</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=微信小程序">微信小程序</a><a href="<%=basePath%>/stockConceptionSection?conception=手机游戏">手机游戏</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=振兴东北">振兴东北</a><a href="<%=basePath%>/stockConceptionSection?conception=摘帽">摘帽</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=文化传媒">文化传媒</a><a href="<%=basePath%>/stockConceptionSection?conception=新材料概念">新材料概念</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=新股与次新股">新股与次新股</a><a href="<%=basePath%>/stockConceptionSection?conception=新能源">新能源</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=无人机">无人机</a><a href="<%=basePath%>/stockConceptionSection?conception=无人驾驶">无人驾驶</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=智慧城市">智慧城市</a><a href="<%=basePath%>/stockConceptionSection?conception=智能医疗">智能医疗</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=智能家居">智能家居</a><a href="<%=basePath%>/stockConceptionSection?conception=智能电网">智能电网</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=智能穿戴">智能穿戴</a><a href="<%=basePath%>/stockConceptionSection?conception=无人驾驶">无人驾驶</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=期货概念">期货概念</a><a href="<%=basePath%>/stockConceptionSection?conception=智能医疗">智能医疗</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=央企国资改革">央企国资改革</a>
										<a href="<%=basePath%>/stockConceptionSection?conception=智能家居">智能家居</a><a href="<%=basePath%>/stockConceptionSection?conception=智能电网">智能电网</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
					<div class="font-item">
						<div class="item fore1">
							<h3><a href="">地域板块</a></h3>
							<i>></i>
						</div>
						<div class="font-item1">
							<div class="font-lefty">
								<dl class="fore1">
									<dd>
										<%-- <c:forEach items="${stockTypesList3}" var="v" varStatus="sta">
											<a href="">${v.typeName}</a>
										</c:forEach> --%>
										<a href="<%=basePath%>/stockAreaSection?area=上海市">上海市</a><a href="<%=basePath%>/stockAreaSection?area=云南省">云南省</a>
										<a href="<%=basePath%>/stockAreaSection?area=内蒙古自治区">内蒙古自治区</a><a href="<%=basePath%>/stockAreaSection?area=北京市">北京市</a>
										<a href="<%=basePath%>/stockAreaSection?area=吉林省">吉林省</a><a href="<%=basePath%>/stockAreaSection?area=四川省">四川省</a>
										<a href="<%=basePath%>/stockAreaSection?area=天津市">天津市</a><a href="<%=basePath%>/stockAreaSection?area=宁夏回族自治区">宁夏回族自治区</a>
										<a href="<%=basePath%>/stockAreaSection?area=安徽省">安徽省</a><a href="<%=basePath%>/stockAreaSection?area=山东省">山东省</a><a href="<%=basePath%>/stockAreaSection?area=山西省">山西省</a>
										<a href="<%=basePath%>/stockAreaSection?area=广东省">广东省</a><a href="<%=basePath%>/stockAreaSection?area=广西壮族自治区">广西壮族自治区</a><a href="<%=basePath%>/stockAreaSection?area=新疆维吾尔自治区">新疆维吾尔自治区</a>
										<a href="<%=basePath%>/stockAreaSection?area=江苏省">江苏省</a><a href="<%=basePath%>/stockAreaSection?area=江西省">江西省</a><a href="<%=basePath%>/stockAreaSection?area=河北省">河北省</a>
										<a href="<%=basePath%>/stockAreaSection?area=浙江省">浙江省</a><a href="<%=basePath%>/stockAreaSection?area=海南省">海南省</a><a href="<%=basePath%>/stockAreaSection?area=湖北省">湖北省</a>
										<a href="<%=basePath%>/stockAreaSection?area=湖南省">湖南省</a><a href="<%=basePath%>/stockAreaSection?area=甘肃省">甘肃省</a><a href="<%=basePath%>/stockAreaSection?area=福建省">福建省</a>
										<a href="<%=basePath%>/stockAreaSection?area=贵州省">贵州省</a><a href="<%=basePath%>/stockAreaSection?area=辽宁省">辽宁省</a><a href="<%=basePath%>/stockAreaSection?area=重庆省">重庆省</a>
										<a href="<%=basePath%>/stockAreaSection?area=青海省">青海省</a><a href="<%=basePath%>/stockAreaSection?area=黑龙江省">黑龙江省</a>
										<a href="<%=basePath%>/stockAreaSection?area=河南省">河南省</a><a href="<%=basePath%>/stockAreaSection?area=西藏自治区">西藏自治区</a>
										<a href="<%=basePath%>/stockAreaSection?area=陕西省">陕西省</a>
									</dd>
								</dl>
							</div>
						</div>
					</div>
			</div>
						
						
						<li class="has-sub-sub">
						<a href="<%=basePath%>/stockCount" class=""><span
								class="sub-menu-text">股票数量统计</span> 
						</a>
						</li>
						<li><a class="" href="stockUpDown"><span
								class="sub-menu-text">股票涨跌统计</span></a></li>
						<li><a class="" href="adminListedCompany?pageNum=1"><span
								class="sub-menu-text">新增上市公司</span></a></li>

					</ul></li>
				<li class="has-sub"><a href="#"
					class=""> <i class="fa fa-bookmark-o fa-fw"></i> <span
						class="menu-text">指标管理</span> <span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a
							href="adminSelectAllIndicator?pageNum=1" class=""><span
								class="sub-menu-text">动态配置所有指标</span> 
						</a></li>
					</ul></li>
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-table fa-fw"></i> <span class="menu-text">系统自动评估管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li><a class="" href="dynamic_tables.html"><span
								class="sub-menu-text">查看所有产品-项目的评估记录</span></a></li>

						<li><a class="" href="simple_table.html"><span
								class="sub-menu-text">查看待评估的产品-项目的评估</span></a></li>
						
					</ul></li> -->
				<li class="has-sub"><a href="#"
					class=""> <i class="fa fa-table fa-fw"></i> <span
						class="menu-text">系统资源管理</span> <span class="arrow"></span>
				</a>
					<ul class="sub">
						<!-- adminSelectAllNews?pageNum=1   adminAddNews -->
						<li><a class="" href="adminAllClawer?pageNum=1"><span
								class="sub-menu-text">查看所有爬虫</span></a></li>
						<li><a class="" href="adminAddNews"><span
								class="sub-menu-text">爬虫系统信息统计</span></a></li>
						<li><a class="" href="jqgrid_plugin.html"><span
								class="sub-menu-text">爬取结果统计</span></a></li>
					</ul></li>
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-table fa-fw"></i> <span class="menu-text">政策管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li><a class="" href="simple_table.html"><span
								class="sub-menu-text">查看所有政策</span></a></li>
						<li><a class="" href="dynamic_tables.html"><span
								class="sub-menu-text">增加政策</span></a></li>
						<li><a class="" href="jqgrid_plugin.html"><span
								class="sub-menu-text">检索政策</span></a></li>
					</ul></li> -->
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">上传文件管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a href="javascript:;" class=""><span
								class="sub-menu-text">查看所有的上传文件</span> 
						</a>
							<ul class="sub-sub">
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看产品的上传相册</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看产品的上传附件</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看项目的上传附件</span></a></li>
							</ul></li>
						<li><a class="" href="forms.html"><span
								class="sub-menu-text">检索上传文件</span></a></li>
						<li><a class="" href="rich_text_editors.html"><span
                                class="sub-menu-text">Rich Text Editors</span></a></li>

                        <li><a class="" href="dropzone_file_upload.html"><span class="sub-menu-text">Dropzone File Upload</span></a>
                        </li>
					</ul></li> -->
				
				<li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">日志管理</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a href="javascript:;" class=""><span
								class="sub-menu-text">查看所有日志</span> 
						</a>
							<ul class="sub-sub">
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看产品服务提供者的所有日志</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看基金经理的所有日志</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看异常的日志信息</span></a></li>
							</ul></li>
						<li><a class="" href="forms.html"><span
								class="sub-menu-text">检索日志信息</span></a></li>

					</ul></li>
				<!-- <li class="has-sub"><a href="javascript:;" class=""> <i
						class="fa fa-pencil-square-o fa-fw"></i> <span class="menu-text">回收站</span>
						<span class="arrow"></span>
				</a>
					<ul class="sub">
						<li class="has-sub-sub"><a href="javascript:;" class=""><span
								class="sub-menu-text">系统黑名单</span>  </a>
							<ul class="sub-sub">
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看黑名单-用户</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看黑名单-产品服务</span></a></li>
								<li><a class="" href="#"><span
										class="sub-sub-menu-text">查看黑名单-项目</span></a></li>
							</ul></li>


					</ul></li> -->
			</ul>
		</div>
	</div>
	<!-- sidebar end -->
</body>
</html>
