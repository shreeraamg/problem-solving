package recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(skipCharacter("baccad"));
    }

    static String skipCharacter(String str) {
        return helper(str).toString();
    }

    static StringBuilder helper(String str) {
        StringBuilder sb = new StringBuilder();

        if(str.charAt(0) != 'a') sb.append(str.charAt(0));

        if (str.length() == 1) {
            return sb;
        }

        return sb.append(helper(str.substring(1)));
    }
}
