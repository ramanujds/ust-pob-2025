package com.ust.todoapp.service;

import com.ust.todoapp.model.Task;

public interface TodoService {

    void createTodo(Task task);

    void printAllTodos();

    void printTodoById(int id);

    void deleteTodo(int id);

    void completeTodo(int id);

}
