import React from 'react'
import {BrowserRouter as Router, Redirect, Route, NavLink, Switch} from 'react-router-dom'
const Pie = () => {
    return (
        <div>
            <h2 style={{textAlign:'center',color:'black'}}>近几次的测试用例</h2>
            <img style={{width:'100%'}}
                    src={require('./img/table.jpg')} />
        </div>
    )
}
export default Pie;