package com.company;

// create an aaray of 5 floats and calculate there sum.
public class cwp_ch6_04_ps1 {
    public static void main(String[] args) {
      /*  float[] marks = {45.6f,33.4f,78.5f,87.6f,76.4f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

       */

// write a program to find out whether a given integer is present in an array or not
       /* float[] marks = {45.6f,33.4f,78.5f,87.6f,76.4f};
        float num = 78.5f;
        boolean isInArray = false;
        for(float element: marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
            if(isInArray){
                System.out.println("The value is present in the Array");
            }
            else
            {
                System.out.println("The value is not present in the Array");
            }


        */
/* calculate te average marks from an array cotaining marks of all students in
 physics using for-each-loop */
      /*  float[] marks = {45.6f, 33.4f, 78.5f, 87.6f, 76.4f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum / marks.length);

       */


        // create a program to add two matrix of size 2*3

         int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of time
            for(int j=0;j<mat1[i].length;j++){  // column number of time
                System.out.format("setting value for i=%d and j=%d\n",i,j);
            }
        }
        // printing the element of a 2-D Array
        for(int i = 0; i < mat1.length; i++) { // row number of time
            for (int j = 0; j < mat1[i].length; j++) {  // column number of time
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

        }
    }