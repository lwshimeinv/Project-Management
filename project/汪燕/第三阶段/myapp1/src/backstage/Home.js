import React from 'react';
import ReactDOM from 'react-dom';
import './Home.css';
import './Case_maintenance.css'
import { RouteWithSubRoutes } from './App';
import { NavLink, Route } from 'react-router-dom';
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
import project_list from './project_list';
import Histogram from './Histogram';
import Pie from './Pie';
import Check_report from './Check_report';
import Case_maintenance from './Case_maintenance';
import pic1 from './img/图片1.png';
import pic2 from './img/需求白板.png';
import pic3 from './img/设置.png';
import pic4 from './img/图表.png';
import pic5 from './img/需求白板.png';
import Case_list from './Case_list';
import Case_interface from './Case_interface';


/*框架
-----梁微
*/ 
function Store(props) {
    if (!props.warn) {
        return null;
    }

    return (
        <List>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/Check_report' style={{ color: 'black' }}>查看报告</NavLink></ListItem>

        </List>
    );
}

function Ceshi(props) {
    if (!props.warn) {
        return null;
    }

    return (
        <List>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/project_list' style={{ color: 'black' }}>项目列表</NavLink></ListItem>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/Case_list' style={{ color: 'black' }}>用例列表</NavLink></ListItem>
        </List>
    );
}
function Date(props) {
    if (!props.warn) {
        return null;
    }

    return (
        <List>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/Case_maintenance' style={{ color: 'black' }}>添加接口</NavLink></ListItem>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/Case_interface' style={{ color: 'black' }}>接口管理</NavLink></ListItem>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/Stamp' style={{ color: 'black' }}>全局变量</NavLink></ListItem>
            <ListItem onClick={() => { }} style={{ marginLeft: '30px' }} platform="android"><NavLink to='/FontFamily' style={{ color: 'black' }}>字体</NavLink></ListItem>
        </List>
    );
}
class Home extends React.Component {
    constructor(props) {
        super(props);
        this.state = { showWarning: false, bought: false, ce: false, datemessage: false }
        this.handleToggleClick = this.handleToggleClick.bind(this);
        this.handleBought = this.handleBought.bind(this);
        this.handleceshi = this.handleceshi.bind(this);
        this.handledate = this.handledate.bind(this);
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


                <div class="bigBox" >
                    <div class='bigBox2'>
                        <div class="list_con">
                            <img src={pic1} className="img1" />
                        </div>

                        <div class="list">
                            <select id="list">
                                <option>接口自动化</option>
                                <option>移动端自动化</option>
                                <option>selenium自动化</option>
                                <option>web测试</option>
                                <option>其他</option>
                            </select>
                        </div>

                        <div class="case_list">
                            <img src={pic2} className="img2" />
                            <div id="case_list">用例列表</div>
                        </div>

                        <div class="shopxo">
                            <a href="">Shopxo</a>
                        </div>

                        <div class="Mapi">
                            <a href="">Mapi</a>
                        </div>

                        <div class="Http">
                            <a href="">Http</a>
                        </div>

                        <div class="GA">
                            <a href="">GA</a>
                        </div>
                        <div class="tools">
                            <img src={pic3} className="img3" />
                            <div>小工具</div>
                            <span class="new">New</span>
                            <select id="tools">
                                <option>

                                </option>
                            </select>
                        </div>
                        <div class="chart">
                            <img src={pic4} className="img4" />
                            <select id="chart">
                                <option>图表统计</option>
                            </select>
                        </div>
                        <div class="need">
                            <img src={pic5} className="img5" />
                            <select id="need">
                                <option>需求白板</option>
                            </select>
                        </div>
                        <div class="name">
                            <select id="name">
                                <option>汪燕</option>
                                <option>梁微</option>
                                <option>周心雨</option>
                                <option>杨秦晋</option>
                                <option>熊子威</option>
                                <option>盛斌</option>
                                <option>申毅杨</option>
                            </select>
                        </div>

                    </div>

                </div>

                <div className='choose'>
                    <List>
                        <ListItem onClick={this.handleceshi} arrow={this.state.ce ? 'down' : 'horizontal'} platform="android" style={{color:"rgb(245,245,245)"}}>测试管理</ListItem>
                        <Ceshi warn={this.state.ce} />
                        {/* <ListItem onClick={() => {}} platform="android"><NavLink to='/Letter' style={{color:'black'}}>数据管理</NavLink></ListItem> */}
                        <ListItem onClick={this.handledate} arrow={this.state.ce ? 'down' : 'horizontal'} platform="android">接口管理</ListItem>
                        <Date warn={this.state.datemessage} />
                        <ListItem onClick={this.handleToggleClick} arrow={this.state.datemessage ? 'down' : 'horizontal'} platform="android">报告管理</ListItem>
                        <Store warn={this.state.showWarning} />
                        <ListItem arrow={this.state.datemessage ? 'down' : 'horizontal'} platform="android">开发文档</ListItem>
                        {/* <Store warn={this.state.showWarning} /> */}
                        <ListItem arrow={this.state.datemessage ? 'down' : 'horizontal'} platform="android">关于</ListItem>
                        {/* <Store warn={this.state.showWarning} /> */}
                        <ListItem arrow={this.state.datemessage ? 'down' : 'horizontal'} platform="android">企业策划</ListItem>
                        {/* <Store warn={this.state.showWarning} /> */}

                    </List>
                </div>
                <div className='content'>
                    <Route path='/Users' component={Users} />
                    <Route path='/Letter' component={Letter} />
                    <Route path='/Envelope' component={Envelope} />
                    <Route path='/Paper' component={Paper} />
                    <Route path='/Stamp' component={Stamp} />
                    <Route path='/FontFamily' component={FontFamily} />
                    <Route path='/Purchased_Envelope' component={Purchased_Envelope} />
                    <Route path='/Purchased_Paper' component={Purchased_Paper} />
                    <Route path='/Purchased_Stamp' component={Purchased_Stamp} />
                    <Route path='/Purchased_FontFamily' component={Purchased_FontFamily} />
                    <Route path='/project_list' component={project_list} />
                    <Route path='/Histogram' component={Histogram} />
                    <Route path='/Pie' component={Pie} />
                    <Route path='/Check_report' component={Check_report} />
                    <Route path='/Case_maintenance' component={Case_maintenance} />
                    <Route path='/Case_list' component={Case_list} />
                    <Route path='/Case_interface' component={Case_interface} />
                </div>
            </div>
        );
    }
}

export default Home;
