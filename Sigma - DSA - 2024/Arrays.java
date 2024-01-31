import java.util.*;

public class Arrays {

    // public static void update(int marks[]) {
    //     int a=2;
    //     for(int i=0; i<marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }

    // public static int linearSearch(int numbers[], int key) {

    //     for(int i=0; i<numbers.length; i++) {
    //         if(numbers[i] == key) {
    //             return i;
    //         }
    //     }

    //     return -1;
    // } 

    // public static int get_Largest_Smallest(int numbers[]) {
    //     int largest = Integer.MIN_VALUE; // -infinity -> lowest possible integer
    //     int smallest = Integer.MAX_VALUE; // infinity -> highest possible integer

    //     for(int i=0; i<numbers.length; i++) {
    //         if(largest < numbers[i]) {
    //             largest = numbers[i];
    //         }

    //         if(smallest > numbers[i]) {
    //             smallest = numbers[i];
    //         }
    //     }

    //     System.out.println("Smallest number is: " + smallest);

    //     return largest; // Only one value is returned by the function 
    // }

    // public static int binarySearch(int numbers[], int key) {
    //     int start = 0, end = numbers.length-1;

    //     while(start <=end) {
    //         int mid = (start + end) / 2;

    //         //comparison
    //         if(numbers[mid] == key) { // found
    //             return mid;
    //         }
    //         if(numbers[mid] < key) { // Check right - 2nd half
    //             start = mid + 1;
    //         } else { // Check left - 1st half
    //             end = mid - 1;
    //         }
    //     }
    
    //     return -1;
    // }

    // public static void reverse(int numbers[]) {
    //     int first = 0, last = numbers.length-1;

    //     while(first < last) {
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }

    // public static void printPairs(int numbers[]) {
    //     int pairs = 0;

    //     for(int i=0; i<numbers.length; i++) {
    //         int curr = numbers[i];
    //         for(int j=i+1; j<numbers.length; j++) {
    //             System.out.print("(" + curr + "," + numbers[j] + ")");
    //             pairs++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs = " + pairs);
    // }

    // public static void printSubarrays(int numbers[]) {
    //     int subarrays = 0;
    //         for(int i=0; i<numbers.length; i++) {
    //             for(int j=i; j<numbers.length; j++) {
    //                 for(int k=i; k<=j; k++) {
    //                     System.out.print(numbers[k] + " ");
    //                 }
    //                 subarrays++;
    //                 System.out.println();
    //             }
    //             System.out.println();
    //         }
    //         System.out.println("Total Subarrays: " + subarrays);
    //     }            
    public static void main(String args[]) {

        // Creating an Array

        // int marks[] = new int[7];

        // int numbers[] = {1, 2, 3};

        // String fruits[] = {"apple", "mango", "orange"};

        // Length of an array

        // System.out.println("Length of an Array: " + marks.length);

        // Input/Output

        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy: " + marks[0]);
        // System.out.println("Chem: " + marks[1]);
        // System.out.println("Math: " + marks[2]);

        // Update

        // marks[2] = 100; // or marks[2] + 1;
        // System.out.println("Math: " + marks[2]);

        // Apply Mathematical Formulas 

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage: " + percentage + "%");

        // Passing Arrays as argument - Call by reference

        // int marks[] = {89, 90, 91};
        // int a = 1;
        // update(marks);

        // for(int i=0; i<marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();

        // System.out.println(a);

        // Linear Search 

        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 8;

        // int index = linearSearch(numbers, key);

        // if(index == -1) {
        //     System.out.println("Not Found");
        // } else {
        //     System.out.println("Key is at index: " + index);
        // }

        // Largest number from an array

        // int numbers[] = {45, 78, 34, 23, 56, 19, 46};
        // System.out.println("Largest number is " + get_Largest_Smallest(numbers));

        // Binary Search

        // int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 50;

        // System.out.println("Key is at index: " + binarySearch(numbers, key));

        // Reverse an array

        // int numbers[] = {1, 2, 3, 4, 5};
        // reverse(numbers);

        // // print
        // for(int i=0; i<numbers.length; i++) {
        //     System.out.print(numbers[i] + " ");
        // }

        // Pairs of an Array

        // int numbers[] = {2, 4, 6, 8, 10};

        // printPairs(numbers);

        // Subarrays of an array

        // int numbers[] = {2, 4, 6, 8, 10};

        // printSubarrays(numbers);



















    }
}