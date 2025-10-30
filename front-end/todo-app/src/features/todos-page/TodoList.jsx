import React from "react";
import TodosForm from "./TodosForm";
import TodoCard from "./TodoCard";
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoList = ({todos,deleteTodo,markAsCompleted}) => {

   

   


    return (
        <div className="row">
        {todos.map((todo) => (
            <TodoCard key={todo.id} todo={todo} deleteTodo={deleteTodo} markAsCompleted={markAsCompleted} />
        ))}

        </div>  
        
    );
};

export default TodoList;