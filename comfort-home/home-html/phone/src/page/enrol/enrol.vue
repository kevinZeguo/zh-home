<template>
    <div class="enrol">
        <div class="banner">
            <div class="infos">
                <div class="infos-box">
                    <h1>家里暖气不热？</h1>
                    <p>老房没有接入集中供暖接口？</p>
                    <p>供热站供暖老是烧不暖？</p>
                    <p>屋里暖气忽冷忽热？</p>
                    <p>家里有老人孩子，很多时候需<br />要温度要求更高一些？</p>
                </div>
            </div>
        </div>

        <div class="en-container">
            <div class="en-hd">
                <div class="en-hd-box">
                    <h2 class="tit">把德国采暖系统搬回家</h2>
                    <h3 class="tit-sub">众华舒适家，送您一个温暖的冬天</h3>
                    <div class="btns-box"><button type="button" v-tap="{ methods: openEnrol}">快速获取冬天采暖报价</button></div>
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

            <ul class="pro-pics">
                <li><img src="../../assets/img/pic-360x232-1.jpg" /></li>
                <li><img src="../../assets/img/pic-360x232-2.jpg" /></li>
            </ul>

            <div class="en-forms">
                <h2 class="tit">立即预约，<strong>免费</strong>设计</h2>
                <h3 class="tit-sub">尊享服务免<br />费上门设计＋专业团队施工</h3>
                <div class="en-forms-con">
                    <p class="name">冬日暖暖的爱和家人分享</p>
                    <ul class="forms-list">
                        <li>
                            <input type="text" v-model="ruleForm.userName" class="f-text" placeholder="姓名" />
                        </li>
                        <li>
                            <input type="tel" v-model="ruleForm.phoneNum" class="f-text" placeholder="手机号码" />
                        </li>
                    </ul>
                    <div class="btns-box">
                        <button type="button" v-tap="{ methods: submitForm }" v-if="loadingBtn">立即预约</button>
                        <button type="button" v-if="!loadingBtn"><mt-spinner type="triple-bounce" color="rgb(255, 255, 255)"></mt-spinner></button>
                    </div>
                </div>
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
                    <p class="p">我家是</p>
                    <div class="select-box">
                        <select v-model="chooseForm.roomCount">
                            <option v-for="(item, index) in roomsType" :label="item.label" :value="item.value" :key="index">{{ item.label }}</option>
                        </select>
                        <span class="txt" v-if="chooseForm.roomCount == ''">请选择卧室数量</span>
                    </div>
                    <div class="select-box">
                        <select v-model="chooseForm.parlorCount">
                            <option v-for="(item, index) in hallsType" :label="item.label" :value="item.value" :key="index">{{ item.label }}</option>
                        </select>
                        <span class="txt" v-if="chooseForm.parlorCount == ''">请选择客厅数量</span>
                    </div>

                    <div class="field-box">
                        <input type="tel" v-model="chooseForm.usableArea" placeholder="请填写使用面积" />
                        <span class="txt">㎡</span>
                    </div>
                    <input type="text" class="text" v-model="chooseForm.userName" placeholder="姓名" />
                    <input type="tel" class="text" v-model="chooseForm.phoneNum" placeholder="手机号" />
                    <button type="submit" class="btn-submit" v-tap="{ methods: chooseFormValidate }" v-if="enrolPriceBtn">获取报价</button>
                    <button type="submit" class="btn-submit" v-if="!enrolPriceBtn"><mt-spinner type="triple-bounce" color="rgb(255, 255, 255)"></mt-spinner></button>
                </div>
            </div>
        </div>
        <div class="quo-modal" v-if="dialogBln"></div>
    </div>
</template>

