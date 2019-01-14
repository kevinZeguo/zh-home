<template>
    <div class="solution">
        <div class="banner">
            <div class="pic"></div>
            <div class="banner-con">
                <div class="radius radius1">
                    <div class="bg"></div>
                    <div class="txt-box">
                        <p class="prop">湿度维持在<br />40%-65%</p>
                        <p class="name">恒湿</p>
                    </div>
                </div>
                <div class="radius radius2">
                    <div class="bg"></div>
                    <div class="txt-box">
                        <p class="prop">室温维持在<br />20℃-26℃</p>
                        <p class="name">恒温</p>
                    </div>
                </div>
                <div class="radius radius3">
                    <div class="bg"></div>
                    <div class="txt-box">
                        <p class="prop">环境噪音<br />≤ 10 分贝</p>
                        <p class="name">恒静</p>
                    </div>
                </div>
                <div class="radius radius4">
                    <div class="bg"></div>
                    <div class="txt-box">
                        <p class="prop">CO2含量<br />≤1000PPM</p>
                        <p class="name">恒氧</p>
                    </div>
                </div>
                <div class="radius radius5">
                    <div class="bg"></div>
                    <div class="txt-box">
                        <p class="prop">PM2.5<br />≤50μg/m3</p>
                        <p class="name">恒净</p>
                    </div>
                </div>

                <div class="center-radius">众华舒适家<br />五恒环境解决方案</div>

                <div class="infos">
                    <h2 class="tit">全面整合及升级</h2>
                    <div class="signs"><span>空气能</span><span>地源热泵</span><span>毛细管网辐射系统</span><br /><span>新风置换系统</span><span>加/除湿器</span><span>PM2.5除霾系统</span><br /><span>中央软水/净水</span><span>全屋热水</span></div>
                    <p class="prop">采用全球最先进的毛细管网辐射技术，嵌入中央软水／净水，加/除湿、空气净化等功能，达成传统空调无法实现的无风化与舒适感，根据舒适环境使用场景四大模式，简化传统温度、湿度、空气洁净度、风速、含氧量单项设置，一键开启适宜舒适环境模式</p>
                </div>
            </div>
        </div>

        <div class="s-hint">
            <div class="layout infos">
                <img src="../../assets/img/pic-solution-hint.jpg" />
                <h2 class="tit">众华舒适家<br />五恒环境解决方案</h2>
            </div>
        </div>

        <div class="layout s-tabs">
            <ul>
                <li :class="{ active: tabsIndex == 1 }" @click="tabsChange(1)"><img src="../../assets/img/icon-temperature.png" width="18" />温度解决方案</li>
                <li :class="{ active: tabsIndex == 2 }" @click="tabsChange(2)"><img src="../../assets/img/icon-air.png" width="30" />空气解决方案</li>
                <li :class="{ active: tabsIndex == 3 }" @click="tabsChange(3)"><img src="../../assets/img/icon-water.png" width="20" />水处理解决方案</li>
                <li :class="{ active: tabsIndex == 4 }" @click="tabsChange(4)"><img src="../../assets/img/icon-hotwater.png" width="28" />热水解决方案</li>
                <li :class="{ active: tabsIndex == 5 }" @click="tabsChange(5)"><img src="../../assets/img/icon-lamp.png" width="30" />智能联控解决方案</li>
            </ul>
        </div>

        <div class="layout s-tabs-con">
            <div class="col-box" v-if="tabsIndex == 1">
                <div class="col-l">
                    <h3 class="tit">中央空调采暖系统</h3>
                    <p class="prop">通过变频风冷热泵主机+直流无刷风机盘管+分集水器+地暖盘管+智能联控面板等终端配套产品实现室内温度恒定在20℃-26℃。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-1.png" /></div>
                            <p class="name">节能省钱</p>
                            <p class="desc">空调带地暖模式，节能40%以上</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-2.png" /></div>
                            <p class="name">健康舒适</p>
                            <p class="desc">夏季出水温度15-17℃，与人体温差小，头凉脚热身安康</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-3.png" /></div>
                            <p class="name">声音安静</p>
                            <p class="desc">压差旁通阀保证无室内水流噪音，高静音直流无刷风机盘管</p>
                        </li>
                    </ul>

                    <div class="pro"><img src="../../assets/img/pic-465x248-1.jpg" /></div>
                </div>

                <div class="col-r"><img src="../../assets/img/pic-solution-585x616-1.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 2">
                <div class="col-l">
                    <h3 class="tit">新风除霾除湿系统</h3>
                    <p class="prop">通过高效冷热交换机/除湿机/加湿机/PM2.5除霾模块/抗菌风管等终端配套产品及辅材实现恒湿（湿度维持在40%-65%）、恒氧（CO2含量≤1000PPM）及恒净（PM2.5≤50μg/m3）</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-1.png" /></div>
                            <p class="name">新鲜空气</p>
                            <p class="desc">送入室外新鲜空气，排出室内浊气</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-2.png" /></div>
                            <p class="name">空气净化</p>
                            <p class="desc">高效除霾模块，除霾率达99.1%</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-3.png" /></div>
                            <p class="name">适宜湿度</p>
                            <p class="desc">带除湿机及加湿机，不怕返潮发霉及干燥传染疾病</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-4.png" /></div>
                            <p class="name">温度不流失</p>
                            <p class="desc">高效冷热交换机，热回收率89%，在夏季制冷和冬季采暖期间，能耗只增加11%</p>
                        </li>
                    </ul>

                    <div class="pro"><img src="../../assets/img/pic-500x161-1.jpg" /></div>
                </div>

                <div class="col-r"><img src="../../assets/img/pic-solution-585x616-2.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 3">
                <div class="col-l">
                    <h3 class="tit">中央水处理系统</h3>
                    <p class="prop">通过中央净水系统+中央软水系统+中央纯水系统等终端配套产品实现舒适健康用水品质。 中央净水系统先将水中的氯、重金属、细菌、病毒、藻类及固体悬浮物清除，后用活性炭进一步去除各种有机物，让出水清澈、洁净、无卤，可直接饮用；且具备自动维护功能。 中央软水系统是通过天然树脂置换出水中钙、镁离子等，降低水的硬度；有效减少对衣物和皮肤的磨损，避免管道、洁具、卫浴设备等结垢问题。 中央纯水系统采用反渗透法，经精密计算的五道过滤程序，使出水变为纯净水，不含任何杂质和矿物质。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-1.png" /></div>
                            <p class="name">健康饮水</p>
                            <p class="desc">层层过滤水中铁锈泥沙大颗粒物及氯元素、重金属，开水直饮</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-2.png" /></div>
                            <p class="name">呵护肌肤</p>
                            <p class="desc">去除钙镁离子，降低水的硬度，长期使用软化水沐浴、洗脸可使肌肤光滑细嫩，对婴儿和儿童的肌肤更有保护作用</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-3.png" /></div>
                            <p class="name">保护设备</p>
                            <p class="desc">避免管道、阀门、卫浴设备和家用电器中水垢产生，延长使用寿命</p>
                        </li>
                    </ul>

                    <div class="pro"><img src="../../assets/img/pic-500x184-1.jpg" /></div>
                </div>

                <div class="col-r"><img src="../../assets/img/pic-solution-585x616-3.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 4">
                <div class="col-l">
                    <h3 class="tit">中央热水系统</h3>
                    <p class="prop">通过壁挂式燃气热水器/电锅炉/太阳能集热板和蓄热水箱等终端配套产品实现热水集中产生，大容量的热水可以同时、多点供给家庭及商业空间生活用热水，可提供24小时充足的恒温热水。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-1.png" /></div>
                            <p class="name">超大水量</p>
                            <p class="desc">实现多头同时供水，超大流量</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-2.png" /></div>
                            <p class="name">多水点同时供水</p>
                            <p class="desc">全方位满足家庭及商用空间同时热水使用需求</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-3.png" /></div>
                            <p class="name">持久恒温</p>
                            <p class="desc">彻底解决水温忽高忽低的烦恼</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-4.png" /></div>
                            <p class="name">即时热水</p>
                            <p class="desc">根据实际使用需求，增配循环泵，即时享用舒适热水</p>
                        </li>
                    </ul>

                    <div class="pro"><img src="../../assets/img/pic-500x417-1.jpg" /></div>
                </div>

                <div class="col-r"><img src="../../assets/img/pic-solution-585x616-4.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 5">
                <div class="col-l">
                    <h3 class="tit">智能联控系统</h3>
                    <p class="prop">通过打通各配套产品通讯协议，实现全套中央系统智能联控，集成控制面板（手机APP＋线控面板），双屏集成控制代替空调、新风、暖通单独线控面板；简化场景式操作（会客、聚会、休息、离家模式），一键控制全屋温度、湿度、洁净度、风速。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-1.png" /></div>
                            <p class="name">节能</p>
                            <p class="desc">主动式环境检测，远程掌控＋智能开启，精确定时、合理节能，全屋能耗实时掌握</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-2.png" /></div>
                            <p class="name">便利</p>
                            <p class="desc">集成控制面板，一键开启适宜舒适环境模式，远程控制＋程序化预先设置，让智能融入场景化生活更便利</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-3.png" /></div>
                            <p class="name">舒适</p>
                            <p class="desc">检测温度、湿度、光照度、PM2.5、二氧化碳、TVOC、噪声等，自动触发传感接入，红外射频远程控制</p>
                        </li>
                    </ul>

                    <div class="pro"><img src="../../assets/img/pic-370x370-1.jpg" /></div>
                </div>

                <div class="col-r"><img src="../../assets/img/pic-solution-585x616-5.jpg" /></div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            tabsIndex: 1
        }
    },
    mounted () {
        
    },
    methods: {
        tabsChange (index) {
            this.tabsIndex = index;
        }
    }

}
</script>

