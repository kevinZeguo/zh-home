<template>
    <div class="about">
        <div class="a-banner"></div>

        <div class="layout mt30">
            <div class="a-col a-col-h1">
                <h2 class="tit1">关于众华舒适家</h2>
                <p class="prop1">是众华舒适环境科技有限公司旗下舒适家用品牌，专注于打造舒适温度、适宜湿度、新鲜空气、健康饮水、恒温热水、智能联控系统，通过专业集成设计、标准化、一体化的集成施工，全年365天2小时即达即时尊享售后服务保障，致力于打造舒适、健康、环保、节能、智能、集成的“恒温、恒湿、恒静、恒氧、恒净”舒适环境体验。</p>
            </div>
            <div class="a-col"><img src="../../assets/img/pic-600x460-1.jpg" /></div>
        </div>

        <div class="layout">
            <div class="a-col"><img src="../../assets/img/pic-600x460-2.jpg" /></div>
            <div class="a-col a-col-h1">
                <h2 class="tit2">使命</h2>
                <p class="prop2">创造每一个“您” 对舒适环境的一切美好向往！</p>
                <h2 class="tit2">愿景</h2>
                <p class="prop2">成为引领舒适生活变革的世界级百年企业</p>
                <h2 class="tit2">理念</h2>
                <p class="prop2">做一个让社会尊敬的企业</p>
            </div>
        </div>

        <div class="layout mt30">
            <div class="a-col a-col-h2">
                <h3 class="tit3">众华舒适家，给您：</h3>
                <h2 class="tit4">舒适的<strong>服务</strong>和舒适的<strong>家</strong></h2>
                <ul class="prop3">
                    <li>
                        <div class="nums"><img src="../../assets/img/icon-nums-1.png" /></div>
                        <h4 class="name">价格透明·省钱</h4>
                        <p class="p">后期无任何增项，更放心</p>
                    </li>
                    <li>
                        <div class="nums"><img src="../../assets/img/icon-nums-2.png" /></div>
                        <h4 class="name">尊享售后·省心</h4>
                        <p class="p">全屋10年售后服务跟踪 尊享即时服务</p>
                    </li>
                    <li>
                        <div class="nums"><img src="../../assets/img/icon-nums-3.png" /></div>
                        <h4 class="name">集成施工·省时</h4>
                        <p class="p">完善售前售后团队，集成设计施工</p>
                    </li>
                    <li>
                        <div class="nums"><img src="../../assets/img/icon-nums-4.png" /></div>
                        <h4 class="name">便捷操控·省事</h4>
                        <p class="p">智能，一屏控制全屋舒适系统</p>
                    </li>
                </ul>
            </div>
            <div class="a-col"><img src="../../assets/img/pic-600x600-1.jpg" /></div>
        </div>

        <div class="a-pro mt30">
            <div class="layout">
                <div class="a-pro-one">
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
.about {
    padding-bottom: 30px;

    .a-banner {
        width: 100%;
        min-width: 1200px;
        height: 515px;
        background: url(../../assets/img/pic-1920x515-1.jpg) no-repeat center center;
    }

    .a-col {
        width: 600px;
        float: left;
        background: #fff;

        &.a-col-h1 {
            padding: 0 95px;
            height: 460px;
        }

        &.a-col-h2 {
            padding: 0 95px;
            height: 600px;
        }

        .tit1 {
            padding: 15px 0 4px;
            line-height: 73px;
            position: relative;
            font-size: 34px;
            font-weight: 100;
            color:#413F3F;
 
            &:after {
                width:47px;
                height:4px;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: 0;
                bottom: 0;
            }
        }

        .prop1 {
            padding-top: 108px;
            font-size: 16px;
            line-height: 28px;
            color:#5B412C;
        }

        .tit2 {
            padding: 45px 0 20px;
            line-height: 47px;
            position: relative;
            font-size: 34px;
            font-weight: 100;
            color:#413F3F;
 
            &:after {
                width:4px;
                height:28px;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: -12px;
                top: 55px;
            }
        }

        .prop2 {
            font-size: 20px;
            line-height: 26px;
            color:#5B412C;
        }

        .tit3 {
            padding: 77px 0 0;
            line-height: 40px;
            position: relative;
            font-size: 26px;
            font-weight: 100;
            color:#413F3F;
            text-align: center;
        }

        .tit4 {
            padding: 0 0 23px;
            line-height: 47px;
            position: relative;
            font-size: 26px;
            font-weight: 100;
            color:#413F3F;
            text-align: center;
 
            &:after {
                margin-left: -23px;
                width:47px;
                height:4px;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: 50%;
                bottom: 0;
            }

            strong {
                color:#01AFEB;
                font-size: 34px;
                font-weight: 100;
            }
        }

        .prop3 {
            padding-top: 18px;
            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                padding-top: 58px;
                width: 50%;
                float:left;
                color: #5B412C;

                .nums {
                    height: 24px;
                    text-align: center;
                }

                .name {
                    padding-top:5px;
                    line-height: 26px;
                    text-align: center;
                    font-size: 20px;
                    font-weight: 100;
                }

                .p {
                    padding-top: 6px;
                    line-height: 20px;
                    font-size: 12px;
                    text-align: center;
                }
            }
        }
    }

    .a-pro {
        padding: 127px 0 0;
        width: 100%;
        min-width: 1200px;
        height: 500px;
        background: url(../../assets/img/pic-1920x515-1.jpg) no-repeat center center;

        .a-pro-one {
            margin: 0 auto;
            width: 638px;
            height: 234px;
            background:rgba(255,255,255,0.8);

            .tit {
                margin-bottom: 10px;
                padding-top: 46px;
                font-size:28px;
                font-family:PingFangSC-Light;
                font-weight:bold;
                color:#5B412C;
                line-height:39px;
                text-align: center;
            }
            ul {
                padding-top: 20px;
                text-align: center;

                &:after {
                    height: 0;
                    content: " ";
                    clear: both;
                    display: block;
                }

                li {
                    width: 33.3333333%;
                    text-align: center;
                    float:left;
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
    }
}
</style>
