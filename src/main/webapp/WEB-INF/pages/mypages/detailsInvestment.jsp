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
<title>详细版本</title>
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
<!-- start-smoth-scrolling -->
</head>	
<body style="width:80%;border:1px solid #EBEBEB;margin-left:10%;margin-top:50px">
	<h1>${institutionName.institutionName}</h1>
    <div id="priceChart" style="width:75%;height:600px;float:left"> </div>
    <div style="width:25%;height:550px;float:left;margin-top:50px">
    	<div style="width:100%"">
	    	<table class="tbody" style="border:1px solid;border-bottom:1px solid;width:90%">	
	   			<tr style="height:35px;background-color:#EBEBEB"> 
					<th style="border:1px solid;border-top:1px solid;width:40%;text-align:center">股票名称</th>
					<th style="border:1px solid;border-top:1px solid;width:10%;text-align:center">类型</th>
					<th style="border:1px solid;border-top:1px solid;width:10%;text-align:center">时间</th>
				</tr>
		    	<tbody id="tbody2"></tbody>
	    	</table>
	    	<button onclick="similarSelect()">相似投资行为分析</button>
	    	<button onclick="clearAll()">清空已有内容</button>
	    </div>   
	    <div id="result" style="width:100%;display:none;">
	    	<h2>分析结果如下:</h2>
	    	<table class="tbody" style="border:1px solid;border-bottom:1px solid;width:90%">	
	   			<tr style="height:35px;background-color:#EBEBEB"> 
					<th style="border:1px solid;border-top:1px solid;width:40%;text-align:center">机构名称</th>
				</tr>
		    	<tbody id="tbody3"></tbody>
	    	</table>
	    </div>
    </div>
    <div class="clearfix"></div>
   
    <div id="theme" style="width:80%;height:500px;margin-left:10%"></div>
    <div id="industryBar" style="width:80%;height:500px;display:none"></div>
    <div id="liRunGraph" style="width:80%;height:500px;display:none"></div>
    
    <script type="text/javascript">
        var priceChart = echarts.init(document.getElementById("priceChart"));
     
        var alltemp = ${all};
   		var name = ${institutionName}.institutionName;
   	 	var bar = ${stockIndustryAll}.stockIndustryAll;
	  
        var datefinal = ${date};//时间
        var date = datefinal.date;
        var timeLineData = [];
        var a=[];
        for(var s = 0; s < date.length; s++) {
        	var t = date[s];
            timeLineData.push(t);
        }
        var all = alltemp.all;
        var edgeList = new Array();//边
        var nodeList = new Array();//点
        var categories = [];//类目
        categories[0] = {name: '新进'};
        categories[1] = {name: '不变'};
        categories[2] = {name: '退出'};
        categories[3] = {name: '增持'};
        categories[4] = {name: '减持'};
        categories[5] = {name: '核心'};   
        var dataSliceList = [];
        var edgeinforList = [];
        for(var y = 0; y < all.length;y++){//时间
        	var temp = all[y];
       		edgeList[y] = temp.edgeslist;
       		nodeList[y] = temp.nodeList;
       		var data = [];
       		var infor = [];
       		var b = [0,0,0,0,0];
       		for(var i = 0;i < temp.nodeList.length;i++){
                data.push({
                    "name": (temp.nodeList)[i].name,
                    "draggable": true,
                    "value":(temp.nodeList)[i].value ,
                    "category": (temp.nodeList)[i].category,
                    "date":(temp.nodeList)[i].date,
                    "label": {
                        "normal": {
                            "show": true
                        }
                    }
                });
                if(i != temp.nodeList.length - 1){
                	 if((temp.nodeList[i].category) == 0){
                			b[0]++;
                		}else if((temp.nodeList[i].category) == 1){
                			b[1]++
                		}else if((temp.nodeList[i].category) == 2){
                			b[2]++;
                		}else if((temp.nodeList[i].category) == 3){
                			b[3]++;
                		}else if((temp.nodeList[i].category) == 4){
                			b[4]++;
                		}else{}
                }
      		}	
       	a.push(b);	
       	dataSliceList.push(data);	
       	edgeinforList.push(infor);
        }
 
        var edgeOptions = [];
        for(var ii = 0; ii < all.length; ii++) {
            edgeOptions.push({
                series: [
                    {
                    	layout: 'force',    
	                    edges: edgeList[ii],
	                    data: dataSliceList[ii],
	                    edgeLabel: {
							normal: {
								show: true,
								textStyle: {
									fontSize: 14
								},	
								formatter:function(params){//触发之后返回的参数，这个函数是关
									  if (params.data.info !=undefined) {//如果触发节点
		               		              return  params.data.info;//返回标签
		               		            }else {//如果触发边
		               		              return  params.data.info;
		               		            }	
								}
	              		   } 
						}
                    },{
                    	 data:[
           	                {value:a[ii][0], name:'新进'},
           	                {value:a[ii][1], name:'不变'},
           	                {value:a[ii][2], name:'退出'},
           	                {value:a[ii][3], name:'增持'},
           	                {value:a[ii][4], name:'减持'}
           	            ]
                    },{
                    	data:bar[ii]
                    }
                ]
            })
        } 
        
        var option = {
            //timeline
            baseOption: {
                timeline: {   
                    axisType: 'category',
                    show: true,
                    autoPlay: false,
                    playInterval: 5000,
                    data:timeLineData
                },
                title: {
           			left: 'center',               		 
           	        text: name + '    长期持股变化',
           	        subtext: '一年之内'
           	    },	
           		legend: [{
	       			 top: 45,
	                    data: categories.map(function (a) {
	                        return a.name;
	                    })
	            }],
	            tooltip: {
	            	show: true,
	            	hideDelay: 600,
			        trigger: 'item',
			        formatter:function(params){//触发之后返回的参数，这个函数是关
			        	 if (params.dataType == 'node'){
			        		 if (params.data.category !=undefined) {//如果触发节点
	         		              return  "类型： " + params.data.category;//返回标签
	         		            }else {//如果触发边
	         		              return  "类型： " + params.data.category;
	         		            }	 
			        	 }	 
					}
			    },
	            animationDuration: 1500,
	            animationEasingUpdate: 'quinticInOut',
	            series: [{
	                type: 'graph',
	                force: {
	                    initLayout: 'circular',
	                    edgeLength: 200,
	                    repulsion: 600,
	                    gravity: 0.1,
	                    layoutAnimation: true
	                },
	                categories: categories,
	                focusNodeAdjacency: true,
	                roam: true,
	                label: {
	                    normal: {
	                        textStyle: {
	                            color: ["#327df8"],
	                            fontSize: 15
	                        },
	                        show: true,
	                        position: 'right',
	                        formatter: '{c}'
	                    }
	                },
	                edgeSymbol:['none', 'arrow'],
	                lineStyle: {
	                    normal: {
	                        color: "target",
	                        width: 2,
	                        curveness: 0.3
	                    }
	                }
	            },{
	            	name:name,
      	            type: 'pie',
      	            radius : '25%',
      	            center: ['85%', '25%'],  
	      	          tooltip : {
	           	        trigger: 'item',
	           	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	           	    },
      	            itemStyle: {
      	                emphasis: {
      	                    shadowBlur: 10,
      	                    shadowOffsetX: 0,
      	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
      	                }
      	            }
      	        },{
      	        	name:name,
      	            type: 'pie',
      	            radius : '25%',
      	            center: ['85%', '75%'],  
	      	          tooltip : {
	           	        trigger: 'item',
	           	        formatter: "{a} <br/>{b} : {c} ({d}%)"
	           	    },
      	            itemStyle: {
      	                emphasis: {
      	                    shadowBlur: 10,
      	                    shadowOffsetX: 0,
      	                    shadowColor: 'rgba(0, 0, 0, 0.5)'
      	                }
      	            }
      	        }]
	        },
	        options:edgeOptions
	        };
        priceChart.setOption(option);
      
      //添加点击事件（单击），还有其他鼠标事件和键盘事件等等
      var similarBydataAll = [];
      priceChart.on("click", function (param){ 
    	  if (param.dataType == 'node'){
    			alert(param.data.category + '|' + param.data.date + '|' + param.data.name);//类型：0 + 日期  + 股票名称 
    	      	var table = $("#tbody2");  
    			var temp = "";
    			if(param.data.category == 0){
    				temp = "新进"
    			}else if(param.data.category == 1){
    				temp = "不变"
    			}else if(param.data.category == 2){
    				temp = "退出"
    			}else if(param.data.category == 3){
    				temp = "增持"
    			}else {
    				temp = "减持"
    			}
    			if($("#tbody3")[0].innerHTML != ""){
    				 $.ajax({
    		              type: "POST",
    		              url: "ajaxstockPriceChange",
    		              data: {
    		              	"stockName": param.data.name
    		              },
    		              dataType: "json",
    		              success: function(data) {
    		           		var priceList = data.result;
    		     			var data = priceList.data;
    		     			var liRundata = priceList.liRundata;//利润部分
    		     			
    		     			var yAxis = [];
    		     			var circulationPrice = [];
    		     			var jiaoYiNum = [];
    		     			
    		     			var jingLiRun = [];//jingLiRuneachShouYi
    		     			var eachShouYi = [];
    		     			
    		     			
    		     			for(var k = 0; k < data.length; k++){
    		     				yAxis[k] = data[k].stockPrice;
    		     				circulationPrice[k] = data[k].circulationPrice;
    		     				jiaoYiNum[k] = data[k].jiaoYiNum;
    		     			}
    		     			
    		     			for(var k = 0; k < liRundata.length; k++){
    		     				jingLiRun[k] = liRundata[k].jingLiRun;    		     
    		     				eachShouYi[k] = liRundata[k].eachShouYi;
    		     			}
    		     			
    		     			if($("#industryBar").css("display") == "none"){
    		     				$('#industryBar').css('display','block');
    		     			}
    		     			
    		     			if($("#liRunGraph").css("display") == "none"){
    		     				$('#liRunGraph').css('display','block');
    		     			}
    		           		var priceChange = echarts.init(document.getElementById("industryBar"));
    		           		var lirunChange = echarts.init(document.getElementById("liRunGraph"));
    		           		
    		           		option = {
								title: {
								         text: '相应变化图————(' + param.data.name + ')',
								         left: 'center'
								     },
								     tooltip: {
								         trigger: 'axis',
								         axisPointer: {
								             animation: false
								         }
								     },
								     legend: {
								         data:['当日收盘价','当日个股交易股数'],
								         x: 'left'
								     },
								     axisPointer: {
								         link: {xAxisIndex: 'all'}
								     },
								     
								     dataZoom: [{
									       startValue: '2016-01-01',
									       xAxisIndex: [0, 1]
									   }, {
									       type: 'inside',
									       xAxisIndex: [0, 1]
									 }],
									  grid: [{
									        left: 150,
									        right: 50,
									        height: '30%'
									    }, {
									        left: 150,
									        right: 50,
									        top: '58%',
									        height: '30%'
									    }],
								     xAxis:[
								    	 {
								            type : 'category',
								            boundaryGap : false,
								            axisLine: {onZero: true},
								            data: priceList.date
								        },
								        {
								            gridIndex: 1,
								            type : 'category',
								            boundaryGap : false,
								            axisLine: {onZero: true},
								            data: priceList.date
								        }
								     ],
								     yAxis : [
								         {
								             name : '当日收盘价',
								             type : 'value',
								         },
								         {
								             gridIndex: 1,
								             name : '当日个股交易股数',
								             type : 'value',								          
								         }
								     ],
							  
							series:[
								{
								      name: '当日收盘价',
								      type: 'line',
								      symbolSize: 8,
								      hoverAnimation: false,
								      data: yAxis
								},{
									name: '当日个股交易股数',
								      type: 'line',
								      xAxisIndex: 1,
							          yAxisIndex: 1,
							          symbolSize: 8,
							          hoverAnimation: false,
								      data: jiaoYiNum
								}
								
							] 
							};
    		           		priceChange.setOption(option);
    		           		
    		           		optionlirun = {    						
    								     tooltip: {
    								         trigger: 'axis',
    								         axisPointer: {
    								             animation: false
    								         }
    								     },
    								     legend: {
    								         data:['公司实现的净利润','基本每股收益'],
    								         x: 'left'
    								     },
    								     axisPointer: {
    								         link: {xAxisIndex: 'all'}
    								     },
    								     
    								     dataZoom: [{
    									       startValue: '2016-01-01',
    									       xAxisIndex: [0, 1]
    									   }, {
    									       type: 'inside',
    									       xAxisIndex: [0, 1]
    									 }],
    									  grid: [{
    									        left: 150,
    									        right: 50,
    									        height: '30%'
    									    }, {
    									        left: 150,
    									        right: 50,
    									        top: '58%',
    									        height: '30%'
    									    }],
    								     xAxis:[
    								    	 {
    								            type : 'category',
    								            boundaryGap : false,
    								            axisLine: {onZero: true},
    								            data: priceList.liRundate
    								        },
    								        {
    								            gridIndex: 1,
    								            type : 'category',
    								            boundaryGap : false,
    								            axisLine: {onZero: true},
    								            data: priceList.liRundate
    								        }
    								     ],
    								     yAxis : [
    								         {
    								             name : '公司实现的净利润',
    								             type : 'value',
    								         },
    								         {
    								             gridIndex: 1,
    								             name : '基本每股收益',
    								             type : 'value',								          
    								         }
    								     ],
    							  
    							series:[
    								{
    								      name: '公司实现的净利润',
    								      type: 'line',
    								      symbolSize: 8,
    								      hoverAnimation: false,
    								      data: jingLiRun
    								},{
    									name: '基本每股收益',
    								      type: 'line',
    								      xAxisIndex: 1,
    							          yAxisIndex: 1,
    							          symbolSize: 8,
    							          hoverAnimation: false,
    								      data: eachShouYi
    								}
    								
    							] 
    							};
    		           		lirunChange.setOption(optionlirun);
    		           		
    		           		
    		              } 
    		          }) 	 		
    			}else{
    				table.append('<tr class="gradeX" style="height:35px"><td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center"><a href="#'
	      					+ param.data.name + '">'
	      					+ param.data.name + '</a></td><td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'
	      					+ temp + '</td><td style="border-left:1px solid;border-top:1px solid;width:20%;text-align:center">'
	      					+ param.data.date + '</td></tr>');
			      	var similarByDataOnly = [];
			      	similarByDataOnly.push(param.data.name);
			      	similarByDataOnly.push(param.data.category);
			      	similarByDataOnly.push(param.data.date);
			      	similarBydataAll.push(similarByDataOnly);
    			}
    	  }else{}  
      });

      function similarSelect(){ 
    	  $.ajax({
              type: "POST",
              url: "similar",
              data: {
              	"similarBydataAll": JSON.stringify(similarBydataAll)
              },
              dataType: "json",
              success: function(data) {
            	  var mapList = data.finalResult;	
            	  //alert(mapList);//类型：0 + 日期  + 股票名称 
            	  var tableTwo = $("#tbody3");
            	  for(var i = 0; i < mapList.length; i++){
            		  tableTwo.append('<tr class="gradeX" style="height:35px"><td style="border-left:1px solid;border-top:1px solid;text-align:center"><a href="detailsInvestment?institutionName='+mapList[i]+'" target="_blank">'
  	      					+ mapList[i] + '</a></td></tr>');
            	  }
          		 $('#result').css('display','block');
              } 
          }) 	 
      }
      function clearAll(){
   		 $("#tbody2")[0].innerHTML = "";
   		similarBydataAll = [];
   	    $("#tbody3")[0].innerHTML = "";
   		$('#result').css('display','none');
   	 } 	 
 
