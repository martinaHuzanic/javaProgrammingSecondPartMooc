/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Command: ");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "stop":
                    shouldLoop = false;
                    break;
                case "add":

                    System.out.print("To add: ");
                    String wordToAdd = scanner.nextLine();
                    //adds word to list
                    todolist.add(wordToAdd);
                    break;
                    
                case "list":

                    todolist.print();
                    break;
                    
                case "remove":
                    System.out.println("Which one is removed?");

                    int removeNumber = Integer.parseInt(scanner.nextLine());

                    todolist.remove(removeNumber);
                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}
