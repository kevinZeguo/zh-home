<template>
    <div class="home">
        <mt-swipe :auto="4000" style="height:19rem;" class="home-banner">
            <mt-swipe-item>
                <div class="pic" :style="{backgroundImage: 'url(' + banners[0].src +')'}"></div>
                <div class="txt">舒适，<br />家的意义。</div>
            </mt-swipe-item>
            <mt-swipe-item >
                <router-link to="/enrol" style="width: 100%;display: block;">
                    <div class="pic" :style="{backgroundImage: 'url(' + banners[1].src +')'}"></div>
                    <div class="txt">这个冬天，<br />告别寒冷。</div>
                    <div class="btns-box"><button type="button">明装采暖在线报名</button></div>
                </router-link>
            </mt-swipe-item>
        </mt-swipe>
        <div class="home-container bg1">
            <h2 class="home-tit">一个舒适的家</h2>
            <div class="home-intro">
                <p>带给我们的不止是舒适、健康、安全和便捷，更多的是带给我们心灵舒适需求的满足。 我们认为一个舒适的家，应该满足下面的标准：</p>
            </div>
            <mt-swipe :auto="4000" style="height: 18rem;" class="home-one">
                <mt-swipe-item>
                    <div class="one-bg1">
                        <div class="one-bg">
                            <p class="name">良好的室内空气品质</p>
                            <p class="prop">温度均匀恒定</p>
                            <p class="prop">空气湿度相宜</p>
                            <p class="prop">有足够的新风量</p>
                            <p class="prop">空气的洁净度很高</p>
                        </div>
                    </div>
                </mt-swipe-item>
                <mt-swipe-item>
                    <div class="one-bg2">
                        <div class="one-bg">
                            <p class="name">有利健康的用水品质</p>
                            <p class="prop">水温均匀恒定</p>
                            <p class="prop">水质软硬适宜</p>
                            <p class="prop">饮水符合卫生标准</p>
                        </div>
                    </div>
                </mt-swipe-item>
                <mt-swipe-item>
                    <div class="one-bg3">
                        <div class="one-bg">
                            <p class="name">轻松便利的居家生活</p>
                            <p class="prop">智慧家庭，操作简单</p>
                            <p class="prop">让家庭更节能，智能，便利和舒适</p>
                        </div>
                    </div>
                </mt-swipe-item>
            </mt-swipe>
        </div>

        <div class="home-container bg2">
            <h2 class="home-tit">众华舒适家</h2>
            <div class="home-intro">
                <p>专注于舒适温度、适宜湿度、新鲜空气、健康饮水、恒温热水、智能厨房、智能联控系统集成解决方案，通过专业集成设计、标准化、一体化的集成施工，全年365天2小时即达即时尊享售后服务保障，致力于打造舒适、健康、环保、节能、智能、集成的“五恒”舒适环境体验，创造每一个“您” 对舒适环境的一切美好向往！</p>
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

        <div class="home-container bg3">
            <h2 class="home-tit">传统方案4大难题</h2>
            <div class="home-intro">
                <p class="text-center">使用传统的装修方案，<br />你一定遇到过/听说过这4大难题。</p>
            </div>
            <div class="home-three">
                <ul class="tabs-hd">
                    <li :class="{active: homeThreeStatus == index}" v-for="(item, index) in homeThreeMenu" @click="homeTreeClick(index)" :key="index">
                        <p class="name">{{ item.name }}</p>
                    </li>
                </ul>
                <ul class="tabs-bd">
                    <li :class="{active: homeThreeStatus == 0}">
                        <div class="prop">
                            <p>价格不透明，后期增项太多！</p>
                        </div>
                    </li>
                    <li :class="{active: homeThreeStatus == 1}">
                        <div class="prop">
                            <p>厂家各自为政，协调难。浪费管材、浪费精力、浪费时间！</p>
                        </div>
                    </li>
                    <li :class="{active: homeThreeStatus == 2}">
                        <div class="prop">
                            <p>没安全检测也没有售后，一出问题就是全屋被泡，各厂家之间相互推诿，无法一次性解决！</p>
                        </div>
                    </li>
                    <li :class="{active: homeThreeStatus == 3}">
                        <div class="prop">
                            <p>家里空调面板、新风面板、暖气面板排成一排，父母、保姆、孩子不敢也不会操作。</p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="home-container bg4">
            <h2 class="home-tit home-tit-color1">众华5大优势</h2>
            <div class="home-four">
                <ul>
                    <li>
                        <p class="name">完善供应链<br />一站式购物</p>
                    </li>
                    <li>
                        <p class="name">系统方案报价<br />后期价格无忧</p>
                    </li>
                </ul>
                <ul>
                    <li>
                        <p class="name">自有专业团队<br />集成设计施工</p>
                    </li>
                    <li>
                        <p class="name">10年售后跟踪<br />尊享即时服务</p>
                    </li>
                </ul>
                <ul>
                    <li>
                        <p class="name">完美智能系统<br />全屋集成控制</p>
                    </li>
                </ul>
            </div>
        </div>

        <div class="home-container bg5">
            <h2 class="home-tit">舒适系统解决方案</h2>
            <div class="home-intro">
                <p>温度解决方案、空气解决方案、水处理解决方案、热水解决方案、智能厨房解决方案、智能联控解决方案，给您创造一个恒温、恒湿、恒静、恒氧、恒净的家。</p>
            </div>
            <div class="home-five">
                <ul>
                    <li>
                        <div class="icons icon-home-five-1"></div>
                        <p class="name"><a href="javascript:;">温度</a></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-2"></div>
                        <p class="name"><a href="javascript:;">水处理</a></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-3"></div>
                        <p class="name"><a href="javascript:;">空气</a></p>
                    </li>
                </ul>
                <ul>
                    <li>
                        <div class="icons icon-home-five-4"></div>
                        <p class="name"><a href="javascript:;">热水</a></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-5"></div>
                        <p class="name"><a href="javascript:;">智能厨房</a></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-6"></div>
                        <p class="name"><a href="javascript:;">智能联控</a></p>
                    </li>
                </ul>

                <div class="btns-box"><button type="submit" @click="$router.push({path: '/quotation'})">1分钟免费报价</button></div>
            </div>
        </div>

        <div class="home-container bg6">
            <h2 class="home-tit">战略合作伙伴</h2>
            <div class="home-intro">
                <p>联合德国威能、德国瑞好、德国卡洛、瑞士森德、美国霍尼韦尔、美国怡口净水、美国约克、荷兰飞利浦、日本林内、日本能率、日本大金空调、日本日立空调、格力电器、老板电器、安泊橱柜等世界知名品牌为用户定制高端舒适家居系统解决方案</p>
            </div>
            <div class="home-six">
                <mt-swipe :auto="4000" style="height: 11rem;">
                    <mt-swipe-item>
                        <ul>
                            <li><img src="../../assets/img/icon-logo-1.png" /></li>
                            <li><img src="../../assets/img/icon-logo-2.png" /></li>
                            <li><img src="../../assets/img/icon-logo-3.png" /></li>
                            <li><img src="../../assets/img/icon-logo-4.png" /></li>
                            <li><img src="../../assets/img/icon-logo-5.png" /></li>
                            <li><img src="../../assets/img/icon-logo-6.png" /></li>
                        </ul>
                    </mt-swipe-item>
                    <mt-swipe-item>
                        <ul>
                            <li><img src="../../assets/img/icon-logo-7.png" /></li>
                            <li><img src="../../assets/img/icon-logo-8.png" /></li>
                            <li><img src="../../assets/img/icon-logo-9.png" /></li>
                            <li><img src="../../assets/img/icon-logo-10.png" /></li>
                            <li><img src="../../assets/img/icon-logo-11.png" /></li>
                            <li><img src="../../assets/img/icon-logo-12.png" /></li>
                        </ul>
                    </mt-swipe-item>
                    <mt-swipe-item>
                        <ul>
                            <li><img src="../../assets/img/icon-logo-13.png" /></li>
                            <li><img src="../../assets/img/icon-logo-14.png" /></li>
                            <li><img src="../../assets/img/icon-logo-15.png" /></li>
                        </ul>
                    </mt-swipe-item>
                </mt-swipe>
                
            </div>
        </div>

        <div class="home-container bg7">
            <h2 class="home-tit">舒适课堂</h2>
            <div class="home-seven">
                <div class="pic"><img src="../../assets/img/pic-home-seven-1.jpg" /></div>
                <div class="home-seven-box">
                    <h2 class="tit">老房装暖气你需要知道的事</h2>
                    <p class="prop">立冬后成都人就不太喜欢外出，总是窝在家里，搭着小毛毯烤着小太阳，这样虽然是暖和了些，但你舒服吗？离开一小会，又冷了。很多人家都住在老房子里，或是新房子装修时没有考虑装暖气，进入冬季后，只能一家人忍受着寒冷，但其实老房子也是能装暖气的！老房装暖气俗称“明管”，是指因种种原因在装修时没有安装暖气片，房子已装修好了或已经入住后，再来安装暖气系统。明管的暖气片管道不做暗埋处理，直接沿着天花、墙角、踢角线等隐蔽地方走管，从而避免直接在墙面开槽、破坏地板的一种暖气片安装技术。</p>
                    <p class="more"><a href="javscript:;">查看更多</a></p>
                </div>

                <div class="btns-box"><button type="submit">查看更多</button></div>
            </div>
        </div>

        <div class="home-container bg8">
            <div class="home-eight">
                <div class="prop">
                    <p>创造每一个“您”，对舒适环境的一切美好向往。</p>
                </div>
            </div>
        </div>

        <v-footer></v-footer>
    </div>
