import React, { useEffect, useState } from "react";
import TodoCard from "./TodoCard";
import 'bootstrap/dist/css/bootstrap.min.css';
import { deleteTodoApi, fetchTodos, markTodoAsCompletedApi } from "./todoApiService";

const TodoList = () => {

   
    const [todos, setTodos] = useState([]);
    
        useEffect(() => fetchTodoFromApi() , []);
    
    
        const fetchTodoFromApi = () => {
            fetchTodos().then(data => setTodos(data));
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
        {todos.map((todo) => (
            <TodoCard key={todo.id} todo={todo} deleteTodo={deleteTodo} markAsCompleted={markAsCompleted} />
        ))}

        </div>  
        
    );
};

export default TodoList;