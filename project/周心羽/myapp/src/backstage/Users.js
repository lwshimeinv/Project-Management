import React from 'react'
const table_css = {
    border:'1px solid black',
    margin:'20px auto',
    width:'90%',
    cellSpacing:'0px'
}
const td_css = {
    border:'1px solid black',
    height:'35px',
    fontSize:'20px'
}
class Users extends React.Component {
    constructor() {
        super();
        this.state = {
            data1: [],
        }
    }
    componentDidMount() {
        fetch("/users", {
            method: "GET",
            mode: "cors",
            headers: {
                'Accept': 'application/json,text/plain,*/*'
            }
        })
            .then(res => res.json())
            .then(data => {
                this.setState({
                    data1: data.rows
                })
            })
    }
    render() {
        return (
            <table style={table_css}>
                <thead>
                    <tr>
                        <th style={td_css}>昵称</th>
                        <th style={td_css}>ID</th>
                        <th style={td_css}>OPENID</th>
                        <th style={td_css}>个签</th>
                        <th style={td_css}>生日</th>
                        <th style={td_css}>性别</th>
                    </tr>
                </thead>
                {
                    this.state.data1.map((element, index) => {
                        return (
                            <tbody key={index}>
                                <tr>
                                    <td style={td_css}>{element.username}</td>
                                    <td style={td_css}>{element.userid}</td>
                                    <td style={td_css}>{element.openid}</td>
                                    <td style={td_css}>{element.signal}</td>
                                    <td style={td_css}>{element.birth.toString().split("T")[0]}</td>
                                    <td style={td_css}>{element.usersex}</td>
                                </tr>
                            </tbody>
                        )
                    })
                }
            </table>
        )
    }
}
export default Users