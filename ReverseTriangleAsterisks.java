public class ReverseTriangleAsterisks {
    public static void main (String args[]){
        int actualRowCount = 4;
        int rowCount = 4;
        int countOfAsterisks = 2*rowCount - 1;

        for(int i=rowCount;i>0;i--) { //rows from 4 to 1
            for(int k=0;k<(actualRowCount-i);k++) //spaces
            {
                System.out.print("\s\s");
            }
            for(int j=0;j<(2*rowCount - 1);j++) {//asterisks
                System.out.print("* ");
            }
            rowCount--;
            System.out.println("\n");

        }
    }
}
