package com.gambrodev.ds.array;

public class TwoDimensionArray {

    // DECLARATION. O(1)
    // a reference variable is created in memory
    // but the memory is not allocated for the array yet
    private int[][] arr = null;

    /**
     * Creates an int[] of the given size.
     *
     * <p>Time Complexity O(mn)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param row      row to insert the value in
     * @param col      column to insert the value in
     */
    public TwoDimensionArray(int row, int col) {
        // INSTANTIATION O(1)
        // memory is allocated for the length of the array.
        // initial cell memory address is stored in the reference variable
        arr = new int[row][col];

        // inizialization O(mn) row*col
        // Not really needed just for verbose purpose
        // Every cell is given default blank value
        // in this case Integer.MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i].length; k++) {
                arr[i][k] = Integer.MIN_VALUE;
            }
        }
    }

    /**
     * loops trought the array and prints the value of every cell
     *
     * <p>Time Complexity O(mn)</p>
     * <p>Space Complexity O(1)</p>
     */
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for(int k = 0; k < arr[i].length; k++) {
                    System.out.print(arr[i][k] + " ");
                }
                System.out.println(System.lineSeparator());
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
     * @param row      row to insert the value in
     * @param col      column to insert the value in
     * @param valueToInsert the value
     */
    public void insert(int row, int col, int valueToInsert) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("Inserted: " + valueToInsert + " at row: " + row + " column: " + col);
            } else {
                System.out.println("this cell [" + row + "][" + col + "] is already occupied by another value (" + arr[row][col] + ")");
            }
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index [" + row + "][" + col + "] to access the array");
        }
    }

    /**
     * Print the value of the cell at the given index
     * <p>Time Complexity O(1)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param row      row to insert the value in
     * @param col      column to insert the value in
     */
    public void accessCell(int row, int col) {
        try {
            System.out.println(arr[row][col]);
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location [" + row + "][" + col + "] to access the array");
        }
    }

    /**
     * Search for the given value in the array
     * <p>Time Complexity O(mn)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param value
     * @return
     */
    public void searchValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr[i].length; k++) {
                if(arr[i][k] == value) {
                    System.out.println("value " + value + " found at row " + i + " col " +k);
                    return;
                }
            }
        }
        System.out.println("value " + value + " is not present in the array");
    }

    /**
     * Assign blank value (Integer.MIN_VALUE) at the given index
     * <p>Time Complexity O(1)</p>
     * <p>Space Complexity O(1)</p>
     *
     * @param row      row to insert the value in
     * @param col      column to insert the value in
     */
    public void delete(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
        }
        // just for example purpose. don't do this
        // in real coding
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid location [" + row + "][" + col + "] to access the array");
        }
    }

}
