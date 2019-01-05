<template>
    <div class="enrol">
        <div class="banner"></div>

        <div class="en-container">
            <div class="en-hd">
                <div class="en-hd-box">
                    <h2 class="tit">把德国采暖系统搬回家</h2>
                    <h3 class="tit-sub">众华舒适家，送您一个温暖的冬天</h3>
                    <div class="btns-box"><button type="button">快速获取冬天采暖报价</button></div>
                </div>
            </div>

            <div class="en-tits">
                <p class="name">6步施工</p>
                <span class="line"></span>
                <p class="txt">交给我们，不用您动手</p>
            </div>

            <ul class="en-nums">
                <li>
                    <div class="num">1</div>
                    <div class="txt">定位打孔</div>
                </li>
                <li>
                    <div class="num">2</div>
                    <div class="txt">铺设管路</div>
                </li>
                <li>
                    <div class="num">3</div>
                    <div class="txt">安装暖气片</div>
                </li>
                <li>
                    <div class="num">4</div>
                    <div class="txt">安装壁挂炉</div>
                </li>
                <li>
                    <div class="num">5</div>
                    <div class="txt">压力测试</div>
                </li>
                <li>
                    <div class="num">6</div>
                    <div class="txt">验收使用</div>
                </li>
            </ul>

            <div>
                <iframe frameborder="0" src="https://v.qq.com/txp/iframe/player.html?vid=q1328ksebit" allowFullScreen="true" style="width: 100%;height: 18rem;"></iframe>
            </div>

            <div class="en-tits">
                <p class="name">6大优势</p>
                <span class="line"></span>
                <p class="txt">专业放心，从此告别寒冷</p>
            </div>

            <ul class="en-goods">
                <li>
                    <span class="num">1</span>
                    <p class="name">安装快捷</p>
                    <p class="into">一天即可完工</p>
                </li>
                <li>
                    <span class="num">2</span>
                    <p class="name">工艺美观</p>
                    <p class="into">不影响室内装修</p>
                </li>
                <li>
                    <span class="num">3</span>
                    <p class="name">使用舒适</p>
                    <p class="into">没有热风和扬尘</p>
                </li>
                <li>
                    <span class="num">4</span>
                    <p class="name">服务周到</p>
                    <p class="into">不给生活添麻烦</p>
                </li>
                <li>
                    <span class="num">5</span>
                    <p class="name">使用节省</p>
                    <p class="into">想开就开升温快</p>
                </li>
                <li>
                    <span class="num">6</span>
                    <p class="name">德国精湛工艺</p>
                    <p class="into">采暖热水兼顾</p>
                </li>
            </ul>

            <div class="en-forms">
                <h2 class="tit">立即预约，<strong>免费</strong>设计</h2>
                <h3 class="tit-sub">尊享服务免<br />费上门设计＋专业团队施工</h3>
                <div class="en-forms-con">
                    <p class="name">冬日暖暖的爱和家人分享</p>
                    <ul class="forms-list">
                        <li>
                            <input type="text" class="f-text" placeholder="姓名" />
                        </li>
                        <li>
                            <input type="text" class="f-text" placeholder="手机号码" />
                        </li>
                    </ul>
                    <div class="btns-box">
                        <button type="button">立即预约</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="quo-dialog" v-if="dialogVisible">
            <div class="quo-dialog-hd">
                <div class="tit">获取报价</div>
                <span class="icon-close" @click="closeClick">close</span>
            </div>

            <div class="quo-dialog-bd">
                <p class="prop">报价结果将以短信形式发送至您手机</p>
                
                <el-form class="quo-dialog-forms mt30" :model="ruleForm" :rules="rulesForm" ref="ruleForm">
                    <el-form-item prop="userName">
                        <el-input v-model="ruleForm.userName" placeholder="姓名"></el-input>
                    </el-form-item>
                    <el-form-item prop="phoneNum">
                        <el-input v-model="ruleForm.phoneNum" placeholder="手机号"></el-input>
                    </el-form-item>
                    <button type="button" class="btn-submit" @click="submitForm('ruleForm')">获取报价</button>
                </el-form>
            </div>
        </div>
        <div class="quo-modal" v-if="dialogVisible"></div>
    </div>
</template>

<script>
import { isvalidPhone } from '../../config/utils';
import { baseUrl } from '../../config/env';
import { productList, productQuote } from '../../service/getData';

export default {
    data () {
        var validPhone=(rule, value,callback)=>{
            if (!value){
                callback(new Error('请输入手机号'));
            }else  if (!isvalidPhone(value)){
                callback(new Error('请输入正确的11位手机号码'));
            }else {
                callback();
            }
        };

        return {
            imgUrl: baseUrl,
            dialogVisible: false
        }
    },
    mounted () {
    },
    methods: {
    }
}
</script>

