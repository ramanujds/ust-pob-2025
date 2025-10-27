import React from "react";
import TodosForm from "./TodosForm";
import TodoCard from "./TodoCard";
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoList = () => {

    const todos = [
        { id: 1, title: "Learn React", completed: false },
        { id: 2, title: "Build a Todo App", completed: false },
        { id: 3, title: "Profit", completed: false },
    ];

    return (
        <div className="row">
        {todos.map((todo) => (
            <TodoCard todo={todo} />
        ))}

        </div>  
        
    );
};

export default TodoList;