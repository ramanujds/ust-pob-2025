import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoCard = ({todo}) => {
  return (
    <div className="card" style={{ width: '18rem' }}>
      <div className="card-body">
        <h5 className="card-title">{todo.title}</h5>
        <p className="card-text">Status: {todo.completed ? 'Completed' : 'Pending'}</p>
      </div>
    </div>
  )
}

export default TodoCard