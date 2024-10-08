import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printSubset("", "abc");
        List<List<String>> subsets = subset("abc");
        System.out.println(subsets);
    }

    static void printSubset(String str, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(str);
            return;
        }

        char ch = unProcessed.charAt(0);

        printSubset(str + ch, unProcessed.substring(1));
        printSubset(str, unProcessed.substring(1));
    }

    static List<List<String>> subset(String str) {
        return helper("", str);
    }

    static List<List<String>> helper(String processed, String unProcessed) {
        List<List<String>> result = new ArrayList<>();

        if (unProcessed.isEmpty()) {
            result.add(List.of(processed));
            return result;
        }

        char ch = unProcessed.charAt(0);

        result.addAll(helper(processed + ch, unProcessed.substring(1)));
        result.addAll(helper(processed, unProcessed.substring(1)));

        return result;
    }
}
