<%@ page import="java.util.List" %>
<%@ page import="com.ust.todoapp.model.Task" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo App</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <header>
        <h1>Todo Application</h1>
        <hr/>
    </header>
    <main>
        <h2>Add Task</h2>
        <form action="add" method="post">
            <div class="mb-3">
                <label for="title" class="form-label">Title</label>
                <input type="text" class="form-control" id="title" name="title">
            </div>

            <div class="mb-3">
                <label for="description" class="form-label">Description</label>
                <input type="text" class="form-control" id="description" name="description">
            </div>

            <select class="form-select" aria-label="Default select example" name="completed">
                <option selected>Open this select menu</option>
                <option value="COMPLETED">Completed</option>
                <option value="PENDING">Pending</option>
                <option value="IN_PROGRESS">In-Progress</option>
            </select>


            <button type="submit" class="btn btn-primary">Add Task</button>
        </form>
        <h2>Task List</h2>
        <div class="row">
        <c:forEach var="task" items="${todos}">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${task.title.toUpperCase()}</h5>
                    <h6 class="card-subtitle mb-2 text-body-secondary">${task.description.toUpperCase()}</h6>
                    <p class="card-text">Status : ${task.completed}</p>
                    <a href="delete?id=${task.id}" class="card-link btn btn-danger">Delete</a>
                </div>
            </div>
        </c:forEach>
        </div>
    </main>
    <footer>
        <hr/>
        <p>&copy; 2025 Todo App</p>
    </footer>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</html>
