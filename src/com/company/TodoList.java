package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    ArrayList<Todo> todos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    void viewAllTodo() {
        System.out.println("View all Todo items");
        for (Todo todo : todos) {
            System.out.println("description: " + todo.description + ", Todo Id: " + todo.Id);
        }
    }

    void addTodo() {

        System.out.println("Add Todo");
        System.out.println("provide a Todo item description");
        String description = scanner.nextLine();

        System.out.println("provide an Id ");
        int Id = intScanner.nextInt();

        //use constructor to set the value of our objects when they are created
        Todo todo = new Todo(description, Id);

        //add todos to array list
        this.todos.add(todo);

    }

    void viewSingleTodo() {
        System.out.println("viewing Todo by Id");
        System.out.println("enter Id of Todo:");

        int Id = intScanner.nextInt();
        Todo todo = todos.get(Id);
        System.out.println(todo.description + todo.Id);
    }

    void markTodoAsDone() {

        System.out.println("Mark Todo as done");
        System.out.println("Enter an Id to find the Todo");

        int Id = intScanner.nextInt();
        for (Todo todo : todos) {
            if (Id !=0);
                System.out.println(Id + " - done");
        }
    }

    void deleteTodo() {
        System.out.println("Delete Todo");
        System.out.println("Enter index of Todo to remove");

        int index = intScanner.nextInt();
        todos.remove(index);
        System.out.println("deleted successfully");
    }
}


