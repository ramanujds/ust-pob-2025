package com.ust.greetapp.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.ust.greetapp.model.Task;
import com.ust.greetapp.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(TaskController.class)
@ExtendWith(SpringExtension.class)
class TaskControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    TaskService service;

    private final static String baseUrl="/api/v1/tasks";


    @Test
    void getTask()throws Exception {
        int id = 1;
        Task task = new Task(id,"java","Learn Java",true, LocalDate.now(),5);
        Mockito.when(service.getTaskById(id)).thenReturn(task);
        mockMvc.perform(get(baseUrl+"/"+id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("java"))
                .andReturn();
    }

    @Test
    void saveTask() throws Exception {
        Task task = new Task(1,"java","Learn Java",true, LocalDate.now(),5);
        Mockito.when(service.createTask(task)).thenReturn(task);
        mockMvc.perform(post(baseUrl)
                        .content(mapToJson(task))
                        .contentType("application/json"))
                .andExpect(status().isCreated())
                .andReturn();



    }

    public String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper mapper = JsonMapper.builder()
                .findAndAddModules()
                .build();
        return mapper.writeValueAsString(object);
    }

}