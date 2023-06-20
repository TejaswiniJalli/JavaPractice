package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {
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

        //ForLoop
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        //Enhanced ForLoop
        System.out.println("\nUsing Enhanced ForLoop");
        for (String n : names)
            System.out.print(n + " ");
        //Iterator
        System.out.println("\nUsing Iterator");
        Iterator<String> n1 = names.iterator();
        while (n1.hasNext()) {
            System.out.print(n1.next()+" ");
        }
        //forEach
        System.out.println("\nUsing ForEach");
        names.forEach(n2->System.out.print(n2+" "));
        //ParallelStream
        /*System.out.println("Using Parallel Stream");
        List<String> parallelStream = names.parallelStream();
        List<String> result = parallelStream.collect(Collectors.toList());
        for (String i : result) {
            System.out.println(i);
        }*/
        //remove last element
        names.remove(names.size()-1);
        System.out.println("\nModified List"+ names);

    }
}
