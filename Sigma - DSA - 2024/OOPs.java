// public class OOPs {

//     public static void main(String[] args) {

//         // Objects are stored in Heap
//         // Pen p1 = new Pen(); // created a pen object called p1

//         // p1.setColor("Black");
//         // System.out.println(p1.getColor());

//         // p1.setTip(5);
//         // System.out.println(p1.getTip());

//         // Student s1 = new Student(); // Constructor overloading
//         // Student s2 = new Student("Yash");  // Constructor overloading
//         // Student s3 = new Student(9.61f);  // Constructor overloading
//         // s1.name = "Yash";
//         // s1.cgpa = 9.61f;
//         // s1.password = "abcd";
//         // s1.marks[0] = 100;
//         // s1.marks[1] = 95;
//         // s1.marks[2] = 98;

//         // Student s2 = new Student(s1);
//         // s2.password = "xyz";
//         // s1.marks[2] = 100;

//         // for(int i=0; i<3; i++) {
//         //     System.out.println(s2.marks[i]);
//         // }

//         // Dog bob = new Dog();
//         // bob.eat();
//         // bob.legs = 4;
//         // System.out.println(bob.legs);

//         // Calculator calc = new Calculator();
//         // System.out.println(calc.sum(1, 2));
//         // System.out.println(calc.sum(2.3f, 4.3f));
//         // System.out.println(calc.sum(1, 2, 3));

//         // Deer d = new Deer();
//         // d.eat();

//         // Horse h1 = new Horse();
//         // h1.eat();
//         // h1.walk();
//         // System.out.println(h1.color);

//         // Mustang myHorse = new Mustang();

//         // Queen q = new Queen();
//         // q.moves();

//         // Student s1 = new Student();
//         // s1.schoolName = "JMV";

//         // Student s2 = new Student();
//         // System.out.println(s2.schoolName);
        
//         // Horse h = new Horse();
//         // System.out.println(h.color);


        


//      }
// }

// class Pen { // attributes & behaviours

//     private String color;
//     private int tip;

//     String getColor() { // Getters
//         return this.color;
//     }

//     int getTip() { // Getters
//         return this.tip;
//     }

//     void setColor(String color) { // Setters
//         this.color = color;
//     }

//     void setTip(int tip) { // Setters
//         this.tip = tip;
//     }
// }

// class Student { // attributes & behaviours

//     // String name;
//     // float cgpa;
//     // String password;
//     // int marks[];

//     // shallow copy constructor
//     // Student(Student s1) { 
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.cgpa = s1.cgpa;
//     //     this.marks = s1.marks;
//     // }

//     // deep copy constructor
//     // Student(Student s1) {
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.cgpa = s1.cgpa;
//     //     for(int i=0; i<marks.length; i++) {
//     //         this.marks[i] = s1.marks[i];
//     //     }
//     // }

//     // Lazy Copy

//     // Student() { // Non-parameterized constructor
//     //     this.marks= new int[3];
//     //     System.out.println("Constructor called...");
//     // }

//     // Student(String name) { // Parameterized constructor
//     //     this.marks = new int[3];
//     //     this.name = name;
//     // }

//     // Student(float cgpa) {
//     //     this.marks = new int[3];
//     //     this.cgpa = cgpa;

//     // }
// }

// Base / Parent class
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }
 
// Derived / Child class / sub class
// class Mammal extends Animal { // Single level Inheritance
//     int legs;
// }

// class Dog extends Mammal { // Multi level inheritance
//     String breed;
// }

// class Calculator {

//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// class Animal {
//     void eat() {
//         System.out.println("eat anything");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("eat grass");
//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         System.out.println("Animal constructor called...");
//     }


//     void eat() {
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     Horse() {
//         System.out.println("Horse constructor called...");
//     }

//     void changeColor() {
//         color = "dark brown";
//     }

//     void walk() {
//         System.out.println("Walks on 4 leg");
//     }
// }

// class Mustang extends Horse {
//     Mustang() {
//         System.out.println("Mustang consructor called...");
//     }
// }

// class Chicken extends Animal {
//     void changeColor() {
//         color = "yellow";
//     }

//     void walk() {
//         System.out.println("walk on 2 leg");
//     }
// }

// Interfaces 

// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal - (by one step)");
//     }
// }

// Multiple Inheritance

// interface Herbivores {

// }

// interface Carnivore {

// }

// class Bear implements Herbivores, Carnivore {

// }

// Static keyword

// class Student {
//     String name;
//     int roll;

//     static String schoolName;

//     static int returnpercentage(int math, int phy, int chem) {
//         return (math + phy + chem) / 3;
//     }

//     void setName(String name) {
//         this.name = name;
//     }

//     String getName(String name) {
//         return this.name;
//     }
// }

// class Animal {
//     String color;
//     Animal() {
//         System.out.println("animal constructor is called...");
//     }
// }

// class Horse extends Animal {
//     Horse() {
//         super.color = "brown";
//         System.out.println("horse constructor is called...");
//     }
// }

// Constructor Chaining

// Practice Question 1
// Ans - s.name = "aman";

// Practice Question 2
// Ans - name, weight

// Practice Question 3
// Ans - private and protected are not allowed in front of the class - unusable 

// Practice Question 4
// Ans - a, b, c - left side: Reference Variable & right side: Object Creation or Memory Allocation

// Practice Question 5
// Ans - 1. Derived class 2. Base class // Method Overriding 

// Practice Question 6
// Ans - 1. Error 2.Base Class 

// Practice Question 7
// Ans - d. Aggregation

// Practice Question 8
// Ans - 0 2 - static variable - Common for every object of class - We can access static var with class name also

// Practice Question 9
// Ans - No Error

// Practice Question 10
// Ans - 40

// Assignment Questions 1

import java.util.Scanner;

public class OOPs {
    public static void main(String[] args) {

        int i =  (int) Math.sqrt(-1);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        Complex cm = new Complex();
        System.out.println(cm.sum(a, b, c, d, i));
        System.out.println(cm.difference(a, b, c, d, i));
        System.out.println(cm.product(a, b, c, d, i));
    }
}

class Complex {

    int sum(int a, int b, int c, int d, int i) {
        return (a + (b*i)) + (c + (d*i));
    }

    int difference(int a, int b, int c, int d, int i) {
        return (a + (b*i)) - (c + (d*i));
    }

    int product(int a, int b, int c, int d, int i) {
        return (a + (b*i)) * (c + (d*i));
    }
}
















