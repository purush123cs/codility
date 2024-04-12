import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    public static void main(String args[]){
        int num = 2147483647;
        //int num = 32;
        int answer = 0;
        List<Integer> indexList = new ArrayList<Integer>();

        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
        int startIndex = binary.indexOf("1") >= 0 ? binary.indexOf("1"):-1;
        System.out.println(startIndex);
        if(startIndex == -1){
            System.out.println(0);
        } else {
            System.out.println("in else");
            while (startIndex >= 0) {
                indexList.add(startIndex);
                startIndex = binary.indexOf("1", startIndex+1);
                System.out.println("startIndex in while:" + startIndex);
            }

            if(indexList.size() >= 2){
                for(int i=0;i<indexList.size();i++) {
                    try {
                        int a = indexList.get(i);
                        int b = indexList.get(i + 1);
                        int count = b - a;
                        if(count > answer){
                            answer = count;
                        }
                    }catch(Exception e){
                        break;
                    }
                }
                System.out.println(answer-1);
            }else{
                System.out.println(0);
            }

        }
    }
}
