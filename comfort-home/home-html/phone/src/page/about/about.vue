<template>
    <div class="about">
        <div class="a-banner"><img src="../../assets/img/pic-640x365-1.jpg" /></div>
        
        <div class="a-pic"><img src="../../assets/img/pic-600x460-1.jpg" /></div>
        <div class="a-col">
            <h2 class="tit1">关于众华舒适家</h2>
            <p class="prop1">是众华舒适环境科技有限公司旗下舒适家用品牌，专注于打造舒适温度、适宜湿度、新鲜空气、健康饮水、恒温热水、智能联控系统，通过专业集成设计、标准化、一体化的集成施工，全年365天2小时即达即时尊享售后服务保障，致力于打造舒适、健康、环保、节能、智能、集成的“恒温、恒湿、恒静、恒氧、恒净”舒适环境体验。</p>
        </div>

        <div class="a-pic"><img src="../../assets/img/pic-600x460-2.jpg" /></div>
        <div class="a-col">
            <h2 class="tit2">使命</h2>
            <p class="prop2">创造每一个“您” 对舒适环境的一切美好向往！</p>
            <h2 class="tit2">愿景</h2>
            <p class="prop2">成为引领舒适生活变革的世界级百年企业</p>
            <h2 class="tit2">理念</h2>
            <p class="prop2">做一个让社会尊敬的企业</p>
        </div>

        <div class="a-pic"><img src="../../assets/img/pic-600x600-1.jpg" /></div>
        <div class="a-col a-col-h2">
            <h3 class="tit3">众华舒适家，给您：</h3>
            <h2 class="tit4">舒适的<strong>服务</strong>和舒适的<strong>家</strong></h2>
            <ul class="prop3">
                <li>
                    <div class="nums"><img src="../../assets/img/icon-nums-1.png" /></div>
                    <h4 class="name">价格透明·省钱</h4>
                    <p class="p">后期无任何增项，更<br />放心</p>
                </li>
                <li>
                    <div class="nums"><img src="../../assets/img/icon-nums-2.png" /></div>
                    <h4 class="name">尊享售后·省心</h4>
                    <p class="p">全屋10年售后服务跟<br />踪 尊享即时服务</p>
                </li>
                <li>
                    <div class="nums"><img src="../../assets/img/icon-nums-3.png" /></div>
                    <h4 class="name">集成施工·省时</h4>
                    <p class="p">完善售前售后团队，<br />集成设计施工</p>
                </li>
                <li>
                    <div class="nums"><img src="../../assets/img/icon-nums-4.png" /></div>
                    <h4 class="name">便捷操控·省事</h4>
                    <p class="p">智能，一屏控制全屋<br />舒适系统</p>
                </li>
            </ul>
        </div>

        <div class="a-pro">
            <div class="a-pro-one">
                <p class="tit">专业·专注</p>
            
                <ul>
                    <li>
                        <p class="name">100+</p>
                        <p class="prop">100+专业服<br />务团队</p>
                    </li>
                    <li>
                        <p class="name">10年</p>
                        <p class="prop">连续10年全屋<br />跟踪售后</p>
                    </li>
                    <li>
                        <p class="name">10万+</p>
                        <p class="prop">累计服务10万+<br />家庭</p>
                    </li>
                </ul>
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

    .a-banner {
        width: 100%;
        text-align: center;

        img {
            width: 100%;
            max-width:640px;
        }
    }

    .a-pic {
        margin-top: 1.7rem;
        width: 100%;
        text-align: center;

        img {
            width: 100%;
            max-width:640px;
        }
    }

    .a-col {
        padding: 0 2.3rem 1rem;
        background: #fff;

        .tit1 {
            padding: 2.55rem 0 1.2rem;
            line-height: 2.4rem;
            position: relative;
            font-size: 1.7rem;
            font-weight: 100;
            color:#413F3F;
            text-align: center;
 
            &:after {
                width:4.3rem;
                height:0.2rem;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: 50%;
                bottom: 0;
                margin-left: -2.15rem;
            }
        }

        .prop1 {
            padding: 1.7rem 0 2.5rem;
            font-size: 1.35rem;
            line-height: 2.55rem;
            color:#5B412C;
        }

        .tit2 {
            padding: 3.4rem 0 1.7rem;
            line-height: 2.4rem;
            position: relative;
            font-size: 1.7rem;
            font-weight: 100;
            color:#413F3F;
 
            &:after {
                width:0.35rem;
                height:1.7rem;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: -1.05rem;
                top: 2.25em;
            }
        }

        .prop2 {
            font-size: 1.35rem;
            line-height: 1.9rem;
            color:#5B412C;
        }

        .tit3 {
            padding: 3.4rem 0 0;
            line-height: 2.4rem;
            position: relative;
            font-size: 1.7rem;
            font-weight: 100;
            color:#413F3F;
            text-align: center;
        }

        .tit4 {
            padding: 0.85rem 0 1.55rem;
            line-height: 3.6rem;
            position: relative;
            font-size: 1.7rem;
            font-weight: 100;
            color:#413F3F;
            text-align: center;
 
            &:after {
                margin-left: -2.15rem;
                width:4.3rem;
                height:0.2rem;
                background:#01AFEB;
                content: " ";
                position: absolute;
                left: 50%;
                bottom: 0;
            }

            strong {
                color:#01AFEB;
                font-size: 2.0rem;
                font-weight: 100;
            }
        }

        .prop3 {
            padding-top: 1rem;
            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                padding-top: 3.3rem;
                width: 50%;
                float:left;
                color: #5B412C;

                .nums {
                    text-align: center;

                    img {
                        width: 1rem;
                    }
                }

                .name {
                    padding-top:0.3rem;
                    line-height: 2.4rem;
                    text-align: center;
                    font-size: 1.7rem;
                    font-weight: 100;
                }

                .p {
                    padding-top: 0.7rem;
                    height: 4.1rem;
                    line-height: 1.7rem;
                    font-size: 1.2rem;
                    text-align: center;
                }
            }
        }
    }

    .a-pro {
        padding: 4.6rem 2.4rem 4.25rem;
        width: 100%;
        background: #000;

        .a-pro-one {
            background:rgba(255,255,255,0.8);

            .tit {
                padding-top: 3.15rem;
                font-size:1.7rem;
                font-family:PingFangSC-Light;
                font-weight:bold;
                color:#5B412C;
                line-height:2.4rem;
                text-align: center;
            }
            ul {
                padding: 2.55rem 0 3.65rem;
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
                        font-size:1.7rem;
                        font-weight:300;
                        line-height:2.4rem;
                    }

                    .prop {
                        line-height:1.7rem;
                        text-align: center;
                        font-size: 1.2rem;
                    }
                }
            }
        }
    }
}
</style>
