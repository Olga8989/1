import static java.lang.Long.sum;

public class Main {


    public static void main(String[] args) {

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 5;
        int speedOfPlayer3 = 2;

        int income = 1;

        boolean isGreenLight = false;


        if (speedOfPlayer1 >= 1) {
            System.out.println("Green, speedOfPlayer1 выбывает:" + 0);
        } else {
            System.out.println("Red, speedOfPlayer1 выбывает:" + income);

        }

        if (speedOfPlayer2 == 0) {
            System.out.println("Red, speedOfPlayer2 выбывает:" + income);
        } else {
            System.out.println("Green, speedOfPlayer2 выбывает:" + 0);
        }

        if (speedOfPlayer3 >= 1) {
            System.out.println("Green, speedOfPlayer3 выбывает:" + 0);
        } else {
            System.out.println("Red, speedOfPlayer3 выбывает:" + income);

        }
    }

}