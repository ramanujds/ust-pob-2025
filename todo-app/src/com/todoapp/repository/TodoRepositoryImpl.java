package com.todoapp.repository;

import com.todoapp.exception.InvalidTodoException;
import com.todoapp.model.Task;

public class TodoRepositoryImpl implements TodoRepository {

    private Task[] todos = new Task[3];
    int current=0;


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
       if (current==todos.length){
           System.out.println("List Full Can't Add more Task");
           return;
       }
        todos[current] = task;
        current++;
    }

    // TODO: Must throw an TodoNotFoundException if no Task present with that id

    public Task getTask(int id) {
        for (Task t:todos){
            if (t.getId()==id){
                return t;
            }
        }
        return null;
    }

    public void deleteTask(int id) {



    }

    public Task[] getAllTasks() {
        return todos;
    }

    public void markAsCompleted(int id) {
        Task task = getTask(id);
        if (task !=null){
            task.setStatus("Completed");
        }
    }
}
