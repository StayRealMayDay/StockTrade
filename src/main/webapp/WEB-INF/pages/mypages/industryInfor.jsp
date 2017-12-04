<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<head>
<title>股东股本</title>
<link href="<%=basePath%>/css/style.css" rel="stylesheet"
	type="text/css" media="all" />
<!-- font-awesome icons -->
<link rel="stylesheet" href="<%=basePath%>/css/font-awesome.min.css" />
<!-- //font-awesome icons -->
<!-- js -->
<script type="text/javascript"
	src="<%=basePath%>/js/jquery.marquee.min.js"></script>
<!-- //js -->
<link
	href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i"
	rel="stylesheet">
<script src="<%=basePath%>/static/uStyle/js/jquery.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath%>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/easing.js"></script>
<script src="<%=basePath%>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/echarts.min.js"></script>
<!-- start-smoth-scrolling -->

<script type="text/javascript">
	$(document).ready(function() {
		trace("初始化方法进入");
		$("#foucus").css('display', 'block');

	});
</script>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

a, img {
	border: 0;
}

table {
	empty-cells: show;
	border-collapse: collapse;
	border-spacing: 0;
}
/* sortTable */
.sortTable {
	border: #000000 2px solid;
	margin-left: 130px;
	height: 300px;
	width: 800px;
	margin-top:20px;
}

.sortTable td, .sortTable th {
	font-size: 12px;
	font-family: Arial;
	padding: 5px;
}

.sortTable th {
	background: #c0c0c0
}

.sortTable th a {
	color: #000080;
	text-decoration: none
}

.sortTable th.sortedcolumn {
	background: #b0b0b0
}

.sortTable tr.alternaterow {
	background: #e0e0e0
}

.sortTable tr.alternaterow td.sortedcolumn {
	background: #d0d0d0
}

