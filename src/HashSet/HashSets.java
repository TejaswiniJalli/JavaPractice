package HashSet;

import java.util.*;

public class HashSets {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Jack");
        hashSet.add("Joe");
        hashSet.add("Tina");
        hashSet.add("John");
        hashSet.add("Catherine");
        hashSet.add("Peter");
        hashSet.add("Ruby");
        hashSet.add("Selina");
        hashSet.add("Kerr");

        // Iterate the HashSet using Iterator
        System.out.println("HashSet using Iterator");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate the HashSet using ForEach
        System.out.println("HashSet using ForEach");
        for (String string : hashSet) {
            System.out.println(string);
        }

        // Iterate the HashSet using Streams ForEach
        System.out.println("HashSet using Streams ForEach");
        hashSet.stream().forEach(System.out::println);
    }
}