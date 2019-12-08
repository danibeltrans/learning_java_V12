public class SwitchOld {
    public static void main(String[] args) {

        int monthNumber = 1;

        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            default:
                System.out.println("Unknown");

        }

        //Fall-through -- break;
        //Only one difference (month name) -- new variable and return

    }
}
