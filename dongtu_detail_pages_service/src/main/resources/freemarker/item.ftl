<!doctype html>
<meta http-equiv="Access-Control-Allow-Origin" content="*"/>
<html>
<head>
    <meta charset="utf-8">
    <title>东途旅游，随心而行，随意而留</title>
    <link rel="shortcut icon" href="bitbug_favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <link rel="stylesheet" type="text/css" href="css/global.css"/>
    <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="css/pages-item.css"/>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <script src="js/common.js" type="text/javascript" charset="utf-8"></script>
    <#--日历插件-->
    <link rel="stylesheet" href="calendar/css/calendar-pro.css"/>
    <#--<script src="calendar/js/jquery-2.1.4.min.js"></script>-->
    <script src="calendar/js/calendar-pro.js"></script>
    <script type="text/javascript">
        $(function () {
            // 导航
            $(".nav>ul>li").mouseenter(function (event) {
                $(this).addClass("cur").siblings().removeClass("cur")
                $(this).children(".yincang").stop().slideDown()

            });
            $(".nav>ul>li").mouseleave(function (event) {
                $(this).removeClass("cur")
                $(this).children(".yincang").stop().slideUp()
            });
            // tejia
            $(".tejia .wenzi span").mouseenter(function (event) {
                $(this).addClass("cur").siblings().removeClass("cur")
            });
            // 品牌目的地
            $(".pinpai_inr ul li").mouseenter(function (event) {
                $(this).addClass("cur").siblings().removeClass("cur")
            });
            $(".pinpai_inr ul li").mouseleave(function (event) {
                $(".pinpai_inr ul li").removeClass("cur")
            });
            //
            $(".tututu").mouseenter(function (event) {
                $(this).children(".heibu").stop().slideDown()
            });
            $(".tututu").mouseleave(function (event) {
                $(this).children(".heibu").stop().slideUp()
            });
            //banner
            var nowing = 0
            var $imglis = $(".banner .list0 li")
            var $fadeCover = $(".fadeCover")
            var fadeIntime = 500
            var fadeOutime = 800
            var $circle = $(".circle li")
            var timer

            // 定义函数
            function rightbtn() {
                // 先信号量的改变，

                nowing++
                if (nowing > $imglis.length - 1) {
                    nowing = 0
                }
                // 再调用函数
                dong();
            }

            // 定时器业务
            timer = setInterval(rightbtn, 2000)
            $(".banner").mouseenter(function () {
                clearInterval(timer)

            })
            $(".banner").mouseleave(function () {
                clearInterval(timer)
                timer = setInterval(rightbtn, 2000)
            })
            // 点击小圆点业务
            $circle.click(function () {
                nowing = $(this).index()
                dong()
            })

            function dong() {
                // 先让fadecover淡入，让全局变白
                $fadeCover.fadeIn(fadeIntime, function () {
                    // ,function(){
                    // 回调函数中，就表示fadecover淡入后做的事情。
                    // 换图是干蹦的，不是淡入淡出的换,进行暗箱操作，兄弟去cur，自己加cur
                    $imglis.eq(nowing).addClass('cur').siblings().removeClass('cur')
                    // 淡出让黑布小事
                    $(this).fadeOut(fadeOutime)
                })
                $circle.eq(nowing).addClass("cur").siblings().removeClass("cur")
            }

        })
    </script>
    <script type="text/javascript">
        $(document).ready(function () {
            var showproduct = {
                "boxid": "showbox",
                "sumid": "showsum",
                "boxw": 400,//宽度,该版本中请把宽高填写成一样
                "boxh": 400,//高度,该版本中请把宽高填写成一样
                "sumw": 60,//列表每个宽度,该版本中请把宽高填写成一样
                "sumh": 60,//列表每个高度,该版本中请把宽高填写成一样
                "sumi": 7,//列表间隔
                "sums": 5,//列表显示个数
                "sumsel": "sel",
                "sumborder": 1,//列表边框，没有边框填写0，边框在css中修改
                "lastid": "showlast",
                "nextid": "shownext"
            };//参数定义
            $.ljsGlasses.pcGlasses(showproduct);//方法调用，务必在加载完后执行
        });
    </script>
