<template>
    <div class="header">
        <div class="logo">众华舒适家居门户</div>
        <div class="menu" @click="popupVisible=true"></div>
        <mt-popup v-model="popupVisible" position="top">
            <div class="nav">
                <span v-for="(item, index) in menuList" :key="index" @click="goPath(item.url)">{{ item.name }}</span>
            </div>
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
        goPath(path) {
            this.$router.push({path: path});
            this.popupVisible = false;
        }
    }

}
</script>

<style lang="scss" scoped>
.header {
    padding-top: 1.5rem;
    width: 100%;
    height: 6.6rem;
    background: #f9f9f9;
    position: fixed;
    top: 0;
    left: 0;
    z-index: 1000;

    .logo {
        margin: 0 auto;
        width: 15.4rem;
        height: 3.6rem;
        background: url(../../assets/img/logo.png) no-repeat left center;
        background-size: 100% 100%;
        text-indent: -999em;
        overflow: hidden;
    }

    .menu {
        width: 3.6rem;
        height:3.6rem;
        background: url(../../assets/img/icon-menu.png) no-repeat center center;
        background-size: 2.6rem 1.5rem;
        cursor: pointer;
        position: absolute;
        top: 1.5rem;
        left: 1rem;
    }

    .nav {
        width: 100vw;
        padding: 15px 0 15px 58px;


        span {
            padding: 0 20px;
            height:50px;
            line-height: 50px;
            font-size:20px;
            font-weight:300;
            color: #666;
            display: block;
            
            &.router-link-exact-active, &:hover {
                color: #000;
                text-decoration: underline;
            }
        }
    }
}
</style>