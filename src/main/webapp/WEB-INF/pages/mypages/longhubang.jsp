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
<title>龙虎榜单</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />


<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />
<link href="<%=basePath %>/css/bootstrap.css" rel="stylesheet"type="text/css" media="all" />
<link href="<%=basePath %>/css/style.css" rel="stylesheet"type="text/css" media="all" />
<link class="include" rel="stylesheet" type="text/css" href="<%=basePath %>/css/jquery.jqplot.css" />
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<link href="<%=basePath %>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<script src="<%=basePath %>/js/jquery.flot.min.js" type="text/javascript"></script>
<script src="<%=basePath %>/js/jquery.flot.animator.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/css/cloud-admin.css" >
<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/themes/default.css" id="skin-switcher" >
<link rel="stylesheet" type="text/css"  href="<%=basePath%>/static/adStyle/css/responsive.css" >

<link href="<%=basePath%>/static/adStyle/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<!-- JQUERY UI-->
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/jquery-ui-1.10.3.custom/css/custom-theme/jquery-ui-1.10.3.custom.min.css" />
<!-- DATE RANGE PICKER -->
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker-bs3.css" />
<!-- DATA TABLES -->
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/css/jquery.dataTables.min.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/media/assets/css/datatables.min.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/css/TableTools.min.css" />
<link href="<%= basePath%>/static/media/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace.min.css" />
<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="<%= basePath%>/static/media/assets/css/ace-skins.min.css" />
<script src="<%= basePath%>/static/media/assets/js/ace-extra.min.js"></script>
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />
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
<script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
<link rel=stylesheet type=text/css href="<%= basePath%>/static/uStyle/css/lrtk.css">
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

<script type="text/javascript">
//init method one 
$(document).ready(function(){ 
trace("初始化方法进入"); 
$("#myTabContent").css('display','block'); 

}); 
function trace(obj){ 
console.log(obj); 
}

