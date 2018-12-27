<template>
    <div class="nav">
        <router-link :to="item.url" v-for="(item, index) in menuList" :key="index">{{ item.name }}</router-link>
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
    z-index: 1000;

    a {
        padding: 0 20px;
        width: 25%;
        height:4.95rem;
        line-height: 4.95rem;
        background: #fff;
        font-size:1rem;
        font-weight:300;
        color: #1A2950;
        text-align: center;
        float: left;
        
        &.router-link-exact-active, &:hover {
            color: #00B0EC;
            text-decoration: none;
        }
    }
}
</style>