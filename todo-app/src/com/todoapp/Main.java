package com.todoapp;


import com.todoapp.service.TodoService;
import com.todoapp.service.TodoServiceImpl;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        TodoService todoService = new TodoServiceImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input ID, Title, Details and Status");
        int id = scanner.nextInt();
        String title = scanner.next() + scanner.nextLine();
        System.out.println("ID : "+id);
        System.out.println("Title : "+title);


    }
}