import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);


    System.out.println("Please enter the first whole number you would like to add.");
    int number1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int number2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int number3 = keyboard.nextInt();

    int sum = number1 + number2 + number3;

    System.out.println("Please enter the first decimal number you would like to add.");
    double double1 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double double2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    double double3 = keyboard.nextDouble();

    double sum2 = double1 + double2 + double3;





System.out.println("the sum of " + number1 + " + " + number2 + " + " + number3 + " is " + sum);
System.out.println("the sum of " + double1 + " + " + double2 + " + " + double3 + " is " + sum2);
  }
}
