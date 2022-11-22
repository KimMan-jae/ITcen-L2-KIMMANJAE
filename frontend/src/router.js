
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import MenuView from "./components/MenuView"
import MenuViewDetail from "./components/MenuViewDetail"
import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"
import StoreManageManager from "./components/listers/StoreManageCards"
import StoreManageDetail from "./components/listers/StoreManageDetail"

import OrderDetailView from "./components/OrderDetailView"
import OrderDetailViewDetail from "./components/OrderDetailViewDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import MessageManager from "./components/listers/MessageCards"
import MessageDetail from "./components/listers/MessageDetail"

import RiderManageManager from "./components/listers/RiderManageCards"
import RiderManageDetail from "./components/listers/RiderManageDetail"

import CouponManageManager from "./components/listers/CouponManageCards"
import CouponManageDetail from "./components/listers/CouponManageDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/menus',
                name: 'MenuView',
                component: MenuView
            },
            {
                path: '/menus/:id',
                name: 'MenuViewDetail',
                component: MenuViewDetail
            },
            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },
            {
                path: '/storeManages',
                name: 'StoreManageManager',
                component: StoreManageManager
            },
            {
                path: '/storeManages/:id',
                name: 'StoreManageDetail',
                component: StoreManageDetail
            },

            {
                path: '/orderDetails',
                name: 'OrderDetailView',
                component: OrderDetailView
            },
            {
                path: '/orderDetails/:id',
                name: 'OrderDetailViewDetail',
                component: OrderDetailViewDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/messages',
                name: 'MessageManager',
                component: MessageManager
            },
            {
                path: '/messages/:id',
                name: 'MessageDetail',
                component: MessageDetail
            },

            {
                path: '/riderManages',
                name: 'RiderManageManager',
                component: RiderManageManager
            },
            {
                path: '/riderManages/:id',
                name: 'RiderManageDetail',
                component: RiderManageDetail
            },

            {
                path: '/couponManages',
                name: 'CouponManageManager',
                component: CouponManageManager
            },
            {
                path: '/couponManages/:id',
                name: 'CouponManageDetail',
                component: CouponManageDetail
            },



    ]
})
