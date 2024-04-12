public class FibonacciPrint {
    public static void main(String args[]){
        int max = 20;//input

        int a = 0;
        int b = 1;

        int sum = a+b;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while(sum <= max){
            System.out.print(sum + " ");
            a = b;
            b = sum;
            sum = a + b;
        }
    }
}
