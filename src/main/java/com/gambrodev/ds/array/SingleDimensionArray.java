package com.gambrodev.ds.array;

public class SingleDimensionArray {

    // DECLARATION. O(1)
    // a reference variable is created in memory
    // but the memory is not allocated for the array yet
    private int[] arr = null;

    /**
     * Creates an int[] of the given size.
     *
     * <p>Time Complexity O(n)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param size the size of the desired array
     */
    public SingleDimensionArray(int size) {
        // INSTANTIATION O(1)
        // memory is allocated for the length of the array.
        // initial cell memory address is stored in the reference variable
        arr = new int[size];

        // inizialization O(n)
        // Not really needed just for verbose purpose
        // Every cell is given default blank value
        // in this case Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /**
     * loops trought the array and prints the value of every cell
     *
     * <p>Time Complexity O(n)</p>
     * <p>Space Complexity O(1)</p>
     */
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
        // in case the array doesn't exist
        // just for example purpose. don't do this
        // in real coding
        catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    /**
     * Insert the value at given index
     * <p>Time Complexity O(1)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param location      index to insert the value in
     * @param valueToInsert the value
     */
    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Inserted: " + valueToInsert + " at location: " + location);
            } else {
                System.out.println("this cell (" + location + ") is already occupied by another value (" + arr[location] + ")");
            }
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index (" + location + ") to access the array");
        }
    }

    /**
     * Print the value of the cell at the given index
     * <p>Time Complexity O(1)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param location index of the cell to print
     */
    public void accessCell(int location) {
        try {
            System.out.println(arr[location]);
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location (" + location + ") to access the array");
        }
    }

    /**
     * Search for the given value in the array
     * <p>Time Complexity O(n)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param value
     * @return
     */
    public void searchValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("value " + value + " found at index " + i);
                return;
            }
        }
        System.out.println("value " + value + " is not present in the array");
    }

    /**
     * Assign blank value (Integer.MIN_VALUE) at the given index
     * <p>Time Complexity O(1)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param location
     */
    public void delete(int location) {
        try {
            arr[location] = Integer.MIN_VALUE;
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location (" + location + ") to access the array");
        }
    }
}
