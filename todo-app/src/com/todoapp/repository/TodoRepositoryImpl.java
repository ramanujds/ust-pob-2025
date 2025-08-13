package com.todoapp.repository;

import com.todoapp.model.Task;

public class TodoRepositoryImpl implements TodoRepository {

    private Task[] todos = new Task[10];


    public void saveTask(Task task) {
        todos[0] = task;
    }

    public Task getTask(int id) {
        return null;
    }

    public void deleteTask(int id) {

    }

    public Task[] getAllTasks() {
        return todos;
    }

    public void markAsCompleted(int id) {

    }
}
