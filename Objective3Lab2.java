public class Objective3Lab2 {
  public static void main(String[] args) {

double side1 = 8.0;
double side2 = 10.0;

double num = Math.sqrt(side1 * side2);
double result = Math.sqrt(side1) + Math.sqrt(side2);

double hypotenuse = result;

result *= 2;

System.out.printf("The hypotenuse of a triangle with sides "+side1+" and "+side2+" is "+result+"");

  }
}
