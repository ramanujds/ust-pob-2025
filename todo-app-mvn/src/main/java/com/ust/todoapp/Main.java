package com.ust.todoapp;




import com.ust.todoapp.exception.InvalidTodoException;
import com.ust.todoapp.exception.TodoNotFoundException;
import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TodoRepositoryImpl;
import com.ust.todoapp.service.TodoService;
import com.ust.todoapp.service.TodoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TodoRepositoryImpl todoRepository = new TodoRepositoryImpl();
        TodoService todoService = new TodoServiceImpl(todoRepository);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input ID, Title, Details and Status");
        try {
            int id = scanner.nextInt();
            String title = scanner.next() + scanner.nextLine();
            String description = scanner.next() + scanner.nextLine();
            String status = scanner.next() + scanner.nextLine();

            Task task = new Task(id, title, description, status);
            todoService.createTodo(task);
            System.out.println("Todo Created");
        }

        catch (TodoNotFoundException e) {

        }
        catch (InvalidTodoException ex) {
            System.out.println(ex.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Invalid Input : "+e.getMessage());

        } catch (Exception e) {
            //
        }


    }
}