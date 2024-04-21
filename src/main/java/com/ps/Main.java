package com.ps;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Library library = new Library();
    public static void main(String[] args){
        homeScreen();
    }
    public static void homeScreen(){
        int option;
        do {
            System.out.println("Welcome to the Neighborhood Library System!");
            System.out.println("Please select from the following list of options:");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit System");
            System.out.print("Enter 1, 2, or 3: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    library.showAvailableBooks();
                    checkOutScreen();
                    break;
                case 2:
                    library.showCheckedOutBooks();
                    break;
                case 3:
                    System.out.println("Thank you for visiting! Have a good day!");
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.");
                    break;
            }
        } while (option != 3);
    }

    public static void checkOutScreen(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        String name;
        int id;
        do {
            System.out.println("Enter C to check out a book by ID or X to exit to home screen: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "C":
                    System.out.println("Enter your name: ");
                    name = scanner.next();
                    System.out.println("Enter ID of book you want to check out: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    library.getBook(id, name);
                    break;
                case "X":
                    homeScreen();
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again.");
            }
        } while (!choice.equals("X"));
    }
}
