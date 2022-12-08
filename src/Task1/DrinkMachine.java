package Task1;

public class DrinkMachine {
public Lemonade type;
    public Drink createCola(Cola.Type type) {

        return new Cola(15, type);
    }

    public Drink createLemonade(Lemonade.Type type) {

        switch (type) {
            case APPLE -> {
                return new Lemonade(7, Lemonade.Type.APPLE);
            }
            case ORANGE -> {
                return new Lemonade(7, Lemonade.Type.ORANGE);
            }
        }
    return null;
    }

        public Drink createSprite (Sprite.Type type){
            return new Sprite(15, type);
        }

        public Drink createTea (Tea.Type type){
            return new Tea(10, type);
        }
    }






