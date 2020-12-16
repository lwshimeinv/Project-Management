import React,{useEffect} from 'react'
import {NavLink, Route, Redirect,Switch} from 'react-router-dom';
import {RouteWithSubRoutes} from './App'
export const Users = () => {
    return (
        <h2>
            Core
        </h2>
    )
}
export const Guide = () => {
    return (
        <h2>
            Guide
        </h2>
    )
}
export const Api = () => {
    return (
        <h2>
            Api
        </h2>
    )
}
export const Hooks = () => {
    return (
        <h2>
            Hooks
        </h2>
    )
}
const Doc = ({routes}) => {
    return (
        <div className='doc'>
            <div className="content" style={{zIndex:1000}}>
                {/* 嵌套路由 */}
                <RouteWithSubRoutes routes={routes}/>
                <Redirect from='/doc' to='/doc/Users' />
            </div>
            <ol>
                <li><NavLink to='/doc/Users'>核心概念</NavLink></li>
                <li><NavLink to='/doc/guide'>高级指引</NavLink></li>
                <li><NavLink to='/doc/api'>API</NavLink></li>
                <li><NavLink to='/doc/hooks'>Hooks</NavLink></li>
            </ol>
        </div>
    )
}

export default Doc;