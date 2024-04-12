import java.util.*;

public class ArrayUnpairedItem {
    public static void main(String args[]){

        int[] A = {9,3,9,3,9,7,9};

        Set<Integer> processSet = new HashSet<Integer>();
        for (int i = 0; i<A.length; i++){
            if (!processSet.contains(A[i])){
                processSet.add(A[i]);
            }else{
                processSet.remove(A[i]);
            }
        }

        int unpaired = 0;
        Iterator itr = processSet.iterator();
        while (itr.hasNext()) {
            unpaired = (int)itr.next();
        }

        System.out.println(unpaired);
    }
}
