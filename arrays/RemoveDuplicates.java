package arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Two Pointer Approach
    public static void removeDuplicates(int[] arr) {
        int i = 0, j = i + 1;

        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
            j++;
        }
    }
}