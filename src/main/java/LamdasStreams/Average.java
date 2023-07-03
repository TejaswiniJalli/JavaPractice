package LamdasStreams;

import java.util.Arrays;

public class Average{

    public static void main(String[] args) {
        int[] numbers = {22, 93, 65, 44, 75, 96, 57, 18, 29, 90};
        double average = Arrays.stream(numbers)
                .filter(number -> number % 2 != 0)
                .map(number -> number * number)
                .average()
                .orElse(0.0);
        System.out.println("The average of squares of odd numbers is: " + average);
    }
}
