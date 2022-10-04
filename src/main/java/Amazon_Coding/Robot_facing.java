package Amazon_Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Robot_facing {

    /**
     On an infinite plane, a robot initially stands at (0, 0) and faces north. Note that:

     The north direction is the positive direction of the y-axis.
     The south direction is the negative direction of the y-axis.
     The east direction is the positive direction of the x-axis.
     The west direction is the negative direction of the x-axis.

     The robot can receive one of three instructions:

     "G": go straight 1 unit.
     "L": turn 90 degrees to the left (i.e., anti-clockwise direction).
     "R": turn 90 degrees to the right (i.e., clockwise direction).

     The robot performs the instructions given in order, and repeats them forever.

     Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.



     Example 1:

     Input: instructions = "GGLLGG"
     Output: true
     Explanation: The robot is initially at (0, 0) facing the north direction.
     "G": move one step. Position: (0, 1). Direction: North.
     "G": move one step. Position: (0, 2). Direction: North.
     "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: West.
     "L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: South.
     "G": move one step. Position: (0, 1). Direction: South.
     "G": move one step. Position: (0, 0). Direction: South.
     Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (0, 2) --> (0, 1) --> (0, 0).
     Based on that, we return true.

     Example 2:

     Input: instructions = "GG"
     Output: false
     Explanation: The robot is initially at (0, 0) facing the north direction.
     "G": move one step. Position: (0, 1). Direction: North.
     "G": move one step. Position: (0, 2). Direction: North.
     Repeating the instructions, keeps advancing in the north direction and does not go into cycles.
     Based on that, we return false.

     Example 3:

     Input: instructions = "GL"
     Output: true
     Explanation: The robot is initially at (0, 0) facing the north direction.
     "G": move one step. Position: (0, 1). Direction: North.
     "L": turn 90 degrees anti-clockwise. Position: (0, 1). Direction: West.
     "G": move one step. Position: (-1, 1). Direction: West.
     "L": turn 90 degrees anti-clockwise. Position: (-1, 1). Direction: South.
     "G": move one step. Position: (-1, 0). Direction: South.
     "L": turn 90 degrees anti-clockwise. Position: (-1, 0). Direction: East.
     "G": move one step. Position: (0, 0). Direction: East.
     "L": turn 90 degrees anti-clockwise. Position: (0, 0). Direction: North.
     Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (-1, 1) --> (-1, 0) --> (0, 0).
     Based on that, we return true.

     Constraints:
     1 <= instructions.length <= 100
     instructions[i] is 'G', 'L' or, 'R'.
     */

    // below code doesn't work with edge cases like String instruction = "GL"

    public static boolean keepRobotInCircle(String instructions) {

        int [] position = {0, 0};

        char [] eachInstructions = instructions.toCharArray();

        // 0-north; 1-east; 2-south; 3-west;
        int direction = 0;

        for (char eachMove : eachInstructions) {

            switch (eachMove) {

                case 'L':
//                    if (direction == 0) {
//                        direction = 3;
//                    } else if(direction == 1) {
//                        direction = 0;
//                    } else if (direction == 2) {
//                        direction = 1;
//                    } else {
//                        direction = 2;
//                    }
                    direction = direction == 0 ? 3 : direction == 1 ? 0 : direction == 2 ? 1 : 2;

                    break;

                case 'R':
//                    if (direction == 0) {
//                        direction = 1;
//                    } else if(direction == 2) {
//                        direction = 3;
//                    } else if(direction == 3) {
//                        direction = 0;
//                    } else {
//                        direction = 2;
//                    }
                    direction = direction == 0 ? 1 : direction == 2 ? 3 : direction == 3 ? 0 : 2;

                    break;

                case 'G':
                    if (direction == 0) {
                        position[1] += 1;
                    } else if (direction == 1) {
                        position[0] += 1;
                    } else if (direction == 2) {
                        position[1] -= 1;
                    } else {
                        position[0] -= 1;
                    }
                    break;
            }

        }



        for (int i = 0; i <= 100; i++) {

        }

return   position[0] == 0 && position [1] == 0;
    }




    public static void main(String[] args) {
        System.out.println(keepRobotInCircle("GL"));

        List<Integer> salary = new ArrayList<>();
        salary.add(25000);
        salary.add(54000);
        salary.add(8000);

        System.out.println(salary.stream().filter(n -> n < 10_000).collect(Collectors.toList()));


        List<Integer> newState = new ArrayList<>();

    }


}
