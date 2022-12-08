package Task9;

public class Car {


    String color;
    String engine;
    int numberDoor;

    public Car(String color, String engine, int numberDoor) {
        this.color = color;
        this.engine = engine;
        this.numberDoor = numberDoor;
    }

    public Car(int numberDoor) {
        this.numberDoor = numberDoor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", numberDoor=" + numberDoor +
                '}';
    }
}
