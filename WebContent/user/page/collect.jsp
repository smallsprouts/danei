<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>



<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>达内商城收藏夹</title>
    <link href="../css/header.css" rel="stylesheet" />
    <link href="../css/my.collect.css" rel="stylesheet" />
    <link href="../css/footer.css" rel="stylesheet" />
</head>
<body>
<!-- 页面顶部-->
<header id="top">
    <div id="logo" class="lf">
        <img class="animated jello" src="../img/header/logo.png" alt="logo"/>
    </div>
    <div id="top_input" class="lf">
        <input id="input" type="text" placeholder="请输入您要搜索的内容"/>

        <a href="" class="rt"><img id="search" src="../img/header/search.png" alt="搜索"/></a>
    </div>
    <div class="rt">
        <ul class="lf">
            <li><a href="index.html" >首页</a><b>|</b></li>
            <li><a href="collect.html" >收藏</a><b>|</b></li>
            <li><a href="order.html" >订单</a><b>|</b></li>
            <li><a href="cart.html" >购物车</a><b>|</b></li>
            <li><a href="password-change.html">设置</a><b>|</b></li>
            <li><a href="login.html">退出</a><b>|</b></li>
            <li><a href="lookforward.html">帮助</a></li>
        </ul>
    </div>
</header>
<!-- nav主导航-->

<div class="modal" style="display:none">
    <div class="modal_dialog">
        <div class="modal_header">
            删除提醒
        </div>
        <div class="modal_information">
            <img src="../img/model/model_img2.png" alt=""/>
            <span>确定删除您的这个宝贝吗？</span>

        </div>
        <div class="yes"><span>删除</span></div>
        <div class="no"><span>不删除</span></div>
    </div>
</div>
<div class="modalNo" style="display:none">
    <div class="modal_dialog">
        <div class="modal_header">
            删除提示
            <img src="../img/model/model_img1.png" alt="" class="rt close"/>
        </div>
        <div class="modal_information">
            <img src="../img/model/model_img2.png" alt=""/>
            <span>请选择商品</span>

        </div>

    </div>
</div>

<div class="modalAdd" style="display:none">
    <div class="modal_dialog">
        <div class="modal_header">
            添加提示
            <img src="../img/model/model_img1.png" alt="" class="rt close"/>
        </div>
        <div class="modal_information">
            <img src="../img/model/model_img2.png" alt=""/>
            <span>请选择商品</span>

        </div>

    </div>
</div>

<div class="big">
    <form  name="" action="" method="post" >
        <section id="section" >
            <div id="title">
                <b>收藏商品</b>
            </div>
            <div id="box" >

		        <div id="content_box" >
<%out.print(session.getAttribute("collect_list"));%>
                    
                    <!-- <div class="lf" id="d1">
                        <div class="img">
                            <a href="detail.html">
                            	<img src="../img/goods/9787115435101/collect.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="describe">
                            <p>Python数据科学指南</p>
                            <span class="price"><b>￥</b><span class="priceContent">66.2</span></span>
                            <span class="addCart"><a href="detail.html">查看</a></span>
                            <span class="succee" style="display: none">
                                 <img src="../img/myCollect/product_true.png" alt=""/>
                                 <span>已移入购物车</span>
                            </span>
                        </div>
                        <div class="mask" style="display: none">
                            <div class="maskNormal">
                                <img src="../img/myCollect/product_normal_big.png" alt=""/>
                            </div>
                        </div>
                    </div>

                    <div class="lf" id="d2">
                        <div class="img">
                            <a href="detail.action?isbn=9787111545682">
                            	<img src="../img/goods/9787111545682/collect.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="describe">
                            <p>Linux运维最佳实践</p>
                            <span class="price"><b>￥</b><span class="priceContent">56.5</span></span>
                            <span class="addCart"><a href="detail.action?isbn=9787111545682">查看</a></span>
                            <span class="succee" style="display: none">
                                 <img src="../img/myCollect/product_true.png" alt=""/>
                                 <span>已移入购物车</span>
                            </span>
                        </div>
                        <div class="mask" style="display: none">
                            <div class="maskNormal">
                                <img src="../img/myCollect/product_normal_big.png" alt=""/>
                            </div>
                        </div>
                    </div>

                    <div class="lf" id="d3">
                        <div class="img">
                            <a href="detail.action?isbn=9787115335500">
                            	<img src="../img/goods/9787115335500/collect.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="describe">
                            <p>深入浅出Node.js</p>
                            <span class="price"><b>￥</b><span class="priceContent">57.3</span></span>
                            <span class="addCart"><a href="detail.action?isbn=9787115335500">查看</a></span>
                            <span class="succee" style="display: none">
                                 <img src="../img/myCollect/product_true.png" alt=""/>
                                 <span>已移入购物车</span>
                            </span>
                        </div>
                        <div class="mask" style="display: none">
                            <div class="maskNormal">
                                <img src="../img/myCollect/product_normal_big.png" alt=""/>
                            </div>
                        </div>
                    </div>

                    <div class="lf" id="d4">
                        <div class="img">
                            <a href="detail.action?isbn=9787111532644">
                            	<img src="../img/goods/9787111532644/collect.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="describe">
                            <p>架构即未来</p>
                            <span class="price"><b>￥</b><span class="priceContent">81.0</span></span>
                            <span class="addCart"><a href="detail.action?isbn=9787111532644">查看</a></span>
                            <span class="succee" style="display: none">
                                 <img src="../img/myCollect/product_true.png" alt=""/>
                                 <span>已移入购物车</span>
                            </span>
                        </div>
                        <div class="mask" style="display: none">
                            <div class="maskNormal">
                                <img src="../img/myCollect/product_normal_big.png" alt=""/>
                            </div>
                        </div>
                    </div>

                    <div class="lf" id="d5">
                        <div class="img">
                            <a href="detail.action?isbn=9787111563891">
                            	<img src="../img/goods/9787111563891/collect.jpg" alt=""/>
                            </a>
                        </div>
                        <div class="describe">
                            <p>面向机器智能的TensorFlow实践</p>
                            <span class="price"><b>￥</b><span class="priceContent">56.5</span></span>
                            <span class="addCart"><a href="detail.action?isbn=9787111563891">查看</a></span>
                            <span class="succee" style="display: none">
                                 <img src="../img/myCollect/product_true.png" alt=""/>
                                 <span>已移入购物车</span>
                            </span>
                        </div>
                        <div class="mask" style="display: none">
                            <div class="maskNormal">
                                <img src="../img/myCollect/product_normal_big.png" alt=""/>
                            </div>
                        </div>
                    </div> -->

			    </div>
                </div>
        </section>

    </form>
    <div class="none" style="display: none">
        <div class="none_content">
            <img src="../img/model/model_img3.png" alt="" class="lf"/>
            <p class="lf">您的收藏夹竟然还是空哒( ⊙ o ⊙ )</p>
            <span class="lf">赶快去收藏商品吧！</span>
            <a href="#" class="lf">去购物>></a>
        </div>

    </div>
