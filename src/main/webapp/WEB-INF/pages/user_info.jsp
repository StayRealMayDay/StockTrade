<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.stock.pojo.User"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	 User user = (User)request.getAttribute("user");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>我的主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' /><!-- 
<link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>

<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
    <div class="single">  
	   <div class="col-md-9 single_right">
	   <div class="but_list">
	       <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">个人简介</a></li>
			  <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">关注的项目</a></li>
			   <li role="presentation"><a href="#publish" role="tab" id="publish-tab" data-toggle="tab" aria-controls="publish">发布的需求</a></li>
			   <li role="presentation"><a href="#create" role="tab" id="create-tab" data-toggle="tab" aria-controls="create">创建的项目</a></li>
			   <li role="presentation"><a href="#focus" role="tab" id="focus-tab" data-toggle="tab" aria-controls="focus">关注的需求</a></li>
			   <li role="presentation"><a href="#evaluate" role="tab" id="evaluate-tab" data-toggle="tab" aria-controls="evaluate">评估的项目</a></li>

		   </ul>
		<div id="myTabContent" class="tab-content">
		   <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
		  
			 <form action="/ventureassess/toEditUserinfo" method="post" class="userinfo-form" >
	       <p>${user.userBrief}</p>
	       <p>${user.userScientific}</p>
	       <c:if test="${fn:length(les) > 0}">
	       <dl class="experience">
	         <h3>学习经历</h3>
	         <c:forEach items="${les}" var="les">
	       	 <div class="experience_content experience_content1">
	       	   <div class="experience_period"> 
	       		 <small>From:</small><br><span>${les.leStart}</span><br><small>To:</small><br><span>${les.leEnd}</span>
	       	   </div>
	       	   <!-- <input type="text" class="experience_1" name="" value=""> -->
	       	   <div class="experience_1"><dt><h6>${les.leSchool}</h6></dt>
	       		 <dd>
	       		 	<p>${les.leEdu}</p>
	       		 </dd></div>
	       	   </div>
	       	   </c:forEach>
	       </dl>
	       </c:if>
	       <c:if test="${fn:length(wes) > 0}">
	       <dl class="experience">
	         <h3>工作经历</h3>
	         <c:forEach items="${wes}" var="wes">
	       	 <div class="experience_content experience_content1">
	       	   <div class="experience_period"> 
	       		 <small>From:</small><br><span>${wes.weStart}</span><br><small>To:</small><br><span>${wes.weEnd}</span>
	       	   </div>
	       	   <div class="experience_1"><dt><h6>${wes.weRank}</h6></dt>
	       		 <dd>
	       		 	<p>${wes.weCompany}</p>
	       		 </dd></div>
	       	   </div>
	       	   </c:forEach>
	       </dl>
	       </c:if>
	       </br>
	       <div style="text-align:center">
	        <input type="submit" class="btn btn-primary btn-sm" value="修改资料"> 
	       </div>
		  </form>

		  </div>
		  <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
		   <div class="tab_grid">
			 
			  <c:forEach items="${pros1}" var="pro">
			  <c:set var="string1" value="${pro.pjProtime}"/>
              <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
              <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
			    <div class="jobs-item with-thumb">
				    <div class="thumb"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}"><img src="<%= basePath%>/static/uStyle/images/a2.jpg" class="img-responsive" alt=""/></a></div>
				    <div class="jobs_right">
				        <div class="date">${string2}<span>${string3}</span></div>
						<div class="date_desc"><h6 class="title"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></h6>
						  <span class="meta">行业分类：${pro.pjIndustry}· ${pro.pjProtime}</span>
						</div>
						<div class="clearfix"> </div>
                        <ul class="top-btns">
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li> -->
							<li><a href="#" class="fa fa-trash-o"></a>&nbsp<a href="/ventureassess/NofocusOnPro?project_uuid=${pro.projectUuid}" class="read-more">取消关注</a></li>
							<!-- <li><a href="#" class="fa fa-link"></a></li> -->
						</ul>
						<p class="description">${pro.pjBackground} <a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}" class="read-more">更多</a></p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			   </c:forEach>
			 </div>
		    
			 <ul class="pagination jobs_pagination">
				<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
				<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
	      </ul>
		  </div>
          <div role="tabpanel" class="tab-pane fade" id="publish" aria-labelledby="publish-tab">
		  <c:forEach items="${reqs}" var="reqs">
		  <c:set var="string1" value="${reqs.reqProtime}"/>
            <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
            <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
			 <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date">${string2}<span>${string3}</span></div>
						<div class="date_desc"><h6 class="title"><a href="/ventureassess/reqDetail?req_uuid=${reqs.reqUuid}">${reqs.reqName}</a></h6>
						  <span class="meta">${reqs.reqBrief}</span>
						</div>
						<div class="clearfix"> </div>
                        <ul class="top-btns">
							<li><a href="#" class="fa fa-trash-o"></a>&nbsp<a href="/ventureassess/deleteReq?req_uuid=${reqs.reqUuid}" class="read-more">撤消需求</a></li>
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li>
							<li><a href="#" class="fa fa-star"></a></li>
							<li><a href="#" class="fa fa-link"></a></li> -->
						</ul>
						<p class="description">${reqs.reqContent} <a href="/ventureassess/reqDetail?req_uuid=${reqs.reqUuid}" class="read-more">更多</a></p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			 </c:forEach>
		     <ul class="pagination jobs_pagination">
					<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
					<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
		      </ul>
		  </div>
         <div role="tabpanel" class="tab-pane fade" id="create" aria-labelledby="create-tab">
		  
			 
	       <div class="tab_grid">
			 
			  <c:forEach items="${pros}" var="pro">
			  <c:set var="string1" value="${pro.pjProtime}"/>
              <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
              <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
			    <div class="jobs-item with-thumb">
				    <div class="thumb"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}"><img src="<%= basePath%>/static/uStyle/images/a2.jpg" class="img-responsive" alt=""/></a></div>
				    <div class="jobs_right">
				        <div class="date">${string2}<span>${string3}</span></div>
						<div class="date_desc"><h6 class="title"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></h6>
						  <span class="meta">行业分类：${pro.pjIndustry}· ${pro.pjProtime}</span>
						</div>
						<div class="clearfix"> </div>
                        <ul class="top-btns">
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li> -->
							<li><a href="#" class="fa fa-trash-o"></a>&nbsp<a href="/ventureassess/deletePro?project_uuid=${pro.projectUuid}" class="read-more">撤销项目</a></li>
							<!-- <li><a href="#" class="fa fa-link"></a></li> -->
						</ul>
						<p class="description">${pro.pjBackground} <a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}" class="read-more">更多</a></p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			   </c:forEach>
			 </div>
			
			 <ul class="pagination jobs_pagination">
				<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
				<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
	      </ul>

		  </div>
		  <div role="tabpanel" class="tab-pane fade" id="focus" aria-labelledby="focus-tab">
		  
			<c:forEach items="${reqs1}" var="reqs">
		  <c:set var="string1" value="${reqs.reqProtime}"/>
            <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
            <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
			 <div class="tab_grid">
			    <div class="jobs-item with-thumb">
				   <div class="jobs_right">
						<div class="date">${string2}<span>${string3}</span></div>
						<div class="date_desc"><h6 class="title"><a href="/ventureassess/reqDetail?req_uuid=${reqs.reqUuid}">${reqs.reqName}</a></h6>
						  <span class="meta">${reqs.reqBrief}</span>
						</div>
						<div class="clearfix"> </div>
                        <ul class="top-btns">
							<li><a href="#" class="fa fa-trash-o"></a>&nbsp<a href="/ventureassess/NofocusOnReq?req_uuid=${reqs.reqUuid}" class="read-more">取消关注</a></li>
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li>
							<li><a href="#" class="fa fa-star"></a></li>
							<li><a href="#" class="fa fa-link"></a></li> -->
						</ul>
						<p class="description">${reqs.reqContent} <a href="/ventureassess/reqDetail?req_uuid=${reqs.reqUuid}" class="read-more">更多</a></p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			 </div>
			 </c:forEach>
		     <ul class="pagination jobs_pagination">
					<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
					<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
		      </ul>
	       
		  </div>
		  
		   <div role="tabpanel" class="tab-pane fade" id="evaluate" aria-labelledby="evaluate-tab">
		  
			 
	       <div class="tab_grid">
			 
			  <%-- <c:forEach items="${pros}" var="pro">
			  <c:set var="string1" value="${pro.pjProtime}"/>
              <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
              <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
			    <div class="jobs-item with-thumb">
				    <div class="thumb"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}"><img src="<%= basePath%>/static/uStyle/images/a2.jpg" class="img-responsive" alt=""/></a></div>
				    <div class="jobs_right">
				        <div class="date">${string2}<span>${string3}</span></div>
						<div class="date_desc"><h6 class="title"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></h6>
						  <span class="meta">行业分类：${pro.pjIndustry}· ${pro.pjProtime}</span>
						</div>
						<div class="clearfix"> </div>
                        <ul class="top-btns">
							<!-- <li><a href="#" class="fa fa-plus toggle"></a></li> -->
							<li><a href="#" class="fa fa-trash-o"></a>&nbsp<a href="/ventureassess/deletePro?project_uuid=${pro.projectUuid}" class="read-more">撤销项目</a></li>
							<!-- <li><a href="#" class="fa fa-link"></a></li> -->
						</ul>
						<p class="description">${pro.pjBackground} <a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}" class="read-more">更多</a></p>
                    </div>
					<div class="clearfix"> </div>
				</div>
			   </c:forEach> --%>
			 </div>
			
			 <ul class="pagination jobs_pagination">
				<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
				<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
	      </ul>

		  </div>
		  
	  </div>
     </div>
    
