import java.util.ArrayList;
class Student {
    String name;
    int marks;
    
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class StudentAverage {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 78));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 88));
        students.add(new Student("Eve", 92));
        
        int totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }
        System.out.println("Average Marks: " + (totalMarks / students.size()));
    }
}


