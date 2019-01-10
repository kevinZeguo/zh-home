<template>
    <div class="footer">
        <div class="logo"></div>
        
        <div class="menu">
            <div class="hd">众华舒适家</div>
            <!--
            <div class="bd">
                <p v-for="(item, index) in menuList" :key="index"><router-link :to="item.url">{{ item.name }}</router-link></p>
            </div>
            -->
        </div>

        <div class="concat">
            <div class="hd">联系我们</div>
            <!--
            <div class="bd">
                <p>电话 021-4689210</p>
                <p>地址 天津市和平区南京路108号</p>
            </div>
            -->
        </div>
        <div class="copy">
            <p>津ICP备19000153号</p>
            <p>&copy;2009~2019 众华舒适环境科技（天津）有限公司版权所有</p>
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
                {
                    name: '客户案例',
                    url: '/customer-case'
                },
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
    padding: 1.2rem 3.2rem 0;
    width: 100%;
    height: 19.8rem;
    background: #000;
    font-size:12px;

    .logo {
        margin-bottom: 1.8rem;
        width: 8.6rem;
        height: 2rem;
        background: url(../../assets/img/logo-min.png) no-repeat;
        background-size: 100% 100%;
    }

    .copy {
        width: 100%;

        p {
            padding: 0.6rem 0;
            line-height: 1.5rem;
            border-bottom: 0.2rem solid #4A4646;
            color: rgba(255,255,255,1);
            font-size: 1.2rem;

            &:last-child {
                border-bottom: 0;
            }
        }
    }

    .menu {
        width: 100%;
        font-size: 1.2rem;

        .hd {
            line-height: 2.7rem;
            border-bottom: 0.2rem solid #4A4646;
            color: #fff;
            position: relative;
        }
        
        .bd {
            display: none;
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
        width: 100%;

        .hd {
            line-height: 2.7rem;
            border-bottom: 0.2rem solid #4A4646;
            color: #fff;
            position: relative;
            font-size: 1.2rem;
        }
        
        .bd {
            display: none;
            p {
                line-height: 30px;
                color: #fff;
            }
        }
    }
}
</style>