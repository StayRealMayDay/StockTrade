<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>创业流程</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content=""/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <link href="<%= basePath%>/static/uStyle/css/bootstrap-3.1.1.min.css" rel='stylesheet' type='text/css'/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <%-- <script src="<%= basePath%>/static/uStyle/js/jquery.min.js"></script> --%>
    <script type="text/javascript" src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/bootstrap.min.js"></script>
    <!-- Custom Theme files -->
    <link href="<%= basePath%>/static/uStyle/css/style.css" rel='stylesheet' type='text/css'/>
    <style type="text/css">
        .box_2 {
            margin-bottom: 1em;
        }

    </style>
    <style type="text/css">
        .verticle_line {
            width: 1px;
            border: solid;
            background-color: black;
        }

        .tag_btn_active {
            background: #fff !important;
            color: #f15f43 !important;
            border: 1px solid #f15f43;
        }

        .myContainer {
            margin-left: 10%;
            margin-right: 10%;
        }

        .left_sideBar {
            padding: 2em 0;
        }

        .right_div {
            padding-left: 10%;
            padding-right: 10%;
        }
    </style>

    <!----font-Awesome----->
    <link href="<%= basePath%>/static/uStyle/css/font-awesome.css" rel="stylesheet">
    <!----font-Awesome----->
</head>
<body>
<jsp:include page="/u_top.jsp"></jsp:include>

<br/>

<div class="container">
    <div class="single" style="padding-left: 10%; padding-right: 10%; padding-bottom: 20px; margin-top: 5%">
        <div class="box_1" style="margin-bottom: 0px !important">
            <h3 style="text-align: center;">创业流程展示 </h3>

            <div class="col-md-12" style="padding-bottom: 50px;">
                <img src="<%= basePath%>/static/uStyle/images/entrepreneurial_process.png" alt="创业流程" style="width: 100%;"/>
            </div>

            <div class="clearfix"></div>
        </div>
        <div>
            <h3><i class="fa fa-file-text-o"></i> 创业流程推荐</h3>
            <div id="enterItem">
	            <p style="padding-bottom: 10px;">-流程名称：${enterpriseItem.enterName}</p>
	            <p style="color:#444">
	            	<span id="cou${enterpriseItem.enterUuid}">${enterpriseItem.enterContent} </span>
	            </p>
            </div>
            <ul id="page" class="pagination jobs_pagination" style="padding: 30px 0 50px 0;">
                <!-- <li class="disabled">
	                <a style="cursor: pointer;" aria-label="Previous">
	                	<span aria-hidden="true">«</span></a>
	            </li> -->
                <c:forEach begin="1" end="${size}" varStatus="sta">
                <c:if test="${sta.count == 1}">
                <li id="page${sta.count}" class="active"><a style="cursor: pointer;" onclick="changePage(this,'${sta.count}')">${sta.count}</a></li>	
                </c:if>
                <c:if test="${sta.count > 1}">
                <li id="page${sta.count}"><a style="cursor: pointer;" onclick="changePage(this,'${sta.count}')">${sta.count}</a></li>
                </c:if>
                </c:forEach>
                <!-- <li class="active"><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#">6</a></li>
                <li><a href="#">7</a></li>
                <li><a href="#">8</a></li>
                <li><a href="#">9</a></li>
                <li><a href="#">10</a></li>
                <li><a href="#">11</a></li>
                <li><a href="#">12</a></li>
                <li><a href="#">13</a></li>
                <li><a href="#">14</a></li> -->
                <!-- <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li> -->
            </ul>
        </div>
        
        <div>
            <h3 style="padding-bottom: 30px;"><i class="fa fa-youtube-play"></i> 创业视频推荐</h3>
            
            <div class="recruit_box">
            	<c:forEach items="${fileList}" var="v">
            	<div class="col-md-6 recruit" style="padding-top: 30px;">
	                <a>
	                    <video src="<%= basePath%>/static/${v.fileUrl}" style="width:100%;"
	                    preload="auto" controls="controls" />您的浏览器不支持此种视频格式的在线浏览。</video>
	                    <h4>${v.fileName}</h4>
	                </a>
                </div>
            	</c:forEach>
                <div class="clearfix"> </div>
            </div>
        </div>
        
    </div>
</div>

<!-- footer -->
<jsp:include page="/u_footer.jsp"></jsp:include>

<script type="text/javascript">

    function tabChangeFunc(event) {
        var id = event.id;
        var click_button_list = document.getElementById('tag_btnList').getElementsByTagName('div');
        var click_h3_list = document.getElementById('tag_btnList').getElementsByTagName('h3');
        var click_tag_list = document.getElementById('myTabContent').children;


        for (var i = 0; i < click_button_list.length; i++) {

            if (click_button_list[i].id == id) {
                click_h3_list[i].className = 'tag_btn_active';
            } else {
                click_h3_list[i].className = '';
            }
        }

        for (var j = 0; j < click_tag_list.length; j++) {

            if (click_tag_list[j].nodeName == 'DIV') {
                if (click_tag_list[j].id == (id + '_tab')) {
                    click_tag_list[j].className = 'tab-pane fade in active';
                } else {
                    click_tag_list[j].className = 'tab-pane fade in';
                }
            }

        }

    }


</script>


<script type="text/javascript">
function changePage(t,count){
	
	$.ajax({
        url: "getEnterpriseItem?enterOrder="+count,
        type: 'post',
        async: false,        //同步
        success: function (data) {
        	var enterpriseItem = eval('(' + data + ')').enterpriseItem;
			var size = eval('(' + data + ')').size;
			
			$("#enterItem").html("<p style='padding-bottom: 10px;'>-流程名称："
				+enterpriseItem.enterName
				+"</p><p style='color:#444'><span id='cou"
				+enterpriseItem.enterUuid
				+"'>"
				+enterpriseItem.enterContent
				+"</span></p>");
			
			var nodes = document.getElementById("page").childNodes;
			for(i=0; i<nodes.length;i++){
				nodes[i].className="";
			}
			t.parentNode.className="active";
			
        }
    }); 
}

</script>
</body>
</html>	