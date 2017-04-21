package com.rockie.leetcode.fibonacci;

/**
 * Created by rockie on 2017/4/14.
 */
public class Fibonacci {

    public int fibonacciNaive(int n) {
        if(n <= 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fibonacciNaive(n-1) + fibonacciNaive(n-2);
    }

    public int fibonacci(int n) {
        int result = 0;
        if(n <= 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        int fibMinusOne = 0;
        int fibMinusTwo = 1;

        for(int i = 2; i<=n; i++) {
            result = fibMinusOne + fibMinusTwo;
            fibMinusOne = result;
            fibMinusTwo = fibMinusOne;
        }

        return result;
    }
}
