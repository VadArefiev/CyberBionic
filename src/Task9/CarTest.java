package Task9;

public class CarTest {

    public static void main(String[] args) {

        CarTest ct = new CarTest();
        Car car = new Car("red", "V8", 4);

        Car car2 = new Car("blue", "V6", 5);
        Car car3 = new Car("white", "V4", 6);

        ct.changeColor2(car2, car3);
        ct.changeDoor(car, 5);

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);


    }

    void changeDoor(Car c, int door) {
        c.numberDoor = door;
    }

    void changeColor(Car car2, Car car3) {

        String color4 = car2.color;
        car2.color = car3.color;
        car3.color = color4;

    }

    void changeColor2(Car c2, Car c3) {

        String color4 = c2.color;
        c2.color = c3.color;
        c3.color = color4;

    }
}


