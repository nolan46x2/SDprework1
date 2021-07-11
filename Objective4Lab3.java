
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 1995;
    age = 26;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    input.nextInt(age);

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
