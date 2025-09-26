package com.ust.todoapp.service;


import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TodoRepository;
import com.ust.todoapp.repository.TodoRepositoryImpl;

public class TodoServiceImpl implements TodoService{

    private TodoRepositoryImpl repo;

    public void setRepo(TodoRepositoryImpl repo) {
        this.repo = repo;
    }

    public TodoServiceImpl(){

    }

    public TodoServiceImpl(TodoRepositoryImpl repo) {
        this.repo = repo;
    }



    public void createTodo(Task task) {
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
        repo.deleteTask(id);
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
