package com.todoapp.service;

import com.todoapp.model.Task;
import com.todoapp.repository.TodoRepository;
import com.todoapp.repository.TodoRepositoryImpl;

public class TodoServiceImpl implements TodoService{

    TodoRepository repo = new TodoRepositoryImpl();

    public void createTodo(int id, String title, String details, String status) {
        Task task = new Task(id,title,details,status);
        repo.saveTask(task);
        System.out.println("Task Added");
    }

    public void printAllTodos() {

        Task[] todos = repo.getAllTasks();
        for (Task t:todos){
            if(t==null){
                return;
            }
            System.out.println("Id : "+t.getId());
            System.out.println("Title : "+t.getTitle());
            System.out.println("Status : "+t.getStatus());
            System.out.println("Details : "+t.getDetails());
        }

    }

    public void printTodoById(int id) {

    }

    public void deleteTodo(int id) {

    }

    public void completeTodo(int id) {

    }
}
