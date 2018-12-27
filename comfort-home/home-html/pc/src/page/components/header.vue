<template>
    <div class="header">
        <div class="layout">
            <div class="logo">
                <router-link to="/">home</router-link>
            </div>

            <div class="nav">
                <router-link :to="item.url" v-for="(item, index) in menuList" :key="index">{{ item.name }}</router-link>
            </div>
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
.header {
    width: 100%;
    min-width: 1200px;
    height: 80px;
    background: rgba(255, 255, 255, 0.56);
    position: fixed;
    top: 0;
    left: 0;
    z-index: 2000;

    .logo {
        width: 260px;
        height: 80px;
        float: left;

        a {
            width:260px;
            height: 80px;
            background: url(../../assets/img/logo.png) no-repeat left center;
            display: block;
            text-indent: -999em;
            overflow: hidden;
        }
    }

    .nav {
        padding: 15px 0 15px 58px;
        height: 80px;
        float: left;

        a {
            padding: 0 20px;
            height:50px;
            line-height: 50px;
            font-size:20px;
            font-weight:300;
            color: #666;
            
            &.router-link-exact-active, &:hover {
                color: #000;
                text-decoration: underline;
            }
        }
    }
}
</style>