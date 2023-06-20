package Day16;
import java.util.ArrayList;
import java.util.List;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}

class GPAFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aj", "john", 3.5));
        students.add(new Student("June", "Doe", 2.0));
        students.add(new Student("Mary", "Smith", 3.8));
        students.add(new Student("Max", "Jones", 2.5));
        students.add(new Student("Bob", "Williams", 3.1));

        double averageGPA = getAverageGPA(students);
        List<Student> filteredStudents = filterStudents(students, averageGPA);

        for (Student student : filteredStudents) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    private static double getAverageGPA(List<Student> students) {
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGPA();
        }
        return totalGPA / students.size();
    }

    private static List<Student> filterStudents(List<Student> students, double averageGPA) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGPA() >= averageGPA) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
