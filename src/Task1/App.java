package Task1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        DrinkManager drinkManager = new DrinkManager(new DrinkMachine());

        Drink[] drinks = drinkManager.orderDrink();
        System.out.println("you have ordered drinks: " + Arrays.toString(drinks));

    }
}
