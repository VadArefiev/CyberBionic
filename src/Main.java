import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {

        System.out.println(getFactorial(100));
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
}
