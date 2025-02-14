package org.example.coursemanagementsystem;
import java.util.List;

// Utility class to manage multiple classes dynamically
public class CourseUtility {

    // Method using wildcard to process any type of course
        public static void displayAllCourses(List<? extends CourseType> courses) {
        for(CourseType course: courses){
            System.out.println("Course Details");
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Duration: " + course.getDuration() + "weeks");
            course.evaluate();
        }
    }
}
