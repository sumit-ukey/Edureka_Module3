import java.util.Scanner;

public class SumOfDigitsProgram {

   public static int numberSum(int number) {
      // declare variables
      int lastDigit = 0;
      int sum = 0;

      // loop to repeat the process
      while(number != 0) {

         // find last digit
         lastDigit = number % 10;

         // add last digit to sum
         sum = sum + lastDigit;

         // remove last digit
         number = number / 10;
      }

      // sum value is the sum of digits
      // of the given number
      return sum;
  }

  public static void main(String[] args) {
      // declare variables
      int number = 0;
      int sumOfDigits = 0;

      // create Scanner class object 
      // for reading the values
      Scanner scan =  new Scanner(System.in);

      // read input
      System.out.print("Enter an integer number::");
      number = scan.nextInt();

      // find sum of digits of number
      sumOfDigits = numberSum(number);

      // display result
      System.out.println("The sum of digits of" +
         " the number "+number+" = "+sumOfDigits);

      // close Scanner class object
      scan.close();
  }
}