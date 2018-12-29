<template>
    <div class="class-room">
        <ul class="c-nav">
            <li class="c-nav-1">温度课堂</li>
            <li class="c-nav-2">空气课堂</li>
            <li class="c-nav-3">水处理课堂</li>
            <li class="c-nav-4">热水课堂</li>
            <li class="c-nav-5">厨房课堂</li>
            <li class="c-nav-6">智能课堂</li>
        </ul>

        <div class="c-container">
            <div class="c-col-l">
                <div class="c-sidebar">
                    <div class="hd">温度课堂</div>
                    <ul class="bd">
                        <li>地暖小知识</li>
                        <li>暖气片小知识</li>
                        <li>老房装暖气</li>
                        <li>中央空调小知识</li>
                    </ul>
                </div>
            </div>
            <div class="c-col-r">
                <div class="c-con">
                    <div class="c-tit">地暖小知识</div>
                    <div class="c-names"><span>地暖的定义</span></div>
                    <div class="c-prop">地暖是地板辐射采暖的简称，是以整个地面为散热器，通过地板辐射层中的热媒，均匀加热整个地面，利用地面自身的蓄热和热量向上辐射的规律由下至上进行传导，来达到取暖的目的。</div>
                    <div class="c-prop"><img src="../../assets/img/pic-700x395-1.jpg" /></div>
                    <div class="c-names"><span>地暖的特点</span></div>
                    <div class="c-prop">1.舒适健康：地暖的温度是自下而上的，给人以温足而头凉的舒适感，符合中医理论。<br />2.节能环保：在达到同样的室温效果，比传统采暖可以调低2-3度，有效节约能源，并且不会污染室内空气。<br />3.散热均匀稳定：地暖传热，热量散发均匀，加之混凝土有蓄能作用，即使间歇供暖也能保持室温稳定。<br />4.减少楼层噪音：中国楼板隔音效果极差，采用地暖增加了保温层，可降低噪音污染。</div>
                    <div class="c-names"><span>安装地暖流程</span></div>
                    <div class="c-prop">整平地面。地暖正式开始铺设之前，要先将室内的地面清理干净，保证地面的平整，排除地面的凹凸和杂物。确认壁挂炉以及分集水器的安装位置。<br /><br />1.安装温控线：在装分集水器的地方开槽，隐埋温控线，并将相关温控线放到其周围，以便连接。<br />2.安装主水管：地暖主水管必须使用热水管且管道需要能在60℃高温环境中长时间使用，可使用PE-X或者PB管，安装平直整齐。<br />3.铺设保温层：保温板铺设要平整，相互联接缝要紧密，整板放在四周，切割板放在中间，高差和缝隙不能超过标准范围。<br />4.铺设反射膜：反射膜铺设一定平整，遮盖严密，反射膜方格对称整洁，反射膜之间必需用透明胶带或铝箔胶带粘贴。<br />5.铺设地暖管：地暖管应按设计图纸标定的管间距和走向敷设，安装间断或完毕时，敞口处应随时封堵。地暖切口应平整，断口面应垂直管轴线。<br />6.安装分集水器：将组装好的分集水器按照预先根据用户家中实际情况确定的位置和标高，平直、牢固的紧贴于墙壁，并用膨胀螺栓固定好。<br />7.管路水压测试：地暖管铺设好后，进行水压试验，先对管道进行水压冲洗、吹扫等，保证管道内无异物。然后从注水排气阀注入清水，试验压力为工作压力的1.5～2倍，但不小于0.6Mpa，稳压1小时内压力降不大于0.05Mpa，且不渗不漏为合格。<br />8.回填找平地面：回填细石混凝土，保持全屋水平线必须在一个高度。铺设混凝土时，门口、过道、地漏必须做好记号，防止后期施工被破坏。<br />9.安装壁挂炉：根据壁挂炉尺寸，及安装前预留尺寸，烟道位置，校准正确位置后再安装壁挂炉，壁挂炉底下接口采用软管连接。</div>
                    <div class="c-prop"></div>
                </div>

                <div class="c-con mt30">
                    <ul class="c-name-link">
                        <li><a href="javascript:;">查看温度解决方案</a></li>
                        <li><a href="javascript:;">1分钟快速报价</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            msg: ''
        }
    },
    mounted () {
        
    },
    methods: {
    }

}
</script>

