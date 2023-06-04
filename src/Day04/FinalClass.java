package Day04;

final class Final {
    private final int age = 22;


    public int getAge() {
        return age;
    }

    final void FinalMethod() {
        System.out.println("Name: Tejaswini Jalli");
    }
}

public class FinalClass {
    public static void main(String args[]) {
        Final obj = new Final();
        obj.FinalMethod();
        System.out.println("Age: " + obj.getAge());

    }
}
