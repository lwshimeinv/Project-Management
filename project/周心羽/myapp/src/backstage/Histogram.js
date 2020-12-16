import React from 'react'

const Histogram = () => {
    return (
        <div style={{marginTop:"30px"}}>
            <h2 style={{textAlign:'center',color:'black'}}>已执行的测试用例的bug情况</h2>
            <img style={{width:'100%'}}
                src={require('./img/bug.jpg')} />
            <h2 style={{textAlign:'center',color:'black'}}>测试报告</h2>
            <img style={{width:'100%'}}
                src={require('./img/number.jpg')} />
            <img style={{width:'100%'}}
                src={require('./img/result.jpg')} />
        </div>
    )
}
export default Histogram;