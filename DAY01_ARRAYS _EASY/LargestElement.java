import java.util.*;
public class LargestElement{
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
        int maximum = s. Largest(arr);
        System.out.print("\nThe largest element of the array is: "+ maximum);
    }
}

class Solution {
    public int Largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}