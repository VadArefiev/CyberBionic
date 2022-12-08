package Task11;

public class Car {

    private String color;
    private double engine;
    private int door;

    public Car(String color) {
        this.color = color;

    }

    public Car(String color, double engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }

    public Car(int door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }
}



