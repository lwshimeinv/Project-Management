import React from 'react'
import Home from './Home';
import Users from './Users';
import Letter from './Letter'
import Envelope from './Envelope'
import Paper from './Paper'

const routes = [
    {
        path: '/',
        exact: true,
        component: Home,
    },
    {
        path:'/Users',
        component: Users,
        pri:true
    },
    {
        path:'/Letter',
        component:Letter,
    },
    {
        path:'/Envelope',
        component: Envelope,
    },
    {
        path:'/Paper',
        component:Paper
    }
]
export default routes;