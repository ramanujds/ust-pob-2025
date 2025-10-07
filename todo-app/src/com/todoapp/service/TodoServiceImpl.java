package com.todoapp.service;

import com.todoapp.model.Task;
import com.todoapp.repository.TodoRepository;
import com.todoapp.repository.TodoRepositoryDBBasedImpl;
import com.todoapp.repository.TodoRepositoryImpl;

public class TodoServiceImpl implements TodoService{

    TodoRepository repo = new TodoRepositoryDBBasedImpl();

    public void createTodo(int id, String title, String details, String status) {
        Task task = new Task(id,title,details,status);
        repo.saveTask(task);
        System.out.println("Task Added");
    }

    public void printAllTodos() {

        var todos = repo.getAllTasks();
        for (Task todo : todos) {
            if (todo == null) {
                return;
            }
            printTodo(todo);
        }

    }

    public void printTodoById(int id) {
        Task task = repo.getTask(id);
        printTodo(task);
    }

    public void deleteTodo(int id) {

    }

    public void completeTodo(int id) {
        repo.markAsCompleted(id);
    }


    void printTodo(Task todo){
        System.out.println("Id : " + todo.getId());
        System.out.println("Title : " + todo.getTitle());
        System.out.println("Status : " + todo.getStatus());
        System.out.println("Details : " + todo.getDetails());
    }

}
