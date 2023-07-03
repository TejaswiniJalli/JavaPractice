package ConditionalStatements;
class AgeCheck{
    String age_Check(int age) {
        if(age>=13 && age<=19){
            return "teen";
        }
        else if(age>0 && age<13){
            return "kid";
        }
        else if(age>19){
             return "adult";
        }
        else{
            return "not in scope";
        }
    }

}

public class PersonAge {
    public static void main(String args[]) {
        AgeCheck obj=new AgeCheck();
        System.out.println(obj.age_Check(12));
        System.out.println(obj.age_Check(18));
        System.out.println(obj.age_Check(66));
        System.out.println(obj.age_Check(-2));


    }
}
