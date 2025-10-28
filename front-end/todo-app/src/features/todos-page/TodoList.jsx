import React from "react";
import TodosForm from "./TodosForm";
import TodoCard from "./TodoCard";
import 'bootstrap/dist/css/bootstrap.min.css';

const TodoList = () => {

    const sampleTodos = [
        { id: 1, title: "Learn React", completed: false },
        { id: 2, title: "Build a Todo App", completed: false },
        { id: 3, title: "Profit", completed: false },
    ];

    const [todos, setTodos] = React.useState(sampleTodos);

    const [todoForm, setTodoForm] = React.useState({
        title: "",
        completed: false,
    });

    function addTodo() {
        setTodos([...todos, todoForm]);
    }

    function handleTitleChange(title) {
        setTodoForm({ ...todoForm, title: title });
    }

    function handleCompletedChange(completed) {
        setTodoForm({ ...todoForm, completed: completed });
    }




    return (
        <div className="row">
        {todos.map((todo) => (
            <TodoCard todo={todo} />
        ))}

        </div>  
        
    );
};

export default TodoList;