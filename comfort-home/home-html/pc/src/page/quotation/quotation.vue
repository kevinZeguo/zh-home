<template>
    <div class="quotation">
        <el-carousel height="680px">
            <el-carousel-item v-for="(item, index) in banners" :key="index">
                <img :src="item.src" />
            </el-carousel-item>
        </el-carousel>

        <el-form :model="chooseForm" ref="chooseForm" :rules="rules" class="layout">
            <div class="step-num">1</div>
            <div class="step-name">
                <p>填写房屋信息</p>
            </div>

            <div class="quo-container">
                <el-row :gutter="60">
                    <el-col :span="6">
                        <p class="tit">我家是</p>

                        <el-row :gutter="10">
                            <el-col :span="12">
                                <el-form-item prop="roomCount">
                                    <el-select v-model="chooseForm.roomCount" placeholder="卧室数量">
                                        <el-option v-for="(item, index) in roomsType" :label="item.label" :value="item.value" :key="index"></el-option>
                                    </el-select>
                                </el-form-item>
                            </el-col>
                            <el-col :span="12">
                                <el-form-item prop="parlorCount">
                                    <el-select v-model="chooseForm.parlorCount" placeholder="客厅数量">
                                        <el-option v-for="(item, index) in hallsType" :label="item.label" :value="item.value" :key="index"></el-option>
                                    </el-select>
                                </el-form-item>
                            </el-col>
                        </el-row>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">实际使用面积</p>
                        <el-form-item prop="usableArea">
                            <el-input v-model.number="chooseForm.usableArea" placeholder="请填写使用面积">
                                <template slot="append">㎡</template>
                            </el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">房屋户型</p>
                        <el-form-item prop="type">
                            <el-select v-model="chooseForm.type" placeholder="请选择户型">
                                <el-option v-for="(item, index) in homeTypes" :label="item.label" :value="item.value" :key="index"></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="6">
                        <p class="tit">我家里有</p>
                        <el-form-item prop="liveCount">
                            <el-input v-model.number="chooseForm.liveCount" placeholder="请选择">
                                <template slot="append">人</template>
                            </el-input>
                        </el-form-item>
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
                        <li :class="{active: activeStatus == 1}">
                            <div class="icons icon-home-five-5" @click="changeTabs(1)"></div>
                            <p class="name">凉爽的夏日</p>
                        </li>
                        <li :class="{active: activeStatus == 2}">
                            <div class="icons icon-home-five-3" @click="changeTabs(2)"></div>
                            <p class="name">清新的空气</p>
                            <p class="sel-result">已选 | 森得新风<span class="sel-btn-close"></span></p>
                        </li>
                        <li :class="{active: activeStatus == 3}">
                            <div class="icons icon-home-five-2" @click="changeTabs(3)"></div>
                            <p class="name">洁净的水源</a></p>
                        </li>
                        <li :class="{active: activeStatus == 4}">
                            <div class="icons icon-home-five-1" @click="changeTabs(4)"></div>
                            <p class="name">温暖的房间</p>
                        </li>
                        <li :class="{active: activeStatus == 5}">
                            <div class="icons icon-home-five-4" @click="changeTabs(5)"></div>
                            <p class="name">24小时热水</p>
                        </li>
                        <li :class="{active: activeStatus == 6}">
                            <div class="icons icon-home-five-6" @click="changeTabs(6)"></div>
                            <p class="name">智能的房子</p>
                        </li>
                    </ul>

                    <div class="pro-list">
                        <ul v-if="activeStatus == 1">
                            <li :class="{active: oneStatus == 0}" @click="changeOnes(0)">
                                <p class="name">大金空调1</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                        <ul v-if="activeStatus == 2">
                            <li :class="{active: twoStatus == 0}" @click="changeTwos(0)">
                                <p class="name">大金空调2</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                        <ul v-if="activeStatus == 3">
                            <li :class="{active: threestatus == 0}" @click="changeThrees(0)">
                                <p class="name">大金空调3</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                        <ul v-if="activeStatus == 4">
                            <li :class="{active: fourStatus == 0}" @click="changeFours(0)">
                                <p class="name">大金空调4</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                        <ul v-if="activeStatus == 5">
                            <li :class="{active: fiveStatus == 0}" @click="changeFives(0)">
                                <p class="name">大金空调5</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                        <ul v-if="activeStatus == 6">
                            <li :class="{active: sixStatus == 0}" @click="changeSixs(0)">
                                <p class="name">大金空调6</p>
                                <p class="pic"><img src="../../assets/img/pic-160x160-1.png" /></p>
                                <p class="prop">出色的低噪音特性<br />高效节能精准温控<br />营造恒温舒适的居家享受</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="btns-box">
                <button type="button" @click="submitForm('chooseForm')">获取报价</button>
            </div>
        </el-form>

        <el-dialog title="提示" :visible.sync="dialogVisible" width="500px" :before-close="handleClose">
            <el-form :model="ruleForm" :rules="rulesForm" ref="ruleForm" label-width="100px">
                <el-form-item label="用户姓名" prop="userName">
                    <el-input v-model="ruleForm.userName"></el-input>
                </el-form-item>
                <el-form-item label="手机号" prop="phoneNum">
                    <el-input v-model="ruleForm.phoneNum"></el-input>
                </el-form-item>
            </el-form>
            <span slot="footer" class="dialog-footer">
                <el-button @click="dialogFormClose">取 消</el-button>
                <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
            </span>
        </el-dialog>

    </div>
</template>

<script>
import { productList } from '../../service/getData';
export default {
    data () {
        return {
            dialogVisible: false,
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
                usableArea: '', //使用面积
                liveCount: '', //居住人数
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
                    { required: true, message: '人数不能为空'},
                    { type: 'number', message: '人数必须为数字值'}
                ]
            },
            banners: [
                {
                    src: require('../../assets/img/pic-banner-1.jpg')
                },
                {
                    src: require('../../assets/img/pic-banner-2.jpg')
                }
            ],
            activeStatus: 1,
            oneStatus: null,
            twoStatus: null,
            threeStatus: null,
            fourStatus: null,
            fiveStatus: null,
            sixStatus: null,
        }
    },
    mounted () {
        this.productList();
    },
    methods: {
        changeTabs (index) {
            this.activeStatus = index;
        },
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    this.dialogVisible = true;
                } else {
                    console.log('error submit!!');
                    return false;
                }
            });
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
                this.oneStatus = index; 
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
        changeSixs (index) {
            if (this.sixStatus == index) {
                this.sixStatus = null;
            } else {
                this.sixStatus = index; 
            }
        },
        dialogFormClose () {
            this.dialogVisible = false;
            this.$refs['ruleForm'].resetFields();
            this.ruleForm.phoneNum = ''; //手机号
            this.ruleForm.userName = ''; //用户姓名
        },
        handleClose (done) {
            done();

            this.dialogFormClose();

        },
        async productList () {
            const res = await productList('');

            console.log(JSON.stringify(res));

        }
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
                        cursor: pointer;

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
                        cursor: pointer;

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
            cursor: pointer;
        }
    }
}
</style>
