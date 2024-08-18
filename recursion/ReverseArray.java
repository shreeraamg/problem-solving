package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 7, 6, 2, 1 };

        System.out.println(Arrays.toString(arr1));
        reverseArray(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));
        reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void reverseArray(int[] arr) {
        helper(arr, 0);
    }

    static void helper(int[] arr, int i) {
        int j = arr.length - i - 1;

        if (i >= j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        helper(arr, i + 1);
    }
}
