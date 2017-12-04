<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询成果</title>
<meta name="description"
	content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<jsp:include page="/head.jsp" flush="true" />
</head>

<body>
	<%-- <jsp:include page="/header1.jsp" flush="true"/> --%>
	<!-- page-intro start-->
	<!-- ================ -->
	<div class="page-intro">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">
						<li><i class="fa fa-home pr-10"></i><a
							href="/vcevaluation/toIndex">Home</a></li>
						<li><a href="/vcevaluation/selectResult">查询成果</a></li>
						<li class="active">成果展示</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	<!-- page-intro end -->
	<!-- typography page -->
	<div class="typography">

		<!-- container-wrap -->
		<div class="container">
		<jsp:include page="/ad_left.jsp" flush="true" />
			<div class="grid_3 grid_5">

				<h3 class="hdg" style="font-family: \5FAE\8F6F\96C5\9ED1">成果查询</h3>
				<label>按照成果类型：</label> <select name="jumpMenu" id="resultType">
					<option value="所有成果">所有成果</option>
					<option value="样机">样机</option>
					<option value="软件">软件</option>
					<option value="专利">专利</option>
					<option value="论文">论文</option>
				</select> &nbsp;&nbsp;&nbsp; <label>按照成果评审状态：</label> <select name="jumpMenu"
					id="resultFlag">
					<option value="评审通过">所有成果</option>
					<option value="评审通过">评审通过</option>
					<option value="评审失败">评审失败</option>
				</select> &nbsp;&nbsp;&nbsp; <label>按照成果名称：</label> <input id="resultName"
					type="text" placeholder="请输入成果名称">
				<ul class="drop_ul"
					style="float: right; margin-right: 35%; display: none">
					<!-- <li class="drop_li">1</li>
						<li class="drop_li">2</li> -->
				</ul>
				<!--  <a href="#"
							class="btn btn-default btn-sm">搜索</a> -->
				<br> <label>按照评审日期：</label> (从) <input id="dateTimeStart"
					style="height: 10%" type="date" name="bday"> (到) <input
					id="dateTimeEnd" type="date" name="bday">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<button class="btn btn-default btn-sm" id="searchLogs">搜索</button>
				<br>
				<table class="table table-hover" style="width:75%">
					<thead>
						<tr>
							<th>成果类型</th>
							<th>成果名称</th>
							<th>成果提供者</th>
							<th>成果提交时间</th>
							<th>评估状态</th>
							<th>评估次数</th>
							<th>评估均值</th>
							<th>评估截止日期</th>
							<th>更多</th>
						</tr>
					</thead>
					<tbody class="tbody">

					</tbody>
				</table>
			</div>
			<!-- pagination start -->
			<ul class="pagination" style="text-align: center;">

				<li><a href="#">共 ${pager.recordCount } 条数据，每页
						${pager.pageSize } 条，共 ${pager.pageCount } 页，当前是第 ${pager.pageNum }
						页</a></li>

			</ul>

			<ul class="pagination">

				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="ad_resultsManage?pageNum=1">首页</a></li>
				<li ${pager.pageNum==1?'class="disabled"':''}><a
					href="ad_resultsManage?pageNum=${pager.pageNum-1 }">上页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="ad_resultsManage?pageNum=${pager.pageNum+1 }">下页</a></li>
				<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a
					href="ad_resultsManage?pageNum=${pager.pageCount }">末页</a></li>
				<li><a>转到 </a></li>
				<li><a><input id="changePage" type="text"
						style="width: 35px; padding: 0px; margin: -3px;" /></a></li>
				<li><a>页 </a></li>
				<li><a href="javascript:goPage();">跳转</a></li>

			</ul>
			<!-- pagination end -->
			<br> <br>

		</div>
		<!-- //container-wrap -->
	</div>
	<!-- //typography -->

	<!-- footer section -->
	<jsp:include page="/footer1.jsp" flush="true" />
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
	</script>
	<script type="text/javascript">
		//1.页面打开时自动执行加载的数据
		window.onload = function() {
			var resultType = $('#resultType option:selected').val();
			//alert(resultType);
			var resultFlag = $('#resultFlag option:selected').val();
			//alert(resultFlag);
			var resultName = $('#resultName').val();
			//alert(resultName);
			var reg = /[a-zA-Z]/g;
			var dateTimeStart = $("#dateTimeStart").val().replace(reg, " ");
			//alert(dateTimeStart);
			var dateTimeEnd = $("#dateTimeEnd").val().replace(reg, " ");
			$.ajax({
				type : "GET", //type：(string)请求方式，POST或GET        
				url : "ad_resultsManage",//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
				/*data:{
					resultType:resultType,
					resultFlag:resultFlag,
					resultName:resultName,
					dateTimeStart:dateTimeStart,
					dateTimeEnd:dateTimeEnd
					
				}, */
				success : function(jsonArray) {
					//alert(111);
					jsonObject = eval("(" + jsonArray + ")");
					//alert(jsonObject);
					jsonObjectLength = jsonObject.length;
					//alert(jsonObjectLength);
					var str = "";

					for (var i = 0; i < jsonObjectLength; i++) {
						var resultType = "";
						if(jsonObject[i].res_type==1){
							resultType = "论文成果";
						}else if(jsonObject[i].res_type==2){
							resultType = "专利成果";
						}else{
							resultType = "软件成果";
						} 
						var resultEva = "";
						if(jsonObject[i].res_flag==1){
							resultEva = "待评估";
						}else{
							resultEva = "评估已截止";
						}
						    str += "<tr><td>" + resultType
								+ "</td><td>" + jsonObject[i].res_name
								+ "</td><td>" + jsonObject[i].res_provider
								+ "</td><td>" + jsonObject[i].res_protime
								+ "</td><td>" + resultEva
								+ "</td><td>" + jsonObject[i].res_times
								+ "</td><td>" + jsonObject[i].res_evalue
								+ "</td><td>" + jsonObject[i].res_eva_deadline
								+ "</td><td><a href='resultItem1?res_id=" +jsonObject[i].res_id + "'>查看更多</a></td></tr>";
					}
					//alert(str);
					$(".tbody").html(str);

				}
			});

		}
		/* //点击查询按钮时进行异步刷新的数据
		$("#searchLogs").click(function () {    	
			var resultType = $('#resultType option:selected').val();
			alert(resultType);
			var resultFlag = $('#resultFlag option:selected').val();
			alert(resultFlag);
			var resultName = $('#resultName').val();
			alert(resultName);
			var reg = /[a-zA-Z]/g;  	
			var dateTimeStart = $("#dateTimeStart").val().replace(reg," ");
			//alert(dateTimeStart);
			var dateTimeEnd = $("#dateTimeEnd").val().replace(reg," ");
			//alert(dateTimeEnd);
		    $.ajax({
		        type: "GET",        //type：(string)请求方式，POST或GET        
		        url: "ad_resultsManage",//url：(string)发送请求的地址，可以是服务器页面也可以是WebService动作。
				data:{
					resultType:resultType,
					resultFlag:resultFlag,
					resultName:resultName,
					dateTimeStart:dateTimeStart,
					dateTimeEnd:dateTimeEnd
				},
		        success:function(jsonArray) {
					
		        	jsonObject = eval("(" + jsonArray + ")");
					//alert(jsonObject);
					jsonObjectLength = jsonObject.length;
		            var str = "";
		            for (var i = 0 ; i < jsonObjectLength ; i++) {
		                str += "<tr><td>" + jsonObject[i].res_type + "</td><td>" + jsonObject[i].res_name + "</td><td>"
		                + jsonObject[i].res_provider + "</td><td>" + jsonObject[i].res_protime + "</td><td>" + jsonObject[i].res_flag +"</td><td>" + 
		                jsonObject[i].res_times+  + jsonObject[i].res_evalue +"</td><td>"  + jsonObject[i].res_eva_deadline +"</td><td>"+"<a>"jsonObject[i].res_id +"</a></td></tr>";
		               
		            }
		            //alert(str);
		            $(".tbody").html(str);
		            
		        }
		    });
		}); */
	</script>
	<!-- /footer section -->

</body>
</html>