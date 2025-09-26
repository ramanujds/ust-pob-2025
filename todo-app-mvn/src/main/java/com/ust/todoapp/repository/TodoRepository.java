package com.ust.todoapp.repository;


import com.ust.todoapp.model.Task;

import java.util.List;

public interface TodoRepository {

    Task saveTask(Task task);

    Task getTask(int id);

    void deleteTask(int id);

    List<Task> getAllTasks();

    void markAsCompleted(int id);


}
