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
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />
<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
 --><!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
<style type="text/css">
.grid_1 {
    padding: 3em 0 2em;
}
.banner {
    min-height: 530px;}
.row_1 h6 {
    color: #9a9a9a;
}
dt, dd {
    line-height: 0.8;
}

</style>

<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/style/list.css"/>
<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/style/manhuaDate.1.0.css"/>
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/jquery-1.5.1.js"></script><!--日期控件，JS库版本不能过高否则tab会失效-->
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/datejs.js"></script>
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/ui.tab.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var tab = new $.fn.tab({
		tabList:"#demo1 .ui-tab-container .ui-tab-list li",
		contentList:"#demo1 .ui-tab-container .ui-tab-content"
	});
	var tab = new $.fn.tab({
		tabList:"#demo1 .ui-tab-container .ui-tab-list2 li",
		contentList:"#demo1 .ui-tab-container .ui-tab-content2"
	});		
});	
</script>
<script type="text/javascript">
$(function (){
	$("input.mh_date").datejs({					       
		Event : "click",//可选				       
		Left : 0,//弹出时间停靠的左边位置
		Top : -16,//弹出时间停靠的顶部边位置
		fuhao : "-",//日期连接符默认为-
		isTime : false,//是否开启时间值默认为false
		beginY : 2010,//年份的开始默认为1949
		endY :2015//年份的结束默认为2049
	});
	
});
</script>
<script type="text/javascript">
	$(document).ready(function(e) {
    	$("#selectList").find(".more").toggle(function(){
		$(this).addClass("more_bg");
		$(".more-none").show()
        	},function(){
				$(this).removeClass("more_bg");
				$(".more-none").hide()
			});
	});
</script>
<script type="text/javascript">
   	$(document).ready(function(){
		var taboy_box=$(".lefttable-list");
		taboy_box.children("tbody").find("tr:gt(2)").hide(); 
		$(".leftbox-morea").toggle(function(){
			$(this).parent().prev().find("tr").show();
			$(this).addClass("more-i")
		},function(){
			$(this).removeClass("more-i");
			$(this).parent().prev().children("tbody").find("tr:gt(2)").hide(); 
		}
		);
	});
</script>
</head>

<body>

