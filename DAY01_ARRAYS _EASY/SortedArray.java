import java.util.*;

public class SortedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements of the array is: ");
        for(int k: arr){
            System.out.print(k+ " ");
        }
        Solution s = new Solution();
        boolean result = s.check(arr);
        System.out.print("\nThe Second largest element of the array is: "+ result);
    }
}

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            count++;
        }

        return count <= 1;
    }
}
