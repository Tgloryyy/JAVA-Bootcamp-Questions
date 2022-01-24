
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] ar={2,3,5,1,3};
        int [][]arr={{1,5},{7,3},{3,5}};
//
        System.out.println(highestcandies(ar,5));
//        System.out.println(Arrays.toString(highestcandies(ar,5)));
    }
    // kids with the highest number of candnies
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

    static List<Boolean> highestcandies(int[] nums,int n){
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]+n;
        }
        int max=Integer.MIN_VALUE;
        Boolean arr[]=new Boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=max){
                max=nums[i];
                arr[i]=true;
            }
            else
                arr[i]=false;
        }
        return Arrays.asList(arr);
    }

    //shuffle the array
    //https://leetcode.com/problems/shuffle-the-array/

    static int[] shuffle(int[] nums, int n){
        int []arr=new int[n*2];
        int cout=0;
       for(int i=0,j=n;i<n;i++,j++){
           arr[cout++]=nums[i];
           arr[cout++]=nums[j];
       }
       return arr;
    }


    //richest customer wealth
    static int maximumwealth(int [][] accounts){
        int max=Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sum=0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum=sum+accounts[row][col];
                if(sum>max)
                    max=sum;
            }
        }
        return max;
    }
    //running sum of 1d array
    static int[] runningsum(int[] nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    //concatenation of array
    static int[]getconcatenation(int[] nums){
        int n=nums.length;
        int[] ans=new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    //build array from permutation
    static int[] buildarray(int[] nums){
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
