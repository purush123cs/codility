import java.util.*;

public class MaxOfTriplets {
    public static int solution(int[] A) {

        int N = A.length;
        Arrays.sort(A);

        /**
         * When we sort an array there are two possible options for the largest product
         * 1) The largest (the last) three elements
         * 2) Combination of two smallest and the largest elements
         * Logic of (1): Obvious
         * Logic of (2): A pair of negatives multiplied returns a positive, which in combination with
         * the largest positive element of the array can give the max outcome.
         * Therefore we return the max of options (1) and (2)
         */
        return Math.max(A[0] * A[1] * A[N - 1], A[N - 1] * A[N - 2] * A[N - 3]);
    }

    public static void main(String args[]) {
        //int[] A = {-3,1,2,-2,5,6};
        int[] A = {-1000,-1000,1,2,3,6};
        System.out.println(solution(A));
    }
}
