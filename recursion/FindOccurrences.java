package recursion;

import java.util.ArrayList;
import java.util.List;

// Find all the occurences of the target element
public class FindOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 7, 9, 4, 14};
        System.out.println(findOccurrences(arr, 4));
    }

    static List<Integer> findOccurrences(int[] arr, int target) {
        return helper(arr, target, 0);
    }

    static List<Integer> helper(int[] arr, int target, int i) {
        if (i == arr.length - 1)
            return arr[i] == target ? List.of(i) : new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        if (arr[i] == target) list.add(i);
        list.addAll(helper(arr, target, i + 1));

        return list;
    }
}
