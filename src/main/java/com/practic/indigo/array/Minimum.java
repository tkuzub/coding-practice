/*Task
Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once
 (ignore duplicates).

Notes:
Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
Input >> Output Examples
minValue ({1, 3, 1})  ==> return (13)
Explanation:
(13) is the minimum number could be formed from {1, 3, 1} , Without duplications

minValue({5, 7, 5, 9, 7})  ==> return (579)
Explanation:
(579) is the minimum number could be formed from {5, 7, 5, 9, 7} , Without duplications

minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
Explanation:
(134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications*/

package com.practic.indigo.array;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Minimum {
    public int minValue(int[] values){
        String string = IntStream.of(values).
                sorted().
                distinct().
                mapToObj(Integer::toString).
                collect(Collectors.joining());
        return Integer.parseInt(string);
    }
}
