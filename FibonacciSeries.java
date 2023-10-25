import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();

    // Call the FibonacciSeries method
    FibonacciSeries(number);
  }

  // FibonacciSeries methods...(logic)

  static void FibonacciSeries(int number) {
    int a = 0, b = 1;
    while (a <= number) {
      System.out.print(a + " ");
      int temp = a + b;
      a = b;
      b = temp;
    }
    System.out.println();
  }
}
