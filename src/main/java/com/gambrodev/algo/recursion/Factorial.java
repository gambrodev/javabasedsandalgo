package com.gambrodev.algo.recursion;

import java.util.stream.LongStream;

/**
 *  the factorial of a positive integer n
 *  is the product of all positive integers less than or equal to n
 */
public class Factorial {

    //JAVA 7 IMPLEMENTATION
    static long factorialJava7(long n) {
        if(n > 20) throw new RuntimeException("NOT GONNA TRY TO BLOW UP HERE...");
        if(n == 0) return 1;
        return n * factorialJava7((n -1));
    }

    //JAVA 8 IMPLEMENTATION
    static long factorialJava8( long n ) {
        if(n > 20) throw new RuntimeException("NOT GONNA TRY TO BLOW UP HERE...");
        return LongStream.rangeClosed( 1, n )
                .reduce(1, ( long accumulator, long current ) -> accumulator * current);
    }

    public static void main(String[] args) {
        System.out.println("java 7 implementation: " + factorialJava7(7)); //5040
        System.out.println("java 8 implementation: " + factorialJava8(7)); //5040
    }

}
