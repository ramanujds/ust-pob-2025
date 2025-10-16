package com.ust.todoapp.controller;

import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @GetMapping("/")
    public String home(Model m) {
        List<Task> todos = repository.findAll();
        m.addAttribute("todos", todos);
        System.out.println("Available tasks : "+todos.size());
        return "index.jsp";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute("task") Task task) {
        System.out.println(task);
        repository.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteTask(@RequestParam("id") int id) {
        repository.deleteById(id);
        return "redirect:/";
    }

}
