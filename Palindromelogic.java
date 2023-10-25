import java.util.Scanner;

public class Palindromelogic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = sc.nextInt();
    System.out.println("Is the number a palindrome? " + isPalindrome(number));
     isPalindrome (number);
  }

  static boolean isPalindrome(int number) {
    int original = number;
    int reversed = 0;
    while (number != 0) {
      int rem = number % 10;
      reversed = reversed * 10 + rem;
      number = number / 10;
    }
    return original == reversed;
  }
}
