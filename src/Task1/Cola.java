package Task1;

public class Cola extends Drink{

    private final Type colaType;

    public Cola(int price, Type colaType) {
        super(DrinkName.COLA, price);
        this.colaType = colaType;
    }

    public Type getColaType() {
        return colaType;
    }

    public enum Type {
        ZERO,
        ORIGINAL,
        CHERRY,
        MAX
    }


}
