import java.util.*;

public class JavaBasics6 {

    // public static void printHelloWorld() {
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

    // // Function Overloading - using no. of parameters

    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // Function Overloading - using data types of parameters

    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static float sum(float a, float b) {
    //     return a + b;
    // }

    // public static boolean isPrime(int n) { // only for n >= 2
    //     //corner cases
    //     if(n == 2) {
    //         return true;
    //     }

    //     for(int i=2; i<=Math.sqrt(n); i++) { // Optimized Prime
    //         if(n % i == 0) {
    //             return false;
    //             break;
    //         }
    //     }
    //     return true;
    // }

    // public static void primesInRange(int n) {
    //     for(int i=2; i<=n; i++) {
    //         if(isPrime(i)) {
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

    // Practice Question 1

    // public static int avg_Of_Three(int a, int b, int c) {
    //     return (a + b + c) / 3;
    // }

    // Practice Question 2

    // public static boolean check_Even_Odd(long num) {
    //     if(num % 2 == 0) {
    //         return true;
    //     }
    //     return false;
    // }

    // Practice Question 3

    // public static int isPallidrome(int n) {
    //     int reverse = 0;

    //     while(n > 0) {
    //         int lastDigit = n % 10;
    //         reverse = (reverse * 10) + lastDigit;
    //         n = n / 10;
    //     }
        
    //     return reverse;
    // }

    // Practice Question 4

    // public static int digitSum(int number) {
    //     int sum = 0;

    //     while(number > 0) {
    //         int lastDigit = number % 10;
    //         sum = sum + lastDigit;
    //         number = number / 10;
    //     }

    //     return sum;
    // }

    public static void main(String args[]) {

        // Functions/Methods

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

        // System.out.println(sum(3, 5));
        // System.out.println(sum(3, 4, 10));

        // System.out.println(sum(2, 5));
        // System.out.println(sum(2.4f, 2.6f));

        //7 System.out.println(isPrime(2));

        //8 primesInRange(10);

        //9 binToDec(1001);

        //10 decTOBin(4);

        // Scope - Method Scope - Any variable defined within the function it can be used and accessible only within that function if used in other function passed as parameter

        // Scope - Block Scope - Variables defined in a block it can be used and accessible within that block
 
        // int p = 45;
        // {
        //     int s = 24;
        //     System.out.println(s);
        //     System.out.println(p);
        // }
        // System.out.println(s);
        // System.out.println(p);

        // for(int i=1, j=0, k=4; i<=5; i++) {

        // }
        // System.out.println(i);

        // int i = 1;
        // System.out.println(i);

        // Practice Question 1

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter a: ");
        // int a = sc.nextInt();

        // System.out.println("Enter b: ");
        // int b = sc.nextInt();

        // System.out.println("Enter c: ");
        // int c = sc.nextInt();

        // System.out.println("Average of a, b and c " + avg_Of_Three(a, b, c));

        // Practice Question 2

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number: ");
        // long num = sc.nextLong();

        // if(check_Even_Odd(num)) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }

        // Practice Question 3

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number: ");
        // int n = sc.nextInt();

        // int reverse = isPallidrome(n);

        // if(reverse == n) {
        //     System.out.println("Pallindrome");
        // } else {
        //     System.out.println("Not Pallindrome");
        // }

        // Practice Question 4
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter number: ");
        // int number = sc.nextInt();

        // System.out.println("Sum of the Digits in the given Integer is " + digitSum(number));









    }
}
