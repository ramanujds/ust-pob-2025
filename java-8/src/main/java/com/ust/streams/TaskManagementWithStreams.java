package com.ust.streams;

import com.ust.model.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;

public class TaskManagementWithStreams {

    List<Task> todos = new ArrayList<>();

    public void addTodos() {
        Task t1 = new Task(1, "Learn Java Collections", true, 5);
        Task t2 = new Task(2, "Learn Applet", false, 1);
        Task t3 = new Task(3, "Learn Lambda Expression", true, 5);
        Task t4 = new Task(4, "Learn Multi Threading", false, 4);
        Task t5 = new Task(5, "File Handling", false, 3);

        todos.addAll(List.of(t1, t2, t3, t4, t5));

    }

    List<Task> sortByPriority(){
        return todos.stream().sorted(Comparator.comparing(Task::getPriority)).toList();
    }

    public Task findById(int id) {
        return todos.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public List<Task> getPendingTask() {
        return todos.stream().filter(t -> !t.isCompleted()).toList();
    }

    public List<Task> getCompletedTask() {
        return todos.stream().filter(t -> t.isCompleted()).toList();
    }

    // priority >= 4
    public List<Task> getImportantPendingTasks() {
        return todos.stream().filter(t -> !t.isCompleted()).filter(t -> t.getPriority() >= 4).toList();
    }

    public List<Task> completeAllThePendingTask() {
        return todos.stream().filter(t -> !t.isCompleted()).peek(t -> t.setCompleted(true)).toList();
    }

    public Map<String, Boolean> getNameAndStatus() {
        return todos.stream().collect(
                Collectors.toMap(t -> t.getTitle(), t -> t.isCompleted())
        );
    }

    public static void main(String[] args) {
        TaskManagementWithStreams taskManagement = new TaskManagementWithStreams();

        taskManagement.addTodos();

        System.out.println("Pending Tasks : ");
        taskManagement.getPendingTask().forEach(System.out::println);

        System.out.println("Completed Tasks : ");
        taskManagement.getCompletedTask().forEach(t -> System.out.println(t));

        System.out.println("Important Pending Tasks : ");
        taskManagement.getImportantPendingTasks().forEach(t -> System.out.println(t));

//        System.out.println("Completed Tasks ");
//        printTasks(taskManagement.completeAllThePendingTask());

        var tasksWithNames = taskManagement.getNameAndStatus();

        tasksWithNames.forEach((t, s) -> System.out.println(t + " : " + (s ? "Completed" : "Pending")));

        System.out.println("Sorted Tasks by Priority: ");
        taskManagement.sortByPriority().forEach(t -> System.out.println(t));


    }


}
