import java.util.*;

public class Array {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        swap(arr,2,5);
        System.out.println(max(arr,2,5));
        System.out.println(Arrays.toString(arr));
    }

    //method for revese
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    //method for Swap.
    static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }

//    method for maximum value in an Array
    static int max(int[] arr, int start, int end){
        int largest= arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
