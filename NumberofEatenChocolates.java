package codility;

import java.util.*;

public class NumberofEatenChocolates {
    public static int solution(int N, int M) {

        Set<Integer> eatenChocs = new HashSet<Integer>();
        int currentChoc = 0;
        eatenChocs.add(currentChoc);

        while(true){
            currentChoc = (currentChoc + M) % N;

            if(currentChoc > N){
                int balance = N - currentChoc;
                currentChoc = 0 + balance;
            } else if(currentChoc == N){
                currentChoc = 0;
            }
            if(eatenChocs.contains(currentChoc)){
                break;
            }
            eatenChocs.add(currentChoc);
        }

        return eatenChocs.size();
    }

    public static void main(String args[]) {
        int N = 10;
        int M = 4;
        System.out.println(solution(N, M));
    }
}
