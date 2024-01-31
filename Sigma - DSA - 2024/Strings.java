import java.util.Scanner;
import java.util.Arrays;

public class Strings { // User defined class 

    // String - inbuild class

    // public static void printLetters(String str) {

    //     for(int i=0; i<str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    // }

    // Pallindrome

    // public static boolean isPallindrome(String str) {

    //     for(int i=0; i<str.length()/2; i++) {
    //         if(str.charAt(i) != str.charAt(str.length()-1-i)) {
    //             // Not a Pallidrome
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // Get Shortest Path - O(n)

    // public static float getShortestPath(String path) {
    //     int x = 0, y = 0;

    //     for(int i=0; i<path.length(); i++) {
    //         char dir = path.charAt(i);

    //         if(dir == 'E') {
    //             x++;
    //         }
    //         else if(dir == 'W') {
    //             x--;
    //         }
    //         else if(dir == 'N') {
    //             y++;
    //         }
    //         else {
    //             y--;
    //         } 
    //     }

    //     int X2 = x*x;
    //     int Y2 = y*y;

    //     return (float) Math.sqrt(X2 + Y2); // it return value in double
    // }

    // Substring

    // public static String substring(String str, int si, int ei) {
    //     String subStr = "";

    //     for(int i=si; i<ei; i++) {
    //         subStr += str.charAt(i);
    //     }

    //     return subStr;
    // }

    // To Upper Case

    // public static String toUpperCase(String str) {

    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(str.charAt(0)); // function .toUpperCase() of class Character
    //     sb.append(ch);

    //     for(int i=1; i<str.length(); i++) {
    //         if(str.charAt(i) == ' ' && i<str.length()-1) {
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else {
    //             sb.append(str.charAt(i));
    //         }
    //     }

    //     return sb.toString();  
    // }

    // String Compression - O(n)

    // public static String compress(String str) {
    //     StringBuilder sb = new StringBuilder("");
        
    //     for(int i=0; i<str.length(); i++) {
    //         Integer count = 1;
    //         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         sb.append(str.charAt(i));
    //         if(count > 1) {
    //             sb.append(count.toString());
    //         }
    //     } 

    //     return sb.toString();
    // }

    // Assignment Question - 1

    // public static int countVowels(String str) {
    //     int count = 0;

    //     for(int i=0; i<str.length(); i++) {
    //         char ch = str.charAt(i);
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    //             count++;
    //         }
    //     }

    //     return count;
    // }


    public static void main(String[] args) {

        // Declaration of String

        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("abcd@#$123");

        // // Strings are immutable

        // Input String

        // Scanner sc = new Scanner(System.in);

        // String name = sc.next(); // .nextLine()
        // System.out.println("String = " + name);

        // length() function not property

        // String fullName = "Tony Stark"; // count space
        // System.out.println(fullName.length());

        // Concatination

        // String firstName = "Yash";
        // String lastName = "Atkari";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // charAt() function

        // String str = "Yash";
        // System.out.println(str.charAt(0));
        // printLetters(str);

        // Question 1 - Check if a string is pallidrome

        // String str = "madam";
        // System.out.println(isPallindrome(str));

        // Question 2 - Find the shortest path to reach destination

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // Comparision of two Strings - Interning Concept

        // String s1 = "Yash";
        // String s2 = "Yash"; // points toward old String
        // String s3 = new String("Yash"); // new String

        // if(s1 == s2) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // if(s1 == s3) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // == check on the basis of object

        // To check upon value - .equals()

        // if(s1.equals(s3)) {
        //     System.out.println("Equal");
        // }

        // String Function - Substring

        // String str = "HelloWorld";
        // System.out.println(substring(str, 1, 5));

        // inbuilt function
        // System.out.println(str.substring(1, 5));

        // Question 3 - Print the largest String - Lexicographic order - .compareTo() - O(x*N) - compare two strings lexicograhically(char by char)

        // String fruits[] = {"apple", "mango", "banana"}; // array

        // String largest = fruits[0];

        // for(int i=1; i<fruits.length; i++) {
        //     if(largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }
        // }

        // System.out.println(largest);

        // String Builder - .toString() - Convert object of any class into string  

        // StringBuilder sb = new StringBuilder("");

        // for(char ch='a'; ch<='z'; ch++) { // O(n2)
        //     sb.append(ch);
        // }

        // System.out.println(sb);
        // System.out.println(sb.length());

        // Question 4 - Convert each the first letter of each word to uppercase

        // String str = "hi i am yash";
        // System.out.println(toUpperCase(str));

        // Question 5 - String Compression

        // String str = "aaabbbccc";
        // System.out.println(compress(str));

        // Assignment Question - 1

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // or

        // String str = new Scanner(System.in).next();
        // System.out.println(countVowels(str));

        // Assignment Question - 2

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 ="ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // Assignment Question - 3 - immutable proof

        // String str = "ApnaCollege";
        // System.out.println(str.replace("l", ""));
        // System.out.println(str);

        // Assignment Question - 4

        // String str1 = "race";
        // String str2 = "care";

        // // Convert to Lowercase so that we don't have to check for lower and upper case
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();

        // if(str1.length() == str2.length()) {

        //     char str1CharArray[] = str1.toCharArray();
        //     char str2CharArray[] = str2.toCharArray();

        //     Arrays.sort(str1CharArray);   
        //     Arrays.sort(str2CharArray);

        //     boolean result = Arrays.equals(str1CharArray, str2CharArray);

        //     if(result) {
        //         System.out.println(str1 + " and " + str2 + " are anagrams of each other." );
        //     } else {
        //         System.out.println(str1 + " and " + str2 + " are not anagrams of each other." );
        //     }
        // } else {
        //     System.out.println(str1 + " and " + str2 + " are not anagrams of each other." );
        // }
        









    











 









    }
}
