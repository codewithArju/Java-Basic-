import java.util.Scanner;
 public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();

        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));
    }

    static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int original = number;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3); // Armstrong number for 3 digits
            number /= 10;
        }
        return sum == original;
    }
}


