export const fetchTodos = async () => {
    const response = await fetch('http://localhost:8080/api/tasks');
    const data = await response.json();
    return data;

    // fetch('http://localhost:8080/api/tasks')
    //   .then(response => response.json())
    //   .catch(error => console.error('Error fetching todos:', error));

};

export const createTodo = async (todo) => {
    const response = await fetch('http://localhost:8080/api/tasks', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(todo),
    });
    const data = await response.json();
    return data;
};

export const deleteTodoApi = async (id) => {
    await fetch(`http://localhost:8080/api/tasks/${id}`, {
        method: 'DELETE',
    });
};


export const markTodoAsCompletedApi = async (id) => {
    await fetch(`http://localhost:8080/api/tasks/${id}/complete`, {
        method: 'PUT',
    });
};