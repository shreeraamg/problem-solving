package recursion;

public class CountZeros {
    public static void main(String[] args) {
        int result = countZeros(30402);
        System.out.println(result);
    }

    static int countZeros(int n) {
        return helperFunction(n, 0);
    }

    static int helperFunction(int n, int count) {
        if (n == 0)
            return count;

        if (n % 10 == 0)
            return helperFunction(n / 10, count + 1);
        else
            return helperFunction(n / 10, count);
    }
}
