package Amz_Coding;

import java.util.ArrayList;
import java.util.List;

public class Neighbour {

    public static List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE

        int active = 1;
        int inactive = 0;

        for(int j = 1; j <= days; j++)
        {


            for (int i = 1; i < states.length-1; i++)
            {
                if ( (states[i-1] == active && states[i+1] == active) || (states[i-1] == inactive && states[i+1] == inactive)  ) {
                    states[j+1] = inactive;
                } else {
                    states[j+1] = active;
                }
            }



        }



        List<Integer> newState = new ArrayList<>();

        for(int each : states)
        {
            newState.add(each);
        }

        return newState;
    }

    public static void main(String[] args) {
        int [] arr = {1, 0, 0, 0, 0, 1, 0, 0};
        int days = 1;

        System.out.println(cellCompete(arr, days));

    }

}
