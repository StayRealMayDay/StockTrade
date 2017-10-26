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
<title>专家评估</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Seeking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.fr.js"></script>
<!-- Custom Theme files -->
<link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css' />

<link rel="stylesheet" href="<%= basePath%>/static/uStyle/css/bootstrap-datetimepicker.css">
<script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.js"></script>
<%-- <script src="<%= basePath%>/static/uStyle/js/bootstrap-datetimepicker.zh-CN.js"></script> --%>

<!-- <link href='http://fonts.useso.com/css?family=Roboto:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'> -->
<style type="text/css">
a {
    color: #f5f5f5;
    text-decoration: none;
}
a:hover, a:focus {
    color: #444;
}
.radio label, .checkbox label {
    display: inherit;
    font-size: 1em;
}
	.verticle_line{
		width: 1px;
		border: solid;
		background-color: black;
	}
	.tag_btn_active{
		background: #fff!important;
		color: #f15f43!important; 
		border: 1px solid #f15f43;
	}
	.myContainer{
		margin-left: 10%;
		margin-right: 10%;
	}
	
	label.col-md-2.control-lable {
    text-align: right;
}
    .col-md-9{
    padding-left: 0px;}
</style>
<!----font-Awesome----->
<link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet"> 
<!----font-Awesome----->
</head>
<body>

<jsp:include page="/u_top.jsp"></jsp:include>

<div class="container">
<form id="form3"  role="form" action="Eva_project" method="post" onsubmit="return validation();">
							<!-- Tabs start -->
							<!-- ================ -->
	<input type="hidden" name="pro_uuid" value="${project.projectUuid}">
    <div class="single">  
	    <div class="col-md-2 left_sideBar" id="tag_btnList">
	    <c:forEach  items="${ins}" var="in" varStatus="status" begin="0" end="0">
	        <div class="col_3">
	   	  		<h3><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.inName}</a></h3>
	   	  	</div>
		</c:forEach>
	   	<c:forEach  items="${ins}" var="in" varStatus="status" begin="1">
	        <div class="col_3">
	   	  		<h3><a href="#vtab${status.index+1}" role="tab" data-toggle="tab"><i class="fa fa-magic pr-10"></i>${in.inName}</a></h3>
	   	  	</div>
		</c:forEach> 	
	   	  	
		</div>
		 <!-- <div class="verticle_line"> -->
		<div class="col-md-10 single_right" >

			<div id="myTabContent" class="tab-content" >
			<c:forEach items="${ins}" var="in" varStatus="status" begin="0" end="0"> 
				  <div role="tabpanel" class="tab-pane fade in active" id="vtab${status.index+1}" aria-labelledby="home-tab">
				     <div class="col-md-9">
												<div style="text-align: center">	  
											  <h3><a style="color:#483e3e"><i class="fa fa-magic pr-10"></i>${in.inName} </a></h3>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
												
											   <c:if test="${inNext.inParent == in.inUuid}">
											  
											   <div class="space"></div>
											   
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.inName}</label>
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option">
												      <c:if test="${option.inUuid == inNext.inUuid}">
										
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.inUuid}" value="${option.opValue}">
																${option.opName}&nbsp(${option.opValue}分)
															</label>
														  </div> 
													  
                                                        
												      </c:if> 
													</c:forEach>
													</div>	
													</div>
													<p>-------------------------------------------------------------------------------------</p>
													<div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
						
				  </div>
            </c:forEach>
            
               <c:forEach items="${ins}" var="in" varStatus="status" begin="1"> 
				  <div role="tabpanel" class="tab-pane fade" id="vtab${status.index+1}" aria-labelledby="home-tab">
				  
				    <div class="col-md-9">
										<div style="text-align: center">	  
											  <h3><a style="color:#483e3e"><i class="fa fa-magic pr-10"></i>${in.inName} </a></h3>
											  </div>
										  <c:forEach items="${inNexts}" var="inNext">
							
											   <c:if test="${inNext.inParent == in.inUuid}">
											   <div class="space"></div>
											   <div class="form-group">
										
											     <label for="inputPassword3" class="col-sm-3 control-label">${inNext.inName}</label>
											     
											     <div class="col-sm-9">
												    <c:forEach items="${options}" var="option">
												      <c:if test="${option.inUuid == inNext.inUuid}">
												      
                                                          <div class="radio">
															<label> 
																<input type="radio" name="optionsRadios${option.inUuid}" value="${option.opValue}">
																${option.opName} &nbsp(${option.opValue}分) 
															</label>
														  </div> 
												      </c:if> 
													</c:forEach>
													</div>	
													</div>
													<div class="space"></div>
												</c:if>
											</c:forEach> 
										</div>
				  
				  </div>
			   </c:forEach>	  
				  
				 
			</div>  
		  
	   </div>
	  <div class="clearfix"> </div>

    </div>
     <div class="form-group">
		<div>
			<button type="submit" class="btn btn-default" style="width:1140px">提交评估</button>
		</div>
	</div>
    </form>
   
</div>

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>


<!-- <script type="text/javascript">
	
	function tabChangeFunc(event){
		var id = event.id;
		var click_button_list = document.getElementById('tag_btnList').getElementsByTagName('div');
		var click_h3_list = document.getElementById('tag_btnList').getElementsByTagName('h3');
		var click_tag_list = document.getElementById('myTabContent').children;
		
		
		for(var i=0; i<click_button_list.length; i++)
		{
			
			if(click_button_list[i].id == id)
			{
				click_h3_list[i].className = 'tag_btn_active';
			}else{
				click_h3_list[i].className = '';
			}
		}

		for(var j=0; j<click_tag_list.length; j++)
		{
			
			if( click_tag_list[j].nodeName == 'DIV')
			{
				if(  click_tag_list[j].id == (id + '_tab') )
				{
					click_tag_list[j].className = 'tab-pane fade in active';
				}else{
					click_tag_list[j].className = 'tab-pane fade in';
				}
			}
			
		}

	}
	

</script>
 -->
<script type="text/javascript">
    
	$('.form_date').datetimepicker({
        language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 4,
		minView: 4,
		forceParse: 0
    });
	
</script>
<script>
function isAllChecked() {
	 
	  for (var i = 11; i < 102; i++) {
	    var radios = document.getElementsByName('optionsRadios' + i);
	    var checkedCount = 0;
	    for (var j = 0; j < radios.length; j++) {
	      if (radios[j].checked) {
	        checkedCount++;
	      }
	    }
	    if (!checkedCount) {
	      return false;
	    }
	  }
	 
	  return true;
	}
function validation(){
	if(isAllChecked()){
		return true;
	}else{
		
		alert("请给所有选项打分！");
		return false;
	}
}
</script>
</body>
</html>	