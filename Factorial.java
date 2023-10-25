import java.util.Scanner;  // Import the Scanner class

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number:");
    int number = sc.nextInt();
    
    // Calculate and display the factorial of the given number
    System.out.println("The factorial of the given number is: " + calculateFactorial(number));
    
    // Other functionalities or functions can be called here or added as needed.
  }

  // Existing functions...

  static int calculateFactorial(int number) {
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result *= i;
    }
    return result;
  }

  // Other functions...
}
