package io.github.marcustalbots.projecteuler.problem_1;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void sumOfAllMultiplesOf3Or5Below1000() {
        assertEquals(233168, Problem1.sumOfAllMultiplesOf3Or5Below1000());
    }

    @Test
    void sumOfAllMultiplesOf3Or5Below1000Efficiently() {
        assertEquals(233168, Problem1.sumOfAllMultiplesOf3Or5Below1000Efficiently());
    }

    @Test
    void sumDivisibleBy() {
        for (var index = 1; index < 16; ++index) {
            int finalIndex = index;
            var sum = IntStream.rangeClosed(1, 999).filter(num -> num % finalIndex == 0).sum();
            assertEquals(sum, Problem1.sumDivisibleBy(index));
        }
    }
}