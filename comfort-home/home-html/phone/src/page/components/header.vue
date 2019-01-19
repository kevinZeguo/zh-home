<template>
    <div>
        <div class="header">
            <div class="logo">众华舒适家居门户</div>
            <div class="menu" @click="popupVisible=true"></div>
        </div>
        <mt-popup v-model="popupVisible" position="top">
            <div class="btn-close" @click="popupVisible=false">关闭</div>
            <div class="nav">
                <span v-for="(item, index) in menuList" :key="index" @click="goPath(item.url)" :class="item.className">{{ item.name }}</span>
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
                    url: '/',
                    className: 'home'
                },
                {
                    name: '舒适课堂',
                    url: '/classroom',
                    className: 'classroom'
                },
                {
                    name: '快速报价',
                    url: '/quotation',
                    className: 'quotation'
                },
                {
                    name: '解决方案',
                    url: '/solution/1',
                    className: 'solution'
                },
                /*{
                    name: '客户案例',
                    url: '/customer-case'
                },*/
                {
                    name: '关于我们',
                    url: '/about',
                    className: 'about'
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
    z-index: 100;

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
}

.nav {
    width: 100vw;
    padding: 1.5rem 0 3rem 3.15rem;


    span {
        padding: 0 2rem 0 4.2rem;
        height:3.9rem;
        line-height: 3.9rem;
        font-size:1.55rem;
        font-weight:300;
        color: #666;
        display: block;
        cursor: pointer;
        border-bottom: 1px solid #D6D1D1;
        background-repeat: no-repeat;
        background-position: 0.8rem center;
        background-size: 2.2rem 2.2rem;
        background-image: url(../../assets/img/icon-home-default.png);
        
        &.router-link-exact-active, &:hover {
            color: #000;
            text-decoration: underline;
        }

        &.classroom {
            background-image: url(../../assets/img/icon-classroom-default.png);
        }

        &.quotation {
            background-image: url(../../assets/img/icon-quotation-default.png);
        }

        &.solution {
            background-image: url(../../assets/img/icon-solution-default.png);
        }

        &.about {
            background-image: url(../../assets/img/icon-about-default.png);
        }
    }
}

.btn-close {
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
</style>