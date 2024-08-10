package recursion;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class Leetcode1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num) {
        return helperFunction(num, 0);
    }

    static int helperFunction(int num, int count) {
        if (num == 0)
            return count;

        if (num % 2 == 0)
            return helperFunction(num / 2, count + 1);
        else
            return helperFunction(num - 1, count + 1);
    }
}
