<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<title>jquery实现多条件筛选特效 - xw素材网</title>
<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/style/list.css"/>
<link rel="stylesheet" type="text/css" href="<%= basePath%>/static/uStyle/style/manhuaDate.1.0.css"/>
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/jquery-1.5.1.js"></script><!--日期控件，JS库版本不能过高否则tab会失效-->
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/datejs.js"></script>
<script type="text/javascript" src="<%= basePath%>/static/uStyle/js/ui.tab.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var tab = new $.fn.tab({
		tabList:"#demo1 .ui-tab-container .ui-tab-list li",
		contentList:"#demo1 .ui-tab-container .ui-tab-content"
	});
	var tab = new $.fn.tab({
		tabList:"#demo1 .ui-tab-container .ui-tab-list2 li",
		contentList:"#demo1 .ui-tab-container .ui-tab-content2"
	});		
});	
</script>
<script type="text/javascript">
$(function (){
	$("input.mh_date").datejs({					       
		Event : "click",//可选				       
		Left : 0,//弹出时间停靠的左边位置
		Top : -16,//弹出时间停靠的顶部边位置
		fuhao : "-",//日期连接符默认为-
		isTime : false,//是否开启时间值默认为false
		beginY : 2010,//年份的开始默认为1949
		endY :2015//年份的结束默认为2049
	});
	
});
</script>
<script type="text/javascript">
               		$(document).ready(function(e) {
                        $("#selectList").find(".more").toggle(function(){
							$(this).addClass("more_bg");
							$(".more-none").show()
                    },function(){
						$(this).removeClass("more_bg");
						$(".more-none").hide()
						});
					});
               </script>
<script type="text/javascript">
   	$(document).ready(function(){
		var taboy_box=$(".lefttable-list");
		taboy_box.children("tbody").find("tr:gt(2)").hide(); 
		$(".leftbox-morea").toggle(function(){
			$(this).parent().prev().find("tr").show();
			$(this).addClass("more-i")
		},function(){
			$(this).removeClass("more-i");
			$(this).parent().prev().children("tbody").find("tr:gt(2)").hide(); 
		}
		);
	});
</script>
</head>

<body>

