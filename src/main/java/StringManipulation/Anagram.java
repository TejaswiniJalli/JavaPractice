package StringManipulation;
import java.util.*;
public class Anagram
{
    static int anagram(char char1[],char char2[]){
        int n1=char1.length;
        int n2=char2.length;
        Arrays.sort(char1);
        Arrays.sort(char2);
        int count=0;
        if(n1!=n2){
            count=0;
        }
        else{
            for(int i=0;i<n1;i++){
                if (char1[i] != char2[i])
                    count=0;
                else
                    count=1;

            }
        }
       return count;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a two strings: ");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        char[] char1 = str1.toCharArray();
        char[] char2=str2.toCharArray();
        int count1=anagram(char1,char2);
       if(count1==0)
           System.out.println("the strings are not anagram");
       else
           System.out.println("the strings are anagram");
    }
}
