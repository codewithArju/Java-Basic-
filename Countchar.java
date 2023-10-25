import java.util.Scanner;

public class Countchar {
    public static int CharacterCount(String value) {
        int result = value.length();
        return result;

    }

 public static String reverseString(String input) {
        // Here i am convert the string into char Array---
        char[] arr = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // here i am coverting the char Array to again srting..
        return new String(arr);

    }

 public static void PalindromString(String str) {
        if (str.equals(reverseString(str))) {

            System.out.println("The given srting is  palindrom");
        } else {
            System.out.println("The given string is not palimdrom");
        }

    }

    public static String findLargestString(String input) {

        String[] words = input.split(" ");

        String largestWord = " ";

        for (String s : words) {

            if (s.length() > largestWord.length()) {
                largestWord = s;
            }
        }

        return largestWord;
    }

    public static String findSmallString(String input) {
        String[] arr = input.split(" ");
        String smallestWord = " ";
        for (String s : arr) {
            if (s.length() < smallestWord.length()) {
                smallestWord = s;
            }
        }
        return smallestWord;
    }

    public static int CharacterFrequency(String str, char c) {
        int arr[] = new int[256];
        // travers the whole string from 0 to end.
        for (int i = 0; i < str.length(); i++) {
            // we have token the 1 char of the string int the "ch" variable .
            char ch = str.charAt(i);
            int ascii = (int) ch;// 
            arr[ascii]++;
        }
        
        return arr[(int) c];
    }

    public static String capitalizationOfString(String str) {
        // ================================================
        // we are Spliting the String array base on "space" using split()method
        String[] arr = str.split(" ");
        String temp = "";
        // visiting all the individual element of string array .
        for (int i = 0; i < arr.length; i++) {
            char firstcharacter = arr[i].charAt(0);
            firstcharacter -= 32;
            temp += firstcharacter + arr[i].substring(1);

        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String value = sc.next();
        // 1.CharacterCount--------- 
        int result = CharacterCount(value);
        System.out.println("The number of the character present in the string is: " + result);
        //2==========reverse given a string method calling 
        String resultString = reverseString(value);
        System.out.println("The reverse of the string is: " + resultString);
        // 3.palindrom check  metod calling ====================
        PalindromString(value);
        // 4. ========================================
        // largest String search metod  calling------
        String res = findLargestString(value);
        System.out.println("The largest String is :--" + res);
        // 5.=======================================
        String resl = findSmallString(value);
        System.out.println("The Smallest String is :--" + resl);

        // 6. =========================================
        System.out.println("enter the character you want to see the frequency :-");
        char inputChar = sc.nextLine().charAt(0);
        int res3 = CharacterFrequency(value, inputChar);
        System.out.println("In the given string the character is occured in" + "\t"+ res3 + "time");
        // 7.=============================================================
        // capitalizationOfString method call----
        String res2 = capitalizationOfString(value);
        System.out.println("After capitalization the String is: " + res2);
        // ===============================================================

    }

}


     