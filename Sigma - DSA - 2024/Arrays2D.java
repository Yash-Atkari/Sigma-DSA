import java.util.Scanner;

public class Arrays2D {

    // public static boolean search(int matrix[][], int key) {
    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[0].length; j++) {
    //             if(key == matrix[i][j] ) {
    //                 System.out.println("Found at cell ( " + i + ", " + j + " )");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("Key Not Found");
    //     return false;
    // }

    // public static void smallestLargestKey(int matrix[][]) {
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[0].length; j++) {
    //             largest = Math.max(largest, matrix[i][j]);
    //             smallest = Math.min(smallest, matrix[i][j]);
    //         }
    //     }
    //     System.out.println(smallest);
    //     System.out.println(largest);
    // }

    // Spiral Matrix

    // public static void spiralMatrix(int matrix[][]) {
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = matrix.length-1;
    //     int endCol = matrix[0].length-1;

    //     while(startRow <= endRow && startCol <= endCol) { // for odd n case or n*m case

    //         //top
    //         for(int j=startCol; j<=endCol; j++) {
    //             System.out.print(matrix[startRow][j] + " ");
    //         }

    //         //right
    //         for(int i=startRow+1 ; i<=endRow; i++) {
    //             System.out.print(matrix[i][endCol] + " ");
    //         }

    //         //bottom
    //         for(int j=endCol-1; j>=startCol; j--) {
    //             if(startRow == endRow) { // for odd n case
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j] + " ");
    //         }

    //         //left
    //         for(int i=endRow-1; i>=startRow+1; i--) {
    //             if(startCol == endCol) { // for odd n case
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol] + " ");
    //         }

    //         startRow++;
    //         startCol++;
    //         endRow--;
    //         endCol--;
    //     }

    //     System.out.println();
    // }

    // Diagonal Sum - O(n2)

    // public static int diagonalSum(int matrix[][]) {
    //     int sum = 0;

    //     for(int i=0; i<matrix.length; i++) {
    //         for(int j=0; j<matrix[0].length; j++) {
    //             if(i == j) {
    //                 sum += matrix[i][j];
    //             }
    //             else if(i+j == matrix.length-1) {
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }

    //     // Optimized - O(n)

    //     for(int i=0; i<matrix.length; i++) {

    //         //pd
    //         sum += matrix[i][i];
    //         //sd
    //         if(i != matrix.length-1-i) {
    //             sum += matrix[i][matrix.length-1-i];
    //         }
    //     }

    //     return sum;
    // }    

        // Search Key

        // public static boolean searchKey(int matrix[][], int key) {

        //     int row = 3, col = 0;

        //     while(row >= 0 && col < matrix.length) {
        //         if(matrix[row][col] == key) {
        //             System.out.println("Key Found at index " + "( " + row + ", " + col + ")");
        //             return true;
        //         }
        //         else if(key < matrix[row][col]) {
        //             row--;
        //         } 
        //         else {
        //             col++;
        //         }
        //     }

        //     System.out.println("Key is not Found");
        //     return false;
        // }

        // Assignment Questions - 1 

        // public static int countElement(int matrix[][], int elmt) {
        //     int countElmt = 0;

        //     for(int i=0; i<matrix.length; i++) {
        //         for(int j=0; j<matrix[0].length; j++) {
        //             if(elmt == matrix[i][j]) {
        //                 countElmt++;
        //             }
        //         }
        //     }

        //     return countElmt;
        // }

        // Assignment Questions - 2

        // public static int rowSum(int matrix[][]) {
        //     int sum = 0;
        //     int row = 1;

        //     for(int j=0; j<matrix[0].length; j++) {
        //         sum += matrix[row][j];
        //     }

        //     return sum;
        //  }

        // Assignment Questions - 3

        // public static void transposeMatrix(int row, int column, int transpose[][], int matrix[][]){

        //     for(int i=0; i<row; i++) {
        //         for(int j=0; j<column; j++) {
        //             transpose[j][i] = matrix[i][j];
        //         }
        //     }
        // }

        // public static void printArray(int matrix[][]) {

        //     for(int i=0; i<matrix.length; i++) {
        //         for(int j=0; j<matrix[0].length; j++) {
        //             System.out.print(matrix[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
            
        // }


    public static void main(String[] args) {
        
        // int matrix[][] = new int[3][3];

        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        
        // //input
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // //output
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // search(matrix, 4);
        
        // smallestLargestKey(matrix);

        // Spiral Matrix

        // int matrix[][] = {{1, 2, 3, 4}, 
        //                 {5, 6, 7, 8}, 
        //                 {9, 10, 11, 12},
        //                 {13, 14, 15, 16}};
    
        // spiralMatrix(matrix);

        // Diagonal Sum

        // int matrix[][] = {{1, 2, 3, 4}, 
        //                   {5, 6, 7, 8}, 
        //                   {9, 10, 11, 12},
        //                   {13, 14, 15, 16}};

        // System.out.println(diagonalSum(matrix));

        // Search key 

        // int matrix[][] = {{10, 20, 30, 40},
        //                   {15, 25, 35, 45},
        //                   {27, 29, 37, 48},
        //                   {32, 33, 39, 50}};

        // searchKey(matrix, 39);               

        // Assignment Questions - 1 

        // int matrix[][] = {{4, 7, 8},
        //                   {8, 8, 7}};
                 
        // System.out.println(countElement(matrix, 7));
        
        // Assignment Questions - 2

        // int matrix[][] ={{1, 4, 9},
        //                  {11, 4, 3},
        //                  {2, 2, 3}};

        // System.out.println(rowSum(matrix)); 

        // Assignment Questions - 3

        // int row = 2, column = 3;

        // int matrix[][] = {{11, 12, 13}, {21, 22, 23}};
 
        // printArray(matrix);

        // int transpose[][] = new int[column][row];

        // transposeMatrix(row, column, transpose, matrix);

        // printArray(transpose);
                           


        
        



        



        
    }
    
}
