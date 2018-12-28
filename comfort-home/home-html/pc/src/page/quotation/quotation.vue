<template>
    <div class="quotation">
        <el-carousel height="680px">
            <el-carousel-item v-for="(item, index) in banners" :key="index">
                <img :src="item.src" />
            </el-carousel-item>
        </el-carousel>

        <div class="layout">
            <div class="step-num">1</div>
            <div class="step-name">
                <p>填写房屋信息</p>
            </div>

            <div class="quo-container">
                <el-row :gutter="60">
                    <el-col :span="6">
                        <p class="tit">我家是</p>
                        <el-select v-model="chooseForm.home" placeholder="请选择">
                            <el-option label="home1" value="1"></el-option>
                            <el-option label="home2" value="1"></el-option>
                        </el-select>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">实际使用面积</p>
                        <el-input v-model="chooseForm.use" placeholder="请填写使用面积">
                            <template slot="append">㎡</template>
                        </el-input>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">房屋户型</p>
                        <el-select v-model="chooseForm.projtect" placeholder="请选择">
                            <el-option label="projtect1" value="1"></el-option>
                            <el-option label="projtect2" value="2"></el-option>
                        </el-select>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">我家里有</p>
                        <el-input v-model="chooseForm.have" placeholder="请选择">
                            <template slot="append">人</template>
                        </el-input>
                    </el-col>
                </el-row>
            </div>

            <div class="step-num">2</div>
            <div class="step-name">
                <p>选择我想要的舒适</p>
            </div>

            <div class="quo-container">
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
                            <li>
                                <p class="name">格力空调</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="btns-box">
                <button type="button">获取报价</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
        return {
            chooseForm: {
                home: '',
                use: '',
                projtect: '',
                have: ''
            },
            banners: [
                {
                    src: require('../../assets/img/pic-banner-1.jpg')
                },
                {
                    src: require('../../assets/img/pic-banner-2.jpg')
                }
            ]
        }
    },
    mounted () {
        
    },
    methods: {
    }

}
</script>

<style lang="scss" scoped>
.quotation {
    .step-num {
        margin: 27px auto 0;
        width:50px;
        height:50px;
        background:rgba(255,255,255,1);
        color: #0780ED;
        font-size: 30px;
        line-height: 50px;
        text-align:center;
        -webkit-border-radius: 50px;
        -moz-border-radius: 50px;
        -ms-border-radius: 50px;
        border-radius: 50px;
    }

    .step-name {
        margin: 20px auto 0;
        width:260px;
        height:60px;
        line-height: 60px;
        position: relative;
        
        p {
            width:260px;
            height:60px;
            background:rgba(125,172,112,1);
            border:1px solid rgba(125,172,112,1);
            position: relative;
            z-index: 20;
            text-align: center;
            color: #fff;
            font-size: 30px;
        }

        &:after {
            width:260px;
            height:60px;
            background:rgba(215,227,212,1);
            border:1px solid rgba(125,172,112,1);
            content: " ";
            position: absolute;
            top: 5px;
            left: 5px;
            z-index: 10;
        }
    }

    .quo-container {
        margin: 40px 0 0;
        padding: 60px 40px;
        background:rgba(255,255,255,1);
        box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
        border-radius:4px;

        .tit {
            line-height: 48px;
            font-size:20px;
            color:#424242;
        }

        .quo-choose {
            margin: 35px 0 0;

            .tab-ul {
                &:after {
                    height: 0;
                    content: " ";
                    clear:both;
                    display: block;
                }

                li {
                    margin: 0 80px 0 0;
                    width:120px;
                    height: 200px;
                    float:left;
                    position: relative;
                    color: #fff;

                    &:last-child {
                        margin-right: 0;
                    }

                    &.active {
                        .icons {
                            box-shadow:0px 4px 4px 0px rgba(233,197,14,1);
                        }

                        &:after {
                            width: 0;
                            height: 0;
                            content: " ";
                            position: absolute;
                            bottom: 0;
                            left: 50%;
                            border-color: transparent transparent #f2f2f2;
                            border-style: dashed dashed solid;
                            border-width: 0 16px 16px;
                            margin-left: -16px;
                        }
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
                            background-image: url(../../assets/img/icon-summer.png);
                        }

                        &.icon-home-five-6 {
                            background-image: url(../../assets/img/icon-lamp.png);
                        }
                    }

                    .name {
                        padding: 23px 0 5px;
                        line-height:22px;
                        text-align: center;
                        color: #4F4F4F;
                        font-size: 16px;
                    }

                    .sel-result {
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
                padding: 55px 100px;
                background:rgba(242,242,242,1);
                border-radius:4px;
                position: relative;

                ul {
                    &:after {
                        height: 0;
                        content: " ";
                        clear:both;
                        display: block;
                    }

                    li {
                        margin-right: 40px;
                        padding: 25px 20px 0;
                        width:200px;
                        height:270px;
                        background:rgba(255,255,255,1);
                        border: 2px solid transparent;
                        border-radius:4px;
                        float: left;
                        position: relative;
                        z-index: 10;

                        &:last-child {
                            margin-right: 0;
                        }

                        &.active {
                            border:2px solid #90C422;

                            &:after {
                                width: 36px;
                                height: 36px;
                                background: url(../../assets/img/icon-checked.png) no-repeat center center;
                                content: " ";
                                position: absolute;
                                top: -18px;
                                right: -18px;
                                z-index: 100;
                            }
                        }

                        .name {
                            padding-bottom: 15px;
                            color: #424242;
                            font-size: 16px;
                            text-align: center;
                            line-height: 22px;
                        }

                        .pic {
                            width: 160px;
                            height: 120px;

                            img {
                                width: 160px;
                                height: 120px;
                            }
                        }

                        .prop {
                            line-height: 20px;
                            color: #424242;
                            text-align: center;
                        }
                    }
                }
            }
        }
    }

    .btns-box {
        margin: 44px auto 105px;
        text-align: center;
        height:50px;

        button {
            width:255px;
            height:50px;
            background:rgba(233,197,14,1);
            box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
            border-radius:20px;
            border: 0;
            color: #fff;
            font-size:20px;
        }
    }
}
</style>
