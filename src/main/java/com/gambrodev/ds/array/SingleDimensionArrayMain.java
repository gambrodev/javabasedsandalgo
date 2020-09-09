package com.gambrodev.ds.array;

public class SingleDimensionArrayMain {

    public static void main(String[] args) {

        System.out.println("Creating a single dimension array of 10 capacity...");
        SingleDimensionArray sda = new SingleDimensionArray(10);
        System.out.println("Printing the array");
        sda.traverse();
        System.out.println();
        System.out.println("----- INSERTING -----");
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);
        sda.insert(3, 40);
        sda.insert(4, 50);
        sda.insert(5, 60);
        sda.insert(6, 70);
        sda.insert(7, 80);
        sda.insert(8, 90);
        sda.insert(9, 100);
        //index already occupied
        sda.insert(6, 999);
        //array index out of bound
        sda.insert(12, 666);
        System.out.println("----- PRINT CELL -----");
        sda.accessCell(0);
        sda.accessCell(12);
        System.out.println("----- SEARCH -----");
        sda.searchValue(30);
        sda.searchValue(666);
        System.out.println("----- DELETE -----");
        sda.delete(6);
        sda.delete(999);
    }

}
