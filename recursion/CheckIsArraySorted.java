package recursion;

public class CheckIsArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 4, 5, 5, 5, 6, 7, 7, 8, 10}; // Sorted
        int[] arr2 = {1, 1, 3, 4, 5, 7, 5, 6, 7, 7, 8, 10}; // Not Sorted

        System.out.println(recursion(arr1));
        System.out.println(recursion(arr2));
    }

    static boolean recursion(int[] arr) {
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int position) {
        if (position == arr.length - 1)
            return true;

        if (arr[position] > arr[position + 1])
            return false;

        return helper(arr, position + 1);
    }
}
