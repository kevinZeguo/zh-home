<template>
    <div class="home">
        <el-carousel height="680px">
            <el-carousel-item>
                <img class="pic" :src="banners[0].src" />
                <div class="txt">舒适，<br />家的意义。</div>
            </el-carousel-item>
            <el-carousel-item>
                <router-link to="/enrol" style="width: 100%;display: block;">
                    <img class="pic" :src="banners[1].src" />
                    <div class="txt">这个冬天，<br />告别寒冷。</div>
                    <div class="btns-box"><button type="button">明装采暖在线报名</button></div>
                </router-link>
            </el-carousel-item>
            <el-carousel-item>
                <router-link to="/quotation" style="width: 100%;display: block;">
                    <img class="pic" :src="banners[2].src" />
                    <!--
                    <div class="txt">舒适的家，没那么难。<br />一分钟获得免费报价</div>
                    <div class="btns-box"><button type="button">明装采暖在线报名</button></div>
                    -->
                    <div class="layout">
                        <div class="txt-box">
                            <p class="prop">“舒适的家，没那么难”</p>
                            <p class="name">1分钟获得<strong>免费</strong>报价</p>
                        </div>
                    </div>
                </router-link>
            </el-carousel-item>
        </el-carousel>
        <div class="home-container bg1">
            <div class="layout">
                <h2 class="home-tit">一个舒适的家</h2>
                <div class="home-intro">
                    <p>带给我们的不止是舒适、健康、安全和便捷，更多的是带给我们心灵舒适需求的满足。 </p>
                    <p>我们认为一个舒适的家，应该满足下面的标准：</p>
                </div>
                <ul class="home-one">
                    <li class="one-bg1">
                        <div class="one-bg">
                            <p class="name">良好的室内空气品质</p>
                            <p class="prop">温度均匀恒定</p>
                            <p class="prop">空气湿度相宜</p>
                            <p class="prop">有足够的新风量</p>
                            <p class="prop">空气的洁净度很高</p>
                        </div>
                    </li>
                    <li class="one-bg2">
                        <div class="one-bg">
                            <p class="name">有利健康的用水品质</p>
                            <p class="prop">水温均匀恒定</p>
                            <p class="prop">水质软硬适宜</p>
                            <p class="prop">饮水符合卫生标准</p>
                        </div>
                    </li>
                    <li class="one-bg3">
                        <div class="one-bg">
                            <p class="name">轻松便利的居家生活</p>
                            <p class="prop">智慧家庭，操作简单</p>
                            <p class="prop">让家庭更节能，智能，便利和舒适</p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="home-container bg2">
            <div class="layout">
                <h2 class="home-tit">众华舒适家</h2>
                <div class="home-intro">
                    <p>专注于舒适温度、适宜湿度、新鲜空气、健康饮水、恒温热水、智能厨房、智能联控系统集成<br />解决方案，通过专业集成设计、标准化、一体化的集成施工，全年365天2小时即达即时尊享<br />售后服务保障，致力于打造舒适、健康、环保、节能、智能、集成的“五恒”舒适环境体验，创<br />造每一个“您” 对舒适环境的一切美好向往！</p>
                </div>
                <div class="home-two">
                    <p class="tit">专业·专注</p>
                
                    <ul>
                        <li>
                            <p class="name">100+</p>
                            <p class="prop">100+专业服务团队</p>
                        </li>
                        <li>
                            <p class="name">10年</p>
                            <p class="prop">连续10年全屋跟踪售后</p>
                        </li>
                        <li>
                            <p class="name">10万+</p>
                            <p class="prop">累计服务10万+家庭</p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="home-container bg3">
            <div class="layout">
                <h2 class="home-tit">传统方案4大难题</h2>
                <div class="home-intro">
                    <p>使用传统的装修方案，你一定遇到过/听说过</p>
                </div>
                <ul class="home-three">
                    <li>
                        <p class="name">采购难</p>
                        <div class="prop">
                            <p>价格不透明，后期增项太多！</p>
                        </div>
                    </li>
                    <li>
                        <p class="name">施工难</p>
                        <div class="prop">
                            <p>厂家各自为政，协调难。浪费管材、浪费精力、浪费时间！</p>
                        </div>
                    </li>
                </ul>
                <ul class="home-three">
                    <li>
                        <p class="name">服务难</p>
                        <div class="prop">
                            <p>没安全检测也没有售后，一出问题就是全屋被泡，各厂家之间相互推诿，无法一次性解决！</p>
                        </div>
                    </li>
                    <li>
                        <p class="name">操控难</p>
                        <div class="prop">
                            <p>家里空调面板、新风面板、暖气面板排成一排，父母、保姆、孩子不敢也不会操作。</p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="home-container bg4">
            <div class="layout">
                <h2 class="home-tit home-tit-color1">众华5大优势</h2>
                <ul class="home-four">
                    <li>
                        <p class="num">1</p>
                        <p class="name">完善供应链 一站式购物</p>
                        <p class="prop">全球严选，联合国际舒适系统一线品牌为用户定制高端舒适家居系统解决方案</p>
                    </li>
                    <li>
                        <p class="num">2</p>
                        <p class="name">系统方案报价 后期价格无忧</p>
                        <p class="prop">打破行业潜规则，系统解决方案报价，后期施工无任何增项，让您省心更放心</p>
                    </li>
                    <li>
                        <p class="num">3</p>
                        <p class="name">自有专业团队 集成设计施工</p>
                        <p class="prop">全屋舒适系统统一设计施工，减少沟通及施工时间；各系统之间管路合理避让，减少后期破坏返工风险；施工图纸永久存档，便于定期检修保养</p>
                    </li>
                    <li>
                        <p class="num">4</p>
                        <p class="name">10年售后跟踪 尊享即时服务</p>
                        <p class="prop">全屋系统连续10年每年2次主动上门安全检测调试服务，客户遇到任何问题2小时内即时上门服务，售后无忧</p>
                    </li>
                    <li>
                        <p class="num">5</p>
                        <p class="name">完美智能系统 全屋集成控制</p>
                        <p class="prop">手机APP＋线控面板双屏集成控制代替空调、新风、暖通单独线控面板，简化场景式操作，一键开启适宜舒适环境模式</p>
                    </li>
                </ul>
            </div>
        </div>

        <div class="home-container bg5">
            <div class="layout">
                <h2 class="home-tit">舒适系统解决方案</h2>
                <div class="home-intro">
                    <p>温度解决方案、空气解决方案、水处理解决方案、热水解决方案、智能厨房解决方案、智能联<br />控解决方案，给您创造一个恒温、恒湿、恒静、恒氧、恒净的家。</p>
                </div>
                <div class="home-five">
                    <ul>
                        <li>
                            <div class="icons icon-home-five-1"></div>
                            <p class="name"><router-link to="/solution/1">温度</router-link></p>
                        </li>
                        <li>
                            <div class="icons icon-home-five-2"></div>
                            <p class="name"><router-link to="/solution/3">水处理</router-link></p>
                        </li>
                        <li>
                            <div class="icons icon-home-five-3"></div>
                            <p class="name"><router-link to="/solution/2">空气</router-link></p>
                        </li>
                        <li>
                            <div class="icons icon-home-five-4"></div>
                            <p class="name"><router-link to="/solution/4">热水</router-link></p>
                        </li>
                        <li>
                            <div class="icons icon-home-five-5"></div>
                            <p class="name"><router-link to="/solution/1">智能厨房</router-link></p>
                        </li>
                        <li>
                            <div class="icons icon-home-five-6"></div>
                            <p class="name"><router-link to="/solution/5">智能联控</router-link></p>
                        </li>
                    </ul>

                    <div class="btns-box"><button type="submit" @click="$router.push({path: '/quotation'})">1分钟免费报价</button></div>
                    <p class="info">舒适的家，没那么难</p>
                </div>
            </div>
        </div>

        <div class="home-container bg6">
            <div class="layout">
                <h2 class="home-tit">战略合作伙伴</h2>
                <div class="home-intro">
                    <p>联合德国威能、德国瑞好、德国卡洛、瑞士森德、美国霍尼韦尔、美国怡口净水、美国约克、<br />日本林内、日本能率、日本大金空调、日本日立空调、韩国三星中央空调、格力电器、老板电器、<br />安泊橱柜等世界知名品牌为用户定制高端舒适家居系统解决方案</p>
                </div>
                <div class="home-six">
                    <ul>
                        <li><img src="../../assets/img/icon-logo-1.png" /></li>
                        <li><img src="../../assets/img/icon-logo-2.png" /></li>
                        <li><img src="../../assets/img/icon-logo-3.png" /></li>
                        <li><img src="../../assets/img/icon-logo-4.png" /></li>
                        <li><img src="../../assets/img/icon-logo-5.png" /></li>
                        <li><img src="../../assets/img/icon-logo-6.png" /></li>
                        <li><img src="../../assets/img/icon-logo-7.png" /></li>
                        <li><img src="../../assets/img/icon-logo-8.png" /></li>
                        <li><img src="../../assets/img/icon-logo-9.png" /></li>
                        <li><img src="../../assets/img/icon-logo-10.png" /></li>
                        <li><img src="../../assets/img/icon-logo-11.png" /></li>
                        <li><img src="../../assets/img/icon-logo-12.png" /></li>
                        <li><img src="../../assets/img/icon-logo-13.png" /></li>
                        <li><img src="../../assets/img/icon-logo-14.png" /></li>
                        <li><img src="../../assets/img/icon-logo-15.png" /></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="home-container bg7">
            <div class="layout">
                <h2 class="home-tit">舒适课堂</h2>
                <div class="home-seven">
                    <div class="home-seven-box">
                        <div class="pic"><img src="../../assets/img/pic-home-seven-1.jpg" /></div>
                        <h2 class="tit">老房装暖气你需要知道的事</h2>
                        <p class="prop">立冬后成都人就不太喜欢外出，总是窝在家里，搭着小毛毯烤着小太阳，这样虽然是暖和了些，但你舒服吗？离开一小会，又冷了。很多人家都住在老房子里，或是新房子装修时没有考虑装暖气，进入冬季后，只能一家人忍受着寒冷，但其实老房子也是能装暖气的！老房装暖气俗称“明管”，是指因种种原因在装修时没有安装暖气片，房子已装修好了或已经入住后，再来安装暖气系统。明管的暖气片管道不做暗埋处理，直接沿着天花、墙角、踢角线等隐蔽地方走管，从而避免直接在墙面开槽、破坏地板的一种暖气片安装技术。</p>
                        <p class="more"><a href="javscript:;">查看更多</a></p>
                    </div>
                    <div class="home-seven-box1 mt20">
                        <div class="boxs">
                            <div class="pic"><img src="../../assets/img/pic-home-seven-2.jpg" /></div>
                            <h2 class="tit">冬季如何保证卧室 内的温度和湿度恒定？</h2>
                            <p class="more more1"><a href="javscript:;">查看更多</a></p>
                        </div>
                        <div class="boxs">
                            <div class="pic"><img src="../../assets/img/pic-home-seven-3.jpg" /></div>
                            <h2 class="tit">有孩子的家庭需要 什么样的新风系统？</h2>
                            <p class="more more1"><a href="javscript:;">查看更多</a></p>
                        </div>
                    </div>

                    <div class="btns-box"><button type="submit">查看更多</button></div>
                </div>
            </div>
        </div>

        <div class="home-container bg8">
            <div class="layout">
                <div class="home-eight">
                    <p>创造每一个“您”，对舒适环境的一切美好向往。</p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            banners: [
                {
                    src: require('../../assets/img/pic-banner-1.jpg')
                },
                {
                    src:  require('../../assets/img/pic-banner-3.jpg')
                },
                {
                    src:  require('../../assets/img/pic-banner-2.jpg')
                }
            ]
        }
    }
}
</script>

