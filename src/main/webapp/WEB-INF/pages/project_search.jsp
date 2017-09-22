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
<title>多条件查询</title>
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
			<h3>查询结果</h3>
			<c:forEach items="${projects}" var="pro">
			<c:set var="string1" value="${pro.pjProtime}"/>
            <c:set var="string2" value="${fn:substring(string1, 8, 10)}" />
            <c:set var="string3" value="${fn:substring(string1, 5, 7)}" />
             <div class="jobs_follow jobs-single-item">
				<div class="thumb"><img src="<%= basePath%>/static/uStyle/img/${pro.pjLogo}" class="img-responsive" alt=""/></div>
				<div class="thumb_right">
				<div class="date">${string2}<span>${string3}</span></div>
				<h6 class="title"><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></h6>
				 <span class="meta">${pro.pjName}</span> 
				<ul class="top-btns">
					<li>
						<a href="#" class="btn_1 fa fa-star-o icon_2"></a>
					</li>
				</ul>
				<p>${pro.pjBackground}</p>
                <hr>
                <a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}" class="btn btn-default pull-left" >查看该项目</a>
                &nbsp;<a href="#" class="btn btn-default pull-left" >关注该项目</a>
	         
				  
				<!-- Modal -->
				<!--<div class="modal fade" id="applyModal" tabindex="-1" role="dialog" aria-labelledby="applyModalLabel" aria-hidden="true">
				  	<div class="modal-dialog">
				    	<div class="modal-content">
					      	<div class="modal-header">
					        	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
					        	<h4 class="modal-title" id="myModalLabel">Apply for this job</h4>
					      	</div>
	                        <div class="modal-body">
					          Before you apply you have to login as a candidate			
					          <p><a href="login.html">Log in</a></p>
					      	</div>
				    	</div>
				  	</div>
				</div>  -->
	           <ul class="social-icons pull-right">
					<li><span>热度 : </span></li>
					<li><a href="#" class="fa fa-star" target="_blank"></a></li>
					<li><a href="#" class="fa fa-star" target="_blank"></a></li>
					<li><a href="#" class="fa fa-star" target="_blank"></a></li>
					<li><a href="#" class="fa fa-star" target="_blank"></a></li>
					<li><a href="#" class="fa fa-star" target="_blank"></a></li>
				</ul>
				<div class="clearfix"> </div>
		    </div>
		   <div class="clearfix"> </div>
		   </div>
		    </c:forEach>
		    <br />
				
						    
							<ul class="pagination jobs_pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="muliSearch?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="muliSearch?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="muliSearch?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="muliSearch?pageNum=${pager.pageCount }">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>
							<ul class="pagination jobs_pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
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