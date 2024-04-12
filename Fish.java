package codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class Fish {
    public static int solution(int[] A, int[] B) {

        int numOfFishes = A.length;
        int latestSwimmingFish = -1;
        boolean firstDownStreamFound = false;

        for(int i=0;i<A.length;i++){

            if(firstDownStreamFound == false && B[i] == 1){
                firstDownStreamFound = true;
                latestSwimmingFish = i;
                continue;
            }

            if(firstDownStreamFound == true) {
                if(B[latestSwimmingFish] != B[i]){
                    numOfFishes--;
                    if(A[latestSwimmingFish] > A[i]){

                    } else {
                        latestSwimmingFish = i;
                    }
                } else {
                    latestSwimmingFish = i;
                }
            }
        }
        return numOfFishes;
    }

    public static void main(String args[]) {
        int[] A = {7,3,2,1,5};
        int[] B = {0,0,0,0,1};

        //int[] A = {4,3,2,1,5};
        //int[] B = {0,1,0,0,0};
        System.out.println(solution(A, B));
    }
}
