package arrays;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/distribute-candies/description/
class DistributeCandies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[] { 1, 1, 2, 2, 3, 3 }));
        System.out.println(distributeCandies(new int[] { 1, 1, 2, 3 }));
        System.out.println(distributeCandies(new int[] { 6, 6, 6, 6 }));
    }

    public static int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}