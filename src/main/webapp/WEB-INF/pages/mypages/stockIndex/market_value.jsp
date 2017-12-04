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
<title>市场估值</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="<%=basePath %>/css/reset.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/nivoslider.css"type="text/css" media="all" />
<link rel="stylesheet" href="<%=basePath %>/css/prettyPhoto.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/js/style.css"type="text/css" media="screen" />
<link rel="stylesheet" href="<%=basePath %>/css/responsive.css"type="text/css" media="all" />

<!-- 引入 ECharts 文件 -->
    <script src="<%= basePath%>/static/uStyle/js/echarts.js"></script>
    <script src="<%= basePath%>/static/uStyle/js/jquery.js"></script>
</head>
<body class="home-page">
	<jsp:include page="/top_q.jsp" flush="true" />

<div  style="float:left;margin-left:300px">
			<jsp:include page="/left_value.jsp" flush="true" />
</div>
<div class="wrapper" style="float:left">
	<div id="main-content">
		
		<div class="secondary" style="float:right;width:200px">
			<div class="clear"></div>
		</div><!--end:secondary-->
		<div class="clear"></div>
		<div style="height:840px">
		
		<div style="height:400px;margin-top:20;width:100%;border:1px solid #000">
			<div style="height:370px;margin-top:20;width:95%;border:1px solid #000;margin:15px" id="sumary"></div>
		</div>
		<div style="height:410px;margin-top:20;width:100%;border:1px solid #000">
			
		</div>
		</div>
			
	
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
<div id="forsumary" style="width: 1200px;height:1200px;border:1px;align:center;"></div>
<script type="text/javascript">
	// 基于准备好的dom，初始化echarts实例
       var myChart = echarts.init(document.getElementById('sumary'));
       var dataforsumary = document.getElementById('forsumary');
      // var dataBJ = dataforsumary;
        var dataBJ = [
    	   [7.09,16.25,39.79,8],[8.14,14.3,26.33,7.53],[4.54,33.63,47.96,92.02],[12.45,26.22,19.89,304.81],[5.87,12.44,28.65,7.39],[7.93,23.74,33.53,11.55],[6.76,13.89,46.43,11.89],[7.79,24.29,34.08,67.12],[10.89,28.08,29.59,29.88],[9.49,14.36,37,24.11],[6.56,7.48,32.84,10.34],[9.37,7.71,33.28,-57.19],[5.39,13.94,46.48,7.2],[6.09,18.75,53.05,7.19],[8.71,34.4,27.03,26.46],[7.89,22.8,38.92,65.68],[14.51,16.14,31.99,30.78],[6.95,5.69,18.75,16.43],[4.89,8.56,56.65,41.16],[6.47,28,36.59,42.93],[6.17,16.27,52.04,5.78],[7.24,8.38,26.89,-21.32],[8.18,23.16,29.35,18.39],[7.34,25.38,21.28,28.66],[5.27,-3.74,51.54,-35.1],[4.52,8.63,27.17,-36],[7.2,31.63,45.9,49.66],[8.4,29.1,23.85,73.57],[12.69,19.09,19.68,13.66],[7.93,26,41.48,33.08],[5.8,52.27,77.55,10.21],[9.51,57.28,11.48,202.64],[11.04,0.74,6.22,3.99],[6.55,23.36,39.54,43.62],[5.45,14.18,45.82,8.4],[7.24,31.98,40.97,3.33],[8.13,11.73,16.49,7.18],[6.11,13.83,36.79,23.96],[7.71,32.32,33.48,13.67],[6.07,3.34,36.58,5.98],[10.43,51.51,36.44,23.74],[7.26,4.36,20.36,25.96],[7.57,12.01,11.65,9.98],[8.68,28.22,27.68,57.69]
    	]; 


    	var schema = [
    	    {name: 'date', index: 0, text: '月'},
    	    {name: 'PM25', index: 1, text: 'PM2.5'},
    	    {name: 'AQIindex', index: 2, text: 'AQI指数'},
    	    {name: 'PM10', index: 3, text: 'PM10'},

    	];


    	var itemStyle = {
    	    normal: {
    	        opacity: 0.8,
    	        shadowBlur: 10,
    	        shadowOffsetX: 0,
    	        shadowOffsetY: 0,
    	        shadowColor: 'rgba(0, 0, 0, 0.5)'
    	    }
    	};

    	var option = {
    	    backgroundColor: '#404a59',
    	    color: [
    	        '#dd4444'
    	    ],
    	    legend: {
    	        y: 'top',
    	        data: ['北京'],
    	        textStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        }
    	    },
    	    grid: {
    	        x: '10%',
    	        x2: 150,
    	        y: '18%',
    	        y2: '10%'
    	    },
    	    tooltip: {
    	        padding: 10,
    	        backgroundColor: '#222',
    	        borderColor: '#777',
    	        borderWidth: 1,
    	        formatter: function (obj) {
    	            var value = obj.value;
    	            return '<div style="border-bottom: 1px solid rgba(255,255,255,.3); font-size: 18px;padding-bottom: 7px;margin-bottom: 7px">'
    	                + obj.seriesName + ' ' + obj.name + '月：'
    	                + '</div>'
    	                + schema[2].text + '：' + value[2] + '<br>'
    	                + schema[1].text + '：' + value[1] + '<br>'
    	                + schema[3].text + '：' + value[3] + '<br>';
    	        }
    	    },
    	    xAxis: {
    	        type: 'category',
    	        name: 'ROE-平均',
    	        data: ['7.09', '8.14', '4.54', '12.45', '5.87', '7.93', '6.76', '7.79', '10.89', '9.49', '6.56', '9.37', '5.39', '6.09', '8.71', '7.89', '14.51', '6.95', '4.89', '6.47', '6.17', '7.24', '8.18', '7.34', '5.27', '4.52', '7.2', '8.4', '12.69', '7.93', '5.8', '9.51', '11.04', '6.55', '5.45', '7.24', '8.13', '6.11', '7.71', '6.07', '10.43', '7.26', '7.57', '8.68'],
    	        nameGap: 16,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 14
    	        },
    	        //max: 31,
    	        splitLine: {
    	            show: false
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        }
    	    },
    	    yAxis: {
    	        type: 'value',
    	        name: 'PE',
    	        nameLocation: 'end',
    	        nameGap: 20,
    	        nameTextStyle: {
    	            color: '#fff',
    	            fontSize: 16
    	        },
    	        axisLine: {
    	            lineStyle: {
    	                color: '#eee'
    	            }
    	        },
    	        splitLine: {
    	            show: false
    	        }
    	    },
    	    visualMap: [
    	        {
    	            left: 'right',
    	            top: '10%',
    	            dimension: 1,
    	            min: 0,
    	            max: 140,
    	            itemWidth: 30,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['圆形大小：营业收入增长率'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                symbolSize: [10, 70]
    	            },
    	            outOfRange: {
    	                symbolSize: [10, 70],
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        },
    	        {
    	            left: 'right',
    	            bottom: '5%',
    	            dimension: 3,
    	            min: 0,
    	            max: 130,
    	            itemHeight: 120,
    	            calculable: true,
    	            precision: 0.1,
    	            text: ['明暗：净利润增长率'],
    	            textGap: 30,
    	            textStyle: {
    	                color: '#fff'
    	            },
    	            inRange: {
    	                colorLightness: [1, 0.5]
    	            },
    	            outOfRange: {
    	                color: ['rgba(255,255,255,.2)']
    	            },
    	            controller: {
    	                inRange: {
    	                    color: ['#c23531']
    	                },
    	                outOfRange: {
    	                    color: ['#444']
    	                }
    	            }
    	        }
    	    ],
    	    series: [
    	        {
    	            name: '产业链行业地位对比',
    	            type: 'scatter',
    	            itemStyle: itemStyle,
    	            data: dataBJ.map(function (item, index) {
    	                item = item.slice();
    	                item[0] = index;
    	                return item;
    	            })
    	        },

    	    ]
    	};
    // 使用刚指定的配置项和数据显示图表。
      myChart.setOption(option);
</script>
</body>
</html>