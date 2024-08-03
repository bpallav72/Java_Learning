package com.company;

// write a java program to reverse an Array
public class cwp_ch6_04_ps2 {
    public static void main(String[] args) {
       /* int[] arr = {7,9,12,11};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++) {
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for(int element :arr){
            System.out.print(element + " ");
        }
        */
// write a java program to find the maximum element in array.
       /* int[] arr = {1,21,3,455,5,34,67};
        int max = Integer.MIN_VALUE;
        for(int e :arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);

        */
// write a java program to find the minimum element in an array
/*
        int[] arr = {5,21,3,455,5,34,67};
        int max = Integer.MAX_VALUE;
        for(int e :arr){
            if(e<max){
                max = e;
            }
        }
        System.out.println("The value of the minimum element in this array is: " + max);

 */
 // write a java program to find whether an array is sorted or not.
        boolean isSorted = true;
        int[] arr = {1,2,3,4,5,34,67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
               isSorted = false;
               break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("This Array is not sorted");
        }



    }
}
