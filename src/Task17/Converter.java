package Task17;

public class Converter {
    public static void main(String[] args) {
        System.out.println(binToDecimal("1000"));
    }

    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
        }
    }


