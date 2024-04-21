package com.ps;

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
}
