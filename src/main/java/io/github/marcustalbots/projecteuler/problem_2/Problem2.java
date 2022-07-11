package io.github.marcustalbots.projecteuler.problem_2;

public class Problem2 {

    public static void main(String[] args) {
        System.out.printf("The sum of the even terms in the Fibonacci sequence, where the terms are below 4_000_000" +
                "is %d.%n", sumOfEvenFibonacciNumbersWithTermsLowerThan4Million(1, 1));
    }

    /**
     * Finds the sum of the even terms of the Fibonacci sequence, that are below 4 million. We achieve this
     * by recursively evaluating whether each next is even. To determine whether a term is even, we use the bitwise &
     * operator, in order to compare the last bit of the long. If the last bit is set, then the term must be odd.
     * @param n1 First term
     * @param n2 Second term
     * @return The sum of the numbers that adhere to the aforementioned constraints.
     */
    static long sumOfEvenFibonacciNumbersWithTermsLowerThan4Million(final long n1, final long n2) {
        if (n1 + n2 > 4_000_000)
            return 0;
        return (((n1 + n2) & 1) == 0)
                ? n1 + n2 + sumOfEvenFibonacciNumbersWithTermsLowerThan4Million(n2, n1 + n2)
                : sumOfEvenFibonacciNumbersWithTermsLowerThan4Million(n2, n1 + n2);
    }

}
