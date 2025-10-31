import React from 'react'
import { createTodo } from './todoApiService';
import { useNavigate } from 'react-router-dom';

const TodosForm = () => {

  const naigate = useNavigate();

  const [todoForm, setTodoForm] = React.useState({
    id:0,
    title: "",
    completed: false,
  });

  const [errors, setErrors] = React.useState({});

  function addTodo(todo) {
          createTodo(todo).then((newTodo) => {
              naigate('/');
          });
      }

  function handleFormSubmit(event) {
    event.preventDefault();
    const id = Math.floor(Math.random() * 10000); 
    todoForm.id = id;
    if (!validateForm()) {
      return;
    }
    addTodo(todoForm);
    console.log("Form submitted:", todoForm);
  }

  function handleInputChange(event) {
    const { name, value, checked } = event.target;
    if (name === "completed") {
      setTodoForm({ ...todoForm, completed: checked });
      return;
    }
    setTodoForm({ ...todoForm, [name]: value });
  }

  function validateForm() {
    if (todoForm.title.trim() === "") {
      setErrors({ title: "Title is required" });
      return false;
    }
    setErrors({});
    return true;
  }




  return (
    <>
      <form onSubmit={handleFormSubmit}>
        <div className="mb-3">
          <label htmlFor="title" className="form-label">Todo Title</label>
          <input type="text" name="title" className="form-control" id="title" placeholder="Enter todo title" onChange={handleInputChange} />
          {errors.title && <small className='text-danger'>* Title is required</small>} 
        </div>
        <div className="form-check mb-3">
          <input className="form-check-input" name="completed" type="checkbox" id="completed" onChange={handleInputChange} />
          <label className="form-check-label" htmlFor="completed">
            Completed
          </label>
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>


    </>
  )

}

export default TodosForm

