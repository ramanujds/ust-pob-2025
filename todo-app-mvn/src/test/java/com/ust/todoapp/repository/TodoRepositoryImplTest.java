package com.ust.todoapp.repository;

import com.ust.todoapp.exception.InvalidTodoException;
import com.ust.todoapp.model.Task;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoRepositoryImplTest {

    TodoRepositoryImpl todoRepo;

    @BeforeEach
    void setUp() {
        todoRepo = new TodoRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
        todoRepo = null;
    }

    @Nested
    class TestSave {
        @Test
        void saveTask() {

            Task task = new Task(1, "Learn Testing", "Learn Unit Testing with JUnit", "Completed");
            todoRepo.saveTask(task);
            assertNotNull(todoRepo.getTask(task.getId()));

        }

        @Test
        void saveTaskForException() {

            Task task1 = new Task(0, "Learn Testing", "Learn Unit Testing with JUnit", "Completed");
            Task task2 = new Task(1, "", "Learn Unit Testing with JUnit", "Completed");
            assertThrows(InvalidTodoException.class, () -> todoRepo.saveTask(task1));
            assertThrows(InvalidTodoException.class, () -> todoRepo.saveTask(task2));
        }
    }

    @Test
    void getTask() {
    }

    @Test
    void deleteTask() {
    }

    @Test
    void getAllTasks() {
    }

    @Test
    void markAsCompleted() {
    }
}