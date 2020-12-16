

import React from 'react'
import {
    NavLink, Route, Redirect,Switch,
    withRouter
} from 'react-router-dom'
import './Case.css';

// 用例列表
// 熊子威
const Case_list = () => {
    return (
        <div>
            <div class="smallBox">
                <div class="box1">SHOPXO测试用例列表</div>
                <div class="box2">说明1：在ID中输入用例编号后回车，可显示这条用例的信息.</div>
                <div class="box3">说明2：如果要插入新的用例，ID一栏必须清空才能正常插入用例.</div>
                <div class="box4">说明3：可修改参数进行[用例执行],测试通过通过[更新测试用例]更新至数据库.</div>
            </div>
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
            <img src={require('./img/table3.jpg')} style={{width:'100%'}} />
            <div className = 'FontFamily3'>
                    {/* <text>自动化用例列表</text> */}
                    <text style={{color:"bule"}}><NavLink to='/doc/guide'>自动化用例列表</NavLink></text>
            </div>
            
        </div>
    )
}

export default Case_list
