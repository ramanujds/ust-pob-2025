package com.ust.todoapp.service;

import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TodoRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TodoServiceImplTest {

    @Mock
    TodoRepositoryImpl todoRepo;

    @InjectMocks
    TodoServiceImpl todoService;



    @Test
    void createTodo() {

        Task task = new Task(1, "Learn Testing", "Learn Unit Testing with JUnit", "Completed");

        Mockito.when(todoRepo.saveTask(task)).thenReturn(task);
        todoService.createTodo(task);

        Mockito.verify(todoRepo, Mockito.times(1)).saveTask(task);

    }

    @Test
    void deleteTodo() {
        int id = 1;
        Mockito.doNothing().when(todoRepo).deleteTask(id);
        todoService.deleteTodo(id);
        Mockito.verify(todoRepo,Mockito.times(1)).deleteTask(id);

    }

    @Test
    void completeTodo() {
        int id =1;

        Mockito.doNothing().when(todoRepo).markAsCompleted(id);
        todoService.completeTodo(id);

        Mockito.verify(todoRepo, Mockito.times(1)).markAsCompleted(id);
    }
}