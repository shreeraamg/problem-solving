package recursion;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array
import java.util.Arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {14, 7, 18, 5, 12, 9, 11};
        System.out.println(minumum(arr));
    }

    static int minumum(int[] arr) {
        return helper(arr[0], arr);
    }

    static int helper(int n, int[] arr) {
        if (arr.length == 1) {
            return Math.min(arr[0], n);
        }

        return Math.min(n, helper(arr[arr.length - 1], Arrays.copyOf(arr, arr.length - 1)));
    }
}