<style lang="scss" scoped>
.class-room {
     padding: 165px 0 0;

     .c-nav {
        margin: 0 auto;
        padding: 0 65px;
        width: 1200px;
        height: 80px;

        &:after {
            height: 0;
            content: " ";
            clear: both;
            display: block;
        }

        li {
            margin-right: 10px;
            padding-left: 40px;
            width: 170px;
            height: 80px;
            line-height: 80px;
            cursor: pointer;
            background-repeat: no-repeat;
            background-position: 9px center;
            color: #fff;
            font-size: 20px;
            float: left;

            &.c-nav-1 {
                background-color: #90C421;
                background-image: url(../../assets/img/icon-temperature.png);
                background-size: 18px 39px;
            }

            &.c-nav-2 {
                background-color: #01AFEB;
                background-image: url(../../assets/img/icon-air.png);
                background-size: 24px 24px;
            }

            &.c-nav-3 {
                background-color: #FCD202;
                background-image: url(../../assets/img/icon-water.png);
                background-size: 18px 31px;
            }

            &.c-nav-4 {
                background-color: #1A2950;
                background-image: url(../../assets/img/icon-hotwater.png);
                background-size: 18px 25px;
            }

            &.c-nav-5 {
                background-color: #499A2A;
                background-image: url(../../assets/img/icon-kitchen.png);
                background-size: 24px 24px;
            }

            &.c-nav-6 {
                background-color: #F06945;
                background-image: url(../../assets/img/icon-lamp.png);
                background-size: 24px 24px;
            }

            &:last-child {
                margin-right: 0;
            }
        }
    }

    .c-container {
        margin: 0 auto;
        padding: 60px 0 50px;
        width: 1080px;
        -webkit-display: flex;
        -moz-display: flex;
        -ms-display: flex;
        display: flex;
        -webkit-justify-content: space-between;
        -moz-justify-content: space-between;
        -ms-justify-content: space-between;
        justify-content: space-between;
        color: #3F3F40;

        .c-col-l {
            width: 260px;
        }

        .c-col-r {
            width: 800px;
        }

        .c-sidebar {
            padding: 0 30px;
            width: 260px;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius:4px;

            .hd {
                line-height: 68px;
                border-bottom: 1px solid #EFEAEA;
                color: #3F3F40;
                font-size: 20px;
                text-align: center;
            }

            .bd {
                padding: 10px 0 30px;;

                li {
                    line-height: 32px;
                    text-align: center;
                    font-size: 16px;
                    color: #3F3F40;
                    cursor: pointer;

                    &:hover {
                        color: #0780ED;
                    }
                }
            }
        }

        .c-con {
            padding: 0 50px;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius: 4px;

            .c-tit {
                height: 62px;
                line-height: 62px;
                position: relative;
                font-size: 20px;
                color: #3F3F40;
                text-align: center;
                font-weight: 100;

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

            .c-names {
                padding: 30px 0 10px;
                text-align: center;

                span {
                    padding: 0 10px;
                    line-height: 39px;
                    background: #C5F2FF;
                    display: inline-block;
                    font-size: 16px;
                }
            }

            .c-prop {
                padding: 10px 0;
                font-size: 14px;
                line-height: 24px;
            }

            .c-name-link {
                padding: 25px 0;
                line-height:22px;
                text-align: center;

                &:after {
                    height: 0;
                    content: " ";
                    clear: both;
                    display: block;
                }

                li {
                    width: 50%;
                    height: 50px;
                    line-height: 50px;
                    border-right: 1px solid #EFEAEA;
                    float: left;

                    &:last-child {
                        border-right: 0;
                    }
                }

                a {
                    padding-right: 20px;
                    line-height: 22px;
                    display: inline-block;
                    background: url(../../assets/img/icon-right.png) no-repeat right center;
                    color: #0780ED;
                    font-size: 16px;

                    &:hover {
                        color: #0780ED;
                        text-decoration: underline;
                    }
                }
            }
        }
    }
}
</style>
