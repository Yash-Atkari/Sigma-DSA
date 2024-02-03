import java.util.*;

public class JavaBasicsQue {

    // public static void hollow_rectangle(int rows, int cols) {

    //     for(int i=1; i<=rows; i++) { // Outer loop

    //        for(int j=1; j<=cols; j++) { // Inner loop
    //            if(i == 1 || i == rows || j == 1 || j == cols) {
    //                System.out.print("*");
    //            } else {
    //                System.out.print(" ");
    //            }
    //        }

    //         System.out.println();
    //     }
    // }


    // public static void inverted_rotated_half_pyramid(int n) {

    //     for(int i=1; i<=n; i++) {

    //         // spaces
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         // stars
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();

    // }
    // }

    // public static void inverted_half_pyramid_numbers(int n) {

    //     for(int i=1; i<=n; i++) {

    //         for(int j=1; j<=n-i+1; j++) {
    //             System.out.print(j);
    //         }

    //         System.out.println();
    //     }
    // }

    // public static void floyds_Triangle(int n) {

    //     int num = 1;
    //     for(int i=1; i<=n; i++) {

    //         for(int j=1; j<=i; j++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }

    //         System.out.println();
    //     }
    // }

    // public static void binay_Triangle(int n) {
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if((i+j) % 2 == 0) {
    //                 System.out.print(1);
    //             } else {
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void butterfly(int n) {

        // 1st Half
        // for(int i=1; i<=n; i++) {

        //     // stars i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     // spaces 2 * (n-1)
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     // star i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        
        //     System.out.println(); 
        // }

        // // 2nd Half
        // for(int i=n; i>=1; i--) {

        //     // stars i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     // spaces 2 * (n-1)
        //     for(int k=1; k<=2*(n-i); k++) {
        //         System.out.print(" ");
        //     }
        //     // star i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        
        //     System.out.println(); 
        // }

        // public static void solid_Rhombus(int n) {
        //     for(int i=1; i<=n; i++) {

        //         // spaces
        //         for(int j=1; j<=(n-i); j++) {
        //             System.out.print(" ");
        //         }

        //         // stars
        //         for(int j=1; j<=n; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println();
        //     }
        // }

        // public static void hollow_rhombus(int n) {
            
        //     for(int i=1; i<=n; i++) {
        //         // spaces
        //         for(int j=1; j<=n-i; j++) { 
        //             System.out.print(" ");
        //         }
        //         // hollow rectangle
        //         for(int j=1; j<=n; j++) { // Inner loop
        //             if(i == 1 || i == n || j == 1 || j == n) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }

        //         System.out.println();
        //     }
        // }

        // public static void diamond(int n) {
        //     // 1st half
        //     for(int i=1; i<=n; i++) {
        //         // spaces
        //         for(int j=0; j<=n-i; j++) {
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for(int j=1; j<=(2*i)-1; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println();
        //     }

        //     // 2nd half
        //     for(int i=n; i>=1; i--) {
        //         // spaces
        //         for(int j=0; j<=n-i; j++) {
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for(int j=1; j<=(2*i)-1; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println();
        //     }
        
        // }

    //     public static void printHelloWorld() {
    //     System.out.println("Hello World!");
    //     System.out.println("Hello World!");
    //     return;
    // }

    // public static int calculateSum(int num1, int num2) { // function definition // parameters or formal parameters
    //     int sum = num1 + num2;
    //     return sum;
    // } 

    // public static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     // System.out.println("a : " + a);
    //     // System.out.println("b : " + b);
    //     return;

    // public static int multiply(int x, int y) {
    //     int product = x * y;
    //     return product;
    // }

    // public static int calculateFact(int n) {
    //     int fact = 1;
    //     for(int i=1; i<=n; i++) {
    //         fact = fact * i;
    //     }
    //     return fact;
    // }

    // public static int binCoeff(int n, int r) {
    //     int fact_n = calculateFact(n);
    //     int fact_r = calculateFact(r);
    //     int fact_nmr = calculateFact(n-r);

    //     int binCoeff = fact_n / (fact_r * fact_nmr);
    //     return binCoeff;
    // }

    // public static boolean isPrime(int n) { // only for n >= 2
    //     //corner cases
    //     if(n == 2) {
    //         return true;
    //     }

    //     for(int i=2; i<=Math.sqrt(n); i++) { // Optimized Prime
    //         if(n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void primesInRange(int n) {
    //     for(int i=2; i<=n; i++) {
    //         if(isPrime(i)) { // *Helper Function
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("This is the list of prime numbers in range");
    // }

    // public static void binToDec(int binNum) {
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;

    //     while(binNum > 0) {
    //         int lastDigit = binNum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

    //         pow++;
    //         binNum = binNum / 10;
    //     }
    //     System.out.println("Decimal of " + myNum + " = " + decNum);
    // }

    // public static void decTOBin(int n) {
    //     int myNum = n;
    //     int pow = 0;
    //     int binNum = 0;

    //     while(n > 0) {
    //         int rem = n % 2;
    //         binNum = binNum + (rem * (int) Math.pow(10, pow));
    
    //         pow++;
    //         n = n / 2;
    //     }

    //     System.out.println("Binary of " + myNum + " = " + binNum);
    // }

    public static void main(String args[]) {

        // Sigma JavaBasics Lecture Questions

        // Print a Pattern

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Sum of a & b

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        // Sum of a & b

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Product of a & b

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        // Area of a Circle

        // Scanner sc = new Scanner(System.in);
        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad; // Java takes any decimal number as double 
        // System.out.println(area);

        // Print the largest of 2

        // int A = 1;
        // int B = 3;

        // if(A > B) {
        //     System.out.println("Largetst number : " + A);
        // } else {
        //     System.out.println("Largetst number : " + B);
        // }

        // Print if a number is Odd or Even

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
    
        // if(num % 2 == 0) {
        //     System.out.println(num + " is Even number");
        // } else {
        //     System.out.println(num + " is Odd number");
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

        // Check if a student will Pass or Fail

        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();

        // String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        // System.out.println(reportCard);

        // Days in a week

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

        // Square Pattern

        // for(int i=1; i<=4; i++) {
        //     System.out.println("****");
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
        //             break;
        //         }
        //     }

        //     if(isPrime == true) {
        //         System.out.println("Prime Number");
        //     } else {
        //         System.out.println("Not a Prime Number");
        //     }
        // }

        // Print the STAR pattern

        // for(int line=1; line<=4; line++) {
        //     for(int star=1; star<=line; star++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // Print INVERTED-STAR pattern

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int line=n; line>=1; line--) {
        //     for(int star=1; star<=line; star++) {
        //         System.out.print('*' + " ");
        //     }
        //     System.out.println();
        // }

        // or

        // int n = 4;

        // for(int line=1; line<=n; line++) {
        //     for(int star=1; star<=n-line+1; star++) {
        //         System.out.print('*');         
        //     }
        //     System.out.println();
        // }

        // Print HALF-PYRAMID pattern

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // for(int line=1; line<=n; line++) {
        //     for(int number=1; number<=line; number++) {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // Print CHARACTER pattern

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // char ch = 'A';

        // for(int line=1; line<=n; line++) {
        //     for(int chars=1; chars<=line; chars++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // Advanced patterns

        // hollow_rectangle(4, 5);

        // inverted_rotated_half_pyramid(5);

        // inverted_half_pyramid_numbers(5);

        // floyds_Triangle(5);

        // binay_Triangle(5);

        // butterfly(10);

        // solid_Rhombus(45);

        // hollow_rhombus(5);

        // diamond(5);

        //1 printHelloWorld();

        //2 Scanner sc = new Scanner(System.in);

        // System.out.println("Enter num1");
        // int num1 = sc.nextInt();
        // System.out.println("Enter num2");
        // int num2 = sc.nextInt();

        // int sum = calculateSum(num1, num2); // function call // arguments or actual parameters
        // System.out.println("The sum is " + sum); 

        //3 int a = 2 , b = 4;
        // swap(a, b);
        // System.out.println("a : " + a);
        // System.out.println("b : " + b); // Call by Value

        //4 Scanner sc = new Scanner(System.in);

        // System.out.println("Enter x and y : ");
        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // int product = multiply(x, y);
        // System.out.println("Product1 of x & y : " + product);

        //5 Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // int n = sc.nextInt();
        // System.out.println("Enter r: ");
        // int r = sc.nextInt();

        // System.out.println(binCoeff(n, r));

        //6 int factorial = calculateFact(n);
        // System.out.println("Factorial of " + n + " is " + factorial);

        //or 

        // System.out.println(calculateFact(n));

        //7 System.out.println(isPrime(2));

        //8 primesInRange(10);

        //9 binToDec(1001);

        //10 decTOBin(4);

        
    }
}