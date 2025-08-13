package com.todoapp.repository;

import com.todoapp.model.Task;

public class TodoRepositoryImpl implements TodoRepository {

    private Task[] todos = new Task[3];
    int current=0;


    public void saveTask(Task task) {
       if (current==todos.length){
           System.out.println("List Full Can't Add more Task");
           return;
       }
        todos[current] = task;
        current++;
    }

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
