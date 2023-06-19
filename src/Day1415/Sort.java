package Day1415;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort{

    public static void main(String[] args) {
        String[] strings = {"joe", "allen", "alex","sophie","katheriene","bob","max"};
        List<String> sortedStrings = Arrays.stream(strings)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        sortedStrings = sortedStrings.stream()
                .sorted((string1, string2) -> string2.charAt(string2.length() - 1) - string1.charAt(string1.length() - 1))
                .collect(Collectors.toList());
        for (String string : sortedStrings) {
            System.out.println(string);
        }
    }
}
