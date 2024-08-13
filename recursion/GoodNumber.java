package recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/count-good-numbers/description/
// This problem just checks whether a number is good or not. Doesn't counts.
public class GoodNumber {
    public static void main(String[] args) {
        System.out.println(isGoodNumber(2582)); // True
        System.out.println(isGoodNumber(3245)); // False
    }

    static boolean isGoodNumber(int num) {
        return helper(num, 1);
    }

    static boolean helper(int num, int i) {
        if (num == 0) return true;

        List<Integer> primeNumbers = Arrays.asList(2, 3, 5, 7);
        int n = num % 10;

        if (i % 2 == 0) {
            if (n % 2 != 0) return false;
        } else {
            if (!primeNumbers.contains(n)) return false;
        }

        return helper(num / 10, i + 1);
    }
}