package Task14;

public class Kata {
    public static void main(String[] args) {

        System.out.println(bmi(1274.6, 12.3));
    }

    public static String bmi(double weight, double height) {
        if (weight / height <= 18.5) {
            return "Underweight";
        } else if (weight / Math.pow(height,2.0) <= 25) {
            return "Normal";
        } else if (weight / height <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
