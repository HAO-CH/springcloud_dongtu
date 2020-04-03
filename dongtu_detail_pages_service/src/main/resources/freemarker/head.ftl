<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
    <div class="header1" >
        <div class="header1-in">
        <div class="logo">
            <a href="#"><h3>东&nbsp;&nbsp;途&nbsp;&nbsp;旅&nbsp;&nbsp;游</h3></a>
            <!--客服电话-->
            <div>
                <span class="h_tel_icon"></span>
                <p class="text" id="service_phone_head_text"><font color="#7cfc00">全球24h客户专属服务</font><em class=""></em></p>
                <p class="tel" id="service_phone_head_tel"><font size="5" color="#7fff00"><b>免费热线:</b></font><font color="fuchsia">4007-999-999</font></p>
                <span class="h_mingxing_icon"></span>
            </div>
        </div>

        <div class="search">
            <form action="http://localhost:8003/esController/findByEs" method="post" class="sui-form form-inline">
                <div class="search-left">搜索</div>
                <div class="search-center">
                    <input type="text" class="tex1" name="str" placeholder="地区/景点名称"/>
                </div>
                <button class="search-right" type="submit"/>
            </form>
        </div>
         <div>
             <button onclick="daka()" style="height: 30px ;width: 50px;color:chartreuse;background: #009900" title="签到">签&nbsp;&nbsp;到</button>
         </div>
        <div class="zuce" id="login">

        </div>
    </div>
</div>
<div class="nav">
    <ul class="ul1">
        <li class="level1 cur first"><a class="a1" href="http://localhost:8003/loginController/toIndex">首页</a></li>
        <li class="level1"><a class="a1" href="#">目的地</a>
            <ul class="yincang">
                <!--跳转自由行页面-->
                <li><a href="http://localhost:8003/freeController/toFree">自由行</a></li>
                <li><a href="http://localhost:8003/pockageTour/toPackageTour">跟团游</a></li>
            </ul>
        </li>
        <li class="level1"><a class="a1" href="#">发现</a>
            <ul class="yincang">
                <li><a href="http://localhost:8003/localHotel/toLocalHotel">当地酒店</a></li>
            </ul>
        </li>
        <li class="level1"><a class="a1" href="http://localhost:8003/userOrderController/centeList">个人</a></li>
        <li class="level1"><a class="a1" href="#">积分城</a>
            <ul class="yincang">
                <li><a href="http://localhost:8003/integralController/findList">积分商城</a></li>
            </ul>
        </li>
        <li class="level1"><a class="a1" href="#">预定</a>
            <ul class="yincang">
                <li><a href="http://localhost:8003/pubController/findList">酒店</a></li>
                <li><a href="http://localhost:8003/train/toTrain">火车票</a></li>

            </ul>
        </li>
        <li class="level1"><a class="a1" href="#">娱乐</a>
            <ul class="yincang">
                <li><a href="http://localhost:8003/travelsController/toGame">俄罗斯小游戏</a></li>
                <li><a href="http://localhost:8003/travelsController/toCatGame">汽车--游戏</a></li>
            </ul>
        </li>
    </ul>
</div>
    <script>
        $(function () {
            login();
        })
        function login() {
            $.ajax({
                url: "http://localhost:8003/loginController/logoutAnlong",
                data: {},
                type: "post",
                dataType: "json",
                async: false,
                // crossDomain:true, //设置跨域为true
                xhrFields: {
                    withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
                },
                success: function (result) {
                    var user =result.data;
                    var div = "";

                    if (result.code == 10000){
                        div += "<a href='http://localhost:8003/loginController/login'>登录</a>";
                        div += "<a href='http://localhost:8003/registerController/register'>注册</a>";
                        $("#exist").val("")
                    }
                    if (result.code == 20000){
                        div+="<table>";
                        div+="<tr>";
                        div+="<td><img style='width: 50px; height: 50px;' src='"+user.userHeadPic+"'></td>";
                        div+="<td><font color='red'> "+user.userName+"</font>&nbsp;&nbsp;<a href='http://localhost:8003/loginController/logout'>退出登录</a></td>";
                        div+="<tr>";
                        div+="</tr>";
                        div+="</table>";
                        $("#exist").val(user.userName)
                    }
                    $("#login").html(div);
                },
                error: function () {
                    alert("系统错误");
                }
            });
        }
        //打卡
        function daka() {
            $.ajax({
                url: "http://localhost:8003/loginController/daka",
                data: {},
                type: "post",
                dataType: "json",
                async: false,
                xhrFields: {
                    withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
                },
                success: function (result) {
                    // console.log(result)
                    if (result.code == 10000){
                        alert(result.msg)
                    }else {
                        alert(result.msg)
                    }
                },
                error: function () {
                    alert("系统错误");
                }
            });
        }
    </script>
</html>