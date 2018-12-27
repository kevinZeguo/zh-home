import Vue from 'vue';
import App from './App.vue';

Vue.config.productionTip = false;

import promise from 'es6-promise';
promise.polyfill();

import router from './router/router.js';

// element-ui
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);

import './assets/css/app.dev.scss';

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});
