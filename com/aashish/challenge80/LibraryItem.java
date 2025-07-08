// Start with a base class LibraryItem that includes
// common attributes like itemID, title, and author, and methods like checkout() and returnItem().
// Create subclasses such as Book, Magazine, and DVD, each inheriting from LibraryItem.
// Add Unique Attributes to each subclass, like ISBN for Book, issueNumber for Magazine, and duration for DVD


package com.aashish.challenge80;

public class LibraryItem {

    private String ItemId;

    private String title;

    private String author;

    //Method
    public void checkout(){
        System.out.println("checkout");
    }

    public void returnItem() {
        System.out.println("Returning the Items");
    }
}