<script>
import { isvalidPhone } from '../../config/utils';
import { enrolReg, productQuote } from '../../service/getData';

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
            dialogBln: false,
            loadingBtn: true,
            enrolPriceBtn: true,
            roomsType: [
                {
                    value: 1,
                    label:'1居'
                },
                {
                    value: 2,
                    label: '2居'
                },
                {
                    value: 3,
                    label: '3居'
                },
                {
                    value: 4,
                    label: '4居'
                },
                {
                    value: 5,
                    label: '5居'
                },
                {
                    value: 6,
                    label: '6居'
                },
                {
                    value: 7,
                    label: '7居'
                },
                {
                    value: 8,
                    label: '8居'
                },
                {
                    value: 9,
                    label: '9居'
                }
            ],
            hallsType: [
                {
                    value: 1,
                    label:'1厅'
                },
                {
                    value: 2,
                    label: '2厅'
                },
                {
                    value: 3,
                    label: '3厅'
                },
                {
                    value: 4,
                    label: '4厅'
                },
                {
                    value: 5,
                    label: '5厅'
                },
                {
                    value: 6,
                    label: '6厅'
                },
                {
                    value: 7,
                    label: '7厅'
                },
                {
                    value: 8,
                    label: '8厅'
                },
                {
                    value: 9,
                    label: '9厅'
                }
            ],
            chooseForm: {
                ps: '40002',
                parlorCount: '', //客厅数量
                roomCount: '', //卧室数量
                usableArea: null, //使用面积
                phoneNum: '', //手机号
                userName: '' //用户姓名
            },
            ruleForm: {
                phoneNum: '', //手机号
                userName: '' //用户姓名
            },
            rulesForm: {
                userName: [
                    { required: true, message: '用户姓名不能为空'}
                ],
                phoneNum: [
                    { required: true, trigger: 'blur', validator: validPhone }
                ]
            }
        }
    },
    mounted () {
    },
    methods: {
        openEnrol () {
            this.dialogBln = true;
        },
        closeClick () {
            this.dialogBln = false;
            this.enrolPriceBtn = true;

            this.chooseForm.ps = '40002';
            this.chooseForm.parlorCount = ''; //客厅数量
            this.chooseForm.roomCount = ''; //卧室数量
            this.chooseForm.usableArea = null; //使用面积
            this.chooseForm.phoneNum = ''; //手机号
            this.chooseForm.userName = ''; //用户姓名
        },
        chooseFormValidate () {

            //卧室数量
            if (this.chooseForm.roomCount == '') {
                this.$toast({
                    message: '请选择卧室数量'
                });

                return false;
            } 

            //客厅数量
            if (this.chooseForm.parlorCount == '') {
                this.$toast({
                    message: '请选择客厅数量'
                });
                return false;
            }

            //使用面积
            if (this.chooseForm.usableArea == null) {
                this.$toast({
                    message: '请填写使用面积'
                });
                return false;
            }

            if (!/^\+?[1-9][0-9]*$/.test(this.chooseForm.usableArea)) {
                this.$toast({
                    message: '使用面积只能为数值'
                });
                return false;
            }

            //用户姓名
            if (this.chooseForm.userName == '' ) {
                this.$toast({
                    message: '请填写用户姓名'
                });
                return false;
            }

            //手机号
            if (this.chooseForm.phoneNum == '' ) {
                this.$toast({
                    message: '请填写手机号'
                });

                return false;
            }

            if (!isvalidPhone(this.chooseForm.phoneNum)) {
                this.$toast({
                    message: '请输入正确的11位手机号码'
                });

                return false;
            }

            this.productQuote(this.chooseForm);
        },
        submitForm () {

            //用户姓名
            if (this.ruleForm.userName == '' ) {
                this.$toast({
                    message: '请填写用户姓名'
                });
                return false;
            }

            //手机号
            if (this.ruleForm.phoneNum == '' ) {
                this.$toast({
                    message: '请填写手机号'
                });

                return false;
            }

            if (!isvalidPhone(this.ruleForm.phoneNum)) {
                this.$toast({
                    message: '请输入正确的11位手机号码'
                });

                return false;
            }
            
            let params = 'userName=' + encodeURIComponent(this.ruleForm.userName) + '&phoneNum=' + this.ruleForm.phoneNum;

            this.enrolReg(params);
        },
        async enrolReg (params) {
            this.loadingBtn = false;

            const res = await enrolReg(params);

            this.loadingBtn = true;

            if (res.data.success == true) {
                this.ruleForm.phoneNum = ''; //手机号
                this.ruleForm.userName = ''; //用户姓名

                this.$toast({
                    message: '恭喜您，预约成功！',
                    type: 'success'
                });
            } else {
                this.$toast({
                    message: res.data.message,
                    type: 'error'
                });
            }
        },
        async productQuote (params) {
            let param = 'd=' + encodeURIComponent(JSON.stringify(params));
            
            this.enrolPriceBtn = false;

            const res = await productQuote(param);

            this.enrolPriceBtn = true;
            // console.log(JSON.stringify(res));
            if (res.data.success == true) {

                this.dialogBln = false;

                this.chooseForm.ps = '40002';
                this.chooseForm.parlorCount = ''; //客厅数量
                this.chooseForm.roomCount = ''; //卧室数量
                this.chooseForm.usableArea = null; //使用面积
                this.chooseForm.phoneNum = ''; //手机号
                this.chooseForm.userName = ''; //用户姓名

                this.$toast({
                    message: '恭喜您，操作成功，报价信息已经发送至您的手机，请注意查收',
                    type: 'success'
                });
            } else {
                this.$toast({
                    message: res.data.message,
                    type: 'error'
                });
            }
        }
    }
}
</script>

