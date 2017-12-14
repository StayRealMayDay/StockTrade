<%@page import="java.util.List"%>
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
<title>大宗交易</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- 于花蕾 2017年9月27 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
#search input {
	background:#FFF url(http://img02.taobaocdn.com/tps/i2/T122NIXoBAXXXXXXXX-200-200.png) 0 0 no-repeat;
}
#search {
	width:750px;
	margin:8px auto 0;
	border:1px solid #C4E6F1;
}
#search form {
	color:#666;
	border:2px solid #78B1C8;
}
#search ul {
	padding:10px 20px;
	vertical-align:top;
}
#search li {
	padding:5px 0;
	list-style:none;
	line-height:25px;
	zoom:1;
	
}
#search li:after {
	content:".";
	clear:both;
	display:block;
	height:0;
	visibility:hidden;
}
#search label, #search input, #search span {
	float:left;
}
#search .tit {
	width:80px;
	min-height:25px;
	height:25px;
}
#search .f-text {
	padding:3px;
	width:179px;
	height:25px;
	color:#666;
	line-height:18px;
	font-family:inherit;
	border-color:#AFAFAF #DCDCDC #DCDCDC #AFAFAF;
	border-width:0 1px 1px 0;
	background-position:0 -100px;
}
#search .f-btn {
	border:0;
	width:85px;
	height:31px;
	cursor:pointer;
}
#search .f-btn:hover {
	background-position:-86px 0;
}
</style>
<script src="<%=basePath %>/js/yui-min.js"></script>
<script>
YUI({
    modules: {
        'trip-calendar': {
            fullpath: 'js/trip-calendar.js',
            type    : 'js',
            requires: ['trip-calendar-css']
        },
        'trip-calendar-css': {
            fullpath: 'js/trip-calendar.css',
            type    : 'css'
        }
    }
}).use('trip-calendar', function(Y) {
    
    var oCal = new Y.TripCalendar({
        maxDate         : new Date,     //最小时间限制
        triggerNode     : '#J_DepDate', //第一个触节点
        finalTriggerNode: '#J_EndDate'  //最后一个触发节点
    }); 
    //校验
    Y.one('#J_Search').on('submit', function(e) {
        e.halt();
        var rDate    = /^((19|2[01])\d{2})-(0?[1-9]|1[012])-(0?[1-9]|[12]\d|3[01])$/;
            oDepDate = Y.one('#J_DepDate'),
            oEndDate = Y.one('#J_EndDate'),
            sDepDate = oDepDate.get('value'),
            sEndDate = oEndDate.get('value'), 
            aMessage = ['请选择开始日期', '请选择截至日期', '截至时间不能早于开始时间，请重新选择', '日期格式错误'],
            iError   = -1;   
            switch(!0) {
                case !sDepDate:
                    oDepDate.focus();
                    iError = 0;
                    break;
                case !rDate.test(sDepDate):
                    oDepDate.focus();
                    iError = 3;
                    break;
                case !sEndDate:
                    oEndDate.focus();
                    iError = 1;
                    break;
                case !rDate.test(sEndDate):
                    oEndDate.focus();
                    iError = 3;
                    break;
                case sDepDate.replace(/-/g, '') > sEndDate.replace(/-/g, ''):
                    oEndDate.focus();
                    iError = 2;
                    break;
            };
            if(iError > -1) {
                this.set('message', aMessage[iError]).showMessage();                
            }
            else {
              /*   alert('开始时间：' + sDepDate + '\n截至时间：' + sEndDate); */
                var myChart = echarts.init(document.getElementById('myEchart'));
                $.ajax({
                    type: "POST",
                    url: "ajaxSelectDzjyData",
                    data: {
                    	"startDate":sDepDate,
                    	"endDate":sEndDate
                    },
                    dataType: "json",
                    success: function(data) {
                    	var map = data.map2;
                    	option = {
                	     		title: {
                			    text: '某短时间内两市(沪市、深市)大宗交易总金额）'
                			    },
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
                    		            data : map.date,
                    		            axisTick: {
                    		                alignWithLabel: true
                    		            }
                    		        }
                    		    ],
                    		    yAxis : [
                    		        {
                    		            type : 'value'
                    		        }
                    		    ],
                    		    series : [
                    		        {
                    		            name:'累计成交金额',
                    		            type:'bar',
                    		            barWidth: '60%',
                    		            data:map.sumMap
                    		        }
                    		    ]
                    		};
            				 myChart.setOption(option);
                    	} 
                }) 	     
            }
    }, oCal);
});
</script>
</head>

