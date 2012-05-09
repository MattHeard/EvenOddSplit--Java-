/*
 * EvenOddSplit.java
 *
 * Version 0.1
 *
 * 2012/05/09
 *
 * Copyright (c) 2012 Matt Heard.
 */

/**
 *
 * Rearrange an int arry to list all even members before all odd members in
 * linear time with a constant amount of extra space.
 *
 * @version 0.1 2012/05/09
 * @author  Matt Heard
 */

public class EvenOddSplit {

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] test = {};              // TEST: Array length = 0
//        int[] test = {0};             // TEST: Array length = 1
//        int[] test = {0, 2, 4, 6};    // TEST: Array all even
//        int[] test = {1, 3, 5, 7};    // TEST: Array all odd
        System.out.print("Before: ");
        for (int i = 0; i < test.length; i++)
            System.out.print(test[i] + " ");
        System.out.println();
        System.out.print("After:  ");

        test = evenOddSplit(test);
        for (int i = 0; i < test.length; i++)
            System.out.print(test[i] + " ");
        System.out.println();
    }

    public static int[] evenOddSplit(int[] array) {
        int swap;
        int even_index = 0;
        int odd_index = array.length - 1;
        while (even_index < odd_index) {
            while (array[even_index] % 2 == 0 && even_index < odd_index)
                even_index++;
            while (array[odd_index] % 2 == 1 && even_index < odd_index)
                odd_index--;
            if (even_index < odd_index) {
                swap = array[even_index];
                array[even_index] = array[odd_index];
                array[odd_index] = swap;
            }
        }
        return array;
    }
}
