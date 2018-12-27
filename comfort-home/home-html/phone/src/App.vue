<template>
  <div id="app">
    <!--
    <ul>
      <li><router-link to="/home">楼宇管理</router-link></li>
      <li><router-link to="/house">房源管理</router-link></li>
      <li><router-link to="/business">招商管理</router-link></li>
    </ul>
    -->
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'app',
  data () {
    return {
      msg: ''
    }
  }
}
</script>

<style lang="scss">
</style>