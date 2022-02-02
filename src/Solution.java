
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3};
        int target=1;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }


    //Find the first and the last element
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    //Find smallest letter greatest than the largest
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }

    //Binary search Algorithm.
    //https://leetcode.com/problems/binary-search/submissions/

    static int binary(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isasc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isasc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if (target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if (target>arr[mid]){
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    //how many numbers are smaller then the other numbers
    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    static int[] smallerNumbersThanCurrent(int[] nums) {

        int arr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smaller=0;
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
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
