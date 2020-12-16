import React from 'react'
import pic1 from './img/图片1.png'
import pic2 from './img/需求白板.png'
import pic3 from './img/设置.png'
import pic4 from './img/图表.png'
import pic5 from './img/需求白板.png'
import './Case_maintenance.css'

// 添加接口
// 汪燕

const Case_maintenance = () => {
    return (
        <div>
            
            <div class="smallBox">
                <div class="box1">SHOPXO测试接口添加</div>
                <div class="box2">说明1：在ID中输入用例编号后回车，可显示这条用例的信息.</div>
                <div class="box3">说明2：如果要插入新的用例，ID一栏必须清空才能正常插入用例.</div>
                <div class="box4">说明3：可修改参数进行[用例执行],测试通过通过[更新测试用例]更新至数据库.</div>
            </div>
            <div class="main">
                <p class="p0">(多个参数使用<span>&&</span>分割)</p>
                <p class="p1">批量生产SHOPXO服务中所有接口用例模板</p>
                <p class="p2">解析4080请求</p>
                <p class="p3">返回[测试用例列表]</p>
                
            </div>
            <div class="main1">
                <ul class="main_view">
                    <li id="li1">
                        <div>用例ID：<input placeholder="  输入用例ID并回车，可维护现有用例"></input>
                        <span>输入ID号+回车，可调出该ID号用例数据</span>
                        </div>
                    
                    </li>
                    <li id="li2">
                        <div>
                            <div>*</div>选择团队：
                            <select>
                            <option>请选择</option>
                            <option>无敌测试小组</option>
                            <option>其他小组</option>
                            </select>
                            <span>测试团队维护</span>
                        </div>
                    </li>
                    <li id="li3">
                        <div>
                            <div>*</div>开启每日CI：
                           <form>
                               <input type="radio" name="select" value="不开启" checked="checked"/>不开启
                               <input type="radio" name="select" value="开启"/>开启
                           </form>
                            <span>标记是否要放入每日Jenkins构建测试中</span>
                        </div>
                    </li>
                    <li id="li4">
                        <div>
                            <div>*</div>服务名：
                            <select>
                            <option>请选择</option>
                            <option>无敌测试小组</option>
                            <option>其他小组</option>
                            </select>
                            <span>维护服务</span>
                        </div>
                    </li>
                    <li id="li5">
                        <div>
                            <div>*</div>测试环境：
                            <select>
                            <option>beta环境</option>
                            <option>selenium自动化</option>
                            <option>其他</option>
                            </select>
                            
                        </div>
                    </li>
                    <li id="li6">
                        <div>
                            <div>*</div>Method：
                            <select>
                            <option></option>
                            <option>selenium自动化</option>
                            <option>其他</option>
                            </select>
                            
                        </div>
                    </li>
                    <li id="li7">
                        <div>
                            Url：
                            <select>
                            <option></option>
                            <option>selenium自动化</option>
                            <option>其他</option>
                            </select>
                            
                        </div>
                        
                    </li>
                    <li id="li8">
                        <div>
                            ParammeterTypes：
                            
                        </div>
                        <textarea>

                            </textarea>
                            <span>帮助说明</span>
                    </li>
                    <li id="li9">
                        <div>
                            Parammeters：      
                        </div>
                        <textarea>

                            </textarea>
                            
                    </li>
                    <li id="li10">
                        <div>
                            <div>*</div>direct：
                           <form>
                               <input type="radio" name="select" value="false" checked="checked"/>flase
                               <input type="radio" name="select" value="true"/>true
                           </form>
                            <span>如果需要每次调用都记录cat日志，需要带上direct=false参数</span>
                        </div>
                    </li>
                    <li id="li11">
                        <div>
                            备注：
                           <input></input>
                            
                        </div>
                    </li>
                   
                </ul>

            </div>
            <div class="end">用例维护页面</div>

        </div>
    )
}

export default Case_maintenance