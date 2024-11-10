package enrollment.services;

import enrollment.students.Student;
import enrollment.courses.Course;

public interface EnrollmentService {
    void enrollStudentInCourse(Student student, Course course);
    void displayEnrolledCourses(Student student);
}
