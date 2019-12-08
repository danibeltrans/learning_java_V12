public class SwitchNew {


    public static void main(String[] args) {

        int monthNumber = 1;

        String monthName;
        switch (monthNumber){
            case 1:
                monthName = "January";
            case 2:
                monthName = "February";
            default:
                monthName = "Unknown";

        }

        /**
         * 1. Expresion
         * 2. No Fall-through ->
         * 3. Return value
         * 4. Combine labels
         * 5. Block Scope
         */




        String monthNameNew = switch (monthNumber){ //1
            case 1 ->  "January";
            case 2 ->  "February";
            case 13,14,15 ->  "Ah!"; //4

            case 5 -> { //5
                String monthN = "May";
                break monthN;
            }

            default-> "Unknown";

        };






        System.out.println("New Switch Expression result:");
        executeNewSwitchExpression("M");
        executeNewSwitchExpression("TH");
        executeNewSwitchExpression("");
        executeNewSwitchExpression("SUN");
    }



    public static void executeNewSwitchExpression(String day){

        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    break "Please insert a valid day.";
                else
                    break "Looks like a Sunday.";
            }

        };

        System.out.println(result);
    }

    /**
     * default case is now compulsory in Switch Expressions.
     * break is used in Switch Expressions to return values from a case itself.
     */

}
