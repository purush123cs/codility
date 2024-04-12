import java.util.HashSet;
import java.util.Set;

public class PairingCars {
    public static int solution(int[] A) {

        int zerosCount = 0;
        int pairingCount = 0;

        for(int i=0;i<A.length;i++){
            if(A[i] == 0) zerosCount++;
            if(A[i] == 1) pairingCount += zerosCount;
            if(pairingCount > 1000000000) pairingCount = -1;
        }

        return pairingCount;
    }

    public static void main(String args[]) {
        int[] A = {0,1,0,1,1};
        //(0, 1), (0, 3), (0, 4), (2, 3), (2, 4)
        //Answer: pairing count = 5
        System.out.println(solution(A));
    }
}
