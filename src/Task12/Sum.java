package Task12;

public class Sum {
    public static void main(String[] args) {
        System.out.println(GetSum(8, 1));
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
}


