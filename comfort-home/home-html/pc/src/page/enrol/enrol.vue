<template>
    <div class="enrol">
        <div class="banner"></div>

        <div class="en-container">
            <div class="en-hd">
                <h2 class="tit">把德国采暖系统搬回家</h2>
                <h3 class="tit-sub">众华舒适家，送您一个温暖的冬天</h3>
                <p class="prop">安装快捷，一天即可完工<br />工艺美观，不影响室内装修<br />使用节省，想开就开升温快</p>
                <div class="btns-box"><button type="button">快速获取冬天采暖报价</button></div>
                <p class="prop-btn"><button type="button">立即预约安装</button></p>
            </div>

            <div class="en-tits">
                <span class="name">6步施工</span>
                <span class="line"></span>
                <span class="txt">交给我们</span>
            </div>

            <ul>
                <li>定位打孔</li>
                <li>铺设管路</li>
                <li>安装暖气片</li>
            </ul>
            <ul>
                <li>专业设计师精准定位，并采用无尘打孔，地面铺设保护膜，不会对室内家具和装修产生影响。</li>
                <li>照事先设计的安装位置来确定管路的线路，布管线路一般是在吊顶、踢脚线等隐蔽的地方，明管的铺设尽量不影响到室内的装修或占用太多的空间。</li>
                <li>安装暖气片在安装暖气片的过程中要将暖气片放置平稳，而且要使用水平尺进行测量，看是否安装平稳，然后把阀门连接件和进出水口阀门相连接，检查无误后，用管钳进行加固。</li>
            </ul>

            <ul>
                <li>安装壁挂炉</li>
                <li>压力测试</li>
                <li>验收使用</li>
            </ul>

            <ul>
                <li>壁挂炉的安装需要注意与明线和电气设备隔开，也不能将易燃易爆物品放在其周围，具体来说，壁挂炉与燃气表和燃气灶的距离应该超过750px。</li>
                <li>验收施工人员在对管道进行冲压测试时,没有出现跑、冒、漏、滴等现象。一般测试3-5分钟无渗漏为合格。</li>
                <li>在您检查确认后便可以验收，等待暖冬的到来！</li>
            </ul>

            <div class="en-tits">
                <span class="name">6大优势</span>
                <span class="line"></span>
                <span class="txt">专业放心</span>
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
            ]
        }
    },
    mounted () {
        this.productList();
    },
    methods: {
        changeTabs (index) {
            this.activeStatus = index;
        },
        openDialog (formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    this.dialogVisible = true;
                }
            });
        },
        submitForm (formName) {
            this.$refs[formName].validate((valid) => {

                if (valid) {
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
                    this.productQuote(params);
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
        closeClick () {
            this.dialogVisible = false;
            this.$refs['ruleForm'].resetFields();
            this.ruleForm.phoneNum = ''; //手机号
            this.ruleForm.userName = ''; //用户姓名
        },
        async productList () {
            const res = await productList('');

            // console.log(JSON.stringify(res));

            if (res.data.success == true) { 
                res.data.list.forEach((value, index) => {

                    if ((value.module - 1) == 5) {
                        value.status = false;
                    }

                    this.resultArrs[(value.module - 1)].push(value);
                });
            }
        },
        async productQuote (params) {            
            let param = 'd=' + encodeURIComponent(JSON.stringify(params));

            const res = await productQuote(param);
            //console.log(JSON.stringify(res));
            if (res.data.success == true) {
                this.closeClick();
                this.$refs['chooseForm'].resetFields();

                this.activeStatus = 1;

                this.oneStatus = null;
                this.twoStatus = null;
                this.threeStatus = null;
                this.fourStatus = null;
                this.fiveStatus = null;
                this.sixStatus = [];

                this.chooseForm.ps = '';
                this.chooseForm.type = '';
                this.chooseForm.usableArea = '';
                this.chooseForm.liveCount = '';
                this.chooseForm.parlorCount = '';
                this.chooseForm.roomCount = '';

                this.$message({
                    message: '恭喜您，操作成功，报价信息已经发送至您的手机，请注意查收',
                    type: 'success'
                });
            } else {
                this.$message({
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
        min-width: 1200px;
        height:680px;
        background: url(../../assets/img/pic-banner-2.jpg) no-repeat center center;
    }

    .en-container {
        margin: 0 auto;
        width: 1000px;
        background:rgba(255,255,255,1);
        box-shadow:0px 2px 4px 0px rgba(0,0,0,0.5);
        border:1px solid rgba(151,151,151,1);

        .en-hd {
            margin: 0 auto;
            width: 800px;
            height: 400px;
            border-radius: 0 0 400px 400px;
            background: #01AFEB;
            color: #fff;
            text-align: center;

            .tit {
                padding-top:70px;
                font-size:30px;
                font-weight: 100;
                line-height:42px;
            }

            .tit-sub {
                padding-top:10px;
                font-size:20px;
                font-weight:300;
                line-height:28px;
            }

            .prop {
                padding: 30px 0 40px;
                line-height: 20px;
                font-size: 14px;
            }

            .btns-box {
                padding-bottom: 20px;

                button {
                    width:240px;
                    height:50px;
                    background: #01AFEB;
                    border:1px solid rgba(255,255,255,1);
                    border-radius: 20px;
                    color: #fff;
                    font-size: 20px;
                    cursor: pointer;
                }
            }

            .prop-btn {
                button {
                    width:120px;
                    height:28px;
                    background: #01AFEB;
                    border-radius: 20px;
                    color: #fff;
                    font-size: 20px;
                    border: 0;
                    cursor: pointer;
                }
            }
        }

        .en-tits {
            margin: 60px auto 0;
            width: 260px;
            height: 50px;
            background: #8FC323;
            color: #fff;
            line-height: 50px;
            text-align: center;


            .name {
                font-size: 26px;
                vertical-align: middle;
                display: inline-block;
            }

            .line {
                margin: 0 10px 0 20px;
                width: 5px;
                height: 20px;
                background: #fff;
                display: inline-block;
                vertical-align: middle;
            }

            .txt {
                font-size: 18px;
                vertical-align: middle;
                display: inline-block;
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
