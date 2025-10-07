package com.todoapp.repository;

import com.todoapp.model.Task;

import java.util.List;

public class TodoRepositoryDBBasedImpl implements TodoRepository{
    @Override
    public void saveTask(Task task) {

    }

    @Override
    public Task getTask(int id) {
        return null;
    }

    @Override
    public void deleteTask(int id) {

    }

    @Override
    public List<Task> getAllTasks() {
        return List.of();
    }

    @Override
    public void markAsCompleted(int id) {

    }
}
