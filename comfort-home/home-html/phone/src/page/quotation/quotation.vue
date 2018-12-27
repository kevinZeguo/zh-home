<template>
    <div class="quotation">
        <ul class="steps">
            <li :class="{active: step.oneActive, selected: step.oneSelected}">
                <span class="num">1</span>
                <span class="txt">房屋信息</span>
                <span class="line"></span>
            </li>
            <li :class="{active: step.twoActive, selected: step.twoSelected}">
                <span class="num">2</span>
                <span class="txt">舒适系统</span>
                <span class="line"></span>
            </li>
            <li :class="{active: step.threeActive, selected: step.threeSelected}">
                <span class="num">3</span>
                <span class="txt">获取报价</span>
                <span class="line"></span>
            </li>
        </ul>

        <div v-if="step.oneActive">
            <div class="quo-selects">
                <p class="label">我家是</p>
                <div class="select-box">
                    <select v-model="chooseForm.home">
                        <option value='' disabled selected style='color; #999;display:none;'></option>
                        <option label="home1" value="1"></option>
                        <option label="home2" value="1"></option>
                    </select>
                    <span class="txt">请选择</span>
                </div>
            
                <p class="label">实际使用面积</p>
                <div class="field-box">
                    <input type="text" v-model="chooseForm.use" placeholder="请填写使用面积" />
                    <span class="txt">㎡</span>
                </div>
            
                <p class="label">房屋户型</p>
                <div class="select-box">
                    <select v-model="chooseForm.projtect">
                        <option label="projtect1" value="1"></option>
                        <option label="projtect2" value="2"></option>
                    </select>
                    <span class="txt">请选择</span>
                </div>
            
                <p class="label">我家里有</p>
                <div class="field-box">
                    <input type="text" v-model="chooseForm.use" placeholder="请填写" />
                    <span class="txt">人</span>
                </div>
            </div>

            <div class="btns-box">
                <button type="button" @click="oneClick">下一步</button>
            </div>
        </div>

        <div v-if="step.twoActive">
            <div class="quo-choose">
                <ul class="tab-ul">
                    <li class="active">
                        <div class="icons icon-home-five-5"></div>
                        <p class="name">凉爽的夏日</p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-3"></div>
                        <p class="name">清新的空气</p>
                        <p class="sel-result">已选 | 森得新风<span class="sel-btn-close"></span></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-2"></div>
                        <p class="name">洁净的水源</a></p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-1"></div>
                        <p class="name">温暖的房间</p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-4"></div>
                        <p class="name">24小时热水</p>
                    </li>
                    <li>
                        <div class="icons icon-home-five-6"></div>
                        <p class="name">智能的房子</p>
                    </li>
                </ul>

                <div class="pro-list">
                    <ul>
                        <li class="active">
                            <p class="name">大金空调</p>
                            <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                            <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                        </li>
                        <li>
                            <p class="name">日立空调</p>
                            <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                            <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                        </li>
                        <li>
                            <p class="name">约克空调</p>
                            <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                            <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="btns-box">
                <button type="button" @click="twoClick">获取报价</button>
            </div>
        </div>

        <div class="view-result" v-if="step.threeActive">
            <div class="con">
                <p>报价短信已发送至您的手机 189****4871，请查收。 我们的客户经理将尽快与您联系。</p>
                <p>也欢迎您随时致电： 021-4689210</p>
                <p>众华舒适家</p>
            </div>
        </div>

        <div class="quo-dialog" v-if="dialogBln">
            <div class="quo-dialog-hd">
                <div class="tit">获取报价</div>
                <span class="icon-close" @click="closeClick">close</span>
            </div>

            <div class="quo-dialog-bd">
                <p class="prop">报价结果将以短信形式发送至您手机</p>
                <div class="quo-dialog-forms">
                    <input type="text" class="text" placeholder="姓名" />
                    <input type="text" class="text" placeholder="手机号" />
                    <button type="submit" class="btn-submit" @click="threeClick">获取报价</button>
                </div>
            </div>
        </div>
        <div class="quo-modal" v-if="dialogBln"></div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            step: {
                oneActive: true,
                oneSelected: false,
                twoActive: false,
                twoSelected: false,
                threeActive: false,
                threeSelected: false
            },
            chooseForm: {
                home: '',
                use: '',
                projtect: '',
                have: ''
            },
            dialogBln: false
        }
    },
    mounted () {
    },
    methods: {
        oneClick () {
            this.step.oneActive = false;
            this.step.oneSelected = true;
            this.step.twoActive = true;
        },
        twoClick () {
            this.dialogBln = true;
        },
        threeClick () {
            this.dialogBln = false;

            this.step.twoActive = false;
            this.step.twoSelected = true;
            this.step.threeSelected = true;
            this.step.threeActive = true;
        },
        closeClick () {
           this.dialogBln = false; 
        }
    }
}
</script>

