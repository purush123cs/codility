package codility;

import java.util.*;
public class AbsoluteDistinct {
    public static int solution(int[] A) {

        Set<Integer> dist = new HashSet();
        for(int i=0;i<A.length;i++){
            int val = Math.abs(A[i]);
            if(!dist.contains(val))
                dist.add(val);
        }

        return dist.size();
    }

    public static void main(String args[]) {
        int[] A = {-5,-3,-1,0,3,6};
        System.out.println(solution(A));
    }
}
