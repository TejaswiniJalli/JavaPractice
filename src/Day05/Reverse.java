package Day05;

class reverseDigits{
    int reverse_digits(int n) {

        int reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return reverse;

    }

}
public class Reverse {
    public static void main(String args[]) {
        reverseDigits obj=new reverseDigits();
        System.out.println(obj.reverse_digits(12345));
        System.out.println(obj.reverse_digits(100));
        System.out.println(obj.reverse_digits(0));
    }
}

