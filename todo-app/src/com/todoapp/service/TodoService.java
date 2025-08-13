package com.todoapp.service;

import com.todoapp.model.Task;

public interface TodoService {

    void createTodo();

    void printAllTodos();

    void printTodoById(int id);

    void deleteTodo(int id);

    void completeTodo(int id);

}
