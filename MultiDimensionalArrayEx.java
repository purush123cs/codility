public class MultiDimensionalArrayEx {
    public static void main(String args[]){

        int[][] myNumbers = {
                                {1, 2, 3, 4},
                                {5, 6, 7}
                            };

        System.out.println("Length of multi dimensional array:" + myNumbers.length);
        for(int i=0;i< myNumbers.length;i++){//i refers to individual array
            for(int j=0;j< myNumbers[i].length;j++){//j refers to item within the array
                System.out.println(myNumbers[i][j]);


            }
        }

    }
}