</div>
<!-- 品质保障，私人定制等-->
<div id="foot_box">
    <div class="icon1 lf">
        <img src="../img/footer/icon1.png" alt=""/>

        <h3>品质保障</h3>
    </div>
    <div class="icon2 lf">
        <img src="../img/footer/icon2.png" alt=""/>

        <h3>私人定制</h3>
    </div>
    <div class="icon3 lf">
        <img src="../img/footer/icon3.png" alt=""/>

        <h3>学员特供</h3>
    </div>
    <div class="icon4 lf">
        <img src="../img/footer/icon4.png" alt=""/>

        <h3>专属特权</h3>
    </div>
</div>
<!-- 页面底部-->
<div class="foot_bj">
    <div id="foot">
        <div class="lf">
            <p class="footer1"><img src="../img/footer/tedu.png" alt="" class=" footLogo"/></p>
            <p class="footer2"><img src="../img/footer/footerFont.png"alt=""/></p>
            <!-- 页面底部-备案号 #footer -->
            <div class="record">
                2001-2016 版权所有 京ICP证8000853号-56
            </div>
        </div>
        <div class="foot_left lf" >
            <ul>
                <li><a href="#"><h3>买家帮助</h3></a></li>
                <li><a href="#">新手指南</a></li>
                <li><a href="#">服务保障</a></li>
                <li><a href="#">常见问题</a></li>
            </ul>
            <ul>
                <li><a href="#"><h3>商家帮助</h3></a></li>
                <li><a href="#">商家入驻</a></li>
                <li><a href="#">商家后台</a></li>
            </ul>
            <ul>
                <li><a href="#"><h3>关于我们</h3></a></li>
                <li><a href="#">关于达内</a></li>
                <li><a href="#">联系我们</a></li>
                <li>
                    <img src="../img/footer/wechat.png" alt=""/>
                    <img src="../img/footer/sinablog.png" alt=""/>
                </li>
            </ul>
        </div>
        <div class="service">
            <p>达内商城客户端</p>
            <img src="../img/footer/ios.png" class="lf">
            <img src="../img/footer/android.png" alt="" class="lf"/>
        </div>
        <div class="download">
            <img src="../img/footer/erweima.png">
        </div>
    </div>
</div>

<script src="../js/jquery-3.1.1.min.js"></script>
<script src="../js/collect.js"></script>
<script>
    $(function(){
        if(!$(".imfor")) {
            $('#section').hide();
            $('.none').show();
        }
    })
    //搜索下拉
    $('.seek').focus(function(){

        if($(this).hasClass('clickhover')){

            $(this).removeClass('clickhover');
            $(this).find('.seek_content').hide();
            $(this).find('img').attr('src','../img/header/header_normal.png');

        }else{
            $(this).addClass('clickhover');
            $(this).find('.seek_content').show();
            $(this).find('img').attr('src','../img/header/header_true.png');
        }
    })
    $('.seek_content>div').click(function(){
        $('.seek').removeClass('clickhover');
        var text=$(this).html();
        $('.seek span').html(text);
        $(this).parent().hide();
        $('.seek').find('img').attr('src','../img/header/header_normal.png');
        $('.seek').blur();

    })

    $('.seek').blur(function(){

        $('.seek').removeClass('clickhover');
        $('.seek_content').hide();

        $('.seek').find('img').attr('src','../img/header/header_normal.png');
        console.log(1);
    })
    $(".care").hover(function(){
        $(this).attr('src',"../img/header/care1.png");
    },function(){
        $(this).attr('src',"../img/header/care.png");
    });
    $(".order").hover(function(){
        $(this).attr('src',"../img/header/order1.png");
    },function(){
        $(this).attr('src',"../img/header/order.png");
    });
    $(".shopcar").hover(function(){
        $(this).attr('src',"../img/header/shop_car1.png");
    },function(){
        $(this).attr('src',"../img/header/shop_car.png");
    });
</script>
</body>
</html>
