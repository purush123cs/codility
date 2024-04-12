import java.util.*;

public class FillAllPlaces {
    public static int solution(int numberOfPlacesToFill, int[] placeIndex) {

        Set<Integer> places = new HashSet<Integer>();
        for(int i=0;i<placeIndex.length;i++){
            if(placeIndex[i]<=numberOfPlacesToFill){//ignore greater than placeIndexes
                places.add(placeIndex[i]);//add to set, which will add only unique place indexes
            }
            if(places.size()==numberOfPlacesToFill){//check every time if all the places are filled
                return i;//return the index at which the places are filled
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] placeIndex = {1,3,1,4,2,3,5,4};
        int numberOfPlacesToFill = 5;
        System.out.println(solution(numberOfPlacesToFill, placeIndex));
    }
}
