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
                    <select v-model="chooseForm.type">
                        <option v-for="(item, index) in homeTypes" :label="item.label" :value="item.value" :key="index">{{ item.label }}</option>
                    </select>
                    <span class="txt" v-if="chooseForm.type == ''">请选择户型</span>
                </div>
            
                <p class="label">实际使用面积</p>
                <div class="field-box">
                    <input type="tel" v-model="chooseForm.usableArea" placeholder="请填写使用面积" />
                    <span class="txt">㎡</span>
                </div>

                <p class="label">房屋户型</p>
                <div class="select-box" style="margin-bottom: 1rem;">
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
            
                <p class="label">我家里有</p>
                <div class="field-box">
                    <input type="tel" v-model="chooseForm.liveCount" placeholder="请填写" />
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
                    <li :class="{active: activeStatus == 1}" @click="changeTabs(1)">
                        <div class="icons icon-home-five-5"></div>
                        <p class="name">凉爽的夏日</p>
                    </li>
                    <li :class="{active: activeStatus == 2}" @click="changeTabs(2)">
                        <div class="icons icon-home-five-3"></div>
                        <p class="name">清新的空气</p>
                        <!--<p class="sel-result">已选 | 森得新风<span class="sel-btn-close"></span></p>-->
                    </li>
                    <li :class="{active: activeStatus == 3}" @click="changeTabs(3)">
                        <div class="icons icon-home-five-2"></div>
                        <p class="name">洁净的水源</a></p>
                    </li>
                    <li :class="{active: activeStatus == 4}" @click="changeTabs(4)">
                        <div class="icons icon-home-five-1"></div>
                        <p class="name">温暖的房间</p>
                    </li>
                    <li :class="{active: activeStatus == 5}" @click="changeTabs(5)">
                        <div class="icons icon-home-five-4"></div>
                        <p class="name">24小时热水</p>
                    </li>
                    <li :class="{active: activeStatus == 6}" @click="changeTabs(6)">
                        <div class="icons icon-home-five-6"></div>
                        <p class="name">智能的房子</p>
                    </li>
                </ul>

                <div class="pro-list">
                   <ul v-if="activeStatus == 1">
                        <li :class="{active: oneStatus == index}" v-for="(item, index) in resultArrs[0]" @click="changeOnes(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.name }}</p>
                        </li>
                    </ul>
                    <ul v-if="activeStatus == 2">
                        <li :class="{active: twoStatus == index}" v-for="(item, index) in resultArrs[1]" @click="changeTwos(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.recommend }}</p>
                        </li>
                    </ul>
                    <ul v-if="activeStatus == 3">
                        <li :class="{active: threeStatus == index}" v-for="(item, index) in resultArrs[2]" @click="changeThrees(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.recommend }}</p>
                        </li>
                    </ul>
                    <ul v-if="activeStatus == 4">
                        <li :class="{active: fourStatus == index}" v-for="(item, index) in resultArrs[3]" @click="changeFours(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.recommend }}</p>
                        </li>
                    </ul>
                    <ul v-if="activeStatus == 5">
                        <li :class="{active: fiveStatus == index}" v-for="(item, index) in resultArrs[4]" @click="changeFives(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.recommend }}</p>
                        </li>
                    </ul>
                    <ul v-if="activeStatus == 6">
                        <li :class="{active: item.status}" v-for="(item, index) in resultArrs[5]" @click="changeSixs(index)">
                            <p class="name">{{ item.brand }}</p>
                            <p class="pic"><img :src="imgUrl + 'home' + item.icon" /></p>
                            <p class="prop">{{ item.recommend }}</p>
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
                <p>报价短信已发送至您的手机 {{ nowPhone.substring(0, 3) }}****{{ nowPhone.substring(7) }}，请查收。 我们的客户经理将尽快与您联系。</p>
                <p>也欢迎您随时致电： 022-84127996</p>
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
                    <input type="text" class="text" v-model="ruleForm.userName" placeholder="姓名" />
                    <input type="tel" class="text" v-model="ruleForm.phoneNum" placeholder="手机号" />
                    <button type="submit" class="btn-submit" @click="threeClick">获取报价</button>
                </div>
            </div>
        </div>
        <div class="quo-modal" v-if="dialogBln"></div>
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
            }else if (!isvalidPhone(value)){
                callback(new Error('请输入正确的11位手机号码'));
            }else {
                callback();
            }
        };

        return {
            imgUrl: baseUrl,
            step: {
                oneActive: true,
                oneSelected: false,
                twoActive: false,
                twoSelected: false,
                threeActive: false,
                threeSelected: false
            },
            dialogBln: false,
            homeTypes: [
                {
                    value: 1,
                    label:'别墅'
                },
                {
                    value: 2,
                    label: '平层'
                },
                {
                    value: 3,
                    label: '复式'
                }
            ],
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
                ps: '', //产品Id，多个以逗号分割
                type: '', //房间类型 1-别墅 2-平层 3-复式
                usableArea: null, //使用面积
                liveCount: null, //居住人数
                parlorCount: '', //客厅数量
                roomCount: '' //卧室数量
            },
            rules: {
                roomCount: [
                    { required: true, message: '请选择卧室数量', trigger: 'change' }
                ],
                parlorCount: [
                    { required: true, message: '请选择客厅数量', trigger: 'change' }
                ],
                usableArea: [
                    { required: true, message: '使用面积不能为空'},
                    { type: 'number', message: '使用面积必须为数字值'}
                ],
                type: [
                    { required: true, message: '请选择房屋户型', trigger: 'change' }
                ],
                liveCount: [
                    { required: true, message: '人数不能为空'},
                    { type: 'number', message: '人数必须为数字值'}
                ]
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
            },
            activeStatus: 1,
            oneStatus: null,
            twoStatus: null,
            threeStatus: null,
            fourStatus: null,
            fiveStatus: null,
            sixStatus: [],
            resultArrs: [
                [],
                [],
                [],
                [],
                [],
                []
            ],
            nowPhone: '' //'15800001111'
        }
    },
    mounted () {
        this.productList();
    },
    methods: {
        oneClick () {

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

            //房间类型 1-别墅 2-平层 3-复式
            if (this.chooseForm.type == '') {
                this.$toast({
                    message: '请选择房间类型'
                });
                return false;
            }

            //居住人数
            if (this.chooseForm.liveCount == null) {
                this.$toast({
                    message: '请填写居住人数'
                });
                return false;
            }

            if (!/^\+?[1-9][0-9]*$/.test(this.chooseForm.liveCount)) {
                this.$toast({
                    message: '人数只能为数值'
                });
                return false;
            }

            this.step.oneActive = false;
            this.step.oneSelected = true;
            this.step.twoActive = true;

            document.body.scrollTop = 0;
        },
        twoClick () {
            this.dialogBln = true;

            document.body.scrollTop = 0;
        },
        threeClick () {

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

            //用户姓名
            if (this.ruleForm.userName == '' ) {
                this.$toast({
                    message: '请填写用户姓名'
                });
                return false;
            }

            let ps = [];

            if (this.oneStatus != null) {
                ps.push(this.resultArrs[0][this.oneStatus].id);
            }

            if (this.twoStatus != null) {
                 ps.push(this.resultArrs[1][this.twoStatus].id);
            }

            if (this.threeStatus != null) {
                ps.push(this.resultArrs[2][this.threeStatus].id);
            }

            if (this.fourStatus != null) {
                ps.push(this.resultArrs[3][this.fourStatus].id);
            }

            if (this.fiveStatus != null) {
                ps.push(this.resultArrs[4][this.fiveStatus].id);
            }

            if (this.sixStatus.length > 0) {
                ps.push.apply(ps, this.sixStatus);
            }

            let params = {
                ps: ps.length > 0 ? ps.join(',') : '', //产品Id，多个以逗号分割
                type: this.chooseForm.type, //房间类型 1-别墅 2-平层 3-复式
                usableArea: this.chooseForm.usableArea, //使用面积
                liveCount: this.chooseForm.liveCount, //居住人数
                parlorCount: this.chooseForm.parlorCount, //客厅数量
                roomCount: this.chooseForm.roomCount, //卧室数量
                phoneNum: this.ruleForm.phoneNum, //手机号
                userName: this.ruleForm.userName //用户姓名
            }

            // console.log(JSON.stringify(params));

            this.productQuote(params, () => {

                this.dialogBln = false;

                this.step.twoActive = false;
                this.step.twoSelected = true;
                this.step.threeSelected = true;
                this.step.threeActive = true;
            });            
        },
        closeClick () {
            this.dialogBln = false;

            this.ruleForm.phoneNum = ''; //手机号
            this.ruleForm.userName = ''; //用户姓名
        },
        changeTabs (index) {
            this.activeStatus = index;
        },
        changeOnes (index) {
            if (this.oneStatus == index) {
                this.oneStatus = null;
            } else {
                this.oneStatus = index; 
            }
        },
        changeTwos (index) {
            if (this.twoStatus == index) {
                this.twoStatus = null;
            } else {
                this.twoStatus = index; 
            }
        },
        changeThrees (index) {
            if (this.threeStatus == index) {
                this.threeStatus = null;
            } else {
                this.threeStatus = index; 
            }
        },
        changeFours (index) {
            if (this.fourStatus == index) {
                this.fourStatus = null;
            } else {
                this.fourStatus = index; 
            }
        },
        changeFives (index) {
            if (this.fiveStatus == index) {
                this.fiveStatus = null;
            } else {
                this.fiveStatus = index; 
            }
        },
        changeSixs (num) {
            this.resultArrs[5][num].status = !this.resultArrs[5][num].status;
            
            this.sixStatus = [];

            this.resultArrs[5].forEach((value, index) => {
                if (value.status) {
                    this.sixStatus.push(value.id);
                }
            });
        },
        async productList () {
            const res = await productList('');

            if (res.data.success == true) { 
                res.data.list.forEach((value, index) => {

                    if ((value.module - 1) == 5) {
                        value.status = false;
                    }

                    this.resultArrs[(value.module - 1)].push(value);
                });
            }
        },
        async productQuote (params, callback) {
            let param = 'd=' + encodeURIComponent(JSON.stringify(params));
            
            const res = await productQuote(param);
            //console.log(JSON.stringify(res));
            if (res.data.success == true) {
                callback();

                this.nowPhone = this.ruleForm.phoneNum + '';

                this.activeStatus = 1;

                this.ruleForm.phoneNum = ''; //手机号
                this.ruleForm.userName = ''; //用户姓名

                this.oneStatus = null;
                this.twoStatus = null;
                this.threeStatus = null;
                this.fourStatus = null;
                this.fiveStatus = null;
                this.sixStatus = [];

                this.chooseForm.ps = '';
                this.chooseForm.type = '';
                this.chooseForm.usableArea = null;
                this.chooseForm.liveCount = null;
                this.chooseForm.parlorCount = '';
                this.chooseForm.roomCount = '';

                /*
                this.$toast({
                    message: '恭喜您，操作成功，报价信息已经发送至您的手机，请注意查收',
                    type: 'success'
                });*/
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
.quotation {
    width: 100%;
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
                font-size: 1.2rem;
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
                    padding: 1.3rem 0.5rem 1.3rem 8rem;
                    width:100%;
                    min-height: 11.8rem;
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
                        font-size: 1.3rem;
                        line-height: 1.9rem;
                        text-align: justify;
                    }

                    .pic {
                        width: 7rem;
                        height: 6rem;
                        position: absolute;
                        top: 2.2rem;
                        left: 0.5rem;

                        img {
                            width: 100%;
                        }
                    }

                    .prop {
                        line-height: 1.4rem;
                        color: #424242;
                        font-size:1rem;
                        text-align: justify;
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
        padding: 7.4rem 12%;

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
                    background: transparent;
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
        z-index: 200;
    }
}
</style>