package io.github.marcustalbots.projecteuler.problem_1;

public class Problem1 {

    public static void main(String[] args) {
        System.out.printf("The sum of all multiples of 3 or 5 below 1000, " +
                "the naive approach is %d.%n", sumOfAllMultiplesOf3Or5Below1000());
    }

    /**
     * Calculates the sum of all numbers that are either a multiple of three
     * or five, and are below 1000.
     * @return The sum of all numbers that adhere to the aforementioned constraints.
     */
    static long sumOfAllMultiplesOf3Or5Below1000() {
        var sum = 0;
        for (var index = 3; index < 1000; ++index) {
            if (index % 3 == 0 || index % 5 == 0)
                sum += index;
        }
        return sum;
    }

}
