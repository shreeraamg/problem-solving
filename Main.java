public class Main {
    public static void main(String[] args) {
        stringSubset("", "abc");
    }

    static void stringSubset(String str, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(str);
            return;
        }

        char ch = unProcessed.charAt(0);

        stringSubset(str + ch, unProcessed.substring(1));
        stringSubset(str, unProcessed.substring(1));
    }
}
