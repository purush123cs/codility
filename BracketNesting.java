package codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketNesting {
    public static int solution(String S) {

        if(S.length() == 0)
            return 1;


        Deque<Character> deque = new ArrayDeque<>();
        for(int i=0;i<S.length();i++){
            Character c = S.charAt(i);

            switch(c) {
                case ')':
                    if(deque.isEmpty() || deque.pop() != '(')
                        return 0;
                    break;
                default:
                    deque.push(c);
            }
        }

        if(deque.size() != 0)
            return 0;

        return 1;
    }

    public static void main(String args[]) {
        //String S = "(()(())())";
        String S = "())";
        //Cases to consider
        //1) (}
        //2) [()
        //3) ()]
        System.out.println(solution(S));
    }
}
