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
<title>新闻详情页</title>
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
<link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
<script src="<%=basePath %>/js/bootstrap.min.js"></script>

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
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/ie7-fixed.js"></script>
	<![endif]-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
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

<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />
<div class="wrapper">
	<div id="main-content">
		<div class="primary" style="width:780px;float:left">
			<article class="entry-item">
				<header>
					<span class="entry-author">${blogDetail.blogAuthor }</span>
					<span class="entry-date">&nbsp;&nbsp;|&nbsp;&nbsp;发表时间：${blogDetail.blogDate }</span>
					<span class="entry-date">&nbsp;&nbsp;|&nbsp;&nbsp;点击数：${blogDetail.blogClicknum }</span>
					<h1 class="entry-title">${blogDetail.blogTittle }</h1>					          
				</header>			
				<blockquote>${blogDetail.blogContent }</blockquote>
			<div class="clear"></div>
			</article>       
			<section class="related-posts">
				<h3>类似博客</h3>
				<ul class="clearfix" style="border:0px">
					<li>
						<article class="clearfix">
							<a href="#"><img class="responsive-img" src="placeholders/139x116/1.jpg" alt="" /></a>
							<h6><a href="#">${blogDetail.blogTittle }</a></h6>
						</article>
					</li>
					<li>
						<article class="clearfix">
							<a href="#"><img class="responsive-img" src="placeholders/139x116/1.jpg" alt="" /></a>
							<h6><a href="#">${blogDetail.blogTittle }</a></h6>
						</article>
					</li>
					<li>
						<article class="clearfix">
							<a href="#"><img class="responsive-img" src="placeholders/139x116/1.jpg" alt="" /></a>
							<h6><a href="#">${blogDetail.blogTittle }</a></h6>
						</article>
					</li>
					<li class="last">
						<article class="clearfix">
							<a href="#"><img class="responsive-img" src="placeholders/139x116/1.jpg" alt="" /></a>
							<h6><a href="#">${blogDetail.blogTittle }</a></h6>
						</article>
					</li>
				</ul><!--end:related-posts-->
			</section><!--end:related-posts--> 
			<section id="comments" class="clearfix">
				<h2 class="comment-box-title">5条评论</h2>
				<ol class="comments-list">
					<li class="comment depth-1">
						<article class="comment-wrap clearfix">
							<div class="comment-date clearfix">
								<span class="enrty-meta">On:</span><span class="entry-date">&nbsp;07.08.2012</span>
							</div>
							<img class="avatar" alt="" src="placeholders/avatar/avatar.jpg" />
							<div class="comment-body">
								<h6 class="author">大玩家</h6>								
								<p>${eeoNewsDetail.title } </p>
								<div class="comment-reply">
									<a class="comment-reply-link" href="#">回复</a> 
									<a class="comment-edit-link" href="#" title="Edit comment">(编辑)</a>
									<div class="clear"></div>
								</div><!--comment-reply-->
							</div><!--comment-body-->
						</article>
						<ul class="children">
							<li class="comment depth-2">
								<article class="comment-wrap clearfix">
									<div class="comment-date clearfix">
										<span class="enrty-meta">On:</span><span class="entry-date">&nbsp;2017年6月12日</span>
									</div>
									<img class="avatar" alt="" src="placeholders/avatar/avatar.jpg" />
									<div class="comment-body">
										<h6 class="author">喜欢现在的自己</h6>								
										<p>${eeoNewsDetail.title }</p>
										<div class="comment-reply">
											<a class="comment-reply-link" href="#">Reply</a> 
											<a class="comment-edit-link" href="#" title="Edit comment">(Edit)</a>
											<div class="clear"></div>
										</div><!--comment-reply-->
									</div><!--comment-body-->
								</article>
								<ul class="children">
									<li class="comment depth-3">
										<article class="comment-wrap clearfix">
												<div class="comment-date clearfix">
													<span class="enrty-meta">On:</span><span class="entry-date">&nbsp;2017年6月12日</span>
												</div>
												<img class="avatar" alt="" src="placeholders/avatar/avatar.jpg" />
												<div class="comment-body">
													<h6 class="author">喜欢现在的自己</h6>								
													<p>${eeoNewsDetail.title }</p>
													<div class="comment-reply">
														<a class="comment-reply-link" href="#">Reply</a> 
														<a class="comment-edit-link" href="#" title="Edit comment">(Edit)</a>
														<div class="clear"></div>
													</div><!--comment-reply-->
												</div><!--comment-body-->
										</article>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li class="comment depth-1">
						<article class="comment-wrap clearfix">
							<div class="comment-date clearfix">
								<span class="enrty-meta">On:</span><span class="entry-date">&nbsp;07.08.2012</span>
							</div>
							<img class="avatar" alt="" src="placeholders/avatar/avatar.jpg" />
							<div class="comment-body">
								<h6 class="author">大玩家</h6>								
								<p>${eeoNewsDetail.title } </p>
								<div class="comment-reply">
									<a class="comment-reply-link" href="#">回复</a> 
									<a class="comment-edit-link" href="#" title="Edit comment">(编辑)</a>
									<div class="clear"></div>
								</div><!--comment-reply-->
							</div><!--comment-body-->
						</article>
				</ol>

				<div id="respond">
					<h3>发表你的评论：</h3>               
					<form id="comments-form" class="clearfix" method="post" data-role="validator" novalidate="novalidate" />                
						<div class="comment-right">
							<p class="input-block">
								<label class="required" for="comment-name">姓名:</label><br />
								<input type="text" validationmessage="Please enter your name" required="" class="k-textbox" id="comment-name" value="" name="name" />
							</p>
							<p class="input-block">
								<label class="required" for="comment-email">邮件:</label><br />
								<input type="email" validationmessage="Please enter your email" required="" class="k-textbox" id="comment-email" value="" name="email" />
							</p>
							<p class="input-block">                                                
								<label class="required" for="comment-url">个人主页:</label><br />
								<input type="url" validationmessage="Please enter your website" required="" class="k-textbox" id="comment-url" value="" name="url" />                                                
							</p>
						</div>
						<div class="comment-left" style="width:450px">
							<p class="textarea-block">                        
								<label class="required" for="comment-message">评论内容:</label><br />
								<textarea style="width:450px" validationmessage="Please enter your message" required="" rows="6" cols="88" id="comment-message" name="message"></textarea>
							</p>
						</div>
						<div class="clear"></div>
						<p class="comment-button" />                    
							<input type="submit" id="submit-comment" value="提交" />
							<p id="status-message">
						</p>                        
					</form>
				</div><!--end:respond--> 
			</section>
		</div><!--end:primary-->
		<div class="secondary" style="width:300px;float:right">
			<div id="sidebar-b" class="sidebar" style="float:right">
				<aside class="widget box-hover" style="border-left:0.5px solid gray">
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>A股即时行情数据</span></h4>
						</header>
					 	<ul id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
							<li role="presentation" class="active">
								<a href="#hu" id="hu_tab" role="tab" data-toggle="tab" aria-controls="huTab" aria-expanded="true">沪A</a>
							</li>
							<li role="presentation">
								<a href="#shen" role="tab" id="shen-tab" data-toggle="tab" aria-controls="shenTab">深A</a>
							</li>
						</ul>
						<div  class="tab-content">
							<div role="tabpanel" class="tab-pane fade in active" id="hu" aria-labelledby="hu_tab">
								<div class="w3l_stocks" style="width: 100%;">
									<table style="width: 100%;">
										<thead>
										<tr style="width: 100%;height:40px;font-size:15px">
											<th style="width: 33%;">股票名称</th>
											<th style="width: 33%;">股票代码</th>
											<th style="width: 33%;">涨跌幅</th>
										</tr>
										</thead>
										<tbody>
											<c:forEach items="${stockHuA}" var="huA">
												<tr style="width: 100%;height:30px">
													<td><a href="company">${huA.stockName}</a></td>
													<td>${huA.stockNum}</td>
													<td>${huA.updownRatio}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="shen" aria-labelledby="shen-tab">
								<div class="w3l_stocks">
									<table style="width: 100%;">
										<thead>
										<tr style="width: 100%;height:40px;font-size:15px">
											<th style="width: 33%;">股票名称</th>
											<th style="width: 33%;">股票代码</th>
											<th style="width: 33%;">涨跌幅</th>
										</tr>
										</thead>
										<tbody>
											<c:forEach items="${stockShenA}" var="shenA">
												<tr style="width: 100%;height:30px">
													<td><a href="company">${shenA.stockName}</a></td>
													<td>${shenA.stockNum}</td>
													<td>${shenA.updownRatio}</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</aside>
					<div style="height:100px"></div>
					<aside class="widget box-hover" style="border-left:0.5px solid gray"> 
						<header class="entry-header">
						<h4 class="widget-title">新股申购</h4>
						</header>
						<div class="newsletter">
							<div class="wpcf7">
								<form class="wpcf7-form" method="post" action="#" />
								<p>Enter your email address below to receive updates each
									time we publish new content</p>
								<p>
									<span class="wpcf7-form-control-wrap your-email"><input
										type="text" size="40"
										class="wpcf7-form-control wpcf7-text wpcf7-email" value=""
										name="your-email" /></span> <input type="submit"
										class="wpcf7-form-control  wpcf7-submit" value="Submit" />
								</p>
								</form>
							</div>
						</div>
					</aside>
					<aside class="widget box-hover">
						<div class="adv-125-125 clearfix">
							<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
							<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
							<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
							<a href="#"><img class="hover-effect responsive-img" alt="" src="placeholders/125x125/sample-ad-1.jpg" /></a>
						</div>
					</aside><!--end:widget-->  
					<div style="height:100px"></div>
					<aside class="widget box-hover" style="border-left:0.5px solid gray"> 
						<header class="entry-header">
							<h4 class="widget-title clearfix"><span>个人股票中心</span></h4>
						</header>
						<ul  id="myTab2" class="nav nav-tabs nav-tabs1" role="tablist">
							<li role="presentation" class="active">
								<a href="#mystock" id="my_tabstock" role="tab" data-toggle="tab" aria-controls="myTab" aria-expanded="true">自选股</a>
							</li>
							<li role="presentation">
								<a href="#my_news" role="tab" id="news-tabnew" data-toggle="tab" aria-controls="newTab">自选股新闻</a>
							</li>
						</ul>	
						<div id="qwertyui" class="tab-content" >
							<div role="tabpanel" class="tab-pane fade in active" id="mystock" aria-labelledby="my_tabstock">
								<div class="w3l_stocks" style="padding-top:5px">
									<table style="width: 100%;">
									<thead>
										<tr style="width: 100%;height:40px;font-size:12px ">
											<th style="width: 25%;">股票名称</th>
											<th style="width: 25%;">股价</th>
											<th style="width: 25%;">涨跌幅</th>
											<th style="width: 25%;">转手率</th>
										</tr>
									</thead>	
									<tbody>
										<c:forEach items="${stockInfo}" var="rowo" >
											<tr style="width: 100%;height:30px;">
												<td style="font-size:12px"><a href="company?stockNum=${rowo.stockNum}">${rowo.stockName}</a></td>
												<td>${rowo.currentPrice}</td>
												<td>${rowo.updownRatio}</td>
												<td>${rowo.turnoverRate}</td>
											</tr>
										</c:forEach>
									</tbody>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="my_news" aria-labelledby="news-tabnew">
								<div class="w3l_stocks" style="padding:2px">
									<ul id="myTab1" class="nav nav-tabs" role="tablist" >
										<c:forEach items="${news}" var="row" begin="8" end="12" >
											<li><a style="font-size: 15px;" href="companySingle">${row.newsTitle}</a></li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</div>
					</aside>
				<div class="clear"></div>
			</div><!--end:sidebar-->
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div id="footer-aside" class="box-hover">
			<aside class="widget">
				<div class="adv-footer">
					<a class="banner-bottom-left" href="#"><img class="hover-effect responsive-img" src="placeholders/728x90-banner.jpg" alt="" /></a>
					<a class="banner-bottom-right" href="#"><img class="hover-effect responsive-img ml-10" src="placeholders/220x90/sample-ad-3.jpg" alt="" /></a>
				</div><!--end:adv-footer-->
				<div class="clear"></div>
			</aside>
		</div><!--end:footer-aside-->	
		<footer>
			<div class="wrapper clearfix">
				<p id="copyrights">Copyright © 2012 KopaTheme. All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>   <a id="scroll-to-top" href="#top">Back to top</a>
			</div><!--end:wrapper-->
		</footer>
	</div><!--main-content-->
</div><!--end:wrapper--> 

</body>
</html>