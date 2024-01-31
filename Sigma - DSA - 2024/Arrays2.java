import java.util.Arrays;

public class Arrays2 {

    // Max Subarray Sum - Brute Force - TC - O(n3)

    // public static int maxSubarraySum(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //         for(int i=0; i<numbers.length; i++) {
    //             for(int j=i; j<numbers.length; j++) {
    //                 currSum = 0;
    //                 for(int k=i; k<=j; k++) {
    //                     currSum = currSum + numbers[k];
    //                 }
    //                 System.out.println(currSum);
    //             if(maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //             }
    //         }
    //         return maxSum;
    //     }

    // Max Subarray Sum - Prefix Sum - TC - O(n2)

    // public static int maxSubarraySum(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     prefix[0] = numbers[0];

    //     for(int i=1; i<numbers.length; i++) {
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=0; i<numbers.length; i++) {
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++) {
    //             int end = j;
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
    //             if(maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     return maxSum;
    //     }

    // Max Subarray Sum - Kadanes Algorithm - TC - O(n)

    // public static void Kadanes(int numbers[]) {
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;

    //     for(int i=0; i<numbers.length; i++) {
    //         cs = cs + numbers[i];
    //         if(cs < 0) {
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }

    //     System.out.println("Our max subarray sum is " + ms);
    // }

    // Trapping Rainwater // O(n)

    // public static int trappedRainwater(int height[]) {
    //     int n = height.length;
    //     // calculate left max boundary
    //     int leftMax[] = new int[n];

    //     leftMax[0] = height[0];
    //     for(int i=1; i<n; i++) {
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }

    //     // calculate right max boundary
    //     int rightMax[] = new int[n];

    //     rightMax[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappedWater = 0;
    //     // loop
    //     for(int i=0; i<n; i++) {
    //         // waterLevel = min(leftmax bound, rightmax bound)
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);

    //         // trappedWater = waterLevel - height[i];
    //         trappedWater += waterLevel - height[i];
    //     }

    //     return trappedWater;

    // Buy and Sell Stocks // O(n)

    // public static int buyAndSellStocks(int prices[]) {
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i=0; i<prices.length; i++) {
    //         if(buyPrice < prices[i]) { // profit
    //             int profit = prices[i] - buyPrice; // today's profit
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = prices[i];

    //         }
    //     }

    //     return maxProfit;
    // }

    // *Assignment Questions

    // 1 Contain Duplicates

    // Brute Force - O(n2)

    // public boolean containsDuplicate(int nums[]) {
    //     for(int i=0; i<nums.length-1 ; i++) {
    //         for(int j=i+1; j<nums.length ; j++ ) {
    //             if( nums[i] == nums[j] ) {
    //                 return true ;
    //             } 
    //         } 
    //     } 
    //     return false; 
    // }

    // or

    // O(n)
    
    // public static boolean containsDuplicate(int nums[]) {
    //     Arrays.sort(nums);
    //     for(int i=0; i<nums.length-1; i++) {
    //         if(nums[i] == nums[i+1]) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // 2 Search target - Binary search - array must be sorted

    // public static int search(int nums[], int target) {

    //     int min = minSearch(nums);

    //     if(nums[min] <= target && target <= nums[nums.length-1]) {
    //         return binarySearch(min, nums.length-1, nums, target);
    //     } else {
    //         return binarySearch(0, min, nums, target);
    //     }
    // }

    // public static int binarySearch(int left, int right, int nums[], int target) {

    //     int l = left;
    //     int r = right;

    //     while(l <= r) {
    //         int mid = l + (r - l) / 2; // *Good practice to calculate mid prevent integer overflow

    //         if(nums[mid] == target) {
    //             return mid;
    //         } else if (nums[mid] > target) {
    //             r = mid-1;
    //         } else {
    //             l = mid+1;
    //         }
    //     }

    //     return -1;
    // }

    // public static int minSearch(int nums[]) {
    //     int left = 0;
    //     int right = nums.length-1;

    //     while(left < right) {
    //         int mid = left + (right - left) / 2;

    //         if(mid > 0 && nums[mid-1] > nums[mid]) {
    //             return mid;
    //         }    
    //         else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
    //             left = mid + 1;
    //         }   
    //         else {
    //             right = mid - 1;
    //         }
    //     }
    //     return left;
    // }

    // 3 Maximum Profit in Stocks

    // public static int maxProfit(int prices[]) {
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i=0; i<prices.length; i++) {
    //         if(buyPrice < prices[i]) {
    //             int profit = prices[i] - buyPrice;
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = prices[i];
    //         }
    //     }
    //     return maxProfit; 
    // }

    // 4 Trapped Rainwater

    // public static int trappedRainwater(int height[]) {
    //     int n = height.length;
    //     // leftMax boundary
    //     int leftMax[] = new int[n];

    //     leftMax[0] = height[0];
    //     for(int i=1; i<n; i++) {
    //         leftMax[i] = Math.max(height[i], leftMax[i-1] ); 
    //     }

    //     // rightMax boundary
    //     int rightMax[] = new int[n];

    //     rightMax[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappedWater = 0;
    //     // loop
    //     for(int i=0; i<=n-1; i++) {
    //         // waterLevel
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
    //         // trappedWater
    //         trappedWater += waterLevel - height[i];
    //     }
        
    //     return trappedWater;
    // }

    public static void main(String args[]) {

        // int numbers[] = {1, -2, 6, -1, 3};
        // System.out.println("Max sum is " + maxSubarraySum(numbers));

        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // Kadanes(numbers);

        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trappedRainwater(height));

        // int prices[] = {7, 1, 5, 3, 6, 4};
        // System.out.println(buyAndSellStocks(prices));

        // Assignment Question 1

        // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // System.out.println(containsDuplicate(nums));

        // Assignment Question 2

        // int nums[] = {4, 5, 6, 7, 0, 1, 2}; // rotated sorted array
        // System.out.print(search(nums, 4));

        // Assignment Question 3

        // int prices[] = {7, 6, 4, 3, 1};
        // System.out.println("Max Profit is " + maxProfit(prices));

        // Assignment Question 4

        // int height[] = {4, 2, 0, 3, 2, 5};
        // System.out.println("Trapped Rainwater is " + trappedRainwater(height));

        // Assignment Question 5



        



        


    }

}
