package Task11;

public class CarTest {

    public void changeColor(Car ca2, Car ca3) {
        Car ca4 = ca2;
        ca2 = ca3;
        ca3 = ca4;
        System.out.println(ca2.getColor());
        System.out.println(ca3.getColor());
    }

    public void changeDoor(Car doors) {
        Car door = doors;
        System.out.println(door);
    }
}
