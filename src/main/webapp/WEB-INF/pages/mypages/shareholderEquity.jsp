<%@page import="com.sun.xml.txw2.Document"%>
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
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/bootstrap.css">
<link href="<%=basePath %>/css/component.css" rel="stylesheet">
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/echarts.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js "></script>
<!-- start-smoth-scrolling -->
</head>
<body class="home-page">
<input type="text" name="stock" id="stock" style="display:none" value="${company.stockNum}"/>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sz${company.stockNum}" charset="utf-8"></script>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sh${company.stockNum}" charset="utf-8"></script>  
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
	var elements1=elements[1];
	var elements2=elements[2];
	var elements3=elements[3];
	var elements4=elements[4];
	var elements5=elements[5];
	var updown=elements[3]-elements[2];
	var updownratio=updown/elements[2]*100;
	var updown10=elements[2]*0.1;
	var up=Number(elements[2])+Number(updown10);
	var down=Number(elements[2])-Number(updown10);
	var chengjiao=Number(elements[9]).toFixed(0);
	var chengjiaoliang=elements[8];
	var elements10=elements[10];
	var elements11=elements[11];var elements12=elements[12];var elements13=elements[13];var elements14=elements[14];var elements15=elements[15];
	var elements16=elements[16];var elements17=elements[17];var elements18=elements[18];var elements19=elements[19];var elements20=elements[20];
	var elements21=elements[21];var elements22=elements[22];var elements23=elements[23];var elements24=elements[24];var elements25=elements[25];
	var elements26=elements[26];var elements27=elements[27];var elements28=elements[28];var elements29=elements[29];
	$(function () {
		$('#current').html(elements3);
		$('#updownprice').html(updown.toFixed(3));
		$('#updownratio').html(updownratio.toFixed(3));
	        $('#updown').html("涨停："+up.toFixed(3)+"跌停："+down.toFixed(3));
	        $('#jinkai').html("今开："+elements1);
	        $('#zuigao').html("最高："+elements4);
	        $('#zuidi').html("最低："+elements5);
	        $('#zuoshou').html("昨收："+elements2);
	        $('#chengjiaoliang').html("成交量："+chengjiaoliang);
	        $('#chengjiaoe').html("成交额："+chengjiao);
	        $('#fivehandicapbuy').html("<p>买一	--	<font color='red'>"+elements11+"</font>"+"	--	<font color='blue'>"+elements10+"</font></p>"+
				"<p>买二	--	<font color='red'>"+elements13+"</font>"+"	--	<font color='blue'>"+elements12+"</font></p>"+
				"<p>买三	--	<font color='red'>"+elements15+"</font>"+"	--	<font color='blue'>"+elements14+"</font></p>"+
				"<p>买四	--	<font color='red'>"+elements17+"</font>"+"	--	<font color='blue'>"+elements16+"</font></p>"+
				"<p>买五	--	<font color='red'>"+elements19+"</font>"+"	--	<font color='blue'>"+elements18+"</font></p>");
	       $('#fivehandicapsale').html("<p>买一	--	<font color='red'>"+elements21+"</font>"+"	--	<font color='blue'>"+elements20+"</font></p>"+
				"<p>买二	--	<font color='red'>"+elements23+"</font>"+"	--	<font color='blue'>"+elements22+"</font></p>"+
				"<p>买三	--	<font color='red'>"+elements25+"</font>"+"	--	<font color='blue'>"+elements24+"</font></p>"+
				"<p>买四	--	<font color='red'>"+elements27+"</font>"+"	--	<font color='blue'>"+elements26+"</font></p>"+
				"<p>买五	--	<font color='red'>"+elements29+"</font>"+"	--	<font color='blue'>"+elements28+"</font></p>");
    	});
