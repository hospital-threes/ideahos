<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/7
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>校验</title>
   <%-- <title>正则表达式</title>--%>
    <meta charset="utf-8">
    <title>Bootstrap 实例 - 水平表单</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

    <script>

        //用户名的规则： 第一位是字母，只有由数字与字母 组成，6位。
        function checkName(){
            //获取到了用户名的值
            var userName = document.getElementById("username").value;
            var userSpan = document.getElementById("userId");
            var reg = /^[a-z][a-z0-9]{5}$/i;
            if(reg.test(userName)){
                //符合规则
                userSpan.innerHTML="正确".fontcolor("green");
                return true;
            }else{
                //不符合规则
                userSpan.innerHTML="第一位是字母，只有由数字与字母 组成，6位！！".fontcolor("red");
                return false;
            }
        }


        //校验密码  6位
        function checkPass(){
            var  password  = document.getElementById("pwd").value;
            if(password.length>0){
                var reg = /^\w{6}$/;
                var passSPan = document.getElementById("passId");
                if(reg.test(password)){
                    //符合规则
                    passSPan.innerHTML="正确".fontcolor("green");
                    return true;
                }else{
                    //不符合规则
                    passSPan.innerHTML="请输入密码6位".fontcolor("red");

                    return false;
                }
            }

        }


        //检验密码是否正确
        function ensurepass(){
            var  password1 = document.getElementById("pwd").value; //第一次 输入的密码
            var password2 = document.getElementById("ensurepwd").value;
            if(password2.length>0){
                var enSpan  = document.getElementById("ensure");
                if(password1.valueOf()==password2.valueOf()){
                    enSpan.innerHTML="正确".fontcolor("green");
                    return true;
                }else{
                    enSpan.innerHTML="密码不一致！！！".fontcolor("red");
                    return false;
                }
            }
        }


        //校验邮箱
        function checkEmail(){
            var  email  = document.getElementById("email").value;
            var reg = /^[a-z0-9]\w+@[a-z0-9]{2,3}(\.[a-z]{2,3}){1,2}$/i;  // .com .com.cn
            var emailspan = document.getElementById("emailspan");
            alert(reg.test(email));
            if(reg.test(email)){
                //符合规则
                emailspan.innerHTML="正确".fontcolor("green");

                return true;
            }else{
                //不符合规则
                emailspan.innerHTML="邮箱错误".fontcolor("red");
                return false;
            }
        }


        //校验兴趣爱好： 至少要算中其中 的 一个。
        function checkHoby(){
            var likes  = document.getElementsByName("like");
            var hobySpan =document.getElementById("hobbySpan")
            var flag  = false;
            for(var i =  0 ; i<likes.length ; i++){
                if(likes[i].checked){
                    flag =true;
                    break;
                }
            }

            if(flag){
                //符合规则
                hobySpan.innerHTML="正确".fontcolor("green");
                return true;
            }else{
                //不符合规则
                hobySpan.innerHTML="错误".fontcolor("red");
                return false;
            }
        }



        //总体校验表单是否可以提交了  如果返回的true表单才可以提交。 上面的表单项必须要每个都填写正确。
        function checkForm(){
            var userName = checkName();
            var pass  = checkPass();
            var ensure  = ensurepass();
            var email = checkEmail();
            var hoby = checkHoby();
            alert("请完善资料！！！");
            if(userName&&pass&&ensure&&email&&hoby){
                var name=$("#name").val();
                var tel=$("#tel").val();
                return true;
            }else{
                return false;
            }

        }







    </script>



<body>
<form action="success.jsp" method="get" onsubmit="return checkForm()"> <!--如果表单提交时候触发的方法返回是false,那么该表单不允许提交，如果返回的是true允许提交 -->
    <table border="1px" width="50%" align="center" cellspacing="0px" cellpadding="3px">
        <tr>
            <td width="25%">姓名:</td>
            <td>
                <input type="text" name="username" id="username" onblur="checkName()"/>
                <span id="userId"></span>
            </td>
        </tr>
        <tr>
            <td >密码:</td><td>
            <input type="password"  name="pwd" id="pwd" onblur="checkPass()"/>
            <span id="passId"></span>
        </td>
        </tr>
        <tr>
            <td>确认密码:</td><td>
            <input type="password" name="ensurepwd" id="ensurepwd" onblur="ensurepass()" />                        <span id="ensure"></span>
        </td>
        </tr>
        <tr>
            <td>邮箱</td><td>
            <input type="text" name="email" id="email" onblur="checkEmail()"/>
            <span id="emailspan"></span>

        </td>
        </tr>
        <tr>
            <td>性别</td><td>
            <input type="radio" checked="ture" name="gender" id="male" value="male"/>
            男
            <input type="radio" name="gender" value="female"/>

            女</td>
        </tr>

        <tr>
            <td>爱好:</td><td>
            <input type="checkbox" checked="checked"  name="like" />
            eat
            <input type="checkbox" name="like" />
            sleep
            <input type="checkbox" name="like"/>
            play
            <span id="hobbySpan"></span>
        </td>
        </tr>
        <tr>
            <td>城市</td><td>
            <select name="city" id="city">
                <option value=""> 请选择</option>
                <option value="bj"> 北京 </option>
                <option value="gz"> 广州 </option>
                <option value="sh"> 上海 </option>
            </select>

        </td>
        </tr>
        <tr>
            <td>自我介绍</td><td>                    <textarea cols="15" rows="5"  name="myInfo" id="myInfo"></textarea></td>
        </tr>
        <tr align="center">
            <td colspan="2"><!--提交按钮-->
                <input type="submit"/>
            </td>
        </tr>
    </table>
</form>
</body>
