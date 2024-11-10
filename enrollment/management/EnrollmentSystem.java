package enrollment.management;

import enrollment.students.Student;
import enrollment.courses.Course;
import enrollment.services.EnrollmentManager;

import java.util.Scanner;

public class EnrollmentSystem {
    public static void main(String[] args) {
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        Scanner scanner = new Scanner(System.in);

        // Sample students and courses
        Student student1 = new Student("S001", "Alice", 20);
        Student student2 = new Student("S002", "Bob", 22);
        
        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Computer Science");
        
        // Enroll Alice in Mathematics
        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.displayEnrolledCourses(student1);

        // Enroll Bob in Computer Science
        enrollmentManager.enrollStudentInCourse(student2, course2);
        enrollmentManager.displayEnrolledCourses(student2);
        
        // Enroll Alice in Computer Science
        enrollmentManager.enrollStudentInCourse(student1, course2);
        enrollmentManager.displayEnrolledCourses(student1);
    }
}
