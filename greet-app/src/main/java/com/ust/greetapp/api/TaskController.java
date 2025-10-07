package com.ust.greetapp.api;

import com.ust.greetapp.model.Task;
import com.ust.greetapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {


    TaskRepository repo;


    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/task/{title}")
    public Task getTask(@PathVariable String title){
        return repo.getTask(title);
    }

    @GetMapping("/task")
    public List<Task> getAllTasks(){
        return repo.getAllTasks();
    }

    @PostMapping("/task")
    public Task saveTask(@RequestBody Task task){
        return repo.saveTask(task);
    }

    @DeleteMapping("/task/{title}")
    public void deleteTask(@PathVariable String title){
        repo.deleteTask(title);
    }


    // Create a list of tasks and return all

}
