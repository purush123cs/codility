package codility;

import java.util.*;

public class Dominator {
    public static int solution(int[] A) {

        Map<Integer, Integer> hm = new HashMap();
        Map<Integer, Integer> indexMap = new HashMap();
        for(int i=0;i<A.length;i++){
            if(!indexMap.containsKey(A[i]))
                indexMap.put(A[i], i);

            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }

        int num = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if(maxCount < v){
                maxCount = v;
                num=k;
            }
        }

        if(maxCount <= (A.length/2))
            return -1;

        return indexMap.get(num);
    }

    public static void main(String args[]) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution(A));
    }
}
