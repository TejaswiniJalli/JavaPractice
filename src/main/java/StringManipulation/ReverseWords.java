package StringManipulation;
import java.util.*;

public class ReverseWords {
        static String reverseEachWord(String str){
            String words[] = str.split("\\s");
            String reversedString = "";

            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord += word.charAt(j);
                }
                reversedString +=reverseWord + " ";
                reversedString.strip();
            }
            return reversedString;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter string : ");
            String str = scanner.nextLine();
            String rev=reverseEachWord(str);
            System.out.print("Reversed string : " + rev);
        }
}
