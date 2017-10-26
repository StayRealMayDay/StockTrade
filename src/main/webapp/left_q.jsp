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

		<div  style="margin-left:4%">
			<div class="left">
					<div class="div1">
							  <div class="div2"><div class="jbsz"> </div>沪深股票</div>
						      <div class="div3">
								<ul>
									<li> 沪深A股</li>
									<li> 沪市A股</li>
								    <li> 深市A股</li>
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
							   <div class="div2"><div class="zxcp"> </div>大宗交易</div>
							  <div class="div3">
							      <ul>
									  <li>股票大宗交易</li>
									  <li>基金大宗交易</li>
								      <li>债券大宗交易</li>
							      </ul>
							  </div>
					</div>
			</div>
		</div>

</body>
</html>