package com.ps;

public class Book {
    // class member variables
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // class methods to check out / check in
    public void checkOut(String name){
        if (!isCheckedOut){
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("The book, " + title + ", has been checked out to " + name + ".");
        }
        else{
            System.out.println("Sorry, but the book, " + title + ", is already checked out.");
        }
    }

    public void checkIn(){
        if (isCheckedOut){
            isCheckedOut = false;
            checkedOutTo = "";
            System.out.println("The book, " + title + ", has successfully been checked in.");
        }
        else{
            System.out.println("The book, " + title + ", is NOT checked out.");
        }
    }
}
