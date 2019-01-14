<template>
    <div class="class-room">
        <ul class="c-nav">
            <li :class="{active: navIndex == 1}" @click="changeNav(1)">温度课堂</li>
            <li :class="{active: navIndex == 2}" @click="changeNav(2)">空气课堂</li>
            <li :class="{active: navIndex == 3}" @click="changeNav(3)">水处理课堂</li>
            <li :class="{active: navIndex == 4}" @click="changeNav(4)">热水课堂</li>
            <li :class="{active: navIndex == 5}" @click="changeNav(5)">厨房课堂</li>
            <li :class="{active: navIndex == 6}" @click="changeNav(6)">智能课堂</li>
        </ul>

        <div class="c-container" v-if="navIndex == 1">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-tit">地暖小知识</div>
                <div class="c-names"><span>地暖的定义</span></div>
                <div class="c-prop">地暖是地板辐射采暖的简称，是以整个地面为散热器，通过地板辐射层中的热媒，均匀加热整个地面，利用地面自身的蓄热和热量向上辐射的规律由下至上进行传导，来达到取暖的目的。</div>
                <div class="c-prop"><img src="../../assets/img/pic-522x295-1.jpg" class="img" /></div>
                <div class="c-names"><span>地暖的特点</span></div>
                <div class="c-prop">1.舒适健康：地暖的温度是自下而上的，给人以温足而头凉的舒适感，符合中医理论。<br />2.节能环保：在达到同样的室温效果，比传统采暖可以调低2-3度，有效节约能源，并且不会污染室内空气。<br />3.散热均匀稳定：地暖传热，热量散发均匀，加之混凝土有蓄能作用，即使间歇供暖也能保持室温稳定。<br />4.减少楼层噪音：中国楼板隔音效果极差，采用地暖增加了保温层，可降低噪音污染。</div>
                <div class="c-names"><span>安装地暖流程</span></div>
                <div class="c-prop">整平地面。地暖正式开始铺设之前，要先将室内的地面清理干净，保证地面的平整，排除地面的凹凸和杂物。确认壁挂炉以及分集水器的安装位置。<br /><br />1.安装温控线：在装分集水器的地方开槽，隐埋温控线，并将相关温控线放到其周围，以便连接。<br />2.安装主水管：地暖主水管必须使用热水管且管道需要能在60℃高温环境中长时间使用，可使用PE-X或者PB管，安装平直整齐。<br />3.铺设保温层：保温板铺设要平整，相互联接缝要紧密，整板放在四周，切割板放在中间，高差和缝隙不能超过标准范围。<br />4.铺设反射膜：反射膜铺设一定平整，遮盖严密，反射膜方格对称整洁，反射膜之间必需用透明胶带或铝箔胶带粘贴。<br />5.铺设地暖管：地暖管应按设计图纸标定的管间距和走向敷设，安装间断或完毕时，敞口处应随时封堵。地暖切口应平整，断口面应垂直管轴线。<br />6.安装分集水器：将组装好的分集水器按照预先根据用户家中实际情况确定的位置和标高，平直、牢固的紧贴于墙壁，并用膨胀螺栓固定好。<br />7.管路水压测试：地暖管铺设好后，进行水压试验，先对管道进行水压冲洗、吹扫等，保证管道内无异物。然后从注水排气阀注入清水，试验压力为工作压力的1.5～2倍，但不小于0.6Mpa，稳压1小时内压力降不大于0.05Mpa，且不渗不漏为合格。<br />8.回填找平地面：回填细石混凝土，保持全屋水平线必须在一个高度。铺设混凝土时，门口、过道、地漏必须做好记号，防止后期施工被破坏。<br />9.安装壁挂炉：根据壁挂炉尺寸，及安装前预留尺寸，烟道位置，校准正确位置后再安装壁挂炉，壁挂炉底下接口采用软管连接。</div>
            </div>

            <div class="c-con" v-if="tabIndex == 2">
                <div class="c-tit">暖气片小知识</div>
                <div class="c-names"><span>暖气片的定义</span></div>
                <div class="c-prop">暖气片是一种采暖为主的采暖设备。主要在冬天寒冷的北方地区使用，具有保暖的作用，以前多使用铸铁暖气片，现在已经发展出了更多材质的暖气片。 </div>
                <div class="c-prop">铸铁暖气片已经逐步退出了市场舞台，钢制暖气片、铜铝复合散热器、铝制暖气片等新型暖气片无论从材质上还是制作工艺上都优于铸铁散热器，成为市场上最主流的暖气片。</div>
                <div class="c-prop"><img src="../../assets/img/pic-700x293-1.jpg" width="100%" /></div>
                <div class="c-names"><span>暖气片安装事项</span></div>
                <div class="c-prop">1、暖气片在安装前确认暖气片包装的完整,放置时采用相应的防震、防碰措施，不能以任何方式拖拉暖气片，暖气片应存放在干燥和防雨的安全地方。<br />2、现场要清理干净，供热系统的阀门、干管、支管及管道的支、吊架均已安装并按设计要求管道冲洗试压完毕。 3、暖气片外接口螺纹应符合JG/T6-1999的要求，连接暖气片的支管螺纹应完整，如有断丝或缺丝则不得大于螺纹全扣的10%，并至少年宫扣以上的完整螺纹。<br />4、安装暖气片处的内墙已处理完毕。<br />5、钢制暖气片、铝制暖气片、铜铝复合暖气片、铸铁暖气片等本体试验压力如设计无要求时应按设计选用的工作压力的1.5倍进行，但钢制板式暖气片本体最大试验压力不应超过1.3MPa并不小于1.3MPa.试压2至3分钟不渗漏为合格。<br /> 6、暖气片安装步骤：先安进水阀和回水阀，固定挂件用水平尺测量暖气片的位置，将暖气片平稳放置，将阀门连接件与进出水口阀门连接在一起，使用水平尺测量暖气片是否平直，管路安装是否符合要求。使用管钳加固拧紧连接件。试压：关闭主管连接阀门，关闭暖气片的进回水阀，试验压力应为工作压力的1.5倍进行试压2至3分钟不渗漏为合格。</div>
                <div class="c-names"><span>散热器如何保养？</span></div>
                <div class="c-prop">散热器在下一个供暖季节来临之前，一直处于闲置状态。因此，在供暖之前对散热器进行清洁与保护是十分必要的。而正确保养散热器也是必不可少的。<br />新的采暖季节到来之前，应对散热器上连接的放气阀、丝堵及管路上的管件进行检查，（受热胀冷缩的影响）螺纹连接处如有松动现象应拧紧，以免供暖后漏水。还有，清洁散热器表面时，请使用软毛巾或毛刷，请勿使用任何种类的有机溶液，可使用日常的洗涤剂，如：洗洁灵，弱碱性肥皂水等。<br />弄清散热片材质，采暖适宜的保养方法。不同材质的散热片保养方式不一样，如钢制散热片一般要用满水保养的方法，而铝制的则不需要。<br />因此，当我们准备启用散热器供暖之前，如何做好清洁工作是非常重要的，而且马虎不得。毕竟想要舒服的过完整个冬天，散热器是大功臣一个。</div>
                <div class="c-prop text-center"><img src="../../assets/img/pic-648x370-1.jpg" width="100%" /></div>
            </div>

            <div class="c-con" v-if="tabIndex == 3">
                
                <div class="c-prop">暂无</div>
                <div class="c-prop"></div>
            </div>

            <div class="c-con" v-if="tabIndex == 4">
                
                <div class="c-prop">暂无</div>
                <div class="c-prop"></div>
            </div>

            <div class="c-sidebar">
                <div class="hd">温度课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">地暖小知识</li>
                    <li :class="{active: tabIndex == 2}" @click="changeTab(2)">暖气片小知识</li>
                    <li :class="{active: tabIndex == 3}" @click="changeTab(3)">老房装暖气</li>
                    <li :class="{active: tabIndex == 4}" @click="changeTab(4)">中央空调小知识</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/1">查看温度解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 2">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-prop">暂无</div>
            </div>

            <div class="c-sidebar">
                <div class="hd">空气课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">标题1</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/2">查看空气解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 3">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-prop">暂无</div>
            </div>

            <div class="c-sidebar">
                <div class="hd">水处理课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">标题1</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/3">查看水处理解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 4">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-prop">暂无</div>
            </div>

            <div class="c-sidebar">
                <div class="hd">热水课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">标题1</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/4">查看热水解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 5">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-prop">暂无</div>
            </div>

            <div class="c-sidebar">
                <div class="hd">厨房课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">标题1</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/1">查看厨房解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>

        <div class="c-container" v-if="navIndex == 6">
            <div class="c-con" v-if="tabIndex == 1">
                <div class="c-prop">暂无</div>
            </div>

            <div class="c-sidebar">
                <div class="hd">智能课堂</div>
                <ul class="bd">
                    <li :class="{active: tabIndex == 1}" @click="changeTab(1)">标题1</li>
                </ul>
            </div>

            <div class="c-name-link">
                <router-link to="/solution/5">查看智能解决方案</router-link>
            </div>
            <div class="c-name-link">
                <router-link to="/quotation">1分钟快速报价</router-link>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            navIndex: 1,
            tabIndex: 1
        }
    },
    mounted () {
        
    },
    methods: {
        changeNav (index) {
            this.navIndex = index;
            this.tabIndex = 1;
        },
        changeTab (index) {
            this.tabIndex = index;
            document.body.scrollTop = document.documentElement.scrollTop = 0;
        }
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

                    &.active, &:hover {
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