<style lang="scss" scoped>
.solution {
    padding-bottom: 134px;

    .banner {
        padding-top: 80px;
        width: 100%;
        min-width: 1200px;
        height: 670px;

        .pic {
            margin-left: -960px;
            width: 1920px;
            height: 670px;
            -webkit-filter: blur(8px);
            -moz-filter: blur(8px);
            -ms-filter: blur(8px);
            filter: blur(8px);
            position: absolute;
            background: url(../../assets/img/pic-solution-banner.jpg) no-repeat;
            top: 0;
            left: 50%;
            z-index: 1;
        }

        .banner-con {
            margin: 0 auto;
            width: 1000px;
            position: relative;
            z-index: 2;

            .radius {
                width: 100px;
                height: 100px;
                position: absolute;

                .bg {
                    width: 100px;
                    height: 100px;
                    position: absolute;
                    top: 0;
                    left: 0;
                    z-index: 1;
                    overflow: hidden;

                    &:after {
                        width: 88px;
                        height: 88px;
                        border-radius: 100px;
                        box-shadow:0px 1px 2px 0px rgba(0,0,0,0.5);
                        content: " ";
                        position: absolute;
                        top: 0;
                        left: 0;
                    }
                }

                .txt-box {
                    width: 100%;
                    position: absolute;
                    top: 50%;
                    left: 0;
                    z-index: 10;
                    -webkit-transform: translateY(-50%);
                    transform: translateY(-50%);
                }

                .prop {
                    padding-top: 10px;
                    line-height: 20px;
                    font-size: 14px;
                    color:#44423A;
                    text-align: center;
                    position: relative;
                    z-index: 2;
                }

                .name {
                    padding: 5px 0 0;
                    color: #fff;
                    position: relative;
                    text-align: center;
                    z-index: 2;
                    font-size: 18px;
                }
            }

            .radius1 {
                top: 90px;
                left: 170px;

                .bg {
                    &:after {
                        border: 6px solid #90C421;
                        background:rgba(144,196,33,0.4);
                    }
                }
            }

            .radius2 {
                top: 234px;
                left: 0;

                .bg {
                    &:after {
                        border: 6px solid #FCD202;
                        background:rgba(252,210,2,0.4);
                    }
                }
            }

            .radius3 {
                top: 234px;
                left: 339px;

                .bg {
                    &:after {
                        border: 6px solid #01AFEB;
                        background:rgba(1,175,235,0.4);
                    }
                }

                .prop {
                    color:#fff;
                }
            }

            .radius4 {
                top: 404px;
                left: 66px;

                .bg {
                    &:after {
                        border: 6px solid #90C421;
                        background:rgba(144,196,33,0.4);
                    }
                }

                .prop {
                    color:#fff;
                }
            }

            .radius5 {
                top: 404px;
                left: 290px;

                .bg {
                    &:after {
                        border: 6px solid #1A2950;
                        background:rgba(26,41,80,0.4);
                    }
                }

                .prop {
                    color:#fff;
                }
            }

            .center-radius {
                padding: 57px 0 0;
                width: 180px;
                height: 180px;
                border-radius: 180px;
                background: -webkit-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                background: -moz-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                background: -ms-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                background: linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
                position: absolute;
                top: 218px;
                left: 130px;
                line-height: 28px;
                font-size: 20px;
                text-align: center;
                color: #fff;
            }

            .infos {
                width: 500px;
                height: 322px;
                background:rgba(255,255,255,0.8);
                box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
                position: absolute;
                top: 162px;
                right: 0;

                .tit {
                    padding: 22px 0 24px;
                    color: #0784D0;
                    font-size: 18px;
                    font-weight: 100;
                    text-align: center;
                }

                .signs {
                    text-align: center;

                    span {
                        margin: 0 5px 10px;
                        padding: 0 14px;
                        min-width: 91px;
                        background:#0784D0;
                        color:#fff;
                        line-height: 29px;
                        border-radius: 20px;
                        display: inline-block;
                        font-size: 16px;
                    }
                }

                .prop {
                    padding: 25px 30px 0;
                    line-height: 20px;
                    color:#838283;
                }
            }
        }
    }

    .s-hint {
        padding: 60px 0;
        width: 100%;
        min-width: 1200px;
        background: #fff;

        img {
            margin: 0 auto;
            display: block;
        } 

        .infos {
            position: relative;

            .tit {
                padding: 12px 0;
                width:240px;
                height:80px;
                background:linear-gradient(72deg,rgba(2,216,247,1) 0%,rgba(1,175,235,1) 100%);
                font-size:20px;
                color:#fff;
                line-height:28px;
                text-align: center;
                position: absolute;
                top: 0; 
                right: 126px;
                font-weight:500;
                z-index: 10;
            }
        }
    }

    .s-tabs {
        margin-top: 48px;
        margin-bottom: 20px;
        height:98px;
        background:rgba(246,247,249,1);
        box-shadow:0px 2px 4px 0px rgba(155,150,150,0.5);
        border-radius:4px;

        ul  {
            padding: 17px 80px 16px;
            line-height: 65px;
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;
            -webkit-justify-content: space-between;
            -moz-justify-content: space-between;
            -ms-justify-content: space-between;
            justify-content: space-between;

            li {
                padding: 0 16px;
                line-height: 65px;
                color:#4A4A4A;
                font-size: 20px;
                cursor:pointer;

                img {
                    margin-right: 5px;
                }

                &.active {
                    background:rgba(255,255,255,1);
                    box-shadow:2px 6px 10px 0px rgba(215,216,218,1);
                    border-radius:8px;
                }
            }
        }
    }

    .s-tabs-con {
        padding: 56px 40px;
        background:#fff;
        box-shadow:0px 2px 4px 0px rgba(155,150,150,0.5);
        border-radius:4px;

        .col-box {
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;
            -webkit-justify-content: space-between;
            -moz-justify-content: space-between;
            -ms-justify-content: space-between;
            justify-content: space-between;
        }

        .col-l {
            width: 500px;
        }

        .col-r {
            width: 585px;
        }

        .tit {
            width:240px;
            line-height:46px;
            background:linear-gradient(72deg,rgba(2,216,247,1) 0%,rgba(1,175,235,1) 100%);
            text-align: center;
            font-size: 24px;
            color: #fff;
            font-weight: 100;
        }

        .prop {
            padding: 20px 0 40px;
            line-height: 20px;
            color: #8a8a8a;
        }

        .infos  {
            padding: 0 0 36px;
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;
            -webkit-justify-content: space-between;
            -moz-justify-content: space-between;
            -ms-justify-content: space-between;
            justify-content: space-between;

            li {
                -webkit-flex: 1;
                -moz-flex: 1;
                -ms-flex: 1;
                flex: 1;
                padding: 0 5px;

                &:first-child {
                    padding-left: 0;
                }

                &:last-child {
                    padding-right: 0;
                }

                .pic {
                    padding-bottom: 16px;
                    text-align: center;

                    img {
                        width: 40px;
                    }
                }

                .name {
                    line-height:40px;
                    background:#EAEAEA;
                    border-radius:40px;
                    text-align: center;
                    font-size: 14px;
                    color:#252424;
                }

                .desc {
                    padding-top: 20px;
                    line-height: 17px;
                    font-size: 12px;
                    text-align: center;
                    color:#252424;
                }
            }
        }

        .pro {
            text-align: center;
        }
    }
}


</style>
