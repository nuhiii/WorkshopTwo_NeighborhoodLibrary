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
        collection.add(new Book(1, "9780061120084", "To Kill a Mockingbird"));
        collection.add(new Book(2, "9780143120537", "1984"));
        collection.add(new Book(3, "9780142407332", "The Lightning Thief"));
        collection.add(new Book(4, "9780439708180", "Harry Potter and the Sorcerer's Stone"));
        collection.add(new Book(5, "9780439023528", "The Hunger Games"));
        collection.add(new Book(6, "9780812550702", "Ender's Game"));
        collection.add(new Book(7, "9780553293357", "Dune"));
        collection.add(new Book(8, "9780765326355", "The Name of the Wind"));
        collection.add(new Book(9, "9780451457998", "Necromancer"));
        collection.add(new Book(10, "9780441172719", "Foundation"));
        collection.add(new Book(11, "9780345350490", "Fahrenheit 451"));
        collection.add(new Book(12, "9780765321725", "The Martian"));
        collection.add(new Book(13, "9780553382563", "The Hitchhiker's Guide to the Galaxy"));
        collection.add(new Book(14, "9780553573404", "A Game of Thrones"));
        collection.add(new Book(15, "9780765331724", "Ready Player One"));
        collection.add(new Book(16, "9780765311788", "The Alchemist"));
        collection.add(new Book(17, "9780140283334", "The Catcher in the Rye"));
        collection.add(new Book(18, "9780143039969", "The Kite Runner"));
        collection.add(new Book(19, "9780140187398", "One Hundred Years of Solitude"));
        collection.add(new Book(20, "9780679745587", "Beloved"));
    }
}
