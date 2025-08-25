package model;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

    private int id;
    private String title;
    private LocalDate dateAdded;
    private int priority;

    public Task(){}

    public Task(int id, String title, LocalDate dateAdded, int priority) {
        this.id = id;
        this.title = title;
        this.dateAdded = dateAdded;
        this.priority = priority;
    }

    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateAdded=" + dateAdded +
                ", priority=" + priority +
                '}';
    }

    public int compareTo(Task t) {
        return this.title.compareTo(t.title);
    }
}
