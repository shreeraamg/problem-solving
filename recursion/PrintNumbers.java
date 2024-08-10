package recursion;

// Print from n till 1.
public class PrintNumbers {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        if (n == 0)
            return;

        print(n - 1);
        System.out.println(n);
    }

    static void printInReverseOrder(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        print(n - 1);
    }
}