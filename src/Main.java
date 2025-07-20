     // TODO: Create a class called Student with name, rollNumber, and grade
class Student {
    String name;
    int rollNumber;
    char grade;
     // TODO: Create a method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
    
public class Main {
      public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
        Student student = new Student();
        student.name = "Ananthakrishnan K V";
        student.rollNumber = 19;
        student.grade = 'S';

        student.displayDetails();
    }
}
