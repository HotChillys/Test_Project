package Amazon_Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test2 {


    public static long findMaxProducts( List<Integer> products) {

        Collections.sort(products);

        int count = 0;
        count += products.get(products.size()-1);

        for (int i = products.size()-1; i > 0; i--) {


            if (products.get(i) > products.get(i-1)) {
                count += products.get(i-1);
            }

        }
        System.out.println(products);


return count;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 9, 4, 7, 5, 2);


        System.out.println(findMaxProducts(list));
    }


}
