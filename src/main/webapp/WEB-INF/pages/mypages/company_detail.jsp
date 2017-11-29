<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>公司详情页</title>
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
<script type="text/javascript" src="<%=basePath %>js/script.js"></script>

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
<style type="text/css">
	.tableOne{border:1px solid #DCE5F4;border-collapse:collapse;font-size:12px}
	.tableOne td{border:1px solid #DCE5F4;}
	.tableOne tr{height:30px}
	
	.tableTwo{border:1px solid #DCE5F4;border-collapse:collapse;font-size:12px;text-align:center;}
	.tableTwo td{border:1px solid #DCE5F4;}
	.tableTwo tr{height:30px}
	#myTabContent2{display:block !important;}
	
	
	#tagbox{position:relative;margin:20px;width:300px;height:250px;}
	#tagbox a{position:absolute;padding:3px 6px;font-family:Microsoft YaHei;color:#FF5000;TOP:0px;font-weight:bold;text-decoration:none;left:0px}
	#tagbox a:hover{border:#eee 1px solid;background:#000;}
	#tagbox .blue{color:blue}
	#tagbox .red{color:red}
	#tagbox .yellow{color:yellow}
</style>
		
</head>

<body class="home-page">
<input type="text" name="stock" id="stock" style="display:none" value="${fn:substring(beiDouDetail.stockName,5,11)}"/>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sz${fn:substring(beiDouDetail.stockName,5,11)}" charset="utf-8"></script>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sh${fn:substring(beiDouDetail.stockName,5,11)}" charset="utf-8"></script>  
			<script type="text/javascript">
			var stock = document.getElementById('stock').value;
			 /* var ul=window.location.href.split("?")[1].split('=')[1]
			 alert(ul); */
			 /* alert(stock); */
			 var temp=stock.substring(0,1);
			 /* alert(temp); */
			 if(temp=="6"){
				 var url ="hq_str_sh"+stock;
			 }else{
				 var url ="hq_str_sz"+stock;
			 }
			var elements=eval(url).split(",");
			var updown=elements[3]-elements[2];
			var updownratio=updown/elements[2]*100;
			var updown10=elements[2]*0.1;
			var up=Number(elements[2])+Number(updown10);
			var down=Number(elements[2])-Number(updown10);
			var chengjiao=Number(elements[9]).toFixed(0)
			var chengjiaoliang=elements[8];
			var elements1=elements[1];
			var elements2=elements[2];
			var elements3=elements[3];
			var elements4=elements[4];
			var elements5=elements[5];
			$(function () {
				$('#current').html(elements3);
				$('#updownprice').html(updown.toFixed(3));
				$('#updownratio').html(updownratio.toFixed(3));
	 	        $('#updown').html("涨停："+up.toFixed(3)+"跌停："+down.toFixed(3));
	 	        $('#jinkai').html("今开："+elements1);
	 	        $('#zuigao').html("最高："+elements4);
	 	        $('#zuidi').html("最低："+elements5);
	 	        $('#zuoshou').html("昨收："+elements2);
	 	        $('#chengjiaoe').html("成交额："+chengjiao);
	 	       $('#chengjiaoliang').html("成交量："+chengjiaoliang);
	     	});
</script>
	<jsp:include page="/top_q.jsp" flush="true" />

<div class="news-original">
	<div class="container">	
		<div class="agileinfo_news_original_grids">
			<div class="col-md-3 agileinfo_news_original_grids_left">
				<div class="w3l_your_stocks">
					<div class="w3_stocks">
						<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
							<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
								<li role="presentation" class="active">
									<a href="#mystock" id="my_tab" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">最近访问</a>
								</li>
								<li role="presentation">
									<a href="#my_news" role="tab" id="news-tab" data-toggle="tab" aria-controls="newTab">我的自选股</a>
								</li>
							</ul>
							<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tab">
									<div class="w3l_stocks">
										<table style="font-size:13px">
											<thread style="width: 100%;">
												<th style="width: 25%;">股票名称</th>
												<th style="width: 25%;">股价</th>
												<th style="width: 25%;">涨跌幅</th>
											</thread>
											<tr>
												<td><a href="company?stockNum=${fn:substring(beiDouDetail.stockName,5,11)}">${fn:substring(beiDouDetail.stockName,0,4)}</a></td>
												
												<td>
												<script type="text/javascript">
													var elements=hq_str_sz002383.split(",");
													document.write(""+elements[3]+""); 
												</script>
												</td>
												
												<td>
												<script type="text/javascript">
													var elements=hq_str_sz002383.split(",");
													var updown=elements[3]-elements[2];
													var updownratio=updown/elements[2]*100;
													document.write(""+updownratio.toFixed(3)+"%"); 
												</script>
												</td>
											
											</tr>
											<tr>
												<td><a href="company">江丰电子</a></td>
												<td>11.88</td>
												<td>-3.41%</td>
											
											</tr>
											<tr>
												<td><a href="company">祥和实业</a></td>
												<td>15.48</td>
												<td>-5.78%</td>
											</tr>
											<tr>
												<td><a href="company">天安新材</a></td>
												<td>18.60</td>
												<td>1.61%</td>
											
											</tr>
											
	
											<tr>
												<td><a href="company">振华科技</a></td>
												<td>11.12</td>
												<td>2.56%</td>
												
											</tr>
											<tr>
												<td><a href="company">横店东磁</a></td>
												<td>6.52</td>
												<td>-1.02%</td>
											</tr>
											</table>
										</div>
									</div>
									<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tab">
										<div class="w3l_stocks">
											<ul id="myTab1" class="nav nav-tabs" role="tablist">
												<li><a href="companySingle"><b>20只翻倍股六成有“国家队”身影</b></a></li>
												<li><a  href="companySingle"> 9月12日午间公告一览：岭南园林中标5亿元工程</a></li>
												<li><a  href="companySingle">A股只剩50只未涉及股票质押！高质押小市值个股要遭殃？</a></li>
												<li><a href="companySingle">新能源汽车狂“飙” 谁是下一爆发点</a></li>
												<li><a href="companySingle">机构调研步伐明显加快 电子等行业成为调研重点</a></li>
												<li><a href="companySingle">强势股机构分歧大</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						</div>
						<div class="w3layouts_market_movers">
							<h3 style="background:#EFEFEF;color:#C10D01;text-align:center">以下为热门股票</h3>
							<div role="tabpanel" style="margin:20px"  class="w3l_stocks">
								<table style="font-size:13px">
									<tr style="width: 100%;">
										<th style="width: 25%;">股票名称</th>
										<th style="width: 25%;">股价</th>
										<th style="width: 25%;">涨跌幅</th>
									</tr>
									<tr style="height:30px">
										<td><a href="company">华森制药</a></td>
										<td>10.51</td>
										<td>10.05%</td>
									
									</tr>
									<tr style="height:30px">
										<td><a href="company">集泰股份</a></td>
										<td>11.84</td>
										<td>10.04%</td>
									
									</tr>
									<tr style="height:30px">
										<td><a href="company">德生科技</a></td>
										<td>17.58</td>
										<td>10.01</td>
									</tr>
									<tr style="height:30px">
										<td><a href="company">金辰股份</a></td>
										<td>54.62</td>
										<td>10.01%</td>
									</tr>
								</table>
							</div>
						</div>
									
						<div class="w3layouts_market_movers">
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i>热点栏目</h3> 
								<div role="tabpanel" style="margin:20px"  class="w3l_stocks">
								<table style="width:100%;text-align:center;font-size:13px">
									<tr style="height:20px">
										<td style="">
										<a href="companyBulletinList?stockNum=${fn:substring(beiDouDetail.stockName,5,11)}&pageNum=1">公司公告</a>
										</td>			
										<td><a>新股申购</a></td>
									</tr>
									<tr style="height:20px">
										<td><a href="shares">股吧</a></td>
										<td><a href="latestBlog">博客</a></td>
									</tr>
									<tr style="height:20px">
										<td><a>大宗交易</a></td>		
										<td><a href="marketIndex?pageNum=1">沪深市场</a></td>
									</tr>
								</table>
							</div>
						</div>
						<div class="w3layouts_market_movers" >
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i>行情走势</h3> 
								<div role="tabpanel" style="margin:20px"  class="w3l_stocks">
								<table style="width:100%;text-align:center;font-size:13px">
									<tr style="height:20px">
										<td><a>大单追踪</a></td>
										<td><a>大宗交易</a></td>
									</tr>
									<tr style="height:20px">
										<td><a>龙虎榜</a></td>
										<td><a href="industrySectionAll">行业板块</a></td>
									</tr>
									<tr style="height:20px">
										<td><a href="conceptionSectionAll">概念板块</a></td>
										<td><a href="areaSectionAll">地域版块</a></td>
									</tr>
								</table>
							</div>
						</div>
						<div class="w3layouts_market_movers" >
							<h3 ><i class="fa fa-bar-chart" aria-hidden="true"></i>公司资料</h3> 
								<div role="tabpanel" style="margin:20px"  class="w3l_stocks">
								<table style="width:100%;text-align:center;font-size:13px">
									<tr style="height:20px">
										<td><a href="">公司简介</a></td>
										<td><a href="">公司高管</a></td>
									</tr>
									<tr style="height:20px">
										<td><a href="">所属行业</a></td>
										<td><a href="">所属概念</a></td>
									</tr>
									<tr style="height:20px">
										<td><a href="">股本股东</a></td>
										<td></td>
									</tr>
								</table>
							</div>
						</div>
					</div>

					<div class="col-md-9">	
						<div style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px;width:15%;float:left;height:120px">
							<h4>${fn:substring(beiDouDetail.stockName,0,4)}</h4>
							<h4>${fn:substring(beiDouDetail.stockName,5,11)}</h4>
							<input type="button" value="加入自选"  />
						</div>
						<div style="border: 1px solid #F0F0F0; margin-top: 20px; width:25%;float:left;height:120px">
							<table style="margin-top:30px; width: 200px; ">
								<tr>
									<td rowspan="2">
										<p><span id="current" style="color:#C10D01; font-size: 40px; ">20.33</span></p>
									</td>
									<td>
										<p><span id="updownprice" style="color:#C10D01; font-size: 20px; ">1.85</span></p>
									</td>
								</tr>
								<tr>
									<td><p><span id="updownratio" style="color:#C10D01; font-size: 20px; ">10.01%</span></p></td>
								</tr>
								
								<tr>		
									<td colspan="2">
										<span id="updown"></span>
									</td>
								</tr>
							</table>
						</div>
						<div style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px;width:40%;float:left;height:120px">
							<table style="width:350px;font-size:10px;">
								<tr style="height:20px">
									<td style="width: 28%;" id="jinkai">今开：20.33</td>
									<td style="width: 36%;" id="chengjiaoliang">成交量：4.57万</td>
									<td style="width: 34%;">振幅：${stockinfo.amplitude}</td>
								</tr>
								<tr style="height:20px">
									<td style="width: 28%;" id="zuigao">最高：20.33</td>
									<td style="width: 36%;"  id="chengjiaoe">成交额：4.57万</td>
									<td style="width: 34%;">换手率：${stockinfo.turnoverRate}%</td>
								</tr>
								<tr style="height:20px">
									<td style="width: 28%;" id="zuidi">最低：20.33</td>
									<td style="width: 36%;">流通市值：${stockinfo.circulationMarketValue}</td>
									<td style="width: 34%;">量比：${stockinfo.equivalentRatio}</td>
								</tr>
								<tr style="height:20px">
									<td  style="width: 28%;"id="zuoshou">昨收：20.33</td>
									<td style="width: 36%;" >流通股：${stockinfo.floatingStock}</td>
									<td style="width: 34%;">市盈率：${stockinfo.peRatio}</td>
								</tr>
							</table>
						</div>
						<div style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px;width:20%;float:left;height:120px">
							<a href="http://image.sinajs.cn/newchart/min/n/sz${fn:substring(beiDouDetail.stockName,5,11)}.gif">
							<img style="width:150px;height:100px" alt="" src="http://image.sinajs.cn/newchart/min/n/sz${fn:substring(beiDouDetail.stockName,5,11)}.gif">
							<img style="width:150px;height:100px" alt="" src="http://image.sinajs.cn/newchart/min/n/sh${fn:substring(beiDouDetail.stockName,5,11)}.gif">
							</a>
						</div>
						<div class="clearfix"></div>
					<div style="width:100%;float:left">
					<div style="border: 1px solid #F0F0F0; margin: 20px 15px 10px 10px; width:45%;float:left;height:150px">
						<div style="border: 1px solid #F0F0F0; width:80%;float:left;height:150px">
							<img style="width:280px;height:145px" alt="" src="<%= basePath%>/static/uStyle/img/relation_gragh.png">
						</div>
						<div style="border: 1px solid #F0F0F0; background-color:#FFFAF0; width:20%;float:left;height:50px;margin-top:45px">
    						<a style="color:#FFC125;" href="relationGragh?stock=${fn:substring(beiDouDetail.stockName,5,11)}" style="float:left">查看企业关系图谱</a>
						</div>
					</div>
					<div style="border: 1px solid #F0F0F0; margin: 20px 15px 10px 10px; width:45%;float:left;height:150px">
						<div style="border: 1px solid #F0F0F0;  width:80%;float:left;height:150px">
							<img style="width:280px;height:145px" alt="" src="<%= basePath%>/static/uStyle/img/china.png">
							
						</div>
						<div style="border: 1px solid #F0F0F0; background-color:#FFFAF0; width:20%;float:left;height:50px;margin-top:45px">
    						<a style="color:#FFC125;" href="china?stock=${fn:substring(beiDouDetail.stockName,5,11)}" style="float:left">查看企业所在行业分布情况</a>
						</div>
					</div>
						<div class="clearfix"></div>
						<nav class="agileinfo_news_original_grids" >
							<ul class="nav nav-tabs nav-tabs1 " style="background-color:#E0F2FA ;width:100%" role="tablist">
								<li style="font-size:18px;width:20%">公司资料</li>
								<li role="presentation" class="active">
									<a href="#brief" id="brief_tab" role="tab" data-toggle="tab" aria-controls="briefTab">公司简介</a>
								</li>
								<li role="presentation">
									<a href="#leader" id="leader_tab" role="tab" data-toggle="tab" aria-controls="leaderTab">公司高管</a>
								</li>
								<li role="presentation">
									<a href="#industry" id="industry_tab" role="tab" data-toggle="tab" aria-controls="industryTab">所属行业/概念板块</a>
								</li>
								<li role="presentation">
									<a href="#shareHolder" id="shareHolder_tab" role="tab" data-toggle="tab" aria-controls="shareHolderTab">股本股东</a>
								</li>
							</ul>
						</nav>
						<div id="myTabContent2" class="tab-content">
								<div role="tabpanel" class="tab-pane in active" id="brief" aria-labelledby="brief_tab">
									<div class="w3l_stocks">
										<div style="background:#F7F7F8;height:30px;text-align:center">公司简介--<span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span></div>
										<div>
											<div style="height:20px"></div>
											<table class="tableOne">
												<tr>
													<td style="width:25%;">公司名称：</td>
													<td colspan="3" > ${beiDouDetail.companyCname }</td>
												</tr>
												<tr >
													<td style="width:25%;">公司英文名称：</td>
													<td colspan="3"> ${beiDouDetail.companyEname }</td>
												</tr>
												<tr >
													<td>上市市场：</td>
													<td>${beiDouDetail.listMarket }</td>
													<td>上市日期：</td>
													<td>${beiDouDetail.listDate }</td>
												</tr>
												<tr>
													<td>发行价格：</td>
													<td>${beiDouDetail.issuePrice }</td>
													<td>主承销商：</td>
													<td><a>${beiDouDetail.masterUnderwriter }</a> </td>
												</tr>
												<tr >
													<td>成立日期：</td>
													<td>${beiDouDetail.establishDate }</td>
													<td>注册资本：</td>
													<td>${beiDouDetail.registerCapital }</td>
												</tr>
												<tr >
													<td>机构类型：</td>
													<td>${beiDouDetail.organizationType }</td>
													<td>组织形式：</td>
													<td>${beiDouDetail.organizationForm }</td>
												</tr>
												<tr>
													<td>董事会秘书：</td>
													<td>${beiDouDetail.secretariesName }</td>
													<td>公司电话：</td>
													<td>${beiDouDetail.companyTel }</td>
												</tr>
												<tr>
													<td>董秘电话：</td>
													<td>${beiDouDetail.secretariesTel }</td>
													<td>公司传真：</td>
													<td>${beiDouDetail.companyFax }</td>
												</tr>
												<tr>
													<td>董秘传真：</td>
													<td>${beiDouDetail.secretariesFax }</td>
													<td>公司电子邮箱：</td>
													<td><a>${beiDouDetail.companyMail } </a></td>
												</tr>
												<tr>
													<td>董秘电子邮箱：</td>
													<td>${beiDouDetail.secretariesMail }</td>
													<td>公司网址：</td>
													<td>${beiDouDetail.companyUrl }</td>
												</tr>
												<tr>
													<td>邮政编码：</td>
													<td>${beiDouDetail.postCode }</td>
													<td>信息披露网址：</td>
													<td>${beiDouDetail.infomationUrl }</td>
												</tr>
												<tr>
													<td>证券简称更名历史：</td>
													<td colspan="3"> ${beiDouDetail.snameHistory}</td>
												</tr>
												<tr>
													<td>注册地址：</td>
													<td colspan="3">${beiDouDetail.registerAdd}</td>
													
												</tr>
												<tr>
													<td>办公地址：</td>
													<td colspan="3">${beiDouDetail.workAdd}</td>
												</tr>
												<tr rowspan="5">
													<td>公司简介：</td>
													<td colspan="3">
														${beiDouDetail.companyProfile}
													</td>
												</tr>
												<tr rowspan="3">
													<td>经营范围：</td>
													<td colspan="3">
														${beiDouDetail.businessScope}
													</td>
												</tr>
											</table>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="leader" aria-labelledby="leader_tab">
									<div class="w3l_stocks">
										<div style="background:#F7F7F8;height:30px;text-align:center">公司高管--<span>${fn:substring(beiDouDetail.stockName,0,4)}</span></div>
										<div>
											<div style="height:20px"></div>
											<table class="tableTwo" style="width:100%">
												<tr>
													<td colspan="4" style="text-align:center;background:#EEF5FF">历届高管成员</td>
												</tr>
												<tr>
													<td><b>姓名</b></td>
													<td><b>职务</b></td>
													<td><b>起始日期</b></td>
													<td><b>终止日期</b></td>
												</tr>
												<c:forEach items="${listGaoGuan}" var="listGaoGuan">
												<tr>
													
														<td>${listGaoGuan.executiveName}</td>
														<td>${listGaoGuan.duty}</td>
														<td>${listGaoGuan.startTime}</td>
														<td>${listGaoGuan.endTime}</td>
													
												</tr>
												</c:forEach>
											</table>
											<div style="height:50px"></div>
											<table class="tableTwo" style="width:100%">
												<tr>
													<td colspan="4" style="text-align:center;background:#EEF5FF">历届董事会成员</td>
												</tr>
												<tr>
													<td><b>姓名</b></td>
													<td><b>职务</b></td>
													<td><b>起始日期</b></td>
													<td><b>终止日期</b></td>
												</tr>
												<c:forEach items="${listDongShi}" var="listDongShi">
													<tr>
														<td>${listDongShi.executiveName}</td>
														<td>${listDongShi.duty}</td>
														<td>${listDongShi.startTime}</td>
														<td>${listDongShi.endTime}</td>
														
													</tr>
												</c:forEach>
											</table>
											
									</div>
								</div>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="industry" aria-labelledby="industry_tab">
									<div class="w3l_stocks">	
										<div style="background:#F7F7F8;height:30px;text-align:center">板块信息--<span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span></div>
											<div>
												<div style="height:20px"></div>
												<table class="tableTwo" style="width:50%;margin-left:200px">
													<tr style="background:#EEF5FF">
														<td colspan="2" style="text-align:center">所属行业板块</td>
													</tr>
													<tr>
														<td>所属行业板块</td>
														<td>同行业个股</td>
													</tr>
													<tr>
														<td>${industry}</td>
														<td><a href="relationIndustry?industry=${industry}&pageNum=1">点击查看</a></td>
													</tr>
													<tr>
														<td colspan="2" style="text-align:center">备注：此为证监会行业分类</td>
													</tr>
												</table>
												
												<div style="height:50px"></div>
												<!-- 词云 -->
												<script type="text/javascript" src="js/script.js"></script>
												<div id="tagbox" style="width:50%;margin-left:160px">

													<ul>
														<c:forEach items="${concepts}" var="concepts">
															<li><a href="relationConcept?conc=${concepts}&pageNum=1">${concepts }</a></li>
														</c:forEach>
													</ul>
												</div>

											</div>
									</div>
								</div>	
									<div role="tabpanel" class="tab-pane fade" id="shareHolder" aria-labelledby="shareHolder_tab">
									<div class="w3l_stocks">	
										<div style="background:#F7F7F8;height:30px;text-align:center"><span><b>${fn:substring(beiDouDetail.stockName,0,4)}</b></span>&nbsp;&nbsp;主要股东</div>
										<div style="height:20px"></div>
										<table class="tableTwo" style="width:90%;margin-left:40px">
											<tr>
												<td style="text-align:center">截止日期</td>
												<td colspan="6" style="text-align:center">${relative.deadline}</td>
											</tr>
											<tr>
												<td style="text-align:center">公告日期</td>
												<td colspan="6" style="text-align:center">${relative.declarationDate}</td>
											</tr>
											<tr>
												<td style="text-align:center">股东说明</td>
												<td colspan="6" style="text-align:center">${relative.stockholderDeclare}</td>
											</tr>
									
											<tr>
												<td style="text-align:center">股东总数</td>
												<td colspan="6" style="text-align:center">${relative.stockholderTotal}</td>
											</tr>
											<tr>
												<td style="text-align:center">平均持股数</td>
												<td colspan="6" style="text-align:center">${relative.stockholdAve}</td>
											</tr>
										</table>
										<table  class="tableTwo" style="width:90%;margin-left:40px">
											<tr>
												<td style="text-align:center">编号</td>
												<td colspan="3" style="text-align:center">股东名称</td>
												<td style="text-align:center">持股数量(股)</td>
												<td style="text-align:center">持股比例(%)</td>
												<td style="text-align:center">股本性质</td>
											</tr>
											<c:forEach items="${listStockBasic}"  var="basic">
												<tr>
													<td style="text-align:center">${basic.stockholderCode }</td>
													<td colspan="3" style="text-align:center">${basic.stockholderName }</td>
													<td style="text-align:center">${basic.shareholdNum }</td>
													<td style="text-align:center">${basic.shareholdRatio }</td>
													<td style="text-align:center">${basic.equityNature }</td>
												</tr>
											</c:forEach>
										</table>
									</div>
								</div>
									
									
								</div>
							</div>
						
					</div>
				</div>
			</div>
			</div>
		</div>
		<!-- //news-original -->
 <!--footer--> 
	<div class="footer ">
		<div class="container ">
			<ul class="agileits_w3layouts_footer_info ">
				<li><a href="index.jsp ">Home</a><i>|</i></li>
				<li><a href="news.jsp ">Markets</a><i>|</i></li>
				<li><a href="funds.jsp ">mutual funds</a><i>|</i></li>
				<li><a href="commodities.jsp ">commodities</a><i>|</i></li>
				<li><a href="portfolio.jsp ">portfolio</a><i>|</i></li>
				<li><a href="about.jsp ">About Us</a><i>|</i></li>
				<li><a href="ipo.jsp ">IPO</a><i>|</i></li>
				<li><a href="sitemap.jsp ">sitemap</a></li>
			</ul>
			<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank " href="http://sc.chinaz.com/moban/ ">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	</div>
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