package com.todoapp.repository;

import com.todoapp.model.Task;

public interface TodoRepository {

    void saveTask(Task task);

    Task getTask(int id);

    void deleteTask(int id);

    Task[] getAllTasks();

    void markAsCompleted(int id);


}
