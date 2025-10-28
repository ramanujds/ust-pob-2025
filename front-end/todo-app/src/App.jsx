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
        <main className="row">
          <section className='col-md-6 col-12'><TodoList /></section>
          <section className='col-md-6 col-12'><TodosForm/></section>
          
        </main>

          <div className="col-12">
            <h2>Count : {count} </h2>
            <button onClick={handleIncrement} className="btn btn-primary" type="button">Increment</button>
            <button onClick={handleDecrement} className="btn btn-secondary" type="button">Decrement</button>
            <button onClick={handleReset} className="btn btn-danger" type="button">Reset</button>
            <input type="text" name="inpCount" id="inpCount" onChange={handleInputChange}/>
            <button onClick={() => handleSet(inputCount)} className="btn btn-info" type="button">Set Count</button>
          </div>

        <footer className='col-12'>
          <Footer />
        </footer>

      </div>

    </div>
  )
}

export default App
