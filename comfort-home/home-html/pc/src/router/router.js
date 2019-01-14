import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const template = r => require.ensure([], () => r(require('../page/template')), 'template');

const home = r => require.ensure([], () => r(require('../page/home/home')), 'home');
const classroom = r => require.ensure([], () => r(require('../page/classroom/classroom')), 'classroom');
const quotation = r => require.ensure([], () => r(require('../page/quotation/quotation')), 'quotation');
const solution = r => require.ensure([], () => r(require('../page/solution/solution')), 'solution');
const customerCase = r => require.ensure([], () => r(require('../page/customer-case/customer-case')), 'customerCase');
const about = r => require.ensure([], () => r(require('../page/about/about')), 'about');
const enrol = r => require.ensure([], () => r(require('../page/enrol/enrol')), 'enrol');


const routes = [
	{
		path: '/',
		component: template,
		children: [
			{
                path: '',
                component: home
            },
            {
                path: 'home',
                component: home
            },
            {
                path: 'classroom',
                component: classroom
            },
            {
                path: 'quotation',
                component: quotation
            },
            {
                path: 'solution/:index',
                component: solution
            },
            {
                path: 'customer-case',
                component: customerCase
            },
            {
                path: 'about',
                component: about
            },
            {
                path: 'enrol',
                component: enrol
            }
		]
	},
	{
		path: '*',
		redirect: '/'
	}
];


const router = new VueRouter({
	mode: 'history',
	routes,
    scrollBehavior (to, from, savedPosition) {
        if (savedPosition) {
            return savedPosition
        } else {
            if (from.meta.keepAlive) {
                from.meta.savedPosition = document.body.scrollTop;
            }
            return { x: 0, y: to.meta.savedPosition || 0 }
        }
    }
});

export default router;
