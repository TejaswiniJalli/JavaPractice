package Day1415;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vowels {

    public static void main(String[] args) {
        String[] strings = {"joe", "allen", "alex","sophie","katheriene","bob","max"};
        Stream<String> stream = Arrays.stream(strings);
        Stream<String> filteredStream = stream.filter(string -> string.toLowerCase().contains("aeiou"));
        List<String> stringsWithVowelsAndCount = filteredStream.map(string -> {
            int vowelCount = 0;
            for (char c : string.toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            return String.format("%s (%d)", string, vowelCount);
        }).collect(Collectors.toList());
        for (String string : stringsWithVowelsAndCount) {
            System.out.println(string);
        }
    }
}
