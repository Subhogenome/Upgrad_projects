import java.util.Scanner;
public class loops {
    public static void main( String[] args ) {
    //Write a Java program to calculate the factorial of a given number using a for loop.
    //The formula to find the factorial of a number is n! = n × (n-1) × (n-2) × (n-3) × ….× 3 × 2 × 1
    int numberA;
  
    Scanner input = new Scanner(System.in);
    numberA = input.nextInt();
    int result=1;
    for (int num = 1; num <= numberA ; num++) {
        result=result*num;
        }
//Create a program that prints a number pyramid pattern using nested loops. The user inputs the number of rows, and the program should print a pyramid pattern.
    
    int numRows = numberA;

    // Print the pyramid pattern
    for (int i = 1; i <= numRows; i++) {
        // Print spaces for alignment
        for (int j = 1; j <= numRows - i; j++) {
            System.out.print("  ");
        }

        // Print numbers in ascending order
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }

        // Print numbers in descending order (excluding 1)
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j + " ");
        }

        // Move to the next line for the next row
        System.out.println();


    }


    //Write a Java program to check if a given number is a palindrome. Use a while loop to reverse the digits of the number and then compare it with the original.
    int numberB;
    numberB=input.nextInt();
    int reversedNum=0;
    int originalNumber = numberB;
    while (numberB > 0) {
        int digit = numberB % 10;
        reversedNum = reversedNum * 10 + digit;
        numberB/= 10;
    }
    if (reversedNum==originalNumber){
        System.out.println("is palindrome");
    }
    else{
           System.out.println("is not palindrome");
    }
    
//Implement the FizzBuzz program. For numbers from 1 to 100, print "Fizz" for multiples of 3, "Buzz" for multiples of 5, and "FizzBuzz" for multiples of both. Print the number itself if it is not a multiple of 3 or 5.
    for(int s=0;s<=100;s++){
        if ((s%3==0)&&(!(s%5==0))){
            System.out.print("Fizz ");
            
        }
        else if ((s%5==0)&&(!(s%3==0))){
            System.out.print("Buzz ");}
        else if ((s%5==0)&&((s%3==0))){
            System.out.print("FizzBuzz ");  }
        else{
            System.out.print(s+" ");
        }
   }


//Develop a simple number guessing game. Generate a random number between 1 and 100, and let the user guess the number. Provide hints such as "Too high" or "Too low" and use a do-while loop until the user guesses correctly.
   int guess;
   guess=input.nextInt();
   int number1=7;

   do {
       System.out.println("your guess was "+guess);
       if (guess>number1){
        System.out.println("You are going high come low");

       }
       else{
        System.out.println("You are going low come high");
       }

       
   } while (guess==number1);
    


}}
