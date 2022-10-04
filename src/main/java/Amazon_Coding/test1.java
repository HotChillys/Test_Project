package Amazon_Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test1 {

    public static int countFamilyLogins(List<String> logins) {

        int count = 0;
        String a = "";

        for (String eachFamily : logins) {

            for (char eachCharacter : eachFamily.toCharArray()) {
                a += "" + (eachCharacter + 1) + "";
            }

            if (Collections.frequency(logins, a)  != 0) {
                count += (Collections.frequency(logins, a));
                a = "";
            }


        }


        return count;
    }



    public static void main(String[] args) {

        List<String> logins = Arrays.asList("bag", "sfe", "cbh", "cbh", "red");

        System.out.println(countFamilyLogins(logins));

        int count = 0;
        String a = "";

        for (String eachFamily : logins) {

            char [] each = eachFamily.toCharArray();

            for (int i = 0; i < each.length; i++) {
                a += (each[i] + 1) + "";
            }

            if (Collections.frequency(logins, a)  != 0) {
                count += (Collections.frequency(logins, a));
                a = "";
            }

        }

        System.out.println(a);
        System.out.println(count);
    }

}
