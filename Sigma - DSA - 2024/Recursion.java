public class Recursion {

    // Print numbers from n to 1 (Dec ord)
    // public static void printDec(int n) {
    //     if(n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDec(n-1);
    // }

    // Print numbers from 1 to n (Inc ord)
    // public static void printInc(int n) {
    //     if(n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.println(n);
    // }

    // Factorial of a number n
    // public static int fact(int n) {
    //     if(n == 0) {
    //         return 1;
    //     }

    //     return n * fact(n-1);
    // }

    // Sum of first n natural numbers
    // public static int sum(int n) {
    //     if(n == 1) {
    //         return 1;
    //     }

    //     return sum(n-1) + n;
    // }

    // Print n Fibonaccci number
    // public static int fibo(int n) {
    //     if(n == 0 || n == 1) {
    //         return n;
    //     }
        
    //     return fibo(n-1) + fibo(n-2);
    // }

    // Check sorted or not
    // public static boolean isSorted(int arr[], int i) {
    //     if(i == arr.length-1) {
    //         return true;
    //     }
    //     if(arr[i] < arr[i+1]) {
    //         return isSorted(arr, i+1);
    //     }
    //     return false;
    // }

    // First occurence of an element in an array
    // public static int firstOccurence(int arr[], int key, int i) {
    //     if(i == arr.length) {
    //         return -1;
    //     }
    //     if(arr[i] == key) {
    //         return i;
    //     }

    //     return firstOccurence(arr, key, i+1);
    // }

    // First occurence of an element in an array
    // public static int lastOccurence(int arr[], int key, int i) {
    //     if(i == arr.length) {
    //         return -1;
    //     }
    //     int isFound = lastOccurence(arr, key, i+1);

    //     if(isFound == -1 && arr[i] == key) {
    //         return i;
    //     }
        
    //     return isFound;
    // }

    // Print x^n
    // public static int xpown(int x, int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     return xpown(x, n-1) * x;
    // }

    // Print x^n (Optimized) - O(log n)
    // public static int optimizedPower(int a, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     int halfPower = optimizedPower(a, n/2);
    //     int halfPowerSq = halfPower * halfPower ;

    //     // n is odd
    //     if(n % 2 != 0) {
    //         halfPowerSq = a * halfPowerSq;
    //     }

    //     return halfPowerSq;
    // }
    public static void main(String[] args) {

        // int n = 10;
        // printDec(n);

        // int n = 10;
        // printDec(n);

        // System.out.println(fact(5));

        // System.out.println(sum(5));

        // System.out.println(fibo(5));

        // int arr[] = {1, 2, 3, 4};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr, 5, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(lastOccurence(arr, 5, 0));

        // System.out.println(xpown(2, 10));

        // int a = 2;
        // int n = 5;
        // System.out.println(optimizedPower(a, n));






         


        
    }
}
