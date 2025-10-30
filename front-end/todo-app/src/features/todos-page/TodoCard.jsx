import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoCard = ({todo, deleteTodo, markAsCompleted}) => {



  return (
    <div className="card" style={{ width: '18rem' }}>
      <div className="card-body">
        <h5 className="card-subtitle mb-2 text-muted">ID: {todo.id}</h5>
        <h5 className="card-title">{todo.title}</h5>
        <p className="card-text">Status: {todo.completed ? 'Completed' : 'Pending'}</p>
        <button className="btn btn-dark" onClick={() => deleteTodo(todo.id)}>Delete</button>
       <button className="btn btn-success" disabled={todo.completed} onClick={() => markAsCompleted(todo.id)}>{todo.completed?'Done':'Mark Completed'}</button>
      </div>
    </div>
  )
}

export default TodoCard