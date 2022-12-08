package Task1;

public class Tea extends Drink{

    private final Type type;

    public Tea(int price, Type type) {
        super(DrinkName.TEA, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        BLACK,
        GREEN,
        WHITE,
        FRUIT
    }


}
