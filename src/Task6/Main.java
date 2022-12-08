package Task6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] s1 = {"Vadim", "Petr", "Kolya"};
        twoSort(s1);
        System.out.println(twoSort(s1));
    }

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        char[] strToArray = s[0].toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strToArray.length ; i++) {
            if(i!= strToArray.length-1) {
                builder.append (strToArray[i]).append("***");
            } else
                builder.append(strToArray[i]);
        }
return builder.toString();
    }
}




