package org.campus02.arrays;

import java.util.Arrays;

public class ArraySortDemo {


    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 1, 9, 15, 76};

        for ( int i : numbers) {
            System.out.println(i);
        }

        System.out.println(numbers[0]);

        System.out.println();

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);

        System.out.println();

        char[] chars = {'c', 'a', 'b'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));


    }


}
