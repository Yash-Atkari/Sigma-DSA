import java.util.*; // Package which contains Collection of Classes

public class JavaBasics1 { // Boilerplate code
    public static void main (String args[]) {

        // Output > print
        // System.out.print("Hello World!"); 

        // Output > println - next line or line ka space

        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.print("Yash");

        // Output > \n - next line or line ka space

        // System.out.print("Hello World!\nHello World!");
        // System.out.print("Hello World!\n");
        // System.out.print("Hello World!");

        // // Print a Pattern

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Variables in Java

        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);

        // String name = "Tony Stark";
        // System.out.println(name);

        // a = 50; // update
        // System.out.println(a);

        // a = b; // assignment
        // System.out.println(a);

        // Data types in Java

        // byte b = 8; // range : -128 to 127
        // System.out.println(b);

        // char ch = 'a'; // only single character
        // System.out.println(ch);

        // boolean var = true; // or false
        // System.out.println(var);

        // float price = 1.3f; // 
        // System.out.println(price);

        // int num = 25; // whole number
        // System.out.println(num);

        // long lac = 100000; // big int value
        // System.out.println(lac);

        // double val = 356786.1434578934342; // big decimal value
        // System.out.println(val);

        // short n = 240;
        // System.out.println(n);

        // Que1 - Sum of a & b

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        // Comments - doesn't execute - use to write explanatory statements

        // Single line comment

        /*
        Multi line comment
        Multi line comment
        Multi line comment
        */

        // Input in Java - .next() function

        // Scanner sc = new Scanner(System.in);

        // String input = sc.next(); // Single word
        // System.out.println(input);

        // Input in Java - .nextLine() function

        // String name = sc.nextLine(); // Line or Para
        // System.out.println(name);

        // Input in Java - .nextInt() function

        // int num = sc.nextInt(); // Number
        // System.out.println(num);

        // Input in Java - .nextFloat() function

        // float price = sc.nextFloat(); // Floating value
        // System.out.println(price);

        // Que2 - Sum of a & b

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Que3 - Product of a & b

        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);

        // Que4 - Area of a Circle

        // Scanner sc = new Scanner(System.in);

        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad; // Java takes any decimal number as double 
        // System.out.println(area);

        // Type Conversion / Widening Conversion / Implicit Conversion

        // int a = 25;
        // long b = a;
        // System.out.println(b);

        // long a = 25; // lossy Conversion
        // int b = a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);

        // float num = sc.nextInt();
        // System.out.println(num);

        // int num = sc.nextFloat(); // lossy Coversion
        // System.out.println(num);

        //Type Conversion from char to int

        // char ch = 'a';
        // int num = ch;
        // System.out.println(num);

        // Type Casting / Narrowing Conversion / Explicit Conversion - Forcefull Conversion

        // int marks = (int) (99.99f);
        // System.out.println(marks);

        // float a = 25.12f;
        // int b = (int) a;
        // System.out.println(b);

        // float marks = 99.99f;
        // int finalMarks = (int) marks;
        // System.out.println(finalMarks);

        // Type Promotion in Expression - byte, short or char -> int

        // char a = 'a';
        // char b = 'b';
        // // System.out.println((int) (b)); // Type Cast
        // // System.out.println((int) (a));

        // // System.out.println(a); // Type Promotion occur only with Expression

        // // char c = b - a; // possible lossy conversion from int to char

        // System.out.println(b-a);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // // byte bt = a + b + c; // possible lossy convesion from int to byte
        // byte bt = (byte) (a + b + c); // Type Cast into byte
        // System.out.println(bt);

        // Type Promotion in Expression - long, float or double -> long, float or double

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d; // Type promotion into double
        // System.out.println(ans);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // float ans = a + b + c; // Type promotion into float
        // System.out.println(ans);

        // byte b = 5;
        // b = (byte) (b * 2); // Type promotion into int or lossy conversion from int to byte - Type cast from int to byte
        // System.out.println(b);

        // Pratice Questions 1 - Average of A, B & C
        
        // Scanner sc = new Scanner(System.in);

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // int avg = (A + B + C) / 3;
        // System.out.println("Average is : " + avg);

        // Pratice Questions 2 - Area of a Square

        // Scanner sc = new Scanner(System.in);

        // int side = sc.nextInt();
        // int area = side * side;

        // System.out.println("Area of the Square is : " + area);

        // Pratice Questions 3 - Cost of three items

        // Scanner sc = new Scanner(System.in);

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float total = pencil + pen + eraser;
        // System.out.println("Bill is : " + total);

        // float finalTotal = total + (total * 0.18f);
        // System.out.println("Bill with 18% tax : " + finalTotal);

        // Pratice Questions 4 - Type of result - double

        // Pratice Questions 5 - Gives error or not

        // int $ = 24;
        // System.out.println($);

        // No, the statement will not give any error

        // Reason : Variable names are called identifiers in Java. Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).


    }
}