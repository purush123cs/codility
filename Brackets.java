import java.util.*;

public class Brackets {
    public static int solution(String S) {

        if(S.length() == 0)
            return 1;

        Deque<Character> doubleEndedQueue = new ArrayDeque<>();

        for(int i=0;i<S.length();i++){
            Character c = S.charAt(i);

            switch(c) {
                case ')':
                    //when the queue is empty, trying to pop data from it will result in exception
                    //hence, we are checking that the queue is empty instead of popping and check if the data is null or not
                    if(doubleEndedQueue.isEmpty() || doubleEndedQueue.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if(doubleEndedQueue.isEmpty() || doubleEndedQueue.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if(doubleEndedQueue.isEmpty() || doubleEndedQueue.pop() != '{')
                        return 0;
                    break;
                default:
                    doubleEndedQueue.push(c);
            }
        }

        if(doubleEndedQueue.size() != 0)
            return 0;

        return 1;
    }

    public static void main(String args[]) {
        String S = "{[()()]}";
        //String S = "([)()]";
        //Cases to consider
        //1) (}
        //2) [()
        //3) ()]
        System.out.println(solution(S));
    }
}
