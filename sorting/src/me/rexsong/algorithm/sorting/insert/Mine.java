package me.rexsong.algorithm.sorting.insert;

import java.util.Arrays;

/**
 * Created by RexSong on 2017/6/26.
 */
public class Mine {
    private static final int[] numbers = new int[]{13, 2, 5, 4, 22, 7, 3, 4, 10, 19, 8};

    public static void main(String[] args) {
        for (int i = 1; i < numbers.length; i ++) {
            int from = _binarySearch(numbers, numbers[i], 0, i - 1);
            int tmp = numbers[i];
            for (int j = i; j > from; j --) {
                numbers[j] = numbers[j - 1];
            }
            numbers[from] = tmp;
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println(Arrays.toString(numbers));

    }

    private static int _binarySearch(int[] data, int origin, int left, int right) {
        if (left == right) {
            return data[left] < origin ? left + 1 : left;
        }

        if ((left == right - 1)) {
            return data[left] > origin ? left : data[right] > origin ? right : right + 1;
        }

        int mid = (left + right)/2;
        if (mid == 0) {
            return data[left] > origin ? 0 : data[right] > origin ? 1 : 2;
        }

        int newLeft = left;
        int newRight = right;
        if (data[mid] > origin) {
            newRight = mid;
        } else {
            newLeft = mid;
        }

        return _binarySearch(data, origin, newLeft, newRight);
    }

}
