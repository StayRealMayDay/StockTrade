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
    <div id="main" style="width: 1200px;height:1200px;border:1px;align:center;"></div>
    11111
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        myChart.showLoading();
		$.getJSON('http://localhost:8080/Stock-Trade/getNE', function (json) {
			
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
    
    <form action="/Stock-Trade/GaoguanNodes">
       <button type="submit">高管成员节点</button>
       </form>
       
    <form action="/Stock-Trade/StockBasicAttr">
       <button type="submit">各股票基本属性关系</button>
    </form>
    
    <form action="/Stock-Trade/StockNode">
       <button type="submit">各股票节点</button>
    </form>
    <form action="/Stock-Trade/GaoguanEdges">
       <button type="submit">高管边关系</button>
    </form>
    <form action="/Stock-Trade/DongshiNodes">
       <button type="submit">董事成员节点</button>
    </form>
    
    <form action="/Stock-Trade/IndustryNodes">
       <button type="submit">行业节点</button>
    </form>
    <form action="/Stock-Trade/MStockholderNodes">
       <button type="submit">主要股东节点</button>
    </form>
    <form action="/Stock-Trade/hangye">
       <button type="submit">同行业边</button>
    </form>
    <form action="/Stock-Trade/MStockEdges">
       <button type="submit">主要股东边</button>
    </form>
    <form action="/Stock-Trade/ConceptType">
       <button type="submit">概念类型</button>
    </form>
    <form action="/Stock-Trade/ConceptTypeEdges">
       <button type="submit">概念类型边</button>
    </form>
</body>
</html>