</head>
<body>
<#include "head.ftl">
<#--商品图片-->
<#assign imgs=travelProducts.tpImg?eval>
<div class="showall">
    <!--left -->

    <div class="showbot">
        <!--面包屑 -->
        >>>><a href="#">${area1.areaName}</a><span>-&ndash;&gt;>>></span><a
                href="#">${area2.areaName}</a><span>--->>>></span><a href="#">${area3.areaName}</a>
        <div id="showbox">
            <#list imgs as img>
                <img src="${img}" width="400" height="400">
            </#list>
        </div><!--展示图片盒子-->
        <div id="showsum">
            <!--展示图片里边-->
        </div>
        <p class="showpage">
            <a href="javascript:void(0);" id="showlast"> < </a>
            <a href="javascript:void(0);" id="shownext"> > </a>
        </p>
        <!-- 日历插件容器布局 -->
        <div class="calendar-box demo-box" style="height: 400px;width: 400px"></div>
        <#--<button onclick="getActive()">获取选中日期值</button>-->
    </div>
    <!--conet -->
    <div class="tb-property">
        <div class="tr-nobdr">
            <h4>${travelProducts.tpTitle}</h4>
        </div>
        <div class="txt">
            <span class="nowprice">￥<a href="">${travelProducts.minPrice?c}~${travelProducts.maxPrice?c}</a></span>
            <div class="cumulative">
                <span class="number ty1">累计售出<br/><em id="add_sell_num_363"></em></span>
                <span class="number tyu">累计评价<br/><em id="add_sell_num_364"></em></span>
            </div>
        </div>
        <div class="txt-h">
            <span class="tex-o">预订须知:&nbsp;&nbsp;&nbsp;商家将在4个工作小时内（工作日9:00-18:00）确认是否预定成功</span><br>

        </div>
        <div id="specification" class="summary-wrap clearfix">
            <span class="tex-o">酒店选择:</span>
            <select id="pubsId" onchange="changePrice(this.value)">
                <option value="-1">请选择入住酒店</option>
                <#list pubList as pub>
                    <option value="${pub.pubsId}">${pub.pubsName}</option>
                </#list>
            </select>
        </div>

        <div class="txt-h">
            <span class="tex-o">合计:<font size="4" color="red">¥<span id="price">${travelProducts.tpAdultPrice?c}</span></font></span>
        </div>
        <input type="hidden" id="exist">
        <script type="text/javascript">
            $(document).ready(function () {

                var t = $("#text_box");
                var adult = $("#adult");
                var child = $("#child");
                var price = $("#price");
                var house = $("#house")
                $('#min').attr('disabled', true);

                //成人票增加
                $("#add").click(function () {
                    if ($("#pubsId").val() == -1) {
                        alert("请先选择住宿酒店")
                        return;
                    }
                    t.val(parseInt(t.val()) + 1)
                    price.html(parseInt(price.text()) + parseInt(adult.val()))
                    if (parseInt(t.val()) != 1) {
                        $('#min').attr('disabled', false);
                    }

                })

                //成人票减少
                $("#min").click(function () {
                    t.val(parseInt(t.val()) - 1);
                    price.html(parseInt(price.text()) - parseInt(adult.val()))
                    if (parseInt(t.val()) == 1) {
                        $('#min').attr('disabled', true);
                    }

                })
                var t1 = $("#text_box1");

                $('#min1').attr('disabled', true);

                //儿童票增加
                $("#add1").click(function () {
                    if ($("#pubsId").val() == -1) {
                        alert("请先选择住宿酒店")
                        return;
                    }
                    t1.val(parseInt(t1.val()) + 1)
                    price.html(parseInt(price.text()) + parseInt(child.val()))
                    if (parseInt(t1.val()) != 0) {
                        $('#min1').attr('disabled', false);
                    }

                })

                //儿童票减少
                $("#min1").click(function () {
                    t1.val(parseInt(t1.val()) - 1);
                    price.html(parseInt(price.text()) - parseInt(child.val()))
                    if (parseInt(t1.val()) == 0) {
                        $('#min1').attr('disabled', true);
                    }

                })
                var t2 = $("#text_box2");

                $('#min2').attr('disabled', true);

                //房间增加
                $("#add2").click(function () {
                    if ($("#pubsId").val() == -1) {
                        alert("请先选择住宿酒店")
                        return;
                    }
                    t2.val(parseInt(t2.val()) + 1)
                    price.html(parseInt(price.text()) + parseInt(house.val()))
                    if (parseInt(t2.val()) != 1) {
                        $('#min2').attr('disabled', false);
                    }

                })

                //房间减少
                $("#min2").click(function () {
                    t2.val(parseInt(t2.val()) - 1);
                    price.html(parseInt(price.text()) - parseInt(house.val()))
                    if (parseInt(t2.val()) == 1) {
                        $('#min2').attr('disabled', true);
                    }
                })
            });

            //改变价格
            function changePrice(pubsId) {
                if (pubsId != -1) {
                    $.ajax({
                        url: "http://localhost:8003/comments/findPubByPubsId",
                        type: "post",
                        data: {pubsId: pubsId},
                        async: false,//同步
                        dataType: "json",
                        // crossDomain:true, //设置跨域为true
                        // xhrFields: {
                        //     withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
                        // },
                        success: function (result) {
                            $("#price").html(parseInt($("#original").val()) + parseInt(result.pubsPrice))
                            $("#house").val(result.pubsPrice);
                            $('#add').attr('disabled', false);
                            $('#add1').attr('disabled', false);
                            $('#add2').attr('disabled', false);
                        },
                        error: function (result) {
                            alert('系统错误');
                        }
                    })
                } else {
                    $("#price").html($("#original").val())
                    alert("请选择住宿酒店")
                    $('#add').attr('disabled', true);
                    $('#add1').attr('disabled', true);
                    $('#add2').attr('disabled', true);
                }
            }
        </script>
        <div class="gcIpt">
            <span class="guT">成人票</span>
            <input id="min" name="" type="button" value="-"/>
            <input id="text_box" name="adultNum" type="text" value="1"
                   style="width:30px; text-align: center; color: #0F0F0F;"/>
            <input id="add" name="" type="button" value="+"/>

            <span class="guT">儿童票</span>
            <input id="min1" name="" type="button" value="-"/>
            <input id="text_box1" name="childNum" type="text" value="0"
                   style="width:30px; text-align: center; color: #0F0F0F;"/>
            <input id="add1" name="" type="button" value="+"/>

            <span class="guT">房</span>
            <input id="min2" name="" type="button" value="-"/>
            <input id="text_box2" name="pubNum" type="text" value="1"
                   style="width:30px; text-align: center; color: #0F0F0F;"/>
            <input id="add2" name="" type="button" value="+"/>

        </div>
        <div style="margin-left:20%">
            <button style="background-color:red;width:75px;height:40px" onclick="goOrder()">立即购买</button>
            <input type="button" id="enshrine" style="background-color: cyan;width:75px;height:40px" value="收藏"
                   onclick="collectProduct()">
            已收藏<input type="text" id="num" size="5" readonly="readonly"
                      style='border: none;outline: none;background: #F7F7F7;text-align:center;font-size: 20px'>次
        </div>

        <div id="HAO">
            <input type="hidden" id="adult" value="${travelProducts.tpAdultPrice?c}">
            <input type="hidden" id="child" value="${travelProducts.tpChildPrice?c}">
            <input type="hidden" id="tpId" value="${travelProducts.tpId?c}">
            <input type="hidden" id="tpSellerId" value="${travelProducts.tpSellerId?c}">
            <input type="hidden" id="house">
            <input type="hidden" id="original" value="${travelProducts.tpAdultPrice?c}">

        </div>
    </div>

    <!-- 商品介紹 -->
