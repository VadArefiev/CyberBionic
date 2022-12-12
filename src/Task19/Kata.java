package Task19;

public class Kata {
    public static void main(String[] args) {
        System.out.println(reverseLetter("priv2432et"));
    }

    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        StringBuilder builder2 = new StringBuilder();
        char[] chars = builder.toString().toCharArray();
        for (char ch : chars) {
            if (Character.isAlphabetic(ch)) {
                builder2.append(ch);
            }
        }
        return builder2.toString();
    }
}


