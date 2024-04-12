import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCyclicRotation {
    public static void main(String args[]){
        int arr[]={3, 8, 9, 7, 6};
        int k=5;

        List<Integer> inputList = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            inputList.add(arr[i]);
        }


        for(int i=0;i<k;i++){
            List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(inputList.get(inputList.size()-1));
            inputList.remove(inputList.size()-1);
            for(int j=0;j<inputList.size();j++){
                tempList.add(inputList.get(j));
            }
            tempList.forEach(System.out::print);
            System.out.println();
            inputList.clear();
            for(int j=0;j<tempList.size();j++){
                inputList.add(tempList.get(j));
            }

        }
        //inputList.forEach(System.out::print);
    }
}
