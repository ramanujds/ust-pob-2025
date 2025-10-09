package com.ust.greetapp.repository;

import com.ust.greetapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByTitle(String title);

    List<Task> findByCompleted(boolean completed);

    @Query("from Task where dueDate<now() and completed=false ")
    List<Task> findOverdueTasks();

}
