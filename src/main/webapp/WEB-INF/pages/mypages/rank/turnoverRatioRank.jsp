<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>数据中心</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<!-- 于花蕾 2017年9月27 -->
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet"type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet"type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<script src="<%=basePath %>/js/bootstrap.min.js"></script>

<!--[if IE 7]><link rel="stylesheet" href="css/ie7.css" type="text/css" media="all" />
	<![endif]-->
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<link rel="stylesheet" href="css/ie.css" type="text/css" media="all" />
	<![endif]-->
<!-- Favicons
	================================================== -->
<link rel="shortcut icon" href="<%=basePath %>/images/favicon.ico" />
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.carouFredSel-5.6.2.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.sticky.js"></script>
<script type="text/javascript"
	src="<%=basePath %>/js/jquery-scroller-v1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/kendo.web.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/custom.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#qwertyui").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}
</script>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
			$(".div2").click(function(){ 
				$(this).next("div").slideToggle("slow")  
				.siblings(".div3:visible").slideUp("slow");
			});
		});
</script>

<style>
.left{ width:180px; height:100%; margin-top:40px;border:1px solid #CCCCCC ;#FFFFFF; color:#000000; font-size:14px; text-align:center;}
.div1{text-align:center; width:180px; }
.div2{height:50px; line-height:40px;cursor: pointer; font-size:13px; position:relative;border-bottom:#ccc 1px dotted;}
.jbsz {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/1.png);}
.xwzx {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/2.png);}
.zxcp {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/4.png);}
.lmtj {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/8.png);}
.div3{display: none;cursor:pointer; font-size:13px; background-color:#E5A2A7;}
.div3 ul{margin:0;padding:0;}
.div3 li{ height:30px; line-height:30px; list-style:none; border-bottom:#ccc 1px dotted; text-align:center;}
.secondary {border:1px solid #CCCCCC;height:1000px;margin-left:20px;margin-top:40px;}
</style>

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

	<div >
		<div  style="margin-left:6%">
			<div class="left">
				<div class="div1">
				  <div class="div2"><div class="jbsz"> </div>沪深股票</div>
			      <div class="div3">
					<ul>
						<li><a href="marketIndex?pageNum=1">沪深A股</a></li>
						<li><a href="marketIndexHuA?pageNum=1">沪市A股</a></li>
					    <li><a href="marketIndexShenA?pageNum=1"">深市A股</a></li>
					</ul>
				  </div>
				  <div class="div2"><div class="xwzx"> </div>资金流向</div>
			      <div class="div3">
				      <ul>
						  <li> 资金流向概览</li>
						  <li> 个人资金流向</li>
				          <li> 行业资金流向</li>
				          <li> 主力资金流向</li>
				          <li> 连续资金流向</li>
				       </ul>
			 	  </div>
				  <div class="div2"><div class="zxcp"> </div>大单统计</div>
			      <div class="div3">
				      <ul>
						  <li>即时大单</li>
						  <li> 大单净买</li>
					      <li> 大单静卖</li>
				      </ul>
				  </div>
				  <div class="div2"><div class="lmtj"> </div> 实时排行</div>
				  <div class="div3">
					  <ul>
						 <li> <a href="upRatioRank?pageNum=1">涨幅排行</a></li>
						 <li> <a href="downRatioRank?pageNum=1">跌幅排行</a></li>
				         <!-- <li> 5分钟涨幅</li>
				         <li>5分钟跌幅</li>
				         <li>60分钟涨幅排行</li> -->
				         <li> <a href="turnoverRatioRank?pageNum=1">换手排行</a></li>
				         <li> <a href="turnVolumeRank?pageNum=1">成交额排行</a></li>
				         <li><a href="amplitudeRank?pageNum=1">振幅排行</a></li>
				         <li><a href="equivalentRatioRank?pageNum=1">量比排行</a></li>
					  </ul>
				  </div>
				  <div class="div2"><div class="zxcp"> </div>板块行情</div>
				  <div class="div3">
				      <ul>
						  <li><a href="industrySectionAll">行业版块</a></li>
						  <li><a href="conceptionSectionAll">概念版块</a></li>
					      <li><a href="areaSectionAll">地域板块</a></li>
				      </ul>
				  </div>
				  <div class="div2"><div class="zxcp"> </div>龙虎榜</div>
				  <div class="div3">
				      <ul>
						  <li>个股龙虎榜一览</li>
						  <li>营业部上榜一览</li>
					      <li>机构席位上榜一览</li>
				      </ul>
				  </div>
				   <div class="div2"><div class="zxcp"> </div><a href="dzjy?pageNum=1">大宗交易</a></div>
				  <div class="div3">
				      <ul>
						  <li><a href="dzjy?pageNum=1">股票大宗交易</a></li>
						  <li>基金大宗交易</li>
					      <li>债券大宗交易</li>
				      </ul>
				  </div>
				</div>
			</div>
			
			<div class="secondary" style="width:80%">
			
			<!-- <div id="main-content">
			<div class="container"> -->
				<div class="row">
					<div id="content" class="col-lg-12">
						<!-- PAGE HEADER-->
						<div class="row" >
							<div class="col-sm-12" >
								<div class="page-header" >
									<!-- STYLER -->

									<!-- /STYLER -->
									<!-- BREADCRUMBS -->
									<ul class="breadcrumb" style="width:100%;background-color:#B2DFEE">
										<li><i class="fa fa-home"></i> <a href="index.html">首页></a>
										</li>
										<li><a href="adminSelectAllNews?pageNum=1">实时排行></a></li>
										<li>换手排行</li>
									</ul>
									<!-- /BREADCRUMBS -->
								</div>
							</div>

						</div>
						<!-- /PAGE HEADER -->
						<div id="filter-controls" class="btn-group">
							<form class="form-inline">
								<div class="form-group">
									<label for="projectName">股票代码：</label> <input id="projectName"
										type="text" class="form-control" placeholder="股票代码">

								</div>
								<button style="margin-top: 5%" class="btn btn-primary">搜索</button>
							</form>
							<hr>
							
						</div>
						<table id="datatable1" cellpadding="0" cellspacing="0" border="0"
							class="datatable table table-striped table-bordered table-hover dataTable"
							aria-describedby="datatable1_info">
							<thead>
								<tr>
									<th>股票代码</th>
									<th>名称</th>
									<th>现价</th>
									<th>涨跌幅（%）</th>
									<th>涨跌</th>
									<th>涨速（%）</th>
									<th>换手（%）</th>
									<th>量比</th>
									<th>振幅（%）</th>
									<th>成交额</th>
									<th>流通股</th>
									<th>流通市值</th>
									<th>市盈率</th>
								</tr>
								
							</thead>

							<tfoot>
								<tr>
									<th>股票代码</th>
									<th>名称</th>
									<th>现价</th>
									<th>涨跌幅（%）</th>
									<th>涨跌</th>
									<th>涨速（%）</th>
									<th>换手（%）</th>
									<th>量比</th>
									<th>振幅（%）</th>
									<th>成交额</th>
									<th>流通股</th>
									<th>流通市值</th>
									<th>市盈率</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach items="${stockinfosTur}" var="v" varStatus="sta">
								<tr class="gradeX">
								    <td>${v.stockNum}</td>
									<td><a href="#" title="点击查看详情">${v.stockName}</a></td>
									<td>${v.currentPrice}</td>
									<td><font color="red">${v.updownRatio}</font></td>
									<td><font color="red">${v.updownPrice}</font></td>
									<td>${v.upSpeed}</td>
									<td><font color="red">${v.turnoverRate}</font></td>
									<td>${v.equivalentRatio}</td>
									<td>${v.amplitude}</td>
									<td>${v.turnVolume}</td>
									<td>${v.floatingStock}</td>
									<td>${v.circulationMarketValue}</td>
									<td>${v.peRatio}</td>
									
								</tr>
								</c:forEach>
							</tbody>
						</table>

						<div class="row">
							<div class="col-sm-12">
								<div class="pull-left">
									<div class="dataTables_info" id="datatable1_info">显示 1 to
										${pager.pageSize } 总共 ${pager.recordCount }条</div>
								</div>
								<div class="pull-right">
									<div class="dataTables_paginate paging_bs_full"
										id="datatable1_paginate">
										<ul class="pagination" style="text-align: center;">

											<li><a href="#">共 ${pager.recordCount} 条数据，每页
													${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第
													${pager.pageNum } 页</a></li>

										</ul>

										<ul class="pagination">

											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="amplitudeRank?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="amplitudeRank?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="amplitudeRank?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="amplitudeRank?pageNum=${pager.pageCount }">末页</a></li>
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
			</div>
		</div>
			
			</div>
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