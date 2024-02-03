public class DSAQue {

    // Index of an element in an array - Linear Search

    // public static int linearSearch(int arr[], int key) {
    //     // traverse in an array
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // Smallest and Largest number in an array

    // public static void printLargestSmallest(int arr[]) {
    //     int largest = Integer.MIN_VALUE; // smallest possible integer
    //     int smallest = Integer.MAX_VALUE; // largest possible integer

    //     for(int i=0; i<arr.length; i++) {
    //         if(largest < arr[i]) {
    //             largest = arr[i];
    //         }
    //         if(smallest > arr[i]) {
    //             smallest = arr[i];
    //         }
    //     }

    //     System.out.println("Largest number in a given array is " + largest);
    //     System.out.println("Smallest number in a given array is " + smallest);
    // }

    // Index of an element in an array - Binary Search

    // public static int binarySearch(int arr[], int key) {
    //     int first = 0;
    //     int last = arr.length-1;

    //     while(first <= last) {
    //         int mid = first + (last - first) / 2;

    //         if(arr[mid] == key) {
    //             return mid;
    //         } else if(arr[mid] > key) {
    //             last = mid - 1;
    //         } else {
    //             first = mid + 1;
    //         }
    //     }
        
    //     return -1;
    // }

    // Reverse an Array

    // public static void reverseArray(int arr[]) {
    //     int first = 0;
    //     int last = arr.length-1;

    //     while(first < last) {
    //         int temp = arr[last];
    //         arr[last] = arr[first];
    //         arr[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        // Arrays Part I

        // Index of an element in an array - Linear Search
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // System.out.println(linearSearch(arr, 10));

        // Smallest and Largest number in an array
        // int arr[] = {5, 8, 3, 6, 1, 9};
        // printLargestSmallest(arr);

        // Index of an element in an array - Binary Search
        // int arr[] = {2, 4, 6, 8, 10};
        // System.out.println(binarySearch(arr, 2));

        // Reverse an Array
        // int arr[] = {1, 2, 3, 4, 5};
        // reverseArray(arr);
        // printArray(arr);

        
        

        





        

    }
}