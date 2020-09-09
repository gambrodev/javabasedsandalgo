package com.gambrodev.ds.array;

public class TwoDimensionArrayMain {

    public static void main(String[] args) {

        System.out.println("Creating a single dimension array of 10 capacity...");
        TwoDimensionArray tda = new TwoDimensionArray(3, 5);
        System.out.println("Printing the array");
        tda.traverse();
        System.out.println();
        System.out.println("----- INSERTING -----");
        tda.insert(0, 0, 1);
        tda.insert(0, 1, 2);
        tda.insert(0, 2, 3);
        tda.insert(0, 3, 4);
        tda.insert(0, 4, 5);

        tda.insert(1, 0, 6);
        tda.insert(1, 1, 7);
        tda.insert(1, 2, 8);
        tda.insert(1, 3, 9);
        tda.insert(1, 4, 10);

        tda.insert(2, 0, 11);
        tda.insert(2, 1, 12);
        tda.insert(2, 2, 13);
        tda.insert(2, 3, 14);
        tda.insert(2, 4, 15);

        //index already occupied
        tda.insert(0, 2, 10);
        //array index out of bound
        tda.insert(3, 4, 666);
        System.out.println("----- PRINT CELL -----");
        tda.accessCell(0, 2);
        tda.accessCell(12, 4);
        System.out.println("----- SEARCH -----");
        tda.searchValue(15);
        tda.searchValue(666);
        System.out.println("----- DELETE -----");
        tda.delete(1, 3);
        tda.delete(10, 50);
    }
}
