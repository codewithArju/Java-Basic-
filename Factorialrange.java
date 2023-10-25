 import java.util.Scanner;
 public class Factorialrange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the starting value for the range:");
    int starting_value = sc.nextInt();

    System.out.println("Enter the ending value for the range:");
    int ending_value = sc.nextInt();

    // Call the FactorialOfNumbersInRange method
    FactorialOfNumbersInRange(starting_value, ending_value);
  }

  static void FactorialOfNumbersInRange(int starting_value, int ending_value) {
    for (int i = starting_value; i <= ending_value; i++) {
      int result = 1;
      for (int j = 1; j <= i; j++) {
        result = result * j;
      }
      System.out.println("Factorial of " + i + " is: " + result);
    }
  }
}


