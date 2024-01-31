import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

    // Bubble Sort - O(n2)

    // public static void bubbleSort(int arr[]) {
    //     for(int turn=0; turn<arr.length-1; turn++) {
    //         for(int j=0; j<arr.length-1-turn; j++) {
    //             if(arr[j] > arr[j+1]) {
    //                 //swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Selection Sort - O(n2)

    // public static void selectionSort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++) {
    //         int minPos = i;
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(arr[minPos] > arr[j]) {
    //                 minPos = j; 
    //             }
    //         }
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }

    // Insertion sort - O(n2)

    // public static void insertionSort(int arr[]) {
        
    //     for(int i=1; i<arr.length; i++) {
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev>=0 && arr[prev] > curr) {
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1] = curr;

    //     }
    // }

    // Counting Sort

    // public static void countingSort(int arr[]) {
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         largest = Math.max(largest, arr[i]);
    //     }

    //     int count[] = new int [largest+1];
    //     for(int i=0; i<arr.length; i++) {
    //         count[arr[i]]++;
    //     }

    //     // sorting
    //     int j = 0;
    //     for(int i=0; i<count.length; i++) {
    //         while(count[i] > 0) {
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }

    // Practice Question - 1

    // public static void bubbleSort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++) {
    //         for(int j=0; j<arr.length-1-i; j++) {
    //             if(arr[j] < arr[j+1]) {
    //                 int temp = arr[j+1];
    //                 arr[j+1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    // }

    // Practice Question - 2

    // public static void selectionSort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++) {
    //         int maxPos = i;
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(arr[maxPos] < arr[j]) {
    //                 maxPos = j;
    //             }
    //         }
    //         int temp = arr[maxPos];
    //         arr[maxPos] = arr[i];
    //         arr[i] = temp;

    //     }
    // }

    // Practice Question - 3

    // public static void insertionSort(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         int curr = arr[i];
    //         int prev = i-1;

    //         while(prev>=0 && arr[prev] < curr) {
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1] = curr;
    //     }
    // }

    // Practice Question - 4

    // public static void countingSortDescending(int arr[]) {
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         largest = Math.max(largest, arr[i]);
    //     }
    
    //     int count[] = new int[largest+1];
    //     for(int i=0; i<arr.length; i++) {
    //         count[arr[i]]++;
    //     }
    
    //     int j = 0;
    //     for(int i=count.length-1; i>=0; i--) {
    //         while(count[i] > 0) {
    //             arr[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }
    public static void main(String args[]) {

        // int arr[] = {4, 2, 3, 5, 1}; // Check for sorted array - O(n2) make var swap=0 before inner loop and swap++
        // bubbleSort(arr);
        // printArray(arr); // Try for O(n)

        // int arr[] = {5, 4, 3, 1, 2};
        // selectionSort(arr);
        // printArray(arr); // Try for O(n)

        // int arr[] = {5, 4, 1, 3, 2};
        // insertionSort(arr);
        // printArray(arr);

        // Inbuilt Sort - O(n log n)

        // Integer arr[] = {2, 3, 1, 4, 5};
        // Inbuilt sort

        // Arrays.sort(arr);
        // printArray(arr);

        // Arrays.sort(arr, 0, 3);
        // printArray(arr);

        // In descending order
        
        // Arrays.sort(arr, Collections.reverseOrder()); // Work on objects, we have to convert the given arr into obj of class Integer
        // printArray(arr);

        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        // printArray(arr);

        // int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        // countingSort(arr);
        // printArray(arr);

        // Practice Question

        // int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // countingSortDescending(arr);
        // printArray(arr);

    }
}