</div>
<div class="gdetail">
    <!-- left -->
    <div class="aside" style="margin-top:15%">
        <h3>看了还看<span><img src="images/fod.png" width="22" height="22"/>换一批</span></h3>
        <dl class="ac-mod-list">
            <dt><a href="https://www.taobao.com/"><img src="images/hdy_09.png"/></a></dt>
            <dd>
                O2+车载空气净化器DM2
                <span>￥99</span>
            </dd>
        </dl>
        <dl class="ac-mod-list">
            <dt><a href=""><img src="images/hdy_07.png"/></a></dt>
            <dd>
                O2+车载空气净化器DM2
                <span>￥99</span>
            </dd>
        </dl>
        <dl class="ac-mod-list">
            <dt><a href=""><img src="images/hdy_11.jpg"/></a></dt>
            <dd>
                O2+车载空气净化器DM2
                <span>￥99</span>
            </dd>
        </dl>
    </div>
    <!-- right -->
    <script>
        var detail = document.querySelector('.detail');
        var origOffsetY = detail.offsetTop;

        function onScroll(e) {
            window.scrollY >= origOffsetY ? detail.classList.add('sticky') :
                detail.classList.remove('sticky');
        }

        document.addEventListener('scroll', onScroll);
    </script>
    <div class="detail" style="margin-top:15%">
        <div class="active_tab" id="outer">
            <ul class="act_title_left" id="tab">
                <li class="act_active">
                    <a href="#ui-a">产品介绍</a>
                </li>
                <li>
                    <a href="#ui-c">购买须知</a>
                </li>
                <li>
                    <a href="#uic">商品评价</a>
                </li>

            </ul>

            <div class="clear"></div>
        </div>
        <div id="content" class="active_list">
            <!--0-->
            <div id="ui-a" class="ui-a">
                <#--<ul style="display:block;">-->
                <#--<li>商品名称：仙人指路道镜前后双录智能后视镜导航仪行车记录仪后视预警一体机</li>-->
                <#--<li>商品编号：ECS001983</li>-->
                <#--<li>品牌</li>-->
                <#--<li>上架时间：2016-05-24</li>-->
                <#--<li>商品毛重：0克</li>-->
                <#--</ul>-->
                产品介绍：${param.tpIntroduce}
            </div>

            <!--购买须知-->

            <div id="ui-c" class="ui-c">
                购买须知：${param.tpBuyNotes}

            </div>
            <!--商品评价-->
            <div id="uic" class="uic">
                <h3>用户点评:</h3>
                <div id="comment">
                    <#--商品评论-->
                </div>
            </div>
        </div>
        <script>
            $(function () {
                window.onload = function () {
                    var $li = $('#tab li');
                    var $ul = $('#content ul');

                    $li.mouseover(function () {
                        var $this = $(this);
                        var $t = $this.index();
                        $li.removeClass();
                        $this.addClass('act_active');
                        $ul.css('display', 'none');
                        $ul.eq($t).css('display', 'block');
                    })
                }
            });
        </script>
    </div>
