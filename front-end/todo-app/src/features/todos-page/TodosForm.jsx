import React from 'react'

const TodosForm = ({ addTodo }) => {

  const [todoForm, setTodoForm] = React.useState({
    title: "",
    completed: false,
  });

  function handleFormSubmit(event) {
    addTodo(todoForm);
    event.preventDefault();

    console.log("Form submitted:", todoForm);
  }

  function handleTitleChange(event) {
    setTodoForm({ ...todoForm, title: event.target.value });
  }

  function handleCompletedChange(event) {
    setTodoForm({ ...todoForm, completed: event.target.checked });
  }



  return (
    <>
      <form onSubmit={handleFormSubmit}>
        <div className="mb-3">
          <label htmlFor="title" className="form-label">Todo Title</label>
          <input type="text" className="form-control" id="title" placeholder="Enter todo title" onChange={handleTitleChange} />
        </div>
        <div className="form-check mb-3">
          <input className="form-check-input" type="checkbox" id="completed" onChange={handleCompletedChange} />
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

