function createTodo(event){
    event.preventDefault();
    let title = document.getElementById('title').value;
    let description = document.getElementById('description').value;
    let status = document.getElementById('status').value;
    let dueDate = document.getElementById('dueDate').value;
    let completed = false;
    if(status === 'COMPLETED'){
        completed = true;
    }

    let todo = {
        title: title,
        description: description,
        completed: completed,
        dueDate: dueDate
    };

    fetch('http://localhost:8080/api/v1/tasks', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(todo)
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
    }
    )
    .catch((error) => {
        console.error('Error:', error);
    });

    resetForm();
}

function resetForm(){
    document.getElementById('todoForm').reset();
}