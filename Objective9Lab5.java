import java.util.Scanner;

public class Objective9Lab5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double num1, num2;
        boolean keepGoing = true;
        int choice;
        double answer = 0.0;

        // Part 1:
        // prompt the user to provide one number and store their input in num1
        /*
         * Solution for Part 1 goes here
         */
        System.out.println("Number 1 = ");
        num1 = kb.nextDouble();

        // Part 2:
        // Prompt the user for another number and store their input in num2
        /*
         * Solution for Part 2 goes here
         */
        System.out.println("Number 2 = ");
        num2 = kb.nextDouble();

        while (keepGoing) {
            printMenu();
            System.out.print("Which would you like to do? ");
            choice = kb.nextInt();

            switch (choice) {
                // Part 3:
                // Complete this switch, with each case calling one of the methods below,
                // then printing out the result (refer to "Expected Output" below)
                // Don't forget to account for a user accidentally inputting an invalid number!
                /*
                 * Solution for Part 3 goes here


                 Add case 1 - 4 with breaks
                 */
                case 1:
                    answer = findSum(num1, num2);
                    System.out.println("Sum is " + answer);
                    break;
                case 2:
                    answer = findAverage(num1, num2);
                    System.out.println("Average of " + num1 + " and " + num2 + "is " + answer);
                    break;
                case 3:
                    answer = calcTax(num1, num2);
                    System.out.println("Tax of " + num1 + "$ and " + num2 + "$ is " + answer);
                    break;
                case 4:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Illegal menu option. It should be 1, 2, 3 or 4");
            }
        }
        kb.close();

    }

    public static void printMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("|                      |");
        System.out.println("========================");
        System.out.println();
    }

    public static double findSum(double x, double y) {
        return x + y;
    }

    // Part 4:
    // Write a method named "findAverage" that takes two doubles as parameters,
    // and returns a double that represents the average of the two parameters.
    // Use the "findSum" method as an example.
    /*
     * Solution for Part 4 goes here
     */
    public static double findAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    // Part 5:
    // Write a method named "calcTax" that also takes two doubles as parameters,
    // and returns a double that represents the amount of tax the user would have
    // to pay based on the total of the two parameters. Use a tax rate of 8.31%
    // (Not a grand total, just the total taxes.  Refer to "Expected Output")
    /*
     * Solution for Part 5 goes here
     */
    public static double calcTax(double num1, double num2) {
        final double TAX_RATE = 0.0831;
        double sum = findSum(num1, num2);
        return sum * TAX_RATE;
    }
}
