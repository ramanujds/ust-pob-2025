package com.ust.greetapp.repository;

import com.ust.greetapp.model.Task;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> taskList = new ArrayList<>();


    public Task saveTask(Task task) {
        taskList.add(task);
        return task;
    }

    public Task getTask(String title) {
        return taskList.stream()
                .filter(t -> t.title().equals(title))
                .findFirst().get();
    }

    public List<Task> getAllTasks(){
        return taskList;
    }

    public void deleteTask(String title){
        taskList.removeIf(t -> t.title().equals(title));
    }


}
