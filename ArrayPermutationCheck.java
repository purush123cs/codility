import java.util.HashSet;
import java.util.Set;

public class ArrayPermutationCheck {
    public static int solution(int[] A) {
        // Implement your solution here

        Set<Integer> procSet = new HashSet<Integer>();//use Set as bucket for holding your things
        for(int i=0;i<A.length;i++){
            if(A[i] <= A.length){//if the input value is greater than array size, ignore it
                procSet.add(A[i]);
            }
        }

        if(procSet.size() == A.length){
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String args[]) {
        //int[] A = {4,1,3,2};
        int[] A = {4,1,3};
        System.out.println(solution(A));
    }
}
