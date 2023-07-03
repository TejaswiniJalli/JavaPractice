package ArrayLists;

import java.util.ArrayList;


class AListToArray {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Katherine");
        names.add("Max");
        names.add("Bob");
        names.add("Alex");
        names.add("Jack");
        names.add("Tina");
        names.add("Ben");
        names.add("Trent");
        String[] array = names.toArray(new String[0]);
        for (String str : array) {
            System.out.print(str+" ");
        }
    }
}
