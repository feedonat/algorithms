package com.horiaconstantin.numericseries.fibonacci;

public class FibonacciRecursive implements Fibonacci {

    @Override
    public long solution(int n) {
        if (n <= 1) {
            return n;
        } else if (n == 2) {
            return 1;
        }
        return solution(n - 1) + solution(n - 2);
    }
}