<style lang="scss" scoped>
.el-carousel__item { 
    .pic {
        margin-left: -960px;
        width: 1920px;
        position: absolute;
        top: 0;
        left: 50%;
        z-index: 1;
    }

    .txt {
        padding: 0 0 0 36px;
        width:520px;
        height:280px;
        line-height: 126px;
        position: absolute;
        top: 287px;
        left: 50%;
        z-index: 10;
        -webkit-transform: translateX(-50%);
        -moz-transform: translateX(-50%);
        -ms-transform: translateX(-50%);
        transform: translateX(-50%);
        border: 10px solid #FCD202;
        background:rgba(83,78,78,0.53);
        font-size:90px;
        color: #fff;
    }

    .btns-box {
        width: 255px;
        text-align: center;
        height:50px;
        position: absolute;
        top: 580px;
        left: 50%;
        z-index: 11;

        button {
            padding: 0 40px 0 20px;
            height:50px;
            line-height: 50px;
            background:rgba(233,197,14,1);
            box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
            border-radius:20px;
            border: 0;
            color: #fff;
            font-size:20px;
            cursor: pointer;
            position: relative;

            &:after {
                margin-left: 5px;
                width: 0;
                height: 0;
                content: " ";
                border-color: transparent transparent transparent #fff;
                border-style: dashed dashed dashed solid;
                border-width: 5px 0 5px 8px;
                position: absolute;
                right: 25px;
                top: 50%;
                margin-top: -5px;
            }
        }
    }


    .txt-box {
        padding: 26px 0 0;
        width:372px;
        height:135px;
        background:rgba(248,209,19,1);
        box-shadow:2px 4px 6px 0px rgba(144,148,143,1);
        border-radius:10px;
        position: relative;
        z-index: 10;
        top: 180px;
        left: 63px;
        text-align: center;

        &:after {
            width:121px;
            height:1px;
            overflow: hidden;
            background: #fff;
            content: " ";
            position: absolute;
            top: 116px;
            right: 57px;
        }

        &:before {
            width:58px;
            height:3px;
            overflow: hidden;
            background: #fff;
            content: " ";
            position: absolute;
            top: 122px;
            right: 57px;
        }

        .prop {
            margin-bottom: 12px;
            font-size:30px;
            font-family:KaiTi;
            color: #fff;
            line-height:34px;
        }

        .name {
            font-size:30px;
            color:#fff;
            line-height:42px;
        }
    }
}

