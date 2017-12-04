<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<form name="Form2" action="/vcevaluation/uploadProtoImage" method="post"  enctype="multipart/form-data">
    <h1>给样机上传图片</h1>
    <input type="hidden" name="res_id" value="${res_id}">
    
   <input type="file" name="file" accept="image/*">
   <input type="submit" id="BtDelet" value="上传图片"/>
    <img src="static/adStyle/img/${imagePath}"  alt="Head Portraits"/>
</form>
</div>
</body>
</html>