package com.todoapp.repository;

import com.todoapp.model.Task;

import java.util.List;

public interface TodoRepository {

    void saveTask(Task task);

    Task getTask(int id);

    void deleteTask(int id);

    List<Task> getAllTasks();

    void markAsCompleted(int id);


}
