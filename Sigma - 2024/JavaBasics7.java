public class JavaBasics7 {

    // public static void hollow_rectangle(int rows, int cols) {

    //     for(int i=1; i<=rows; i++) { // Outer loop

    //        for(int j=1; j<=cols; j++) { // Inner loop
    //            if(i == 1 || i == rows || j == 1 || j == cols) {
    //                System.out.print("*");
    //            } else {
    //                System.out.print(" ");
    //            }
    //        }

    //         System.out.println();
    //     }
    // }


    // public static void inverted_rotated_half_pyramid(int n) {

    //     for(int i=1; i<=n; i++) {

    //         // spaces
    //         for(int j=1; j<=n-i; j++) {
    //             System.out.print(" ");
    //         }

    //         // stars
    //         for(int j=1; j<=i; j++) {
    //             System.out.print("*");
    //         }

    //         System.out.println();

    // }
    // }

    // public static void inverted_half_pyramid_numbers(int n) {

    //     for(int i=1; i<=n; i++) {

    //         for(int j=1; j<=n-i+1; j++) {
    //             System.out.print(j);
    //         }

    //         System.out.println();
    //     }
    // }

    // public static void floyds_Triangle(int n) {
    //     int num = 1;

    //     for(int i=1; i<=n; i++) {

    //         for(int j=1; j<=i; j++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }

    //         System.out.println();

    //     }
    // }

    // public static void binay_Triangle(int n) {
    //     for(int i=1; i<=n; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if((i+j) % 2 == 0) {
    //                 System.out.print(1);
    //             } else {
    //                 System.out.print(0);
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

        // public static void butterfly(int n) {

        // 1st Half
        // for(int i=1; i<=n; i++) {

        //     // stars i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     // spaces 2 * (n-1)
        //     for(int j=1; j<=2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     // star i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        
        //     System.out.println(); 
        // }

        // // 2nd Half
        // for(int i=n; i>=1; i--) {

        //     // stars i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     // spaces 2 * (n-1)
        //     for(int k=1; k<=2*(n-i); k++) {
        //         System.out.print(" ");
        //     }
        //     // star i
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        
        //     System.out.println(); 
        // }

        // public static void solid_Rhombus(int n) {
        //     for(int i=1; i<=n; i++) {

        //         // spaces
        //         for(int j=1; j<=(n-i); j++) {
        //             System.out.print(" ");
        //         }

        //         // stars
        //         for(int j=1; j<=n; j++) {
        //             System.out.print("*" + " ");
        //         }

        //         System.out.println();
        //     }
        // }

        // public static void hollow_rhombus(int n) {
            
        //     for(int i=1; i<=n; i++) {
        //         // spaces
        //         for(int j=1; j<=n-i; j++) { 
        //             System.out.print(" ");
        //         }

        //         // hollow rectangle
        //         for(int j=1; j<=n; j++) { // Inner loop
        //             if(i == 1 || i == n || j == 1 || j == n) {
        //                 System.out.print("*");
        //             } else {
        //                 System.out.print(" ");
        //             }
        //         }

        //         System.out.println();
        //     }
        // }

        // public static void diamond(int n) {
        //     // 1st half
        //     for(int i=1; i<=n; i++) {
        //         // spaces
        //         for(int j=0; j<=n-i; j++) {
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for(int j=1; j<=(2*i)-1; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println();
        //     }

        //     // 2nd half
        //     for(int i=n; i>=1; i--) {
        //         // spaces
        //         for(int j=0; j<=n-i; j++) {
        //             System.out.print(" ");
        //         }
        //         // stars
        //         for(int j=1; j<=(2*i)-1; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println();
        //     }
        // }

    

    public static void main(String args[]) {

        // Advanced patterns

        // hollow_rectangle(4, 5);

        // inverted_rotated_half_pyramid(5);

        // inverted_half_pyramid_numbers(5);

        // floyds_Triangle(5);

        // binay_Triangle(5);

        // butterfly(10);

        // solid_Rhombus(6);

        // hollow_rhombus(5);

        // diamond(5);
        
        
    }
}
