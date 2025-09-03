package com.ust.streams;

import com.ust.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class TaskManagementWithStreams {

    List<Task> todos = new ArrayList<>();

    public void addTodos(){
        Task t1 = new Task(1,"Learn Java Collections",true,5);
        Task t2 = new Task(2, "Learn Applet",false,1);
        Task t3 = new Task(3,"Learn Lambda Expression",true,5);
        Task t4 = new Task(4,"Learn Multi Threading",false,4);
        Task t5 = new Task(5,"File Handling",false,3);

        todos.addAll(List.of(t1,t2,t3,t4,t5));

    }

    public Task findById(int id){
           return todos.stream().filter(t->t.getId()==id).findFirst().get();
    }

    public List<Task> getPendingTask(){
        return todos.stream().filter(t->!t.isCompleted()).toList();
    }

    public List<Task> getCompletedTask(){
        return todos.stream().filter(t->t.isCompleted()).toList();
    }

    // priority >= 4
    public List<Task> getImportantPendingTasks(){
        return todos.stream().filter(t->!t.isCompleted()).filter(t->t.getPriority()>=4).toList();
    }

    public List<Task> completeAllThePendingTask(){

    }

    public static void main(String[] args) {
        TaskManagementWithStreams taskManagement = new TaskManagementWithStreams();

        taskManagement.addTodos();

        System.out.println("Pending Tasks : ");
        printTasks(taskManagement.getPendingTask());

        System.out.println("Completed Tasks : ");
        printTasks(taskManagement.getCompletedTask());

        System.out.println("Important Pending Tasks : ");
        printTasks(taskManagement.getImportantPendingTasks());

    }

   static void printTasks(List<Task> tasks){
        for (Task t:tasks){
            System.out.println(t);
        }
    }

}
