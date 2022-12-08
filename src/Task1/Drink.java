package Task1;

public abstract class Drink {

    protected final DrinkName name;
    protected int price;

    protected Drink(DrinkName name, int price) {
        this.name = name;
        this.price = price;
    }

    public DrinkName getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
