import java.util.*;

public class ArrayDistinctValues {
    public static int solution(int[] A) {
        // Implement your solution here
        return getDistinctValueCount(A);
    }

    private static int getDistinctValueCount(int... arrayValues){//varargs
        int[] newArray = Arrays.stream(arrayValues).distinct().toArray();
        return newArray.length;
    }

    public static void main(String args[]) {
        int[] A = {2,1,1,2,3,1};
        //Answer: distinct values in the array = 3
        System.out.println(solution(A));
    }
}
