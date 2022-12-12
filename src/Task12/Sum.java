package Task12;


import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        System.out.println(GetSum(8, 1));
        System.out.println(nbDig(5, 2));
    }

    public static int GetSum(int a, int b) {
        int sum = 0;
        if (a < b) {
            while (a <= b) {
                sum += a;
                a++;
            }
        } else if (a > b) {
            while (b <= a) {
                sum += b;
                b++;
            }
        } else {
            return a;
        }
        return sum;
    }


    public static int nbDig(int n, int d) {
        List<Integer>list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            list.add(i * i);
        }
        char[] chars = list.toString().toCharArray();
        for (Object c : chars) {
            if (c.toString().contains((Integer.toString(d)))) {
                count += 1;
            }
        }
        return count;
    }
}







