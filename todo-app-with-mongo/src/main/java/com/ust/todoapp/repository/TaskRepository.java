package com.ust.todoapp.repository;

import com.ust.todoapp.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {

    Task findByTitle(String title);
    List<Task> findByCompleted(boolean completed);

    @Query("from Task where dueDate<now() and completed=false ")
    List<Task> findOverdueTasks();

    @Query("from Task where month(dueDate)=:month and completed=:status")
    List<Task> findWithMonthAndStaus(int month, boolean status);
}
