import React from 'react'
import TodoList from './TodoList';
import TodosForm from './TodosForm';

const TodoMain = () => {

     const sampleTodos = [
        { id: 1, title: "Learn React", completed: false },
        { id: 2, title: "Build a Todo App", completed: false },
        { id: 3, title: "Learn Java", completed: true },
    ];

    const [todos, setTodos] = React.useState(sampleTodos);

    

    function addTodo(todo) {
        setTodos([...todos, todo]);
    }

    function deleteTodo(id) {
        const updatedTodos = todos.filter((todo) => todo.id !== id);
        setTodos(updatedTodos);
    }


  return (
    <div className="row">
    <div className='col-md-6 col-12'>
        <TodoList todos={todos} deleteTodo={deleteTodo} />
    </div>
    <div className='col-md-6 col-12'>
        <TodosForm addTodo={addTodo} />
    </div>
    </div>
  )
}

export default TodoMain