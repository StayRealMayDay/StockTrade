<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <!-- 引入 ECharts 文件 -->
    <script src="<%= basePath%>/static/uStyle/js/echarts.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
    
</head>
<body>
	<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
	<div id="aa" style="width: 1800px;height:20px;border:1px;align:center;">股票代码:&nbsp;&nbsp;<font color='red'>${stock}</font><br></div>
    <div id="main" style="width: 1800px;height:900px;border:1px;align:center;"></div>
    
    <input type="text" name="stock" id="stock" style="display:none" value="${stock}"/>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        var stock = document.getElementById('stock').value;
        /* alert("daima"+stock); */
        // 指定图表的配置项和数据
        myChart.showLoading();
		$('http://localhost:8080/Stock-Trade/getNE?stock='+stock, function (json) {
		    myChart.hideLoading();
		    myChart.setOption(option = {
		        title: {
		            text: '企业关系图'
		        },
		        animationDurationUpdate: 1500,
		        animationEasingUpdate: 'quinticInOut',
		        series : [
		            {
		                type: 'graph',
		                layout: 'none',
		                // progressiveThreshold: 700,
		                data: json.nodes.map(function (node) {
		                    return {
		                        x: node.x,
		                        y: node.y,
		                        id: node.id,
		                        name: node.label,
		                        symbolSize: node.size,
		                        itemStyle: {
		                            normal: {
		                                color: node.color
		                            }
		                        }
		                    };
		                }),
		                edges: json.edges.map(function (edge) {
		                    return {
		                        source: edge.sourceid,
		                        target: edge.targetid
		                    };
		                }),
		                label: {
		                    emphasis: {
		                        position: 'right',
		                        show: true
		                    }
		                },
		                roam: true,
		                focusNodeAdjacency: true,
		                lineStyle: {
		                    normal: {
		                        width: 0.5,
		                        curveness: 0.3,
		                        opacity: 0.7
		                    }
		                }
		            }
		        ]
		    }, true);
		});
    </script>
    
</body>
</html>