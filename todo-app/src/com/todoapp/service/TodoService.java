package com.todoapp.service;

import com.todoapp.model.Task;

public interface TodoService {

    void createTodo(int id, String title, String details, String status);

    void printAllTodos();

    void printTodoById(int id);

    void deleteTodo(int id);

    void completeTodo(int id);

}
