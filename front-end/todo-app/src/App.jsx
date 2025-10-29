import React from 'react'
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import TodoList from './features/todos-page/TodoList'
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './features/pages/Header'
import Footer from './features/pages/Footer'
import TodosForm from './features/todos-page/TodosForm'
import TodoMain from './features/todos-page/TodoMain'

function App() {

  let [count, setCount] = useState(0);

  let [inputCount, setInputCount] = useState(0);

  function handleIncrement() {
    setCount(count + 1);
    console.log("Count:", count);
  }

  const handleDecrement = () => {
    setCount(count - 1);
    console.log("Count:", count);
  }
  
  const handleReset = () => {
    setCount(0);
    console.log("Count:", count);
  }

  function handleSet(value) {
    
    const parsedCount = parseInt(value, 10);
    if (!isNaN(parsedCount)) {
      setCount(parsedCount);
      console.log("Count:", parsedCount);
    } else {
      alert("Invalid input for count:", inputCount);
    }
  }

  function handleInputChange(event) {
    setInputCount(event.target.value);
  }

  return (
    <div className='container'>
      <div className="row">
        <header className='col-12'><Header /></header>
        
        <TodoMain />

        <footer className='col-12'>
          <Footer />
        </footer>

      </div>

    </div>
  )
}

export default App