<style lang="scss" scoped>
.quotation {
    padding: 0 0.5rem;
    background: #fff;

    .steps {
        padding: 1.7rem 0 1.7rem 0.5rem;
        height: 5.1rem;
        background: #fff;
        box-shadow: 0 3px 3px 0 rgba(167,162,162,1);
        border:2px solid rgba(226,223,223,1);
        text-align: center;

        &:after {
            height: 0;
            content: " ";
            clear: both;
            display: block;
        }

        li {
            float: left;
            width: 33.3333%;
            text-align: center;
            position: relative;

            &:last-child {
                padding-right: 0;
            }

            &.active {
                .num {
                    background: #4285F4;
                }
            }

            &.selected {
                .num {
                    background: url(../../assets/img/icon-right-white.png) no-repeat center center #4285F4;
                    background-size: 1.2rem 1.2rem;
                    overflow: hidden;
                    text-indent: -999em;
                }
            }

            .num {
                width: 1.7rem;
                height: 1.7rem;
                line-height: 1.7rem;
                border-radius: 1.7rem;
                background: #AFB0B3;
                color: #fff;
                text-align: center;
                font-size: 1.1rem;
                float: left;
                position: relative;
                z-index: 10;
            }

            .txt {
                padding: 0 0.5rem;
                line-height: 1.7rem;
                float: left;
                font-size: 1.1rem;
                background: #fff;
                color: #333;
                position: relative;
                z-index: 10;
            }

            .line {
                margin-top: 0.6rem;
                width: 96%;
                height: 0.1rem;
                background: #E1E1E1;
                overflow: hidden;
                position: absolute;
                left: 0;
            }

        }
    }

    .quo-selects {
        padding: 0.5rem 20% 0;

        .label {
            padding: 1.7rem 0 1rem;
            line-height: 1.9rem;
            text-align: center;
            color: #424242;
            font-size: 1.4rem;
        }

        .select-box {
            width: 100%;
            height: 3.4rem;
            position: relative;

            select {
                width: 100%;
                height: 3.4rem;
                background: transparent;
                border-radius: 0.4rem;
                border:0.1rem solid rgba(194,194,194,1);
                line-height: 1.2rem;
                color: #424242;
                position: relative;
                z-index: 10;
            }

            .txt {
                color:#C3C1C1;
                z-index: 1;
                position: absolute;
                top: 0;
                left: 1rem;
                line-height: 3.4rem;
            }
        }

        .field-box {
            width: 100%;
            height: 3.4rem;
            background:rgba(252,252,252,1);
            border-radius: 0.4rem;
            border:0.1rem solid rgba(194,194,194,1);
            position: relative;
            overflow: hidden;

            input {
                padding: 1rem;
                width: 100%;
                height: 3.4rem;
                line-height: 1.2rem;
                font-size: 1.2rem;
                background: #fff;
                color: #424242;
                border: 0;

                &::placeholder {
                    color: #C3C1C1;
                }
            }

            .txt {
                line-height: 3.4rem;
                position: absolute;
                top: 0;
                color:#C3C1C1;
                right: 1rem;
            }
        }
    }

    .quo-choose {
        margin: 1.5rem 0 0;
        -webkit-display: flex;
        -moz-display: flex;
        -ms-display: flex;
        display: flex;

        .tab-ul {
            padding: 1rem 0 1rem 0.2rem;
            width: 30%;
            background: #90C421;

            &:after {
                height: 0;
                content: " ";
                clear:both;
                display: block;
            }

            li {
                width: 100%;
                height: 3.05rem;
                position: relative;
                color: #fff;

                &.active {
                    background: #fff;
                    .icons {
                        &.icon-home-five-1 {
                            background-image: url(../../assets/img/icon-temperature-blue.png);
                        }

                        &.icon-home-five-2 {
                            background-image: url(../../assets/img/icon-water-blue.png);
                        }

                        &.icon-home-five-3 {
                            background-image: url(../../assets/img/icon-air-blue.png);
                        }

                        &.icon-home-five-4 {
                            background-image: url(../../assets/img/icon-hotwater-blue.png);
                        }

                        &.icon-home-five-5 {
                            background-image: url(../../assets/img/icon-summer-blue.png);
                        }

                        &.icon-home-five-6 {
                            background-image: url(../../assets/img/icon-lamp-blue.png);
                        }
                    }

                    .name {
                        color: #696868;
                    }
                }

                .icons {
                    width: 1.6rem;
                    height: 3.05rem;
                    text-align:center;
                    color: #15A3C2;
                    background-repeat: no-repeat;
                    background-position: center center;
                    background-size: 1.2rem 1.2rem;
                    position: absolute;
                    left: 0;
                    top: 0;

                    &.icon-home-five-1 {
                        background-image: url(../../assets/img/icon-temperature-white.png);
                    }

                    &.icon-home-five-2 {
                        background-image: url(../../assets/img/icon-water-white.png);
                    }

                    &.icon-home-five-3 {
                        background-image: url(../../assets/img/icon-air-white.png);
                    }

                    &.icon-home-five-4 {
                        background-image: url(../../assets/img/icon-hotwater-white.png);
                    }

                    &.icon-home-five-5 {
                        background-image: url(../../assets/img/icon-summer-white.png);
                    }

                    &.icon-home-five-6 {
                        background-image: url(../../assets/img/icon-lamp-white.png);
                    }
                }

                .name {
                    padding: 0 0 0 1rem;
                    line-height:3.05rem;
                    text-align: center;
                    color: #fff;
                    font-size: 1.1rem;
                }

                .sel-result {
                    display: none;
                    padding: 0 0 0 5px;
                    background: #90C422;
                    color: #fff;
                    line-height: 26px;
                    position: relative;
                    font-size: 12px;

                    .sel-btn-close {
                        width: 24px;
                        height: 24px;
                        display: inline-block;
                        background: url(../../assets/img/icon-close.png) no-repeat center center;
                        background-size: 16px 16px;
                        position: absolute;
                        top: 1px;
                        right: 0;
                        cursor: pointer;
                    }
                }
            }
        }

        .pro-list {
            width: 72%;
            padding: 0 0.5rem;
            position: relative;

            ul {

                li {
                    margin-bottom: 0.8rem;
                    padding: 1.3rem 1rem 0 8rem;
                    width:100%;
                    height:10.5rem;
                    background:rgba(255,255,255,1);
                    border: 1px solid #D6D7D2;
                    border-radius:4px;
                    float: left;
                    position: relative;
                    z-index: 10;

                    &:last-child {
                        margin-right: 0;
                    }

                    &.active {
                        border:1px solid #90C422;

                        &:after {
                            width: 1.8rem;
                            height: 1.8rem;
                            background: url(../../assets/img/icon-checked.png) no-repeat center center;
                            background-size: 1.8rem 1.8rem;
                            content: " ";
                            position: absolute;
                            top: -0.9rem;
                            right: -0.9rem;
                            z-index: 100;
                        }
                    }

                    .name {
                        padding-bottom: 0.8rem;
                        color: #424242;
                        font-size: 1.4rem;
                        line-height: 1.9rem;
                    }

                    .pic {
                        width: 8rem;
                        height: 6rem;
                        position: absolute;
                        top: 2.2rem;
                        left: 0;

                        img {
                            width: 100%;
                        }
                    }

                    .prop {
                        line-height: 1.4rem;
                        color: #424242;
                        font-size:1rem;
                    }
                }
            }
        }
    }

    .btns-box {
        margin: 2rem auto 3.5rem;
        text-align: center;
        height: 3.5rem;
        width: 60%;

        button {
            width:100%;
            height:3.5rem;
            background:rgba(233,197,14,1);
            border-radius:1.7rem;
            border: 0;
            color: #fff;
            font-size:1.7rem;
        }
    }

    .view-result {
        padding: 7.4rem 15%;

        .con {
            padding: 3rem 1.8rem;
            background: #90C421;
            border-radius: 1.7rem;

            p {
                margin-bottom: 1.7rem;
                font-size:1.2rem;
                color:#fff;
                line-height:1.7rem;

                &:last-child {
                    margin-bottom: 0;
                }
            }
        }
    }

    .quo-dialog {
        position: fixed;
        top: 50%;
        left: 50%;
        -webkit-transform: translate3d(-50%, -50%, 0);
        transform: translate3d(-50%, -50%, 0);
        background-color: #fff;
        width: 85%;
        border-radius: 3px;
        font-size: 16px;
        -webkit-user-select: none;
        overflow: hidden;
        -webkit-backface-visibility: hidden;
        backface-visibility: hidden;
        -webkit-transition: .2s;
        transition: .2s;
        z-index: 2001;

        .quo-dialog-hd {
            padding: 1.7rem 0 1.2rem;
            line-height: 1.9rem;
            text-align: center;
            position: relative;

            .tit {
                line-height: 1.9rem;
                color: #4f4f4f;
                font-size: 1.4rem;
            }

            .icon-close {
                width: 3.2rem;
                height: 3.2rem;
                background: url(../../assets/img/icon-close-f0f.png) no-repeat center center;
                background-size: 1.6rem 1.6rem;
                position: absolute;
                top: 0rem;
                right: 0rem;
                text-indent: -999em;
                overflow: hidden;
            }
        }


        .quo-dialog-bd {
            .prop {
                padding-bottom: 4.2rem;
                line-height: 1.5rem;
                font-size: 1.1rem;
                color: #424242;
                text-align: center;
            }

            .quo-dialog-forms {
                padding: 0 3.4rem 3.9rem;

                .text {
                    margin-bottom: 1.7rem;
                    padding: 1rem;
                    width: 100%;
                    height: 3.4rem;
                    line-height: 1.4rem;
                    border: 1px solid #CECECE;
                    color: #424242;
                    font-size: 1.2rem;

                    &::placeholder {
                        color: #919191;
                    }
                }

                .btn-submit {
                    width: 100%;
                    height:3.5rem;
                    background:#E9C50E;
                    border-radius:1.7rem;
                    color: #fff;
                    font-size: 1.2rem;
                    border: 0;
                }
            }
        }
    }

    .quo-modal {
        position: fixed;
        left: 0;
        top: 0;
        width: 100%;
        height: 100%;
        opacity: 0.5;
        background: #000;
        z-index: 2000;
    }
}
</style>