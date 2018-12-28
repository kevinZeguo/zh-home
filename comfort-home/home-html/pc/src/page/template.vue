<template>
    <div>
        <v-header></v-header>
        <div class="template-container">
            <router-view></router-view>
        </div>
        <v-footer></v-footer>
    </div>
</template>

<script>
import header from './components/header';
import footer from './components/footer';

export default {
    components: {
        'v-header': header,
        'v-footer': footer
    },
    data () {
        return {
            msg: ''
        }
    },
    mounted () {
        
    },
    methods: {
    }
}
</script>

<style lang="scss" scoped>
.template-container {
    
}
</style>