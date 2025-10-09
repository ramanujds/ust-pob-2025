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

    public List<Task> getTaskByTitle(String title) {
        return taskRepo.findByTitle(title);
    }

    public void deleteTaskById(int id) {
        taskRepo.deleteById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public List<Task> findTaskByStatus(boolean status){
        return taskRepo.findByCompleted(status);
    }

    public List<Task> findOverdueTasks(){
        return taskRepo.findOverdueTasks();
    }

    public Task updateTask(int id, Task newTask){
        if (taskRepo.existsById(id)) {
            Task existingTask = getTaskById(id);
            if (newTask.getDescription() != null) {
                existingTask.setDescription(newTask.getDescription());
            }
            if (newTask.getDueDate() != null) {
                existingTask.setDueDate(newTask.getDueDate());
            }
            if (newTask.getTitle() != null) {
                existingTask.setTitle(newTask.getTitle());
            }
            if (newTask.isCompleted()){
                existingTask.setCompleted(true);
            }
            return taskRepo.save(existingTask);
        }
        throw new RuntimeException("No task available with id "+id);

    }

}
