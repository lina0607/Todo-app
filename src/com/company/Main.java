package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList todo = new TodoList();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";


        do {
            System.out.println("Please choose action to perform: ");
            System.out.println("""
                    1. add Todo
                    2. view all Todo
                    3. view single Todo (int Id)
                    4. mark Todo as done
                    5. delete Todo
                    Enter quit to exit application
                    """);

            userInput = scanner.nextLine();

            switch (userInput) {

                case "1":
                    todo.addTodo();
                    break;
                case "2":
                    todo.viewAllTodo();
                    break;
                case "3":
                    todo.viewSingleTodo();
                    break;
                case "4":
                    todo.markTodoAsDone();
                    break;
                case "5":
                    todo.deleteTodo();
                    break;
                case "quit" :
                    System.out.println("Exiting app!");
                    break;
                default:
                    System.out.println("please provide a valid input");
            }
        } while (!userInput.equalsIgnoreCase("quit"));

    }
}
