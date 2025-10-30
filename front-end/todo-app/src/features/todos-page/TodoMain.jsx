import React,{useState,useEffect} from 'react'
import TodoList from './TodoList';
import TodosForm from './TodosForm';
import { fetchTodos,createTodo,markTodoAsCompletedApi,deleteTodoApi } from './todoApiService';

const TodoMain = () => {

    //  const sampleTodos = [
    //     { id: 1, title: "Learn React", completed: false },
    //     { id: 2, title: "Build a Todo App", completed: false },
    //     { id: 3, title: "Learn Java", completed: true },
    // ];

    const [todos, setTodos] = useState([]);

    useEffect(() => fetchTodoFromApi() , []);


    const fetchTodoFromApi = () => {
        fetchTodos().then(data => setTodos(data));
    }

    function addTodo(todo) {
        createTodo(todo).then((newTodo) => {
            fetchTodoFromApi();
        });
    }

    function deleteTodo(id) {
        deleteTodoApi(id).then(() => {
            fetchTodoFromApi();
        });
    }

    function markAsCompleted(id) {
        markTodoAsCompletedApi(id).then(() => {
            fetchTodoFromApi();
        });
    }


  return (
    <div className="row">
    <div className='col-md-6 col-12'>
        <TodoList todos={todos} deleteTodo={deleteTodo} markAsCompleted={markAsCompleted}/>
    </div>
    <div className='col-md-6 col-12'>
        <TodosForm addTodo={addTodo} />
    </div>
    </div>
  )
}

export default TodoMain