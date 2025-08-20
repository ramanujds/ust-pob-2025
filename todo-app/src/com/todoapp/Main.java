package com.todoapp;


import com.todoapp.exception.InvalidTodoException;
import com.todoapp.exception.TodoNotFoundException;
import com.todoapp.service.TodoService;
import com.todoapp.service.TodoServiceImpl;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input ID, Title, Details and Status");
        try {
            int id = scanner.nextInt();
            String title = scanner.next() + scanner.nextLine();
            String description = scanner.next() + scanner.nextLine();
            String status = scanner.next() + scanner.nextLine();


            todoService.createTodo(id, title, description, status);
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