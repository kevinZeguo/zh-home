<template>
    <div class="solution">
        <div class="banner">
            <div class="banner-con">
                <div class="radius radius1">
                    <div class="bg"><div class="bg-box"></div></div>
                    <div class="txt-box">
                        <p class="name">恒湿</p>
                        <p class="prop">湿度维持在<br />40%-65%</p>
                    </div>
                </div>
                <div class="radius radius2">
                    <div class="bg"><div class="bg-box"></div></div>
                    <div class="txt-box">
                        <p class="name">恒温</p>
                        <p class="prop">室温维持在<br />20℃-26℃</p>
                    </div>
                </div>
                <div class="radius radius3">
                    <div class="bg"><div class="bg-box"></div></div>
                    <div class="txt-box">
                        <p class="name">恒静</p>
                        <p class="prop">环境噪音<br />≤ 10 分贝</p>
                    </div>
                </div>
                <div class="radius radius4">
                    <div class="bg"><div class="bg-box"></div></div>
                    <div class="txt-box">
                        <p class="name">恒氧</p>
                        <p class="prop">CO2含量<br />≤1000PPM</p>
                    </div>
                </div>
                <div class="radius radius5">
                    <div class="bg"><div class="bg-box"></div></div>
                    <div class="txt-box">
                        <p class="name">恒净</p>
                        <p class="prop">PM2.5<br />≤50μg/m3</p>
                    </div>
                </div>

                <div class="center-radius">
                    <div class="bg"></div>
                    <p class="tit">众华舒适家<br />五恒环境解决方案</p>
                </div>
            </div>

            <div class="infos">
                <h2 class="tit">全面整合及升级</h2>
                <div class="signs"><span>空气能</span><span>地源热泵</span><span>毛细管网辐射系统</span><br /><span>新风置换系统</span><span>加/除湿器</span><span>PM2.5除霾系统</span><br /><span>中央软水/净水</span><span>全屋热水</span></div>
                <p class="prop">采用全球最先进的毛细管网辐射技术，嵌入中央软水／净水，加/除湿、空气净化等功能，达成传统空调无法实现的无风化与舒适感，根据舒适环境使用场景四大模式，简化传统温度、湿度、空气洁净度、风速、含氧量单项设置，一键开启适宜舒适环境模式</p>
            </div>
        </div>

        <div class="s-hint">
            <div class="infos">
                <img src="../../assets/img/pic-solution-hint.jpg" />
                <h2 class="tit">众华舒适家<br />五恒环境解决方案</h2>
            </div>
        </div>

        <div class="s-tabs" id="tabs">
            <ul>
                <li :class="{ active: tabsIndex == 1 }" @click="tabsChange(1)">
                    <div class="pic"><img src="../../assets/img/icon-temperature.png" style="width:1rem" /></div>
                    温度
                </li>
                <li :class="{ active: tabsIndex == 2 }" @click="tabsChange(2)">
                    <div class="pic"><img src="../../assets/img/icon-air.png" style="width:1.7rem" /></div>
                    空气
                </li>
                <li :class="{ active: tabsIndex == 3 }" @click="tabsChange(3)">
                    <div class="pic"><img src="../../assets/img/icon-water.png" style="width:1.2rem" /></div>
                    水处理
                </li>
                <li :class="{ active: tabsIndex == 4 }" @click="tabsChange(4)">
                    <div class="pic"><img src="../../assets/img/icon-hotwater.png" style="width:1.35rem" /></div>
                    热水
                </li>
                <li :class="{ active: tabsIndex == 5 }" @click="tabsChange(5)">
                    <div class="pic"><img src="../../assets/img/icon-lamp.png" style="width:1.7rem" /></div>
                    智能联控
                </li>
            </ul>
        </div>

        <div class="s-tabs-con">
            <div class="col-box" v-if="tabsIndex == 1">
                <div class="col-l col-bg-1">
                    <h3 class="tit">中央空调采暖系统</h3>
                    <p class="prop">通过变频风冷热泵主机+直流无刷风机盘管+分集水器+地暖盘管+智能联控面板等终端配套产品实现室内温度恒定在20℃-26℃。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-1.png" /></div>
                            <p class="name"><span>节能省钱</span></p>
                            <p class="desc">空调带地暖模式，节能40%以上</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-2.png" /></div>
                            <p class="name"><span>健康舒适</span></p>
                            <p class="desc">夏季出水温度15-17℃，与人体温差小，头凉脚热身安康</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-temperature-3.png" /></div>
                            <p class="name"><span>声音安静</span></p>
                            <p class="desc">压差旁通阀保证无室内水流噪音，高静音直流无刷风机盘管</p>
                        </li>
                    </ul>
                </div>
                <div class="pro"><img src="../../assets/img/pic-solution-pro-1.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 2">
                <div class="col-l col-bg-2">
                    <h3 class="tit">新风除霾除湿系统</h3>
                    <p class="prop">通过高效冷热交换机/除湿机/加湿机/PM2.5除霾模块/抗菌风管等终端配套产品及辅材实现恒湿（湿度维持在40%-65%）、恒氧（CO2含量≤1000PPM）及恒净（PM2.5≤50μg/m3）</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-1.png" /></div>
                            <p class="name"><span>新鲜空气</span></p>
                            <p class="desc">送入室外新鲜空气，排出室内浊气</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-2.png" /></div>
                            <p class="name"><span>空气净化</span></p>
                            <p class="desc">高效除霾模块，除霾率达99.1%</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-3.png" /></div>
                            <p class="name"><span>适宜湿度</span></p>
                            <p class="desc">带除湿机及加湿机，不怕返潮发霉及干燥传染疾病</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-air-4.png" /></div>
                            <p class="name"><span>温度不流失</span></p>
                            <p class="desc">高效冷热交换机，热回收率89%，在夏季制冷和冬季采暖期间，能耗只增加11%</p>
                        </li>
                    </ul>
                </div>
                <div class="pro"><img src="../../assets/img/pic-solution-pro-2.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 3">
                <div class="col-l col-bg-3">
                    <h3 class="tit">中央水处理系统</h3>
                    <p class="prop">通过中央净水系统+中央软水系统+中央纯水系统等终端配套产品实现舒适健康用水品质。 中央净水系统先将水中的氯、重金属、细菌、病毒、藻类及固体悬浮物清除，后用活性炭进一步去除各种有机物，让出水清澈、洁净、无卤，可直接饮用；且具备自动维护功能。 中央软水系统是通过天然树脂置换出水中钙、镁离子等，降低水的硬度；有效减少对衣物和皮肤的磨损，避免管道、洁具、卫浴设备等结垢问题。 中央纯水系统采用反渗透法，经精密计算的五道过滤程序，使出水变为纯净水，不含任何杂质和矿物质。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-1.png" /></div>
                            <p class="name"><span>健康饮水</span></p>
                            <p class="desc">层层过滤水中铁锈泥沙大颗粒物及氯元素、重金属，开水直饮</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-2.png" /></div>
                            <p class="name"><span>呵护肌肤</span></p>
                            <p class="desc">去除钙镁离子，降低水的硬度，长期使用软化水沐浴、洗脸可使肌肤光滑细嫩，对婴儿和儿童的肌肤更有保护作用</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-water-3.png" /></div>
                            <p class="name"><span>保护设备</span></p>
                            <p class="desc">避免管道、阀门、卫浴设备和家用电器中水垢产生，延长使用寿命</p>
                        </li>
                    </ul>
                </div>
                <div class="pro"><img src="../../assets/img/pic-solution-pro-3.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 4">
                <div class="col-l col-bg-4">
                    <h3 class="tit">中央热水系统</h3>
                    <p class="prop">通过壁挂式燃气热水器/电锅炉/太阳能集热板和蓄热水箱等终端配套产品实现热水集中产生，大容量的热水可以同时、多点供给家庭及商业空间生活用热水，可提供24小时充足的恒温热水。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-1.png" /></div>
                            <p class="name"><span>超大水量</span></p>
                            <p class="desc">实现多头同时供水，超大流量</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-2.png" /></div>
                            <p class="name"><span>多水点同时供水</span></p>
                            <p class="desc">全方位满足家庭及商用空间同时热水使用需求</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-3.png" /></div>
                            <p class="name"><span>持久恒温</span></p>
                            <p class="desc">彻底解决水温忽高忽低的烦恼</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-hotwater-4.png" /></div>
                            <p class="name"><span>即时热水</span></p>
                            <p class="desc">根据实际使用需求，增配循环泵，即时享用舒适热水</p>
                        </li>
                    </ul>
                </div>
                <div class="pro"><img src="../../assets/img/pic-solution-pro-4.jpg" /></div>
            </div>
            <div class="col-box" v-if="tabsIndex == 5">
                <div class="col-l col-bg-5">
                    <h3 class="tit">智能联控系统</h3>
                    <p class="prop">通过打通各配套产品通讯协议，实现全套中央系统智能联控，集成控制面板（手机APP＋线控面板），双屏集成控制代替空调、新风、暖通单独线控面板；简化场景式操作（会客、聚会、休息、离家模式），一键控制全屋温度、湿度、洁净度、风速。</p>
                    <ul class="infos">
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-1.png" /></div>
                            <p class="name"><span>节能</span></p>
                            <p class="desc">主动式环境检测，远程掌控＋智能开启，精确定时、合理节能，全屋能耗实时掌握</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-2.png" /></div>
                            <p class="name"><span>便利</span></p>
                            <p class="desc">集成控制面板，一键开启适宜舒适环境模式，远程控制＋程序化预先设置，让智能融入场景化生活更便利</p>
                        </li>
                        <li>
                            <div class="pic"><img src="../../assets/img/icon-solution-lamp-3.png" /></div>
                            <p class="name"><span>舒适</span></p>
                            <p class="desc">检测温度、湿度、光照度、PM2.5、二氧化碳、TVOC、噪声等，自动触发传感接入，红外射频远程控制</p>
                        </li>
                    </ul>
                </div>
                <div class="pro"><img src="../../assets/img/pic-solution-pro-5.jpg" /></div>
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
        let index = this.$route.params.index;

        if (index == 2 || index == 3 || index == 4 || index == 5) {
            this.tabsIndex = index;

            setTimeout(() => {
                let top = this.$el.querySelector('#tabs').offsetTop - 100;
                document.body.scrollTop = top;
                document.documentElement.scrollTop  =  top;
            }, 100);
        } else {
            this.tabsIndex = 1;
        }
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
    padding-bottom: 3rem;

    .banner {
        width: 100%;

        .banner-con {
            width: 100%;
            height: 30rem;
            position: relative;
            z-index: 2;

            .radius {
                width: 27%;
                height: 0;
                padding-top: 27%;
                position: absolute;

                .bg {
                    padding-top: 100%;
                    width: 100%;
                    height: 0;
                    position: absolute;
                    top: 0;
                    left: 0;
                    z-index: 1;

                    .bg-box {
                        width: 100%;
                        height: 100%;
                        -webkit-border-radius: 50%;
                        border-radius: 50%;
                        -webkit-box-shadow:0px 3px 7px 0 #7f7f7f;
                        box-shadow:0px 3px 7px 0 #7f7f7f;
                        overflow: hidden;
                        position: absolute;
                        top: 0;
                        left: 0;
                        z-index: 10;
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
                    padding: 0.5rem 0 0.3rem;
                    line-height: 1.7rem;
                    font-size: 1.2rem;
                    color:#44423A;
                    text-align: center;
                    position: relative;
                    z-index: 2;
                }

                .name {
                    line-height: 2.15rem;
                    color: #fff;
                    position: relative;
                    text-align: center;
                    z-index: 2;
                    font-size: 1.55rem;
                }
            }

            .radius1 {
                top: 0.7rem;
                left: 50%;
                -webkit-transform: translateX(-50%);
                transform: translateX(-50%);

                .bg {
                    .bg-box {
                        border: 0.5rem solid #90C421;
                        background: #d2e7a6;
                    }
                }

                .name {
                    color:#90C421;
                }
            }

            .radius2 {
                top: 8.3rem;
                left: 0.1rem;

                .bg {
                    .bg-box {
                        border: 0.5rem solid #FCD202;
                        background:#feed99;
                    }
                }

                .name {
                    color:#CEAE14;
                }
            }

            .radius3 {
                top: 8.3rem;
                right: 0.1rem;

                .bg {
                    .bg-box {
                        border: 0.5rem solid #01AFEB;
                        background: #99dff7;
                    }
                }

                .prop {
                    color:#323132;
                }

                .name {
                    color:#01AFEB;
                }
            }

            .radius4 {
                top: 19.35rem;
                left: 9%;

                .bg {
                    .bg-box {
                        border: 0.5rem solid #90C421;
                        background:#d2e7a6;
                    }
                }

                .prop {
                    color:#323132;
                }

                .name {
                    color:#90C421;
                }
            }

            .radius5 {
                top: 19.35rem;
                right: 9%;

                .bg {
                    .bg-box {
                        border: 0.5rem solid #1A2950;
                        background:#a3a9b9;
                    }
                }

                .prop {
                    color:#323132;
                }

                .name {
                    color:#1A2950;
                }
            }

            .center-radius {
                margin-top: -17%;
                width: 40%;
                padding: 40% 0 0;
                position: absolute;
                top: 50%;
                left: 50%;
                -webkit-transform: translateX(-50%);
                transform: translateX(-50%);
                text-align: center;
                color: #fff;

                .bg {
                    width: 100%;
                    height: 100%;
                    border-radius: 100%;
                    background: -webkit-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                    background: -moz-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                    background: -ms-linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                    background: linear-gradient(46deg,rgba(5,235,251,1) 0%,rgba(4,225,248,1) 100%,rgba(2,210,245,1) 100%);
                    box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
                    position: absolute;
                    top: 0;
                    left: 0;
                    z-index: 1;
                }

                .tit {
                    width: 100%;
                    line-height: 2.1rem;
                    font-size: 1.5rem;
                    position: absolute;
                    top: 50%;
                    left: 0;
                    -webkit-transform: translateY(-50%);
                    transform: translateY(-50%);
                    z-index:10;
                    text-align: center;
                }
            }
        }

        .infos {
            width: 100%;
            height: 27.2rem;;
            position: relative;

            &:after {
                width: 100%;
                height: 100%;
                content: " ";
                -webkit-filter: blur(10px);
                -moz-filter: blur(10px);
                -ms-filter: blur(10px);
                filter: blur(10px);
                background: url(../../assets/img/pic-solution-banner.jpg) no-repeat;
                background-size: cover;
                position: absolute;
                top: 0;
                left: 0;
                z-index: 1;
            }

            .tit {
                padding: 1.6rem 0 3.05rem;
                color: #0784D0;
                line-height: 1.9rem;
                font-size: 1.35rem;
                text-align: center;
                position: relative;
                z-index: 10;
            }

            .signs {
                text-align: center;
                position: relative;
                z-index: 10;

                span {
                    margin: 0 0.35rem 0.85rem;
                    padding: 0 0.6rem;
                    min-width: 6rem;
                    background:#0784D0;
                    color:#fff;
                    line-height: 2.45rem;
                    border-radius: 1.7rem;
                    display: inline-block;
                    font-size: 1.2rem;
                }
            }

            .prop {
                padding: 1.45rem 2.2rem 0;
                line-height: 1.45rem;
                color:#fff;
                font-size: 1rem;
                position: relative;
                z-index: 10;
            }
        }
    }

    .s-hint {
        padding: 2rem 0;
        width: 100%;

        img {
            margin: 0 auto;
            width: 100%;
            display: block;
        } 

        .infos {
            position: relative;

            .tit {
                padding: 0.5rem 0.5rem;
                background:linear-gradient(72deg,rgba(2,216,247,1) 0%,rgba(1,175,235,1) 100%);
                font-size:1rem;
                color:#fff;
                line-height:1.4rem;
                text-align: center;
                position: absolute;
                top: 0; 
                right: 0.5rem;
                font-weight:100;
                z-index: 10;
            }
        }
    }

    .s-tabs {
        height:6.55rem;
        background:#ECECEC;

        ul  {
            padding: 1rem 2.5rem 0;
            hegiht: 6.55rem;
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;
            -webkit-justify-content: space-between;
            -moz-justify-content: space-between;
            -ms-justify-content: space-between;
            justify-content: space-between;

            li {
                height: 5.55rem;
                line-height: 1.45rem;
                color:#4A4A4A;
                font-size: 1rem;
                cursor:pointer;
                text-align: center;
                position: relative;

                .pic {
                    margin: 0 auto 0.3rem;
                    width: 3rem;
                    height: 3rem;
                    line-height: 2.7rem;
                    background:rgba(242,242,242,1);
                    border:0.1rem solid rgba(255,255,255,1);
                    border-radius: 3rem;
                    text-align: center;
                }

                &.active {

                    &:after {
                        width: 100%;
                        height: 0.35rem;
                        background: #01AFEB;
                        content: " ";
                        position: absolute;
                        left: 0;
                        bottom: 0;
                    }
                }
            }
        }
    }

    .s-tabs-con {
        padding: 1rem 0 0;
        background:#fff;

        .col-l {
            padding: 2.55rem 0 0;
            width: 100%;
            background-repeat: no-repeat;
            background-position: center center;
            background-size: cover;
            position: relative;

            &:after {
                width: 100%;
                height: 100%;
                position: absolute;
                content: " ";
                background: rgba(0, 0, 0, 0.5);
                top: 0;
                left: 0;
                z-index: 1;
            }

            &.col-bg-1 {
                background-image: url(../../assets/img/pic-solution-640x567-1.jpg);
            }

            &.col-bg-2 {
                background-image: url(../../assets/img/pic-solution-640x567-2.jpg);
            }

            &.col-bg-3 {
                background-image: url(../../assets/img/pic-solution-640x567-3.jpg);
            }

            &.col-bg-4 {
                background-image: url(../../assets/img/pic-solution-640x567-4.jpg);
            }

            &.col-bg-5 {
                background-image: url(../../assets/img/pic-solution-640x567-5.jpg);
            }
        }

        .tit {
            margin: 0 auto;
            width:50%;
            line-height:3.4rem;
            background:linear-gradient(72deg,rgba(2,216,247,1) 0%,rgba(1,175,235,1) 100%);
            text-align: center;
            font-size: 1.55rem;
            color: #fff;
            font-weight: 100;
            position: relative;
            z-index: 10;
        }

        .prop {
            padding: 1.7rem 1rem 1.45rem;
            line-height: 1.7rem;
            color: #fff;
            font-size: 1.2rem;
            text-align: center;
            position: relative;
            z-index: 10;
            text-shadow:0px 3px 7px rgba(0,0,0,0.5);
        }

        .infos  {
            padding: 0 0 2.66rem 0.3rem;
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;
            -webkit-justify-content: space-between;
            -moz-justify-content: space-between;
            -ms-justify-content: space-between;
            justify-content: space-between;
            position: relative;
            z-index: 10;

            li {
                -webkit-flex: 1;
                -moz-flex: 1;
                -ms-flex: 1;
                flex: 1;
                padding: 0 0.3rem 0 0;

                .pic {
                    padding-bottom: 0.85rem;
                    text-align: center;

                    img {
                        width: 3.4rem;
                    }
                }

                .name {
                    text-align: center;

                    span {
                        white-space: nowrap;
                        line-height:2.55rem;
                        background:#EAEAEA;
                        border-radius:3.4rem;
                        text-align: center;
                        font-size: 1.0rem;
                        color:#252424;
                        display: block;
                    }
                }

                .desc {
                    padding-top: 1rem;
                    line-height: 1.2rem;
                    font-size: 0.85rem;
                    color:#fff;
                    text-shadow:0px 3px 7px rgba(0,0,0,0.5);
                }
            }
        }

        .pro {
            padding-top: 2.55rem;
            text-align: center;

            img {
                width: 100%;
            }
        }
    }
}
</style>