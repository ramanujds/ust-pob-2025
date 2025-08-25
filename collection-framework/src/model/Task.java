package model;

import java.time.LocalDate;
import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