<style lang="scss" scoped>
.enrol {
    .banner {
        width: 100%;
        background: url(../../assets/img/pic-enrol-banner.jpg) no-repeat center center;
        background-size: auto 100%;

        .infos {
            padding: 2.15rem 0 1.1rem;

            .infos-box {
                padding: 1.7rem 1.3rem 0.85rem;
                width: 19.5rem;
                background: rgba(255, 255, 255, 0.8);
                color: #D69C16;

                h1 {
                    margin-bottom: 1rem;
                    border-top: 0.5rem solid #D69C16;
                    border-bottom: 0.5rem solid #D69C16;
                    line-height: 3.6rem;
                    color: #D69C16;
                    font-size:2.4rem;
                }

                p {
                    padding: 0.35rem 0;
                    line-height:1.7rem;
                    font-size:1.2rem;
                }
            }
        }
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
                    padding-top: 1rem;

                    button {
                        padding: 0 2rem;
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

        .pro-pics {
            padding-bottom:2.2rem;
            -webkit-display: flex;
            -moz-display: flex;
            -ms-display: flex;
            display: flex;

            li {
                padding: 0 0.5rem;
                width: 50%;

                img {
                    width: 100%;
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
                background: url(../../assets/img/pic-enrol-bg.jpg) no-repeat center center;
                background-size: auto 100%;

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
                            font-size: 1.2rem;
                            border:0;

                            &::placeholder {
                                color:#ACA7A7;
                            }
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
        width: 85%;
        border-radius: 3px;
        font-size: 16px;
        -webkit-user-select: none;
        overflow: hidden;
        -webkit-backface-visibility: hidden;
        backface-visibility: hidden;
        -webkit-transition: .2s;
        transition: .2s;
        z-index: 201;

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
                padding-bottom: 1.2rem;
                line-height: 1.5rem;
                font-size: 1.1rem;
                color: #424242;
                text-align: center;
            }

            .quo-dialog-forms {
                padding: 0 3.4rem 2rem;

                .p {
                    font-size: 1.2rem;
                    color:#424242;
                }

                .select-box {
                    margin-bottom: 1rem;
                    width: 100%;
                    height: 3.4rem;
                    position: relative;

                    select {
                        padding-left: 1rem;
                        width: 100%;
                        height: 3.4rem;
                        background: transparent;
                        border-radius: 0.4rem;
                        border:0.1rem solid rgba(194,194,194,1);
                        line-height: 1.2rem;
                        color: #424242;
                        position: relative;
                        font-size: 1.2rem;
                        z-index: 10;
                    }

                    .txt {
                        color:#C3C1C1;
                        z-index: 1;
                        position: absolute;
                        top: 0;
                        left: 1rem;
                        line-height: 3.4rem;
                        font-size: 1.2rem;
                    }
                }

                .field-box {
                    margin-bottom: 1rem;
                    width: 100%;
                    height: 3.4rem;
                    background:rgba(252,252,252,1);
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
                        font-size: 1.2rem;
                    }
                }

                .text {
                    margin-bottom: 1rem;
                    padding: 1rem;
                    width: 100%;
                    background: transparent;
                    height: 3.4rem;
                    line-height: 1.4rem;
                    border: 1px solid #CECECE;
                    color: #424242;
                    font-size: 1.2rem;

                    &::placeholder {
                        color: #C3C1C1;
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
        z-index: 200;
    }
}
</style>
