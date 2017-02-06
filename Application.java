import java.util.Scanner;

/**
 * Created by Lori on 2/6/2017.
 */
public class Application {

    /**
     * This method receives two numbers from user input and returns the one that is greater
     * or if they are equal then print's a message that they are equal.
     */
    private void checkGreater() {
        Scanner scanner = new Scanner(System.in);
        double first_number = 0;
        double second_number = 0;
        int resultOfTypeInt = 0;

        while (resultOfTypeInt == 0) {
            System.out.print("Enter first number: ");
            String first_input = scanner.next();
            System.out.print("Enter second number: ");
            String second_input = scanner.next();
            resultOfTypeInt = 0;
            if (isInteger(first_input) == true && isInteger(second_input) == true) {
                first_number = Double.parseDouble(first_input);
                second_number = Double.parseDouble(second_input);
                if (first_number > Integer.MAX_VALUE || second_number > Integer.MAX_VALUE)
                    System.out.println("Please enter a number smaller then 2,147,483,647");
                else {
                    int number1 = (int) first_number;
                    int number2 = (int) second_number;
                    if (number1 > number2) {
                        resultOfTypeInt = number1;
                        System.out.println(resultOfTypeInt + " is larger");
                    } else if (number1 < number2) {
                        resultOfTypeInt = number2;
                        System.out.println(resultOfTypeInt + " is larger");
                    } else {
                        resultOfTypeInt = number1;
                        System.out.println("These numbers are equal.");
                    }
                }
            } else
                System.out.println("Please enter a number, not a character.");
        }
    }

    /**
     * This method verifies if the both that were given by the user are numbers.
     *
     * @param input user input.
     * @return true if is a number, false otherwise.
     */

    private boolean isInteger(String input) {
        try {
            //Double.parseDouble(input);
            Integer.parseInt(input);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.checkGreater();
    }
}
