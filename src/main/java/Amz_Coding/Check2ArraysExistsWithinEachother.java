package Amz_Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Check2ArraysExistsWithinEachother {

    //Two arrays and make sure each number in the first array is exists in the second array

    public static void main(String[] args) {

Integer [] a  = {2, 1, 3, 8};
Integer [] b = {1, 2, 3, 4, 5};

        System.out.println(test(a, b));


    }

    public static boolean test(Integer [] a, Integer [] b) {

        Set<Integer> list1 = new HashSet<>(Arrays.asList(a));
        Set<Integer> list2 = new HashSet<>(Arrays.asList(b));

        for (Integer each : list1) {
            if (!list2.contains(each)) {
                return false;
            }
        }

        return true;
    }

}
