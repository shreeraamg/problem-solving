package arrays;

// https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
public class CheckIsArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 4, 5, 5, 5, 6, 7, 7, 8, 10}; // Sorted
        int[] arr2 = {1, 1, 3, 4, 5, 7, 5, 6, 7, 7, 8, 10}; // Not Sorted

        System.out.println(checkIsArraySorted(arr1));
        System.out.println(checkIsArraySorted(arr2));
    }

    static boolean checkIsArraySorted(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }
}
