<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查询所有样机</title>
<meta name="description" content="iDea a Bootstrap-based, Responsive HTML5 Template">
<meta name="author" content="htmlcoder.me">

<!-- Mobile Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<jsp:include page="/head.jsp" flush="true"/>
</head>

<body>
<script>
/* window.onload = function(){ 
	location.reload();
} 
 */
</script>
<jsp:include page="/header1.jsp" flush="true"/>
	
			<!-- page-intro start-->
			<!-- ================ -->
			<div class="page-intro">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<ol class="breadcrumb">
								<li><i class="fa fa-home pr-10"></i><a href="/vcevaluation/toIndex">Home</a></li>
								<li class="active">查看所有样机</li>
							</ol>
						</div>
					</div>
				</div>
			</div>
			<!-- page-intro end -->

			<!-- main-container start -->
			<!-- ================ -->
			<section class="main-container">

				<div class="container">
					<div class="row">

						<!-- main start -->
						<!-- ================ -->
						<div class="main col-md-12">

							<!-- page-title start -->
							<!-- ================ -->
							<h1 class="page-title">样机展示</h1>
							<div class="separator-2"></div>
							
							<!-- isotope filters start -->
							<div class="filters">
								<ul class="nav nav-pills">
									<li class="active"><a href="#" data-filter="*">全部样机</a></li>
									<li><a href="#" data-filter=".1">待评估样机</a></li>
									<li><a href="#" data-filter=".2">评估截止样机</a></li>
								</ul>
							</div>
							<!-- isotope filters end -->
							
							<!-- page-title end -->
							

							<!-- portfolio items start -->
							<div class="image-boxes isotope-container row">
							<c:forEach items="${results}" var="result">
								<div class="col-md-3 col-sm-6 isotope-item ${result.res_flag}">
									<div class="image-box">
										<div class="overlay-container">
										<c:if test="${resultImagemap[result.res_id]== null}">
										    <img style="max-width:260.5px; max-height:166px;" src="<%= basePath%>/static/adStyle/global/img/member_270x210.jpg" id="${status.index+1}"  alt="">
										</c:if>
										<c:if test="${resultImagemap[result.res_id]!= null}">
											<img style="max-width:260.5px; max-height:166px;" src="<%= basePath%>/static/adStyle/img/${resultImagemap[result.res_id]}" id="${status.index+1}"  alt="">
										</c:if>
											<%-- <img src="<%= basePath%>/images/${allpro1.pro_type}" alt=""> --%>          <!-- 写到这里 -->
											<div class="overlay">
												<div class="overlay-links">
													<a href=""><i class="fa fa-link"></i></a>
													<c:if test="${resultImagemap[result.res_id]== null}">
													<a href="<%= basePath%>/static/adStyle/global/img/member_270x210.jpg"   class="popup-img"><i class="fa fa-search-plus"></i></a>
													</c:if>
													<c:if test="${resultImagemap[result.res_id]!= null}">
													<a href="<%= basePath%>/static/adStyle/img/${resultImagemap[result.res_id]}"   class="popup-img"><i class="fa fa-search-plus"></i></a>
													</c:if>
												</div>
												<span>${result.res_name}</span>
											</div>
										</div>
										<div class="image-box-body">
											<h3 style="white-space:nowrap;overflow:hidden;text-overflow:ellipsis;" class="title"><a href="">${result.res_name}</a></h3>
											<div style="text-overflow:ellipsis;word-wrap: break-word;height:67.5px;width:230px;overflow:hidden;">${ result.res_introduction}</div>
											
											<span>${usermap[result.res_provider]}</span>
											<div class="elements-list pull-right">
												<a href="/vcevaluation/resultItem?res_id=${result.res_id}"><span>样机详情</span></a>
											</div>
											
										</div>
									</div>
								</div>
								</c:forEach>
								
								</div>
							</div>
							<!-- portfolio items end -->
							<ul class="pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
						    </ul>
						    
							<ul class="pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectAllPrototype?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="selectAllPrototype?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectAllPrototype?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="selectAllPrototype?pageNum=${pager.pageCount }">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>
							<div class="clearfix"></div>
                           <!--  <!-- pagination start 
							<ul class="pagination">
								<li><a href="#"><<</a></li>
								<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">>></a></li>
							</ul>
							pagination end -->
                            
							

						</div>
						<!-- main end -->

					</div>
				</div>
			</section>
			<!-- main-container end -->
			
						<!-- section start -->
			<!-- ================ -->
			<div class="section gray-bg text-muted footer-top clearfix">
				<div class="container">
					<div class="row">
						<div class="col-md-6">
							<div class="owl-carousel clients">
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-1.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-2.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-3.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-4.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-5.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-6.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-7.png" alt=""></a>
								</div>
								<div class="client">
									<a href="#"><img src="<%= basePath%>/static/projectstyle/images/client-8.png" alt=""></a>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<blockquote class="inline">
								<p class="margin-clear">Design is not just what it looks like and feels like. Design is how it works.</p>	
								<footer><cite title="Source Title">Steve Jobs </cite></footer>
							</blockquote>
						</div>
					</div>
				</div>
			</div>
			<!-- section end -->	
	
<!-- footer section -->
<jsp:include page="/footer1.jsp" flush="true"/>
<!-- /footer section -->
<script>
function goPage(){
	 var curPage=document.getElementById("changePage").value * 1;
       if (!/^[1-9]\d*$/.test(curPage)) {
           alert("请输入正整数");
           return ;
       }
       var max = ${pager.pageCount};
       if (curPage > max) {
           alert("超出数据页面");
           return ;
       }
     //  alert(curPage);
       window.location.href = "?pageNum="+curPage;
}

</script>
</body>
</html>