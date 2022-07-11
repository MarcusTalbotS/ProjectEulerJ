package io.github.marcustalbots.projecteuler.problem_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void sumOfEvenFibonacciNumbersWithTermsLowerThan4Million() {
        assertEquals(4613732, Problem2.sumOfEvenFibonacciNumbersWithTermsLowerThan4Million(1, 1));
    }
}