package Day05;
class Fib_Series {
    public static String fib(int n) {
        int preNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + n + " numbers:");

        for (
                int i = 1;
                i <= n; ++i) {
            System.out.print(preNumber + " ");
            int sum = preNumber + nextNumber;
            preNumber = nextNumber;
            nextNumber = sum;
        }
        return "";
     }
}
public class Fibonacci {
    public static void main(String args[]) {
        Fib_Series obj = new Fib_Series();
        System.out.println(obj.fib(12));
        System.out.println(obj.fib(10));
        System.out.println(obj.fib(5));
    }

}
