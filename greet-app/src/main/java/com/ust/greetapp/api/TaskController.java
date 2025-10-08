package com.ust.greetapp.api;

import com.ust.greetapp.model.Task;
import com.ust.greetapp.repository.TaskRepository;
import com.ust.greetapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {


    private final TaskService service;

    @Autowired
    public TaskController(TaskService service) {
        this.service = service;
    }


    @GetMapping("/title/{title}")
    public Task getTaskByTitle(@PathVariable String title){
        return service.getTaskByTitle(title);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id){
        return service.getTaskById(id);
    }

    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return service.createTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id){
        service.deleteTaskById(id);
    }



}
