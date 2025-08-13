package com.todoapp;


import com.todoapp.service.TodoService;
import com.todoapp.service.TodoServiceImpl;

public class Main {
    public static void main(String[] args) {

        TodoService todoService= new TodoServiceImpl();

        todoService.createTodo();

        // add 5 tasks


        todoService.printAllTodos();

    }
}