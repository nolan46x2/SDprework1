import java.util.Scanner;
public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      int selectedOption = scanner.nextInt();

      if(selectedOption == 1) {
       System.out.println("Say Hello");
      }else if(selectedOption == 2) {
       System.out.println("banana, apple, orange");
      }else if(selectedOption == 3){
        break;
      }
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
