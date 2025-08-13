package com.todoapp;


import com.todoapp.service.TodoService;
import com.todoapp.service.TodoServiceImpl;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();

        todoService.createTodo(1, "Learn Java", "Explore OOP Concepts", "Completed");

        todoService.createTodo(2, "Learn Spring", "Spring Boot Rest Apis", "Pending");

        todoService.createTodo(3, "Learn Collections", "Java Collection Framework", "Pending");


        todoService.printAllTodos();

        todoService.completeTodo(3);
        todoService.printTodoById(3);

    }
}