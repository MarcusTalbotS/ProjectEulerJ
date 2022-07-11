package io.github.marcustalbots.projecteuler.problem_1;

public class Problem1 {

    public static void main(String[] args) {
        System.out.printf("The sum of all multiples of 3 or 5 below 1000, " +
                "using the naive approach is %d.%n", sumOfAllMultiplesOf3Or5Below1000());
        System.out.printf("The sum of all multiples of 3 or 5 below 1000, " +
                "using the efficient approach is %d.%n", sumOfAllMultiplesOf3Or5Below1000Efficiently());
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

    /**
     * Calculates the sum of all numbers that are either a multiple of three
     * or five, and are below 1000, using the identity found here:
     * <a href="https://math.stackexchange.com/questions/9259/find-the-sum-of-all-the-multiples-of-3-or-5-below-1000">Math StackExchange</a>.
     * @return The sum of all numbers that adhere to the aforementioned constraints.
     */
    static long sumOfAllMultiplesOf3Or5Below1000Efficiently() {
        return sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
    }

    /**
     * Calculates the sum of all numbers below 1000 that are divisible by the divisor. Uses the identity found here:
     * <a href="https://math.stackexchange.com/questions/9259/find-the-sum-of-all-the-multiples-of-3-or-5-below-1000">Math StackExchange</a>
     * @param divisor The divisor used to determine the sum.
     * @return The sum of the numbers that adhere to the aforementioned constraints.
     */
    static long sumDivisibleBy(final long divisor) {
        var divisionResult = 999 / divisor;
        return divisor * (divisionResult * (divisionResult + 1)) / 2;
    }

}