</div>


</body>
</html>
<script type="text/javascript">
    $(function () {
        //获得评论信息   评论数    购买数
        CommentInfo()
        //收藏数
        collectNum()
        //查询商品标签
        CheckTheLabel()
    })

    //评论
    function CommentInfo() {
        //获得评论信息   评论数    购买数
        $.ajax({
            url: "http://localhost:8003/comments/findComments",
            type: "post",
            data: {tpId: $("#tpId").val()},
            async: false,//同步
            dataType: "json",
            xhrFields: {
                withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
            },
            success: function (result) {
                var comments = result['comments'];
                var commentsList = result['commentsList'];
                var ticketNumber = result['ticketNumber'];
                var comment = "";
                $(commentsList).each(function (i, e) {
                    comment += "<hr style='background-color:blue;height:1px;border:none;'><table><tr><td><img src='" + e['headPic'] + "' style='width: 50px;height: 50px'></td>";
                    comment += "<td>" + e['userName'] + "</td></tr>";
                    comment += "<tr><td>评论内容：</td><td>" + e['content'] + "</td></tr>";
                    comment += "<tr><td>日期：</td><td>" + e['commentTime'] + "</td></tr></table>";
                })
                $("#comment").html(comment);
                $("#add_sell_num_363").html(ticketNumber);
                $("#add_sell_num_364").html(comments);
            },
            error: function () {
                alert('系统错误');
            }
        })
    }

    //收藏数
    function collectNum() {
        $.ajax({
            url: "http://localhost:8003/collect/findCollectNum",
            type: "post",
            data: {tpId: $("#tpId").val()},
            async: false,//同步
            dataType: "json",
            xhrFields: {
                withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
            },
            success: function (result) {
                var num = result.num;
                $("#num").val(num);
                if (result.user == 1) {
                    $("#enshrine").attr("disabled", true);
                    $("#enshrine").val("已收藏");
                }
                if (result.user == 0) {
                    $("#enshrine").attr("disabled", false);
                }

            },
            error: function () {
                alert('系统错误');
            }
        })
    }

    //收藏
    function collectProduct() {
        $.ajax({
            url: "http://localhost:8003/collect/saveCollectProduct",
            type: "post",
            data: {tpId: $("#tpId").val()},
            async: false,//同步
            dataType: "json",
            // crossDomain:true, //设置跨域为true
            xhrFields: {
                withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
            },
            success: function (result) {
                if (result.user == 0) {
                    alert("请先登录");
                    location.href = "http://localhost:8003/loginController/login";
                } else {
                    alert("收藏成功")
                    // $("#enshrine").attr("disabled", true);
                    window.location.reload()
                }
            },
            error: function () {
                alert('系统错误');
            }
        })
    }

    //查询商品标签
    function CheckTheLabel() {
        $.ajax({
            url: "http://localhost:8003/label/findLabel",
            type: "post",
            data: {tpId: $("#tpId").val()},
            async: false,//同步
            dataType: "json",
            xhrFields: {
                withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
            },
            success: function (result) {
                var label = [];
                $(result).each(function (i, e) {
                    label.push(e['tagId'])
                })
                //没登录的话就不给放缓存
                if ($("#exist").val() != "") {
                    increase(label);
                }
            },
            error: function () {
                alert('系统错误');
            }
        })
    }

    //数据存入缓存
    function increase(label) {
        $.ajax({
            url: "http://localhost:8003/label/StatisticaLabel",
            type: "post",
            data: {label: label, tpId: $("#tpId").val()},
            async: false,//同步
            dataType: "json",
            xhrFields: {
                withCredentials: true //默认情况下，标准的跨域请求是不会发送cookie的
            },
            success: function (result) {

            },
            error: function () {
                alert('系统错误');
            }
        })
    }