</script>
<jsp:include page="/top_company.jsp" flush="true"></jsp:include>
<!-- news-original -->
<div class="news-original">
<div class="container">
	<div class="company_info">
		<div class="col-md-10 " style="margin-left:5px;border: 1px solid #F0F0F0;width:1100px">
			<div>
				<div class="col-md-2" style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px;">
					<h3>${company.stockName}</h3>
					<h3>${company.stockNum}</h3>
					<input type="button" value="加入自选"  />
					
				</div>
			</div>
			<div class="col-xs-4" style="border: 1px solid #F0F0F0; margin-top: 20px; height: 115px; ">
				<table style="margin-top:10px;margin-left:40px; width: 200px; height:100px">
					<tr >
						<td rowspan="2" style="text-align:center;">
							<p><span style="color:#C10D01; font-size: 40px; " id="current">
							</span></p>
						</td>
					
						<td>
							<p><span style="color:#C10D01; font-size: 20px; " id="updownprice">
							</span></p>
						</td>
					</tr>
					<tr>
						<td><p><span style="color:#C10D01; font-size: 20px; " id="updownratio">
						</span></p></td>
					</tr>
					<tr>
						<td colspan="2">
							<span id="updown">
							</span>
						</td>
					</tr>
				</table>
				<br>				
			</div>

			<div class="col-md-6"style="border: 1px solid #F0F0F0; padding: 15px; margin-top: 20px; font-size: 14px;width:530px;">
				<table style="width:530px">
					<tr>
					
						<td style="width: 30%;" id="jinkai">
						
						<td  style="width: 37%;" id="chengjiaoliang">
						</td>
						<td  style="width: 33%;">振幅：${stockinfo.amplitude}</td>
					</tr>
					<tr>
						<td style="width: 30%;"id="zuigao">
						</td>
						<td style="width: 37%;" id="chengjiaoe">
						</td>
						<td style="width: 33%;">换手率：${stockinfo.turnoverRate}%</td>
					</tr>
					<tr>
						<td style="width: 30%;" id="zuidi">
						</td>
						<td style="width: 37%;">流通市值：${stockinfo.circulationMarketValue}</td>
						<td style="width: 33%;">量比：${stockinfo.equivalentRatio}</td>
					</tr>
					<tr>
						<td style="width: 30%;" id="zuoshou">
						</td>
						<td style="width: 37%;">流通股：${stockinfo.floatingStock}</td>
						<td style="width: 33%;">市盈率：${stockinfo.peRatio}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div style="height:30px"></div>
	<div class="agileinfo_news_original_grids">
		<div class="col-md-12 agileinfo_news_original_grids_left">
			<div class="company_holder" style="border:1px solid #EBEBEB">
				<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px">股东人数</div>
					<div style="margin:10px">
						<div>
							<!-- 用于展示柱状图 -->
							<div id="myEchart" style="height:350px;width:100%px;border:1px solid"></div>
							<script type="text/javascript">
							   // 基于准备好的dom，初始化echarts实例
						       var myChart = echarts.init(document.getElementById('myEchart'));
						       $.getJSON('holderNumGraph?stockNum='+ '${company.stockNum}', function (data) {
						       myChart.setOption(option = {
						   		    title: {
								        text: '股东人数&股价  变化表'
								    },
								    tooltip: {
								        trigger: 'axis',
								        axisPointer: {
								            type: 'cross',
								            crossStyle: {
								                color: '#999'
								            }
								        }
								    },
								    roam: true,
								    draggable : true,
								    toolbox: {
								        feature: {
								            dataView: {show: true, readOnly: false},
								            magicType: {show: true, type: ['line', 'bar']},
								            restore: {show: true},
								            saveAsImage: {show: true}
								        }
								    },
								    legend: {
								        data:['股价','股东人数']
								    },
								    xAxis: {
								        data: data.categories
								    },
								    yAxis: [{
							               type: 'value',
							               name: '股东人数',
							               splitLine: {
							                   show: true,
							                   lineStyle: {
							                       color: '#006486',
							                       width: 1,
							                       type: 'dashed'
							                   }
							               }
							           }, {
							               type: 'value',
							               name: '股价',
							              /*  min: 0,
							               max: 70,
							               interval: 10, */
							               splitLine: {
							                   show: true,
							                   lineStyle: {
							                       color: '#006486',
							                       width: 1,
							                       type: 'dashed'
							                   }
							               }
							           }],
								    series: [
								    {
								        name: '股价',
								        type: 'bar',
								        yAxisIndex: 1,
								        data: data.data[0]
								    },
								    {
								        name: '股东人数',
								        type: 'line',
								        data: data.data[1]
								    },
								    ]
								}); 
						    	   
						       });
						    // 使用刚指定的配置项和数据显示图表。
						       //myChart2.setOption(option);
						</script>
						</div>
			<div>
				<div role="tabpanel">
					<div class="table-a" style="width:100%;padding:13px 10px 0px 18px;">
						<div class="left_head" style="width:118px;float:left;height:180px">
							<table class="top_head" style="border-right:1px solid;border-bottom:1px solid;width:118px;background-color:#EBEBEB"">
								<tr style="height:30px"> 
									<th style="border-left:1px solid;border-top:1px solid;">指标\日期</th>
								</tr>
							</table>
							<table clasn   s="tbody" style="border-right:1px solid;border-bottom:1px solid;width:118px;background-color:#EBEBEB;">
								<tr style="height:35px;">
									<th style="border-left:1px solid;border-top:1px solid;">股东总人数（户）</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">较上期变化</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">人均流通股（股）</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">人均流通变化</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">行业平均（户）</th>
								</tr>
							</table>
						</div>
						<div class="data_tbody" style="left:117px;">
							<table class="top_head" style="border-right:1px solid;border-bottom:1px solid;width:89%">
								<tr style="width: 100%;height:30px">
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.date}</th>
									</c:forEach>
								</tr>
							</table>
							<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:89%">
								<tr style="height:35px;"> 
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.holderNumber}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.changeCome}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.avgCirculate}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.avgCirculateChange}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${holderNumDetail}" var="num">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${num.instAvg}</th>
									</c:forEach>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
			</div>
			</div>
			<div class="company_holder"  style="border:1px solid #EBEBEB;border-top:10px">
				<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px">十大流动股东</div>
				<div style="margin:10px">
					<div style="display:block">
						<label style="width: 10%">选择日期：</label> 
						<select style="width:30%;height: 32px" id="roleId" onchange="selectRole()"> 
				           <c:forEach items="${holderDate}" var="date">
				           		<option value="${date}">${date}</option> 
				           </c:forEach>
			          	</select>
			       
					</div>
					<div class="tab-content" style="margin-top:5px">
						<div role="tabpanel" class="tab-pane fade in active" id="#one" aria-labelledby="${date}">
							<div class="w3l_stocks" style="width:100%;padding:13px 10px 0px 18px">
								<div id="threeInfor">前十大股东累计持有${stock_held}亿股，累计占总股本比：${stock_held_rate} ，较上期变化：${change_before}万股</div>
								<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;">
								<tr style="height:35px;background-color:#EBEBEB"> 
									<th style="border-left:1px solid;border-top:1px solid;width:30%;">机构或基金名称</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">持有数量(股)</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">持股变化(股)</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">占流通股比例</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">实际增减持</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">股份类型</th>
									<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">持股详情</th>
								</tr>
								<tbody id="tbody1">
									<c:forEach items="${topCircuList}" var="list">
										<tr class="gradeX" id="" style="height:35px">
											<td style="border-left:1px solid;border-top:1px solid;width:30%;text-align:center">
												<%-- <c:if test="${list.holderChange == '退出' }">
													<a href="javascript:;" onclick="selectOutCircuStock('${list.institutionName}')">${list.institutionName}</a>
												</c:if>
												<c:if test="${list.holderChange != '退出' }">${list.institutionName}</c:if> --%>
												<a href="javascript:;" onclick="selectOutCircuStock('${list.institutionName}')">${list.institutionName}</a>
											</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${list.holderNum}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${list.holderChange}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${list.stockPropotionRate}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${list.realIncrease}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${list.stockType}</td> <!-- ${list.stockDetailId} -->
											<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">
												<c:if test="${list.holderChange != '退出' }">
													<a href="javascript:;" class="md-trigger btn btn-primary btn-sm" onclick="selectStockDetail('${list.stockDetailId}','${list.institutionName}','${company.stockName}')">查看详情</a>
												</c:if>
												<c:if test="${list.holderChange == '退出' }"></c:if>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							</div>
							<div class="md-modal md-effect-1" id="modal-1">
							    <div class="md-content">
							      <h3 style="height:20px;border:2px;margin:2px" id="modalhead">华勇持有顺网科技详情</h3>
							      <div>
							        <!-- 用于显示echarts -->
							       	<div id="myEchartTwo" style="height:180px;width:100%;margin-top:0px"></div>
							       	<div style="width:100%"> <!-- style="padding-left:135px" -->
								       	<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:100%;">
											<tr style="height:30px;background-color:#EBEBEB"> 
												<th style="border-left:1px solid;border-top:1px solid;width:40%;">报告期</th>
												<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">持股数量(万股)</th>
												<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">占比(%)</th>
												<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">增减情况(万股)</th>
											</tr>
											<tbody id="tbody3"></tbody>
										</table>
									</div>
									<div style="height:20px"></div>
							      	<button class="md-close btn-sm btn-primary" id="closeBtn" onclick="closeDiv()">Close me!</button>
							      </div>
							    </div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 用于显示某一时间段的某一个公司的投资股票图 -->
			<div id="outStockGraph" style="height:650px;width:100%;border:1px solid #EBEBEB;display:none;">
				<a href="detailsInvestment" style="float:right;height:20px;width:15%" id="writeOne">查看更多投资变化详情</a>
				<div class="clearfix"></div>
				<div id="outStockGraphIn" style="height:650px;float:left;width:75%"></div>
				<div id="outStockGroupInner" style="height:650px;float:left;width:25%;"></div>
			</div>	
			
			
			<div class="company_holder"  style="border:1px solid #EBEBEB">
				<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px">十大股东</div>
				<div style="margin:10px">
					<div style="display:block">
						<label style="width: 10%">选择日期：</label> 
						<select style="width:30%;height: 32px" id="roleIdTwo" onchange="selectRoleTwo()"> 
				           <c:forEach items="${holderTwoDate}" var="dateTwo">
				           		<option value="${dateTwo}">${dateTwo}</option> 
				           </c:forEach>
			          	</select>
					</div>
					<div id="topTen" style="margin-top:5px">
						<div role="tabpanel" class="tab-pane fade in active" id="#one" aria-labelledby="${dateTwo}">
							<div class="w3l_stocks" style="width:100%;padding:13px 10px 0px 18px">
								<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;">
								<tr style="height:35px;background-color:#EBEBEB"> 
									<th style="border-left:1px solid;border-top:1px solid;width:30%;">机构或基金名称</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">持有数量(股)</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">持股变化(股)</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">占流通股比例</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">实际增减持</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">股份类型</th>
									<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">持股详情</th>
								</tr>
								<tbody id="tbody2">
									<c:forEach items="${topList}" var="toplist">
										<tr class="gradeX" id="" style="height:35px">
											<td style="border-left:1px solid;border-top:1px solid;width:30%;text-align:center">
												<%-- <c:if test="${toplist.holderChange == '退出' }">
													<a href="javascript:;" onclick="selectOutStock('${toplist.institutionName}')">${toplist.institutionName}</a>
												</c:if>
												<c:if test="${toplist.holderChange != '退出' }">${toplist.institutionName}</c:if> --%>	
												<a href="javascript:;" onclick="selectOutStock('${toplist.institutionName}')">${toplist.institutionName}</a>										
											</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${toplist.holderNum}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${toplist.holderChange}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${toplist.stockPropotionRate}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${toplist.realIncrease}</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${toplist.stockType}</td>
											<%-- <td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">${toplist.stockDetailId}</td> --%>
											<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">
												<c:if test="${toplist.holderChange != '退出' }">
													<a href="javascript:;" class="md-trigger btn btn-primary btn-sm" onclick="selectStockDetail('${toplist.stockDetailId}','${toplist.institutionName}','${company.stockName}')">查看详情</a>
												</c:if>
												<c:if test="${toplist.holderChange == '退出' }"></c:if>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							</div>
						</div>
					</div>
				</div>
				
			</div>
			<!-- 用于显示某一时间段的某一个公司的投资股票图 -->
			<div id="outStockGraphTwo" style="height:650px;width:100%;border:1px solid #EBEBEB;display:none;">
				<a href="detailsInvestment" style="float:right;height:20px;width:15%" id="writeTwo">查看更多投资变化详情</a>
				<div class="clearfix"></div>
				<div id="outStockGraphTwoIn" style="height:650px;float:left;width:75%"></div>
				<div id="outStockGroupTwoInner" style="height:650px;float:left;width:25%;"></div>
			</div>	
					
			<div class="company_holder"  style="border:1px solid #EBEBEB">
				<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px">总股本结构</div>
				<div style="margin:10px">
					<div role="tabpanel">
					<div class="table-a" style="width:100%;padding:13px 10px 0px 18px;">
						<div class="left_head" style="float:left;height:180px">
							<table class="top_head" style="border-right:1px solid;border-bottom:1px solid;width:118px;background-color:#EBEBEB"">
								<tr style="height:30px"> 
									<th style="border-left:1px solid;border-top:1px solid;">股份构成</th>
								</tr>
							</table>
							<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:118px;">
								<tr style="height:35px;">
									<th style="border-left:1px solid;border-top:1px solid;">总股本(股)</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">A股总股本(股)</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid"> 流通A股(股)</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid"> 限售A股(股)</th>
								</tr>
								<tr style="height:35px">
									<th style="border-left:1px solid;border-top:1px solid">变动原因</th>
								</tr>
							</table>
						</div>
						<div class="data_tbody" style="left:117px;">
							<table class="top_head" style="border-right:1px solid;border-bottom:1px solid;width:89%">
								<tr style="width:100%;height:30px">
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.date}</th>
									</c:forEach>
								</tr>
							</table>
							<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:89%">
								<tr style="height:35px;"> 
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.stockTotal}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.stockATotal}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.stockCirculate}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.stockLimit}</th>
									</c:forEach>
								</tr>
								<tr style="height:35px;"> 
									<c:forEach items="${totalStructure}" var="tructure">
										<th style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center">${tructure.changeReason}</th>
									</c:forEach>
								</tr>
							</table>
						</div>
					</div>
				</div>
				</div>
			</div>
			
			<div class="company_holder"  style="border:1px solid #EBEBEB">
				<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px">控股层级关系</div>
				<div class="table-a" style="width:100%;padding:13px 10px 0px 18px;margin:10px"">
					<div class="left_head">
						<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:89%;">
							<tr style="height:35px;">
								<td style="border-left:1px solid;border-top:1px solid;font-size:18px">
									<span>控制股东:   </span><span>${controller }</span>（${controllerInfo}）</td>
							</tr>
							<tr style="height:35px">
								<td style="border-left:1px solid;border-top:1px solid;font-size:18px">
									<span>实际控制人：   </span><span>${realController }</span>（${realControllerInfo }）</td>
							</tr>
							<tr style="height:35px">
								<td style="border-left:1px solid;border-top:1px solid;font-size:18px"> 
									<span>最终控制人：   </span><span>${finalController }</span>（${finalControllerInfo }）</td>
							</tr>
						</table>
					</div>
					<div class="data_tbody" style="margin:20px auto 50px auto">
						<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:89%">
							<c:forEach items="${classLevel}" var="tructure">
								<tr style="height:35px;"> 
									<td style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center;font-size:12px"> ${tructure.institutionnamefrom}</td>	
									<td style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center;font-size:12px">持有其 ${tructure.holdvalue}</td>	
									<td style="border-left:1px solid;border-top:1px solid;width:130px;text-align:center;font-size:12px"> ${tructure.institutionnameto}</td>							
								</tr>
							</c:forEach>
						</table>
						<div id="holdValueGraph" style="height:450px;width:100%;"></div>	
						<script type="text/javascript">
							var holdChart = echarts.init(document.getElementById("holdValueGraph"));
							var mapList = ${mapList}.mapList;
							var nodeList = mapList.nodeList;
							var edgeList = mapList.edgeslist;
							option = {  			           
			                       force:{
			                      	edgeLength:[20,80] 
			                       },
			                       animationDuration: 1500,
			                       animationEasingUpdate: 'quinticInOut',
			                       series: [{
			                           type: 'graph',
			                           layout: 'force',
			                           force: {
			                               initLayout:'circular',
			                               edgeLength: 300,
			                               repulsion: 600,
			                               gravity: 0.2,
			                               layoutAnimation : true
			                           },
			                           data:nodeList,
			                           lineStyle: {
			                               normal: {
			                                   color: "target",
			                                   width: 2,
			                                   curveness: 0.3
			                               }
			                           },
			                           edges: edgeList,
			                           edgeLabel: {
			 								normal: {
			 									show: true,
			 									textStyle: {
			 										fontSize: 14
			 									},	
			 								formatter:function(params){//触发之后返回的参数，这个函数是关
			 										  if (params.data.info !=undefined) {//如果触发节点
			 			               		              return  params.data.info;//返回标签
			 			               		            }else {//如果触发边
			 			               		              return  params.data.info;
			 			               		            }	
			 									}
			 	               		          } 
			 							},
			                           symbolSize:20,
			                           focusNodeAdjacency: true,
			                           roam: true,
			                           draggable: true,
			                           label: {
			                               normal: {
			                                   textStyle: {
			                                       color: ["#327df8"],
			                                       fontSize: 15
			                                   },
			                                   show: true,
			                                   position: 'right',
			                                   formatter: '{c}'
			                               }
			                           },
			                           edgeSymbol:['none', 'arrow'],
			                       }]
			                   };
							holdChart.setOption(option);
						</script>
					</div>
				</div>
			</div>
				
		</div>
	</div>
