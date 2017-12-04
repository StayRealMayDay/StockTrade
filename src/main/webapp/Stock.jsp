<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information Of Stock</title>
<script type="text/javascript" src="http://hq.sinajs.cn/list=sh601006,sh601001" charset="utf-8"></script><!--股票-->
<script type="text/javascript" src="http://hq.sinajs.cn/list=s_sh000001,s_sz399001" charset="utf-8"></script><!--大盘指数-->

<script type="text/javascript">
	var elements=hq_str_sh601006.split(",");
	document.write("大秦铁路 current price1: "+elements[3]+"<br>");
	
	var elements=hq_str_sh601001.split(",");
	document.write("大同煤业 current price2: "+elements[3]+"<br>");
	
	var elements=hq_str_s_sh000001.split(",");
	document.write("指数名称: "+elements[0]+"<br>");
	document.write("当前价格: "+elements[1]+"<br>");
	document.write("涨跌率: "+elements[2]+"<br>");
	document.write("成交量（手）: "+elements[3]+"<br>");
	document.write("成交额（万元）: "+elements[4]+"<br>");
	
	var elements=hq_str_s_sz399001.split(",");
	document.write("指数名称: "+elements[0]+"<br>");
	document.write("当前价格: "+elements[1]+"<br>");
	document.write("涨跌率: "+elements[2]+"<br>");
	document.write("成交量（手）: "+elements[3]+"<br>");
	document.write("成交额（万元）: "+elements[4]+"<br>");
	
	document.write("<img src='http://image.sinajs.cn/newchart/daily/n/s_sh000001.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/daily/n/sh601006.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/daily/n/sh601001.gif' />"+"<br>");
	
	//document.write("<img src='http://image.sinajs.cn/newchart/min/n/s_sh000001.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/min/n/sh601006.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/min/n/sh601001.gif' />"+"<br>");
	
	//document.write("<img src='http://image.sinajs.cn/newchart/weekly/n/s_sh000001.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/weekly/n/sh601006.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/weekly/n/sh601001.gif' />"+"<br>");
	
	//document.write("<img src='http://image.sinajs.cn/newchart/monthly/n/s_sh000001.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/monthly/n/sh601006.gif' />");
	document.write("<img src='http://image.sinajs.cn/newchart/monthly/n/sh601001.gif' />"+"<br>");
	
</script>

</head>
<body>
	股票信息
</body>
</html>