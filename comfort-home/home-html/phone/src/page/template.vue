<template>
    <div class="template-container">
        <v-header></v-header>
        <div>
            <router-view></router-view>
        </div>
        <v-nav></v-nav>
    </div>
</template>

<script>
import header from './components/header';
import nav from './components/nav';

export default {
    components: {
        'v-header': header,
        'v-nav': nav
    },
    data () {
        return {
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
    padding: 6.6rem 0 5rem;
}
</style>