<template>
    <div class="class-room">
        <ul class="c-nav">
            <li class="active">温度课堂</li>
            <li class="c-nav-2">空气课堂</li>
            <li class="c-nav-3">水处理课堂</li>
            <li class="c-nav-4">热水课堂</li>
            <li class="c-nav-5">厨房课堂</li>
            <li class="c-nav-6">智能课堂</li>
        </ul>

        <div class="c-container">
            <div class="c-con">
                <div class="c-tit">地暖小知识</div>
                <div class="c-names"><span>地暖的定义</span></div>
                <div class="c-prop">地暖是地板辐射采暖的简称，是以整个地面为散热器，通过地板辐射层中的热媒，均匀加热整个地面，利用地面自身的蓄热和热量向上辐射的规律由下至上进行传导，来达到取暖的目的。</div>
                <div class="c-prop"><img src="../../assets/img/pic-522x295-1.jpg" class="img" /></div>
                <div class="c-names"><span>地暖的特点</span></div>
                <div class="c-prop">1.舒适健康：地暖的温度是自下而上的，给人以温足而头凉的舒适感，符合中医理论。<br />2.节能环保：在达到同样的室温效果，比传统采暖可以调低2-3度，有效节约能源，并且不会污染室内空气。<br />3.散热均匀稳定：地暖传热，热量散发均匀，加之混凝土有蓄能作用，即使间歇供暖也能保持室温稳定。<br />4.减少楼层噪音：中国楼板隔音效果极差，采用地暖增加了保温层，可降低噪音污染。</div>
                <div class="c-names"><span>安装地暖流程</span></div>
                <div class="c-prop">整平地面。地暖正式开始铺设之前，要先将室内的地面清理干净，保证地面的平整，排除地面的凹凸和杂物。确认壁挂炉以及分集水器的安装位置。<br /><br />1.安装温控线：在装分集水器的地方开槽，隐埋温控线，并将相关温控线放到其周围，以便连接。<br />2.安装主水管：地暖主水管必须使用热水管且管道需要能在60℃高温环境中长时间使用，可使用PE-X或者PB管，安装平直整齐。<br />3.铺设保温层：保温板铺设要平整，相互联接缝要紧密，整板放在四周，切割板放在中间，高差和缝隙不能超过标准范围。<br />4.铺设反射膜：反射膜铺设一定平整，遮盖严密，反射膜方格对称整洁，反射膜之间必需用透明胶带或铝箔胶带粘贴。<br />5.铺设地暖管：地暖管应按设计图纸标定的管间距和走向敷设，安装间断或完毕时，敞口处应随时封堵。地暖切口应平整，断口面应垂直管轴线。<br />6.安装分集水器：将组装好的分集水器按照预先根据用户家中实际情况确定的位置和标高，平直、牢固的紧贴于墙壁，并用膨胀螺栓固定好。<br />7.管路水压测试：地暖管铺设好后，进行水压试验，先对管道进行水压冲洗、吹扫等，保证管道内无异物。然后从注水排气阀注入清水，试验压力为工作压力的1.5～2倍，但不小于0.6Mpa，稳压1小时内压力降不大于0.05Mpa，且不渗不漏为合格。<br />8.回填找平地面：回填细石混凝土，保持全屋水平线必须在一个高度。铺设混凝土时，门口、过道、地漏必须做好记号，防止后期施工被破坏。<br />9.安装壁挂炉：根据壁挂炉尺寸，及安装前预留尺寸，烟道位置，校准正确位置后再安装壁挂炉，壁挂炉底下接口采用软管连接。</div>
                <div class="c-prop"></div>
            </div>

            <div class="c-sidebar">
                <div class="hd">温度课堂</div>
                <ul class="bd">
                    <li>地暖小知识</li>
                    <li>暖气片小知识</li>
                    <li>老房装暖气</li>
                    <li>中央空调小知识</li>
                </ul>
            </div>

            <div class="c-name-link">
                <a href="javascript:;">查看温度解决方案</a>
            </div>
            <div class="c-name-link">
                <a href="javascript:;">1分钟快速报价</a>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            selected: '1'
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
    padding: 2rem 0 0;

    .c-nav {
        padding: 0 0.8rem;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
        overflow-scrolling: touch;
        overflow-x: auto;
        overflow-y: hidden;
        margin-bottom: -.2rem;
        overflow: -moz-scrollbars-none;
        overflow: -moz-scrollbars-none;
        border-bottom: 1px solid #D0D0D0;

        &::-webkit-scrollbar{
            display: none;
        }

        li {
            margin-right: 0.8rem;
            height: 1.7rem;
            line-height: 1.7rem;
            cursor: pointer;
            background-repeat: no-repeat;
            background-position: 9px center;
            color: #4A4A4A;
            font-size: 1.2rem;
            display: inline-block;
            position: relative;

            &.active {
                &:after {
                    width: 100%;
                    height: 2px;
                    background: #0780ED;
                    content: " ";
                    position: absolute;
                    left: 0;
                    bottom: 0;
                }
            }
        }
    }

    .c-container {
        margin: 0 auto;
        padding: 0 2.4rem 1rem;
        color: #3F3F40;

        .c-sidebar {
            margin-top: 2.9rem;
            padding: 0 2.5rem;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius:4px;

            .hd {
                line-height: 2.5rem;
                border-bottom: 1px solid #EFEAEA;
                color: #3F3F40;
                font-size: 1.4rem;
                text-align: center;
            }

            .bd {
                padding: 10px 0 30px;;

                li {
                    line-height: 2.7rem;
                    text-align: center;
                    font-size: 1.2rem;
                    color: #3F3F40;
                    cursor: pointer;

                    &:hover {
                        color: #0780ED;
                    }
                }
            }
        }

        .c-tit {
            height: 3.4rem;
            line-height: 3.4rem;
            position: relative;
            font-size: 1.2rem;
            color: #3F3F40;
            text-align: center;
            font-weight: 100;

            &:after {
                width: 2.6rem;
                height: 0.2rem;
                background: #0780ED;
                content: " ";
                position: absolute;
                bottom: 0;
                left:50%;
                margin-left: -1.3rem;
            }
        }

        .c-names {
            padding: 1.7rem 0 0.7rem;
            text-align: center;

            span {
                padding: 0 1rem;
                line-height: 2.7rem;
                background: #C5F2FF;
                display: inline-block;
                font-size: 1.2rem;
            }
        }

        .c-prop {
            padding: 10px 0;
            font-size: 1.2rem;
            line-height: 1.8rem;

            .img {
                width: 100%;
            }
        }

        .c-name-link {
            margin-top: 1rem;
            background: #fff;
            box-shadow:0 2px 4px 0 rgba(0,0,0,0.5);
            border-radius: 4px;
            line-height: 5.1rem;
            text-align: center;

            a {
                padding-right: 2rem;
                line-height: 22px;
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
    }
}
</style>