</template>

<script>
import footer from '../components/footer';
export default {
    components: {
        'v-footer': footer
    },
    data () {
        return {
            banners: [
                {
                    src: require('../../assets/img/pic-banner-1.jpg')
                },
                {
                    src: require('../../assets/img/pic-banner-3.jpg')
                }
            ],
            homeThreeMenu: [
                {
                    name: '采购难'
                },
                {
                    name: '施工难'
                },
                {
                    name: '服务难'
                },
                {
                    name: '操控难'
                }
            ],
            homeThreeStatus: 0
        }
    },
    mounted () {
        
    },
    methods: {
        homeTreeClick (index) {
            this.homeThreeStatus = index;
        }
    }

}
</script>

<style lang="scss" scoped>
.home {
    .home-banner {
        position: relative;

        .pic {
            width: 100%;
            height: 19rem;
            background-repeat: no-repeat;
            background-position: center center;
            background-size: cover;
        }

        .txt {
            padding: 0.65rem 0 1.3rem 1.9rem;
            width:70%;
            line-height: 3.8rem;
            position: absolute;
            top: 50%;
            left: 50%;
            z-index: 10;
            -webkit-transform: translate(-50%, -50%);
            -moz-transform: translate(-50%, -50%);
            -ms-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
            border: 10px solid #F8CF2A;
            background:rgba(83,78,78,0.53);
            font-size:3.4rem;
            font-weight:bold;
            color: #fff;
        }

        .btns-box {
            text-align: center;
            position: absolute;
            bottom: 0.4rem;
            left: 50%;
            z-index: 11;
            -webkit-transform: translatex(-50%);
            -moz-transform: translate(-50%, -50%);
            -ms-transform: translate(-50%, -50%);
            transform: translate(-50%, -50%);
            

            button {
                padding: 0 1rem;
                width:100%;
                height:2.2rem;
                background:rgba(233,197,14,1);
                border-radius:1.7rem;
                border: 0;
                color: #fff;
                font-size:1rem;
                cursor: pointer;
                position: relative;
            }
        }

        /deep/ .mint-swipe-indicator {
            background: #ABA9A9;
            opacity: 1;

            &.is-active {
                background:#fff;
            }
        }

        /deep/ .mint-swipe-indicators {
            bottom: 0;
        }
    }

    .home-container {
        width: 100%;

        &.bg1 {
            background: #fff;
        }

        &.bg2 {
            background: #f2f2f2;
        }

        &.bg3 {
            padding-bottom:3rem;
            background: #fff;
        }

        &.bg4 {
            background: url(../../assets/img/bg-home-four.jpg) no-repeat center center;
            background-size: cover;
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
            background: url(../../assets/img/bg-home-eight-1.jpg) no-repeat center center;
            background-size: cover;
        }

        .home-tit {
            height: 4.8rem;
            line-height: 4.8rem;
            position: relative;
            font-size: 1.8rem;
            color: #413F3F;
            text-align: center;
            font-weight: 100;

            &.home-tit-color1 {
                color: #fff;
            }

            &:after {
                width: 2.6rem;
                height: 0.5rem;
                background: #0780ED;
                content: " ";
                position: absolute;
                bottom: 0;
                left:50%;
                margin-left: -1.3rem;
            }
        }

        .home-intro {
            padding: 0.8rem 2rem 0;

            p {
                line-height: 1.8rem;
                color:#5A6480;
                font-size: 1.2rem;
                text-align: justify;
            }
        }

        .home-one {
            margin: 1.7rem 1rem 3rem;

            .one-bg1, .one-bg2, .one-bg3 {
                
                padding: 3rem 3.4rem;
                height:18rem;
            }

            .one-bg1 {
                background: url(../../assets/img/bg-home-one-1.jpg) no-repeat center center;
                background-size: cover;
                .one-bg {
                    background:rgba(144,196,33,0.8);
                }
            }

            .one-bg2 {
                background: url(../../assets/img/bg-home-one-2.jpg) no-repeat center center;
                background-size: cover;
                .one-bg {
                    background:rgba(1,175,235,0.8);
                }
            }

            .one-bg3 {
                background: url(../../assets/img/bg-home-one-3.jpg) no-repeat center center;
                background-size: cover;
                .one-bg {
                    background:rgba(252,210,2,0.8);
                }
            }

            .one-bg {
                width:100%;
                height:100%;                    

                .name {
                    padding: 1rem 0 0.6rem;
                    line-height:2.8rem;
                    font-size:2rem;
                    color:rgba(255,255,255,1);
                    text-align: center;
                }

                .prop {
                    color:#fff;
                    line-height:1.8rem;
                    text-align: center;
                    font-size: 1.2rem;
                }
            }
            
        }

        .home-two {
            padding: 2rem 0 3rem;

            .tit {
                height:1.9rem;
                font-size:1.4rem;
                font-weight:300;
                color:rgba(95,92,92,1);
                line-height:1.9rem;
                text-align: center;
            }
            ul {
                padding-top: 1rem;
                text-align: center;

                li {
                    margin-right: 5%;
                    width: 25%;
                    text-align: center;
                    color:rgba(95,92,92,1);
                    display: inline-block;

                    &:last-child {
                        margin-right: 0;
                    }

                    .name {
                        font-size:1.8rem;
                        font-weight:300;
                        line-height:2.6rem;
                    }

                    .prop {
                        line-height:2rem;
                        text-align: center;
                        font-size: 1.2rem;
                    }
                }
            }
        }

        .home-three {
            padding: 1rem 2.3rem 1.8rem;

            .tabs-hd {
                -webkit-display: flex;
                -moz-display: flex;
                -ms-display: flex;
                display: flex;
                -webkit-justify-content: space-between;
                -moz-justify-content: space-between;
                -ms-justify-content: space-between;
                justify-content: space-between;
                position: relative;
                z-index: 20;

                li {
                    width:20%;
                    padding-top: 20%;
                    height:0;
                    text-align: center;
                    background:#F3F3F3;
                    border-radius:100%;
                    font-size: 1.4rem;
                    position: relative;

                    &:last-child {
                        margin-right: 0;
                    }

                    &.active {
                        background:rgba(254,209,2,1);
                        box-shadow:0 0.3rem 0.7rem 0 rgba(167,165,159,1);
                        color:#fff;

                        &:after {
                            width: 0;
                            height: 0;
                            content: " ";
                            border-color: transparent transparent #fff;
                            border-style: dashed dashed solid;
                            border-width: 0 0.6rem 0.6rem;
                            position: absolute;
                            left: 50%;
                            bottom: -1rem;
                            margin-left: -0.6rem;
                        }
                    }

                    .name {
                        width: 100%;
                        text-align: center;
                        position: absolute;
                        top: 50%;
                        -webkit-transform: translateY(-50%);
                        -moz-transform: translateY(-50%);
                        -ms-transform: translateY(-50%);
                        transform: translateY(-50%);
                    }
                }
            }
            .tabs-bd {
                margin-top: 1rem;
                position: relative;
                z-index: 1;

                li {
                    padding: 2rem 4.8rem;
                    width:100%;
                    height: 11.6rem;
                    line-height:1.9rem;
                    background:#fff;
                    box-shadow:0.3rem -0.2rem 0.7rem 0 rgba(254,209,2,1);
                    border-radius:1.7rem;
                    position: relative;
                    display: none;

                    &.active {
                        display: block;
                    }

                    &:after, &:before {
                        width: 1.6rem;
                        height: 1.6rem;
                        content: " ";
                        position: absolute;
                    }

                    &:before {
                        top: 3.6rem;
                        left: 2.6rem;
                        background: url(../../assets/img/icon-dot-begin.png) no-repeat center center;
                        background-size: 100% 100%;
                    }

                    &:after {
                        right: 2.7rem;
                        bottom: 2rem;
                        background: url(../../assets/img/icon-dot-end.png) no-repeat center center;
                        background-size: 100% 100%;
                    }

                    .prop {
                        height: 7.6rem;
                        display: table;

                        p {
                            display: table-cell; 
                            vertical-align:middle;
                            font-size:1.5rem;
                            color:#212121;
                            text-align: justify;
                        }
                    }
                }
            }
        }

        .home-four {
            padding: 0.7rem 2.6rem 0;

            ul {
                -webkit-display: flex;
                -moz-display: flex;
                -ms-display: flex;
                display: flex;
                -webkit-justify-content: center;
                -moz-justify-content: center;
                -ms-justify-content: center;
                justify-content: center;

                li {
                    margin-right: 4%;
                    margin-bottom: 4%;
                    width:48%;
                    background:#15A3C2;
                    border-radius:0.4rem;
                    float:left;
                    position: relative;
                    color: #fff;

                    &:last-child {
                        margin-right: 0;
                    }

                    .name {
                        padding: 0.8rem 0;
                        font-size:1.2rem;
                        line-height:2rem;
                        text-align: center;
                    }
                }
            }
        }

        .home-five {
            margin: 3.5rem 0 0;
            padding: 0 1.5rem 3rem;

            ul {
                -webkit-display: flex;
                -moz-display: flex;
                -ms-display: flex;
                display: flex;
                -webkit-justify-content: center;
                -moz-justify-content: center;
                -ms-justify-content: center;
                justify-content: center;

                li {
                    margin: 0 5% 0 0;
                    width:30%;
                    position: relative;
                    color: #fff;

                    &:last-child {
                        margin-right: 0;
                    }

                    .icons {
                        width: 100%;
                        padding-top: 100%;
                        height: 0;
                        text-align:center;
                        color: #15A3C2;
                        background-color: #EBEAEA;
                        background-repeat: no-repeat;
                        background-position: center center;                        
                        font-size: 3rem;
                        -webkit-border-radius: 50%;
                        -moz-border-radius: 50%;
                        -ms-border-radius: 50%;
                        border-radius: 50%;

                        &.icon-home-five-1 {
                            background-image: url(../../assets/img/icon-temperature.png);
                            background-size: 2rem 4.4rem;
                        }

                        &.icon-home-five-2 {
                            background-image: url(../../assets/img/icon-water.png);
                            background-size: 2.5rem 4.8rem;
                        }

                        &.icon-home-five-3 {
                            background-image: url(../../assets/img/icon-air.png);
                            background-size: 3.5rem 3.5rem;
                        }

                        &.icon-home-five-4 {
                            background-image: url(../../assets/img/icon-hotwater.png);
                            background-size: 3.5rem 3.7rem;
                        }

                        &.icon-home-five-5 {
                            background-image: url(../../assets/img/icon-kitchen.png);
                            background-size: 3.5rem 3.5rem;
                        }

                        &.icon-home-five-6 {
                            background-image: url(../../assets/img/icon-lamp.png);
                            background-size: 4.5rem 4.5rem;
                        }
                    }

                    .name {
                        padding: 1.3rem 0 2rem;
                        line-height:2.2rem;
                        text-align: center;

                        a {
                            padding-right: 2rem;
                            line-height: 2.2rem;
                            display: inline-block;
                            background: url(../../assets/img/icon-right.png) no-repeat right center;
                            background-size: 1.6rem 1.6rem;
                            color: #4F4F4F;
                            font-size: 1.4rem;

                            &:hover {
                                color: #0780ED;
                                text-decoration: underline;
                            }
                        }
                    }
                }
            }

            .btns-box {
                margin: 3rem auto 0;
                text-align: center;
                width:50%;
                height:4.3rem;
                position: relative;
                z-index: 2;
                
                &:after {
                    width:100%;
                    height:4.3rem;
                    background:#7DAC70;
                    content: " ";
                    position: absolute;
                    top: 2px;
                    left: 2px;
                    z-index: 1;
                }

                button {
                    width:100%;
                    height:4.3rem;
                    background:#fff;
                    border:1px solid rgba(125,172,112,1);
                    color: #7DAC70;
                    position: relative;
                    z-index: 2;
                    font-size: 1.4rem;
                }
            }
        }

        .home-six {
            margin: 1rem 0 0;
            padding: 0 2rem 2rem;

            ul {

                &:after {
                    height: 0;
                    content: " ";
                    clear:both;
                    display: block;
                }

                li {
                    margin: 0 3% 0.5rem 0;
                    width: 30%;
                    float: left;
                    position: relative;
                    color: #fff;

                    &:nth-child(3n) {
                        margin-right: 0;
                    }

                    img {
                        width: 100%;
                    }
                }
            }

            /deep/ .mint-swipe-indicator {
                background: #D2D0D0;
                opacity: 1;

                &.is-active {
                    background:#000;
                }
            }
        }

        .home-seven {
            margin: 3rem 0 0;
            padding: 0 0 2.5rem;

            .tit {
                line-height: 2rem;
                color: #4F4F4F;
                position: relative;
                font-size: 1.4rem;
                font-weight: 100;

                &:after {
                    width: 0.3rem;
                    height: 1.8rem;
                    background: #0780ed;
                    content: " ";
                    position: absolute;
                    top: 0.3rem;
                    left: -0.8rem;
                }
            }

            .prop {
                margin-top: 1rem;
                font-size:1.2rem;
                color:#5A6480;
                line-height:1.8rem;
            }

            .more {
                line-height:2.2rem;
                text-align: right;

                &.more1 {
                    right: 2rem;
                }

                a {
                    padding-right: 2rem;
                    line-height: 2.2rem;
                    display: inline-block;
                    background: url(../../assets/img/icon-right.png) no-repeat right center;
                    background-size: 1.6rem 1.6rem;
                    color: #0780ED;
                    font-size: 1.4rem;

                    &:hover {
                        color: #0780ED;
                        text-decoration: underline;
                    }
                }
            }

            .pic {
                width: 100%;

                img {
                    margin: 0 auto;
                    width: 100%;
                    max-width: 640px;
                    display: block;
                }
            }

            .home-seven-box {
                padding: 1.6rem 2.4rem 1.2rem;
                background: #fff;
            }

            .btns-box {
                margin: 2rem auto 0;
                text-align: center;
                width:50%;
                height:4.3rem;
                position: relative;
                z-index: 2;
                
                &:after {
                    width:100%;
                    height:4.3rem;
                    background:#7DAC70;
                    content: " ";
                    position: absolute;
                    top: 2px;
                    left: 2px;
                    z-index: 1;
                }

                button {
                    width:100%;
                    height:4.3rem;
                    background:#fff;
                    border:1px solid rgba(125,172,112,1);
                    color: #7DAC70;
                    position: relative;
                    z-index: 2;
                    font-size: 1.4rem;
                }
            }
        }

        .home-eight {
            padding: 3.7rem 3.2rem 2.9rem;
            height: 11.8rem;

            .prop {
                padding: 0.4rem 1rem;
                width: 100%;
                height: 5.2rem;
                background:rgba(131,124,124,0.66);
                display: table;

                p {
                    display: table-cell; 
                    vertical-align:middle;
                    font-size:1.6rem;
                    line-height: 2.2rem;
                    color: #fff;
                    text-align: center;
                }
            }
        }
    }
}
</style>
