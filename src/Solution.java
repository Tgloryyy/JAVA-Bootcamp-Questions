
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] ar={8,1,2,2,3};
        int [][]arr={{1,5},{7,3},{3,5}};
//
//        System.out.println(numIdenticalPairs(ar));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(ar)));
    }

    //how many numbers are smaller then the other numbers
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smaller=0;
            for (int num : nums) {
                if (nums[i] > num) {
                    smaller++;
                }
            }

            for (int k = 0; k < nums.length; k++) {
                arr[i]=smaller;
            }
        }
        return arr;
    }


    //no of good pairs
    //https://leetcode.com/problems/number-of-good-pairs/

    static int numIdenticalPairs(int[] nums) {

        int goodpairs=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }

    // kids with the highest number of candnies
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

    static List<Boolean> highestcandies(int[] candies,int extracandies){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        Boolean arr[]=new Boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extracandies>=max){
                arr[i]=true;
            }
            else
                arr[i]=false;
        }
       return  Arrays.asList(arr);
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
