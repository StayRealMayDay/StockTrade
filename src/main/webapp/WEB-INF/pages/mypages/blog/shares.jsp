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

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

	<div  style="width:97%;align:center">
		<div style="margin:0 auto; width:70%; height:100px; border:1px solid #F00">
		<aside class="widget box-hover" style="border-left:0.5px solid gray"> 
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>贴吧中心</span></h4><br>
						</header>
						<ul  id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
							<li role="presentation" class="active">
								<a href="#mystock" id="my_tabstock" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">热帖总排行</a>
							</li>
							<li role="presentation">
								<a href="#my_news" role="tab" id="news-tabnew" data-toggle="tab" aria-controls="newTab">热股讨论</a>
							</li>
						</ul>	
						<div id="qwertyui" class="tab-content" >
							<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tabstock">
								<div class="w3l_stocks" style="padding-top:5px">
								
									<table style="width: 100%;">
									<thead>
										<tr style="width: 100%;height:40px;font-size:12px ">
											<th style="width: 25%;">标题</th>
											<th style="width: 25%;">作者</th>
											<th style="width: 25%;">点击数</th>
											<th style="width: 25%;">时间</th>
											<th style="width: 25%;">回复数</th>
										</tr>
									</thead>	
									<tbody>
										<c:forEach items="${latestSharesList}" var="rowo" begin='${(pageNos-1)*15}' end='${pageNos*15-1}'>
											<tr style="width: 100%;height:30px;">
												<td><a href="sharesDetail?sharesId=${rowo.sharesId}">${rowo.sharesTitle}</a></td>
												<td>${rowo.author}</td>
												<td>${rowo.clickNum}</td>
												<td>${rowo.time}</td>
												<td>${rowo.replyNum}</td>
											</tr>
										</c:forEach>
									</tbody>
									</table>
									<div style="text-align:center">
										
										<h4 align="center">共${countPage}页  
										<input type="text" value="${pageNos}" name="pageNos" size="1">页
										<a href="shares?pageNos=${pageNos}">go</a>
										</h4>
										
										<h4>
										<c:if test="${pageNos>1 }">
											<a href="shares?pageNos=1" >首页</a>
											<a href="shares?pageNos=${pageNos-1 }">上一页</a>
										</c:if>
										<c:if test="${pageNos <countPage }">
											<a href="shares?pageNos=${pageNos+1 }">下一页</a>
											<a href="shares?pageNos=${countPage }">末页</a>
										</c:if>
										</h4>
									</div>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tabnew">
								<div class="w3l_stocks" style="padding:2px">
									<table style="width: 100%;">
									<thead>
										<tr style="width: 100%;height:40px;font-size:12px ">
											<th style="width: 25%;">标题</th>
											<th style="width: 25%;">作者</th>
											<th style="width: 25%;">点击数</th>
											<th style="width: 25%;">回复数</th>
											<th style="width: 25%;">时间</th>
										</tr>
									</thead>	
									<tbody>
										<c:forEach items="${latestSharesList}" var="rowo" begin='0' end='16'>
											<tr style="width: 100%;height:30px;">
												<td><a href="#">${rowo.sharesTitle}</a></td>
												<td>${rowo.author}</td>
												<td>${rowo.clickNum}</td>
												<td>${rowo.replyNum}</td>
												<td>${rowo.time}</td>
											</tr>
										</c:forEach>
									</tbody>
									</table>
									
									
									<div style="text-align:center">
										
										<h4 align="center">共${countPage}页  
										<input type="text" value="${pageNos}" name="pageNos" size="1">页
										<a href="shares?pageNos=${pageNos}">go</a>
										</h4>
										
										<h4>
										<c:if test="${pageNos>1 }">
											<a href="shares?pageNos=1" >首页</a>
											<a href="shares?pageNos=${pageNos-1 }">上一页</a>
										</c:if>
										<c:if test="${pageNos <countPage }">
											<a href="shares?pageNos=${pageNos+1 }">下一页</a>
											<a href="shares?pageNos=${countPage }">末页</a>
										</c:if>
										</h4>
									</div>
								</div>
							</div>
							
							</div>
						</div>
					</aside>
		</div>
	</div>	

	
</body>
</html>