package enrollment.services;

import enrollment.students.Student;
import enrollment.courses.Course;
import java.util.List;

public class EnrollmentManager implements EnrollmentService {
    
    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        List<Course> courses = student.getEnrolledCourses();
        if (!courses.contains(course)) {
            student.addCourse(course);
            System.out.println(student.getName() + " successfully enrolled in " + course.getCourseName());
        } else {
            System.out.println(student.getName() + " is already enrolled in " + course.getCourseName());
        }
    }

    @Override
    public void displayEnrolledCourses(Student student) {
        System.out.println("Enrolled Courses for " + student.getName() + ":");
        for (Course course : student.getEnrolledCourses()) {
            System.out.println(" - " + course);
        }
    }
}
