package Day04;
class Age {
    private static int age;

    public static int getAge() {
        return age;
    }

    static {
        age = getAgeVar();
    }

    static int getAgeVar() {
        return 22;
    }
}
public class Static {
    public static void main(String args[]) {
        Age obj = new Age();
        System.out.println("Age:"+obj.getAgeVar());
    }
}