<!-- <script type="text/javascript" src="js/jquery.js"></script> -->
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/echarts.min.js"></script>
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />
	<div >
		<div class="secondary" style="width:95%">
			<div class="row">
				<div id="content" class="col-lg-12">
					<!-- <div class="row">
						<div class="col-sm-12">							
								<ul class="breadcrumb">
									<li><i class="fa fa-home"></i> <a href="index.html">沪深股票</a>
									</li>
									<li><a href="adminSelectAllNews?pageNum=1">沪深A股</a></li>
									<li>所有股票列表</li>
								</ul>
								/BREADCRUMBS
						</div>
					</div> -->
					<div>
						<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px;margin-left:120px">个股大宗交易----The All</div>
						<div class="col-md-11 agileinfo_news_original_grids_center">
							<table style="width: 100%; border: 1px solid #000000; text-align: center;margin:10px 0px 10px 150px" class="table table-striped table-hover">
								<thead>
								<tr>
									<th style="text-align: center;padding:0px">序号</th>
									<th style="text-align: center">交易时间</th>
									<th style="text-align: center">股票代码</th>
									<th style="text-align: center">股票简称</th>
									<th style="text-align: center">最新价格</th>
									<th style="text-align: center">成交价格</th>
									<th style="text-align: center">成交量(万股)</th>
									<th style="text-align: center">溢价率</th>
									<th style="text-align: center">买方营业部</th>
									<th style="text-align: center">卖方营业部</th>
								</tr>
								</thead>
								<tbody id="tbody2">
									<c:forEach items="${dzjyList}" var="all" varStatus= "idx">
										<tr>	
											<td>${idx.index} </td>
											<td>${all.transactionDate}</td>
											<td><a href="company?stockNum=${all.stockId}">${all.stockId}</a></td>
											<td><a href="company?stockNum=${all.stockId}">${all.stockName}</a></td>
											<td>${all.latestPrice }</td>
											<td>${all.dealPrice }</td>
											<td>${all.dealNum }</td>
											<td>${all.premiumRate }</td>
											<td>${all.purchasingDepartment}</td>
											<td>${all.salesDepartment}</td>
										</tr>
									</c:forEach>	
								</tbody>
							</table>
						</div>
	
						<div class="row">
							<div class="col-sm-10" style="margin-left:180px;height:90px">
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
													${pager.pageNum } 页</a>
											</li>
										</ul>
										<ul class="pagination">
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="dzjy?pageNum=1">首页</a></li>
											<li ${pager.pageNum==1?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageNum-1 }">上页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageNum+1 }">下页</a></li>
											<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
												href="dzjy?pageNum=${pager.pageCount }">末页</a></li>
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
					<div class="clearfix"></div>
					<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px;margin-left:120px">两市(沪市、深市)大宗交易总数</div>
					<div style="margin-left:120px">
						<div id="search">
						  <form id="J_Search" target="_blank">
						    <ul>
						      <li style="float:left;margin-right:10px">
						        <label class="tit" for="J_DepDate">开始日期：</label>
						        <input id="J_DepDate" type="text" class="f-text" value="" />
						      </li>
						      <li style="float:left;margin-right:10px">
						        <label class="tit" for="J_EndDate">截止日期：</label>
						        <input id="J_EndDate" type="text" class="f-text" value="" />
						      </li>
						      <li>
						        <label class="tit"></label>
						        <input id="J_search_btn" type="submit" class="f-btn" value="" />
						      </li>
						    </ul>
						  </form>
						</div>
						<!-- 用于展示柱状图 -->
						<div id="myEchart" style="height:350px;width:100%px;border:1px solid"></div>
						
						<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:100%">
							<tr style="height:35px;background-color:#EBEBEB"> 
								<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">交易时间</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">累计成交金额(万元)</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">溢价成交金额(万元)</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">溢价成交比例</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">折价成交金额(万元)</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">折价成交比例</th>
								<th style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">最大成交额个股</th>
								<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">成交金额(万元)</th>
							</tr>
							<tbody id="tbody2">
								<c:forEach begin="0" end="9" step="1" varStatus="status">
									<tr class="gradeX" id="" style="height:35px">
		       							<td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">${topDatelist.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${topDzjySum.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${addDzjySum.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${addRate.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${lowDzjySum.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${lowRate.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">${topDzjySum.get(status.index)}</td>
								        <td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${topDzjySum.get(status.index)}</td>
								    </tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px;margin:10px auto auto 120px">大宗交易活跃营业部一览</div>
					<div>
						<div style="margin:10px auto auto 120px;width:820px;height:350px;float:left" id="graphPurse"></div> <!-- ehchart图 -->
						<div style="margin:10px auto auto 30px;float:left;width:820px;height:350px" id="graphSale"></div> 
					</div>
					<div class="clearfix"></div>
					<div>
						<div style="margin:10px auto auto 120px;float:left">
							<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:820px">
								<tr style="height:35px;background-color:#EBEBEB"> 
									<th style="border-left:1px solid;border-top:1px solid;width:40%;text-align:center">营业部</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">身份界定</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日活跃次数</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日成交股票数量</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日成交股票金额</th>
								</tr>
								<tbody id="tbody2">
									<c:forEach items="${mapResult1}" var="mymap" begin="0" end="14" step="1" varStatus="status" > 
										<tr style="height:35px;">
											<td style="border-left:1px solid;border-top:1px solid;width:40%;text-align:center"><c:out value="${mymap.key}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">买方</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap.value.get(0)}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap.value.get(1)}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap.value.get(2)}" /></td>
										</tr>
									</c:forEach> 
								</tbody>
							</table>
						</div>
						<div style="margin:10px auto auto 30px;float:left">
							<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:830px">
								<tr style="height:35px;background-color:#EBEBEB">  
									<th style="border-left:1px solid;border-top:1px solid;width:40%;text-align:center">营业部</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">身份界定</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日活跃次数</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日成交股票数量</th>
									<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">近10日成交股票金额</th>
								</tr>
								<tbody id="tbody2">
									<c:forEach items="${mapResult2}" var="mymap2" begin="0" end="14" step="1" varStatus="status" > 
										<tr style="height:35px;">
											<td style="border-left:1px solid;border-top:1px solid;width:40%;text-align:center"><c:out value="${mymap2.key}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">卖方</td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap2.value.get(0)}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap2.value.get(1)}" /></td>
											<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><c:out value="${mymap2.value.get(2)}" /></td>
										</tr>
									</c:forEach> 
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>	
</body>
<script type="text/javascript">
	   // 基于准备好的dom，初始化echarts实例
       var myChart = echarts.init(document.getElementById('myEchart'));
       $.getJSON('dzjySum', function (data) {
       		option = {
	     		title: {
			    text: '某短时间内两市(沪市、深市)大宗交易总金额'
			    },
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
    		            data : data.date,
    		            axisTick: {
    		                alignWithLabel: true
    		            }
    		        }
    		    ],
    		    yAxis : [
    		        {
    		            type : 'value'
    		        }
    		    ],
    		    series : [
    		        {
    		            name:'累计成交金额',
    		            type:'bar',
    		            barWidth: '60%',
    		            data:data.sumMap
    		        }
    		    ]
    		};
       		myChart.setOption(option);
       });
