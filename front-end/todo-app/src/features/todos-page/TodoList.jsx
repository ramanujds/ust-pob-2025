import React from "react";
import TodosForm from "./TodosForm";
import TodoCard from "./TodoCard";
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoList = ({todos}) => {

   

   


    return (
        <div className="row">
        {todos.map((todo) => (
            <TodoCard todo={todo} />
        ))}

        </div>  
        
    );
};

export default TodoList;