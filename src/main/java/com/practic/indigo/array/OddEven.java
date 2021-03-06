/*Given a list of numbers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Example:
odd_or_even([0])          ==  "even"
odd_or_even([0, 1, 4])    ==  "odd"
odd_or_even([0, -1, -5])  ==  "even"*/

package com.practic.indigo.array;

import java.util.stream.IntStream;

public class OddEven {
    public String oddOrEven (int[] array) {
        int sum = IntStream.of(array).sum();

        return (sum % 2 == 0) ? "even" : "odd";
    }
}
