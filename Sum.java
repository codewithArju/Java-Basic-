 import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    
    int sum = SumOfNaturalNumbers(number);
    System.out.println("The sum of natural numbers up to " + number + " is: " + sum);
  }

  static int SumOfNaturalNumbers(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }
}