</script>
<script type="text/javascript">
var myChart2 = echarts.init(document.getElementById('graphPurse'));
var allthing = ${map1};
var listkey = new Array();
var listvalueOne = new Array();
var listvalueTwo = new Array();
var listvalueThree = new Array();
var allOne = allthing.map1;
var i = 0;
for(key in allOne)
{	
	listkey[i] = key;
	listvalueOne[i] = allOne[key][0];
	listvalueTwo[i] = allOne[key][1];
	listvalueThree[i] = allOne[key][2];
	i++;	
}
option = {
	title: {
    	text: '买方营业部活跃度排名'
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType: {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
    	  data:['近10日活跃次数','近10日成交股票数量','近10日成交股票金额']
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
            data : listkey,
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'近10日活跃次数',
            type:'bar',
            data:listvalueOne
        },
        {
            name:'近10日成交股票数量',
            type:'bar',
            data:listvalueTwo
        },{
            name:'近10日成交股票金额',
            type:'bar',
            data:listvalueThree
        }
    ]
};
	myChart2.setOption(option);
</script>
<script>
var myChart3 = echarts.init(document.getElementById('graphSale'));
var allthing = ${map2};
var listkey = new Array();
var listvalueOne = new Array();
var listvalueTwo = new Array();
var listvalueThree = new Array();
var allOne = allthing.map2;
var i = 0;
for(key in allOne)
{	
	listkey[i] = key;
	listvalueOne[i] = allOne[key][0];
	listvalueTwo[i] = allOne[key][1];
	listvalueThree[i] = allOne[key][2];
	i++;	
}
option = {
		title: {
	    	text: '卖方营业部活跃度排名'
	    },
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    toolbox: {
	            show : true,
	            feature : {
	                mark : {show: true},
	                dataView : {show: true, readOnly: false},
	                magicType: {show: true, type: ['line', 'bar']},
	                restore : {show: true},
	                saveAsImage : {show: true}
	            }
	        },
		    legend: {
		        data:['近10日活跃次数','近10日成交股票数量','近10日成交股票金额']
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
		            data : listkey,
		            axisTick: {
		                alignWithLabel: true
		            }
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'近10日活跃次数',
		            type:'bar',
		            data:listvalueOne
		        },
		        {
		            name:'近10日成交股票数量',
		            type:'bar',
		            data:listvalueTwo
		        },{
		            name:'近10日成交股票金额',
		            type:'bar',
		            data:listvalueThree
		        }
		    ]
		};
	myChart3.setOption(option);
</script>
</html>