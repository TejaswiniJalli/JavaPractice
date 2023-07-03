package HashSet;

import java.util.*;

public class RemoveDuplicateChar{

    public static String removeDuplicateCharacters(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Tejaswini Jalli";
        String result = removeDuplicateCharacters(str);
        System.out.println("The resulting string is: " + result);
    }
}