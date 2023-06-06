package Day05;


class Fizz_Buzz
{
    public static String FB(int n)
    {
        for (int i=1; i<=n; i++)
        {

            if (i%3==0&&i%5==0)
                System.out.print("FizzBuzz ");

            else if (i%5==0)
                System.out.print("Buzz ");


            else if (i%3==0)
                System.out.print("Fizz ");

            else
                System.out.print(i+" ");
        }
        return "";
    }
}
public class FizzBuzz {
    public static void main(String args[]) {
        Fizz_Buzz obj = new  Fizz_Buzz();
        System.out.println(obj.FB(100));

    }
}
