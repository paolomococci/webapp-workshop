import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: () => import('../views/About.vue')
  },
  {
    path: '/alert',
    name: 'Alert',
    component: () => import('../views/Alert.vue')
  },
  {
    path: '/avatar',
    name: 'Avatar',
    component: () => import('../views/Avatar.vue')
  },
  {
    path: '/badge',
    name: 'Badge',
    component: () => import('../views/Badge.vue')
  },
  {
    path: '/breadcrumb',
    name: 'Breadcrumb',
    component: () => import('../views/Breadcrumb.vue')
  },
  {
    path: '/button',
    name: 'Button',
    component: () => import('../views/Button.vue')
  },
  {
    path: '/calendar',
    name: 'Calendar',
    component: () => import('../views/Calendar.vue')
  },
  {
    path: '/card',
    name: 'Card',
    component: () => import('../views/Card.vue')
  },
  {
    path: '/navbar',
    name: 'Navbar',
    component: () => import('../views/Navbar.vue')
  },
  {
    path: '/preference',
    name: 'Preference',
    component: () => import('../views/Preference.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
