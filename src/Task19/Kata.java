package Task19;

/*Task
* Given a string str, reverse it and omit all non-alphabetic characters.

* Example
* For str = "krishan", the output should be "nahsirk".

* For str = "ultr53o?n", the output should be "nortlu".

* Input/Output
* [input] string str
* A string consists of lowercase latin letters, digits and symbols.

* [output] a string
*/

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


