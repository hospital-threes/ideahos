<%--
  Created by IntelliJ IDEA.
  User: 张彦超
  Date: 2019/8/26
  Time: 9:23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/header.jsp"%>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
    <div id="weatherDiv" style="text-align: center;vertical-align: middle;">
        <form id="weatherForm" style="" hidden="hidden">
            <input id="weatherDescription" name="weatherDescription" value="">
            <input id="windPower" name="windPower" value="">
            <input id="humidity" name="humidity" value="">
            <input id="temperature" name="temperature" value="">
            <input id="windDirection" name="windDirection" value="">
            <input id="city" name="city" value="">
            <input id="dateY" name="dateY" value="">
            <input id="wind" name="wind" value="">
        </form>
        <button onclick="getWeather()" style="width: 160px;height: 30px;margin-top: 20px;">测试获取天气数据入库</button>
    </div>
</body>
</html>
<script type="text/javascript">
    //定时查询天气
    setInterval(function(){
        getWeather()
    },5*60*1000);
    //获取天气数据
    function getWeather() {
        $.ajax({
            url:"http://v.juhe.cn/weather/index?cityname=%E5%8C%97%E4%BA%AC&dtype=json&format=2&key=08bdb39ca01c375f3c76d12ed22b57e6",
            type:"get",
            dataType:"jsonp",
            //cityname=%E5%8C%97%E4%BA%AC&dtype=json&format=2&key=08bdb39ca01c375f3c76d12ed22b57e6
           /* data:{
                cityname:'北京',
                dtype:'json',
            },*/
            success:function(data){
        /*"sk":{
                    "wind_direction":"西北风",
                    "wind_strength":"0级",
                    "humidity":"50%",
                },*/
                var sk = data.result.sk;
                var today = data.result.today;
                /*"temperature":"-5℃~8℃",
                  "weather":"晴",
                  "wind":"西南风微风",
                  "week":"星期三",
                  "city":"北京",
                  "date_y":"2019年12月04日",*/
                var futur = data.result.future;



                $("#windDirection").val(sk.wind_direction);//风向
                $("#windPower").val(sk.wind_strength);//风力
                $("#humidity").val(sk.humidity);//湿度
                $("#temperature").val(today.temperature);//温度
                $("#weatherDescription").val(today.weather);//城市
                $("#city").val(today.city);//城市
                $("#dateY").val(today.date_y);//
                $("#wind").val(today.week);//
                addWeather();
            },error:function(){
                alert("getWeather执行异常");
            }
        });
    }
    //添加天气情况
    function addWeather() {
        $.ajax({
            url:"${pageContext.request.contextPath}/Weather/addWeather_1",
            type:"get",
            dataType:"json",
            data:$("#weatherForm").serialize(),
            processData: false,
            contentType: false,
            success:function(data){
                alert("addWeather执行完毕")
            },error:function(){
                alert("addWeather执行异常");
            }
        });
    }
</script>