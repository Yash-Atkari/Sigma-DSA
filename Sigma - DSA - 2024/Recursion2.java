public class Recursion2 {

    // Tiling Problem
    // public static int tilingProblem(int n) {
    //     // base case
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }

    //     // // kaam
    //     // // verticle choice
    //     // int fnm1 = tilingProblem(n-1);

    //     // // horizontal choice
    //     // int fnm2 = tilingProblem(n-2);
        
    //     // int totalWays = fnm1 + fnm2;
    //     // return totalWays;
       
    //     // Optimized
    //     return tilingProblem(n-1) + tilingProblem(n-2);
    // }

    // Remove Duplicates in a String 
    // public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
    //     if(idx == str.length()) {
    //         System.out.println(newStr);
    //         return;
    //     }

    //     // kaam
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a'] == true) {
    //         // duplicates
    //         removeDuplicates(str, idx+1, newStr, map);
    //     } else {
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx, newStr.append(currChar), map);
    //     }
    // }

    // Friends Pairing 
    // public static int friendsPairing(int n) {
    //     if(n == 1 || n == 2) {
    //         return n;
    //     }
    //     // choice
    //     // single
    //     int fnm1 = friendsPairing(n-1);

    //     // pair
    //     int fnm2 = friendsPairing(n-2);
    //     int pairWays = (n-1) * fnm2;

    //     //totalWays
    //     int totalWays = fnm1 + pairWays;
    //     return totalWays;

    //     return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    // }

    // Binary String Problem

    // public static void printBinaryStrings(int n, String str, int lastPlace) {
    //     if(n == 0) {
    //         System.out.println(str);
    //         return;
    //     }

    //     // kaam
    //     // if(lastPlace == 0) {
    //     //     // sit 0 on chair n
    //     //     printBiaryStrings(n-1, str+"0", 0);
    //     //     printBiaryStrings(n-1, str+"1", 1); 
    //     // } else {
    //     //     printBiaryStrings(n-1, str+"0", 0);  
    //     // }

    //     printBinaryStrings(n-1, str+"0", 0);
    //     if(lastPlace == 0) {
    //         printBinaryStrings(n-1, str+"1", 1);
    //     }
    // }

    // Assignmwnt Question 1

    // public static void allOcurrences(int idx, int arr[], int key) {
    //     if(idx == arr.length) {
    //         return;
    //     }

    //     if(arr[idx] == key) {
    //         System.out.print(idx + " ");
    //     }

    //     allOcurrences(idx+1, arr, key);
    // }

    // Assignmwnt Question 2

    // public static void numToString(int n, String digit[]) {
    //     if(n == 0) {
    //         return;
    //     }
    //     int lastDigit = n % 10;
    //     numToString(n / 10, digit);
    //     System.out.print(digit[lastDigit] + " ");
    // }

    public static void main(String[] args) {

        // System.out.println(tilingProblem(4));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println( friendsPairing(3));

        // printBinaryStrings(2, "", 0);

        // Assignmwnt Question 1
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // allOcurrences(0, arr, 2);

        // Assignmwnt Question 2
        // String digit[] = {"zero", "one", "two","three", "four", "five", "six", "seven", "eight", "nine"};
        // numToString(2019, digit);

        

    
        


    }

}