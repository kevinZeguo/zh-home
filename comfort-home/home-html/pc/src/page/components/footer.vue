<template>
    <div class="footer">
        <div class="layout">
            <div class="copy">
                <div class="logo"></div>
                <p>津ICP备19000153号-1</p>
                <p>&copy;2009~2019 众华舒适环境科技（天津）有限公司版权所有</p>
            </div>

            <div class="menu">
                <div class="hd">众华舒适家</div>
                <div class="bd">
                    <p v-for="(item, index) in menuList" :key="index"><router-link :to="item.url">{{ item.name }}</router-link></p>
                </div>
            </div>

            <div class="concat">
                <div class="hd">联系我们</div>
                <div class="bd">
                    <p>电话 022-84127996</p>
                    <p>地址 天津市河东区万达中心23楼</p>
                </div>
            </div>

            <div class="code"></div>
        </div>
    </div>
</template>

<script>

export default {
    data () {
        return {
            msg: '',
            menuList: [
                {
                    name: '舒适课堂',
                    url: '/classroom'
                },
                {
                    name: '快速报价',
                    url: '/quotation'
                },
                {
                    name: '解决方案',
                    url: '/solution'
                },
                /*{
                    name: '客户案例',
                    url: '/customer-case'
                },*/
                {
                    name: '关于我们',
                    url: '/about'
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
.footer {
    padding-top: 60px;
    width: 100%;
    min-width: 1200px;
    height: 298px;
    background: #000;
    /*
    position: fixed;
    left: 0;
    bottom: 0;
    z-index: 2000;
    */

    .copy {
        width: 535px;
        float: left;

        .logo {
            margin-bottom: 20px;
            width: 200px;
            height: 47px;
            background: url(../../assets/img/logo-min.png) no-repeat;
            background-size: 100% 100%;
        }

        p {
            width:435px;
            height:36px;
            font-size:14px;
            font-weight:100;
            color: rgba(255,255,255,1);
            line-height:36px;
        }
    }

    .menu {
        width: 115px;
        float: left;

        .hd {
            line-height: 1;
            padding-bottom: 10px;
            color: #fff;
            position: relative;

            &:after {
                width:30px;
                height:3px;
                background: rgba(7,128,237,1);
                content: " ";
                position: absolute;
                bottom: 5px;
                left: 0;
            }
        }
        
        .bd {
            p {
                line-height: 30px;
                a {
                    color: #fff;

                    &:hover {
                        color: #fff;
                        text-decoration: underline;
                    }
                }
            }
        }
    }

    .concat {
        width: 300px;
        float: left;

        .hd {
            line-height: 1;
            padding-bottom: 10px;
            color: #fff;
            position: relative;

            &:after {
                width:30px;
                height:3px;
                background: rgba(7,128,237,1);
                content: " ";
                position: absolute;
                bottom: 5px;
                left: 0;
            }
        }
        
        .bd {
            p {
                line-height: 30px;
                color: #fff;
            }
        }
    }

    .code {
        width: 250px;
        height: 130px;
        float: left;
        background: url(../../assets/img/icon-code.jpg) no-repeat left top;
        background-size: 118px 118px;
    }
}
</style>