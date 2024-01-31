import java.util.*;

public class JavaBasics3 {
    public static void main(String args[]) {

        // Conditional Statements - if, else

        // int age = 18;

        // if(age >= 1 && age < 13) {
        //     System.out.println("Child");
        // }
        
        // if(age >= 13 && age < 18) {
        //     System.out.println("Teenager");
        // }    

        // if(age >= 18 && age < 45) {
        //     System.out.println("Adult");
        // }    

        // else {
        //     System.out.println("Not valid age or Old person"); // This else is for last if statement
        // }

        // Print the largest of 2

        // int A = 1;
        // int B = 3;

        // if(A >= B) {
        //     System.out.println("Largetst number : " + A);
        // } else {
        //     System.out.println("Largetst number : " + B);
        // }

        // Print if a number is Odd or Even

        // Scanner sc = new Scanner(System.in);
        
        // int num = sc.nextInt();
    
        // if(num%2 == 0) {
        //     System.out.println(num + " is Even number");
        // } else {
        //     System.out.println(num + " is Odd number");
        // }

        // Conditional Statements - else if

        // int age = -5;

        // if(age >= 1 && age < 13) {
        //     System.out.println("Child");
        // } else if(age >= 13 && age < 18) {
        //     System.out.println("Teenager");
        // } else if(age >= 18 && age < 45) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not valid age or Old person"); // This else is for last if statement
        // }

        // Income tax Calculator

        // Scanner sc = new Scanner(System.in);
        
        // int income = sc.nextInt();
        // int tax = 0;

        // if(income < 500000) {
        //     tax = 0;
        // } else if(income > 500000 && income < 1000000) {
        //     tax = (int) (income * 0.2);
        // } else {
        //     tax = (int) (income * 0.3);
        // }

        // System.out.println("Income Tax : " + tax);

        // Print the largest of 3

        // int A = 89;
        // int B = 99;
        // int C = 100;

        // if(A > B) {
        //     if(A > C) {
        //         System.out.println("A is Largest");
        //     } else {
        //         System.out.println("C is Largest");
        //     }
        // } else {
        //     if(B > C) {
        //         System.out.println("B is Largest");
        //     } else {
        //         System.out.println("C is Largest");
        //     }
        // }

        // or

        // if((A > B) && (A > C)) {
        //  System.out.println("A is Largest");
        // } else if(B > C) {
        //  System.out.println("B is Largest");
        // } else {
        //  System.out.println("C is Largest");
        // } 

        // Conditional Statements - Ternary Operators

        // int num = 4;

        // String type = (num%2 == 0) ? "Even" : "Odd";
        // System.out.println(type);

        // Check if a student will Pass or Fail

        // Scanner sc = new Scanner(System.in);

        // int marks = sc.nextInt();

        // String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        // System.out.println(reportCard);

        // Conditional Statements - Switch Statements

        // Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();
       
        // switch(number) {
        //     case 1 : System.out.println("Monday"); // Cases can be of any data type: int, char, byte, short
        //              break;
        //     case 2 : System.out.println("Tuesday");
        //              break;
        //     case 3 : System.out.println("Wednesday");
        //              break;
        //     case 4 : System.out.println("Thursday");
        //              break;
        //     case 5 : System.out.println("Friday");
        //              break;
        //     case 6 : System.out.println("Saturday"); 
        //              break;
        //     case 7 : System.out.println("Sunday");
        //              break;
        //     default : System.out.println("Go to Parallel World");
        // }

        // Calculator

        // Scanner sc = new Scanner(System.in);
    
        // System.out.println("Enter a");
        // int a = sc.nextInt();

        // System.out.println("Enter b");
        // int b = sc.nextInt();
        
        // System.out.println("Enter operator");
        // char operator = sc.next().charAt(0); // For single character input

        // switch(operator) {
        //     case '+' : System.out.println(a + b);
        //                  break;
        //     case '-' : System.out.println(a - b);
        //                  break;
        //     case '*' : System.out.println(a * b);   
        //                  break;
        //     case '/' : System.out.println(a / b); 
        //                  break;
        //     case '%' : System.out.println(a % b); 
        //                  break;
        //     default  : System.out.println("Invalid Operator");               
        // }

        // Practice Question 1 - Positive or Negative

        // Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();

        // if(number > 0) {
        //     System.out.println("Positive");
        // } else if(number < 0) {
        //     System.out.println("Negative");
        // } else {
        //     System.out.println("Non-negative & Non-positive number");
        // }

        // Practice Question 2 - Finish the code

        // double temp = 103.5;

        // if(temp > 100) {
        //     System.out.println("You have Fever");
        // } else {
        //     System.out.println("You do not have Fever");
        // }

        // Practice Question 3 - Days in a week using Switch case 

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter weak number(1-7): ");
        // int weekNumber = sc.nextInt();
       
        // switch(weekNumber) {
        //     case 1 : System.out.println("Monday"); // Cases can be of any data type: int, char, byte, short
        //                 break;
        //     case 2 : System.out.println("Tuesday");
        //                 break;
        //     case 3 : System.out.println("Wednesday");
        //                 break;
        //     case 4 : System.out.println("Thursday");
        //                 break;
        //     case 5 : System.out.println("Friday");
        //                 break;
        //     case 6 : System.out.println("Saturday"); 
        //                 break;
        //     case 7 : System.out.println("Sunday");
        //                 break;
        //     default : System.out.println("Invalid week number, Please enter weak number between 1-7");
        // }

        // Practice Question 4 - Value of x & y

        // int a = 63, b = 36;

        // boolean x = (a < b) ? true : false; // false
        // System.out.println(x);

        // int y = (a>b) ? a : b; // 63
        // System.out.println(y);

        // Practice Question 5 - Leap year or not

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Input the year: ");
        // int year = sc.nextInt();

        // if(year % 4 == 0) {
        //     if(year % 100 == 0) {
        //         if(year % 400 == 0) {
        //             System.out.println("Leap year");
        //         } else {
        //             System.out.println("Not a Leap year");
        //         }
        //     } else {
        //         System.out.println("Leap year");
        //     }
        // } else {
        //     System.out.println("Not a Leap year");
        // }

        // or
        
        // boolean x = (year%4) == 0;
        // boolean y = (year%100) !=0;
        // boolean z = ((year%100==0) && (year%400==0)); 
        // if(x && (y || z)) {
        //     System.out.println(year + " is a leap year");
        // } else {
        //     System.out.println(year + " is not a leapyear");
        // }

        
    }
}
