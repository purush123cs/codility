package codility;

import java.util.*;

public class SmallestPositive {
    public static int solution(int[] A) {
        int smallest = 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {

            if (A[i] == smallest) {

                smallest++;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }
}
