<%@page import="com.sun.xml.txw2.Document"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<head>
<title>企业全网关系图</title>
<link href="<%=basePath %>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>/css/bootstrap.css">
<link href="<%=basePath %>/css/component.css" rel="stylesheet">
<link rel="stylesheet" href="<%=basePath %>/css/font-awesome.min.css" />
<script type="text/javascript" src="<%=basePath %>/js/jquery.marquee.min.js"></script>
<!-- <link href="http://fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet"> -->
<!-- start-smoth-scrolling -->
<%-- <script type="text/javascript" src="<%=basePath %>/js/move-top.js"></script> --%>
<script type="text/javascript" src="<%=basePath %>/js/easing.js"></script>
<script src="<%=basePath %>/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="<%=basePath %>/js/echarts.min.js"></script>
<script src="<%=basePath %>/js/bootstrap.min.js "></script>
<script src="<%=basePath %>/js/d3.js"></script>
<!-- start-smoth-scrolling -->
</head>	
<body style="border:1px solid #EBEBEB;margin-left:10%;margin-top:100px">
</body>
<script type="text/javascript">
	var h=2000;
	var w=1500;
	// 颜色函数
	var colors=d3.scale.category20();//创建序数比例尺和包括20中颜色的输出范围
	var firmMap = ${mapList}.mapList;
	var edgeList = [];//边
   	var nodeList = [];//点
   	edgeList = firmMap.edgeAll;//边 
	nodeList = firmMap.nodeAll;//复杂点
	//(1)定义节点和联系对象数组
	var dataset={
	    nodes:nodeList,
	    edges:edgeList
	};
	//(2)转化数据为适合生成力导向图的对象数组
	var force=d3.layout.force()
	    .nodes(dataset.nodes)//加载节点数据
	    .links(dataset.edges)//加载边数据
	    .size([w,h])//设置有效空间的大小
	    .linkDistance(5)//连线的长度
	    .charge(-50)//负电荷量，相互排斥设置的负值越大越排斥
	    .start();//设置生效
	   
    var svg=d3.select("body")
    .append("svg")
    .attr("width",w)
    .attr("height",h);
	    
    //(3)创建作为连线的svg直线
    var edges=svg.selectAll("line")
        .data(dataset.edges)
        .enter()
        .append("line")
        .style("stroke",function(d){//  设置线的颜色
            return colors(d.color);
        })
        .style("stroke-width",function(d,i){//设置线的宽度
            return d.weight;
        });
    
  //(4) 创建作为连线的svg圆形
    var nodes=svg.selectAll("circle")
        .data(dataset.nodes)
        .enter()
        .append("circle")
        .attr("r",function(d){//设置圆点的半径，圆点的度越大weight属性值越大，可以对其做一点数学变换
            return Math.log(d.weight)*10;
        })
        .style("fill",function(d){
            return colors(d.weight*d.weight*d.weight);
        })
        .call(force.drag);//可以拖动
        
      //(5)打点更新，没有的话就显示不出来了
        force.on("tick",function(){
            //边
            edges.attr("x1",function(d){
                return  d.source.x;
            })
            .attr("y1",function(d){
                return  d.source.y;
            })
            .attr("x2",function(d){
                return  d.target.x;
            })
            .attr("y2",function(d){
                return  d.target.y;
            });

            //节点
            nodes.attr("cx",function(d){
                return d.x;
            })
            .attr("cy",function(d){
                return d.y;
            });

        })
	
</script>
</html>