</script>
<script>
    $('.calendar-box').calendar({
        ele: '.demo-box', //依附
        title: '选择时间',
        // beginDate: '2020-01-01',
        // endDate: '2020-03-31',
        data: [
            {date: '2020-01-06', data: $("#original").val()},
            {date: '2020-01-07', data: $("#original").val()},
            {date: '2020-01-08', data: $("#original").val()},
            {date: '2020-01-09', data: $("#original").val()},
            {date: '2020-01-10', data: $("#original").val()},
            {date: '2020-01-11', data: $("#original").val()},
            {date: '2020-01-12', data: $("#original").val()},
            {date: '2020-01-13', data: $("#original").val()},
            {date: '2020-01-14', data: $("#original").val()},
            {date: '2020-01-15', data: $("#original").val()},
            {date: '2020-01-16', data: $("#original").val()},
            {date: '2020-01-17', data: $("#original").val()},
            {date: '2020-01-18', data: $("#original").val()},
            {date: '2020-01-19', data: $("#original").val()},
            {date: '2020-01-20', data: $("#original").val()},
            {date: '2020-01-21', data: $("#original").val()},
            {date: '2020-01-22', data: $("#original").val()},
            {date: '2020-01-23', data: $("#original").val()},
            {date: '2020-01-24', data: $("#original").val()},
            {date: '2020-01-25', data: $("#original").val()},
            {date: '2020-01-26', data: $("#original").val()},
            {date: '2020-01-27', data: $("#original").val()},
            {date: '2020-01-28', data: $("#original").val()},
            {date: '2020-01-29', data: $("#original").val()},
            {date: '2020-01-30', data: $("#original").val()},
            {date: '2020-01-31', data: $("#original").val()},
        ]
    });

    // // 获取选中的数据
    // function getActive() {
    //     var data = $('.calendar-box').calendarGetActive();
    //     alert(data.date + "--¥" + data.money);
    // }
</script>

<script>
    function goOrder() {
        var data = $('.calendar-box').calendarGetActive();
        var pubId = $("#pubsId option:selected").val();
        if (pubId == -1) {
            alert("请选择酒店")
        } else if (data.date == "" || data.date == null) {
            alert("请选择出行日期")
        } else {
            var prodCost = parseInt($("[name=adultNum]").val()) * parseInt($("#adult").val()) + parseInt($("[name=childNum]").val()) * parseInt($("#child").val())
            var pubCost = parseInt($("[name=pubNum]").val()) * parseInt($("#house").val());
            var travelNum = parseInt($("[name=adultNum]").val()) + parseInt($("[name=childNum]").val());
            location.href = "http://localhost:8003/order/orderPage?pubId=" + $("#pubsId option:selected").val() + "&sellerId=" + $("#tpSellerId").val() +
                "&pubName=" + $("#pubsId option:selected").text() + "&adultNum=" + $("[name=adultNum]").val() + "&childNum=" + $("[name=childNum]").val() +
                "&pubNum=" + $("[name=pubNum]").val() + "&pubPrice=" + $("#house").val() + "&prodCost=" + prodCost + "&pubCost=" + pubCost +
                "&tpGoTime=" + data.date + "&totalFee=" + $("#price").text() + "&travelNum=" + travelNum + "&prodId=" + $("#tpId").val();
        }
    }
</script>
