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

import { Outlet } from 'react-router'

function App() {

  return (
    <div className='container'>
      <div className="row">
        <header className='col-12'><Header /></header>
        
          <Outlet/>

        <footer className='col-12'>
          <Footer />
        </footer>

      </div>

    </div>
  )
}

export default App
