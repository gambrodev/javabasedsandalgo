package com.gambrodev.algo.recursion;

/**
 * Finds which number is present at a given position in a fibonacci sequence
 */
public class Fibonacci {

    // 0,1,1,2,3,5,8,13,21
    static long fibonacci(long n) {
        if(n < 1) {
            throw new RuntimeException("can't do with numbers less than 1");
        }
        if (n == 1 || n == 2) {
            return n -1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

}
