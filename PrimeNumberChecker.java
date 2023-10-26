import java.utill.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int number = sc.nextInt();
  
      boolean isPrime = primeCheck(number);
  
      if (isPrime) {
        System.out.println("This is a prime number");
      } else {
        System.out.println("This is not a prime number");
      }
    }
  
    public static boolean primeCheck(int number) {
      if (number <= 1) {
        return false;
      }
      
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }
  
      return true;
    }
  }
  