package Day0405;
interface One{
    public abstract int MultiplyTwo(int n1,int n2);
}
interface Two{
    public abstract int MultiplyThree(int n1,int n2,int n3);
}
public class AbsInterface implements One,Two {
    @Override
    public int MultiplyTwo(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int MultiplyThree(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String args[]) {
        AbsInterface obj = new AbsInterface();
        System.out.println("Multiplication of 2 numbers: " + obj.MultiplyTwo(10, 50));
        System.out.println("Multiplication of 3 numbers: " + obj.MultiplyThree(5, 8, 10));

    }
}
