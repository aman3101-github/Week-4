package coursemanagementsystemtestfile;

import org.example.coursemanagementsystem.*;

import java.util.ArrayList;
import java.util.List;

public class CourseManagementTestFile {
    public static void main(String[] args) {
        // Test cases for Course Management System

        // Creating instances of different courses
        ExamCourse examCourse = new ExamCourse("Physics", 14, 1200.00, 90);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Computer Science", 8, 950.00, 12);
        ResearchCourse researchCourse = new ResearchCourse("Machine Learning", 18, 3000.00, "Deep Learning Applications");

        // Testing Generic Class
        Course<ExamCourse> exam = new Course<>(examCourse);
        Course<AssignmentCourse> assignment = new Course<>(assignmentCourse);
        Course<ResearchCourse> research = new Course<>(researchCourse);

        // Displaying individual course details
        System.out.println("Individual Course Details");
        exam.displayCourseDetails();
        assignment.displayCourseDetails();
        research.displayCourseDetails();

        // Testing Course Utility Class with Wildcards
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(examCourse);
        courseList.add(assignmentCourse);
        courseList.add(researchCourse);

        System.out.println("\n Displaying All Courses");
        CourseUtility.displayAllCourses(courseList);
    }
}