.sortTable td.sortedcolumn {
	background: #f0f0f0
}
</style>
</head>
<body class="home-page">
	<jsp:include page="/top_company.jsp" flush="true"></jsp:include>
	<!-- news-original -->
	<div class="news-original">
		<div class="container">
			<div class="company_info">
				<div class="col-md-10 "
					style="margin-left: 5px; border: 1px solid #F0F0F0; width: 1100px">
					<div>
						<div class="col-md-2"
							style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px;">
							<h3>${company.stockName}</h3>
							<h3>${company.stockNum}</h3>
							<input type="button" value="加入自选" /><br>
						</div>
					</div>
					<div class="col-xs-4"
						style="border: 1px solid #F0F0F0; margin-top: 20px; height: 115px;">
						<table
							style="margin-top: 10px; margin-left: 40px; width: 200px; height: 100px">
							<tr>
								<td rowspan="2" style="text-align: center;">
									<p>
										<span style="color: #C10D01; font-size: 40px;" id="current">
										</span>
									</p>
								</td>
								<td>
									<p>
										<span style="color: #C10D01; font-size: 20px;"
											id="updownprice"> </span>
									</p>
								</td>
							</tr>
							<tr>
								<td><p>
										<span style="color: #C10D01; font-size: 20px;"
											id="updownratio"> </span>
									</p></td>
							</tr>
							<tr>
								<td colspan="2"><span id="updown"> </span></td>
							</tr>
						</table>
						<br>
					</div>
					<div class="col-md-6"
						style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px; width: 530px;">
						<table style="width: 530px">
							<tr>

								<td style="width: 30%;" id="jinkai">
								<td style="width: 37%;" id="chengjiaoliang"></td>
								<td style="width: 33%;">振幅：${stockinfo.amplitude}</td>
							</tr>
							<tr>
								<td style="width: 30%;" id="zuigao"></td>
								<td style="width: 37%;" id="chengjiaoe"></td>
								<td style="width: 33%;">换手率：${stockinfo.turnoverRate}%</td>
							</tr>
							<tr>
								<td style="width: 30%;" id="zuidi"></td>
								<td style="width: 37%;">流通市值：${stockinfo.circulationMarketValue}</td>
								<td style="width: 33%;">量比：${stockinfo.equivalentRatio}</td>
							</tr>
							<tr>
								<td style="width: 30%;" id="zuoshou"></td>
								<td style="width: 37%;">流通股：${stockinfo.floatingStock}</td>
								<td style="width: 33%;">市盈率：${stockinfo.peRatio}</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			<div style="height: 30px"></div>
			<div class="agileinfo_news_original_grids">
				<div class="col-md-12 agileinfo_news_original_grids_left">
					<div class="company_holder" style="border: 1px solid #EBEBEB">
						<div class="title"
							style="height: 40px; border: 1px solid; background-color: #D4D4D4; padding: 6px">行业地位</div>
						<div style="margin: 10px">
							<div>
								<!-- 用于展示柱状图 -->
								<div id="myEchart"
									style="height: 350px; width: 900px; border: 1px solid; margin-left: 100px"></div>
								<script type="text/javascript">
									var myChart, option;
									myChart = echarts.init(document
											.getElementById("myEchart"));
									option = {
										tooltip : {
											trigger : 'axis',
											axisPointer : {
												type : 'cross',
												crossStyle : {
													color : '#999'
												}
											}
										},
										toolbox : {
											feature : {
												dataView : {
													show : true,
													readOnly : false
												},
												magicType : {
													show : true,
													type : [ 'line', 'bar' ]
												},
												restore : {
													show : true
												},
												saveAsImage : {
													show : true
												}
											}
										},
										legend : {
											data : [ '蒸发量', '平均温度' ]
										},
										xAxis : [ {
											type : 'category',
											data : [ '1月', '2月', '3月', '4月',
													'5月', '6月', '7月', '8月',
													'9月', '10月', '11月', '12月' ],
											axisPointer : {
												type : 'shadow'
											}
										} ],
										yAxis : [ {
											type : 'value',
											name : '水量',
											min : 0,
											max : 250,
											interval : 50,
											axisLabel : {
												formatter : '{value} ml'
											}
										}, {
											type : 'value',
											name : '温度',
											min : 0,
											max : 25,
											interval : 5,
											axisLabel : {
												formatter : '{value} °C'
											}
										} ],
										series : [
												{
													name : '蒸发量',
													type : 'bar',
													data : [ 2.0, 4.9, 7.0,
															23.2, 25.6, 76.7,
															135.6, 162.2, 32.6,
															20.0, 6.4, 3.3 ]
												},
												{
													name : '平均温度',
													type : 'line',
													yAxisIndex : 1,
													data : [ 2.0, 2.2, 3.3,
															4.5, 6.3, 10.2,
															20.3, 23.4, 23.0,
															16.5, 12.0, 6.2 ]
												} ]
									};

									myChart.setOption(option);
								</script>
							</div>
							<div></div>
						</div>
					</div>
					<div class="col-md-12 agileinfo_news_original_grids_left"
						style="border: 1px solid #EBEBEB;height:350px">
						<table class="sortTable">
							<thead>
								<tr>
									<th colspan="11" style="font-size: 20px">2017年9月30日</th>
								</tr>
								<tr>
									<th>排名</th>
									<th><a title="Team Name"
										onclick="this.blur(); return sortTable('offmain',1,false);"
										href="#">股票代码</a></th>
									<th><span title="Games Played">股票简称</span></th>
									<th><a title="Total Yards"
										onclick="this.blur(); return sortTable('offmain',3,true);"
										href="#">每股收益(元)</a></th>
									<th><a title="Yards Per Game"
										onclick="this.blur(); return sortTable('offmain',4,true);"
										href="#">每股现金流(元)</a></th>
									<th><a title="Total Rushing Yards"
										onclick="this.blur(); return sortTable('offmain',  5, true);"
										href="#">净利润(元)</a></th>
									<th><a title="Rushing Yards Per Game"
										onclick="this.blur(); return sortTable('offmain',  6, true);"
										href="#">营业收益率</a></th>
									<th><a title="Total Passing Yards"
										onclick="this.blur(); return sortTable('offmain',  7, true);"
										href="#">股东权益比率</a></th>
									<th><a title="Passing Yards Per Game"
										onclick="this.blur(); return sortTable('offmain',  8, true);"
										href="#">销售毛利率</a></th>
									<th><a title="Total Points Scored"
										onclick="this.blur(); return sortTable('offmain',  9, true);"
										href="#">总股本</a></th>
									<th><a title="Points Per Game"
										onclick="this.blur(); return sortTable('offmain', 10, true);"
										href="#">Pts/G</a></th>
								</tr>
							</thead>
							<tbody id="offmain">
								<tr>
									<td></td>
									<td>atlanta</td>
									<td>16</td>
									<td>5070</td>
									<td>316.9</td>
									<td>1773</td>
									<td>110.8</td>
									<td>3297</td>
									<td>206.1</td>
									<td>291</td>
									<td>18.2</td>
								</tr>
								<tr class="alternaterow">
									<td></td>
									<td>baltimore</td>
									<td>16</td>
									<td>4773</td>
									<td>318.2</td>
									<td>1598</td>
									<td>106.5</td>
									<td>3175</td>
									<td>211.7</td>
									<td>284</td>
									<td>18.9</td>
								</tr>
								<tr>
									<td></td>
									<td>buffalo</td>
									<td>16</td>
									<td>5137</td>
									<td>321.1</td>
									<td>1686</td>
									<td>105.4</td>
									<td>3451</td>
									<td>215.7</td>
									<td>265</td>
									<td>16.6</td>
								</tr>
								<tr class="alternaterow">
									<td></td>
									<td>carolina</td>
									<td>16</td>
									<td>4254</td>
									<td>265.9</td>
									<td>1372</td>
									<td>85.8</td>
									<td>2882</td>
									<td>180.1</td>
									<td>253</td>
									<td>15.8</td>
								</tr>
								<tr>
									<td></td>
									<td>dallas</td>
									<td>16</td>
									<td>4402</td>
									<td>275.1</td>
									<td>2184</td>
									<td>136.5</td>
									<td>2218</td>
									<td>138.6</td>
									<td>246</td>
									<td>15.4</td>
								</tr>
								<tr class="alternaterow">
									<td></td>
									<td>denver</td>
									<td>16</td>
									<td>4817</td>
									<td>301.1</td>
									<td>1877</td>
									<td>117.3</td>
									<td>2940</td>
									<td>183.8</td>
									<td>340</td>
									<td>21.2</td>
								</tr>
								<tr>
									<td></td>
									<td>detroit</td>
									<td>16</td>
									<td>4994</td>
									<td>312.1</td>
									<td>1398</td>
									<td>87.4</td>
									<td>3596</td>
									<td>224.8</td>
									<td>270</td>
									<td>16.9</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="company_holder" style="border: 1px solid #EBEBEB;margin-top:350px">
						<div class="title"
							style="height: 40px; border: 1px solid; background-color: #D4D4D4; padding: 6px">行业新闻</div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div style="height"><a href="#">查看全文>></a></div>
						</div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div ><a href="#">查看全文>></a></div>
						</div>
						<div class="clearfix"></div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="float:left;margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div ><a href="#">查看全文>></a></div>
						</div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="float:left;margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div ><a href="#">查看全文>></a></div>
						</div>
						<div class="clearfix"></div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="float:left;margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div ><a href="#">查看全文>></a></div>
						</div>
						<div style="height:140px;border:1px solid #EBEBEB;width:45%;float:left;margin:15px">
							<div style="border:1px solid;height:30px">
								<p>标题：欧洲10月汽车销量增长5.9%   雷诺和丰田再度领先    11/16 16：05</p>
							</div>
							<div style="float:left;margin-left:20px;height:80px">
								<p>新浪美股讯巴黎11月16日报道，据周四公布的行业数据，10月欧洲汽车销量增长5.9%，雷诺汽车(RENA.PA)和丰田汽车(7203.T)销量在汽车生产商中名列前茅。
								　　欧洲汽车工业协会(ACEA)公布，欧盟和欧洲自由贸易区的汽车注册量</p>
							</div>
							<div ><a href="#">查看全文>></a></div>
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
			<p>
				Copyright &copy; 2016.Company name All rights reserved.<a
					target="_blank " href="http://sc.chinaz.com/moban/ ">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
			</p>
		</div>
	</div>
	<!-- //footer -->
	<!-- stacked-graph -->
	<script type="text/javascript " src="<%=basePath%>/js/raphael.js "></script>
	<script type="text/javascript "
		src="<%=basePath%>/js/jquery.enumerable.js "></script>
	<script type="text/javascript "
		src="<%=basePath%>/js/jquery.tufte-graph.js "></script>
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
			gap : 100,
			delayBeforeStart : 0,
			direction : 'left',
			duplicated : true,
			pauseOnHover : true
		});
	</script>

	<!-- //script for marque -->
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>/js/bootstrap.min.js "></script>
	<script>
		$(document).ready(function() {
			$(".dropdown ").hover(function() {
				$('.dropdown-menu', this).stop(true, true).slideDown("fast ");
				$(this).toggleClass('open');
			}, function() {
				$('.dropdown-menu', this).stop(true, true).slideUp("fast ");
				$(this).toggleClass('open');
			});
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
	<script type="text/javascript">
		function sortTable(id, col, rev) {

			var tblEl = document.getElementById(id);

			if (tblEl.reverseSort == null) {
				tblEl.reverseSort = new Array();
				tblEl.lastColumn = 1;
			}

			if (tblEl.reverseSort[col] == null)
				tblEl.reverseSort[col] = rev;

			if (col == tblEl.lastColumn)
				tblEl.reverseSort[col] = !tblEl.reverseSort[col];
			tblEl.lastColumn = col;
			var oldDsply = tblEl.style.display;
			tblEl.style.display = "none";
			var tmpEl;
			var i, j;
			var minVal, minIdx;
			var testVal;
			var cmp;

			for (i = 0; i < tblEl.rows.length - 1; i++) {
				minIdx = i;
				minVal = getTextValue(tblEl.rows[i].cells[col]);

				for (j = i + 1; j < tblEl.rows.length; j++) {

					testVal = getTextValue(tblEl.rows[j].cells[col]);
					cmp = compareValues(minVal, testVal);

					if (tblEl.reverseSort[col])
						cmp = -cmp;
					if (cmp == 0 && col != 1)
						cmp = compareValues(
								getTextValue(tblEl.rows[minIdx].cells[1]),
								getTextValue(tblEl.rows[j].cells[1]));
					if (cmp > 0) {
						minIdx = j;
						minVal = testVal;
					}
				}

				if (minIdx > i) {
					tmpEl = tblEl.removeChild(tblEl.rows[minIdx]);
					tblEl.insertBefore(tmpEl, tblEl.rows[i]);
				}

			}

			makePretty(tblEl, col);
			setRanks(tblEl, col, rev);
			tblEl.style.display = oldDsply;
			return false;
		}

		if (document.ELEMENT_NODE == null) {
			document.ELEMENT_NODE = 1;
			document.TEXT_NODE = 3;
		}

		function getTextValue(el) {
			var i;
			var s;
			s = "";
			for (i = 0; i < el.childNodes.length; i++)
				if (el.childNodes[i].nodeType == document.TEXT_NODE)
					s += el.childNodes[i].nodeValue;
				else if (el.childNodes[i].nodeType == document.ELEMENT_NODE
						&& el.childNodes[i].tagName == "BR")
					s += " ";
				else
					s += getTextValue(el.childNodes[i]);
			return normalizeString(s);
		}

		function compareValues(v1, v2) {
			var f1, f2;
			f1 = parseFloat(v1);
			f2 = parseFloat(v2);
			if (!isNaN(f1) && !isNaN(f2)) {
				v1 = f1;
				v2 = f2;
			}
			if (v1 == v2)
				return 0;
			if (v1 > v2)
				return 1
			return -1;
		}

		var whtSpEnds = new RegExp("^\\s*|\\s*$", "g");
		var whtSpMult = new RegExp("\\s\\s+", "g");

		function normalizeString(s) {
			s = s.replace(whtSpMult, " ");
			s = s.replace(whtSpEnds, "");
			return s;
		}

		var rowClsNm = "alternaterow";
		var colClsNm = "sortedcolumn";
		var rowTest = new RegExp(rowClsNm, "gi");
		var colTest = new RegExp(colClsNm, "gi");

		function makePretty(tblEl, col) {
			var i, j;
			var rowEl, cellEl;
			for (i = 0; i < tblEl.rows.length; i++) {
				rowEl = tblEl.rows[i];
				rowEl.className = rowEl.className.replace(rowTest, "");
				if (i % 2 != 0)
					rowEl.className += " " + rowClsNm;
				rowEl.className = normalizeString(rowEl.className);
				for (j = 2; j < tblEl.rows[i].cells.length; j++) {
					cellEl = rowEl.cells[j];
					cellEl.className = cellEl.className.replace(colTest, "");
					if (j == col)
						cellEl.className += " " + colClsNm;
					cellEl.className = normalizeString(cellEl.className);
				}
			}

			var el = tblEl.parentNode.tHead;
			rowEl = el.rows[el.rows.length - 1];

			for (i = 2; i < rowEl.cells.length; i++) {
				cellEl = rowEl.cells[i];
				cellEl.className = cellEl.className.replace(colTest, "");
				if (i == col)
					cellEl.className += " " + colClsNm;
				cellEl.className = normalizeString(cellEl.className);
			}
		}

		function setRanks(tblEl, col, rev) {
			var i = 0;
			var incr = 1;
			if (tblEl.reverseSort[col])
				rev = !rev;
			if (rev) {
				incr = -1;
				i = tblEl.rows.length - 1;
			}
			var count = 1;
			var rank = count;
			var curVal;
			var lastVal = null;

			while (col > 1 && i >= 0 && i < tblEl.rows.length) {
				curVal = getTextValue(tblEl.rows[i].cells[col]);
				if (lastVal != null && compareValues(curVal, lastVal) != 0)
					rank = count;
				tblEl.rows[i].rank = rank;
				lastVal = curVal;
				count++;
				i += incr;
			}

			var rowEl, cellEl;
			var lastRank = 0;

			for (i = 0; i < tblEl.rows.length; i++) {
				rowEl = tblEl.rows[i];
				cellEl = rowEl.cells[0];
				while (cellEl.lastChild != null)
					cellEl.removeChild(cellEl.lastChild);
				if (col > 1 && rowEl.rank != lastRank) {
					cellEl.appendChild(document.createTextNode(rowEl.rank));
					lastRank = rowEl.rank;
				}
			}
		}
	</script>
</body>
</html>