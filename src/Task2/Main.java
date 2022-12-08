package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите две стороны прямоугольника" );
        Restangle user = new Restangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(user.perimeterCalculator());
        System.out.println(user.areaCalculator());

        char s = 23;
        System.out.println(s);


    }
}
