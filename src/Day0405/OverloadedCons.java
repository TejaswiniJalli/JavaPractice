package Day0405;
class Parent {
   private String name;
   public Parent(String name){
       this.name=name;
   }

    public String getName() {
        return name;
    }
}
class Child extends Parent {
    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }
    public Child(int age)
    {
        super("Tej");
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}


public class OverloadedCons {

    public static void main(String args[])
    {
        Child obj1 = new Child("Tejaswini",22);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}

