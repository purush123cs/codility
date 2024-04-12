public class TriangleAsterisks {
    public static void main (String args[]){
        int count = 4;

        for(int i=0;i<count;i++) {//rows
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
