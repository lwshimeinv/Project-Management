// import React, { useEffect} from 'react'


// //import routes from '../router.config'
// //import {RouteWithSubRoutes,PrivateRoute} from '../App01'

// const Purchased_FontFamily = () => {
//     return (
//         <div>
//             <div>测试页面</div>
//             {/* <ol>
//                 <li><NavLink to='/doc/core'>核心概念</NavLink></li>
//                 <li><NavLink to='/doc/guide'>高级指引</NavLink></li>
//                 <li><NavLink to='/doc/api'>API</NavLink></li>
//                 <li><NavLink to='/doc/hooks'>Hooks</NavLink></li>
//             </ol> */}
//         </div>
//     )
// }

// export default Purchased_FontFamily

import React from 'react'
import {
    NavLink, Route, Redirect,Switch,
    withRouter
} from 'react-router-dom'
import './Case.css';

const Purchased_FontFamily = () => {
    return (
        <div>
            <div className='FontFamily'>
                <li><NavLink to='/doc/hooks'>测试主页</NavLink></li>
                <li><NavLink to='/doc/hooks'>项目</NavLink></li>
            </div>
            <div className = 'FontFamily1'>
                    <li><NavLink to='/doc/core'>Bug</NavLink></li>
                    <li><NavLink to='/doc/guide'>功能测试</NavLink></li>
                    <li><NavLink to='/doc/api'>测试单</NavLink></li>
                    <li><NavLink to='/doc/hooks'>报告</NavLink></li>
                    <li><NavLink to='/doc/hooks'>套件统计</NavLink></li>

            </div>

            <div className = 'FontFamily2'>
                    <li><NavLink to='/doc/hooks'>所有模块</NavLink></li>
                    <li><NavLink to='/doc/core'>未关闭</NavLink></li>
                    <li><NavLink to='/doc/guide'>由我创建</NavLink></li>
                    <li><NavLink to='/doc/api'>指派给我</NavLink></li>
                    <li><NavLink to='/doc/hooks'>由我解决</NavLink></li>
                    <li><NavLink to='/doc/hooks'>待关闭</NavLink></li>
                    <li><NavLink to='/doc/hooks'>未解决</NavLink></li>
                    <li><NavLink to='/doc/hooks'>更多</NavLink></li>
                    <li><NavLink to='/doc/core'>搜索</NavLink></li>
                    <li><NavLink to='/doc/guide'>报表</NavLink></li>
                    <li><NavLink to='/doc/api'>导出</NavLink></li>
                    <li><NavLink to='/doc/hooks'>批量提交Bug</NavLink></li>
            </div>
            <img src={require('./image/table.jpg')} style={{width:'100%'}} />
            <div className = 'FontFamily3'>
                    {/* <text>自动化用例列表</text> */}
                    <text style={{color:"bule"}}><NavLink to='/doc/guide'>自动化用例列表</NavLink></text>
            </div>
            
        </div>
    )
}

export default Purchased_FontFamily