<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
  <div class="grid_1">
	 <h3>热门项目推荐</h3>
	   
	    <script type="text/javascript">
		 $(window).load(function() {
			$("#flexiselDemo3").flexisel({
				visibleItems: 6,
				animationSpeed: 1000,
				autoPlay:false,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	   </script>
	   <script type="text/javascript" src="<%= basePath%>/static/uStyle/js/jquery.flexisel.js"></script>
	 </div>
	 
	 <div class="w1200">
	    <div class="list-screen" style="width: 1140px;">
	        <form id="mulisearchform" action="muliSearch?pageNum=1" method="post">
	            <div class="screen-top" style="position:relative;">
	            	<span>项目名称关键字<input type="text" name="pro_projectname" class="ju-name"/></span>
	                <span>产品名称关键字<input type="text" name="pro_productname" class="ju-name"/></span>
	                <span>项目背景关键字<input type="text" name="pro_background" class="ju-name"/></span>
	                <!-- <label class="btn2 btn-2 btn2-1b"><input type="submit" value="搜索"></label> -->
	                	<input type="submit" value="搜索"> 
	            </div>
	           
	            <div style="padding:10px 30px 10px 10px;">
	                <div class="screen-address">
	
	                    <div class="screen-term">
	                        <div class="selectNumberScreen">
	                            <div id="selectList" class="screenBox screenBackground">
	                                <dl class="listIndex">
	                                    <dt>综合得分</dt>
	                                    <dd>
	                                        <label><a href="javascript:;">不限</a></label>
	                                        <label>
	                                            <input name="radio2" type="radio" value="9.00"/>
	                                            <a href="javascript:;">9.0分以上</a></label>
	
	                                        <label>
	                                            <input name="radio2" type="radio" value="8.00"/>
	                                            <a href="javascript:;">8.0分以上</a></label>
	                                        <label>
	                                            <input name="radio2" type="radio" value="7.00"/>
	                                            <a href="javascript:;">7.0分以上</a></label>
	                                        <label>
	                                            <input name="radio2" type="radio" value="6.00"/>
	                                            <a href="javascript:;">6.0分以上</a></label>
	
	                                    </dd>
	                                </dl>
	
	                                <dl class="listIndex">
	                                    <dt>技术水平</dt>
	                                    <dd>
	                                        <label><a href="javascript:;">不限</a></label>
	                                        <label>
	                                            <input name="radio3" type="radio" value="9.50"/>
	                                            <a href="javascript:;">9.5分以上</a></label>
	
	                                        <label>
	                                            <input name="radio3" type="radio" value="8.50"/>
	                                            <a href="javascript:;">8.5分以上</a></label>
	                                        <label>
	                                            <input name="radio3" type="radio" value="7.50"/>
	                                            <a href="javascript:;">7.5分以上</a></label>
	                                        <label>
	                                            <input name="radio3" type="radio" value="6.50"/>
	                                            <a href="javascript:;">6.5分以上</a></label>
	
	                                    </dd>
	                                </dl>
	                                <dl class="listIndex" attr="">
	                                    <dt>风险指数</dt>
	                                    <dd style="width:840px">
	                                        <label><a href="javascript:;">不限</a></label>
	                                        <label>
	                                            <input name="radio4" type="radio" value="1"/>
	                                            <a href="javascript:;">高风险高收益</a></label>
	
	                                        <label>
	                                            <input name="radio4" type="radio" value="2"/>
	                                            <a href="javascript:;">低风险中低收益</a></label>
	                                        <label>
	                                            <input name="radio4" type="radio" value="3"/>
	                                            <a href="javascript:;">中等风险稳收益</a></label>
	                                        <label>
	                                            <input name="radio4" type="radio" value="4"/>
	                                            <a href="javascript:;">低风险高收益</a></label>
	                                    </dd>
	                                </dl>
	
	                                <dl class="listIndex" attr="terminal_brand_s">
	                                    <dt>其他指标</dt>
	                                    <dd data-more=true>
	                                        <label><a href="javascript:;">不限</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="生产水平" autocomplete="off"/>
	                                            <a href="javascript:;">生产水平高</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="商业模式" autocomplete="off"/>
	                                            <a href="javascript:;">商业模式先进</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="产业化能力" autocomplete="off"/>
	                                            <a href="javascript:;">产业化能力强</a>
	                                        </label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="市场前景" autocomplete="off"/>
	                                            <a href="javascript:;">市场前景好</a>
	                                        </label>
	                                        <label><a href="javascript:;"></a></label>
	
	                                        <span class="more" style="top:5px;width: 42px"><em class="open"></em>更多</span>
	                                    </dd>
	
	                                </dl>
	                                <dl class="listIndex more-none" attr="terminal_brand_s"
	                                    style="display:none;border:none">
	                                    <dt style='visibility:hidden'>其他指标</dt>
	                                    <dd>
	                                        <label style='visibility:hidden'><a href="javascript:;" >不限</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="市场环境" autocomplete="off"/>
	                                            <a href="javascript:;" >市场环境好</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="组织与管理" autocomplete="off"/>
	                                            <a href="javascript:;" >组织与管理能力强</a></label>
	                                        <label>
	                                            <input name="checkbox2" type="checkbox" value="团队水平" autocomplete="off"/>
	                                            <a href="javascript:;">团队水平高</a></label>
	
	                                </dl>
	                            </div>
	                        </div>
	                    </div>
	
	                </div>
	
	                <div class="hasBeenSelected clearfix"><span id="time-num"><font>4</font>类选择</span>
	
	                    <div style="float:right;width: 100px" class="eliminateCriteria">【清空全部】</div>
	                    <dl>
	                        <dt>已选条件：</dt>
	                        <dd style="DISPLAY: none" class=clearDd>
	                            <div class=clearList></div>
	                    </dl>
	                </div>
				</div>
	        </form>
	        <script type="text/javascript" src="<%= basePath%>/static/uStyle/js/shaixuan.js"></script>
	    </div>
	</div>
	 
	 <div class="single" style="width:100%">  
	   <div class="col-md-4">
	   	  <div class="col_3">
	   	  	<h3>最新项目</h3>
	   	  	<ul class="list_1">
	   	  	<c:forEach items="${pros}" var="pro" begin="0" end="5">
	   	  		<li><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></li>
	   	  	</c:forEach>
	   	  				
	   	  	</ul>
	   	  </div>
    
	   	  <div class="col_3">
	   	  	<h3>最新新闻动态</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news1}" var="new1">
	   	  		<li><a href="/ventureassess/newsDetail?news_uuid=${new1.newsUuid}">${new1.newsTitle}</a></li>		
	   	  	</c:forEach>			
	   	  	</ul>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>最新行业动态</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news2}" var="new2">
	   	  		<li><a href="/ventureassess/newsDetail?news_uuid=${new2.newsUuid}">${new2.newsTitle}</a></li>
	   	  	</c:forEach>				
	   	  	</ul>
	   	  </div>
	   	  <div class="col_3">
	   	  	<h3>最新政策法规</h3>
	   	  	<ul class="list_2">
	   	  	<c:forEach items="${news3}" var="new3">
	   	  	<li><a href="/ventureassess/newsDetail?news_uuid=${new3.newsUuid}">${new3.newsTitle}</a></li>
	   	  	</c:forEach>							
	   	  	</ul>
	   	  </div>
	 </div>

	   <div class="col-md-8">
	   
	   <c:forEach items="${projects}" var="pro">
	      <div class="col_1">
   	         <div class="col-sm-4 row_2">
				<a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}"><img src="<%= basePath%>/static/uStyle/img/${pro.pjLogo}" class="img-responsive" alt=""/></a>
			</div>
			<div class="col-sm-8 row_1">
				<h4><a href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">${pro.pjName}</a></h4>
				<h6>行业分类：${pro.pjIndustry}<span class="dot">·</span> ${pro.pjProtime} </h6>
				<p>${pro.pjBackground}</p>
				<div class="social">	
					<a class="btn_1" href="/ventureassess/projectDetail?project_uuid=${pro.projectUuid}">
						<i class="fa fa-facebook fb"></i>
						<span class="share1 fb">查看</span>								
					</a>
					<a class="btn_1" href="/ventureassess/focusOnPro?project_uuid=${pro.projectUuid}&&pageNum=${pager.pageNum}"> 
						<i class="fa fa-twitter tw"></i>
						<span class="share1">关注</span>								
					</a>
					<a class="btn_1" href="/ventureassess/toEva_project?project_uuid=${pro.projectUuid}">
						<i class="fa fa-google-plus google"></i>
						<span class="share1 google">评估</span>
					</a> 
			   </div>
			</div>
			<div class="clearfix"> </div>
		   </div>
		   </c:forEach>
	      
				<ul class="pagination jobs_pagination" style="text-align: center;">
								
									<li><a href="#">共  ${pager.recordCount } 条数据，每页  ${pager.pageSize } 条，共  ${pager.pageCount } 页，当前是第  ${pager.pageNum } 页</a></li>	
								
						    </ul>
						    
							<ul class="pagination jobs_pagination">
								
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="login?pageNum=1">首页</a></li>
									<li ${pager.pageNum==1?'class="disabled"':''}><a href="login?pageNum=${pager.pageNum-1 }">上页</a></li>		
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="login?pageNum=${pager.pageNum+1 }">下页</a></li>
									<li ${pager.pageNum==pager.pageCount?'class="disabled"':''}><a href="login?pageNum=${pager.pageCount }">末页</a></li>
									<li><a >转到 </a></li>
									<li><a><input id="changePage" type="text" style="width: 35px;padding:0px;margin:-3px;" /></a></li>
									<li><a>页 </a></li>
									<li><a href="javascript:goPage();">跳转</a></li>		
								
							</ul>

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