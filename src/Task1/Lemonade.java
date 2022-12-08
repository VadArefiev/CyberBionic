package Task1;

public class Lemonade extends Drink {

        private final Type type;

        public Lemonade(
                int price,
                Type type) {
            super(DrinkName.LEMONADE, price);
            this.type = type;
        }

        public enum Type {
            APPLE,
            ORANGE
        }
    }

