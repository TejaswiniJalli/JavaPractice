package LamdasStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Capitalize{

    public static void main(String[] args) {
        String[] strings = {"joe", "allen", "alex","sophie","katheriene","bob","max"};


        List<String> capitalizedStrings = Arrays.stream(strings)
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1))
                .collect(Collectors.toList());

        List<String> sortedStrings = capitalizedStrings.stream()
                .sorted()
                .collect(Collectors.toList());

        for (String string : sortedStrings) {
            System.out.println(string);
        }
    }
}
