<template>
    <div class="header" :class="{addBg: addBgBln}">
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
            addBgBln: false,
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
                    url: '/solution/1'
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
        window.addEventListener('scroll', this.handleScroll);
    },
    methods: {
        handleScroll () {
            let scrollTop = window.pageYOffset || document.documentElement.scrollTop || document.body.scrollTop;
            
            if (scrollTop > 80) {
                this.addBgBln = true;
            } else {
                this.addBgBln = false;
            }
        }
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

    &.addBg {
        background: #fff;
    }

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
            font-size:18px;
            font-weight:300;
            color: #666;
            
            &.router-link-exact-active, &:hover {
                color: #0060FF;
                text-decoration: none;
            }
        }
    }
}
</style>