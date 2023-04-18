package Amz_Coding;

import java.util.Arrays;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int [] arr = {2,  3, 6, 8, 10};
        int num = arr.length;

        System.out.println(generalizedGCD(num, arr));

    }
public static int generalizedGCD(int num, int[] arr) {
    Arrays.sort(arr);

    int min = arr[0];
    int max = arr[arr.length-1];
    int res = 0;

    for (int i = 1; i < max; i++) {
        if (min % i == 0 && max % i == 0) {
            res = i;
        }
    }

    for (int each : arr) {
        if (each % res != 0) {
            return 1;
        }
    }

    return res;
}

}
