package arrays;

// https://www.geeksforgeeks.org/find-second-largest-element-array/
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {14, 7, 8, 16, 19, 5, 4, 15};

        int largest = arr[0];
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}