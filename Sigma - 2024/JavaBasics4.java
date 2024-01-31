import java.util.*;

public class JavaBasics4 {
    public static void main(String args[]) {

        // Loops - for, while, do-while

        // while Loop

        // int count = 0;
        // while(count < 10) {
        //     System.out.println("Hello World!");
        //     count++;
        // }

        // System.out.println("Hello World printed 100 times");

        // Infinite loop

        // int count = 0;
        // while(true) {
        //     System.out.println("Hello World!");
        //     count++;
        // }

        // Print numbers from 1 to 10

        // int i = 1;
        // while(i <= 10) {
        //     System.out.print(i + " ");
        //     i++;
        // }
        // System.out.println();
        // System.out.println("Loop has Ended");

        // Print numbers from 1 to n

        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();

        // int count = 1;
        // while (count <= range) {
        //     System.out.print(count + " ");
        //     i++;
        // }
        // System.out.println();
        // System.out.println("Loop has Ended");

        // Print sum of first n natural numbers

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;

        // int i = 1 ;
        // while(i <= n) {
        //     sum = sum + i; 
        //     i++;
        // }

        // System.out.println("Sum of n natural numbers : " + sum);

       // for Loop

        // for(int i=1; i<=10; i++) {
        // System.out.println("Hello World! " + i);
        // }

        // Square Pattern

        // for(int line=0; line<4; line++) {
        //     System.out.println("****");
        // }
 
        //or

        // for(int i=0; i<4; i++) {
        //     for(int j=0; j<4; j++) {
        //         System.out.print('*' + " ");
        //     } 
        //     System.out.println();
        // }

        // Print Reverse of a number

        // int n = 105;
        // while(n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }

        // Reverse the given number

        // int n = 10899;
        // int rev = 0;

        // while(n > 0) {
        //     int lastDigit = n % 10;
        //     rev = (rev * 10) + lastDigit;
        //     n = n / 10;
        // }

        // System.out.println(rev);

        // do-while Loop // Run at least one time either condition satisfied or not

        // int i = 1;
        // do {
        //     System.out.println("Hello World!");
        //     i++;
        // } while(i < 3);
        // System.out.println(i);


        // Break keyword - to exit the loop

        // for(int i=1; i<=5; i++) {

        //     if(i == 3) {
        //         break;
        //     }
        //     System.out.println("Hello World!");
        // }

        // System.out.println("I am out of the loop");

        // Keep entering the numbers till user enters a multiple of 10

        // Scanner sc = new Scanner(System.in);

        // for(int i=1; i>0; i++) {

        //     System.out.println("Enter your number : ");
        //     int n = sc.nextInt(); 

        //     if(n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // }
        
        // System.out.println("The entered is multiple of 10");

        // Continue keyword - to skip an iteration

        // for(int i=1; i<=5; i++) {
        //     if(i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Display all number entered by user except multiple of 10

        // Scanner sc = new Scanner(System.in);

        // while(true) {
        //     System.out.println("Enter number: ");
        //     int num = sc.nextInt();

        //     if(num % 10 == 0) {
        //         continue;
        //     }

        //     System.out.println("Entered number is " + num);
        // }

        // Check if a number is prime or not

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // boolean isPrime = true;

        // if(n <= 1) {
        //     System.out.println("Not a Prime number");
        // } else if (n == 2) {
        //     System.out.println("Prime number");
        // } else {
        //     for(int i=2; i<=Math.sqrt(n); i++) {
        //         if(n % i == 0) { // n is multiple of i (other than 1 and n itself) - composite number
        //             isPrime = false;
        //         }
        //     }

        //     if(isPrime == true) {
        //         System.out.println("Prime Number");
        //     } else {
        //         System.out.println("Not a Prime Number");
        //     }
        // }
        
        // Practice Question 1 - how many times Hello? printed

        // for(int i=0; i<5 ; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // Practice Question 2 - Sum of even and odd integers

        // Scanner sc = new Scanner(System.in);

        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do {
        //     System.out.print("Enter the number ");
        //     number = sc.nextInt();
        //     if(number%2==0) {
        //         evenSum += number;
        //     } else {
        //         oddSum += number;
        //     }
        //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
        //     choice = sc.nextInt();
        // } while(choice == 1);
        
        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // Practice Question 3 - factorial of any number

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter positive integer: ");
        // int num = sc.nextInt();

        // int fact = 1;

        // for(int i=1; i<=num; i++) {
        //     fact *= i;
        // }

        // System.out.println("Factorial: " + fact);

        // Practice Question 4 - Multiplication table

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number to print its table: ");
        // int tableNum = sc.nextInt();

        // int i = 0;
        // while(i <= 10) {
        //     System.out.println(tableNum + " * " + i + " = " + (tableNum * i));
        //     i++;
        // }

        // Practice Question 5 - Scope of Variables

        // Scope of variable i declared inside the for loop is limited to the for loop only.
        // To correct the program, the variable i needs to be declared outside the for loop

        
    }
}