</div>
</div>	
<!-- //news-original -->
<!-- stacked-graph -->
	<script type="text/javascript " src="<%=basePath %>/js/raphael.js "></script>
    <script type="text/javascript " src="<%=basePath %>/js/jquery.enumerable.js "></script>
    <script type="text/javascript " src="<%=basePath %>/js/jquery.tufte-graph.js "></script>
	<script>
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
<!-- Bootstrap Core JavaScript -->
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
<script>
     function selectRole() {
         var element = document.getElementById("roleId");
         var roleId = element.options[element.selectedIndex].value;
		 var stockNum = "${company.stockNum}";            

         $.ajax({
          type: "POST",
          url: "ajaxSelectRole",
          data: {
          	"roleId":roleId,
			"stockNum":stockNum
          },
          dataType: "json",
          success: function(data) {
        	var mapList = data.mapList;
          	var topCircuList = mapList.topCircuList;
          	if(topCircuList.length == 0){
          	}else{	
          		var threeInforHtml ='前十大股东累计持有'+mapList.listInfo[0]+'亿股，累计占总股本比：'+mapList.listInfo[1]+'，较上期变化：'+mapList.listInfo[2]+'万股';
          		$("#threeInfor")[0].innerHTML = threeInforHtml;    
          		var permissionHtml = "";
  				for (var i = 0; i < topCircuList.length; i++) {
  					 permissionHtml = permissionHtml
  					   +'<tr class="gradeX" id="" style="height:35px">'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:30%;text-align:center">'
          			   /* if(topCircuList[i].holderChange == '退出'){
          				 permissionHtml += '<a href="javascript:;" onclick="selectOutCircuStock(\''+topCircuList[i].institutionName+'\')">'+topCircuList[i].institutionName+'</a></td>'
          			   }else{
          				 permissionHtml += topCircuList[i].institutionName+'</td>';  
          			   }   */
          			 permissionHtml += '<a href="javascript:;" onclick="selectOutCircuStock(\''+topCircuList[i].institutionName+'\')">'+topCircuList[i].institutionName+'</a></td>'
          			   permissionHtml +=
          			   '<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topCircuList[i].holderNum+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topCircuList[i].holderChange+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topCircuList[i].stockPropotionRate+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topCircuList[i].realIncrease+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topCircuList[i].stockType+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'
          			   if(topCircuList[i].holderChange != '退出'){
          				  permissionHtml += '<a href="javascript:;" class="md-trigger btn btn-primary btn-sm" onclick="selectStockDetail(\''+topCircuList[i].stockDetailId+'\',\''+topCircuList[i].institutionName+'\',\''+'${company.stockName}'+'\')">查看详情</a></td></tr>';
          				/*  permissionHtml += '<a href="javascript:;" class="md-trigger btn btn-primary btn-sm" data-target="#myModal" onclick="selectStockDetail(\''+topCircuList[i].stockDetailId+'\')">查看详情</a></td></tr>'; */
          			   }else{
          				 permissionHtml += '';
          			   }  
					$("#tbody1")[0].innerHTML = permissionHtml;    
  				}
          	}
          }
      }) 	   
     }    
    //显示流通公司投资股票的关系图
     function selectOutCircuStock(institutionName){
		if($("#outStockGraph").css("display") == "none"){
			$('#outStockGraph').css('display','block');
		}else{
			$('#outStockGraph').css('display','none');
		}
		$('#writeOne').attr('href','detailsInvestment?institutionName='+institutionName);
		 var element = document.getElementById("roleId");
         var roleId = element.options[element.selectedIndex].value;
         $.ajax({
             type: "POST",
             url: "ajaxCircuSingleCompanyGraph",
             data: {
             	"institutionName":institutionName,
   				"roleId":roleId
             },
             dataType: "json",
             success: function(data) {
              	var myChart = echarts.init(document.getElementById("outStockGraphIn"));
              	var myChartTwo = echarts.init(document.getElementById("outStockGroupInner"));
               	var mapList = data.mapList;	
               	var edgeList = [];//边
               	var nodeList = [];//点
                var categories = [];//类目
                var a=[0,0,0,0,0];
                
                 categories[0] = {name: '新进'};
                 categories[1] = {name: '不变'};
                 categories[2] = {name: '退出'};
                 categories[3] = {name: '增持'};
                 categories[4] = {name: '减持'};
                 categories[5] = {name: '核心'};
               	
           		edgeList = mapList.edgeslist;//边 
           		nodeList = mapList.stockNamelist;//复杂点
           		var infors= [];
           		for(var i = 0; i < edgeList.length; i++){
           			var r= edgeList[i].info;
           			infors[i] =r;
           		}
               	for(var i = 0; i < nodeList.length-1; i++){
               		if((nodeList[i].category) == 0){
               			a[0]++;
               		}else if((nodeList[i].category) == 1){
               			a[1]++
               		}else if((nodeList[i].category) == 2){
               			a[2]++;
               		}else if((nodeList[i].category) == 3){
               			a[3]++;
               		}else if((nodeList[i].category) == 4){
               			a[4]++;
               		}
               	}      	
               	option = {
               		 title: {
               			left: 'center',               		 
               	        text: institutionName + '   持股变化',
               	        subtext: roleId + ' 时期'
               	    },	  
            		legend: [{
            			 top: 45,
                         data: categories.map(function (a) {
                             return a.name;
                         })
                       }],
                       force:{
                      	edgeLength:[20,80] 
                       },
                       animationDuration: 1500,
                       animationEasingUpdate: 'quinticInOut',
                       series: [{
                           type: 'graph',
                           layout: 'force',
                           force: {
                               initLayout:'circular',
                               edgeLength: 300,
                               repulsion: 600,
                               gravity: 0.2,
                               layoutAnimation : true
                           },
                           data:nodeList,
                           lineStyle: {
                               normal: {
                                   color: "target",
                                   width: 2,
                                   curveness: 0.3
                               }
                           },
                           edges: edgeList,
                           // categories: category,
                           categories: categories,
                           symbolSize:20,
                           edgeLabel: {
							normal: {
								show: true,
								textStyle: {
									fontSize: 14
								},	
							formatter:function(params){//触发之后返回的参数，这个函数是关
									  if (params.data.info !=undefined) {//如果触发节点
		               		              return  params.data.info;//返回标签
		               		            }else {//如果触发边
		               		              return  params.data.info;
		               		            }	
								}
               		          } 
						},
                           focusNodeAdjacency: true,
                           roam: true,
                           label: {
                               normal: {
                                   textStyle: {
                                       color: ["#327df8"],
                                       fontSize: 15
                                   },
                                   show: true,
                                   position: 'right',
                                   formatter: '{c}'
                               }
                           },
                           edgeSymbol:['none', 'arrow'],
                       }]
                   };
                   myChart.setOption(option);
                   options = {
                 	    tooltip : {
                 	        trigger: 'item',
                 	        formatter: "{a} <br/>{b} : {c} ({d}%)"
                 	    },
                 	    
                 	    series : [
                 	        {
                 	            name: institutionName,
                 	            type: 'pie',
                 	            radius : '55%',
                 	            center: ['50%', '60%'],
                 	            data:[
                 	                {value:a[0], name:'新进'},
                 	                {value:a[1], name:'不变'},
                 	                {value:a[2], name:'退出'},
                 	                {value:a[3], name:'增持'},
                 	                {value:a[4], name:'减持'}
                 	            ],
                 	            itemStyle: {
                 	                emphasis: {
                 	                    shadowBlur: 10,
                 	                    shadowOffsetX: 0,
                 	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                 	                }
                 	            }
                 	        }
                 	    ]
                 	};
                   myChartTwo.setOption(options);
               }

          }) 	 
      }
   //显示公司投资股票的关系图
     function selectOutStock(institutionName){
		if($("#outStockGraphTwo").css("display") == "none"){
			$('#outStockGraphTwo').css('display','block');
		}else{
			$('#outStockGraphTwo').css('display','none');
		}
		$('#writeTwo').attr('href','detailsInvestmentTwo?institutionName='+institutionName);
		 var element = document.getElementById("roleIdTwo");
         var roleId = element.options[element.selectedIndex].value;
         $.ajax({
             type: "POST",
             url: "ajaxSingleCompanyGraph",
             data: {
             	"institutionName":institutionName,
   				"roleId":roleId
             },
             dataType: "json",
             success: function(data) {
             	var myChart = echarts.init(document.getElementById("outStockGraphTwoIn"));
              	var myChartTwo = echarts.init(document.getElementById("outStockGroupTwoInner"));
              	var mapList = data.mapList;	
              	var edgeList = [];//边
              	var nodeList = [];//点
                var categories = [];//类目
                var a=[0,0,0,0,0];
                categories[0] = {name: '新进'};
                categories[1] = {name: '不变'};
                categories[2] = {name: '退出'};
                categories[3] = {name: '增持'};
                categories[4] = {name: '减持'};
                categories[5] = {name: '核心'};
              	
           		edgeList = mapList.edgeslist;//边 
           		nodeList = mapList.stockNamelist;//复杂点
           		var infors= [];
           		for(var i = 0; i < edgeList.length; i++){
           			var r= edgeList[i].info;
           			infors[i] =r;
           		}
           		for(var i = 0; i < nodeList.length-1; i++){
               		if((nodeList[i].category) == 0){
               			a[0]++;
               		}else if((nodeList[i].category) == 1){
               			a[1]++
               		}else if((nodeList[i].category) == 2){
               			a[2]++;
               		}else if((nodeList[i].category) == 3){
               			a[3]++;
               		}else if((nodeList[i].category) == 4){
               			a[4]++;
               		}
               	}          
              	option = {
              			 title: {
                    			left: 'center',               		 
                    	        text: institutionName + '   持股变化',
                    	        subtext: roleId + ' 时期'
                    	    },	
                         legend: [{
                        	 top:40,
                             data: categories.map(function (a) {
                                 return a.name;
                             })
                         }],
                         force:{
                        	edgeLength:[20,80] 
                         },
                         animationDuration: 1500,
                         animationEasingUpdate: 'quinticInOut',
                         series: [{
                             type: 'graph',
                             layout: 'force',
                             force: {
                                 initLayout:'circular',
                                 edgeLength: 50,
                                 repulsion: 50,
                                 gravity: 0.2,
                                 layoutAnimation : true
                             },
                             data:nodeList,
                             lineStyle: {
                                 normal: {
                                     color: "target",
                                     width: 2,
                                     curveness: 0.3
                                 }
                             },
                             edges: edgeList,
                             // categories: category,
                             categories: categories,
                             edgeLabel: {
 								normal: {
 									show: true,
 									textStyle: {
 										fontSize: 14
 									},	
 								formatter:function(params){//触发之后返回的参数，这个函数是关
 										  if (params.data.info !=undefined) {//如果触发节点
 			               		              return  params.data.info;//返回标签
 			               		            }else {//如果触发边
 			               		              return  params.data.info;
 			               		            }	
 									}
 	               		          } 
 							},
                             focusNodeAdjacency: true,
                             roam: true,
                             label: {
                                 normal: {
                                     textStyle: {
                                         color: ["#327df8"],
                                         fontSize: 15
                                     },
                                     show: true,
                                     position: 'right',
                                     formatter: '{c}'
                                 }
                             },
                             edgeSymbol:['none', 'arrow'],
                         }]
                     };
                     myChart.setOption(option);
                     options = {
                     	    tooltip : {
                     	        trigger: 'item',
                     	        formatter: "{a} <br/>{b} : {c} ({d}%)"
                     	    },
                     	    
                     	    series : [
                     	        {
                     	            name: institutionName,
                     	            type: 'pie',
                     	            radius : '55%',
                     	            center: ['50%', '60%'],
                     	            data:[
                     	                {value:a[0], name:'新进'},
                     	                {value:a[1], name:'不变'},
                     	                {value:a[2], name:'退出'},
                     	                {value:a[3], name:'增持'},
                     	                {value:a[4], name:'减持'}
                     	            ],
                     	            itemStyle: {
                     	                emphasis: {
                     	                    shadowBlur: 10,
                     	                    shadowOffsetX: 0,
                     	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                     	                }
                     	            }
                     	        }
                     	    ]
                     	};
                       myChartTwo.setOption(options);
              }

         }) 	 
     }
   
     function selectRoleTwo() {
         var element = document.getElementById("roleIdTwo");
         var roleId = element.options[element.selectedIndex].value;
         var stockNum = "${company.stockNum}";            
         $.ajax({
          type: "POST",
          url: "ajaxSelectRoleTwo",
          data: {
          	"roleIdTwo":roleId,
			"stockNum":stockNum
          },
          dataType: "json",
          success: function(data) {
          	var topList = data.topList;	
       		var permissionHtml = "";
			for (var i = 0; i < topList.length; i++) {				
				 permissionHtml = permissionHtml
		           +'<tr class="gradeX" id="" style="height:35px">'
     			   +'<td style="border-left:1px solid;border-top:1px solid;width:30%;text-align:center">'
     	
     			   permissionHtml += '<a href="javascript:;" onclick="selectOutStock(\''+topList[i].institutionName+'\')">'+topList[i].institutionName+'</a></td>'
     			   permissionHtml +=
     			   '<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topList[i].holderNum+'</td>'
       			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topList[i].holderChange+'</td>'
       			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topList[i].stockPropotionRate+'</td>'
       			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topList[i].realIncrease+'</td>'
       			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'+topList[i].stockType+'</td>'
       			   +'<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">'
     			   if(topList[i].holderChange != '退出'){
     				  permissionHtml += '<a href="javascript:;" class="md-trigger btn btn-primary btn-sm" onclick="selectStockDetail(\''+topList[i].stockDetailId+'\',\''+topList[i].institutionName+'\',\''+'${company.stockName}'+'\')">查看详情</a></td></tr>';
                       /* onclick="selectStockDetail(\''+topCircuList[i].stockDetailId+'\',\''+topCircuList[i].institutionName+'\',\''+${company.stockName}+'\')">查看详情</ a></td></tr>';*/
     			   }else{
     				 permissionHtml += '';
     			   }  
		     $("#tbody2")[0].innerHTML = permissionHtml;    
			}
          } 
      }) 	   
     }
