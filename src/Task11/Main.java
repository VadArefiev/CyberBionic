package Task11;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        Car car2 = new Car("red",3.5,5);
        Car car3 = new Car("blue",2.4,4);
        new CarTest().changeColor(car2,car3);
        new CarTest().changeDoor(car);
    }
}
