package Task15;

public class Kata {
    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(13));

    }
    static String howMuchILoveYou(int nb_petals) {

        //your code here :)
        switch (nb_petals % 6) {
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
            default:
                return "";
        }
    }
}




//
//        switch(nb_petals) {
//            case(1): return "I love you";
//            case(2): return "a little";
//            case(3): return "a lot";
//            case(4): return "passionately";
//            case(5): return "madly";
//            case(6): return "not at all";
//            case(7): return "I love you";
//        }
//
//        return "";
//    }