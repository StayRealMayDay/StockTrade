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
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>upload拖拽功能上传实例</title>
		
		<script type="text/javascript" src="<%= basePath%>/static/uStyle/zyupload/jquery-1.7.2.js"></script>
		
		<link rel="stylesheet" href="<%= basePath%>/static/uStyle/zyupload/skins/zyupload-1.0.0.min.css " type="text/css">
		<script type="text/javascript" src="<%= basePath%>/static/uStyle/zyupload/zyupload.drag-1.0.0.min.js"></script>
	</head>
	<body>
		<h1 style="text-align:center;">zyupload拖拽功能上传实例</h1>
		<!-- <div style="position: absolute;top: 100px; left: 20px;">
			<h3>功能页面向导：</h3>
			<a style="color: #333;line-height: 30px;" href="demo.html">zyupload全部功能</a><br/>
			<a style="color: #333;line-height: 30px;" href="demo.basic.html">zyupload基本功能</a><br/>
			<a style="color: #333;line-height: 30px;" href="demo.tailor.html">zyupload裁剪功能</a><br/>
		</div> -->
	    <div id="zyupload" class="zyupload"></div>  
        <%-- <input type="hidden" id="pro_uuid" name="pro_uuid" value="${projectUuid}">  --%>
	    <script type="text/javascript">
	    function sleep(numberMillis) { 
	    	
	    	/* var inputElement = document.getElementById("pro_uuid");//找到input元素
	    	var inputtext = inputElement.value; //获取元素值  */
	    	
	    	var now = new Date(); 
	    	var exitTime = now.getTime() + numberMillis; 
	    	while (true) { 
	    	now = new Date(); 
	    	if (now.getTime() > exitTime) 
	    	return; 
	    	} 
	    	}
			$(function(){
				// 初始化插件
				$("#zyupload").zyUpload({
					width            :   "650px",                 // 宽度
					height           :   "400px",                 // 宽度
					itemWidth        :   "140px",                 // 文件项的宽度
					itemHeight       :   "115px",                 // 文件项的高度
					url              :   "/ventureassess/uploadProductImage?pro_uuid=${projectUuid}",  // 上传文件的路径
					fileType         :   ["jpg","png","js","exe"],// 上传文件的类型
					fileSize         :   51200000,                // 上传文件的大小
					multiple         :   true,                    // 是否可以多个文件上传
					dragDrop         :   true,                    // 是否可以拖动上传文件
					tailor           :   false,                    // 是否可以裁剪图片
					del              :   true,                    // 是否可以删除文件
					finishDel        :   false,  				  // 是否在上传文件完成后删除预览
					/* 外部获得的回调接口 */
					onSelect: function(selectFiles, allFiles){    // 选择文件的回调方法  selectFile:当前选中的文件  allFiles:还没上传的全部文件
						console.info("当前选择了以下文件：");
						console.info(selectFiles);
					},
					onDelete: function(file, files){              // 删除一个文件的回调方法 file:当前删除的文件  files:删除之后的文件
						console.info("当前删除了此文件：");
						console.info(file.name);
					},
					onSuccess: function(file, response){          // 文件上传成功的回调方法
						console.info("此文件上传成功：");
						console.info(file.name);
						console.info("此文件上传到服务器地址：");
						console.info(response);
						$("#uploadInf").append("<p>"+ file.name + "上传成功!</p>");
						sleep(1000);
						window.location.href="projectDetail?project_uuid=${projectUuid}";
					},
					onFailure: function(file, response){          // 文件上传失败的回调方法
						console.info("此文件上传失败：");
					    alert(file.name + " 文件上传失败!")
						console.info(file.name);
					},
					onComplete: function(response){           	  // 上传完成的回调方法
						console.info("文件上传完成");
						console.info(response);
					}
				});
				
			});
		
		</script> 
	</body>
</html>







