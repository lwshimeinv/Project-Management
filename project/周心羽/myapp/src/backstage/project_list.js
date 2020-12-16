import React from 'react'
import './project_list.css'


// 首页
// 杨秦晋、周心羽
const project_list = () => {
    return (
        <div>
            <div class="win">
                <div class="con">
                    {/* <img src="https://s3.ax1x.com/2020/12/14/rnD4rd.jpg"/> */}
                    <div class="lt" style={{paddingTop:"50px"}}>
                        <h1 style={{fontSize:"60px"}} >接口自动化测试平台</h1>
                        <h2>无敌测试小组</h2>
                        {/* <p>接口测试是测试系统组件间接口的一种测试。接口测试主要用于检测外部系统与系统之间以及内部各个子系统之间的交互点。</p>
                        <p>测试的重点是要检查数据的交换，传递和控制管理过程，以及系统间的相互逻辑依赖关系等。</p> */}
                    </div>
                    <div class="clear"></div>
                    <ul class="maoba">
                        <li style={{ display: "inline-block" ,width:"32%"}}>
                            <h2>用例维护</h2>
                            <div class="text">
                                <p style={{textAlign:"left",marginLeft:"10px",color:"grey"}}>接口自动化测试用例快速维护入口</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>Pigeon用例列表</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>Mapi用例列表</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>Http用例列表</p>
                            </div>
                            <img src="https://s3.ax1x.com/2020/12/14/rnrzlD.jpg" style={{width:"65px",float:"left",padding: "20px 0"}}/>
                            <div class="clear"></div>
                        </li>
                        <li style={{ display: "inline-block" ,width:"32%"}}>
                            <h2>用例数据配置</h2>
                            <img src="https://s3.ax1x.com/2020/12/14/rnrjfK.jpg" style={{width:"65px",float:"left",padding: "20px 0"}}/> 
                            <div class="text">
                                <p style={{textAlign:"left",marginLeft:"10px",color:"grey"}}>接口自动化测试用例数据维护</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>测试团队维护</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>服务信息维护</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>数据库信息维护</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>参数替换维护</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>前置/后置维护</p>
                            </div>
                            <div class="clear"></div>
                        </li>
                        <li style={{ display: "inline-block" ,width:"32%"}}>
                            <h2>数据显示</h2>
                            <img src="https://s3.ax1x.com/2020/12/14/rnrjfK.jpg" style={{width:"65px",float:"left",padding: "20px 0"}}/>
                            <div class="text">
                                <p style={{textAlign:"left",marginLeft:"10px",color:"grey"}}>数据展示快速入口</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>Jenkins任务地址添加</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>查看成功率</p>
                                <p style={{textAlign:"left",marginLeft:"10px",color:"blue"}}>查看覆盖率</p>
                            </div>
                            <div class="clear"></div>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
    )
}

export default project_list