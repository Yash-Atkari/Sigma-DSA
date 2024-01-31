public class BitManipulation {

    // public static void oddOrEven(int n) {
    //     int bitMask = 1;

    //     if((n & bitMask) == 0) { // Even
    //         System.out.println("Even number");
    //     } else {
    //         System.out.println("Odd number");
    //     }
    // }

    // Get ith Bit

    // public static int getIthBit(int n, int i) {
    //     int bitMask = 1<<i;

    //     if((n & bitMask) == 0) {
    //         return 0;
    //     } else {
    //         return 1;
    //     }
    // }

    // Set ith Bit

    // public static int setIthBit(int n, int i) {
    //     int bitMask = 1<<i;
    //     return (n | bitMask);
    // }

    // Clear ith Bit

    // public static int clearIthBit(int n, int i) {
    //     int bitMask = ~(1<<i);
    //     return n & bitMask;
    // }

    // Update ith bit

    // public static int updateIthBit(int n, int i, int newBit) {
    //     if(newBit == 0) {
    //         return clearIthBit(n, i);
    //     } else {
    //         return setIthBit(n, i);
    //     }

        // n = clearIthBit(n, i); 
        // int bitMask = newBit<<i;
        // return n | bitMask;
    // }

    // Clear last i bits

    // public static int clearIBits(int n, int i) {
    //     int bitMask = (~0)<<i;
    //     return n & bitMask;
    // }

    // clear Range of bits

    // public static int clearRangeBits(int n, int i, int j) {
    //     int a = ((~0)<<(j+1));
    //     int b = (1<<i) - 1;
    //     int bitMask = a | b;
    //     return n & bitMask;
    // }

    // Power of two or not

    // public static boolean isPowerOfTwo(int n) {
    //     return (n & (n-1)) == 0;
    // }

    // Count Set Bits in a number

    // public static int countSetBits(int n) {
    //     int count = 0;

    //     while(n > 0) {
    //         if((n & 1) != 0) {
    //             count++;
    //         }
    //         n = n>>1;
    //     }

    //     return count;  
    // }

    // Fast Exponentiation - O(log n)

    // public static int fastExpo(int a, int n) {
    //     int ans = 1;

    //     while(n > 0) {
    //         if((n & 1) != 0) {
    //             ans = ans * a;
    //         }
    //         a = a * a;
    //         n = n>>1;
    //     }

    //     return ans;
    // }

    // Modular Exponentiation

    // Practice Question 1

    
    public static void main(String[] args) {

        // // Binary AND &
        // System.out.println(5 & 6);

        // // Binary OR |
        // System.out.println(5 | 6);

        // // Binary XOR ^
        // System.out.println(5 ^ 6);

        // // Binary One's Complement ~ (NOT)
        // System.out.println(~5);
        // System.out.println(~0);

        // // Binary LEFT Shift <<
        // System.out.println(5 << 2);

        // // Binary RIGHT Shift >>
        // System.out.println(6 >> 1); 

        // oddOrEven(1893);

        // System.out.println(getIthBit(10, 2));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1) );

        // System.out.println(updateIthBit(10, 2, 0));

        // System.out.println(clearIBits(15, 2));

        // System.out.println(clearRangeBits(10, 2, 4));

        // System.out.println(isPowerOfTwo(57));

        // System.out.println(countSetBits(15));

        // System.out.println(fastExpo(5, 3));

        // Practice Question 1 

        // System.out.println(5 ^ 5);

        // Practice Question 2 - XOR Swap Algorithm

        // int x = 3, y = 4;
        // System.out.println("Before swap: x = " + x + " and y = " + y);
        // //swap using xor
        // x = x ^ y;
        // y = x ^ y;
        // x = x ^ y;
        // System.out.println("After swap: x = " + x + " and y = " + y);

        // Practice Question 3

        // int x = 6;
        // System.out.println(x + " + " + 1 + " is " + -~x);
        // x = -4;
        // System.out.println(x + " + " + 1 + " is " + -~x);
        // x = 0;
        // System.out.println(x + " + " + 1 + " is " + -~x);

        // Practice Question 4

        // // Convert uppercase to lowercase 
        // for(char ch = 'A'; ch<='Z'; ch++) {
        //     System.out.print((char) (ch | ' '));
        // }



    }
    
}
