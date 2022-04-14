package com.company;
public class Pen {
    private String penName;
    private int id;

    Pen(String newPenName) {
        this.penName = newPenName;
        System.out.println("The New Pen Name is = " + this.penName);
    }

    Pen(int newId) {
        this.id = newId;
        System.out.println("The New ID is = " + this.id);
    }
}
