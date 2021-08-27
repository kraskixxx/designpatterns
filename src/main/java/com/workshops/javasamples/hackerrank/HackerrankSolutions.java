package com.workshops.javasamples.hackerrank;

public class HackerrankSolutions {

    /**
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     * @param arr
     * @return Math.abs(left_to_right-right_to_left)
     */
    static int diagonalDifference(int[][] arr){

        int left_to_right = 0;
        int right_to_left = 0;

        int rows = arr.length;
        int cols = arr[0].length;

        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.length-1;

        while (i<rows && j<cols && k<rows && l>=0) {
            System.out.println("[i][j] => " + arr[i][j]);
            System.out.println("[k][l] => " + arr[k][l]);
            left_to_right += arr[i][j];
            right_to_left += arr[k][l];
            i+=1;
            j+=1;
            k+=1;
            l-=1;

            System.out.println("Left_to_right => " + left_to_right);
            System.out.println("Right_to_left => " + right_to_left);

            System.out.println("i => " +i + " j => " +j + " k=> " +k + " l => " +l);
        }

        return Math.abs(left_to_right-right_to_left);

    }

    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5,6 }, { 9, 8,9 } };
        int diagonalDifference = diagonalDifference(myArray);
        System.out.println("Diagonal difference => " + diagonalDifference);
    }
}
