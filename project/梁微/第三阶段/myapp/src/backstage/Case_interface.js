import React from 'react'
import './Case_interface.css'

const Case_interface = () => {
    return (
        <div>
            <div class="smallBox">
                <div class="box1">SHOPXO测试接口管理</div>
                <div class="box2">说明1：在ID中输入用例编号后回车，可显示这条用例的信息.</div>
                <div class="box3">说明2：如果要插入新的用例，ID一栏必须清空才能正常插入用例.</div>
                <div class="box4">说明3：可修改参数进行[用例执行],测试通过通过[更新测试用例]更新至数据库.</div>
            </div>
            <div class='box'>
                <div class='search'>
                    <span>接口名称：</span>
                    <input></input>
                    <span>  请求方法：</span>
                    <select id="method">
                        <option></option>
                        <option>get</option>
                        <option>post</option>
                    </select>
                    <span>  状态：</span>
                    <select id="method">
                        <option></option>
                        <option>get</option>
                        <option>post</option>
                    </select>
                    <button style={{ marginLeft: '20px' }}>查询</button>
                    <button style={{ marginLeft: '20px' }}>重置</button>
                    <button style={{ marginLeft: '20px' }}>新增</button>
                </div>
                <div class='biaoge'>
                    <table class='lala'>
                        <thead>
                            <tr>
                                <th style={{ width: '100px', height: '50px' }}>编号</th>
                                <th style={{ width: '100px' }}>接口名称</th>
                                <th style={{ width: '100px' }}>请求URL</th>
                                <th style={{ width: '100px' }}>请求方法</th>
                                <th style={{ width: '100px' }}>参数</th>
                                <th style={{ width: '100px' }}>状态</th>
                                <th style={{ width: '150px' }}></th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style={{ width: '100px', height: '50px' }}>1</td>
                                <td style={{ width: '100px' }}>登录接口</td>
                                <td style={{ width: '100px' }}>www.baidu.com</td>
                                <td style={{ width: '100px' }}>post</td>
                                <td style={{ width: '100px' }}></td>
                                <td style={{ width: '100px' }}>启用</td>
                                <td style={{ width: '150px' }}>
                                    <button>编辑</button>
                                    <button style={{ marginLeft: '20px' }}>删除</button>
                                </td>
                            </tr>
                            <tr>
                                <td style={{ width: '100px', height: '50px' }}>2</td>
                                <td style={{ width: '100px' }}>注册接口</td>
                                <td style={{ width: '100px' }}>www.baidu.com</td>
                                <td style={{ width: '100px' }}>post</td>
                                <td style={{ width: '100px' }}></td>
                                <td style={{ width: '100px' }}>启用</td>
                                <td style={{ width: '150px' }}>
                                    <button>编辑</button>
                                    <button style={{ marginLeft: '20px' }}>删除</button>
                                </td>
                            </tr>
                            <tr>
                                <td style={{ width: '100px', height: '50px' }}>3</td>
                                <td style={{ width: '100px' }}>个人中心接口</td>
                                <td style={{ width: '100px' }}>www.baidu.com</td>
                                <td style={{ width: '100px' }}>get</td>
                                <td style={{ width: '100px' }}></td>
                                <td style={{ width: '100px' }}>启用</td>
                                <td style={{ width: '150px' }}>
                                    <button>编辑</button>
                                    <button style={{ marginLeft: '20px' }}>删除</button>
                                </td>
                            </tr>
                            <tr>
                                <td style={{ width: '100px', height: '50px' }}>4</td>
                                <td style={{ width: '100px' }}>个人中心接口</td>
                                <td style={{ width: '100px' }}>www.baidu.com</td>
                                <td style={{ width: '100px' }}>get</td>
                                <td style={{ width: '100px' }}></td>
                                <td style={{ width: '100px' }}>启用</td>
                                <td style={{ width: '150px' }}>
                                    <button>编辑</button>
                                    <button style={{ marginLeft: '20px' }}>删除</button>
                                </td>
                            </tr>
                            <tr>
                                <td style={{ width: '100px', height: '50px' }}>5</td>
                                <td style={{ width: '100px' }}>个人中心接口</td>
                                <td style={{ width: '100px' }}>www.baidu.com</td>
                                <td style={{ width: '100px' }}>get</td>
                                <td style={{ width: '100px' }}></td>
                                <td style={{ width: '100px' }}>启用</td>
                                <td style={{ width: '150px' }}>
                                    <button>编辑</button>
                                    <button style={{ marginLeft: '20px' }}>删除</button>
                                </td>
                            </tr>
                        </tbody>

                    </table>
                </div>

            </div>
        </div>
    )
}
export default Case_interface;