<style lang="scss" scoped>
.enrol {
    .banner {
        width: 100%;
        height:280px;
        background: url(../../assets/img/pic-banner-2.jpg) no-repeat center center;
    }

    .en-container {
        position: relative;
        overflow: hidden;

        .en-hd {
            margin: -50% auto 2.7rem;
            padding-top: 100%;
            width: 100%;
            position: relative;
            border-radius:100%;
            box-shadow:0px 3px 10px 0px rgba(244,225,134,1);

            .en-hd-box {
                width: 100%;
                z-index:2;
                position: absolute;
                top: 50%;
                left: 0;
                text-align: center;

                .tit {
                    padding-top:1.7rem;
                    font-size:1.7rem;
                    font-weight: 100;
                    line-height:2.4rem;
                    color:#01AFEB;
                }

                .tit-sub {
                    padding-top:0.85rem;
                    font-size:1.35rem;
                    font-weight:300;
                    line-height:1.9rem;
                    color:#01AFEB;
                }

                .btns-box {
                    padding-top: 2rem;

                    button {
                        width:15.35rem;
                        height:3.4rem;
                        background: #fff;
                        border:0.15rem solid #F4E186;
                        border-radius: 1.7rem;
                        color: #303131;
                        font-size: 1.2rem;
                        cursor: pointer;
                    }
                }
            }
        }

        .en-tits {
            padding: 3.25rem 0 0 4.25rem;
            color: #fff;
            position: relative;

            .name {
                padding-bottom: 0.1rem;
                color: #5F5C5C;
                font-size: 1.75rem;
                line-height: 2.4rem;
            }

            .line {
                width: 0.35rem;
                height: 1rem;
                background: #01AFEB;
                position: absolute;
                left: 4.25rem;
                bottom: 0.3rem;
            }

            .txt {
                padding-left: 0.85rem;
                color:#898888;
                font-size: 1.2rem;
                line-height: 1.7rem;
            }
        }
            
        .en-nums {
            padding: 1.7rem 3.25rem 0 0;
            width: 100%;

            &:after {
                height: 0;
                content: " ";
                clear: both;
                display: block;
            }

            li {
                margin-bottom: 1.7rem;
                padding-left: 4.25rem;
                width:  50%;
                float: left;
                height: 4.25rem;
                position: relative;

                .num {
                    width: 1.7rem;
                    height: 1.7rem;
                    background: #01AFEB;
                    color: #fff;
                    text-align: center;
                    line-height: 1.7rem;
                    font-size: 1.7rem;
                    border-radius: 1.7rem;
                    position: absolute;
                    top: 50%;
                    left: 3.4rem;
                    margin: -0.85rem 0 0;
                }

                .txt {
                    width: 100%;
                    height: 4.25rem;
                    line-height: 4.25rem;
                    border: 0.15rem solid #C0DAE3;
                    text-align: center;
                    color: #5F5C5C;
                    font-size: 1.35rem;
                    text-align: center;
                    font-weight: 300;
                }
            }
        }

        .en-goods {
            padding: 0 0 2.95rem;

            &:after {
                height: 0;
                content: " ";
                clear: both;
                display: block;
            }

            li {
                padding: 2.95rem 0 0;
                width: 33.3333333%;
                position: relative;
                color:#5F5C5C;
                float: left;
                
                .num {
                    color: #FCD202;
                    line-height: 4.25rem;
                    position: absolute;
                    font-size: 4.25rem;
                    top: 2.75rem;
                    left: 0.7rem;
                    z-index: 1;
                }

                .name {
                    line-height: 2.4rem;
                    text-align: center;
                    position: relative;
                    font-size: 1.7rem;
                    z-index: 2;
                }

                .into {
                    padding: 1.7rem 0 0;
                    line-height: 1.7rem;
                    text-align: center;
                    position: relative;
                    font-size: 1.2rem;
                    z-index: 2;
                }
            }
        }

        .en-forms {
            border-top: 1px solid #DEDDDD;
            padding: 2.4rem 0 3.4rem;
            width: 100%;

            .tit {
                padding-bottom: 1.35rem;
                font-size:1.7rem;
                font-weight:bold;
                line-height:2.8rem;
                text-align: center;
                color:#464545;

                strong {
                    font-size: 2.0rem;
                    color:#01AFEB;
                }
            }

            .tit-sub {
                padding: 0 0 2.95rem;
                font-size:1.35rem;
                font-weight:100;
                line-height:1.9rem;
                text-align: center;
                color:#464545
            }

            .en-forms-con {
                padding: 2.15rem 4.5rem 2.4rem;
                width: 100%;
                background: #999;

                .name {
                    padding-bottom: 2rem;
                    font-size:1.35rem;
                    font-weight:100;
                    color:#fff;
                    line-height:1.9rem;
                    text-align: center;
                }

                .forms-list {

                    li {
                        padding-bottom: 1.7rem;
                        width: 100%;

                        .f-text {
                            padding: 0.5rem;
                            line-height: 2.4rem;
                            width:100%;
                            height:3.4rem;
                            background: #fff;
                            border-radius:0.35rem;
                            border:0;
                        }
                    }
                }

                .btns-box {
                    text-align: center;

                    button {
                        width:100%;
                        height:4.25rem;
                        background:rgba(233,197,14,1);
                        box-shadow:0px 3px 7px 0px rgba(0,0,0,0.5);
                        border-radius:34px;
                        border: 0;
                        font-size: 20px;
                        color: #fff;
                        cursor: pointer;
                    }
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
        width: 400px;
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
            padding: 17px 0 12px;
            line-height: 38px;
            text-align: center;
            position: relative;

            .tit {
                line-height: 38px;
                color: #4f4f4f;
                font-size: 20px;
            }

            .icon-close {
                width: 48px;
                height: 48px;
                background: url(../../assets/img/icon-close-f0f.png) no-repeat center center;
                background-size: 24px 24px;
                position: absolute;
                top: 0;
                right: 0;
                text-indent: -999em;
                overflow: hidden;
                cursor: pointer;
            }
        }


        .quo-dialog-bd {
            .prop {
                padding-bottom: 42px;
                line-height: 15px;
                font-size: 14px;
                color: #424242;
                text-align: center;
            }

            .quo-dialog-forms {
                padding: 0 45px 39px;

                .btn-submit {
                    width:100%;
                    height:50px;
                    background:rgba(233,197,14,1);
                    box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
                    border-radius:20px;
                    border: 0;
                    color: #fff;
                    font-size:20px;
                    cursor: pointer;
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