</div>
       </div>
       <div class="col-md-3">
	   	  <img src="<%= basePath%>/static/uStyle/images/f12.jpg" class="img-responsive" alt=""/>
	   	  </br>
	   	  <div align="center">
	      <input name="button1" type="button" id="button1" value="上传照片">
	      </div>
          </br></br>
           <div class="col_3">
          <table class="condidate_detail">
          	<h3>个人信息</h3>
			<tbody>
			<c:if test="${not empty user.userRealname}">
				<tr>
					<td>姓名</td>
					<td>${user.userRealname}</td>
				</tr>
            </c:if>
            <c:if test="${not empty user.userAge}">
				<tr>
					<td>年龄</td>
					<td>${user.userAge}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userGender}">
                <tr>
					<td>性别</td>
					<td>${user.userGender}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userSeniority}">
				<tr>
					<td>资历</td>
					<td>${user.userSeniority}</td>
				</tr>
            </c:if>
            <c:if test="${not empty user.userEdu}">
				<tr>
					<td>学历</td>
					<td>${user.userEdu}</td>
				</tr>
			</c:if>	
            <c:if test="${not empty user.userCompany}">
				<tr>
					<td>所属公司</td>
					<td>${user.userCompany}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userWorkyear}">	
				<tr>
					<td>工作年限</td>
					<td>${user.userWorkyear}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userArea}">
				<tr>
					<td>感兴趣领域</td>
					<td>${user.userArea}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userResearch}">
				<tr>
					<td>研究方向</td>
					<td>${user.userResearch}</td>
				</tr>
			</c:if>
			<c:if test="${not empty user.userEmail}">
				<tr>
					<td>E-mail</td>
					<td><a href="mailto:example@example.com">${user.userEmail}</a></td>
				</tr>
            </c:if>
			</tbody>
		 </table>
		 </div>
<!-- 		 <div class="col_3">
		  <table  class="condidate_detail">
          	<h3>所获奖项</h3>
			<tbody>
				<tr>
					<td>XXXXXX大赛</td>
					<td>一等奖</td>
				</tr>

				<tr>
					<td>XXXXXX大赛</td>
					<td>特等奖</td>
				</tr>

				<tr>
					<td>XXXXXX大赛</td>
					<td>优秀奖</td>
				</tr>

			</tbody>
		 </table>
		 </div>
          -->
       </div>
       <div class="clearfix"> </div>
    </div>
</div>    

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>
</body>
</html>	