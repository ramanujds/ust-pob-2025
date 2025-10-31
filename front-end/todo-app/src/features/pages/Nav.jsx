import React from 'react'
import { Link } from 'react-router-dom'

const Nav = () => {
  return (
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ToDo App</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <Link className="nav-link active" aria-current="page" to="/">Home</Link>
        <Link className="nav-link" to="#">Pending Tasks</Link>
        <Link className="nav-link" to="#">Completed Tasks</Link>
        <Link className="nav-link" to="/add-todo">+ New Task</Link>
      </div>
    </div>
  </div>
</nav>
  )
}

export default Nav