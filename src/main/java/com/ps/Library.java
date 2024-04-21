package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // dynamic array to store books
    private List<Book> collection;

    // Constructor
    public Library(){
        this.collection = new ArrayList<>();
        addToCollection();
    }

    // method to add books to the library
    private void addToCollection() {
    }
}
