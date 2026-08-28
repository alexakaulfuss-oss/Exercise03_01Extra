/*  Program: Proper Fractions, Improper Fractions, and Mixed Fractions

*   Programmer: Alex Kaulfuss

*   Date: August 27

*   Purpose: the code receives two numbers from the user and puts them into a fraction to determine if the two numbers are a proper fraction, improper fraction, or whole number, then displays the number in its correct form.

*/


import java.util.Scanner;

public class Exercise03_01Extra {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a numerator: ");
    int numerator = input.nextInt();

    System.out.print("Enter a denominator: ");
    int denominator = input.nextInt();

    if (numerator < denominator) {
      System.out.println(numerator + " / " + denominator
          + " is a proper fraction");
    }
    else {
      int wholeNumber = numerator / denominator;
      int remainder = numerator % denominator;

      if (remainder == 0) {
        System.out.println(numerator + " / " + denominator
            + " is an improper fraction and it can be reduced to "
            + wholeNumber);
      }
      else {
        System.out.println(numerator + " / " + denominator
            + " is an improper fraction and its mixed fraction is "
            + wholeNumber + " + " + remainder + " / " + denominator + ".");
      }
    }
  }
}