</script>
  	<script type="text/javascript">
  		var themeChart = echarts.init(document.getElementById("theme"));
  		var themeValue = ${valueNew}.valueNew;
  		var themeAll = [];
  	    var cataTheme = ${cataTheme}.cataTheme;
  	    
  	    
  	    //横轴类目
  		var datefinal = ${date};//时间
        var date = datefinal.date;
        var timeLineData = [];
        var a=[];
        for(var s = 0; s < date.length; s++) {
        	var t = date[s];
        	var b = t.split("-");
            timeLineData.push(b[0]+"/"+b[1]+"/"+b[2]);
        }
   
  		for(var p = 0; p < themeValue.length; p++){
  			var l1 = themeValue[p][0];
  			var l2 = themeValue[p][1];
  			var l3 = themeValue[p][2];
  			for(var y = 0; y < timeLineData.length; y++){
  				if(l1 == timeLineData[y]){
  					themeAll[p] = [y,l2,l3]; 
  					break;
  				}else{}	
  			}	
  		}

  		var ooption = {
  				legend: {
  	  		        data:cataTheme
  	  		    },
  		    singleAxis: {
  	            type:'category',
  	            data: timeLineData
  	    	},
  		    series: [
  		        {
  		            type: 'themeRiver',
  		            
  		            itemStyle: {
  		                emphasis: {
  		                    shadowBlur: 20,
  		                    shadowColor: 'rgba(0, 0, 0, 0.8)'
  		                }
  		            },
  		            data:themeAll,
  		          label: {
		  	            normal: {
		  	                show: true
		  	            }
		  	        }
  		        }
  		    ]
  		};
	  	themeChart.setOption(ooption);
  	</script>
</body>
</html>