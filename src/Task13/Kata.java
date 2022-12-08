package Task13;


import java.util.*;


public class Kata {
    public static void main(String[] args) {
        isAnagram("rtrtwk","work");
    }
    public static boolean isAnagram(String test, String original) {

            char[] ch1 = test.toLowerCase().toCharArray();
            char[] ch2 = original.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        }
    }

