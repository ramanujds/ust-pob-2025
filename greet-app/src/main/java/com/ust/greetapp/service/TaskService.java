package com.ust.greetapp.service;

import com.ust.greetapp.model.Task;
import com.ust.greetapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    private TaskRepository taskRepo;

    @Autowired
    public TaskService(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

    public Task createTask(Task task) {
        return taskRepo.save(task);
    }

    public Task getTaskById(int id){
        return taskRepo.findById(id).get();
    }

    public Task getTaskByTitle(String title) {
        return taskRepo.findByTitle(title);
    }

    public void deleteTaskById(int id) {
        taskRepo.deleteById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

}
