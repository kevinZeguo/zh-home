<template>
    <div class="nav">
        <router-link class="home" to="/">首页</router-link>
        <a class="phone" href="tel:022-84127996">咨询</a>
        <router-link class="quotation" to="/quotation">报价</router-link>
        <a class="wechat" href="javascript:;" @click="popupVisible=true">关注</a>

        <mt-popup v-model="popupVisible" position="center">
            <img src="../../assets/img/icon-code.jpg" style="width: 100%;max-width: 344px;" />
        </mt-popup>
    </div>
</template>

<script>

export default {
    data () {
        return {
            popupVisible: false,
            menuList: [
                {
                    name: '首页',
                    url: '/'
                },
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
                }/*,
                {
                    name: '客户案例',
                    url: '/customer-case'
                },
                {
                    name: '关于我们',
                    url: '/about'
                }*/
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
.nav {
    width: 100%;
    height: 5rem;
    background: #fff;
    border-top: 1px solid #E5E5E5;
    position: fixed;
    left: 0;
    bottom: 0;
    z-index: 100;

    a {
        padding-top: 3rem;
        width: 25%;
        height: 6rem;
        line-height: 1.5rem;
        background: #fff;
        font-size:1rem;
        font-weight:300;
        color: #1A2950;
        text-align: center;
        float: left;
        position: relative;

        &:after {
            width:2rem;
            height: 2rem;
            content: " ";
            position: absolute;
            top: 1rem;
            left: 50%;
            margin-left: -1rem;
            background-repeat: no-repeat;
            background-position: center center;
            background-size: 100% 100%;
        }

        &.home {
            &:after {
                background-image: url(../../assets/img/icon-home-default.png);
            }
        }

        &.phone {
            &:after {
                background-image: url(../../assets/img/icon-phone-default.png);
            }
        }

        &.quotation {
            &:after {
                background-image: url(../../assets/img/icon-quotation-default.png);
            }
        }

        &.wechat {
            &:after {
                background-image: url(../../assets/img/icon-wechat-default.png);
            }
        }

        &.router-link-exact-active, &:focus {
            color: #00B0EC;
            text-decoration: none;

            &.home {
                &:after {
                    background-image: url(../../assets/img/icon-home-blue.png);
                }
            }

            &.phone {
                &:after {
                    background-image: url(../../assets/img/icon-phone-blue.png);
                }
            }

            &.quotation {
                &:after {
                    background-image: url(../../assets/img/icon-quotation-blue.png);
                }
            }

            &.wechat {
                &:after {
                    background-image: url(../../assets/img/icon-wechat-blue.png);
                }
            }
        }
    }
}
</style>