</script>
<!-- 于花蕾 2017年１２月１４ -->
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
select {
   display: block !important; 
}
</style>
<script src="<%=basePath %>/js/yui-min.js"></script>
</head>
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />
	<div >
		<div class="agileinfo_news_original_grids">
			<div class="col-md-12 agileinfo_news_original_grids_left">
				<div id="content" class="col-lg-12">
					<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px;margin-left:120px">今日龙虎榜详情</div>
					<div style="margin-left:300px">
						<div id="search">
						  <form id="J_Search" target="_blank">
						    <ul>
						      <li style="float:left;margin-right:10px">
						        <label class="tit" for="J_DepDate">查询日期：</label>
						        <input id="J_DepDate" type="text" class="f-text" value="" />
						      </li>
						      <li>
						        <label class="tit"></label>
						        <input id="J_search_btn" type="submit" class="f-btn" value="" />
						      </li>
						    </ul>
						  </form>
						</div>			
						<table class="tbody" style="border-right:1px solid;border-bottom:1px solid;width:90%">
							<tr style="height:35px;background-color:#EBEBEB"> 
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">交易时间</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">股票名称</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">股票代码</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">净买入额(万元)</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">净买入额/总成交额</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">收盘价</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">涨跌幅</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">上榜原因</th>
							</tr>
							<tbody id="tbody2">
								<c:forEach items="${latestInfo }" var="info">
									<tr class="gradeX" id="" style="height:35px">
		       							<td style="border-left:1px solid;border-top:1px solid;text-align:center">${info.date}</td>
								        <td style="border-left:1px solid;border-top:1px solid;text-align:center"><a href="company?stockNum=${info.stockId}">${info.stockId}</a></td>
								        <td style="border-left:1px solid;border-top:1px solid;text-align:center"><a href="company?stockNum=${info.stockId}">${info.stockName}</a></td>
								        <c:choose>
									        <c:when test="${fn:startsWith(info.netPurchase,'-')}"> 
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">${info.netPurchase}</td>
									        </c:when>
									        <c:otherwise>
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">${info.netPurchase}</td>
									        </c:otherwise>		
								        </c:choose> 
								        <c:choose>
									        <c:when test="${fn:startsWith(info.netTotalturnover,'-')}"> 
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">${info.netTotalturnover}%</td>
									        </c:when>
									        <c:otherwise>
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">${info.netTotalturnover}%</td>
									        </c:otherwise>		
								        </c:choose>						      
								        <td style="border-left:1px solid;border-top:1px solid;text-align:center">${info.closePrice}</td>
								        <c:choose>
									        <c:when test="${fn:startsWith(info.quoteChange,'-')}"> 
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">${info.quoteChange}%</td>
									        </c:when>
									        <c:otherwise>
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">${info.quoteChange}%</td>
									        </c:otherwise>		
								        </c:choose>	
								        <td style="border-left:1px solid;border-top:1px solid;text-align:center">${info.listReason}</td>
								    </tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px;margin:10px auto auto 120px">三日龙虎榜单详情</div>
					<div style="margin-left:300px">	
						<div style="display:block;margin:10px">
							<span style="width: 15%;height:32px;float:left">选择所要查询的日期范围：</span> 
							<select style="width:10%;height: 32px;float:left" id="roleId" onchange="selectRole()"> 
					           	<option value="3">3日</option>
					           	<option value="5">5日</option>
					           	<option value="10">10日</option>
					           	<option value="30">1个月</option>
					           	<option value="60">2个月</option>
					           	<option value="90">3个月</option>
					           	<option value="120">6个月</option>
				          	</select>				       
						</div>
						<div class="box border purple" style="width:90%">
						<div class="box-title">
							<h4><i class="fa fa-table"></i>默认情况下，显示三日内榜单</h4>
							<div class="tools hidden-xs">
								<a href="#box-config" data-toggle="modal" class="config">
									<i class="fa fa-cog"></i>
								</a>
								<a href="javascript:;" class="reload">
									<i class="fa fa-refresh"></i>
								</a>
								<a href="javascript:;" class="collapse">
									<i class="fa fa-chevron-up"></i>
								</a>
								<a href="javascript:;" class="remove">
									<i class="fa fa-times"></i>
								</a>
							</div>
						</div>
					<div class="box-body">
						<table id="datatable1" cellpadding="0" cellspacing="0" border="0" class="datatable table table-striped table-bordered table-hover">
							<thead>
								<tr style="height:35px;background-color:#EBEBEB"> 
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">股票名称</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">上榜次数</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">3日龙虎榜买入额</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">3日龙虎榜卖出额</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">3日净买入</th>
								<th style="border-left:1px solid;border-top:1px solid;text-align:center">净买入/总成交额</th>
							</tr>
							</thead>
							<tbody id="tbody3">
							<c:forEach items="${threeMoneylist}" var="mymap" varStatus="status">
								<tr class="gradeX" id="" style="height:35px">
	       							<td style="border-left:1px solid;border-top:1px solid;text-align:center"><a href=""><c:out value="${mymap.key}"/></a></td>
							        <td style="border-left:1px solid;border-top:1px solid;text-align:center"><c:out value="${mymap.value[0]}次"/></td>
							        <td style="border-left:1px solid;border-top:1px solid;text-align:center"><c:out value="${mymap.value[1]}"/></td>				      
							        <td style="border-left:1px solid;border-top:1px solid;text-align:center"><c:out value="${mymap.value[2]}"/></td>
							         <c:choose>
									        <c:when test="${fn:startsWith(mymap.value[3],'-')}"> 
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900"><c:out value="${mymap.value[3]}"/></td>
									        </c:when>
									        <c:otherwise>
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717"><c:out value="${mymap.value[3]}"/></td>
									        </c:otherwise>		
								        </c:choose>	
							        <c:choose>
									        <c:when test="${fn:startsWith(mymap.value[5],'-')}"> 
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900"><c:out value="${mymap.value[5]}"/></td>
									        </c:when>
									        <c:otherwise>
									        	<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717"><c:out value="${mymap.value[5]}"/></td>
									        </c:otherwise>		
								        </c:choose>								        
							    
							    </tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
					</div>
					<div class="title" style="height:40px;border:1px solid;background-color:#4DA0CE;padding:6px;margin:10px auto 10px 120px">五日龙舞榜单详情</div>
				</div>
			</div>
		</div>
	</div>	
