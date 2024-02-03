import java.util.Arrays;

public class DSASheet {

    // 375 DSA SHEET EXTRA QUE PRACTICE

    //1 public static int findSum(int n, int arr[]) { 

    //     int min = Integer.MAX_VALUE; 
    //     int max = Integer.MIN_VALUE;
        
    //     for(int i=0; i<arr.length; i++) {
    //         if(min > arr[i]) {
    //             min = arr[i];
    //         }

    //         if(max < arr[i]){
    //             max = arr[i];
    //         }
    //     }

    //     return min + max;
    //     }

    //2 public static void reverse_Array(int arr[]) {
    //     int first = 0;
    //     int last = arr.length - 1;

    //     while(first < last) {
    //         int temp = arr[last];
    //         arr[last] = arr[first];
    //         arr[first] = temp;

    //         first++;
    //         last--;
    //     }
    
    // }

    //3 public static int maxSubArray(int arr[]) {
    //     int sum = 0;
    //     int maxSum = arr[0];

    //     for(int i=0; i<arr.length; i++) {

    //         sum = sum + arr[i];
    //         maxSum = Math.max(maxSum, sum);

    //         if(sum < 0) {
    //             sum = 0;
    //         }
    //     }
    //     return maxSum;
    // }

    //4 public static boolean containsDuplicate(int arr[]) {

    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(arr[i] == arr[j]) {
    //                 return true; // There is no sense of break after return statement
    //             }                // return statement terminates the function
    //         }
    //     }
    //     return false;  
    // } 

    // Best Approach

    // public static boolean containsDuplicate(int arr[]) {
    //     Arrays.sort(arr); 
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] == arr[i+1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }


    public static void main(String args[]) {

        // int n = 5;
        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println("Sum of min and max in an array is " + findSum(n, arr));


        // int arr[] = {1, 2, 3, 4, 5};
        // reverse_Array(arr);

        // print
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
        // int arr[] = {-1, 2, 6, -4};
        // System.out.println(maxSubArray(arr));

        // int arr[] = {4, 2, 3, 1};
        // System.out.println(containsDuplicate(arr));


    }
}
