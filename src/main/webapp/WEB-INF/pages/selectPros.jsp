<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>专家查询</title>
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
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />
<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>

<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
    <div class="single">  
        <div class="col-sm-9 follow_left">
			<c:forEach items="${pros}" var="v" begin="0" end="4">
			<c:set var="string1" value="${v.pjProtime}"/>
            <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
            <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
             <div class="jobs_follow jobs-single-item">
				<div class="thumb_right">
				<div class="date">${string2}<span>${string3}</span></div>
				<h6 class="title"><a href="/ventureassess/projectDetail?project_uuid=${v.projectUuid}">${v.pjName}</a></h6>
				<span class="meta">${v.pjBackground}</span>
				<%-- <ul class="top-btns">
					<li>
						<a href="/ventureassess/focusOnReq?req_uuid=${reqs.reqUuid}" class="btn_1 fa fa-star-o icon_2"></a>
					</li>
				</ul> --%>
				<div style="width:800px;text-overflow: ellipsis; display: -webkit-box; -webkit-box-orient: vertical; -webkit-line-clamp: 3; overflow: hidden; display: -webkit-box;">  
                    <p>${v.pjMlplan}</p>
                    </div>  
				
                <hr>
                
                <a  href="/ventureassess/projectDetail?project_uuid=${v.projectUuid}" >查看该成果</a>
	         
				<div class="clearfix"> </div>
		    </div>
		   <div class="clearfix"> </div>
		   </div>
		   </c:forEach>
		  
		    <br />
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
		<div class="col-sm-3 col_3">
			<h3 class="m_1">热门项目</h3>
			<table class="table">
                    <tbody>
                        <tr class="unread checked">
                            
                            <td class="hidden-xs">
                                移动存储设备
                            </td>
                            <td>
                                (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp97)
                            </td>
                        </tr>
                        <tr class="unread checked">
                          
                            <td class="hidden-xs">
                               指纹考勤系统
                            </td>
                            <td>
                                 (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp56)
                            </td>
                        </tr>
                        
                </tbody>
             </table>
             <h3 class="m_1">热门需求</h3>
             <table class="table">
                    <tbody>
                        <tr class="unread checked">
                            
                            <td class="hidden-xs">
                                印染废水处理技术
                            </td>
                            <td>
                                 (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp32)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            
                            <td class="hidden-xs">
                                回用中水脱色
                            </td>
                            <td>
                                 (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp20)
                            </td>
                        </tr>
                        
                </tbody>
             </table>
             <h3 class="m_1">热门信息</h3>
             <table class="table">
                    <tbody>
                        <tr class="unread checked">
                            
                            <td class="hidden-xs">
                                我国筹划“米”字型产业带格局
                            </td>
                            <td>
                                (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp32)
                            </td>
                        </tr>
                        <tr class="unread checked">
                            
                            <td class="hidden-xs">
                                工信部公布《稀土行业发展规划》
                            </td>
                            <td>
                                (<a href="#" class="fa fa-arrow-up" target="_blank"></a>&nbsp32)
                            </td>
                        </tr>
                       
                </tbody>
             </table>
		</div>
		<div class="clearfix"> </div>
	</div>
</div>
<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>
</body>
</html>	