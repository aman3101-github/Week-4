package org.example.coursemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating different types of courses
        ExamCourse examCourse = new ExamCourse("Mathematics", 12, 1000.00, 100);
        AssignmentCourse assignmentCourse = new AssignmentCourse("Software Engineering", 10, 1050.00, 10);
        ResearchCourse researchCourse = new ResearchCourse("Artificial Intelligence", 16, 2500.00, "Neural Pathways and AI");

        // Using Generic Class
        Course<ExamCourse> exam = new Course<>(examCourse);
        Course<AssignmentCourse> assignment = new Course<>(assignmentCourse);
        Course<ResearchCourse> research = new Course<>(researchCourse);

        // Display individual course details
        System.out.println("Individual Course Details");
        exam.displayCourseDetails();
        assignment.displayCourseDetails();
        research.displayCourseDetails();

        // Using Wildcards to manage multiple courses
        List<CourseType> courseList = new ArrayList<>();
        courseList.add(examCourse);
        courseList.add(assignmentCourse);
        courseList.add(researchCourse);

        System.out.println("Displaying All Courses");
        CourseUtility.displayAllCourses(courseList);
    }
}

