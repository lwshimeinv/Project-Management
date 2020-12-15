import React,{useState,useEffect} from 'react';
import { BrowserRouter as Router, Redirect, Route, NavLink, Switch } from 'react-router-dom'
import store from './reduxDemo/store';
import { Provider } from 'react-redux'
import Home from './pages/Home';
// redux react-redux
// webpack
// umi框架
// Router（react-router）怎么实现的（源码）

const App = ()=>{
	return <Provider store={store}>
		<Home />
	</Provider>
}
export default App;

// const App = ()=>{
// 	const [todos,setTodos] = useState(store.getState())
// 	useEffect(()=>{
// 		store.subscribe(()=>{
// 			setTodos( store.getState() )
// 		})
// 	},[])
// 	return <div>
// 		{
// 			todos.map((item)=><li>{item}</li>)
// 		}
// 		<button onClick={()=>{
// 			store.dispatch({
// 				type:'add_todo',
// 				value:'456'
// 			})
// 		}}>添加</button>
// 	</div>
// }
// export default App;


 