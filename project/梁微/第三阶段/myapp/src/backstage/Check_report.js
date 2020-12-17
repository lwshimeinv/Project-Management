import React from 'react';
import './Check_report.css';

import { BrowserRouter as Router, Redirect, Route, NavLink, Switch } from 'react-router-dom'


// 测试报告
// 盛斌
const Check_report = () => {
    return (

        <div>
            <div class="smallBox">
                <div class="box1">查看测试报告</div>
            </div>
            <div class="container">

                <form action="" class="parent">
                    <input type="text" class="search" placeholder="搜索" />
                    <input type="button" name="" id="" class="btn" />

                </form>

            </div>

            <div class='pic'>
                <NavLink to='/Histogram'>
                    <h2 style={{ width: '650px', textAlign: 'center', color: 'black' }}>近几次测试用例情况的柱状图</h2>
                    <img style={{ width: '650px', height: '500px', marginLeft: '15px', float: 'left' }}
                        src={require('./img/table2.jpg')} />
                </NavLink>
                <NavLink to='/Pie'>
                    <h2 style={{ textAlign: 'center', color: 'black' }}>最近一次测试用例情况的饼状图</h2>
                    <img style={{ width: '300px', height: '300px', marginLeft: '60px', float: 'left' }}
                        src={require('./img/pic.jpg')} />
                </NavLink>
            </div>

        </div>
    )
}

export default Check_report