package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class HashMapD {

    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("Jack", new Student("Jack", "Doe", 3.8));
        studentMap.put("Jane", new Student("Jane", "Doe", 3.9));
        studentMap.put("Mary", new Student("Mary", "Smith", 4.0));
        studentMap.put("Peter", new Student("Peter", "Jones", 3.7));
        studentMap.put("Susan", new Student("Susan", "Brown", 3.6));

        System.out.println("Printing the HashMap using entrySet()");
        Set<Map.Entry<String, Student>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nPrinting the HashMap using map's forEach method");
        studentMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("\nPrinting the HashMap using keySet and Iterator");
        Set<String> keySet = studentMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student student = studentMap.get(key);
            System.out.println(key + ": " + student);
        }
    }
}
