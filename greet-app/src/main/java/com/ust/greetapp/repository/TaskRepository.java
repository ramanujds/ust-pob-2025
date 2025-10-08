package com.ust.greetapp.repository;

import com.ust.greetapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRepository extends JpaRepository<Task, Integer> {

    Task findByTitle(String title);

}
