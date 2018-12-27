import Vue from 'vue';
import App from './App.vue';

Vue.config.productionTip = false;

import promise from 'es6-promise';
promise.polyfill();

import router from './router/router.js';

// mint-ui
import Mint from 'mint-ui';      //固定路径，类似vuerouter
import 'mint-ui/lib/style.css';
Vue.use(Mint);

import './assets/css/app.dev.scss';

(function(win,doc){
    function rootFontsize(){
        var docWidth = doc.documentElement.clientWidth,
            fontSize = docWidth * 10 / 320;
        
        doc.getElementsByTagName('html')[0].style.fontSize = ((fontSize > 10 ? fontSize : 10) > 20 ? 20 : fontSize) + 'px';
    }

    rootFontsize();
    win.addEventListener('resize',rootFontsize,false);
})(window,document);

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});
