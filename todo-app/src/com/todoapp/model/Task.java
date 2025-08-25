package com.todoapp.model;

public class Task {

    private int id;
    private String title;
    private String details;
    private String status;
    private int priority;

    public Task(int id, String title, String details, String status) {
        this.id = id;
        this.title = title;
        this.details = details;
        this.status = status;
    }

    public Task(){ }

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
