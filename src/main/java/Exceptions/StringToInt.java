package Exceptions;

public class StringToInt {

    public static int convert(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(convert("23"));
        System.out.println(convert("45.67"));
        System.out.println(convert("test"));
        System.out.println(convert("123f"));
    }
}
