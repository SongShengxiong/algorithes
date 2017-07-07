package me.rexsong.algorithm.sorting.insert;

import java.util.Arrays;

/**
 * Created by RexSong on 2017/6/26.
 */
public class Others {
    private static final int[] numbers = new int[]{13, 2, 5, 4, 22, 7, 3, 4, 10, 19, 8};

    public static void main(String[] args) {
        for (int i = 1; i < numbers.length; i ++) {
            for (int j = i; j > 0 && numbers[j - 1] > numbers[j]; j --) {
                int tmp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j  - 1] = tmp;
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
