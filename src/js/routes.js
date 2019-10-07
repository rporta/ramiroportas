import Home from '../pages/home.vue';
import Load from '../pages/load.vue';
import Backend from '../pages/backend.vue';
import Frontend from '../pages/frontend.vue';
import About from '../pages/about.vue';
import NotFound from '../pages/404.vue';

var routes = [{
    path: '/home/',
    component: Home,
  },

  {
    path: '/',
    component: Load,
  },

  {
    path: '/backend/',
    component: Backend,
  },

  {
    path: '/frontend/',
    component: Frontend,
  },

  {
    path: '/about/',
    component: About,
  },

  {
    path: '(.*)',
    component: NotFound,
  },
];

export default routes;