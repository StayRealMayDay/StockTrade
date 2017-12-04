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
<title>大宗交易</title>
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
				<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px">大宗交易</div>
					<div style="display:block;margin:10px">
						<label style="width: 10%">选择日期：</label> 
						<select style="width:30%;height: 32px" id="roleId" onchange="selectRole()"> 
				           <c:forEach items="${holderDate}" var="date">
				           		<option value="${date}">${date}</option> 
				           </c:forEach>
			          	</select>
					</div>
					<table style="width: 100%; border:1px solid #000000; text-align: center;margin-top:5px">
						<thead>
						<tr style="height:35px;background-color:#EBEBEB">
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">序号</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">交易时间</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">股票代码</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">股票简称</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">最新价格</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">成交价格</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">成交量(万股)</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">溢价率</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">买方营业部</th>
							<th style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">卖方营业部</th>
						</tr>
						</thead>
						<tbody id="tbody2">
							<c:forEach items="${DzjyList}" var="all" varStatus= "idx">
								<tr class="gradeX" id="" style="height:35px">	
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${idx.index} </td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.transactionDate}</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><a href="company?stockNum=${all.stockId}">${all.stockId}</a></td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center"><a href="company?stockNum=${all.stockId}">${all.stockName}</a></td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.latestPrice }</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.dealPrice }</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.dealNum }</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.premiumRate }</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.purchasingDepartment}</td>
									<td style="border-left:1px solid;border-top:1px solid;width:10%;text-align:center">${all.salesDepartment}</td>
								</tr>
							</c:forEach>	
						</tbody>
					</table>
				</div>
			</div>
		</div>
			<!-- <div class="company_holder"  style="border:1px solid #EBEBEB;border-top:10px">
				<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px">十大流动股东</div>
				<div style="margin:10px">
					
				</div>
			</div> -->
			<!-- 	
			<div class="company_holder"  style="border:1px solid #EBEBEB">
				<div class="title" style="height:40px;border:1px solid;background-color:#D4D4D4;padding:6px">十大股东</div>
				<div style="margin:10px">
					
				</div>
				
			</div> -->
					
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
<script src="<%=basePath %>/js/bootstrap.min.js "></script>
<!-- <script>
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
 			/* var first = mapList.listInfo[0];
 			var second = mapList.listInfo[1];
 			var third = mapList.listInfo[2]; */
 			
          	if(topCircuList.length == 0){
          	}else{	
          		$("#threeInfor")[0].innerHTML = threeInforHtml;    
          		var permissionHtml = "";
  				for (var i = 0; i < topCircuList.length; i++) {
  					 permissionHtml = permissionHtml
  					   +'<tr class="gradeX" id="" style="height:35px">'
          			   +'<td style="border-left:1px solid;border-top:1px solid;width:30%;text-align:center">'
          			   if(topCircuList[i].holderChange == '退出'){
          				 permissionHtml += '<a href="javascript:;" onclick="selectOutCircuStock(\''+topCircuList[i].institutionName+'\')">'+topCircuList[i].institutionName+'</a></td>'
          			   }else{
          				 permissionHtml += topCircuList[i].institutionName+'</td>';  
          			   }  
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
 </script> -->
</body>
</html>