package com.ust.todoapp.api;

import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private TaskRepository repository;
    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @PostMapping
    public Task createTask(Task task) {
        return repository.save(task);
    }

    @GetMapping("/search")
    public Task searchTasks(String title) {
        return repository.findByTitle(title);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        repository.deleteById(id);
    }



}
