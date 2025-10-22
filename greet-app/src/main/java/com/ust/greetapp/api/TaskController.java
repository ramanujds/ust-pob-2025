package com.ust.greetapp.api;

import com.ust.greetapp.model.Task;
import com.ust.greetapp.repository.TaskRepository;
import com.ust.greetapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin
public class TaskController {


    private final TaskService service;

    @Autowired
    public TaskController(TaskService service) {
        this.service = service;
    }


    @GetMapping("/search")
    public List<Task> findTasks(@RequestParam(value = "title", required = false) String title,
                                @RequestParam(value = "status", required = false, defaultValue = "false") boolean status,
                                @RequestParam(value = "overdue", required = false, defaultValue = "false") boolean overdue
                                ) {
        if (title != null && !title.isEmpty()) {
            return service.getTaskByTitle(title);
        } else if (status) {
            return service.findTaskByStatus(true);
        } else if (overdue) {
            return service.findOverdueTasks();
        } else {
            return service.getAllTasks();
        }
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return service.getTaskById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Task saveTask(@RequestBody Task task) {
        return service.createTask(task);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable int id) {
        service.deleteTaskById(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }


    @GetMapping("/due/current")
    public List<Task> getCurrentMonthsDueTasks(){
        return service.findTasksDueForCurrentMonth();
    }



}