</script>
	<script>
	function closeDiv(){
		$("#modal-1").removeClass("md-show");
	}

	 //弹出得模态框得填充
     function selectStockDetail(roleId,institutionName,stockName){
    	 $("#modal-1").addClass("md-show");
    	 var myChartTwo = echarts.init(document.getElementById('myEchartTwo'));
         $.ajax({
          type: "POST",
          url: "ajaxSelectstockDetail",
          data: {
          	"roleId":roleId,
          },
          dataType: "json",
          success: function(data) {
          	var listDetail = data.listDetail;	
          	if(listDetail.length == 0){

          	}else{
          		var modalheadHtml ="";
          		modalheadHtml = institutionName+' 持有  '+stockName+' 详情';
          		$("#modalhead")[0].innerHTML = modalheadHtml; 
          		var permissionHtml = "";
  				for (var i = 0; i < listDetail.length; i++) {
  					 permissionHtml = permissionHtml
  					   +'<tr class="gradeX" id="" style="height:25px">'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:40%;text-align:center">'+listDetail[i].reportDate+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'+listDetail[i].stockNum+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'+listDetail[i].stockRate+'</td>'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'+listDetail[i].increase+'</td></tr>'
					$("#tbody3")[0].innerHTML = permissionHtml;    
  				}
  				var axisDetail = new Array();
  				var dataDetail = new Array();
  				for(var i = 0; i < listDetail.length; i++){
  					var s = listDetail[i].reportDate;
  					var v = listDetail[i].stockNum;
  					axisDetail[i] = s;
  					dataDetail[i] = v;
  				}
  				 option = {
  					    color: ['#3398DB'],
  					    tooltip : {
  					        trigger: 'axis',
  					        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
  					            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
  					        }
  					    },
  					    grid: {
  					        left: '3%',
  					        right: '4%',
  					        bottom: '3%',
  					        containLabel: true
  					    },
  					    xAxis : [
  					        {
  					            type : 'category',
  					            data : axisDetail,
  					            axisTick: {
  					                alignWithLabel: true
  					            }
  					        }
  					    ],
  					    yAxis : [
  					        {
  					            type : 'value',
  					            name: '持股数（万股）',
  					        }
  					    ],
  					    series : [
  					        {
  					            name:'持股数量',
  					            type:'bar',
  					            barWidth: '60%',
  					            data:dataDetail
  					        }
  					    ]
  					};
  			   myChartTwo.setOption(option);
  			
  			   /* $('modal-1').css('visibility','visible');
  			   $('modal-1').show(); */
          	}
          },
          error: function(XMLHttpRequest, textStatus, errorThrown) {
          	//这个error函数调试时非常有用，如果解析不正确，将会弹出错误框
          	alert(XMLHttpRequest.responseText); 
          alert(XMLHttpRequest.status);
          alert(XMLHttpRequest.readyState);
          alert(textStatus); // parser error;
          }   
      }) 	  
     }
</script>
</body>
</html>