<div class="w1200">
	<div class="list-screen">
    <form role="form" id="mulisearchform" action="muliSearch?pageNum=1" method="post">
    <div class="screen-top" style="position:relative;"><span>项目名称关键字<input type="text"  name="pro_projectname" class="ju-name" /></span>
    <span>产品名称关键字<input type="text"  name="pro_productname" class="ju-name" /></span>
    <span>项目背景关键字<input type="text" name="pro_background" class="ju-name" /></span><input type="submit" value="搜索">
    </div>
    <!-- 
    <a href="#" id="submit-btn"/>搜索</a>-->
    <div style="padding:10px 30px 10px 10px;"><div class="screen-address">
      
    <div class="screen-term">
      <div class="selectNumberScreen">
        <div id="selectList" class="screenBox screenBackground">
          <dl class="listIndex" attr="">
            <dt>综合得分</dt>
            <dd>
              <label><a href="javascript:;" values2="" values1="" attrval="不限">不限</a></label>
              <label>
                <input name="radio2" type="radio" value="9.00" />
                <a href="javascript:;" values2="" values1="" attrval="">9.0分以上</a></label>
              
              <label>
                <input name="radio2" type="radio" value="8.00" />
                <a href="javascript:;" values2="" values1="" attrval="">8.0分以上</a></label>
              <label>
                <input name="radio2" type="radio" value="7.00" />
                <a href="javascript:;" values2="" values1="" attrval="">7.0分以上</a></label>
				<label>
                <input name="radio2" type="radio" value="6.00" />
                <a href="javascript:;" values2="" values1="" attrval="">6.0分以上</a></label>
             
            </dd>
          </dl>
		  
		  <dl class="listIndex" attr="">
            <dt>技术水平</dt>
            <dd>
              <label><a href="javascript:;" values2="" values1="" attrval="不限">不限</a></label>
              <label>
                <input name="radio3" type="radio" value="9.50" />
                <a href="javascript:;" values2="" values1="" attrval="">9.5分以上</a></label>
              
              <label>
                <input name="radio3" type="radio" value="8.50" />
                <a href="javascript:;" values2="" values1="" attrval="">8.5分以上</a></label>
              <label>
                <input name="radio3" type="radio" value="7.50" />
                <a href="javascript:;" values2="" values1="" attrval="">7.5分以上</a></label>
				<label>
                <input name="radio3" type="radio" value="6.50" />
                <a href="javascript:;" values2="" values1="" attrval="">6.5分以上</a></label>
             
            </dd>
          </dl>
		  <dl class="listIndex" attr="">
            <dt>风险指数</dt>
            <dd>
              <label><a href="javascript:;" values2="" values1="" attrval="不限">不限</a></label>
              <label>
                <input name="radio4" type="radio" value="1" />
                <a href="javascript:;" values2="" values1="" attrval="">高风险高收益</a></label>
              
              <label>
                <input name="radio4" type="radio" value="2" />
                <a href="javascript:;" values2="" values1="" attrval="">低风险中低收益</a></label>
              <label>
                <input name="radio4" type="radio" value="3" />
                <a href="javascript:;" values2="" values1="" attrval="">中等风险稳收益</a></label>
				      <label>
      				<input name="radio4" type="radio" value="4" />
      				<a href="javascript:;" values2="" values1="" attrval="">低风险高收益</a></label>
              <!-- <div class="custom"><span>自定义</span>&nbsp;
                <input name="" type="text" id="custext1"/>
                &nbsp;-&nbsp;
                <input name="" type="text" id="custext2"/>
                <input name="" type="button" id="cusbtn"/>
              </div> -->
            </dd>
          </dl>
		  
		  <dl class="listIndex" attr="terminal_brand_s">
            <dt>其他指标</dt>
            <dd data-more=true>
              <label><a href="javascript:;" values2="" values1="" attrval="不限">不限</a></label>
              <label>
                <input name="checkbox2" type="checkbox" value="生产水平"   autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="小米">生产水平高</a></label>
              <label>
                <input name="checkbox2" type="checkbox" value="商业模式"   autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="zte中兴">商业模式先进</a></label>
               <label>
                <input name="checkbox2" type="checkbox" value="产业化能力"   autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="华为">产业化能力强</a> </label>    
              <label>
                <input name="checkbox2" type="checkbox" value="市场前景"  autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="lenovo">市场前景好</a> </label>
                <label><a href="javascript:;" values2="" values1="" attrval=""></a></label>
             
               <span class="more"><em class="open"></em>更多</span>
               </dd>
               
          </dl>
          <dl class="listIndex more-none" attr="terminal_brand_s"  style="display:none;border:none">
            <dt style='visibility:hidden'>其他指标</dt>
            <dd >
              <label style='visibility:hidden'><a href="javascript:;" values2="" values1="" attrval="不限">不限</a></label>
                <label>
                <input name="checkbox2" type="checkbox" value="市场环境"  autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="zte中兴">市场环境好</a></label>
                <label>
                <input name="checkbox2" type="checkbox" value="组织与管理"  autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="zte中兴">组织与管理能力强</a></label>
                <label>
                <input name="checkbox2" type="checkbox" value="团队水平"   autocomplete="off"/>
                <a href="javascript:;" values2="" values1="" attrval="zte中兴">团队水平高</a></label>
              
          </dl>        
        </div>
      </div>   
    </div>

    </div>
    
    <div class="hasBeenSelected clearfix"><span id="time-num"><font>4</font>类选择</span> 
          <div style="float:right;" class="eliminateCriteria">【清空全部】 </div>
          <dl>
            <dt>已选条件：</dt>
            <dd style="DISPLAY: none" class=clearDd>
              <div class=clearList></div>
          </dl>
        </div>
        
        </form>
      <script type="text/javascript" src="<%= basePath%>/static/uStyle/js/shaixuan.js"></script> 
  </div>
</div>

</body>
</html>