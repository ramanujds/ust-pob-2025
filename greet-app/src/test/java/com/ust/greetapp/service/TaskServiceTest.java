package com.ust.greetapp.service;

import com.ust.greetapp.model.Task;
import com.ust.greetapp.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    TaskRepository repository;

    @InjectMocks
    TaskService service;

    // public Task createTask(Task task)

    @Test
    void testCreateTask(){
        Task task = new Task(1,"java","Learn Java",true, LocalDate.now(),5);
        Mockito.when(repository.save(task)).thenReturn(task);
        assertEquals(task,service.createTask(task));
        Mockito.verify(repository,Mockito.times(1)).save(task);
    }


}