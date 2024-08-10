package recursion;

// Factorial of a given number.
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOf(6));
    }

    static int factorialOf(int n) {
        if (n == 2)
            return n;

        return n * factorialOf(n - 1);
    }
}
