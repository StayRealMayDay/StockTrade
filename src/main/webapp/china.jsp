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
    <script src="<%= basePath%>/static/uStyle/js/china.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/data-1469097271266-SkyrH7CP.json"></script>
</head>
<body>
	<div id="aa" style="width: 1800px;height:20px;border:1px;align:center;">股票代码:&nbsp;&nbsp;<font color='red'>${stock}</font><br></div>
    <div id="industry" style="width: 1800px;height:900px;border:1px;align:center;"></div>
    <input type="text" name="stock" id="stock" style="display:none" value="${stock}"/>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('industry'));
        var chinaContourUrl = "static/uStyle/js/data-1469097271266-SkyrH7CP.json";
        var stock = document.getElementById('stock').value;
     /*    alert("daima"+stock); */
        $.getJSON(chinaContourUrl, function (json) {
            echarts.registerMap('china-contour', json);
            
            myChart.setOption({
                geo: [{
                    map: 'china',
                    itemStyle: {
                        normal: {
                            borderWidth: 2,
                            shadowBlur: 50,
                            shadowColor: 'rgba(0, 0, 0, 0.2)',
                            borderColor: '#aaa',
                        }
                    }
                }]
            });
        });
        /* var uploadedDataURL = "asset/get/s/data-1487164546975-SyiFER-Yg.txt";
 */
        

        function randomData() {
            return Math.round(Math.random()*1000);
        }
		
 		$.getJSON('http://localhost:8080/Stock-Trade/getIndusDistri?stock='+stock, function (json) {
 			
 			
 			myChart.setOption( option = {
            title: {
                text: '本行业在全国各地分布情况',
                subtext: '空间分布图',
                left: 'center'
            },
            tooltip: {
                trigger: 'item'
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data:['2017年']
            },
            visualMap: {
                min: 0,
                max: 50,
                left: 'left',
                top: 'bottom',
                text: ['高','低'],           // 文本，默认为数值文本
                calculable: true,
                inRange: {
                        color: [ '#e0f3f8', '#ffffbf', '#fee090', '#fdae61', '#f46d43', '#d73027', '#a50026']
                    }
            },
            toolbox: {
                show: true,
                orient: 'vertical',
                left: 'right',
                top: 'center',
                feature: {
                    dataView: {readOnly: false},
                    restore: {},
                    saveAsImage: {}
                }
            },
            series: [
                {
                    name: '2016年',
                    type: 'map',
                    mapType: 'china',
                    roam: false,
                    label: {
                        normal: {
                            show: true
                        },
                        emphasis: {
                            show: true
                        }
                    },
                    data:json
                },
                
                
            ]
        } );
 	});
 

        
       

     // 使用刚指定的配置项和数据显示图表。
       // myChart.setOption(option);
    </script>

</body>
</html>