.el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
}

.home {
    .home-container {
        padding-top: 50px;
        width: 100%;
        min-width: 1200px;

        &.bg1 {
            background: #fff;
        }

        &.bg2 {
            background: #f2f2f2;
        }

        &.bg3 {
            padding-bottom:30px;
            background: #fff;
        }

        &.bg4 {
            background: url(../../assets/img/bg-home-four.jpg) no-repeat center center;
        }

        &.bg5 {
            background: #F2F2F2;
        }

        &.bg6 {
            background: #fff;
        }

        &.bg7 {
            background: #F2F2F2;
        }

        &.bg8 {
            background: url(../../assets/img/bg-home-eight-1.jpg) no-repeat center center;;
        }

        .home-tit {
            height: 62px;
            line-height: 62px;
            position: relative;
            font-size: 30px;
            color: #413F3F;
            text-align: center;
            font-weight: 100;

            &.home-tit-color1 {
                color: #fff;
            }

            &:after {
                width: 30px;
                height: 6px;
                background: #0780ED;
                content: " ";
                position: absolute;
                bottom: 0;
                left:50%;
                margin-left: -15px;
            }
        }

        .home-intro {
            padding-top: 20px;
            text-align: center;

            p {
                line-height:20px;
                color:#5A6480;
            }
        }

        .home-one {
            padding: 27px 30px 60px;

            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                margin: 0 10px;
                padding: 35px 40px;
                width: 360px;
                height:210px;
                float:left;

                &.one-bg1 {
                    background: url(../../assets/img/bg-home-one-1.jpg) no-repeat;
                    .one-bg {
                        background:rgba(144,196,33,0.8);
                    }
                }

                &.one-bg2 {
                    background: url(../../assets/img/bg-home-one-2.jpg) no-repeat;
                    .one-bg {
                        background:rgba(1,175,235,0.8);
                    }
                }

                &.one-bg3 {
                    background: url(../../assets/img/bg-home-one-3.jpg) no-repeat;
                    .one-bg {
                        background:rgba(252,210,2,0.8);
                    }
                }

                .one-bg {
                    width:280px;
                    height:140px;                    

                    .name {
                        padding: 12px 0 9px;
                        line-height:33px;
                        font-size:24px;
                        color:rgba(255,255,255,1);
                        text-align: center;
                    }

                    .prop {
                        color:#fff;
                        line-height:20px;
                        text-align: center;
                    }
                }
            }
        }

        .home-two {
            padding: 20px 30px 60px;

            .tit {
                margin-bottom: 10px;
                height:28px;
                font-size:20px;
                font-weight:300;
                color:rgba(95,92,92,1);
                line-height:28px;
                text-align: center;
            }
            ul {
                text-align: center;

                li {
                    width: 200px;
                    text-align: center;
                    display: inline-block;
                    color:rgba(95,92,92,1);

                    .name {
                        font-size:30px;
                        font-weight:300;
                        line-height:42px;
                    }

                    .prop {
                        line-height:20px;
                        text-align: center;
                        font-size: 16px;
                    }
                }
            }
        }

        .home-three {
            margin: 30px 0 0;
            padding: 27px 160px 30px;

            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                margin: 0 20px;
                padding: 0 30px 0 65px;
                width:400px;
                height:130px;
                background:rgba(255,255,255,1);
                box-shadow:2px 2px 4px 0px rgba(254,209,2,1);
                border-radius:20px;
                float:left;
                position: relative;

                &:after, &:before {
                    width: 16px;
                    height: 16px;
                    content: " ";
                    position: absolute;
                }

                &:before {
                    top: 36px;
                    left: 39px;
                    background: url(../../assets/img/icon-dot-begin.png) no-repeat center center;
                }

                &:after {
                    right: 34px;
                    bottom: 16px;
                    background: url(../../assets/img/icon-dot-end.png) no-repeat center center;
                }

                .name {
                    padding: 10px 0;
                    font-size:16px;
                    color:rgba(191,80,80,0.6);
                    line-height:22px;
                    text-align: center;
                }

                .prop {
                    height: 66px;
                    display: table;

                    p {
                        display: table-cell; 
                        vertical-align:middle;
                        line-height: 22px;
                        font-size:16px;
                        color:#212121;
                    }
                }
            }
        }

        .home-four {
            margin: 30px 0 0;
            padding: 48px 15px 40px;

            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                margin: 80px 15px 0;
                padding: 0 25px;
                width:200px;
                height:260px;
                background:rgba(21,163,194,1);
                border-radius:4px;
                float:left;
                position: relative;
                color: #fff;

                .num {
                    width: 80px;
                    height: 80px;
                    line-height: 80px;
                    text-align:center;
                    color: #15A3C2;
                    background: #fff;
                    font-size: 30px;
                    -webkit-border-radius: 60px;
                    -moz-border-radius: 60px;
                    -ms-border-radius: 60px;
                    border-radius: 60px;
                    position: absolute;
                    top: -100px;
                    left: 50%;
                    margin-left: -30px;
                }

                .name {
                    padding: 20px 0;
                    font-size:24px;
                    line-height:33px;
                    text-align: center;
                }

                .prop {
                    line-height: 20px;
                    font-size:14px;
                }
            }
        }

        .home-five {
            margin: 35px 0 0;
            padding: 0  15px 30px;

            ul {
                &:after {
                    height: 0;
                    content: " ";
                    clear:both;
                    display: block;
                }

                li {
                    margin: 0 90px 0 0;
                    width:120px;
                    float:left;
                    position: relative;
                    color: #fff;

                    &:last-child {
                        margin-right: 0;
                    }

                    .icons {
                        width: 120px;
                        height: 120px;
                        text-align:center;
                        color: #15A3C2;
                        background-color: #EBEAEA;
                        background-repeat: no-repeat;
                        background-position: center center;
                        font-size: 30px;
                        -webkit-border-radius: 120px;
                        -moz-border-radius: 120px;
                        -ms-border-radius: 120px;
                        border-radius: 120px;

                        &.icon-home-five-1 {
                            background-image: url(../../assets/img/icon-temperature.png);
                        }

                        &.icon-home-five-2 {
                            background-image: url(../../assets/img/icon-water.png);
                        }

                        &.icon-home-five-3 {
                            background-image: url(../../assets/img/icon-air.png);
                        }

                        &.icon-home-five-4 {
                            background-image: url(../../assets/img/icon-hotwater.png);
                        }

                        &.icon-home-five-5 {
                            background-image: url(../../assets/img/icon-kitchen.png);
                        }

                        &.icon-home-five-6 {
                            background-image: url(../../assets/img/icon-lamp.png);
                        }
                    }

                    .name {
                        padding: 23px 0 60px;
                        line-height:22px;
                        text-align: center;

                        a {
                            padding-right: 20px;
                            line-height: 22px;
                            display: inline-block;
                            background: url(../../assets/img/icon-right.png) no-repeat right center;
                            color: #4F4F4F;
                            font-size: 16px;

                            &:hover {
                                color: #0780ED;
                                text-decoration: underline;
                            }
                        }
                    }
                }
            }

            .btns-box {
                margin: 0 auto;
                text-align: center;
                width:178px;
                height:50px;
                position: relative;
                z-index: 2;
                
                &:after {
                    width:178px;
                    height:50px;
                    background:#7DAC70;
                    content: " ";
                    position: absolute;
                    top: 2px;
                    left: 2px;
                    z-index: 1;
                }

                button {
                    width:178px;
                    height:50px;
                    background:#fff;
                    border:1px solid rgba(125,172,112,1);
                    color: #7DAC70;
                    position: relative;
                    z-index: 2;
                    font-size: 20px;
                    cursor: pointer;
                }
            }

            .info {
                padding-top: 10px;
                color: #141721;
                line-height: 20px;
                text-align: center;
            }
        }

        .home-six {
            margin: 50px 0 0;
            padding: 0 160px 60px;

            ul {
                &:after {
                    height: 0;
                    content: " ";
                    clear:both;
                    display: block;
                }

                li {
                    margin: 0 20px 20px 0;
                    width: 160px;
                    height: 80px;
                    float: left;
                    background: #eee;
                    position: relative;
                    color: #fff;

                    img {
                        width: 160px;
                        height: 80px;
                    }

                    &:nth-child(5n) {
                        margin-right: 0;
                    }
                }
            }
        }

        .home-seven {
            margin: 60px 0 0;
            padding: 0 100px 60px;

            .tit {
                line-height: 25px;
                color: #4F4F4F;
                position: relative;
                font-size: 18px;
                font-weight: 100;

                &:after {
                    width: 3px;
                    height: 18px;
                    background: #0780ed;
                    content: " ";
                    position: absolute;
                    top: 3px;
                    left: -8px;
                }
            }

            .prop {
                margin-top: 63px;
                font-size:14px;
                color:rgba(90,100,128,1);
                line-height:20px;
            }

            .more {
                position: absolute;
                bottom: 20px;
                right: 40px;
                line-height:22px;
                text-align: right;

                &.more1 {
                    right: 20px;
                }

                a {
                    padding-right: 20px;
                    line-height: 22px;
                    display: inline-block;
                    background: url(../../assets/img/icon-right.png) no-repeat right center;
                    color: #0780ED;
                    font-size: 14px;

                    &:hover {
                        color: #0780ED;
                        text-decoration: underline;
                    }
                }
            }

            .home-seven-box {
                padding: 52px 50px 20px 568px;
                height: 390px;
                position: relative;
                background: #fff;

                .pic {
                    width: 500px;
                    height: 390px;
                    position: absolute;
                    top: 0;
                    left: 0;

                    img {
                        width: 500px;
                    }
                }
            }

            .home-seven-box1 {
                &:after {
                    height: 0;
                    content: " ";
                    clear: both;
                    display: block;
                }

                .boxs {
                    width: 500px;
                    padding: 93px 28px 20px 328px;
                    height: 269px;
                    position: relative;
                    background: #fff;
                    float: left;

                    .pic {
                        width: 300px;
                        height: 269px;
                        position: absolute;
                        top: 0;
                        left: 0;

                        img {
                            width: 300px;
                        }
                    }
                }
            }

            .btns-box {
                margin: 68px auto 0;
                text-align: center;
                width:178px;
                height:50px;
                position: relative;
                z-index: 2;
                
                &:after {
                    width:178px;
                    height:50px;
                    background:#7DAC70;
                    content: " ";
                    position: absolute;
                    top: 2px;
                    left: 2px;
                    z-index: 1;
                }

                button {
                    width:178px;
                    height:50px;
                    background:#fff;
                    border:1px solid rgba(125,172,112,1);
                    color: #7DAC70;
                    position: relative;
                    z-index: 2;
                    font-size: 20px;
                    cursor: pointer;
                }
            }
        }

        .home-eight {
            padding: 177px 150px 147px;
            height: 413px;

            p {
                height: 89px;
                line-height: 89px;
                background:rgba(131,124,124,0.66);
                font-size:40px;
                color: #fff;
                text-align: center;
            }
        }
    }
}

</style>