</body>
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
    }); 
    //校验
    Y.one('#J_Search').on('submit', function(e) {
        e.halt();
        var rDate    = /^((19|2[01])\d{2})-(0?[1-9]|1[012])-(0?[1-9]|[12]\d|3[01])$/;
            oDepDate = Y.one('#J_DepDate'),
            sDepDate = oDepDate.get('value'),
            aMessage = ['请选择开始日期', '请选择截至日期','截至时间不能早于开始时间，请重新选择' , '日期格式错误'],
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
            };
            if(iError > -1) {
                this.set('message', aMessage[iError]).showMessage();                
            }
            else {
               $.ajax({
                   type: "POST",
                   url: "ajaxSelectSomeData",
                   data: {
                   	"startDate":sDepDate,
                   },
                   dataType: "json",
                   success: function(data) {
                   	var someData = data.someData;
                   	var permissionHtml = "";
       				for (var i = 0; i < someData.length; i++) {  
       					 permissionHtml = permissionHtml
       					   +'<tr class="gradeX" id="" style="height:35px">'
               			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+someData[i].date+'</td>'
               			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center"><a>'+someData[i].stockId+'</a></td>'
               			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center"><a>'+someData[i].stockName+'</td>'
               			 if((someData[i].netPurchase).startsWith("-")){
           				  permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">'+someData[i].netPurchase+'</td>'                    
           			     }else{
           				  permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">'+someData[i].netPurchase+'</td>';
           			     }
               			 if((someData[i].netTotalturnover).startsWith("-")){
               				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">'+(someData[i].netTotalturnover).substring(0,4)+'%</td>'                   
               			 }else{
               				permissionHtml +=  '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">'+(someData[i].netTotalturnover).substring(0,4)+'%</td>'
               			 }
               			 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+someData[i].closePrice+'</td>'
               			if((someData[i].quoteChange).startsWith("-")){
              				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">'+(someData[i].quoteChange).substring(0,4)+'%</td>'                   
              			 }else{
              				permissionHtml +=  '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">'+(someData[i].quoteChange).substring(0,4)+'%</td>'
              			 } 
               			permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+someData[i].listReason+'</td></tr>'
     					$("#tbody2")[0].innerHTML = permissionHtml;    
       				}
                   } 
               })  
            } 
    }, oCal);
});

function selectRole() {
    var element = document.getElementById("roleId");
    var roleId = element.options[element.selectedIndex].value;           

    $.ajax({
     type: "POST",
     url: "ajaxSelectlgb",
     data: {
     	"roleId":roleId,
     },
     dataType: "json",
     success: function(data) {
   	    var mapList = data.threeMoneylist;
   	    var listkey = new Array();
      	var listvalueOne = new Array();
    	var listvalueTwo = new Array();
   	    var listvalueThree = new Array();
	  	 for(key in mapList)
	  	{	
	  		listkey[i] = key;
	  		listvalueOne[i] = mapList[key][0];
	  		listvalueTwo[i] = mapList[key][1];
	  		listvalueThree[i] = mapList[key][2];
	  		listvalueFour[i] = mapList[key][3];
	  		listvalueFive[i] = mapList[key][5];
	  		i++;	
	  	}	
     	if(mapList.length == 0){
     	}else{	
     		var permissionHtml = "";
			for (var i = 0; i < topCircuList.length; i++) {
				 permissionHtml = permissionHtml
				   +'<tr class="gradeX" id="" style="height:35px">'
    			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center"><a href="">'+listkey[i]+'</td>'
    			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+listvalueOne[i]+'</td>'
    			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+listvalueTwo[i]+'</td>'
    			   +'<td style="border-left:1px solid;border-top:1px solid;text-align:center">'+listvalueThree[i]+'</td>'
    			   if(listvalueFour[i].startsWith("-")){
      				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">'+listvalueFour[i]+'</td>'
      			   }else{
      				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">'+listvalueFour[i]+'</td>';  
      			   }  
				  if(listvalueFive[i].startsWith("-")){
      				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#009900">'+listvalueFive[i]+'</td>'
      			   }else{
      				 permissionHtml += '<td style="border-left:1px solid;border-top:1px solid;text-align:center;color:#D81717">'+listvalueFive[i]+'</td>';  
      			   } 
			$("#tbody3")[0].innerHTML = permissionHtml;    
			}
     	}
     }
 }) 	   
}

</script>
	<script src="<%=basePath%>/static/adStyle/js/jquery/jquery-2.0.3.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/bootstrap-dist/js/bootstrap.min.js"></script>
    <script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/moment.min.js"></script>
	<script src="<%=basePath%>/static/adStyle/js/bootstrap-daterangepicker/daterangepicker.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-slimScroll-1.3.0/slimScrollHorizontal.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-BlockUI/jquery.blockUI.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/media/assets/js/datatables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/TableTools.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/datatables/extras/TableTools/media/js/ZeroClipboard.min.js"></script>
	<!-- COOKIE -->
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/jQuery-Cookie/jquery.cookie.min.js"></script>
	<!-- CUSTOM SCRIPT -->
	<script src="<%=basePath%>/static/adStyle/js/script.js"></script>
	<script type="text/javascript" src="<%=basePath%>/static/adStyle/js/my.js"></script>
	<script>
		jQuery(document).ready(function() {		
			App.setPage("dynamic_table");  //Set current page
			App.init(); //Initialise plugins and elements
		});
	</script>
	<script src="<%=basePath %>/js/bootstrap.min.js"></script>
</html>