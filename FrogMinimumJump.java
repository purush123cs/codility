import java.util.HashSet;
import java.util.Set;

public class FrogMinimumJump {

    public static int solution(int X, int Y, int D) {
        // Implement your solution here

        //To check that the integer division is not rounding off
        // System.out.println(99/10);

        int distanceToBeCovered = Y - X;
        if(distanceToBeCovered % D == 0){
            return distanceToBeCovered/D;
        } else {
            return (distanceToBeCovered/D) + 1;
        }
    }

    /*Below fails due to over time
    public static int solution(int X, int Y, int D) {
        // Implement your solution here

        int curentPos = X;
        int counter = 0;
        while(curentPos < Y){
            curentPos = curentPos + D;
            counter++;
        }
        return counter;
    }
     */

    public static void main(String args[]) {
        System.out.println(solution(1, 1000000000, 2));
    }
}
