package com.todoapp;


import com.todoapp.service.TodoService;
import com.todoapp.service.TodoServiceImpl;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();

        todoService.createTodo(1, "Learn Java", "Explore OOP Concepts", "Completed");

        todoService.createTodo(2, "Learn Spring", "Spring Boot Rest Apis", "Pending");

        todoService.createTodo(3, "Learn Java", "Explore OOP Concepts", "Completed");

        todoService.createTodo(4, "Learn Spring", "Spring Boot Rest Apis", "Pending");


        todoService.printAllTodos();
    }
}