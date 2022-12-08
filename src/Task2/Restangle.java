package Task2;

public class Restangle {
    //    Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
//    создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
//    вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
//    прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
//    принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
//    площадь.
    private double side1;
    private double side2;

    public Restangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        double area = side1 * side2;
        return area;
    }

    public double perimeterCalculator() {
        double perimeter = (side1 + side2) * 2;
        return perimeter;
    }
}
