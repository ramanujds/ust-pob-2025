package com.todoapp.repository;

import com.todoapp.exception.InvalidTodoException;
import com.todoapp.exception.TodoNotFoundException;
import com.todoapp.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoRepositoryImpl implements TodoRepository {

    private Map<Integer,Task> todos = new HashMap<>();


    // TODO: Must throw an InvalidTodoException if
    //    id is not a positive number;
    //    title is blank or null;
    //    details is blank or null;
    //    status is not "Pending" or "Completed";

    public void saveTask(Task task) {
        if (task.getId() <= 0){
            throw new InvalidTodoException("Invalid ID : "+task.getId());
        }
        if (task.getTitle() == null || task.getTitle().isBlank()){
            throw new InvalidTodoException("Invalid title : "+task.getTitle());
        }
      todos.put(task.getId(),task);
    }

    // TODO: Must throw an TodoNotFoundException if no Task present with that id

    public Task getTask(int id) {
       return todos.get(id);
    }

    public void deleteTask(int id) {

        todos.remove(id);

    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(todos.values());
    }

    public void markAsCompleted(int id) {
        Task task = getTask(id);
        if (task !=null){
            task.setStatus("Completed");
        }
    }
}
