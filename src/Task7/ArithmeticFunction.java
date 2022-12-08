package Task7;

public class ArithmeticFunction {

    public static void main(String[] args) {
        System.out.println(arithmetic(20,10, "add"));

    }

    public static int arithmetic(int a, int b, String operator) {
        int result = 0;
        switch (operator) {
            case ("add") -> result = a + b;
            case ("subtract") -> result = a - b;
            case ("divide") -> result = a / b;
            case ("multiply") -> result = a * b;
        }
        return result;
    }
}


