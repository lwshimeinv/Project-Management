import React from 'react';
import ReactDOM from 'react-dom';
import './Home.css';
import {RouteWithSubRoutes} from './App';
import { NavLink , Route} from 'react-router-dom';
import { List } from 'antd-mobile';
import ListItem from 'antd-mobile/lib/list/ListItem';
import Users from './Users'
import Letter from './Letter'
import Envelope from './Envelope';
import Paper from './Paper';
import Stamp from './Stamp';
import FontFamily from './FontFamily';
import Purchased_Envelope from './Purchased_Envelope';
import Purchased_Paper from './Purchased_Paper';
import Purchased_Stamp from './Purchased_Stamp';
import Purchased_FontFamily from './Purchased_FontFamily';
import Report from './Report'
import Histogram from './Histogram'
import Pie from './Pie'
function Store(props) {
    if (!props.warn) {
      return null;
    }
  
    return (
        <List>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Envelope' style={{color:'black'}}>查看报告</NavLink></ListItem>
            {/* <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Paper' style={{color:'black'}}>信纸</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Stamp' style={{color:'black'}}>邮票</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/FontFamily' style={{color:'black'}}>字体</NavLink></ListItem> */}
        </List>
    );
}
function PurchasedStore(props) {
    if (!props.warn) {
      return null;
    }
  
    return (
        <List>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Envelope' style={{color:'black'}}>查看报告</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Paper' style={{color:'black'}}>信纸</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Stamp' style={{color:'black'}}>邮票</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_FontFamily' style={{color:'black'}}>字体</NavLink></ListItem>
        </List>
    );
}
function Ceshi(props) {
    if (!props.warn) {
      return null;
    }
  
    return (
        <List>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Envelope' style={{color:'black'}}>项目列表</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Paper' style={{color:'black'}}>debugtalk</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Stamp' style={{color:'black'}}>模块列表</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_FontFamily' style={{color:'black'}}>用例列表</NavLink></ListItem>
        </List>
    );
}
function Date(props) {
    if (!props.warn) {
      return null;
    }
  
    return (
        <List>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Envelope' style={{color:'black'}}>环境列表</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Paper' style={{color:'black'}}>参数文件</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_Stamp' style={{color:'black'}}>全局变量</NavLink></ListItem>
            <ListItem onClick={() => {}} style={{marginLeft:'30px'}} platform="android"><NavLink to='/Purchased_FontFamily' style={{color:'black'}}>字体</NavLink></ListItem>
        </List>
    );
}
class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = {showWarning: false,bought:false,ce:false,datemessage:false}
        this.handleToggleClick = this.handleToggleClick.bind(this);
        this.handleBought = this.handleBought.bind(this);
        this.handleceshi=this.handleceshi.bind(this);
        this.handledate=this.handledate.bind(this);
    }
  
    handleToggleClick() {
        this.setState(prevState => ({
            showWarning: !prevState.showWarning
        }));
    }
    handleBought() {
        this.setState(prevState => ({
            bought: !prevState.bought
        }));
    }
    handleceshi() {
        this.setState(prevState => ({
            ce: !prevState.ce
        }));
    }
    handledate() {
        this.setState(prevState => ({
            datemessage: !prevState.datemessage
        }));
    }
    render() {
        return (
            <div>
                <header className='header'>
                    <p>无敌测试小组接口测试管理平台</p>
                </header>
                <div className='choose'>
                    <List>
                        {/* <ListItem onClick={() => {}} platform="android"><NavLink to='/Users' style={{color:'black'}}>测试管理</NavLink></ListItem> */}
                        <ListItem  onClick={this.handleceshi} arrow={this.state.ce ? 'down': 'horizontal'} platform="android">测试管理</ListItem>
                        <Ceshi warn={this.state.ce} />
                        {/* <ListItem onClick={() => {}} platform="android"><NavLink to='/Letter' style={{color:'black'}}>数据管理</NavLink></ListItem> */}
                        <ListItem  onClick={this.handledate} arrow={this.state.ce ? 'down': 'horizontal'} platform="android">数据管理</ListItem>
                        <Date warn={this.state.datemessage} />
                        <ListItem  onClick={this.handleToggleClick} arrow={this.state.datemessage ? 'down': 'horizontal'} platform="android">报告管理</ListItem>
                        <Store warn={this.state.showWarning} />
                       
                    </List>
                </div>
                <div className='content'>
                    <Route  path='/Users' component={Users}/>
                    <Route  path='/Letter' component={Letter}/>
                    <Route  path='/Envelope' component={Envelope}/>
                    <Route  path='/Paper' component={Paper}/>
                    <Route  path='/Stamp' component={Stamp}/>
                    <Route  path='/FontFamily' component={FontFamily}/>
                    <Route  path='/Purchased_Envelope' component={Purchased_Envelope}/>
                    <Route  path='/Purchased_Paper' component={Purchased_Paper}/>
                    <Route  path='/Purchased_Stamp' component={Purchased_Stamp}/>
                    <Route  path='/Purchased_FontFamily' component={Purchased_FontFamily}/>
                    <Route  path='/Report' component={Report}/>
                    <Route  path='/Histogram' component={Histogram}/>
                    <Route  path='/Pie' component={Pie}/>
                </div>
            </div>
        );
    }
}

export default Home;
