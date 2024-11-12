package javaAssignment;

public class Solution1 {
    public static void main(String[] args) {
        int[] num_list = {5, 7, 4, 3, 2, 9};

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumA += num_list.length;
            } else {
                sumB += num_list.length;
            }

            Math.max(sumA, sumB);


        }


    }

}